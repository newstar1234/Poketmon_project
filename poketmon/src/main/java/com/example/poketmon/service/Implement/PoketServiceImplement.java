package com.example.poketmon.service.Implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.poketmon.dto.ResponseDto;
import com.example.poketmon.dto.request.PatchPoketRequestDto;
import com.example.poketmon.dto.request.PostPoketRequestDto;
import com.example.poketmon.dto.response.DeletePoketResponseDto;
import com.example.poketmon.dto.response.PatchPoketResponseDto;
import com.example.poketmon.dto.response.PostPoketResponseDto;
import com.example.poketmon.entity.PoketEntity;
import com.example.poketmon.repository.PoketRepository;
import com.example.poketmon.service.PoketService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PoketServiceImplement implements PoketService{

  private final PoketRepository poketRepository;

  @Override
  public ResponseEntity<? super PostPoketResponseDto> save(PostPoketRequestDto dto) {

    try {

      // entity 생성 //
      PoketEntity poketEntity = new PoketEntity(dto);
      // DB에 저장 //
      poketRepository.save(poketEntity);

      
    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }

    return PostPoketResponseDto.success();

  }

  @Override
  public ResponseEntity<? super DeletePoketResponseDto> delete(Integer poketmonNumber) {

    try {

      // 존재하는지 확인 //
      PoketEntity poketEntity = poketRepository.findByPoketmonNumber(poketmonNumber);
      if(poketEntity == null) return DeletePoketResponseDto.fail();

      // 데이터 삭제 //
      poketRepository.delete(poketEntity);

      
    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }
    return DeletePoketResponseDto.success();
  }

  @Override
  public ResponseEntity<? super PatchPoketResponseDto> update(Integer poketmonNumber, PatchPoketRequestDto dto) {

    try {
      PoketEntity poketEntity = poketRepository.findByPoketmonNumber(poketmonNumber);
      if(poketEntity == null) return PatchPoketResponseDto.fail();

      poketEntity.patch(dto);

      poketRepository.save(poketEntity);
      
    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }
    return PatchPoketResponseDto.success();
  }
  
}
