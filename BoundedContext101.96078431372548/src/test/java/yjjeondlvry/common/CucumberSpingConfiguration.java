package yjjeondlvry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import yjjeondlvry.BoundedContext101_96078431372548Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext101_96078431372548Application.class })
public class CucumberSpingConfiguration {}
