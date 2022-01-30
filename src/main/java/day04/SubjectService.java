package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SubjectService {

    private List<SubjectBlock> subjectBlocks = new ArrayList<>();

    public SubjectService(String fileName) {
        readAllLines(fileName);
    }

    public void readAllLines(String fileName) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                subjectBlocks.add(new SubjectBlock(line, br.readLine(), br.readLine(), Integer.parseInt(br.readLine())));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file", e);
        }
    }


    public int sumOfLessonNumberByName(String name) {
        int result = 0;
        for (SubjectBlock sb : subjectBlocks) {
            if (name.equals(sb.getName())) {
                result += sb.getLessonNumber();
            }
        }
        return result;
    }

    public List<SubjectBlock> getSubjectBlocks() {
        return subjectBlocks;
    }

    public boolean containsSubjectBlock(SubjectBlock subjectBlock) {
        return subjectBlocks.contains(subjectBlock);
    }
}
