package p000;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.constant.IssueStatusReason;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H&J\u001e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH&J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007H&J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H&J$\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00050\u00042\u0006\u0010\u001b\u001a\u00020\tH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0018H&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\"\u001a\u00020!H&J\b\u0010$\u001a\u00020\u000bH&J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H&¨\u0006&"}, m28432d2 = {"LFz4;", "LaM5;", "LS74;", "Lh56;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/RepairType;", "", "T1", "Lco/bird/android/model/Issue;", "K0", "", "Tj", "C0", "supertype", "", "Lco/bird/android/model/RepairTypeLock;", "selectedRepairs", "p6", "LH6;", "sections", "b", "enabled", "ge", "", "numRepairs", "W6", "issue", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "je", "repairCount", "o0", "", "idToolDisplay", "g2", "li", "h7", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC33012Fz4 extends InterfaceC37910aM5, S74, InterfaceC41921h56 {
    /* renamed from: C0 */
    Observable<Unit> mo104535C0();

    /* renamed from: K0 */
    Observable<Issue> mo104534K0();

    /* renamed from: T1 */
    Observable<Pair<RepairType, Boolean>> mo104533T1();

    /* renamed from: Tj */
    Observable<Unit> mo104532Tj();

    /* renamed from: W6 */
    void mo104531W6(int i);

    /* renamed from: b */
    void mo104530b(List<C3023H6> list);

    /* renamed from: g2 */
    Observable<Unit> mo104529g2(String str);

    /* renamed from: ge */
    void mo104528ge(boolean z);

    /* renamed from: h7 */
    void mo104527h7(String str);

    /* renamed from: je */
    Observable<Pair<IssueStatus, IssueStatusReason>> mo104526je(Issue issue);

    /* renamed from: li */
    void mo104525li();

    /* renamed from: o0 */
    void mo104524o0(int i);

    /* renamed from: p6 */
    void mo104523p6(Issue issue, List<RepairTypeLock> list);
}
