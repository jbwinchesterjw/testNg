package TestNgBasicos;

import org.testng.annotations.*;

public class TestBasico {

	/**
	 * @BeforeSuite, podemos configurar e iniciar os Webdrivers Selenium
	 * O m�todo anotado ser� executado apenas uma vez antes da execu��o de todos os testes neste conjunto.
	 */
	@BeforeSuite
	public void setUp() {
		System.out.println("");
	}

	/**
	 * @BeforeTest s�o executados ap�s @beforeSuite
	 * @BeforeTest � usado para criar um conjunto de dados inicial e antes de executar outros m�todos de teste
	 */
	@BeforeTest
	public void login() {
	}

	/**
	 * @BeforeClass ser� executado apenas uma vez antes de o primeiro m�todo de teste nessa classe particular ser chamado
	 */
	@BeforeClass
	public void launchBrose() {

	}

	/**
	 * @BeforeMethod permite que o m�todo seja executado antes da execu��o de cada m�todo
	 */
	@BeforeMethod
	public void enterURL() {
	}

	// meus testes
	@Test
	public void testOne() {
	}
	@Test(enabled = false)//indica que esse teste sera iguinorado
	public void testTwo() {
	}

	/**
	 * @afterMethod � executado ap�s a execu��o de cada m�todo @Test.
	 */
	@AfterMethod
	public void logOut() {
	}

	/**
	 * @AfterClass ser� executada apenas uma vez, ap�s todos os m�todos de teste
	 * dessa classe em particular terem sido chamados
	 */
	@AfterClass
	public void closeBrowser() {
	}

	/**
	 * @AfterTest ser� executada ap�s a conclus�o dos outros testes.
	 */
	@AfterTest
	public void deleteAllCookies() {
	}

	/**
	 * @AfterSuite � usada para parar os Webdrivers Selenium.
	 * O m�todo anotado ser� executado apenas uma vez ap�s a execu��o de todos os testes neste conjunto.
	 */
	@AfterSuite
	public void generateTestReport() {
	}
}
