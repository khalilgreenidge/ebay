package com.example.HandlingFormSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class QuoteController {

    
  @GetMapping("/quote")
  public String quoteForm(Model model) {
	  model.addAttribute("quote", new Quote());
	  return "quote";
  }
  
    
}

