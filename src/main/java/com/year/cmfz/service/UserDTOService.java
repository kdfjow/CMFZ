package com.year.cmfz.service;

import com.year.cmfz.entity.UserDTO;

import java.util.List;

public interface UserDTOService {
    public List<UserDTO> showDto(int week);
    public List<UserDTO> showMan();
    public List<UserDTO> showWoman();
}
