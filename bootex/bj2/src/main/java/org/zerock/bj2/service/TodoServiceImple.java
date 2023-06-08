package org.zerock.b2.service;

import org.springframework.stereotype.Service;
import org.zerock.b2.mappers.TimeMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class TodoServiceImple implements TodoService {
    
  private final TimeMapper timeMapper;
  private final TodoMapper todoMapper;

  @Override
  public PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO){

    List<TodoDTO> list = todoMapper.list(pageRequestDTO);
    long total = todoMapper.listCount(pageRequestDTO);
  }
    
}
