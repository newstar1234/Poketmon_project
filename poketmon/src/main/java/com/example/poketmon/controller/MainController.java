package com.example.poketmon.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/poketmon")
@RequiredArgsConstructor
public class MainController {
  
  // 데이터 저장
  @PostMapping("/save")
  public ResponseEntity<?> save() {
    return null;
  }

  // 데이터 삭제
  @DeleteMapping("/delete")
  public ResponseEntity<?> delete() {
    return null;
  }

  // 데이터 수정
  @PatchMapping("/update")
  public ResponseEntity<?> update() {
    return null;
  }

}
