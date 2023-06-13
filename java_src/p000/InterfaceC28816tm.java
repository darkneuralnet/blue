package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.wire.configs.ParkingLocationVerificationMethod;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.ArCoreApk;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J_\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H&J\u007f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0083\u0001\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b \u0010!J4\u0010#\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004H&R \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006,"}, m28432d2 = {"Ltm;", "", "", "e", "", "resolveContext", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;", "method", "rideId", "birdId", "closestNestId", "", "insideNest", "Lorg/joda/time/DateTime;", "time", "skipBirdScan", "h", "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "j", "i", "stage", "Lco/bird/android/model/ParkingNest;", "parkingNest", "", "bestAccuracyMeters", "currentAccuracyMeters", "locationSource", "g", "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "failureReason", "finalAccuracyMeters", C17296a.f69688o, "(Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/ParkingNest;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "reason", "c", "LZ84;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$Availability;", "b", "()LZ84;", "arCoreAvailability", "f", "arCoreUnavailable", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tm */
/* loaded from: classes2.dex */
public interface InterfaceC28816tm {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tm$a */
    /* loaded from: classes2.dex */
    public static final class C28817a {
        public static /* synthetic */ void startArSession$default(InterfaceC28816tm interfaceC28816tm, ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3, Boolean bool, DateTime dateTime, Boolean bool2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startArSession");
            }
            interfaceC28816tm.mo8187h(parkingLocationVerificationMethod, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : dateTime, (i & 64) == 0 ? bool2 : null);
        }

        public static /* synthetic */ void trackEnteredStage$default(InterfaceC28816tm interfaceC28816tm, ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3, ParkingNest parkingNest, Boolean bool, Double d, Double d2, Boolean bool2, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEnteredStage");
            }
            interfaceC28816tm.mo8188g(parkingLocationVerificationMethod, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : parkingNest, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : str4);
        }

        public static /* synthetic */ void trackResolutionResult$default(InterfaceC28816tm interfaceC28816tm, ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, ParkingNest parkingNest, Boolean bool, String str3, Double d, Double d2, Boolean bool2, String str4, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackResolutionResult");
            }
            interfaceC28816tm.mo8194a(parkingLocationVerificationMethod, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : parkingNest, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : d2, (i & 256) != 0 ? null : bool2, (i & 512) == 0 ? str4 : null);
        }

        public static /* synthetic */ void trackUnavailable$default(InterfaceC28816tm interfaceC28816tm, ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackUnavailable");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC28816tm.mo8192c(parkingLocationVerificationMethod, str, str2, str3);
        }
    }

    /* renamed from: a */
    void mo8194a(ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, ParkingNest parkingNest, Boolean bool, String str3, Double d, Double d2, Boolean bool2, String str4);

    /* renamed from: b */
    Z84<Optional<ArCoreApk.Availability>> mo8193b();

    /* renamed from: c */
    void mo8192c(ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3);

    /* renamed from: d */
    void mo8191d(String str);

    /* renamed from: e */
    void mo8190e();

    /* renamed from: f */
    Z84<Boolean> mo8189f();

    /* renamed from: g */
    void mo8188g(ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3, ParkingNest parkingNest, Boolean bool, Double d, Double d2, Boolean bool2, String str4);

    /* renamed from: h */
    void mo8187h(ParkingLocationVerificationMethod parkingLocationVerificationMethod, String str, String str2, String str3, Boolean bool, DateTime dateTime, Boolean bool2);

    /* renamed from: i */
    void mo8186i(String str);

    /* renamed from: j */
    void mo8185j();
}
