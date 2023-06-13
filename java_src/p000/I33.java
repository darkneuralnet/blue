package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.ClaimDetails;
import co.bird.android.model.persistence.nestedstructures.NestAllowedVehicleDetails;
import co.bird.android.model.persistence.nestedstructures.NestBirdle;
import co.bird.android.model.persistence.nestedstructures.NestButtons;
import co.bird.android.model.persistence.nestedstructures.NestCapacity;
import co.bird.android.model.persistence.nestedstructures.NestDetails;
import co.bird.android.model.persistence.nestedstructures.NestImages;
import co.bird.android.model.persistence.nestedstructures.NestStatus;
import co.bird.android.model.persistence.nestedstructures.NestSummary;
import co.bird.android.model.persistence.nestedstructures.NestVehicleDetails;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006&"}, m28432d2 = {"LI33;", "", "Lco/bird/android/model/persistence/nestedstructures/NestSummary;", "", "j", "s", "Lco/bird/android/model/persistence/nestedstructures/NestBirdle;", DateTokenConverter.CONVERTER_KEY, "m", "Lco/bird/android/model/persistence/nestedstructures/NestStatus;", "i", "r", "Lco/bird/android/model/persistence/nestedstructures/NestImages;", "h", "q", "Lco/bird/android/model/persistence/nestedstructures/NestCapacity;", "f", "o", "Lco/bird/android/model/persistence/nestedstructures/NestDetails;", "g", "p", "Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;", "k", "t", "Lco/bird/android/model/persistence/nestedstructures/NestButtons;", "e", "n", "Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;", "b", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;", "c", "l", "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.nest-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestFlightSheetConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlightSheetConverters.kt\nco/bird/android/persistence/nestflightsheet/impl/converters/NestFlightSheetConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* renamed from: I33 */
/* loaded from: classes4.dex */
public final class I33 {

    /* renamed from: a */
    public static final I33 f14385a = new I33();

    /* renamed from: b */
    public static final C51174wi2 f14386b = Converters.f66822a.m55283a();

    private I33() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ClaimDetails m103030a(String str) {
        if (str != null) {
            return (ClaimDetails) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(ClaimDetails.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m103029b(ClaimDetails claimDetails) {
        if (claimDetails != null) {
            return f14386b.m6453i(claimDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m103028c(NestAllowedVehicleDetails nestAllowedVehicleDetails) {
        if (nestAllowedVehicleDetails != null) {
            return f14386b.m6453i(nestAllowedVehicleDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m103027d(NestBirdle nestBirdle) {
        if (nestBirdle != null) {
            return f14386b.m6453i(nestBirdle);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final String m103026e(NestButtons nestButtons) {
        if (nestButtons != null) {
            return f14386b.m6453i(nestButtons);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m103025f(NestCapacity nestCapacity) {
        if (nestCapacity != null) {
            return f14386b.m6453i(nestCapacity);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m103024g(NestDetails nestDetails) {
        if (nestDetails != null) {
            return f14386b.m6453i(nestDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m103023h(NestImages nestImages) {
        if (nestImages != null) {
            return f14386b.m6453i(nestImages);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: i */
    public static final String m103022i(NestStatus nestStatus) {
        if (nestStatus != null) {
            return f14386b.m6453i(nestStatus);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m103021j(NestSummary nestSummary) {
        Intrinsics.checkNotNullParameter(nestSummary, "<this>");
        return f14386b.m6453i(nestSummary);
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m103020k(NestVehicleDetails nestVehicleDetails) {
        if (nestVehicleDetails != null) {
            return f14386b.m6453i(nestVehicleDetails);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final NestAllowedVehicleDetails m103019l(String str) {
        if (str != null) {
            return (NestAllowedVehicleDetails) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestAllowedVehicleDetails.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: m */
    public static final NestBirdle m103018m(String str) {
        if (str != null) {
            return (NestBirdle) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestBirdle.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: n */
    public static final NestButtons m103017n(String str) {
        if (str != null) {
            return (NestButtons) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestButtons.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: o */
    public static final NestCapacity m103016o(String str) {
        if (str != null) {
            return (NestCapacity) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestCapacity.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: p */
    public static final NestDetails m103015p(String str) {
        if (str != null) {
            return (NestDetails) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestDetails.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: q */
    public static final NestImages m103014q(String str) {
        if (str != null) {
            return (NestImages) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestImages.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: r */
    public static final NestStatus m103013r(String str) {
        if (str != null) {
            return (NestStatus) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestStatus.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: s */
    public static final NestSummary m103012s(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (NestSummary) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestSummary.class));
    }

    @JvmStatic
    /* renamed from: t */
    public static final NestVehicleDetails m103011t(String str) {
        if (str != null) {
            return (NestVehicleDetails) f14386b.m6459c(str, Reflection.getOrCreateKotlinClass(NestVehicleDetails.class));
        }
        return null;
    }
}
