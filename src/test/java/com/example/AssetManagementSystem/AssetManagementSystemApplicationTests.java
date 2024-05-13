package com.example.AssetManagementSystem;

import com.example.AssetManagementSystem.core.AssetService;
import com.example.AssetManagementSystem.persistence.AssetRepository;
import jakarta.inject.Inject;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssetManagementSystemApplicationTests {

	@Mock
	private AssetRepository assetRepository;


	@InjectMocks
	private AssetService assetService;

	@BeforeEach
	public void setup(){
		MockitoAnnotations.openMocks(this);
	}


	@Test
	public void getValueOfAssetsTest() {

      
	}

}
