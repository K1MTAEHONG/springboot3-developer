package me.taehong.springbootdeveloper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach //테스트 실행 전 실행 하는 매서드
    public void mockMvcSetup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @AfterEach  //테스트 실행 후 실행 하는 매서드
    public void cleanUp() {
        memberRepository.deleteAll();
    }

    //@DisplayName("geAllMembers: 아티클 조회에 성공한다.")
    //@Test
    //public void getAllmembers() throws Exception {
        //given
        //final String url = "/test";
        //Member savedMember = memberRepository.save(new Member(1L, "홍길동"));

        //when
        //final ResultActions result = mockMvc.perform(get(url) //테스트 파일이라 오류 무시했음
                //.accept(MediaType.APPLICATION_JSON));

        //then
        //result
                //.andExpect(status().isOk())
                //.andExpect(jsonPath("$[0].id").value(savedMember.getId()))
                //.andExpect(jsonPath("$[0].name").value(savedMember.getname()));

}