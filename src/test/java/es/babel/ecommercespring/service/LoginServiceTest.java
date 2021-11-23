//package es.babel.ecommercespring.service;
//
//import es.babel.ecommercespring.model.Login;
//import es.babel.ecommercespring.repository.LoginRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.when;
//
//
//class LoginServiceTest {
//
//    @Mock
//    private LoginRepository repo;
//
//    @InjectMocks
//    private LoginService loginService;
//
//    private Login log;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        log = new Login();
//
//        log.setId(new Long(1));
//        log.setUsername("moaad");
//        log.setPassword("moaad");
//
//    }
//
//        @Test
//    void login() {
//        when(repo.findAll()).thenReturn(Arrays.asList(log));
//        assertNotNull(loginService.findAll());
//    }
////    @Test
////    void login() {
////        when(repo.findByUsernameAndPassword("moaad", "moaad"));
////        assertNotNull(loginService.findByUsernameAndPassword("moaad","moaad"));
////    }
//}