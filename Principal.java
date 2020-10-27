import java.net.UnknownHostException;

public class Principal {

	public static void main(String[] args) throws UnknownHostException {
		ServidorUDP servidor = new ServidorUDP();
		ClienteUDP cliente = new ClienteUDP();
		
		servidor.start();
		cliente.start();
	}

}
