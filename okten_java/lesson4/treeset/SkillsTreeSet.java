package okten_java.lesson4.treeset;

import java.util.Comparator;

public class SkillsTreeSet implements Comparable<SkillsTreeSet> {
    private String name;
    private int skillAge;

    public SkillsTreeSet(String name, int skillAge) {
        this.name = name;
        this.skillAge = skillAge;
    }

    public int getSkillAge() {
        return skillAge;
    }

    @Override
    public String toString() {
        return "skillAge = " + skillAge +
                " name = " + name + '\n';
    }

    @Override
    public int compareTo(SkillsTreeSet o) {
        return this.skillAge - o.getSkillAge();
    }

}

