package hello.core.member;

public interface MemberService {

    void Join(Member member);

    Member findMember(Long memberId);
}
