package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BluetoothEncryptionPermissionStatus;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.WireBird;
import co.bird.api.response.WireBirdActionPairResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015H&J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001b\u001a\u00020\u0002H&J2\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0 0\u00062\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150#0\"H&J\u0010\u0010%\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00062\u0006\u0010&\u001a\u00020\u0004H&R&\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0*0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00102\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010,R\u0014\u00106\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070#0)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010,¨\u00069"}, m28432d2 = {"Lq54;", "", "Lio/reactivex/c;", "refresh", "", "birdId", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "r", "", "Lco/bird/android/model/constant/PartKind;", "parts", "Lco/bird/api/response/WireBirdActionPairResponse;", "m", DateTokenConverter.CONVERTER_KEY, "", "l", "f", "LTk5;", "scanResult", "birdModel", "Lco/bird/android/model/persistence/Bird;", "k", "bird", "g", "wireBird", "j", "h", "Lco/bird/android/model/persistence/VehicleVersion;", "vehicleVersion", "", MessageExtension.FIELD_DATA, "Lkotlin/Pair;", "n", "Lio/reactivex/k;", "", "r0", "e", "macAddress", "Lco/bird/android/model/BluetoothEncryptionPermissionStatus;", "b", "LZ84;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "()LZ84;", "privateBirds", "i", "ownedBirds", "o", "()Z", "ownsBirds", "c", "rentedBirds", "q", "rentsBirds", "p", "smartLockUnlockableBirds", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: q54  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC47256q54 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q54$a */
    /* loaded from: classes2.dex */
    public static final class C27488a {
        public static /* synthetic */ Bird convertScanResultToPrivateBird$default(InterfaceC47256q54 interfaceC47256q54, C36154Tk5 c36154Tk5, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = Bird_Kt.MODEL_BIRD_AIR;
                }
                return interfaceC47256q54.mo18203k(c36154Tk5, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertScanResultToPrivateBird");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC23442F pair$default(InterfaceC47256q54 interfaceC47256q54, String str, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    map = null;
                }
                return interfaceC47256q54.mo18201m(str, map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pair");
        }
    }

    /* renamed from: a */
    Z84<Optional<List<WireBird>>> mo18213a();

    /* renamed from: b */
    AbstractC23442F<BluetoothEncryptionPermissionStatus> mo18212b(String str);

    /* renamed from: c */
    Z84<List<WireBird>> mo18211c();

    /* renamed from: d */
    AbstractC23461c mo18210d(String str);

    /* renamed from: e */
    AbstractC23461c mo18209e(Bird bird);

    /* renamed from: f */
    AbstractC23442F<Boolean> mo18208f(String str);

    /* renamed from: g */
    WireBird mo18207g(Bird bird);

    /* renamed from: h */
    AbstractC23461c mo18206h();

    /* renamed from: i */
    Z84<List<WireBird>> mo18205i();

    /* renamed from: j */
    Bird mo18204j(WireBird wireBird);

    /* renamed from: k */
    Bird mo18203k(C36154Tk5 c36154Tk5, String str);

    /* renamed from: l */
    boolean mo18202l(String str);

    /* renamed from: m */
    AbstractC23442F<WireBirdActionPairResponse> mo18201m(String str, Map<PartKind, String> map);

    /* renamed from: n */
    AbstractC23442F<Pair<Bird, VehicleVersion>> mo18200n(Bird bird, VehicleVersion vehicleVersion, byte[] bArr);

    /* renamed from: o */
    boolean mo18199o();

    /* renamed from: p */
    Z84<List<WireBird>> mo18198p();

    /* renamed from: q */
    boolean mo18197q();

    /* renamed from: r */
    AbstractC23442F<WireBird> mo18196r(String str);

    /* renamed from: r0 */
    AbstractC24490k<List<Bird>> mo18195r0();

    AbstractC23461c refresh();
}
