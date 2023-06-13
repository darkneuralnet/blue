package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH'J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000f\u001a\u00020\u0006H&J,\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00170\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0014H&J2\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00170\u00162\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H&J<\u0010\u001e\u001a,\u0012(\u0012&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d0\b0\u00170\u001c0\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H&¨\u0006\u001f"}, m28432d2 = {"LFk1;", "", "Lco/bird/android/model/wire/WireRide;", "ride", "", "rating", "", "feedback", "", "issues", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "", "g", "taskId", "notes", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "e", "birdId", "Lco/bird/android/model/constant/MapMode;", "role", "Lio/reactivex/F;", "", "f", "", "locking", "h", "LHM4;", "", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fk1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC32874Fk1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Fk1$a */
    /* loaded from: classes2.dex */
    public static final class C2419a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23461c submitRideFeedback$default(InterfaceC32874Fk1 interfaceC32874Fk1, WireRide wireRide, float f, String str, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    list = CollectionsKt__CollectionsKt.emptyList();
                }
                return interfaceC32874Fk1.mo99886d(wireRide, f, str, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitRideFeedback");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void submitRideFeedbackAsync$default(InterfaceC32874Fk1 interfaceC32874Fk1, WireRide wireRide, float f, String str, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitRideFeedbackAsync");
            }
            if ((i & 8) != 0) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            interfaceC32874Fk1.mo99883g(wireRide, f, str, list);
        }
    }

    /* renamed from: c */
    AbstractC23442F<HM4<Map<String, List<Map<String, String>>>>> mo99887c(String str);

    @Deprecated(message = "Since all usages of this class don't care about the result yet block program execution, use submitRideFeedbackAsync instead.")
    /* renamed from: d */
    AbstractC23461c mo99886d(WireRide wireRide, float f, String str, List<String> list);

    /* renamed from: e */
    Observable<WireBird> mo99885e(String str, List<String> list, String str2);

    /* renamed from: f */
    AbstractC23442F<Map<String, String>> mo99884f(String str, MapMode mapMode);

    /* renamed from: g */
    void mo99883g(WireRide wireRide, float f, String str, List<String> list);

    /* renamed from: h */
    AbstractC23442F<Map<String, String>> mo99882h(String str, boolean z, MapMode mapMode);
}
