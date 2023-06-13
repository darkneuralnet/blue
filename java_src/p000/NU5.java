package p000;

import co.bird.android.buava.Optional;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0003H&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H&¨\u0006\u0012"}, m28432d2 = {"LNU5;", "Lrx4;", "LOU5;", "Lio/reactivex/Observable;", "", "myLocationClicks", "Lcom/google/android/gms/maps/model/LatLng;", "C2", "F8", "b7", "f", "Lco/bird/android/buava/Optional;", "", "W0", "z", "", "h4", "W4", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NU5 */
/* loaded from: classes3.dex */
public interface NU5 extends InterfaceC48362rx4<OU5> {
    /* renamed from: C2 */
    Observable<LatLng> mo56644C2();

    /* renamed from: F8 */
    Observable<Unit> mo56639F8();

    /* renamed from: W0 */
    Observable<Optional<String>> mo56618W0();

    /* renamed from: W4 */
    Observable<String> mo56617W4();

    /* renamed from: b7 */
    Observable<Unit> mo56608b7();

    /* renamed from: f */
    Observable<Unit> mo56606f();

    /* renamed from: h4 */
    Observable<Integer> mo56601h4();

    Observable<Unit> myLocationClicks();

    /* renamed from: z */
    Observable<Optional<String>> mo56577z();
}
