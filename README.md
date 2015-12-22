# textshuffler

***Edit your gradle file like this:***
```
repositories {
    maven {
       url 'https://dl.bintray.com/yaroslavyadrov/maven'
    }
}
 
dependencies {
    compile 'com.github.yaroslavyadrov.textshuffler:textshuffler:1.0.0@aar'
}
```

***Using:***
``` java
String shuffledString = TextShuffler.shuffle(inputString);
```
