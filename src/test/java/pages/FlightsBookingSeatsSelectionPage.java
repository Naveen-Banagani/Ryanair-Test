package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import driver.FactoryDriver;
import utils.ExplicitWait;
import utils.LogUtils;
import utils.ScrollUtils;

public class FlightsBookingSeatsSelectionPage extends BasePage {

	@FindBy(xpath = "//button[contains(text(),'Okay, got it.')]")
	private WebElement okayButton;

	@FindBy(xpath = "//seat-map")
	private WebElement seatMap;

	@FindBy(xpath = "//ry-overlay")
	private WebElement overLay;

	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	private WebElement continueButton;

	@FindBy(xpath = "//button[@class='reinforcement-message__actions__button b2 ry-button--gradient-yellow ng-star-inserted']")
	private WebElement continueButton2;

	@FindBy(xpath = "//button[contains(text(),'No, thanks')]")
	private WebElement NoThanks;

	@FindBy(xpath = "//button[@class='ng-star-inserted seatmap__seat seatmap__seat--standard']")
	private List<WebElement> seats;

	@FindBy(css = "div.seatmap__seatrow")
	private List<WebElement> seatRows;

	public void closeFamilySeatingPopup() {
		ExplicitWait.visibilityOfElement(okayButton);
		okayButton.click();

	}

	/**
	 * 
	 * Below Code selects the seats for 2Adults and 1 Child
	 */

	public void chooseConsecutiveSeats() throws InterruptedException {
		ExplicitWait.visibilityOfElement(seatMap);
		boolean isSingleUserOccupied = false, isDoubleUserOccupied = false;
		for (int j = 0; j < seatRows.size(); j++) {
			LogUtils.logInfo(j + "");
			List<WebElement> columns = seatRows.get(j).findElements(By.cssSelector("button.seatmap__seat--standard"));
			for (int i = 0; i < columns.size(); i++) {
				LogUtils.logInfo(i + "");
				if (isSingleUserOccupied && isDoubleUserOccupied) {
					break;
				}
				if (!isDoubleUserOccupied && i < columns.size() - 1) {
					String currente1 = columns.get(i).getAttribute("id");
					String currente2 = columns.get(i + 1).getAttribute("id");
					try {
						if (FactoryDriver.getInstance()

								.findElement(By.cssSelector("#" + currente1 + "+" + "#" + currente2)) != null) {
							LogUtils.logInfo("Consecutive seats ");
							ScrollUtils.clickElement(columns.get(i));
							LogUtils.logInfo(columns.get(i).getText());
							ScrollUtils.clickElement(columns.get(i + 1));
							LogUtils.logInfo(columns.get(i + 1).getText());

							isDoubleUserOccupied = true;
							i += 2;
						}
					} catch (NoSuchElementException e) {

					}
				}
				if (!isSingleUserOccupied) {
					LogUtils.logInfo(columns.get(i).getText());
					ScrollUtils.clickElement(columns.get(i));
					isSingleUserOccupied = true;
				}
			}
			if (isSingleUserOccupied && isDoubleUserOccupied) {
				break;
			}

		}

	}

	public void addSeats() throws InterruptedException {

	
		ExplicitWait.visibilityOfElement(continueButton);
		continueButton.click();
		ExplicitWait.visibilityOfElement(NoThanks);
		NoThanks.click();

	}

}
