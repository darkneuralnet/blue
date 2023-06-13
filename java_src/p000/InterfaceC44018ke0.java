package p000;

import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\u000f\u001a\u00020\tH&¨\u0006\u0010"}, m28432d2 = {"Lke0;", "", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "P", "Lco/bird/android/model/Issue;", "issue", "", "d7", "", "LH6;", "sections", "b", "dismiss", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ke0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44018ke0 {
    /* renamed from: P */
    Observable<Pair<IssueStatus, IssueStatusReason>> mo27064P();

    /* renamed from: b */
    void mo27063b(List<C3023H6> list);

    /* renamed from: d7 */
    void mo27062d7(Issue issue);

    void dismiss();
}
