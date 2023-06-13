package p000;

import android.location.Location;
import co.bird.api.request.BluetoothTrackBody;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&JE\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"LkJ;", "Lbr4;", "", "serialNumber", "", "distance", "Lio/reactivex/Observable;", "Y", "imei", "bleMacAddress", "Lio/reactivex/F;", "q0", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;", RequestHeadersFactory.MODEL, "battery", "Landroid/location/Location;", "location", "Lco/bird/api/request/BluetoothTrackBody;", "p1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kJ */
/* loaded from: classes2.dex */
public interface InterfaceC25136kJ extends InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: kJ$a */
    /* loaded from: classes2.dex */
    public static final class C25137a {
        /* renamed from: a */
        public static InterfaceC23497i m29080a(InterfaceC25136kJ interfaceC25136kJ) {
            return InterfaceC38798br4.C13315a.m62290e(interfaceC25136kJ);
        }

        /* renamed from: b */
        public static <T> InterfaceC24575v<T, T> m29079b(InterfaceC25136kJ interfaceC25136kJ) {
            return InterfaceC38798br4.C13315a.m62288g(interfaceC25136kJ);
        }

        /* renamed from: c */
        public static <T> InterfaceC23435C<T, T> m29078c(InterfaceC25136kJ interfaceC25136kJ) {
            return InterfaceC38798br4.C13315a.m62286i(interfaceC25136kJ);
        }

        /* renamed from: d */
        public static <T> InterfaceC23448L<T, T> m29077d(InterfaceC25136kJ interfaceC25136kJ) {
            return InterfaceC38798br4.C13315a.m62284k(interfaceC25136kJ);
        }

        /* renamed from: e */
        public static <T> AbstractC23442F<T> m29076e(InterfaceC25136kJ interfaceC25136kJ, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62279p(interfaceC25136kJ, receiver);
        }

        public static /* synthetic */ AbstractC23442F getToken$default(InterfaceC25136kJ interfaceC25136kJ, String str, Integer num, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    num = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return interfaceC25136kJ.mo21381q0(str, num, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToken");
        }

        public static /* synthetic */ AbstractC23442F trackBird$default(InterfaceC25136kJ interfaceC25136kJ, String str, String str2, Integer num, Integer num2, Location location, int i, Object obj) {
            if (obj == null) {
                return interfaceC25136kJ.mo21382p1(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, location);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackBird");
        }
    }

    /* renamed from: Y */
    Observable<String> mo21390Y(String str, int i);

    /* renamed from: p1 */
    AbstractC23442F<BluetoothTrackBody> mo21382p1(String str, String str2, Integer num, Integer num2, Location location);

    /* renamed from: q0 */
    AbstractC23442F<String> mo21381q0(String str, Integer num, String str2, String str3);
}
