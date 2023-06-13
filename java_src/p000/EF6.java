package p000;

import co.bird.android.model.IssueType;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&¨\u0006\u0012"}, m28432d2 = {"LEF6;", "", "Lio/reactivex/Observable;", "", "l", "Lkotlin/Pair;", "Lco/bird/android/model/IssueType;", "", "Jl", "", "count", "Cc", "", "LH6;", "sections", "b", "issues", "I2", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EF6 */
/* loaded from: classes3.dex */
public interface EF6 {
    /* renamed from: Cc */
    void mo107380Cc(int i);

    /* renamed from: I2 */
    Observable<Boolean> mo107379I2(List<IssueType> list);

    /* renamed from: Jl */
    Observable<Pair<IssueType, Boolean>> mo107378Jl();

    /* renamed from: b */
    void mo107377b(List<C3023H6> list);

    /* renamed from: l */
    Observable<Unit> mo107376l();
}
