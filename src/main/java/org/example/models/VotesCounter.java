package org.example.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VotesCounter {
    private Set<Voter> voters;
    private Map<Elector, Integer> votesCountMap;
    public  VotesCounter() {
        voters = new HashSet<>();
        votesCountMap = new HashMap<>();

    }
    public void addVote(Voter voter, Elector elector) {
        if(voters.contains(voter)) {
            System.err.println("Voter already voted. Not counting vote" + voter);
            return;
        }
        voters.add(voter);

        //count votes
        if(!votesCountMap.containsKey(elector)) {
            votesCountMap.put(elector, 0);
        }

        int currentVotes = votesCountMap.get(elector);
        votesCountMap.put(elector, currentVotes + 1);
        System.out.println("Vote registered for voter " + voter);
    }
    public void printResults() {
        System.out.println(votesCountMap);

    }
}
