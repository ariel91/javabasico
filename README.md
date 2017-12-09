Diccionario de comandos Git
========

…or create a new repository on the command line

echo "# javabasico" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/ariel91/javabasico.git
git push -u origin master

…or push an existing repository from the command line

git remote add origin https://github.com/ariel91/javabasico.git
git push -u origin master


Iniciar Repositorio
------
git init

Agregar todos los archivos a Staging Area
------
git add .

hacer commit
git commit -m "Inicializacion del repositorio"


Agregar usuario a configuracion

  git config --global user.email "arielchitay91@gmail.com"
  git config --global user.name "ariel91"
  
Para subir cambios 
---------------------
git push -u origin master

