package p000;

import android.location.Location;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireFrequentFlyerView;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p000.H31;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J:\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J:\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0018\u001a\u00020\bH&J\b\u0010\u0019\u001a\u00020\bH&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH&J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010\u001f\u001a\u00020\bH&J\u001a\u0010$\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH&J-\u0010*\u001a\u00020\u00062\b\b\u0001\u0010&\u001a\u00020\u00122\u0012\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'\"\u00020(H&¢\u0006\u0004\b*\u0010+¨\u0006,"}, m28432d2 = {"LZS;", "LH31;", "LS74;", "LaM5;", "Lh56;", "Lhm5;", "", "pricingString", "", "nl", "ol", "duration", "Lkotlin/Function0;", "onPrimary", "onSecondary", "onDismiss", "Q3", "we", "", "title", "hint", "Lio/reactivex/F;", "LH31$b;", "M", "c5", "gl", "Lio/reactivex/Observable;", "F2", "Lco/bird/android/model/wire/WireFrequentFlyerView;", "view", "Rk", "Rf", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "O9", "Hh", "resId", "", "", "formatArgs", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZS */
/* loaded from: classes2.dex */
public interface InterfaceC10274ZS extends H31, S74, InterfaceC37910aM5, InterfaceC41921h56, InterfaceC42324hm5 {
    /* renamed from: F2 */
    Observable<Unit> mo71347F2();

    /* renamed from: Hh */
    Observable<Unit> mo71346Hh();

    /* renamed from: M */
    AbstractC23442F<H31.AbstractC3016b> mo71345M(int i, int i2);

    /* renamed from: O9 */
    void mo71344O9(WireBird wireBird, Location location);

    /* renamed from: Q3 */
    void mo71343Q3(String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03);

    /* renamed from: Rf */
    void mo71342Rf();

    /* renamed from: Rk */
    void mo71341Rk(WireFrequentFlyerView wireFrequentFlyerView);

    /* renamed from: c5 */
    void mo71340c5();

    String getString(int i, Object... objArr);

    /* renamed from: gl */
    void mo71339gl();

    /* renamed from: nl */
    void mo71338nl(String str);

    /* renamed from: ol */
    void mo71337ol();

    /* renamed from: we */
    void mo71336we(String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03);
}
