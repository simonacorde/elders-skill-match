package diploma.elders.up.bird.optimizer.domain;

import diploma.elders.up.dto.ElderDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simonas on 3/5/2016.
 */
public class Bird {

    private BirdGender birdGender;
    private BirdType birdType;
    private double matchingScore;
    private boolean mated;
    private List<ElderDTO> genes;
    private int nrOfMates = 0;

    public Bird() {
        genes = new ArrayList<>();
    }

    public BirdGender getBirdGender() {
        return birdGender;
    }

    public void setBirdGender(BirdGender birdGender) {
        this.birdGender = birdGender;
    }

    public BirdType getBirdType() {
        return birdType;
    }

    public void setBirdType(BirdType birdType) {
        this.birdType = birdType;
    }

    public double getMatchingScore() {
        return matchingScore;
    }

    public void setMatchingScore(double matchingScore) {
        this.matchingScore = matchingScore;
    }

    public List<ElderDTO> getGenes() {
        return genes;
    }

    public void addGene(ElderDTO elderDTO){
        genes.add(elderDTO);
    }

    public void addGenes(List<ElderDTO> elderDTO){
        genes.addAll(elderDTO);
    }

    public boolean isMated() {
        return mated;
    }

    public void setMated(boolean mated) {
        this.mated = mated;
    }

    public int getNrOfMates() {
        return nrOfMates;
    }

    public void setNrOfMates(int nrOfMates) {
        this.nrOfMates = nrOfMates;
    }

    public void increaseNrOfMates() {
        this.nrOfMates ++;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdGender=" + birdGender +
                ", birdType=" + birdType +
                ", matchingScore=" + matchingScore +
                ", mated=" + mated +
                ", genes=" + genes +
                ", nrOfMates=" + nrOfMates +
                '}';
    }
}
