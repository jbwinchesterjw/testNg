package TestNgBasicos;

import org.testng.annotations.*;

public class TestBasico {

	/**
	 * @BeforeSuite, podemos configurar e iniciar os Webdrivers Selenium
	 * O método anotado será executado apenas uma vez antes da execução de todos os testes neste conjunto.
	 */
	@BeforeSuite
	public void setUp() {
		System.out.println("");
	}

	/**
	 * @BeforeTest são executados após @beforeSuite
	 * @BeforeTest é usado para criar um conjunto de dados inicial e antes de executar outros métodos de teste
	 */
	@BeforeTest
	public void login() {
	}

	/**
	 * @BeforeClass será executado apenas uma vez antes de o primeiro método de teste nessa classe particular ser chamado
	 */
	@BeforeClass
	public void launchBrose() {

	}

	/**
	 * @BeforeMethod permite que o método seja executado antes da execução de cada método
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
	 * @afterMethod é executado após a execução de cada método @Test.
	 */
	@AfterMethod
	public void logOut() {
	}

	/**
	 * @AfterClass será executada apenas uma vez, após todos os métodos de teste
	 * dessa classe em particular terem sido chamados
	 */
	@AfterClass
	public void closeBrowser() {
	}

	/**
	 * @AfterTest será executada após a conclusão dos outros testes.
	 */
	@AfterTest
	public void deleteAllCookies() {
	}

	/**
	 * @AfterSuite é usada para parar os Webdrivers Selenium.
	 * O método anotado será executado apenas uma vez após a execução de todos os testes neste conjunto.
	 */
	@AfterSuite
	public void generateTestReport() {
	}
}
