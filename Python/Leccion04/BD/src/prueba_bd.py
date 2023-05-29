import psycopg2

conexion = psycopg2.connect(user= 'postgres', password = '582433', host = '127.0.0.1', port = '5432', database = 'test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' # placeholder
            id_persona = input('Digite un número para el id persona: ')
            cursor.execute(sentencia, (id_persona,)) # de esta manera ejecutamos la sentencia
            registros = cursor.fetchone() # recuperamos todos los registros que seran una lista
            print(registros)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
