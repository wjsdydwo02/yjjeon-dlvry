package yjjeondlvry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import yjjeondlvry.BoundedContext1499Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1499Application.class })
public class CucumberSpingConfiguration {}
