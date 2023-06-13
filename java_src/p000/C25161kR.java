package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdPlusSubscriptionViewIneligibleReason;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LkR;", "", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;", "", "g", "e", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;", "f", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "i", "b", "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;", "j", "c", "Lco/bird/android/model/persistence/BirdPlusDisplayView;", "h", C17296a.f69688o, "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.birdplus.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusViewConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusViewConverters.kt\nco/bird/android/persistence/birdplus/converters/BirdPlusViewConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/* renamed from: kR */
/* loaded from: classes4.dex */
public final class C25161kR {

    /* renamed from: a */
    public static final C25161kR f94374a = new C25161kR();

    /* renamed from: b */
    public static final C51174wi2 f94375b = Converters.f66822a.m55283a();

    private C25161kR() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final BirdPlusDisplayView m28972a(String str) {
        if (str != null) {
            return (BirdPlusDisplayView) f94375b.m6459c(str, Reflection.getOrCreateKotlinClass(BirdPlusDisplayView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final BirdPlusSubscriptionPlanView m28971b(String str) {
        if (str != null) {
            return (BirdPlusSubscriptionPlanView) f94375b.m6459c(str, Reflection.getOrCreateKotlinClass(BirdPlusSubscriptionPlanView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final BirdPlusUserSubscriptionView m28970c(String str) {
        if (str != null) {
            return (BirdPlusUserSubscriptionView) f94375b.m6459c(str, Reflection.getOrCreateKotlinClass(BirdPlusUserSubscriptionView.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final BirdPlusSubscriptionViewIneligibleReason m28969d(String str) {
        if (str != null) {
            return (BirdPlusSubscriptionViewIneligibleReason) f94375b.m6459c(str, Reflection.getOrCreateKotlinClass(BirdPlusSubscriptionViewIneligibleReason.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final BirdPlusSubscriptionViewStatus m28968e(String str) {
        if (str != null) {
            return (BirdPlusSubscriptionViewStatus) f94375b.m6459c(str, Reflection.getOrCreateKotlinClass(BirdPlusSubscriptionViewStatus.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m28967f(BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason) {
        if (birdPlusSubscriptionViewIneligibleReason != null) {
            return f94375b.m6453i(birdPlusSubscriptionViewIneligibleReason);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m28966g(BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus) {
        if (birdPlusSubscriptionViewStatus != null) {
            return f94375b.m6453i(birdPlusSubscriptionViewStatus);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m28965h(BirdPlusDisplayView birdPlusDisplayView) {
        if (birdPlusDisplayView != null) {
            return f94375b.m6453i(birdPlusDisplayView);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: i */
    public static final String m28964i(BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView) {
        if (birdPlusSubscriptionPlanView != null) {
            return f94375b.m6453i(birdPlusSubscriptionPlanView);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m28963j(BirdPlusUserSubscriptionView birdPlusUserSubscriptionView) {
        if (birdPlusUserSubscriptionView != null) {
            return f94375b.m6453i(birdPlusUserSubscriptionView);
        }
        return null;
    }
}
