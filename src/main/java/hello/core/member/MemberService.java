package hello.core.member;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
