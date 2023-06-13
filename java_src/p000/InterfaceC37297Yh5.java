package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdInspectionPoint;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\b\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H&J\u001e\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0014j\b\u0012\u0004\u0012\u00020\u0005`\u00150\u0012H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H&¨\u0006\u001a"}, m28432d2 = {"LYh5;", "LaM5;", "LH31;", "LS74;", "", "Lco/bird/android/model/BirdInspectionPoint;", "points", "", "i6", "Gf", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "m", "n9", "gb", "", "enabled", "z4", "Lio/reactivex/Observable;", "X3", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "S6", "x5", "A0", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yh5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC37297Yh5 extends InterfaceC37910aM5, H31, S74 {
    /* renamed from: A0 */
    Observable<Unit> mo64097A0();

    /* renamed from: Gf */
    void mo64096Gf();

    /* renamed from: S6 */
    Observable<ArrayList<BirdInspectionPoint>> mo64092S6();

    /* renamed from: X3 */
    Observable<Boolean> mo64087X3();

    /* renamed from: d */
    Observable<Unit> mo64086d();

    /* renamed from: gb */
    void mo64085gb();

    /* renamed from: i6 */
    void mo64084i6(List<BirdInspectionPoint> list);

    /* renamed from: m */
    void mo64083m(String str);

    /* renamed from: n9 */
    void mo64082n9();

    /* renamed from: x5 */
    Observable<Unit> mo64081x5();

    /* renamed from: z4 */
    void mo64080z4(boolean z);
}
