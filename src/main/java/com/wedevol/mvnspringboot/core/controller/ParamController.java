package com.wedevol.mvnspringboot.core.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.wedevol.mvnspringboot.core.configuration.CustomSetting;

/**
 * REST Param Controller
 *
 * @author charz
 *
 */
@RestController
@RequestMapping("/params")
public class ParamController {

  private static final Logger logger = LoggerFactory.getLogger(ParamController.class);

  @Autowired
  private CustomSetting customSetting;

  @RequestMapping(value = "/all", method = RequestMethod.GET)
  @ResponseStatus(HttpStatus.OK)
  public void printAllEnvironmentParamteres() {
    logger.info("Print all environment variables");
    logger.info(customSetting.toString());
  }

}
