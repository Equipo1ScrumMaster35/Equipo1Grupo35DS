package co.edu.unbosque.DTO.TiendaGenerica;

public class UsuarioVO {
	private int cedulaUsuario;
	private String emailUsuario;
	private String nombreUsuario;
	private String password;
	private String usuario;
	
	public UsuarioVO(int cedulaUsuario, String emailUsuario, String nombreUsuario, String password, String usuario) {
		super();
		this.cedulaUsuario = cedulaUsuario;
		this.emailUsuario = emailUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.usuario = usuario;
	}

	public int getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(int cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	
}
