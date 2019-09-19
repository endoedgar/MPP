import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class School {
	private List<Teacher> teachers;

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	Function<School, List<Student>> getAllStudents = (s) ->
	s.getTeachers().stream().flatMap(teacher -> teacher.getGrades().stream())
	.map(grades -> grades.getStudent())
	.distinct().collect(Collectors.toList());
	
	Function<Student, Long> getScorePerStudent = (s) ->
		s.getGrades().
		stream().filter(
			grade -> grade.getScore() == 'A' || grade.getScore() == 'B'
		).mapToLong(grade -> grade.getCourse().getScore()).sum();

	Function<School, List<Student>> bestStudentsByScore = (s) ->
		getAllStudents.apply(s).stream()
		.collect(
				Collectors.groupingBy(student -> student, 
						Collectors.summingLong(getScorePerStudent.apply(student))));
						
		.entrySet().stream()
		.sorted((entry1, entry2) -> entry2.getValue().intValue() - entry1.getValue().intValue())
		.map(entry -> entry.getKey())
		.collect(Collectors.toList());
		
	Function<School, List<List>> best10Students = (s) ->
		bestStudentsByScore.apply(s).stream()
		limit(10)
		
		
		
		.filter(
				student -> student.getGrades().stream().filter(
					grade -> grade.getScore() == 'A' || grade.getScore() == 'B'
			).collect(Collectors.groupingBy(grade -> grade, Collectors.summingLong(student -> student.getCourse().get)))
	)
	.collect(Collectors.toList())
	;
//	
	BiFunction<School, Long, List<Student>> studentListWhoDidMinimumScoreOf = (s, minScore) ->
		s.getTeachers().stream()
		.flatMap(teacher -> teacher.getGrades().stream())
		.map(grades -> grades.getStudent())
		.distinct()
		.filter(
				student -> student.getGrades().stream().filter(
						grade -> grade.getScore() == 'A' || grade.getScore() == 'B'
				).collect(Collectors.summingInt(o -> o.getCourse().getScore())) >= minScore
		)
		.collect(Collectors.toList())
		;
	
	
}
