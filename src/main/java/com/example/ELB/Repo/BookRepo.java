package com.example.ELB.Repo;

import com.example.ELB.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository <Book,Long> {

     Book findBookById(Long id);

     List <Book> findBooksByCategory(String category);


}
