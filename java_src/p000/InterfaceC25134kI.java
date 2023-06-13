package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import p000.C37113Xn1;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\fH&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\u001e\u001a\u00020\nH&J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006 "}, m28432d2 = {"LkI;", "", "Lco/bird/android/model/VehicleDescriptor;", "vehicleDescriptor", "LXn1$a;", "i", "Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "Lio/reactivex/c;", "e", "Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "n", "", "c", "k", "", "h", "LWn1;", "g", "b", "", MessageExtension.FIELD_DATA, "", "f", "", "passcode", "j", "m", "l", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kI */
/* loaded from: classes2.dex */
public interface InterfaceC25134kI {
    /* renamed from: b */
    AbstractC23461c mo29102b(VehicleDescriptor vehicleDescriptor);

    /* renamed from: c */
    Observable<Boolean> mo29101c(VehicleDescriptor vehicleDescriptor);

    /* renamed from: d */
    Observable<VehicleDescriptor> mo29100d();

    /* renamed from: e */
    AbstractC23461c mo29099e(Bird bird, VehicleVersion vehicleVersion);

    /* renamed from: f */
    void mo29098f(byte[] bArr);

    /* renamed from: g */
    C36879Wn1 mo29097g(Bird bird, VehicleVersion vehicleVersion);

    /* renamed from: h */
    Observable<Float> mo29096h(VehicleDescriptor vehicleDescriptor);

    /* renamed from: i */
    C37113Xn1.EnumC9493a mo29095i(VehicleDescriptor vehicleDescriptor);

    /* renamed from: j */
    AbstractC23461c mo29094j(VehicleDescriptor vehicleDescriptor, String str);

    /* renamed from: k */
    Observable<Boolean> mo29093k(VehicleDescriptor vehicleDescriptor);

    /* renamed from: l */
    boolean mo29092l(VehicleVersion vehicleVersion);

    /* renamed from: m */
    AbstractC23461c mo29091m();

    /* renamed from: n */
    Observable<C37113Xn1.EnumC9493a> mo29090n();
}
