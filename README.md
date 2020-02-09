# LINUX COMMAND

kill -9 $(lsof -t -i:8080)

ps ax | grep firefox | cut -f2 -d" " - | xargs kill -9
