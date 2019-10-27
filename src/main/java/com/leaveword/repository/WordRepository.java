package com.leaveword.repository;

import com.leaveword.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author guoxiaofeng
 */
public interface WordRepository extends JpaRepository<Word,Integer>{
}
