package com.ahmetyagiz.services;

import java.util.List;

import com.ahmetyagiz.model.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class UserService {
	private List<User> userList;
}
