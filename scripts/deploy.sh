#!/bin/bash

REPOSITORY=/home/ec2-user/app
PROJECT_NAME=clean-architecture-practice

echo "> Git Pull"

git pull

echo "> 애플리케잇션 빌드 시작"

./gradlew clean build

echo "> 빌드 결과물 복사"

cp $REPOSITORY/$PROJECT_NAME/build/libs/*.jar $REPOSITORY/

