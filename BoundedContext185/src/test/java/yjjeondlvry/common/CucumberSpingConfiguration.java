package yjjeondlvry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import yjjeondlvry.BoundedContext185Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext185Application.class })
public class CucumberSpingConfiguration {}
