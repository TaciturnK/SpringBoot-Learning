package com.taowd.bean;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import org.springframework.validation.annotation.Validated;

/**
 * 获取默认配置文件中的属性值
 * 
 * @author Taoweidong
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
  @NotBlank
  private String name;
  @Min(10)
  @Max(100)
  private Integer age;
  private String birthday;

  private List<String> role;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this);
  }
}
