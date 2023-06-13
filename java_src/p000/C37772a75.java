package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Reservation;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import co.bird.android.model.RideStatesKt;
import co.bird.android.model.RideUpdateState;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u0000 \u00032\u00020\u0001:\u0001\u0012BM\b\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002JY\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001d\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b!\u0010.¨\u00061"}, m28432d2 = {"La75;", "LZ65;", "", "h", "", "Lco/bird/android/model/RideState;", "rideStates", "selectedRideState", "Lco/bird/android/model/Reservation;", "reservation", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/RideUpdateState;", "rideUpdateState", "LFH3;", "parkingStatus", "Lco/bird/android/model/wire/configs/Config;", "config", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lco/bird/android/model/RideState;", "g", "()Lco/bird/android/model/RideState;", "c", "Lco/bird/android/model/Reservation;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/Reservation;", "Lco/bird/android/model/wire/WireBird;", "()Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/RideUpdateState;", "f", "()Lco/bird/android/model/RideUpdateState;", "LFH3;", "getParkingStatus", "()LFH3;", "Lco/bird/android/model/wire/configs/Config;", "()Lco/bird/android/model/wire/configs/Config;", "<init>", "(Ljava/util/List;Lco/bird/android/model/RideState;Lco/bird/android/model/Reservation;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/RideUpdateState;LFH3;Lco/bird/android/model/wire/configs/Config;)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusModel.kt\nco/bird/android/feature/rider/bottomsheets/model/RideStatusModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n288#2,2:72\n*S KotlinDebug\n*F\n+ 1 RideStatusModel.kt\nco/bird/android/feature/rider/bottomsheets/model/RideStatusModel\n*L\n15#1:72,2\n*E\n"})
/* renamed from: a75  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37772a75 implements Z65 {

    /* renamed from: h */
    public static final C10573a f49850h = new C10573a(null);

    /* renamed from: a */
    public final List<RideState> f49851a;

    /* renamed from: b */
    public final RideState f49852b;

    /* renamed from: c */
    public final Reservation f49853c;

    /* renamed from: d */
    public final WireBird f49854d;

    /* renamed from: e */
    public final RideUpdateState f49855e;

    /* renamed from: f */
    public final FH3 f49856f;

    /* renamed from: g */
    public final Config f49857g;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002JA\u0010\u0012\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002J9\u0010\u0013\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002J)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¨\u0006\u0017"}, m28432d2 = {"La75$a;", "", "Lco/bird/android/model/Reservation;", "reservation", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/RideUpdateState;", "rideUpdateState", "LFH3;", "parkingStatus", "Lco/bird/android/model/wire/configs/Config;", "config", "La75;", C17296a.f69688o, "", "Lco/bird/android/model/RideState;", "rideStates", "selectedRideState", "c", DateTokenConverter.CONVERTER_KEY, "b", "<init>", "()V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: a75$a */
    /* loaded from: classes3.dex */
    public static final class C10573a {
        public /* synthetic */ C10573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C37772a75 invoke$default(C10573a c10573a, Reservation reservation, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config, int i, Object obj) {
            if ((i & 2) != 0) {
                wireBird = reservation.getBird();
            }
            return c10573a.m71868a(reservation, wireBird, rideUpdateState, fh3, config);
        }

        /* renamed from: a */
        public final C37772a75 m71868a(Reservation reservation, WireBird bird, RideUpdateState rideUpdateState, FH3 parkingStatus, Config config) {
            List emptyList;
            Intrinsics.checkNotNullParameter(reservation, "reservation");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
            Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
            Intrinsics.checkNotNullParameter(config, "config");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new C37772a75(emptyList, null, reservation, bird, rideUpdateState, parkingStatus, config, null);
        }

        /* renamed from: b */
        public final C37772a75 m71867b(WireBird bird, RideUpdateState rideUpdateState, FH3 parkingStatus, Config config) {
            List emptyList;
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
            Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
            Intrinsics.checkNotNullParameter(config, "config");
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return new C37772a75(emptyList, null, null, bird, rideUpdateState, parkingStatus, config, null);
        }

        /* renamed from: c */
        public final C37772a75 m71866c(List<RideState> rideStates, RideState selectedRideState, WireBird bird, RideUpdateState rideUpdateState, FH3 parkingStatus, Config config) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            Intrinsics.checkNotNullParameter(selectedRideState, "selectedRideState");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
            Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
            Intrinsics.checkNotNullParameter(config, "config");
            return new C37772a75(rideStates, selectedRideState, null, bird, rideUpdateState, parkingStatus, config, null);
        }

        /* renamed from: d */
        public final C37772a75 m71865d(List<RideState> rideStates, WireBird bird, RideUpdateState rideUpdateState, FH3 parkingStatus, Config config) {
            Intrinsics.checkNotNullParameter(rideStates, "rideStates");
            Intrinsics.checkNotNullParameter(bird, "bird");
            Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
            Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
            Intrinsics.checkNotNullParameter(config, "config");
            return new C37772a75(rideStates, RideStatesKt.firstActivePrimaryThenGuestOrNull(rideStates), null, bird, rideUpdateState, parkingStatus, config, null);
        }

        private C10573a() {
        }

        public static /* synthetic */ C37772a75 invoke$default(C10573a c10573a, List list, RideState rideState, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config, int i, Object obj) {
            WireBird wireBird2;
            if ((i & 4) != 0) {
                WireBird bird = rideState.getRide().getBird();
                if (bird == null) {
                    bird = new WireBird(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
                }
                wireBird2 = bird;
            } else {
                wireBird2 = wireBird;
            }
            return c10573a.m71866c(list, rideState, wireBird2, rideUpdateState, fh3, config);
        }

        public static /* synthetic */ C37772a75 invoke$default(C10573a c10573a, List list, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config, int i, Object obj) {
            WireBird wireBird2;
            WireBird wireBird3;
            WireRide ride;
            if ((i & 2) != 0) {
                RideState firstActivePrimaryThenGuestOrNull = RideStatesKt.firstActivePrimaryThenGuestOrNull(list);
                if (firstActivePrimaryThenGuestOrNull == null || (ride = firstActivePrimaryThenGuestOrNull.getRide()) == null || (wireBird3 = ride.getBird()) == null) {
                    wireBird3 = new WireBird(null, null, null, 0, null, 0, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, null, null, null, false, false, null, null, null, null, null, null, false, false, null, null, false, null, null, null, false, false, false, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, -1, -1, 3, null);
                }
                wireBird2 = wireBird3;
            } else {
                wireBird2 = wireBird;
            }
            return c10573a.m71865d(list, wireBird2, rideUpdateState, fh3, config);
        }
    }

    public /* synthetic */ C37772a75(List list, RideState rideState, Reservation reservation, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, rideState, reservation, wireBird, rideUpdateState, fh3, config);
    }

    public static /* synthetic */ C37772a75 copy$default(C37772a75 c37772a75, List list, RideState rideState, Reservation reservation, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config, int i, Object obj) {
        List<RideState> list2 = list;
        if ((i & 1) != 0) {
            list2 = c37772a75.f49851a;
        }
        if ((i & 2) != 0) {
            rideState = c37772a75.f49852b;
        }
        RideState rideState2 = rideState;
        if ((i & 4) != 0) {
            reservation = c37772a75.f49853c;
        }
        Reservation reservation2 = reservation;
        if ((i & 8) != 0) {
            wireBird = c37772a75.f49854d;
        }
        WireBird wireBird2 = wireBird;
        if ((i & 16) != 0) {
            rideUpdateState = c37772a75.f49855e;
        }
        RideUpdateState rideUpdateState2 = rideUpdateState;
        if ((i & 32) != 0) {
            fh3 = c37772a75.f49856f;
        }
        FH3 fh32 = fh3;
        if ((i & 64) != 0) {
            config = c37772a75.f49857g;
        }
        return c37772a75.m71876a(list2, rideState2, reservation2, wireBird2, rideUpdateState2, fh32, config);
    }

    /* renamed from: a */
    public final C37772a75 m71876a(List<RideState> rideStates, RideState rideState, Reservation reservation, WireBird bird, RideUpdateState rideUpdateState, FH3 parkingStatus, Config config) {
        Intrinsics.checkNotNullParameter(rideStates, "rideStates");
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(rideUpdateState, "rideUpdateState");
        Intrinsics.checkNotNullParameter(parkingStatus, "parkingStatus");
        Intrinsics.checkNotNullParameter(config, "config");
        return new C37772a75(rideStates, rideState, reservation, bird, rideUpdateState, parkingStatus, config);
    }

    /* renamed from: b */
    public final WireBird m71875b() {
        return this.f49854d;
    }

    /* renamed from: c */
    public final Config m71874c() {
        return this.f49857g;
    }

    /* renamed from: d */
    public final Reservation m71873d() {
        return this.f49853c;
    }

    /* renamed from: e */
    public final List<RideState> m71872e() {
        return this.f49851a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37772a75) {
            C37772a75 c37772a75 = (C37772a75) obj;
            return Intrinsics.areEqual(this.f49851a, c37772a75.f49851a) && Intrinsics.areEqual(this.f49852b, c37772a75.f49852b) && Intrinsics.areEqual(this.f49853c, c37772a75.f49853c) && Intrinsics.areEqual(this.f49854d, c37772a75.f49854d) && this.f49855e == c37772a75.f49855e && Intrinsics.areEqual(this.f49856f, c37772a75.f49856f) && Intrinsics.areEqual(this.f49857g, c37772a75.f49857g);
        }
        return false;
    }

    /* renamed from: f */
    public final RideUpdateState m71871f() {
        return this.f49855e;
    }

    /* renamed from: g */
    public final RideState m71870g() {
        return this.f49852b;
    }

    /* renamed from: h */
    public final boolean m71869h() {
        boolean z;
        if (this.f49856f.mo11125b() || this.f49856f.mo107359a()) {
            return false;
        }
        RideState rideState = this.f49852b;
        if (rideState != null && RideStateKt.isInUnlockedRide(rideState)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f49851a.hashCode() * 31;
        RideState rideState = this.f49852b;
        int hashCode2 = (hashCode + (rideState == null ? 0 : rideState.hashCode())) * 31;
        Reservation reservation = this.f49853c;
        return ((((((((hashCode2 + (reservation != null ? reservation.hashCode() : 0)) * 31) + this.f49854d.hashCode()) * 31) + this.f49855e.hashCode()) * 31) + this.f49856f.hashCode()) * 31) + this.f49857g.hashCode();
    }

    public String toString() {
        List<RideState> list = this.f49851a;
        RideState rideState = this.f49852b;
        Reservation reservation = this.f49853c;
        WireBird wireBird = this.f49854d;
        RideUpdateState rideUpdateState = this.f49855e;
        FH3 fh3 = this.f49856f;
        Config config = this.f49857g;
        return "RideStatusModel(rideStates=" + list + ", selectedRideState=" + rideState + ", reservation=" + reservation + ", bird=" + wireBird + ", rideUpdateState=" + rideUpdateState + ", parkingStatus=" + fh3 + ", config=" + config + ")";
    }

    public C37772a75(List<RideState> list, RideState rideState, Reservation reservation, WireBird wireBird, RideUpdateState rideUpdateState, FH3 fh3, Config config) {
        this.f49851a = list;
        this.f49852b = rideState;
        this.f49853c = reservation;
        this.f49854d = wireBird;
        this.f49855e = rideUpdateState;
        this.f49856f = fh3;
        this.f49857g = config;
    }
}
