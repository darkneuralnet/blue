package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.constant.VehicleSpeedMode;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0013H&J\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\nH&J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H&J\u0010\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H&J\u0018\u00106\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&J&\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u000207H&J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130;2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0013H&J\u0018\u0010>\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0013H&¨\u0006?"}, m28432d2 = {"Lrd5;", "", "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "Lio/reactivex/Observable;", "Lco/bird/android/model/VehicleConnection;", DateTokenConverter.CONVERTER_KEY, "", "c", "descriptor", "", "enabled", "LKY;", "bluetoothWakeStarted", "LbE5;", "sleepStarted", "Lio/reactivex/c;", "h", "l", "", "token", "", "p", "v", "u", "o", "g", "t", "b", "command", "m", "", "passcode", "x", "lightsOn", "r", "q", "z", "e", "w", "y", "k", "", "scanTime", "Ljava/util/concurrent/TimeUnit;", "scanTimeUnit", "Lio/reactivex/k;", "LTk5;", C17296a.f69688o, "", "minRssi", "i", "Lco/bird/android/model/constant/VehicleSpeedMode;", "speedMode", "n", "Lfd3;", "mode", "j", MessageExtension.FIELD_DATA, "Lio/reactivex/F;", "s", "byteArray", "f", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rd5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48164rd5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rd5$a */
    /* loaded from: classes2.dex */
    public static final class C27958a {
        public static /* synthetic */ AbstractC23461c deepSleep$default(InterfaceC48164rd5 interfaceC48164rd5, VehicleDescriptor vehicleDescriptor, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    c4464ky = null;
                }
                if ((i & 8) != 0) {
                    c38431bE5 = null;
                }
                return interfaceC48164rd5.mo15678h(vehicleDescriptor, z, c4464ky, c38431bE5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deepSleep");
        }

        public static /* synthetic */ Observable subscribeBleNotifications$default(InterfaceC48164rd5 interfaceC48164rd5, VehicleDescriptor vehicleDescriptor, EnumC41046fd3 enumC41046fd3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    enumC41046fd3 = EnumC41046fd3.DEFAULT;
                }
                return interfaceC48164rd5.mo15676j(vehicleDescriptor, enumC41046fd3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeBleNotifications");
        }
    }

    /* renamed from: a */
    AbstractC24490k<C36154Tk5> mo15685a(long j, TimeUnit timeUnit);

    /* renamed from: b */
    AbstractC23461c mo15684b(VehicleDescriptor vehicleDescriptor);

    /* renamed from: c */
    List<VehicleConnection> mo15683c();

    /* renamed from: d */
    Observable<VehicleConnection> mo15682d(VehicleDescriptor vehicleDescriptor);

    /* renamed from: e */
    AbstractC23461c mo15681e(VehicleDescriptor vehicleDescriptor);

    /* renamed from: f */
    AbstractC23461c mo15680f(VehicleDescriptor vehicleDescriptor, byte[] bArr);

    /* renamed from: g */
    AbstractC23461c mo15679g(VehicleDescriptor vehicleDescriptor);

    /* renamed from: h */
    AbstractC23461c mo15678h(VehicleDescriptor vehicleDescriptor, boolean z, C4464KY c4464ky, C38431bE5 c38431bE5);

    /* renamed from: i */
    AbstractC23461c mo15677i(int i);

    /* renamed from: j */
    Observable<Observable<byte[]>> mo15676j(VehicleDescriptor vehicleDescriptor, EnumC41046fd3 enumC41046fd3);

    /* renamed from: k */
    AbstractC23461c mo15675k(VehicleDescriptor vehicleDescriptor);

    /* renamed from: l */
    AbstractC23461c mo15674l(VehicleDescriptor vehicleDescriptor);

    /* renamed from: m */
    AbstractC23461c mo15673m(VehicleDescriptor vehicleDescriptor, byte[] bArr);

    /* renamed from: n */
    AbstractC23461c mo15672n(VehicleDescriptor vehicleDescriptor, VehicleSpeedMode vehicleSpeedMode);

    /* renamed from: o */
    AbstractC23461c mo15671o(VehicleDescriptor vehicleDescriptor);

    /* renamed from: p */
    void mo15670p(VehicleDescriptor vehicleDescriptor, byte[] bArr);

    /* renamed from: q */
    AbstractC23461c mo15669q(VehicleDescriptor vehicleDescriptor);

    /* renamed from: r */
    AbstractC23461c mo15668r(VehicleDescriptor vehicleDescriptor, boolean z);

    /* renamed from: s */
    AbstractC23442F<byte[]> mo15667s(VehicleDescriptor vehicleDescriptor, byte[] bArr);

    /* renamed from: t */
    AbstractC23461c mo15666t(VehicleDescriptor vehicleDescriptor);

    /* renamed from: u */
    AbstractC23461c mo15665u(VehicleDescriptor vehicleDescriptor);

    /* renamed from: v */
    AbstractC23461c mo15664v(VehicleDescriptor vehicleDescriptor);

    /* renamed from: w */
    AbstractC23461c mo15663w(VehicleDescriptor vehicleDescriptor);

    /* renamed from: x */
    AbstractC23461c mo15662x(VehicleDescriptor vehicleDescriptor, String str);

    /* renamed from: y */
    AbstractC23461c mo15661y(VehicleDescriptor vehicleDescriptor);

    /* renamed from: z */
    AbstractC23461c mo15660z(VehicleDescriptor vehicleDescriptor);
}
