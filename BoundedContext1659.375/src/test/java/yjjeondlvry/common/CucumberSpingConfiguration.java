package yjjeondlvry.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import yjjeondlvry.BoundedContext1659_375Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1659_375Application.class })
public class CucumberSpingConfiguration {}
