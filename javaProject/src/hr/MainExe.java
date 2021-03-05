package hr;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO(); // 연결
		Department[] deptList = dao.deptList(); // 호출
		System.out.println("출력 > "); 
		for (Department dep : deptList) {
			if(dep != null) {
			System.out.println(dep.toString());
			}
		}

		dao = new EmpDAO();
		Employee[] empList = dao.empList();
		System.out.println("salary가 5000 이상인 사람 정보 > ");
		for (Employee emp : empList) {
			if (emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
	}
}