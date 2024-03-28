package trabalhoCargaHorariadengue;

public class chd {
	public static void main(String[] args) {
		
	    String tarefa = "";
	    String codigo = "";
	    String descricao = "";
	    int inicio = 0;
	    int fim = 0;
	    int hrs = 8;
	    String a = "0";

	    codigo = "001";
	    descricao = "Febre";
	    inicio = 8;
	    fim = 9;   
	    a = descricao;
	    
	    
	    int cargahoraria = 8;
	    int horariotrabalhado = fim - inicio;
	    int horasrestantes = cargahoraria - horariotrabalhado; 
	    
	    hrs = hrs - horariotrabalhado;
	    tarefa = tarefa + codigo + " Cadastro de sintoma: " + descricao + " - Início: " + inicio + " hrs - Fim: " + fim + " hrs - " +"Trabalhou: " + horariotrabalhado + " horas. Restam " + hrs + " horas de trabalho!" +"\n";		    
	  
	    
	    codigo = "002";
	    descricao = "Dor nas articulações";
	    inicio = 10;
	    fim = 12;    
	    a = a +", " + descricao;
	    
	    horariotrabalhado = fim - inicio;
	    horasrestantes = cargahoraria - horariotrabalhado;
	    
	    hrs = hrs - horariotrabalhado;
	    tarefa = tarefa + codigo + " Cadastro de sintoma: " + descricao + " - Início: " + inicio + " hrs - Fim: " + fim + " hrs - " +"Trabalhou: " + horariotrabalhado + " horas. Restam " + hrs + " horas de trabalho!" +"\n";
	    
	    
	    codigo = "003";
	    descricao = "Dor de cabeça";
	    inicio = 14;
	    fim = 16;    
	    a = a +", " + descricao;
	    
	    horariotrabalhado = fim - inicio;
	    horasrestantes = cargahoraria - horariotrabalhado;
	    
	    hrs = hrs - horariotrabalhado;
	    tarefa = tarefa + codigo + " Cadastro de sintoma: " + descricao + " - Início: " + inicio + " hrs - Fim: " + fim + " hrs - " +"Trabalhou: " + horariotrabalhado + " horas. Restam " + hrs + " horas de trabalho!" +"\n";
	    
	    codigo = "004";
	    descricao = "Dor atrás dos olhos";
	    inicio = 16;
	    fim = 17;    
	    a = a +", " + descricao;
	    
	    horariotrabalhado = fim - inicio;
	    horasrestantes = cargahoraria - horariotrabalhado;
	    
	    hrs = hrs - horariotrabalhado;
	    tarefa = tarefa + codigo + " Cadastro de sintoma: " + descricao + " - Início: " + inicio + " hrs - Fim: " + fim + " hrs - " +"Trabalhou: " + horariotrabalhado + " horas. Restam " + hrs + " horas de trabalho!" +"\n";
	    
	    
	    System.out.println(tarefa);
	    System.out.println("Restam: " + hrs + " hrs de trabalho!");
	    System.out.println(a);
	    
		String dengue = "";
		dengue += verificaSintomas("Dor de cabeça");
		dengue += verificaSintomas("Febre");
		dengue += verificaSintomas("Dor atrás dos olhos");
		dengue += verificaSintomas("Dor nas articulações");
		
		//System.out.println(dengue);
		
		diagnostico(dengue);
		
		diagnosticoNovo("Dor de cabeça", "Febre", "Dor atrás dos olhos", "Dor nas articulações");

	}

	private static void diagnosticoNovo(String sint1, String sint2, String sint3, String sint4) {
		String sint1Esperado = "Dor de cabeça";
		String sint2Esperado = "Febre";
		String sint3Esperado = "Dor atrás dos olhos";
		String sint4Esperado = "Dor nas articulações";
		
		boolean diagnosticoFinal = (sint1.equals(sint1Esperado)&& 
								   sint2.equals(sint2Esperado)&&
								   sint3.equals(sint3Esperado)&& 
								   sint4.equals(sint4Esperado));
		
		//System.out.println("A pessoa tem dengue? Resposta: " + diagnosticoFinal);
		
		
	}

	  private static void diagnostico(String dengue) {
		boolean d1 = dengue.contains("Dor de cabeça");
		boolean d2 = dengue.contains("Febre");
		boolean d3 = dengue.contains("Dor atrás dos olhos");
		boolean d4 = dengue.contains("Dor nas articulações");
		
		boolean diagnosticoFinal = d1&&d2&&d3&&d4;
		
		System.out.println("A pessoa está com dengue?" + diagnosticoFinal);
		
	}

	private static String verificaSintomas(String sintoma) {
		
		return String.format("%s \n", sintoma);
	}
	
}
