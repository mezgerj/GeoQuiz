package geoquiz.android.bignerdranch.com.geoquiz;

/**
 * Created by John on 3/2/2015.
 */
public class TrueFalse {
    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    public void setmTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse( int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }
}
