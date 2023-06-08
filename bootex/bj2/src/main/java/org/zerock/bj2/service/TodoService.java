package org.zerock.bj2.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TodoService {
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
}
