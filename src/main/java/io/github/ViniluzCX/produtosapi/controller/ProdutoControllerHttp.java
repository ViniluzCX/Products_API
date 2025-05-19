package io.github.ViniluzCX.produtosapi.controller;


import io.github.ViniluzCX.produtosapi.model.Produto;
import io.github.ViniluzCX.produtosapi.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoControllerHttp {

    private ProdutoRepository produtoRepository;

    public ProdutoControllerHttp(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        String message = "Produto: " + produto.getNome() + " salvo com sucesso!";
        return ResponseEntity.ok(message);


    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obterPorId(@PathVariable("id") String id) {
        Optional<Produto> produtoOpt = produtoRepository.findById(id);

        if (produtoOpt.isPresent()) {
            Produto produto = produtoOpt.get();
            return ResponseEntity.ok(produto);
        } else {
            String message = "Produto não encontrado.";
            return ResponseEntity.status(404).body(message);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deletar(@PathVariable("id") String id) {
        Optional<Produto> produtoOpt = produtoRepository.findById(id);

        if (produtoOpt.isPresent()) {
            Produto produto = produtoOpt.get();
            produtoRepository.deleteById(id);
            String mensagem = "O produto " + produto.getNome() + " id: " + id + " foi deletado com sucesso!";
            return ResponseEntity.ok(mensagem);
        } else {
            return ResponseEntity.status(404).body("Produto não encontrado.");
        }
    }

    @GetMapping
    public List<Produto> listarProdutos() {

        return produtoRepository.findAll();
    }
}
