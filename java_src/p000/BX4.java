package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.RidePassViewIneligibleReason;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LBX4;", "", "Lco/bird/android/model/constant/RidePassViewStatus;", "", "b", "h", "Lco/bird/android/model/constant/RidePassViewIneligibleReason;", C17296a.f69688o, "g", "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;", "c", "e", "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;", DateTokenConverter.CONVERTER_KEY, "f", "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.ride-pass-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassViewConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassViewConverters.kt\nco/bird/android/persistence/ridepassview/converters/RidePassViewConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* renamed from: BX4 */
/* loaded from: classes4.dex */
public final class BX4 {

    /* renamed from: a */
    public static final BX4 f2484a = new BX4();

    /* renamed from: b */
    public static final C51174wi2 f2485b = Converters.f66822a.m55283a();

    private BX4() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m113893a(RidePassViewIneligibleReason ridePassViewIneligibleReason) {
        if (ridePassViewIneligibleReason != null) {
            return f2485b.m6453i(ridePassViewIneligibleReason);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m113892b(RidePassViewStatus ridePassViewStatus) {
        if (ridePassViewStatus != null) {
            return f2485b.m6453i(ridePassViewStatus);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m113891c(RidePassSubscriptionPlanView ridePassSubscriptionPlanView) {
        if (ridePassSubscriptionPlanView != null) {
            return f2485b.m6453i(ridePassSubscriptionPlanView);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m113890d(RidePassUserSubscriptionView ridePassUserSubscriptionView) {
        if (ridePassUserSubscriptionView != null) {
            return f2485b.m6453i(ridePassUserSubscriptionView);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final RidePassSubscriptionPlanView m113889e(String str) {
        if (str != null) {
            return (RidePassSubscriptionPlanView) f2485b.m6459c(str, Reflection.getOrCreateKotlinClass(RidePassSubscriptionPlanView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final RidePassUserSubscriptionView m113888f(String str) {
        if (str != null) {
            return (RidePassUserSubscriptionView) f2485b.m6459c(str, Reflection.getOrCreateKotlinClass(RidePassUserSubscriptionView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final RidePassViewIneligibleReason m113887g(String str) {
        if (str != null) {
            return (RidePassViewIneligibleReason) f2485b.m6459c(str, Reflection.getOrCreateKotlinClass(RidePassViewIneligibleReason.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final RidePassViewStatus m113886h(String str) {
        if (str != null) {
            return (RidePassViewStatus) f2485b.m6459c(str, Reflection.getOrCreateKotlinClass(RidePassViewStatus.class));
        }
        return null;
    }
}
