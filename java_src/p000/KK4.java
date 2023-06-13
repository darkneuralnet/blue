package p000;

import android.net.Uri;
import co.bird.android.model.ReservationIssueOption;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J \u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00070\u0002H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH&J\b\u0010\u000e\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\bH&¨\u0006\u0017"}, m28432d2 = {"LKK4;", "LS74;", "", "Lco/bird/android/model/ReservationIssueOption;", "issues", "", "S0", "Lkotlin/Pair;", "", "Lio/reactivex/Observable;", "x1", "e", "value", "F0", "U", "", "enabled", "p", "g", "Landroid/net/Uri;", "v", "url", "j", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KK4 */
/* loaded from: classes2.dex */
public interface KK4 extends S74 {
    /* renamed from: F0 */
    void mo97082F0(String str);

    /* renamed from: S0 */
    void mo97081S0(List<ReservationIssueOption> list);

    /* renamed from: U */
    String mo97080U();

    /* renamed from: e */
    Observable<Unit> mo97079e();

    /* renamed from: g */
    Observable<Unit> mo97078g();

    /* renamed from: j */
    void mo97077j(String str);

    /* renamed from: p */
    void mo97076p(boolean z);

    /* renamed from: v */
    Observable<List<Uri>> mo97075v();

    /* renamed from: x1 */
    List<Pair<String, Observable<Unit>>> mo97074x1();
}
