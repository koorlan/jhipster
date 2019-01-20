package com.korlan.jhipster.cucumber.stepdefs;

import com.korlan.jhipster.JhipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
