echo "\n1.Parando containers em execucao... \n"
docker kill app 
docker kill database
docker rm app database
echo "\n2. Apagando imagens existentes... \n"
docker rmi mr/database-filmes 
docker rmi mr/app-filmes 
echo "\n3. Construindo aplicação... \n"
mvn package
echo "\n4. Gerando novas imagens...\n"
docker build -t mr/database-filmes ./database
docker build -t mr/app-filmes ./
echo "\n5. Executando imagens geradas... \n"
docker run -d -p 5433:5432 --name database mr/database-filmes
docker run --name app --link database:host-database mr/app-filmes