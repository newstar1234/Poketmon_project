package com.example.poketmon.service;

import org.springframework.http.ResponseEntity;

import com.example.poketmon.dto.request.PostPoketRequestDto;
import com.example.poketmon.dto.response.DeletePoketResponseDto;
import com.example.poketmon.dto.response.PostPoketResponseDto;

public interface PoketService {
  
  // 데이터 저장 메소드 //
  ResponseEntity<? super PostPoketResponseDto> save(PostPoketRequestDto dto);
  // 데이터 삭제 메소드 //
  ResponseEntity<? super DeletePoketResponseDto> delete(Integer poketmonNumber);
  // 데이터 수정 메소드 //
  ResponseEntity<?> update();

}
