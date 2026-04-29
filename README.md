# DTO -> Classe arquitetural

-> Transforma os dados que chegam da web em uma linguagem que a API entende. Ela não entende JSON, mas podemos converter para objeto através desta classe. 


## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web
`@RequestMapping("/medicos")`
=> Define que a classe está mapeada para a url[endpoint] /medicos.

`@RestController`
=> Define que a classe é uma classe controladora no Spring.

`@GetMapping` 
=> Define que o método será somente leitura.

`@PostMapping`
=> Define que o método irá receber dados.

`@PutMapping`
=> Atualiza alguma informação.

`@DeleteMapping`
=> Deleta dados.

`@ResquestBody`
=> é utilizada quando você irá receber dados pelo simulador de requisição [insomnia], e informa que os dados serão enviados no corpo da requisição.

`@Transactional`
=> É utilizado para que o método consiga realizar algum tipo de modelagem (alteração) no bd.  

`@Autowired`
=> É utilizado quando você está aplicando a injeção de dependência. Ou seja, o Spring Boot sabe o que a classe (interface) possui de métodos e atributos. 

2. 




## URL do banco de dados de teste 

localhost:8080/h2-console


