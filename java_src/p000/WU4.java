package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.RidePassView;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\b\u001a\u00020\u0007H&R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LWU4;", "", "Lio/reactivex/Observable;", "", "enabled", "Lio/reactivex/c;", "refresh", "", "linkCode", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/RidePassView;", "G0", "y0", "ridePass", DateTokenConverter.CONVERTER_KEY, "userSubscriptionId", "C0", "O", "LZ84;", "", "E0", "()LZ84;", "ridePasses", "F0", "activeRidePasses", "D0", "ineligibleRidePasses", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WU4 */
/* loaded from: classes2.dex */
public interface WU4 {
    /* renamed from: C0 */
    AbstractC23461c mo55505C0(String str);

    /* renamed from: D0 */
    Z84<List<RidePassView>> mo55504D0();

    /* renamed from: E0 */
    Z84<List<RidePassView>> mo55503E0();

    /* renamed from: F0 */
    Z84<List<RidePassView>> mo55502F0();

    /* renamed from: G0 */
    AbstractC23442F<RidePassView> mo55501G0(String str);

    /* renamed from: O */
    Observable<RidePassView> mo55500O(String str);

    /* renamed from: d */
    AbstractC23461c mo55497d(RidePassView ridePassView);

    Observable<Boolean> enabled();

    AbstractC23461c refresh();

    /* renamed from: y0 */
    AbstractC23461c mo55485y0(String str);
}
