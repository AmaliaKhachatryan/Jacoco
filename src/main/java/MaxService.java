public class MaxService {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
//<build>
//<plugins>
//<plugin>
//<groupId>org.apache.maven.plugins</groupId>
//<artifactId>maven-surefire-plugin</artifactId>
//<version>2.22.2</version>
//<configuration>
//<failIfNoTests>true</failIfNoTests>
//</configuration>
//</plugin>
//
//<plugin>
//<groupId>org.jacoco</groupId>
//<artifactId>jacoco-maven-plugin</artifactId>
//<version>0.8.5</version>
//
//<executions>
//<execution>
//<id>prepare-agent</id>
//<goals>
//<goal>prepare-agent</goal>
//</goals>
//</execution>
//
//<execution>
//<id>report</id>
//<phase>verify</phase>
//<goals>
//<goal>report</goal>
//</goals>
//</execution>
//</executions>
//</plugin>
//</plugins>
//</build>
