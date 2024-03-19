package springbootlearn.demo.autowiring;

import java.util.Collection;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//with Autowired, we don't need to create object ourselves by new keyword
@Service("bankService")
public class BankServiceImpl implements BankService{
	
	//method1 to autowire: property dependency injection
	@Autowired
	private BankRepository repository;
	
	
	//method2 to autowire: use constructor dependency injection
	@Autowired
	public BankServiceImpl(BankRepository repository) {
		this.repository = repository;
	}


	@Override
	public void depositIntoAccount(int accountId, double amount) {
		System.out.printf("in bankserviceimpl.depositeintoaccount % d, %.2f \n", accountId, amount);
		repository.updateBalance(accountId, amount);
		
	}

	@Override
	public void withdrawFromAccount(int accountId, double amount) {
		System.out.printf("in withdrawfromaccount %d %.2f", accountId, amount);
		repository.updateBalance(accountId, -amount);
		
	}

	@Override
	public void transferFunds(int fromAccountId, int toAccountId, double amount) {
		System.out.printf("In BankServiceImpl.transferFunds(%d, %d, %.2f)\n", fromAccountId, toAccountId, amount);
		repository.updateBalance(fromAccountId, -amount);
		repository.updateBalance(toAccountId, +amount);
		
	}
	
	//You can autowire a Collection<T>,Spring injects a collection of all the beans of type T
	@Autowired
	private Collection<BankRepository> repositories;
	
	//You can also autowire a Map<String,T>,Spring injects a map indicating all beans of type T,Keys are bean names, values are bean instances
	@Autowired
	private Map<String, BankRepository> repositoriesMap;
	
	
	
}