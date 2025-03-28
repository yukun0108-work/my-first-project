package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Dao.CharacterDao;
import com.example.demo.entity.Character;

@Service
public class CharacterService {

	@Autowired
	CharacterDao characterDao;

	//1件検索
	public Character findByID(Integer id) {
		Character character = new Character();
		character.setID(id);
		return this.characterDao.findByID(character);
	}
	
	//全件取得
	public List<Character> getCharacterList(){
		return this.characterDao.findAll();
	}
}