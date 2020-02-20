package com.claro.gestionrecursosapi.usuario.domain;

import java.util.HashMap;
import java.util.Map;

public enum UsuarioRolEnum {
    ADMIN(1),
    USUARIO(2);

    private int value;
    private static Map<Integer, UsuarioRolEnum> map = new HashMap<>();

    private UsuarioRolEnum(int value) {
        this.value = value;
    }

    static {
        for (UsuarioRolEnum usuarioRolEnum : UsuarioRolEnum.values()) {
            map.put(usuarioRolEnum.value, usuarioRolEnum);
        }
    }

    public static UsuarioRolEnum valueOf(int usuarioRolEnum) {
        return (UsuarioRolEnum) map.get(usuarioRolEnum);
    }

    public int getValue() {
        return value;
    }
}