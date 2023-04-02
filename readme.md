# Tugas 1, 2, 3, dan 4
Tugas 1 membuat calculator menggunakan try catch, jika yang diinput bukan angka maka akan tampil "ini bukan angka"
Tugas 2 membuat automation untuk transaksi di saucedemo.com. Terdapat 2 package: saucedemo.tugas2 dan saucedemo.tugas2.page
Tugas 3 membuat automation untuk email yopmail. Terdapat 2 package: yopmail.tugas3 dan yopmail.tugas3.page
Tugas 4 membuat automation get API signUp untuk mendaftarkan user baru yang terdiri dari nama, email, phone, dan password dengan menggunakan faker

## Usage
```java
# create 'loginPage'	
loginPage.enterUsername("standard_user");
loginPage.enterPassword("secret_sauce");
loginPage.clickLoginButton();
		
# create 'inventoryPage'		
inventoryPage.clickAddToCartButton();
inventoryPage.clickCartButton();		
inventoryPage.clickCheckoutButton();
		
# create 'checkout'
checkoutPage.enterfirstName("John");
checkoutPage.enterlastName("Wick");		
checkoutPage.enterpostalCode("1234");		
checkoutPage.clickContinueButton();
checkoutPage.clickFinishButton();
checkoutPage.clickbackhomeButton();
```

## Usage
```java
# create 'testYopmail'	
homePage.enterEmail("automationtest");
homePage.clickCheckInbox();
		
# create 'testEmail'		
homePage.enterEmail("automationtest");
homePage.clickCheckInbox();		
messagePage.clickmail();
```

## Contributing

Tugas 1 ada dalam folder Tugas 1 - Calculator
Tugas 2 ada dalam folder Tugas 2 - Saucedemo
Program dibuat dengan POM dan terdiri dari beberapa page: BasePage.java, CheckoutPage.java, InventoryPage.java, LoginPage.java
Tugas 3 ada dalam folder Tugas 3 - Yopmail
Program dibuat dengan POM dan terdiri dari beberapa page: YopmailHomePage.java, YopmailMessagePage.java
Tugas 4 ada dalam folder Tugas 4 - API signUp
Program dibuat untuk menguji API signUp dengan Automation pada alamat API https://api-staging-builder.engineer.ai/users 

## License

[MIT](https://choosealicense.com/licenses/mit/)