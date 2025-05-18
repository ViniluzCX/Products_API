package io.github.ViniluzCX.produtosapi.repository;

import io.github.ViniluzCX.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
