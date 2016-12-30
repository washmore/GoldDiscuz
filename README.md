# blog
springboot + thymeleaf + angular2 + bootstrap

### Quick start
**Make sure you have Node version >= 5.0 and NPM >= 3 and Maven>=3** 

```bash
# clone our repo
# --depth 1 removes all but one .git commit history
git clone --depth 1 https://github.com/1102568869/blog.git

# change directory to angular2
cd blog/angular2-webpack

# install the repo with npm
npm install

# build by webpack
npm run build

# change directory to java
cd ../

# package jar by Maven
mvn package

# change directory to jar
cd target

# run it!
java -jar demo.jar

```
go to [http://0.0.0.0:10086](http://0.0.0.0:10086) or [http://localhost:10086](http://localhost:10086) in your browser
