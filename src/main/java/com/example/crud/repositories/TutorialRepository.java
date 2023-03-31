package com.example.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.models.TutorialModel;

@Repository
public interface TutorialRepository extends JpaRepository<TutorialModel, Long> {
    List<TutorialModel> findByPublished(boolean published);
  List<TutorialModel> findByTitleContaining(String title);
}