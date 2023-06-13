package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireUserGuest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m28432d2 = {"LWg6;", "", "", "email", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireUserGuest;", "e", "userGuestId", "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "LZ84;", "", "b", "()LZ84;", "activeUserGuests", "c", "()Lco/bird/android/model/wire/WireUserGuest;", "nextUserGuestAvailableForStartingRide", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wg6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC36821Wg6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Wg6$a */
    /* loaded from: classes2.dex */
    public static final class C9147a {
        public static /* synthetic */ AbstractC23442F createUserGuest$default(InterfaceC36821Wg6 interfaceC36821Wg6, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return interfaceC36821Wg6.mo64134e(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createUserGuest");
        }
    }

    /* renamed from: a */
    void mo64138a(String str);

    /* renamed from: b */
    Z84<List<WireUserGuest>> mo64137b();

    /* renamed from: c */
    WireUserGuest mo64136c();

    /* renamed from: d */
    void mo64135d(String str, String str2);

    /* renamed from: e */
    AbstractC23442F<WireUserGuest> mo64134e(String str);
}
