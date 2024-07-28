package modelo;

public class Livro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	
	public Livro()
	{
		
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString()
	{
		return ISBN+"#"+titulo+"#"+autor;
	}

}
