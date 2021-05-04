package com.acs.springbootmc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acs.springbootmc.domain.Categoria;
import com.acs.springbootmc.domain.Cidade;
import com.acs.springbootmc.domain.Cliente;
import com.acs.springbootmc.domain.Endereco;
import com.acs.springbootmc.domain.Estado;
import com.acs.springbootmc.domain.ItemPedido;
import com.acs.springbootmc.domain.Pagamento;
import com.acs.springbootmc.domain.PagamentoComBoleto;
import com.acs.springbootmc.domain.PagamentoComCartao;
import com.acs.springbootmc.domain.Pedido;
import com.acs.springbootmc.domain.Produto;
import com.acs.springbootmc.domain.enums.EstadoPagamento;
import com.acs.springbootmc.domain.enums.TipoCliente;
import com.acs.springbootmc.repositories.CategoriaRepository;
import com.acs.springbootmc.repositories.CidadeRepository;
import com.acs.springbootmc.repositories.ClienteRepository;
import com.acs.springbootmc.repositories.EnderecoRepository;
import com.acs.springbootmc.repositories.EstadoRepository;
import com.acs.springbootmc.repositories.ItemPedidoRepository;
import com.acs.springbootmc.repositories.PagamentoRepository;
import com.acs.springbootmc.repositories.PedidoRepository;
import com.acs.springbootmc.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringbootMcApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}

