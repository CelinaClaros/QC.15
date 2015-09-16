package test

class Usuario {
	
	String nombre
	String apellido
	String email
	String password
	Integer telefono

	String calle
	Integer nro
	String partido
	String localidad	
	String provincia

	static hasMany= [reservas:Reserva]
	
    static constraints = {
		
		nombre (blank:false)
		apellido (blank:false)
		email (blank:false, email:true)
		password (blank:false, password: true)
		
		telefono (blank:false)
		
		calle (blank:false)
		nro (blank:false)
		localidad (blank:false)
		partido (blank:false)
		provincia (blank:false)
    }
}
