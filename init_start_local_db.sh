echo -e "\033[31m ==========================rm redis container==========================\033[0m"
docker rm redis -f

echo -e "\033[31m ==========================rm mysql container==========================\033[0m"
docker rm mysql -f

echo -e "\033[31m ==========================rm file==========================\033[0m"
rm -f -r ./mysql/mysql_data

echo -e "\033[31m ==========================docker-compose up==========================\033[0m"
docker-compose up -d