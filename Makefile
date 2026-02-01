setup: run-dist
run-dist:
	cd ../../
	./gradlew :app:installDist
	./code/app/build/install/app/bin/app
