package service;

import data.model.Diary;
import exception.UserAlreadyExistException;


public interface DiaryService<UserInformation> {
        void registerUser(Diary diary, UserInformation userInformation) throws UserAlreadyExistException;
        void logIn(Diary diary,UserInformation userInformation);
        long numberOfUsers();
        void logOut(Diary diary ,UserInformation userInformation);

    }


