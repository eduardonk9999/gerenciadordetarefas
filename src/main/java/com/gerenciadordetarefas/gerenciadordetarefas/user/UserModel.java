package com.gerenciadordetarefas.gerenciadordetarefas.user;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    private String userName;
    private String name;
    private String password;

    /**
     * Get aara pegar infos
     * Set para setar infos
     * Coom nossas classes estão com private, é dessa forma q faremos para manipular as informações
     * */

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
