package com.leaveword.repository;

import com.leaveword.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word,Integer>{
}
