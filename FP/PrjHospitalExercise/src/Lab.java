
public class Lab implements Result {
	private Long labId;
	
	
	public Long getLabId() {
		return labId;
	}


	public void setLabId(Long labId) {
		this.labId = labId;
	}


	public ResultID getResultType() {
		return ResultID.LAB;
	}
}
