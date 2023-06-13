package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideRequirement;
import co.bird.android.model.constant.RideRequirementReason;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC24507p;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m28432d2 = {"LJ35;", "", "Lio/reactivex/p;", "Lco/bird/android/model/RideRequirement;", "i", "LJ35$a;", "rideRequirementContext", "", "f", "rideRequirement", "j", "b", C17296a.f69688o, "k", "Lco/bird/android/model/wire/WireBird;", "bird", "c", "Lco/bird/android/model/wire/WireRide;", "ride", "h", "", "getSoberStartBirdId", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "soberStartBirdId", "", "getLocalSurveyShownForRideCountNumber", "()Ljava/lang/Integer;", "e", "(Ljava/lang/Integer;)V", "localSurveyShownForRideCountNumber", "g", "()LJ35$a;", "rideRequirementRequestContext", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: J35 */
/* loaded from: classes2.dex */
public interface J35 {
    /* renamed from: a */
    void mo101239a();

    /* renamed from: b */
    void mo101238b();

    /* renamed from: c */
    void mo101237c(WireBird wireBird);

    /* renamed from: d */
    void mo101236d(String str);

    /* renamed from: e */
    void mo101235e(Integer num);

    /* renamed from: f */
    void mo101234f(C3879a c3879a);

    /* renamed from: g */
    C3879a mo101233g();

    /* renamed from: h */
    void mo101232h(WireRide wireRide);

    /* renamed from: i */
    AbstractC24507p<RideRequirement> mo101231i();

    /* renamed from: j */
    AbstractC24507p<RideRequirement> mo101230j(RideRequirement rideRequirement);

    /* renamed from: k */
    void mo101229k();

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002JI\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006#"}, m28432d2 = {"LJ35$a;", "", "", "h", "Lco/bird/android/model/constant/RideRequirementReason;", "rideRequirementReason", "Lco/bird/android/model/wire/WireBird;", "bird", "userGuestId", "", "skipPastGooglePayRequirement", "skipBarcodeScanRequirement", "sessionId", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/constant/RideRequirementReason;", "c", "()Lco/bird/android/model/constant/RideRequirementReason;", "b", "Lco/bird/android/model/wire/WireBird;", "()Lco/bird/android/model/wire/WireBird;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Z", "f", "()Z", "e", "<init>", "(Lco/bird/android/model/constant/RideRequirementReason;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ZZLjava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J35$a */
    /* loaded from: classes2.dex */
    public static final class C3879a {

        /* renamed from: a */
        public final RideRequirementReason f16735a;

        /* renamed from: b */
        public final WireBird f16736b;

        /* renamed from: c */
        public final String f16737c;

        /* renamed from: d */
        public final boolean f16738d;

        /* renamed from: e */
        public final boolean f16739e;

        /* renamed from: f */
        public final String f16740f;

        public C3879a(RideRequirementReason rideRequirementReason, WireBird wireBird, String str, boolean z, boolean z2, String sessionId) {
            Intrinsics.checkNotNullParameter(rideRequirementReason, "rideRequirementReason");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f16735a = rideRequirementReason;
            this.f16736b = wireBird;
            this.f16737c = str;
            this.f16738d = z;
            this.f16739e = z2;
            this.f16740f = sessionId;
        }

        public static /* synthetic */ C3879a copy$default(C3879a c3879a, RideRequirementReason rideRequirementReason, WireBird wireBird, String str, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                rideRequirementReason = c3879a.f16735a;
            }
            if ((i & 2) != 0) {
                wireBird = c3879a.f16736b;
            }
            WireBird wireBird2 = wireBird;
            if ((i & 4) != 0) {
                str = c3879a.f16737c;
            }
            String str3 = str;
            if ((i & 8) != 0) {
                z = c3879a.f16738d;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = c3879a.f16739e;
            }
            boolean z4 = z2;
            if ((i & 32) != 0) {
                str2 = c3879a.f16740f;
            }
            return c3879a.m101228a(rideRequirementReason, wireBird2, str3, z3, z4, str2);
        }

        /* renamed from: a */
        public final C3879a m101228a(RideRequirementReason rideRequirementReason, WireBird wireBird, String str, boolean z, boolean z2, String sessionId) {
            Intrinsics.checkNotNullParameter(rideRequirementReason, "rideRequirementReason");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new C3879a(rideRequirementReason, wireBird, str, z, z2, sessionId);
        }

        /* renamed from: b */
        public final WireBird m101227b() {
            return this.f16736b;
        }

        /* renamed from: c */
        public final RideRequirementReason m101226c() {
            return this.f16735a;
        }

        /* renamed from: d */
        public final String m101225d() {
            return this.f16740f;
        }

        /* renamed from: e */
        public final boolean m101224e() {
            return this.f16739e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3879a) {
                C3879a c3879a = (C3879a) obj;
                return this.f16735a == c3879a.f16735a && Intrinsics.areEqual(this.f16736b, c3879a.f16736b) && Intrinsics.areEqual(this.f16737c, c3879a.f16737c) && this.f16738d == c3879a.f16738d && this.f16739e == c3879a.f16739e && Intrinsics.areEqual(this.f16740f, c3879a.f16740f);
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m101223f() {
            return this.f16738d;
        }

        /* renamed from: g */
        public final String m101222g() {
            return this.f16737c;
        }

        /* renamed from: h */
        public final String m101221h() {
            String str;
            RideRequirementReason rideRequirementReason = this.f16735a;
            WireBird wireBird = this.f16736b;
            String str2 = null;
            if (wireBird != null) {
                str = wireBird.getId();
            } else {
                str = null;
            }
            WireBird wireBird2 = this.f16736b;
            if (wireBird2 != null) {
                str2 = wireBird2.getCode();
            }
            return "RideRequirementRequestContext(rideRequirementReason=" + rideRequirementReason + ", bird=(id=" + str + ", code=" + str2 + "), userGuestId=" + this.f16737c + ", skipPastGooglePayRequirement=" + this.f16738d + ", skipBarcodeScanRequirement=" + this.f16739e + ")\"";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f16735a.hashCode() * 31;
            WireBird wireBird = this.f16736b;
            int hashCode2 = (hashCode + (wireBird == null ? 0 : wireBird.hashCode())) * 31;
            String str = this.f16737c;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.f16738d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z2 = this.f16739e;
            return ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f16740f.hashCode();
        }

        public String toString() {
            RideRequirementReason rideRequirementReason = this.f16735a;
            WireBird wireBird = this.f16736b;
            String str = this.f16737c;
            boolean z = this.f16738d;
            boolean z2 = this.f16739e;
            String str2 = this.f16740f;
            return "RideRequirementRequestContext(rideRequirementReason=" + rideRequirementReason + ", bird=" + wireBird + ", userGuestId=" + str + ", skipPastGooglePayRequirement=" + z + ", skipBarcodeScanRequirement=" + z2 + ", sessionId=" + str2 + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ C3879a(RideRequirementReason rideRequirementReason, WireBird wireBird, String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rideRequirementReason, r0, r1, r2, r3, r4);
            String str3;
            WireBird wireBird2 = (i & 2) != 0 ? null : wireBird;
            String str4 = (i & 4) == 0 ? str : null;
            boolean z3 = (i & 8) != 0 ? false : z;
            boolean z4 = (i & 16) == 0 ? z2 : false;
            if ((i & 32) != 0) {
                str3 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str3, "randomUUID().toString()");
            } else {
                str3 = str2;
            }
        }
    }
}
