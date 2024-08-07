package Algotrading;

public class Tatasteel {
	static int LotSize = 5500;
	static int InitialTotalShares = 2500;
	static double SharesBuyAverage = 150;
	static int PutStrike = 150;
	static double PutBuyPrize = 6;
	static double CurrentPutPrize = 6;
	static double CurrentMarketPrize = 150;
	static double PutDelta = 0.45;
	static double PutGamma = 0.04;
	static double PutTheta = 0.1 * LotSize;
	static double UpdatedPutPrize;

	public static void main(String[] args) {
//		downsidebreakeven();
//		upsidebreakeven();
//		downsideaddition(5);
		breakevens();
	}

	public static double roundToTwoDecimals(double value) {
		return Math.round(value * 100.0) / 100.0;
	}

	public static void breakevens() {

		for (int i = (int) CurrentMarketPrize - 1; i > 0; i--) {
			int putclosevalue = (int) (PutStrike - i > 0 ? PutStrike - i : 0);

			float putvalue = (float) ((putclosevalue - PutBuyPrize) * LotSize);
			float stockloss = (float) ((i - SharesBuyAverage) * InitialTotalShares);
			if (stockloss + putvalue > 0) {
				System.out.println("Downside Breakeven: " + i +" PUT P/L: "+putvalue+ " Stock P/L: "+ stockloss + " Total P/L: "+ (stockloss + putvalue));
				break;
			}
		}

		for (int i = (int) CurrentMarketPrize + 1; i < 200; i++) {
			int putclosevalue = (int) (PutStrike - i > 0 ? PutStrike - CurrentMarketPrize : 0);
			int putvalue = (int) (putclosevalue == 0 ? (-PutBuyPrize * LotSize) : (putclosevalue * LotSize));
			float stockprofit = (float) ((i - SharesBuyAverage) * InitialTotalShares);
			if (stockprofit > 0 && stockprofit + putvalue > 0) {
				System.out.println("Upside Breakeven: " + i +" PUT P/L: "+putvalue+ " Stock P/L: "+ stockprofit + " Total P/L: "+ (stockprofit + putvalue));
				break;
			}
		}

	}

	public static void downsideaddition(int interval) {
		for (int i = (int) CurrentMarketPrize - 1; i > 100; i--) {
			UpdatedPutPrize = CurrentPutPrize + PutDelta + PutGamma;

			if (PutDelta < 0.9 && PutGamma > 0.002) {
				PutDelta = (float) (PutDelta + PutGamma);
				PutGamma = (float) (PutGamma * (0.9));
			} else {
				System.out.println("Final number of shares: " + InitialTotalShares + " Average Share Prize: "
						+ SharesBuyAverage + " Current Put Prize: " + CurrentPutPrize);
				break;
			}

			CurrentPutPrize = UpdatedPutPrize;

			double mtmvalue = 0;
			if (CurrentPutPrize > 0)
				mtmvalue = ((UpdatedPutPrize - PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);
			else
				mtmvalue = ((-PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);

			if (mtmvalue > 0) {
				System.out.println("Greeks when share value is: " + i + " - " + roundToTwoDecimals(PutDelta) + " - "
						+ roundToTwoDecimals(PutGamma) + " - " + roundToTwoDecimals(CurrentPutPrize) + " PUT P/L: "
						+ roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Profit: "
						+ roundToTwoDecimals(mtmvalue));
			} else {
				System.out.println("Greeks when share value is: " + i + " - " + roundToTwoDecimals(PutDelta) + " - "
						+ roundToTwoDecimals(PutGamma) + " - " + roundToTwoDecimals(CurrentPutPrize) + " PUT P/L: "
						+ roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Loss: "
						+ roundToTwoDecimals(mtmvalue));
			}

			// When ever put delta is less than 0.9 and price drop is at the requested
			// interval
			if (PutDelta <= 0.9 && (i % interval == 0)) {
				int newsharestoadd = (int) ((PutDelta * 5500) - InitialTotalShares);
				SharesBuyAverage = ((SharesBuyAverage * InitialTotalShares) + (newsharestoadd * i))
						/ (InitialTotalShares + newsharestoadd);
				InitialTotalShares = InitialTotalShares + newsharestoadd;
				System.out.println("Added new shares: " + newsharestoadd + " at prize : " + i
						+ ". New buy average is : " + SharesBuyAverage);
			}

			// Once put detla reaches 0.9 we will not add any new shares
			if (PutDelta >= 0.9) {
				System.out.println("Final number of shares: " + InitialTotalShares + " Average Share Prize: "
						+ SharesBuyAverage + " Current Put Prize: " + roundToTwoDecimals(CurrentPutPrize));
				break;
			}
		}
	}

	public static void downsidebreakeven() {
		for (int i = (int) CurrentMarketPrize - 1; i > 100; i--) {
			UpdatedPutPrize = CurrentPutPrize + PutDelta + PutGamma;

			if (PutDelta < 0.9 && PutGamma > 0.002) {
				PutDelta = (float) (PutDelta + PutGamma);
				PutGamma = (float) (PutGamma * (0.9));
			}

			CurrentPutPrize = UpdatedPutPrize;
			double mtmvalue = 0;
			if (CurrentPutPrize > 0)
				mtmvalue = ((UpdatedPutPrize - PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);
			else
				mtmvalue = ((-PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);

			if (mtmvalue > 0) {
				System.out.println("Greeks when share value is: " + i + " - " + roundToTwoDecimals(PutDelta) + " - "
						+ roundToTwoDecimals(PutGamma) + " - " + roundToTwoDecimals(CurrentPutPrize) + " PUT P/L: "
						+ roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Profit: "
						+ roundToTwoDecimals(mtmvalue));
			} else {
				System.out.println("Greeks when share value is: " + i + " - " + roundToTwoDecimals(PutDelta) + " - "
						+ roundToTwoDecimals(PutGamma) + " - " + roundToTwoDecimals(CurrentPutPrize) + " PUT P/L: "
						+ roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Loss: "
						+ roundToTwoDecimals(mtmvalue));
			}
		}
	}

	public static void upsidebreakeven() {
		for (int i = (int) CurrentMarketPrize + 1; i < 200; i++) {

			if (UpdatedPutPrize >= 0) {
				UpdatedPutPrize = CurrentPutPrize - PutDelta - PutGamma;

				if (PutDelta > 0.1 && PutGamma > 0.002) {
					PutDelta = (float) (PutDelta - PutGamma);
					PutGamma = (float) (PutGamma * (0.9));
				}

				CurrentPutPrize = UpdatedPutPrize;
			}

			double mtmvalue = 0;

			if (CurrentPutPrize > 0)
				mtmvalue = ((UpdatedPutPrize - PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);
			else
				mtmvalue = ((-PutBuyPrize) * LotSize) + InitialTotalShares * (i - SharesBuyAverage);

			if (mtmvalue > 0) {
				System.out.println(i + " - PUT DELTA: " + roundToTwoDecimals(PutDelta) + " - PUT GAMMA: "
						+ roundToTwoDecimals(PutGamma) + " PUT Value: " + roundToTwoDecimals(CurrentPutPrize)
						+ " PUT P/L: " + roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Profit: "
						+ roundToTwoDecimals(mtmvalue));
			} else {
				System.out.println(i + " - PUT DELTA: " + roundToTwoDecimals(PutDelta) + " - PUT GAMMA: "
						+ roundToTwoDecimals(PutGamma) + " PUT Value: " + roundToTwoDecimals(CurrentPutPrize)
						+ " PUT P/L: " + roundToTwoDecimals((UpdatedPutPrize - PutBuyPrize) * LotSize) + " Stock P/L: "
						+ roundToTwoDecimals(InitialTotalShares * (i - SharesBuyAverage)) + " - Loss: "
						+ roundToTwoDecimals(mtmvalue));
			}
		}
	}

}
