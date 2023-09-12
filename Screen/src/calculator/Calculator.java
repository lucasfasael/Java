package calculator;

import br.com.alura.screenmatch.model.Video;

public class Calculator {
    private int totalOfDuration;

    public int getTotalOfDuration() {
        return this.totalOfDuration;
    }

    public void includeDuration(Video video){
        totalOfDuration += video.getDurationMinutes();
    }
}
