package com.alphainnovator.decify.apis.Controllers;

import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.models.CartModel;
import com.alphainnovator.decify.models.PaymentModel;
import com.alphainnovator.decify.models.WhatsAppMessenger;
import com.alphainnovator.decify.service.OrderService;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.List;
import java.util.Set;
import lombok.var;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping("/addOrder")
  public AddOrderModel.Output addOrder(@RequestBody AddOrderModel.Input input
  ) {
    return orderService.addOrder(input);

  }
  @PostMapping("/addToCart")
  public double addToCart(@RequestBody CartModel input
  ) throws UnirestException {
    whatsApp();
    return orderService.addToCart(input);
  }
  @PostMapping("/pay")
  public double payment(@RequestBody PaymentModel input
  ) {
    return orderService.pay(input);
  }
  private HttpResponse<String> whatsApp() throws UnirestException {
    var numbers = List.of("+2348073650403", "+2348060335875", "+23480105359820","+2347067529758",
        "+2349036427495", "+2349058387058");

    HttpResponse<String> response = Unirest.post("https://api.ultramsg.com/instance7073/messages/chat")
        .header("content-type", "application/x-www-form-urlencoded")
        .body("token=lc5pow4iw9o0x0el&to="+ numbers +"&body=" + setMessage()
            + "Products&priority=1&referenceId=")
        .asString();
    return response;
  }
  private String setMessage(){
    return "Welcome to the Decify Gift As a Service Platform, you are receieving this message from our WhatsApp"
        + " API Gateway, please visit www.Google.com to shop on our platform";
  }

}






