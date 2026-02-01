setup: run-dist
run-dist:
	cd ../../
	./gradlew installDist
	./build/install/app/bin/app
