package org.example;



class God {

    enum PowerType {
        CAN_THROW_LIGHTINGS,
        CAN_RAISE_WAVES,
        CAN_AWAKE_DEAD,
    }
    private String name;
    private String desc;
    private PowerType powerType;

    public God( String name, String desc, PowerType powerType) {
        this.name = name;
        this.desc = desc;
        this.powerType = powerType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PowerType getPowerType() {
        return powerType;
    }

    public void setPowerType(PowerType powerType) {
        this.powerType = powerType;
    }

    @Override
    public String toString() {
        return "God{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", powerType=" + powerType +
                '}';
    }
}