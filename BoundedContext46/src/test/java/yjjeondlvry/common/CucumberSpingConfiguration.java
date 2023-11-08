package yjjeondlvry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import yjjeondlvry.BoundedContext46Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext46Application.class })
public class CucumberSpingConfiguration {}
