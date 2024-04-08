package service;

import data.model.Diary;
import exception.UserAlreadyExistException;

public class DiaryServiceImpl implements DiaryService{
    @Override
    public void registerUser(Diary diary, Object o) throws UserAlreadyExistException {

    }

    @Override
    public void logIn(Diary diary, Object o) {

    }

    @Override
    public long numberOfUsers() {
        return 0;
    }

    @Override
    public void logOut(Diary diary, Object o) {

    }
}
