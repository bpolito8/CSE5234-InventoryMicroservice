

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inventory
 */
@WebServlet("/Inventory")
public class Inventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Product> products = new ArrayList<Product>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inventory() {
        super();
        // TODO Auto-generated constructor stub
        
        products.add(new Product(1, "Aoenium", 7.99, "Aeoniums are most commonly known for their striking rosettes made up of dense, glossy, waxy leaves growing out of a single stem.", "assets/imgs/aeonium.jpg"));
        products.add(new Product(1, "Aoenium", 7.99, "Aeoniums are most commonly known for their striking rosettes made up of dense, glossy, waxy leaves growing out of a single stem.", "assets/imgs/aeonium.jpg"));
        products.add(new Product(1, "Aoenium", 7.99, "Aeoniums are most commonly known for their striking rosettes made up of dense, glossy, waxy leaves growing out of a single stem.", "assets/imgs/aeonium.jpg"));
        products.add(new Product(1, "Aoenium", 7.99, "Aeoniums are most commonly known for their striking rosettes made up of dense, glossy, waxy leaves growing out of a single stem.", "assets/imgs/aeonium.jpg"));
        products.add(new Product(1, "Aoenium", 7.99, "Aeoniums are most commonly known for their striking rosettes made up of dense, glossy, waxy leaves growing out of a single stem.", "assets/imgs/aeonium.jpg"));
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		// Create Jsonb and serialize
		Jsonb jsonb = JsonbBuilder.create();
		String productsJSON = jsonb.toJson(products);
		response.setContentType("application/json");
		// Get the printwriter object from response to write the required json object to the output stream      
		PrintWriter out = response.getWriter();
		// Assuming your json object is **jsonObject**, perform the following, it will return your json object  
		out.print(productsJSON);
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
