import psycopg2 # Esto es para poder conectarnos a postgresql

conexion = psycopg2.connect(
    user = 'postgres', password =  '582433', host = '127.0.0.1', port = '5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' #  Placeholder - %s pedimos un parametro
            entrada = input('Digite los id_persona a buscar (separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias) #  De esta manera ejecutamos la sentencia
            registros= cursor.fetchall() # REcuperamos todos los registros que seran una lista
            print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
    
finally: # para cerrar la conexion
    conexion.close()


# cursor.close() manera de cerrar el cursor de manera manual
# conexion.close() manera de cerrar la conexion de manera manual