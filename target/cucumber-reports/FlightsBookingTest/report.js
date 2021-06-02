$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/flightsBooking.feature");
formatter.feature({
  "name": "Booking a flight on www.ryanair.com",
  "description": "\tAs a user\n\tI want to be able to book a flight\n\tOn www.ryanair.com",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@flights_booking"
    }
  ]
});
formatter.scenario({
  "name": "Booking up to a declined payment on",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flights_booking"
    }
  ]
});
formatter.step({
  "name": "I am on main page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasePageSteps.iAmOnMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in to personal account",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iLogInToPersonalAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make a search for booking from \u0027Dublin\u0027 to \u0027Manchester\u0027  for 2 adults",
  "keyword": "When "
});
formatter.match({
  "location": "FlightsSearchPageSteps.iMakeFlightSearch(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@data-id\u003d\u00272021-06-12\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.212)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.19042 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027LAPTOP-M4N4JHAP\u0027, ip: \u0027172.24.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\navee\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 90.0.4430.212, webStorageEnabled: true}\nSession ID: 3156cf39b12d23369aa8d7eb4e58f6f7\n*** Element info: {Using\u003dxpath, value\u003d//div[@data-id\u003d\u00272021-06-12\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat pages.FlightsSearchPage.fillFlyOutDay(FlightsSearchPage.java:66)\r\n\tat steps.FlightsSearchPageSteps.iEnterAirportDetails(FlightsSearchPageSteps.java:27)\r\n\tat steps.FlightsSearchPageSteps.iMakeFlightSearch(FlightsSearchPageSteps.java:45)\r\n\tat ✽.I make a search for booking from \u0027Dublin\u0027 to \u0027Manchester\u0027  for 2 adults(src/test/resources/features/flightsBooking.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I book available flight",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.iBookFlight()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in adult passenger details Mr \u0027Naveen\u0027 and \u0027Banagani\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.iFillInAdultPassengerDetails(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in second adult passenger details Mr \u0027Rya\u0027 and \u0027Nair\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.iFillInSecondAdultPassengerDetails(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in child passenger details \u0027Mark\u0027 and \u0027Smith\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.iFillInChildPassengerDetails(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select seats for passengers",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingSeatsSelectionPageSteps.iSelectSeatsForPassengers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I checkout my booking",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingExtrasPageSteps.iCheckoutMyBooking()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in contact details phone number \u0027678678678\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInContactDetails(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in card details \u00275555555555555557\u0027, \u0027267\u0027 and \u0027Naveen Banagani\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInCardDetailsVisaAndJohnSmith(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I fill in billing address details \u002724 Newtons street\u0027 and city \u0027Galway\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInBillingAddressDetails(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I pay for booking",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iPayForBooking()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should get payment declined message",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iGetPaymentDeclinedMessage()"
});
formatter.result({
  "status": "skipped"
});
});