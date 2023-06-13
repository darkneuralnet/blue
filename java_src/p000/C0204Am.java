package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"(\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006\"(\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006\"(\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/google/ar/core/Config;", "", "value", DateTokenConverter.CONVERTER_KEY, "(Lcom/google/ar/core/Config;)Z", "setPlaneFindingEnabled", "(Lcom/google/ar/core/Config;Z)V", "planeFindingEnabled", "c", "g", "instantPlacementEnabled", C17296a.f69688o, "e", "cloudAnchorEnabled", "b", "f", "geospatialEnabled", "arsceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Am */
/* loaded from: classes6.dex */
public final class C0204Am {
    /* renamed from: a */
    public static final boolean m115310a(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config.getCloudAnchorMode() != Config.CloudAnchorMode.DISABLED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m115309b(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config.getGeospatialMode() != Config.GeospatialMode.DISABLED) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m115308c(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config.getInstantPlacementMode() != Config.InstantPlacementMode.DISABLED) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m115307d(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (config.getPlaneFindingMode() != Config.PlaneFindingMode.DISABLED) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final void m115306e(Config config, boolean z) {
        Config.CloudAnchorMode cloudAnchorMode;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (z) {
            cloudAnchorMode = Config.CloudAnchorMode.ENABLED;
        } else {
            cloudAnchorMode = Config.CloudAnchorMode.DISABLED;
        }
        config.setCloudAnchorMode(cloudAnchorMode);
    }

    /* renamed from: f */
    public static final void m115305f(Config config, boolean z) {
        Config.GeospatialMode geospatialMode;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (z) {
            geospatialMode = Config.GeospatialMode.ENABLED;
        } else {
            geospatialMode = Config.GeospatialMode.DISABLED;
        }
        config.setGeospatialMode(geospatialMode);
    }

    /* renamed from: g */
    public static final void m115304g(Config config, boolean z) {
        Config.InstantPlacementMode instantPlacementMode;
        Intrinsics.checkNotNullParameter(config, "<this>");
        if (z) {
            instantPlacementMode = Config.InstantPlacementMode.LOCAL_Y_UP;
        } else {
            instantPlacementMode = Config.InstantPlacementMode.DISABLED;
        }
        config.setInstantPlacementMode(instantPlacementMode);
    }
}
