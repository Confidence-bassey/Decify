package com.alphainnovator.decify.models;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WhatsAppMessenger {
  private List<String> phoneNumbers;
  private String messageBody;


  /* .header("content-type", "application/x-www-form-urlencoded")
        .body("token=lc5pow4iw9o0x0el&to=+2348073650403&body=This is Decify Shopping Platform, your number one home for all Nike "
            + "Products&priority=1&referenceId=")
        .asString();*/

}
