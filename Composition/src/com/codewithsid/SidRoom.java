package com.codewithsid;

public class SidRoom {
    private int doors;
    private int windows;
    private int walls;
    public Furniture furniture;
    public DecorativeStuffs decorativeStuffs;
    public WallHangings wallHangings;

    public SidRoom(int doors, int windows, int walls, Furniture furniture,
                   DecorativeStuffs decorativeStuffs, WallHangings wallHangings) {
        this.doors = doors;
        this.windows = windows;
        this.walls = walls;
        this.furniture = furniture;
        this.decorativeStuffs = decorativeStuffs;
        this.wallHangings = wallHangings;
    }
}
