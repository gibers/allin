#!/bin/bash

docker compose -f Docker/docker-compose.yml down -v

docker compose -f Docker/docker-compose.yml up -d

# docker stop allin-pg-c
# docker rm allin-pg-c
# docker compose -f docker-compose.yml up --no-start
# docker start allin-pg-c


