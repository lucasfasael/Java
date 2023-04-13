package com.lucasfasael;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoguinhoService {

    @Autowired
    DoguinhoRepository doguinhoRepository;

    DoguinhosEntity criaDoguinho() {
        return doguinhoRepository.save(new DoguinhosEntity());
    }

}
