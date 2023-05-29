import psycopg2 # Esto es para poder conectarnos a postgresql

conexion = psycopg2.connect(
    user = 'postgres', password =  '582433', host = '127.0.0.1', port = '5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor: # se guardan los datos automaticamente con with
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUES (%s, %s, %s)'
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Canto', 'mcanto@mail.com'),
                ('Marcelo', 'Cuenca', 'mcuenca@mail.com'),
                ) # Es una tupla de tuplas
            cursor.execute(sentencia, valores) #  De esta manera ejecutamos la sentencia
            # conexion.commit() Esto se utiliza para guardar los cambios en la base de datos
            registros_insertados= cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')
            
except Exception as e:
    print(f'Ocurrio un error: {e}')
    
finally: # para cerrar la conexion
    conexion.close()


# cursor.close() manera de cerrar el cursor de manera manual
# conexion.close() manera de cerrar la conexion de manera manual