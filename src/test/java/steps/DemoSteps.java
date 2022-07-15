package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.Product;

public class DemoSteps {
    @Given("I am on product store page")
    public void iAmOnProductStorePage() {
        System.out.println("I am on product store page");
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) {
        System.out.println("I add a {string} to the cart "+product.getName());

    }

    @Then("I see one {product} added in the cart")
    public void iSeeOneAddedInCart(Product product) {
        System.out.println("I see one {product} added in the cart "+product.getName());
    }
}
