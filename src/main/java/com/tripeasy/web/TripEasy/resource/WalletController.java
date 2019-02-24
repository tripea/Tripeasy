package com.tripeasy.web.TripEasy.resource;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.nimbusds.oauth2.sdk.GeneralException;
import com.tripeasy.web.TripEasy.config.Config;
import com.tripeasy.web.TripEasy.pojo.Statement;
import com.tripeasy.web.TripEasy.pojo.Wallet;

/**
 * 
 * @author kanak soni
 *
 */
@Controller
@RequestMapping("/wallet")
public class WalletController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/add")
	public String SubmitButton(@RequestParam Integer amount) {
		Integer profileId=3;
		String transactionType="Credit";
		String transactionRemarks="Wallet Credited";
		restTemplate.put("http://"+Config.WALLET_SERVICE+":8080/wallet/" + profileId + "/?amount=" + amount + "&transactionRemarks="
				+ transactionRemarks + "&transactionType=" + transactionType, Wallet.class);
		return "redirect:/";
	}

	@RequestMapping("/statements")
	public String getStatement(Model model, @RequestParam Integer profileId) {
		ResponseEntity<Set> statement = restTemplate
				.getForEntity("http://"+Config.WALLET_SERVICE+":8080/wallet?profileId=" + profileId, Set.class);
		model.addAttribute("statements", statement.getBody());
		return "Wallet";
	}

	@RequestMapping("/wallet")
	public String getWallet(Model model, @RequestParam Integer profileId) {
		ResponseEntity<Wallet> wallet = restTemplate
				.getForEntity("http://"+Config.WALLET_SERVICE+":8080/wallet/getWallet?profileId=" + profileId, Wallet.class);
		model.addAttribute("wallet", wallet.getBody());
		return "Wallet";

	}

	@RequestMapping("/addMoney")
	public ModelAndView AddMoney() {
		return new ModelAndView("AddMoney");
	}
}