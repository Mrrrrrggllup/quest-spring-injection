package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.Wizard;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public interface WizardDao {

    Wizard save(Wizard wizard);

    Wizard findById(Long id);

    List<Wizard> findAll();

    Wizard update(Wizard wizard);

    void deleteById(Long id);
}