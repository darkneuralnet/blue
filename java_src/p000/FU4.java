package p000;

import android.location.Location;
import co.bird.android.model.CompleteRideResponse;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.WarningPresentationKind;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&JO\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\b\u0010\u0016\u001a\u00020\rH&J \u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH&J \u0010 \u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH&J(\u0010%\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H&J \u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001bH&J#\u0010+\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H&¢\u0006\u0004\b+\u0010,¨\u0006-"}, m28432d2 = {"LFU4;", "", "Ln9;", "alertDialog", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "presentationKind", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "l1", "", "title", "message", "Lkotlin/Function0;", "", "onPrimary", "onSecondary", "", "fee", "currency", "k1", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/String;)V", "N0", "removeRoute", "Lco/bird/android/model/wire/WireRide;", "ride", "Lco/bird/android/model/wire/WireBird;", "bird", "Lorg/joda/time/DateTime;", "operationStart", "p1", "", "throwable", "n1", "Lco/bird/android/model/CompleteRideResponse;", "response", "", "usedOverride", "m1", "o1", "Landroid/location/Location;", "location", "", "zoomLevel", "zoomTo", "(Landroid/location/Location;Ljava/lang/Float;)V", "co.bird.android.feature.rider.core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FU4 */
/* loaded from: classes3.dex */
public interface FU4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: FU4$a */
    /* loaded from: classes3.dex */
    public static final class C2316a {
        public static /* synthetic */ void zoomTo$default(FU4 fu4, Location location, Float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoomTo");
            }
            if ((i & 2) != 0) {
                f = null;
            }
            fu4.zoomTo(location, f);
        }
    }

    /* renamed from: N0 */
    void mo35201N0(Function0<Unit> function0);

    /* renamed from: k1 */
    void mo34960k1(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, Integer num, String str3);

    /* renamed from: l1 */
    AbstractC23442F<DialogResponse> mo34949l1(InterfaceC26418n9 interfaceC26418n9, WarningPresentationKind warningPresentationKind);

    /* renamed from: m1 */
    void mo34938m1(WireRide wireRide, CompleteRideResponse completeRideResponse, DateTime dateTime, boolean z);

    /* renamed from: n1 */
    void mo34927n1(WireRide wireRide, Throwable th, DateTime dateTime);

    /* renamed from: o1 */
    void mo34916o1(WireRide wireRide, Throwable th, DateTime dateTime);

    /* renamed from: p1 */
    void mo34905p1(WireRide wireRide, WireBird wireBird, DateTime dateTime);

    void removeRoute();

    void zoomTo(Location location, Float f);
}
