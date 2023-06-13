package p000;

import co.bird.android.model.BirdInspectionPoint;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J&\u0010\u000f\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\r0\fH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\fH&J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0004H&J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u0006\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0019\u001a\u00020\u0006H&¨\u0006\u001a"}, m28432d2 = {"LdP5;", "LaM5;", "LH31;", "LS74;", "", "birdCode", "", "m", "Ljava/util/ArrayList;", "Lco/bird/android/model/BirdInspectionPoint;", "inspectionPointList", "Ui", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "v7", "o7", "A0", "rd", "id", "Lio/reactivex/subjects/a;", "", "Jk", PaymentMethodOptionsParams.Blik.PARAM_CODE, "ki", "J7", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dP5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39734dP5 extends InterfaceC37910aM5, H31, S74 {
    /* renamed from: A0 */
    Observable<Unit> mo36453A0();

    /* renamed from: J7 */
    void mo36452J7();

    /* renamed from: Jk */
    C24552a<Boolean> mo36451Jk(String str);

    /* renamed from: Ui */
    void mo36445Ui(ArrayList<BirdInspectionPoint> arrayList);

    /* renamed from: ki */
    Observable<Unit> mo36443ki(String str);

    /* renamed from: m */
    void mo36442m(String str);

    /* renamed from: o7 */
    Observable<Unit> mo36441o7();

    /* renamed from: rd */
    Observable<Unit> mo36440rd();

    /* renamed from: v7 */
    Observable<Pair<List<BirdInspectionPoint>, List<BirdInspectionPoint>>> mo36439v7();
}
