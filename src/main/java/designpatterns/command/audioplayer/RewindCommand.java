package designpatterns.command.audioplayer;

/**
 * @author qingbao.ho@gmail.com
 * @date 2015年7月30日 下午7:26:34
 * @version V1.0
 */
// 具体命令角色类
public class RewindCommand implements Command {

    private AudioPlayer mAudioPlayer;

    public RewindCommand(AudioPlayer audioPlayer){
        mAudioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        mAudioPlayer.rewind();
    }

}
