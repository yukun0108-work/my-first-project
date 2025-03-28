package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entity.Character;
import com.example.demo.from.CharacterFrom;
import com.example.demo.Service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/character")
public class CharacterController{

	@Autowired
	CharacterService characterService;

	@RequestMapping("/login")
	public String login(CharacterFrom characterFrom, String showList, Model model) {
		if(characterFrom.getID() != null){
			Character character = characterService.findByID(characterFrom.getID());
			model.addAttribute("character", character);
		}

		if(showList != null){
			List<Character> characterList = characterService.getCharacterList();
			model.addAttribute("characterList", characterList);
		}
		return "login";
	}
	
	@RequestMapping("/search")
	public String index(CharacterFrom characterFrom, String showList, Model model){
		
		//タイトル
		model.addAttribute("title", "原神");
		
		if(characterFrom.getID() != null){
			Character character = characterService.findByID(characterFrom.getID());
			model.addAttribute("character", character);
		}
		
		if(showList != null){
			List<Character> characterList = characterService.getCharacterList();
			model.addAttribute("characterList", characterList);
		}

		return "index";
	}

	@RequestMapping("/edit")
	public String edit(CharacterFrom characterFrom, String showList, Model model) {
		if(characterFrom.getID() != null){
			Character character = characterService.findByID(characterFrom.getID());
			model.addAttribute("character", character);
		}

		if(showList != null){
			List<Character> characterList = characterService.getCharacterList();
			model.addAttribute("characterList", characterList);
		}
		return "edit";
	}
	
	

}


