# textshuffler
That library just shuffles all charcters in your string and gives it back.

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

***Or just:***
```
dependencies {
    compile 'com.github.yaroslavyadrov.textshuffler:textshuffler:1.0.0'
}
```

***Using:***
``` java
String shuffledString = TextShuffler.shuffle(inputString);
```
