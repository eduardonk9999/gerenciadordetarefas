package com.gerenciadordetarefas.gerenciadordetarefas.controller;


//@Controller // Pra quando tenha páginas...
@RestController // O NOME JÁ DIZ TUDO.... API
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
    
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionouuu";
    }
}
