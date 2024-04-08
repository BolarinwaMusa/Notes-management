package data.model;

import lombok.Data;

@Data
public class Diary {
    private String username;
    private String password;
    private boolean isLocked = false;

}