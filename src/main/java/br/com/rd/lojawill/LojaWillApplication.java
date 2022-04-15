package br.com.rd.lojawill;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rd.lojawill.entities.Category;
import br.com.rd.lojawill.entities.Product;
import br.com.rd.lojawill.repositories.CategoryRepository;
import br.com.rd.lojawill.repositories.ProductRepository;

@SpringBootApplication
public class LojaWillApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(LojaWillApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Category software = new Category(null, "Software");
		Category hardware = new Category(null, "Hardware");

		Product windows = new Product(null, " Windows 10", "Sistema Operacional", software);
		Product office = new Product(null, "Office 2019", " Pacote Office", software);
		Product placaVideo = new Product(null, " GTX 3060", " Placa de video", hardware);
		Product motherBoard = new Product(null, " Asus ", " Placa mae", hardware);

		software.getProduct().addAll(Arrays.asList(windows, office));
		hardware.getProduct().addAll(Arrays.asList(placaVideo, motherBoard));

		categoryRepository.save(software);
		categoryRepository.save(hardware);

		productRepository.save(windows);
		productRepository.save(office);
		productRepository.save(placaVideo);
		productRepository.save(motherBoard);

	}

}
