package demo.autowiring;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepositoryImpl implements BankRepository{

	@Override
	public int createAccount(String name) {
		System.out.printf("In bankrepositoryimpl.createAccount %s\n", name);
		return 0;

	}

	@Override
	public double getBalance(int accountId) {
		System.out.printf("in bankrepositoryiml.getBalance %d\n", accountId);
		return 0;

	}

	@Override
	public void updateBalance(int accountId, double amount) {

		System.out.printf("in bankrepositoryimpl.updateBalance %d %f \n", accountId, amount);
	}

	@Override
	public void deleteAccount(int accountId) {
		System.out.printf("in bankrepositoryimpl.deleteAccount %d \n", accountId);

		
	}

}