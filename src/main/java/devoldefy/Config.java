package devoldefy;

import java.util.Map;
import java.util.Set;

public class Config {

    public String mcpGameVersion;
    public String mcpChannel;
    public String mcpBuild;

    public String yarnGameVersion;
    public String yarnBuild;

    public String mcpSourceCode;
    public String yarnSourceCode;

    public String[] classpath;

    public String copiedSubPackage;
    public String copyTargetDir;

    public Set<String> additionalArguments;

    public Map<String, String> additionalClassMappings;
    public Map<String, String> additionalFieldMappings;
    public Map<String, String> additionalMethodMappings;
}
