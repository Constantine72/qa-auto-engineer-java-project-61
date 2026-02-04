.PHONY: build run-dist setup

build:
	./gradlew build

run-dist:
	chmod +x gradlew
	./gradlew installDist
	./build/install/app/bin/app

setup:
	./gradlew clean
