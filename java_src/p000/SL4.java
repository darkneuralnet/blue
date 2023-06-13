package p000;

import android.location.Location;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.LatLng;
import com.google.p034ar.core.GeospatialPose;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b,\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001\u001bB\u0089\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J¬\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b*\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b(\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b+\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\bA\u0010?R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bD\u0010&\u001a\u0004\bE\u0010'R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\b0\u0010?¨\u0006J"}, m28432d2 = {"LSL4;", "", "Landroid/location/Location;", "j", "", "k", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "altitude", "horizontalAccuracy", FusedLocationProviderClient.KEY_VERTICAL_ACCURACY, "heading", "", "bearing", "LTL4;", Stripe3ds2AuthParams.FIELD_SOURCE, "locationProvider", "", "timeMs", "fallbackGpsLocation", "", "geospatialModeAvailableAtLocation", "geospatialModeSupported", "arCoreAvailable", "requiredAccuracy", "metAccuracy", C17296a.f69688o, "(Lcom/google/android/gms/maps/model/LatLng;DDDLjava/lang/Double;Ljava/lang/Float;LTL4;Ljava/lang/String;JLandroid/location/Location;ZZZDZ)LSL4;", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lcom/google/android/gms/maps/model/LatLng;", "f", "()Lcom/google/android/gms/maps/model/LatLng;", "b", "D", "()D", "c", "e", DateTokenConverter.CONVERTER_KEY, "i", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "LTL4;", "h", "()LTL4;", "Ljava/lang/String;", "getLocationProvider", "()Ljava/lang/String;", "J", "getTimeMs", "()J", "Landroid/location/Location;", "getFallbackGpsLocation", "()Landroid/location/Location;", "Z", "getGeospatialModeAvailableAtLocation", "()Z", "l", "getGeospatialModeSupported", "m", "getArCoreAvailable", "n", "getRequiredAccuracy", "o", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;DDDLjava/lang/Double;Ljava/lang/Float;LTL4;Ljava/lang/String;JLandroid/location/Location;ZZZDZ)V", "p", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SL4 */
/* loaded from: classes3.dex */
public final class SL4 {

    /* renamed from: p */
    public static final C7379a f33487p = new C7379a(null);

    /* renamed from: a */
    public final LatLng f33488a;

    /* renamed from: b */
    public final double f33489b;

    /* renamed from: c */
    public final double f33490c;

    /* renamed from: d */
    public final double f33491d;

    /* renamed from: e */
    public final Double f33492e;

    /* renamed from: f */
    public final Float f33493f;

    /* renamed from: g */
    public final TL4 f33494g;

    /* renamed from: h */
    public final String f33495h;

    /* renamed from: i */
    public final long f33496i;

    /* renamed from: j */
    public final Location f33497j;

    /* renamed from: k */
    public final boolean f33498k;

    /* renamed from: l */
    public final boolean f33499l;

    /* renamed from: m */
    public final boolean f33500m;

    /* renamed from: n */
    public final double f33501n;

    /* renamed from: o */
    public final boolean f33502o;

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015Jk\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LSL4$a;", "", "Lcom/google/ar/core/GeospatialPose;", "vpsLocation", "", "vpsRequiredAccuracy", "", "vpsMeetsAccuracy", "Landroid/location/Location;", "gpsLocation", "gpsRequiredAccuracy", "gpsMeetsAccuracy", "vpsAdjustedHeading", "sensorHeading", "geospatialModeAvailableAtLocation", "geospatialModeSupported", "arCoreAvailable", "LSL4;", C17296a.f69688o, "(Lcom/google/ar/core/GeospatialPose;DZLandroid/location/Location;DZLjava/lang/Double;Ljava/lang/Double;ZZZ)LSL4;", "<init>", "()V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nResolvedLocation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolvedLocation.kt\nco/bird/android/feature/ar/model/ResolvedLocation$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
    /* renamed from: SL4$a */
    /* loaded from: classes3.dex */
    public static final class C7379a {
        public /* synthetic */ C7379a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SL4 m85712a(GeospatialPose geospatialPose, double d, boolean z, Location gpsLocation, double d2, boolean z2, Double d3, Double d4, boolean z3, boolean z4, boolean z5) {
            GeospatialPose geospatialPose2;
            LatLng m60885d;
            double altitude;
            double accuracy;
            double d5;
            float verticalAccuracyMeters;
            Double d6;
            TL4 tl4;
            String provider;
            long time;
            double d7;
            boolean z6;
            Intrinsics.checkNotNullParameter(gpsLocation, "gpsLocation");
            Float f = null;
            if (geospatialPose != null && z) {
                geospatialPose2 = geospatialPose;
            } else {
                geospatialPose2 = null;
            }
            if (geospatialPose2 != null) {
                m60885d = new LatLng(geospatialPose2.getLatitude(), geospatialPose2.getLongitude());
            } else {
                m60885d = C39339cm2.m60885d(gpsLocation);
            }
            if (geospatialPose2 != null) {
                altitude = geospatialPose2.getAltitude();
            } else {
                altitude = gpsLocation.getAltitude();
            }
            if (geospatialPose2 != null) {
                accuracy = geospatialPose2.getHorizontalAccuracy();
            } else {
                accuracy = gpsLocation.getAccuracy();
            }
            if (geospatialPose2 != null) {
                d5 = geospatialPose2.getVerticalAccuracy();
            } else if (Build.VERSION.SDK_INT >= 26) {
                verticalAccuracyMeters = gpsLocation.getVerticalAccuracyMeters();
                d5 = verticalAccuracyMeters;
            } else {
                d5 = 0.0d;
            }
            if (d3 == null) {
                d6 = d4;
            } else {
                d6 = d3;
            }
            if (geospatialPose2 == null && gpsLocation.hasBearing()) {
                f = Float.valueOf(gpsLocation.getBearing());
            }
            Float f2 = f;
            if (geospatialPose2 != null) {
                tl4 = TL4.VPS;
            } else {
                tl4 = TL4.GPS;
            }
            TL4 tl42 = tl4;
            if (geospatialPose2 != null) {
                provider = "VPS";
            } else {
                provider = gpsLocation.getProvider();
            }
            String str = provider;
            if (geospatialPose2 != null) {
                time = DateTime.now().getMillis();
            } else {
                time = gpsLocation.getTime();
            }
            if (geospatialPose2 != null) {
                d7 = d;
            } else {
                d7 = d2;
            }
            if (!z && !z2) {
                z6 = false;
            } else {
                z6 = true;
            }
            return new SL4(m60885d, altitude, accuracy, d5, d6, f2, tl42, str, time, gpsLocation, z3, z4, z5, d7, z6);
        }

        private C7379a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SL4$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7380b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TL4.values().length];
            try {
                iArr[TL4.GPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TL4.VPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SL4(LatLng latLng, double d, double d2, double d3, Double d4, Float f, TL4 source, String str, long j, Location fallbackGpsLocation, boolean z, boolean z2, boolean z3, double d5, boolean z4) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fallbackGpsLocation, "fallbackGpsLocation");
        this.f33488a = latLng;
        this.f33489b = d;
        this.f33490c = d2;
        this.f33491d = d3;
        this.f33492e = d4;
        this.f33493f = f;
        this.f33494g = source;
        this.f33495h = str;
        this.f33496i = j;
        this.f33497j = fallbackGpsLocation;
        this.f33498k = z;
        this.f33499l = z2;
        this.f33500m = z3;
        this.f33501n = d5;
        this.f33502o = z4;
    }

    /* renamed from: a */
    public final SL4 m85723a(LatLng latLng, double d, double d2, double d3, Double d4, Float f, TL4 source, String str, long j, Location fallbackGpsLocation, boolean z, boolean z2, boolean z3, double d5, boolean z4) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(fallbackGpsLocation, "fallbackGpsLocation");
        return new SL4(latLng, d, d2, d3, d4, f, source, str, j, fallbackGpsLocation, z, z2, z3, d5, z4);
    }

    /* renamed from: b */
    public final double m85722b() {
        return this.f33489b;
    }

    /* renamed from: c */
    public final Float m85721c() {
        return this.f33493f;
    }

    /* renamed from: d */
    public final Double m85720d() {
        return this.f33492e;
    }

    /* renamed from: e */
    public final double m85719e() {
        return this.f33490c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SL4) {
            SL4 sl4 = (SL4) obj;
            return Intrinsics.areEqual(this.f33488a, sl4.f33488a) && Double.compare(this.f33489b, sl4.f33489b) == 0 && Double.compare(this.f33490c, sl4.f33490c) == 0 && Double.compare(this.f33491d, sl4.f33491d) == 0 && Intrinsics.areEqual((Object) this.f33492e, (Object) sl4.f33492e) && Intrinsics.areEqual((Object) this.f33493f, (Object) sl4.f33493f) && this.f33494g == sl4.f33494g && Intrinsics.areEqual(this.f33495h, sl4.f33495h) && this.f33496i == sl4.f33496i && Intrinsics.areEqual(this.f33497j, sl4.f33497j) && this.f33498k == sl4.f33498k && this.f33499l == sl4.f33499l && this.f33500m == sl4.f33500m && Double.compare(this.f33501n, sl4.f33501n) == 0 && this.f33502o == sl4.f33502o;
        }
        return false;
    }

    /* renamed from: f */
    public final LatLng m85718f() {
        return this.f33488a;
    }

    /* renamed from: g */
    public final boolean m85717g() {
        return this.f33502o;
    }

    /* renamed from: h */
    public final TL4 m85716h() {
        return this.f33494g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f33488a.hashCode() * 31) + Double.hashCode(this.f33489b)) * 31) + Double.hashCode(this.f33490c)) * 31) + Double.hashCode(this.f33491d)) * 31;
        Double d = this.f33492e;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Float f = this.f33493f;
        int hashCode3 = (((hashCode2 + (f == null ? 0 : f.hashCode())) * 31) + this.f33494g.hashCode()) * 31;
        String str = this.f33495h;
        int hashCode4 = (((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.f33496i)) * 31) + this.f33497j.hashCode()) * 31;
        boolean z = this.f33498k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.f33499l;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f33500m;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode5 = (((i4 + i5) * 31) + Double.hashCode(this.f33501n)) * 31;
        boolean z4 = this.f33502o;
        return hashCode5 + (z4 ? 1 : z4 ? 1 : 0);
    }

    /* renamed from: i */
    public final double m85715i() {
        return this.f33491d;
    }

    /* renamed from: j */
    public final Location m85714j() {
        String str;
        int i = C7380b.$EnumSwitchMapping$0[this.f33494g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "vps";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            str = this.f33495h;
        }
        Location location = new Location(str);
        location.setLatitude(this.f33488a.f71430b);
        location.setLongitude(this.f33488a.f71431c);
        location.setAltitude(location.getAltitude());
        location.setAccuracy((float) this.f33490c);
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters((float) this.f33491d);
        }
        location.setBearing(location.getBearing());
        location.setTime(this.f33496i);
        return location;
    }

    /* renamed from: k */
    public final String m85713k() {
        LatLng latLng = this.f33488a;
        double d = this.f33489b;
        double d2 = this.f33490c;
        double d3 = this.f33491d;
        Double d4 = this.f33492e;
        Float f = this.f33493f;
        TL4 tl4 = this.f33494g;
        String str = this.f33495h;
        boolean z = this.f33498k;
        boolean z2 = this.f33499l;
        boolean z3 = this.f33500m;
        double d5 = this.f33501n;
        boolean z4 = this.f33502o;
        return "[latLng: " + latLng + "\n\taltitude: " + d + "\n\thorizontalAccuracy: " + d2 + "\n\tverticalAccuracy: " + d3 + "\n\theading: " + d4 + "\n\tbearing: " + f + "\n\tsource: " + tl4 + "\n\tlocationProvider: " + str + "\n\tgeospatialModeAvailableAtLocation: " + z + "\n\tgeospatialModeSupported: " + z2 + "\n\tarCoreAvailable: " + z3 + "\n\trequiredAccuracy: " + d5 + "\n\tmetAccuracy: " + z4 + "]";
    }

    public String toString() {
        LatLng latLng = this.f33488a;
        double d = this.f33489b;
        double d2 = this.f33490c;
        double d3 = this.f33491d;
        Double d4 = this.f33492e;
        Float f = this.f33493f;
        TL4 tl4 = this.f33494g;
        String str = this.f33495h;
        long j = this.f33496i;
        Location location = this.f33497j;
        boolean z = this.f33498k;
        boolean z2 = this.f33499l;
        boolean z3 = this.f33500m;
        double d5 = this.f33501n;
        boolean z4 = this.f33502o;
        return "ResolvedLocation(latLng=" + latLng + ", altitude=" + d + ", horizontalAccuracy=" + d2 + ", verticalAccuracy=" + d3 + ", heading=" + d4 + ", bearing=" + f + ", source=" + tl4 + ", locationProvider=" + str + ", timeMs=" + j + ", fallbackGpsLocation=" + location + ", geospatialModeAvailableAtLocation=" + z + ", geospatialModeSupported=" + z2 + ", arCoreAvailable=" + z3 + ", requiredAccuracy=" + d5 + ", metAccuracy=" + z4 + ")";
    }

    public /* synthetic */ SL4(LatLng latLng, double d, double d2, double d3, Double d4, Float f, TL4 tl4, String str, long j, Location location, boolean z, boolean z2, boolean z3, double d5, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(latLng, d, d2, d3, (i & 16) != 0 ? null : d4, (i & 32) != 0 ? null : f, tl4, str, j, location, z, z2, z3, d5, z4);
    }
}
