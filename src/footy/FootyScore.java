package footy;

public class FootyScore {
    short score;
    short kickGoal;
    short kickBehind;
    public FootyScore(){
        this.score = 0;
        this.kickGoal = 0;
        this.kickBehind = 0;
    }

    public short getPoints(){
        return score;
    }

    public void kickGoal(){
        score+=6;
        kickGoal++;
    }

    public void kickBehind(){
        score++;
        kickBehind++;
    }

    public String sayScore(){
        return kickGoal+", "+kickBehind+", "+score;
    }

    public boolean inFrontOf(FootyScore team){
        return this.score > team.score;
    }
}
