import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import Result.ResultID;

public class Main {

	BiFunction<Hospital, Character, Long> docStartsWith = (h, c) -> h.getDepartments().stream().flatMap(dep -> dep.getDoctors().stream()).filter(doc -> doc.getName().startsWith(c.toString())).count();
	Function<Hospital, Optional<Doctor>> docByMaxVisit = (h) -> h.getDepartments().stream().flatMap(dep -> dep.getDoctors().stream()).sorted((doc1, doc2)->doc2.getVisits().size()-doc1.getVisits().size()).findFirst();
	TriFunction<Hospital, Character, Integer, List<String>> oldestKDoctorWhoseNameStartsWith = 
			(h,c,k) ->
			h.getDepartments().stream().flatMap(dep -> dep.getDoctors().stream())
			.filter(doc -> doc.getName().startsWith(c.toString()))
			.sorted((doc1, doc2) -> doc2.getAge() - doc1.getAge())
			.limit(k).map(x -> x.getName().toUpperCase()).collect(Collectors.toList())
				;

			// oldest doctor
			// certain patient
	/*BiFunction<Hospital, Patient, Optional<Doctor>> oldestDoctorByPatient = (h, p) ->
	h.getDepartments().stream()
	.flatMap(dep -> dep.getDoctors().stream())
	.filter(doc -> doc.getVisits().stream().filter(visit -> visit.getPatient().equals(p)).count()>0)
	.sorted((doc1, doc2) -> doc2.getAge()-doc1.getAge())
	.findFirst();*/
	
	// which lab issue the most
	
	/*Function<Hospital, Optional<Long>> labCalledTheMost = (h) ->
	h.getDepartments().stream()
			.flatMap(dep -> dep.getDoctors().stream())
			.flatMap(doc -> doc.getVisits().stream())
			.flatMap(vis -> vis.getResult().stream())
			.filter(res -> res instanceof Lab)
			.collect(Collectors.groupingBy(o -> o, Collectors.counting()))
			.entrySet()
			.stream()
			.sorted((resultT1, resultT2) -> resultT2.getValue().intValue() - (resultT1.getValue().intValue()))
			.limit(1)
			.map(x -> ((Lab)x.getKey()).getLabId())
			.findFirst();*/
	
	//
			Function<Hospital, Optional<Long>> labIdCalledTheMost = (h) ->
			h.getDepartments().stream()
					.flatMap(dep -> dep.getDoctors().stream())
					.flatMap(doc -> doc.getVisits().stream())
					.flatMap(vis -> vis.getResult().stream())
					.filter(res -> res.getResultType() == Result.ResultID.LAB)
					.collect(Collectors.groupingBy(o -> o, Collectors.counting()))
					.entrySet()
					.stream()
					.sorted((resultT1, resultT2) -> resultT2.getValue().intValue() - (resultT1.getValue().intValue()))
					.limit(1)
					.map(x -> ((Lab)x.getKey()).getLabId())
					.findFirst();
			
			// number of doctors who issued medication id
			
			BiFunction<Hospital, Long, Long> numberOfDoctorsWhoIssuedMed = (h, m) ->
			h.getDepartments().stream()
			.flatMap(dep -> dep.getDoctors().stream())
			.filter(
					doc -> doc.getVisits().stream().filter(
							vis -> vis.getResult().stream()
							.filter(res -> res.getResultType() == Result.ResultID.MED && 
							((Med)res).getId() == m).count() > 0)
					.count() > 0).count();
			
			
	

	
	public static void main(String[] args) {
		Hospital h = new Hospital(Arrays.asList(
				new Department(Arrays.asList(
						new Doctor("Cobain", 20, Arrays.asList(
								new Visit(null),
								new Visit(null)
						)),
						new Doctor("Carl", 20, Arrays.asList(
								new Visit(null)
						))
						
				)),
				new Department(Arrays.asList(
						new Doctor("Alex", 19, Arrays.asList(
								new Visit(null),
								new Visit(null),
								new Visit(null)
						)),
						new Doctor("Arnold", 16, Arrays.asList(
								new Visit(null)
						))
				)
		)));
		
				
				

	}

}
