package com.example.demo.Dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.entity.Character;

@Mapper
public interface CharacterDao {
    Character findByID(Character character);
    Character findByNAME(Character character);
    

    //全件取得
	List<Character> findAll();
}
