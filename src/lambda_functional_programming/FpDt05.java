package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FpDt05 {

	public static void main(String[] args) {
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

         
        
        
        System.out.println(checkAvgScoresToBeGivenNumber(coursesList,91));
        System.out.println(checkIfAnyCourseNameContainsGivenWord(coursesList,"Turkish"));
        System.out.println(getCourseNameWhoseAvgIsTheHighest(coursesList));
        System.out.println(sortCourseWithAvgScoreInAscendingSkipFirstGiven(coursesList, 3L));
        System.out.println(getThirdAfterSortingInAsc01(coursesList, 3));
        System.out.println(getThirdAfterSortingInAsc02(coursesList, 2));
        
	}
	//1)Create a method to check if all average scores are greater than given number
	public static boolean checkAvgScoresToBeGivenNumber(List<Course>list, double avgScore) {
		
		return list.stream().allMatch(t->t.getAverageScore()>avgScore);
		
	}
	public static boolean checkIfAnyCourseNameContainsGivenWord(List<Course> list, String word) {
		 return list.stream().anyMatch(t->t.getCourseName().contains(word));
		 
	}
	//3)Create a method to print the course whose average score is the highest
	public static String getCourseNameWhoseAvgIsTheHighest(List<Course> list) {
		Course obj =  list.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
		
		return obj.getCourseName();
	}
	//4)Sort the list elements according to the average score in ascending order and skip first 2 elements
	public static List<Course> sortCourseWithAvgScoreInAscendingSkipFirstGiven(List<Course> list, Long num) {
		
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num).collect(Collectors.toList());
		
	}
	//5)Sort the list elements according to the average score in ascending order and print just given one
	//1.way
	public static List<Course> getThirdAfterSortingInAsc01(List<Course> list, int num) {
		
		return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num-1).limit(1).collect(Collectors.toList());
		
	}
	//2.Way:
		public static Course getThirdAfterSortingInAsc02(List<Course> list, int num) {		
			return list.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(num-1).findFirst().get();		
		}
	}
	
