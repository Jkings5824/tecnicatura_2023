# Declaramos un avariable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8') # La w es de white(escribir)
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción,\n')
    archivo.write('Con esto terminamos')
    
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close()# con esto se debe cerrar el archivos
# una vez cerrado el archivo no podemos agregar, leer o ejecutar el archivo 