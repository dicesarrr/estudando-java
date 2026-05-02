package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatoData1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comentario post1Comentario1 = new Comentario("Faça uma boa viagem!");
		Comentario post1Comentario2 = new Comentario("Uau, isso é incrível!");

		Post post1 = new Post(formatoData1.parse("21/06/2026 13:05:44"), "Viagem para Nova Zelândia",
				"Eu estou indo visitar esse país incrível!", 12);

		post1.adicionarComentario(post1Comentario1);
		post1.adicionarComentario(post1Comentario2);

		Comentario post2Comentario1 = new Comentario("Boa noite!");
		Comentario post2Comentario2 = new Comentario("Que a força esteja contigo!");

		Post post2 = new Post(formatoData1.parse("28/07/2026 23:14:19"), "Boa noite, pessoal!", "Vejo vocês amanhã!",
				5);

		post2.adicionarComentario(post2Comentario1);
		post2.adicionarComentario(post2Comentario2);

		System.out.println(post1);
		System.out.println(post2);

	}

}
