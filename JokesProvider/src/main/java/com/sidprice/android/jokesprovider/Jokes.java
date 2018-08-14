package com.sidprice.android.jokesprovider;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    private ArrayList<String> mJokes = new ArrayList<>() ;
    public Jokes() {
        // https://thoughtcatalog.com/melanie-berliet/2015/09/40-ridiculous-knock-knock-jokes-thatll-get-you-a-laugh-on-demand/
        mJokes.add("Knock Knock.\nWho's there?\nCow says.\nCow says who?\nNo, a cow says mooo");
        mJokes.add("Knock Knock.\nWho's there?\nA little old lady\nA little old lady who?\nAll this time I had no idea you could yodel");
        mJokes.add("Knock Knock.\nWho's there?\nEtch.\nEtch who?\nBless you friend");
        mJokes.add("Knock Knock.\nWho's there?\nCash.\nCash who?\nNo thanks, I'll have some peanuts");
        mJokes.add("Knock Knock.\nWho's there?\nTank.\nTank who?\nYou're welcome");

    }
    public String getJoke() {
        Random  randomNumber = new Random() ;
        int     jokeIndex = randomNumber.nextInt(mJokes.size()) ;

        return mJokes.get(jokeIndex);
    }
}
