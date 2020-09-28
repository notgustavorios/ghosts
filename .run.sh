export DISPLAY=
set -e
javac *.java -d .
jar -cfe /tmp/Ghost.jar GhostTest *.class *.ttf
java -jar /tmp/Ghost.jar
