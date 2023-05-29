package com.example.demo;

import com.example.demo.entities.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
patientRepository.save(new Patient(null,"Mohamed",new Date(),false,4000));
patientRepository.save(new Patient(null,"Hanane",new Date(),false,432));
	patientRepository.save(new Patient(null,"Imane",new Date(),true,340));

	}

////@Bean
//	CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
//		PasswordEncoder passwordEncoder=passwordEncoder();
//		return args -> {
////			UserDetails u1=jdbcUserDetailsManager.loadUserByUsername("user1");
////			if (u1==null)
//		jdbcUserDetailsManager.createUser(User.withUsername("user1").password(passwordEncoder.encode("1234"))
//				.roles("USER").build());
////		UserDetails u2=jdbcUserDetailsManager.loadUserByUsername("user2");
////		if(u2==null)
//			jdbcUserDetailsManager.createUser(User.withUsername("user2").password(passwordEncoder.encode("1234"))
//					.roles("USER").build());
////		UserDetails u3=jdbcUserDetailsManager.loadUserByUsername("admin");
////		if(u3 ==null)
//			jdbcUserDetailsManager.createUser(User.withUsername("admin").password(passwordEncoder.encode("1234"))
//					.roles("USER","ADMIN").build());
//
//		};
//}
//
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}


}

