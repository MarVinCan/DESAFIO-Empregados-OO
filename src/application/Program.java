package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String nameDepart = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();

		Address address = new Address(email, phone);
		Department derpartment = new Department(nameDepart, payDay, address);

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();

			Employee emp = new Employee(name, salary);
			derpartment.addEmployee(emp);
		}
		System.out.println();

		showReport(derpartment);

		sc.close();

	}

	private static void showReport(Department dept) {

		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.printf("Departamento Vendas = R$ %.2f%n", dept.payroll());
		System.out.printf("Pagamento realizado no dia %d%n", dept.getPayDay());
		System.out.println("Funcionários:");
		System.out.print(dept.getEmployee());
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
	}
}
