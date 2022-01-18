package com.designpattern.designpattern.structurepattern.facade;

/**
 * 影院的界面
 */
public class TheaterFacade {
    private Player player;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;


    public TheaterFacade() {
        this.player = Player.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    /**
     * 准备播放
     */
    public void ready() {
        player.on();
        projector.on();
        projector.focus();
        screen.down();
        stereo.on();
        theaterLight.dim();
        theaterLight.off();
    }

    public void play() {
        player.play();
    }

    public void end() {
        theaterLight.on();
        theaterLight.bright();
        projector.off();
        screen.up();
        stereo.off();
        player.off();
    }
}
