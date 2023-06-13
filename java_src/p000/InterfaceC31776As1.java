package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"LAs1;", "", "", "onResume", "", "birdId", "", "refresh", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "f", C17296a.f69688o, "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: As1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC31776As1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: As1$a */
    /* loaded from: classes3.dex */
    public static final class C0293a {
        public static /* synthetic */ AbstractC23461c populateFlightSheet$default(InterfaceC31776As1 interfaceC31776As1, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC31776As1.mo23174d(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: populateFlightSheet");
        }
    }

    /* renamed from: a */
    Observable<Unit> mo23177a();

    /* renamed from: d */
    AbstractC23461c mo23174d(String str, boolean z);

    /* renamed from: f */
    Observable<WireBird> mo23172f();

    void onResume();
}
