# GoldDiscuz
长沙金地自在城业主论坛
springboot + thymeleaf + angular2 + bootstrap

### Quick start
**Make sure you have Node version >= 5.0 and NPM >= 3 and Maven>=3** 

```bash
# clone our repo
# --depth 1 removes all but one .git commit history
git clone --depth 1 https://github.com/1102568869/GoldDiscuz.git

# change directory to angular2
cd GoldDiscuz/angular

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
java -jar gold.jar

```
go to [http://0.0.0.0:10000](http://0.0.0.0:10000) or [http://localhost:10000](http://localhost:10000) in your browser
