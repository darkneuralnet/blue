package p000;

import android.location.Location;
import co.bird.android.model.BirdLocations;
import co.bird.android.model.BirdScan;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.InaccessibleReason;
import co.bird.android.model.InaccessibleReportSource;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LoggedRepair;
import co.bird.android.model.PropertyReportAction;
import co.bird.android.model.PropertyReportNextStep;
import co.bird.android.model.Route;
import co.bird.android.model.constant.AlarmCommand;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.MechanicalLockKind;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.BluetoothTrackBody;
import co.bird.api.response.BirdCodeWithStatus;
import co.bird.api.response.CannotAccessBirdReport;
import co.bird.api.response.CannotAccessReportResponse;
import co.bird.api.response.PropertyReport;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J9\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&J0\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00140\t2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H&J*\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H&J*\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u001eH&J\u0016\u0010\"\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H&J1\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b+\u0010,J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010.\u001a\u00020-H&J\u001e\u00103\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0018H&J\u001e\u00104\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u0007H&JD\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0&2\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020-2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020$2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&J\u0010\u0010@\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&J\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180&2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010B\u001a\u00020AH&J@\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0;0\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010D\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0002H&J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\u0006\u0010>\u001a\u00020\u0002H&J*\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00170;0\t2\u0006\u00106\u001a\u00020J2\u0006\u0010>\u001a\u00020\u0002H&JV\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0;0\t2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00172\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0;0\t2\u0006\u0010>\u001a\u00020\u0002H&J\u008f\u0001\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020`0;0\t2\u0006\u0010>\u001a\u00020\u00022\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00022\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00022\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00172\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\ba\u0010bJ\u001c\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0;0\t2\u0006\u0010>\u001a\u00020\u0002H&J\u001c\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00170\t2\u0006\u0010>\u001a\u00020\u0002H&J:\u0010l\u001a\b\u0012\u0004\u0012\u00020k0\t2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010f\u001a\u00020\u00022\u0006\u0010h\u001a\u00020g2\u0006\u0010j\u001a\u00020i2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010m\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020\u0002H&J\u001c\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0;0\t2\u0006\u0010>\u001a\u00020\u0002H&J\u0016\u0010p\u001a\u00020\u001e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H&J\u0012\u0010q\u001a\u0004\u0018\u00010\u00182\u0006\u0010\b\u001a\u00020\u0007H&J\u0018\u0010t\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010s\u001a\u00020rH&J\u0010\u0010u\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&J\u0010\u0010v\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&J\u0016\u0010x\u001a\b\u0012\u0004\u0012\u00020w0&2\u0006\u0010>\u001a\u00020\u0002H&J\u0010\u0010y\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&J\u0018\u0010{\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010z\u001a\u00020AH&J\u0018\u0010}\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010|\u001a\u00020$H&J\u0010\u0010~\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u0002H&R#\u0010\u0082\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R#\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001R#\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0081\u0001¨\u0006\u0087\u0001"}, m28432d2 = {"LaM;", "Lbr4;", "", "serialNumber", "", "battery", "distance", "Landroid/location/Location;", "location", "Lio/reactivex/F;", "Lco/bird/api/request/BluetoothTrackBody;", "U0", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;", "", "radius", "Lio/reactivex/c;", "J0", "center", "", "cellIds", "", "P0", "birdIds", "", "Lco/bird/android/model/wire/WireBird;", "V0", "feedUrl", "centerIds", "partnerId", "Z0", "", "B0", "C0", "eligibleBirds", "H0", "bird", "", "alarm", "Lio/reactivex/Observable;", "D0", "Lco/bird/android/model/constant/AlarmCommand;", "command", "durationSeconds", "e1", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/AlarmCommand;Ljava/lang/Integer;)Lio/reactivex/Observable;", "Lco/bird/android/model/constant/MapMode;", "mapMode", "N0", "from", "to", "Lco/bird/android/model/Route;", "X0", "I0", PaymentMethodOptionsParams.Blik.PARAM_CODE, "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "isCameraScan", "rawQrCode", "LHM4;", "Lco/bird/android/model/BirdScan;", "W0", "birdId", "m1", "d1", "LbE5;", "sleepStarted", "O0", "imei", "beaconHash", "proximityUUID", "Lco/bird/api/response/BirdCodeWithStatus;", "f1", "M0", "Lco/bird/android/model/constant/ScanMode;", "Lco/bird/android/model/LegacyRepairType;", "L0", "userId", "Lco/bird/android/model/LoggedRepair;", "repairs", "comment", "role", "warehouseId", "Q0", "Lco/bird/android/model/BirdSummaryBody;", "o", "bountyId", "Lco/bird/android/model/InaccessibleReason;", "reason", "Lco/bird/android/model/InaccessibleReportSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "nearbyIdentifiers", "notes", "photoUrls", "birdCount", "scanTimeInSeconds", "Lco/bird/api/response/CannotAccessBirdReport;", "a1", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/InaccessibleReason;Lco/bird/android/model/InaccessibleReportSource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/api/response/CannotAccessReportResponse;", "l", "k", "cannotAccessReportId", "Lco/bird/android/model/PropertyReportAction;", "action", "Lco/bird/android/model/PropertyReportNextStep;", "nextStep", "Lco/bird/api/response/PropertyReport;", "K0", "S0", "Lco/bird/android/model/BirdLocations;", "c1", "T0", "y0", "Lco/bird/android/model/constant/MechanicalLockKind;", "lockKind", "E0", "Y0", "x0", "Lco/bird/android/model/persistence/Bird;", C17296a.f69688o, "F0", "event", "z0", "lock", "j", "G0", "LZ84;", "A0", "()LZ84;", "badBirdIds", "b1", "latestApiOnlyNearbyBirds", "R0", "latestNearbyBirds", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aM */
/* loaded from: classes2.dex */
public interface InterfaceC10636aM extends InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aM$a */
    /* loaded from: classes2.dex */
    public static final class C10637a {
        /* renamed from: a */
        public static InterfaceC23497i m71567a(InterfaceC10636aM interfaceC10636aM) {
            return InterfaceC38798br4.C13315a.m62290e(interfaceC10636aM);
        }

        public static /* synthetic */ Observable alarm$default(InterfaceC10636aM interfaceC10636aM, WireBird wireBird, AlarmCommand alarmCommand, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    num = null;
                }
                return interfaceC10636aM.mo71577e1(wireBird, alarmCommand, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alarm");
        }

        /* renamed from: b */
        public static <T> InterfaceC24575v<T, T> m71566b(InterfaceC10636aM interfaceC10636aM) {
            return InterfaceC38798br4.C13315a.m62288g(interfaceC10636aM);
        }

        /* renamed from: c */
        public static <T> InterfaceC23435C<T, T> m71565c(InterfaceC10636aM interfaceC10636aM) {
            return InterfaceC38798br4.C13315a.m62286i(interfaceC10636aM);
        }

        /* renamed from: d */
        public static <T> InterfaceC23448L<T, T> m71564d(InterfaceC10636aM interfaceC10636aM) {
            return InterfaceC38798br4.C13315a.m62284k(interfaceC10636aM);
        }

        /* renamed from: e */
        public static <T> Observable<T> m71563e(InterfaceC10636aM interfaceC10636aM, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62280o(interfaceC10636aM, receiver);
        }

        /* renamed from: f */
        public static <T> AbstractC23442F<T> m71562f(InterfaceC10636aM interfaceC10636aM, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62279p(interfaceC10636aM, receiver);
        }

        public static /* synthetic */ AbstractC23442F getBirdsBySerialNumber$default(InterfaceC10636aM interfaceC10636aM, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    str4 = null;
                }
                return interfaceC10636aM.mo71576f1(str, str2, str3, str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBirdsBySerialNumber");
        }

        public static /* synthetic */ AbstractC23461c reloadZigZagsNearBy$default(InterfaceC10636aM interfaceC10636aM, String str, List list, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                return interfaceC10636aM.mo71583Z0(str, list, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reloadZigZagsNearBy");
        }

        public static /* synthetic */ Observable scanBird$default(InterfaceC10636aM interfaceC10636aM, String str, MapMode mapMode, ScanIntention scanIntention, boolean z, String str2, int i, Object obj) {
            if (obj == null) {
                return interfaceC10636aM.mo71586W0(str, mapMode, (i & 4) != 0 ? null : scanIntention, z, (i & 16) != 0 ? null : str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scanBird");
        }

        public static /* synthetic */ AbstractC23442F submitCannotAccessReport$default(InterfaceC10636aM interfaceC10636aM, String str, String str2, InaccessibleReason inaccessibleReason, InaccessibleReportSource inaccessibleReportSource, String str3, List list, String str4, List list2, String str5, Integer num, int i, Object obj) {
            if (obj == null) {
                return interfaceC10636aM.mo71581a1(str, (i & 2) != 0 ? null : str2, inaccessibleReason, inaccessibleReportSource, (i & 16) != 0 ? null : str3, list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitCannotAccessReport");
        }

        public static /* synthetic */ AbstractC23442F submitLoggedRepairs$default(InterfaceC10636aM interfaceC10636aM, String str, String str2, List list, String str3, ScanMode scanMode, String str4, int i, Object obj) {
            if (obj == null) {
                return interfaceC10636aM.mo71592Q0(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : scanMode, (i & 32) != 0 ? null : str4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitLoggedRepairs");
        }

        public static /* synthetic */ AbstractC23442F submitPropertyReport$default(InterfaceC10636aM interfaceC10636aM, String str, String str2, PropertyReportAction propertyReportAction, PropertyReportNextStep propertyReportNextStep, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    str3 = null;
                }
                return interfaceC10636aM.mo71598K0(str, str2, propertyReportAction, propertyReportNextStep, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitPropertyReport");
        }
    }

    /* renamed from: A0 */
    Z84<Set<String>> mo71608A0();

    /* renamed from: B0 */
    void mo71607B0();

    /* renamed from: C0 */
    void mo71606C0();

    /* renamed from: D0 */
    Observable<WireBird> mo71605D0(WireBird wireBird, boolean z);

    /* renamed from: E0 */
    AbstractC23461c mo71604E0(String str, MechanicalLockKind mechanicalLockKind);

    /* renamed from: F0 */
    AbstractC23461c mo71603F0(String str);

    /* renamed from: G0 */
    AbstractC23461c mo71602G0(String str);

    /* renamed from: H0 */
    void mo71601H0(List<WireBird> list);

    /* renamed from: I0 */
    Observable<Route> mo71600I0(Location location, Location location2);

    /* renamed from: J0 */
    AbstractC23461c mo71599J0(Location location, double d);

    /* renamed from: K0 */
    AbstractC23442F<PropertyReport> mo71598K0(String str, String str2, PropertyReportAction propertyReportAction, PropertyReportNextStep propertyReportNextStep, String str3);

    /* renamed from: L0 */
    AbstractC23442F<HM4<List<LegacyRepairType>>> mo71597L0(ScanMode scanMode, String str);

    /* renamed from: M0 */
    AbstractC23442F<WireBird> mo71596M0(String str);

    /* renamed from: N0 */
    Observable<WireBird> mo71595N0(WireBird wireBird, MapMode mapMode);

    /* renamed from: O0 */
    Observable<WireBird> mo71594O0(WireBird wireBird, C38431bE5 c38431bE5);

    /* renamed from: P0 */
    AbstractC23442F<Map<String, Integer>> mo71593P0(Location location, Set<String> set);

    /* renamed from: Q0 */
    AbstractC23442F<HM4<Unit>> mo71592Q0(String str, String str2, List<LoggedRepair> list, String str3, ScanMode scanMode, String str4);

    /* renamed from: R0 */
    Z84<List<WireBird>> mo71591R0();

    /* renamed from: S0 */
    void mo71590S0(String str);

    /* renamed from: T0 */
    void mo71589T0(Set<String> set);

    /* renamed from: U0 */
    AbstractC23442F<BluetoothTrackBody> mo71588U0(String str, Integer num, Integer num2, Location location);

    /* renamed from: V0 */
    AbstractC23442F<List<WireBird>> mo71587V0(Set<String> set, Location location);

    /* renamed from: W0 */
    Observable<HM4<BirdScan>> mo71586W0(String str, MapMode mapMode, ScanIntention scanIntention, boolean z, String str2);

    /* renamed from: X0 */
    Observable<Route> mo71585X0(Location location, WireBird wireBird);

    /* renamed from: Y0 */
    AbstractC23461c mo71584Y0(String str);

    /* renamed from: Z0 */
    AbstractC23461c mo71583Z0(String str, List<Integer> list, String str2);

    /* renamed from: a */
    Observable<Bird> mo71582a(String str);

    /* renamed from: a1 */
    AbstractC23442F<HM4<CannotAccessBirdReport>> mo71581a1(String str, String str2, InaccessibleReason inaccessibleReason, InaccessibleReportSource inaccessibleReportSource, String str3, List<String> list, String str4, List<String> list2, String str5, Integer num);

    /* renamed from: b1 */
    Z84<List<WireBird>> mo71580b1();

    /* renamed from: c1 */
    AbstractC23442F<HM4<BirdLocations>> mo71579c1(String str);

    /* renamed from: d1 */
    AbstractC23461c mo71578d1(String str);

    /* renamed from: e1 */
    Observable<WireBird> mo71577e1(WireBird wireBird, AlarmCommand alarmCommand, Integer num);

    /* renamed from: f1 */
    AbstractC23442F<HM4<BirdCodeWithStatus>> mo71576f1(String str, String str2, String str3, String str4);

    /* renamed from: j */
    AbstractC23461c mo71575j(String str, boolean z);

    /* renamed from: k */
    AbstractC23442F<List<CannotAccessReportResponse>> mo71574k(String str);

    /* renamed from: l */
    AbstractC23442F<HM4<CannotAccessReportResponse>> mo71573l(String str);

    /* renamed from: m1 */
    AbstractC23461c mo71572m1(String str);

    /* renamed from: o */
    AbstractC23442F<HM4<BirdSummaryBody>> mo71571o(String str);

    /* renamed from: x0 */
    AbstractC23461c mo71570x0(String str);

    /* renamed from: y0 */
    WireBird mo71569y0(Location location);

    /* renamed from: z0 */
    AbstractC23461c mo71568z0(String str, C38431bE5 c38431bE5);
}
