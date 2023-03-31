package com.example.crud.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.models.TutorialModel;
import com.example.crud.repositories.TutorialRepository;

@Service
public class TutorialService {
    @Autowired
    TutorialRepository tutorialRepository;

    public ArrayList<TutorialModel> obtenerTutoriales(){
        return (ArrayList<TutorialModel>) tutorialRepository.findAll();
    }

    public TutorialModel guardarTutorial(TutorialModel tutorial){
        return tutorialRepository.save(tutorial);
    }
}