// Class bieu dien cho cai nha

public class House implements Building {
    public String getType() {
        return "house"
    }
}

// class bieu dien cho lau dai
public class Edifice implements Building {
    public String getType() {
        return "edifice"
    }
}

public class BuildingFactory {
    private static Map<String, Building> Instances;

    static {
        Instances = new HashMap<>()

        Instances.put("house", new House())
        Instances.put("edifice", new Edifice())
    }

    public static <T extends Building> T getBuilding(String type) {
        return (T) Instances.get(type)
    }
    
}

// Khoi tao object
Building building = BuildingFactory.getBuilding("house")