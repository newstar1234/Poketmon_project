package com.example.poketmon.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.poketmon.dto.request.PostPoketRequestDto;
import com.example.poketmon.dto.response.DeletePoketResponseDto;
import com.example.poketmon.dto.response.PostPoketResponseDto;
import com.example.poketmon.service.PoketService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/poketmon")
@RequiredArgsConstructor
public class MainController {

  private final PoketService poketService;
  
  // 데이터 저장
  @PostMapping("/save")
  public ResponseEntity<? super PostPoketResponseDto> save(
    @RequestBody @Valid PostPoketRequestDto requestBody
  ) {
    ResponseEntity<? super PostPoketResponseDto> response = poketService.save(requestBody);
    return response;
  }

  // 데이터 삭제
  @DeleteMapping("/{poketmonNumber}")
  public ResponseEntity<? super DeletePoketResponseDto> delete(
    @PathVariable(value = "poketmonNumber", required = true) Integer poketmonNumber
  ) {   
    ResponseEntity<? super DeletePoketResponseDto> response = poketService.delete(poketmonNumber);
    return response;
  }

  // 데이터 수정
  @PatchMapping("/update")
  public ResponseEntity<?> update() {
    return null;
  }

}
