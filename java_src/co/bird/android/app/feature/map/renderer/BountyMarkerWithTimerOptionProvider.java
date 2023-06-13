package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.LruCache;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.persistence.BountyMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00020\u0016*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$²\u0006\f\u0010#\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider;", "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;", "Lco/bird/android/model/persistence/BountyMapMarker;", "", "withIcon", "showTimer", "LPT;", "createBitmapDescriptor", "Lhs6;", "Landroid/graphics/PointF;", "anchorPoint", "marker", "bitmapDescriptor", "bitmapDescriptorFlashing", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/util/LruCache;", "", "noTimerValueBitmapCache", "Landroid/util/LruCache;", "zeroTimerValueBitmapCache", "", "anchorCache", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "fleetMarkerHelper", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "binding", "Lhs6;", "getAnchorKey", "(Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/lang/String;", "anchorKey", "<init>", "(Landroid/content/Context;)V", "Companion", "descriptor", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyMarkerWithTimerOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMarkerWithTimerOptionProvider.kt\nco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes2.dex */
public final class BountyMarkerWithTimerOptionProvider implements MarkerOptionProvider<BountyMapMarker> {
    private static final int ANCHOR_CACHE_SIZE = 5;
    private static final int CACHE_SIZE = 5;
    public static final Companion Companion = new Companion(null);
    private static final PointF TEMP_ANCHOR_POINT = new PointF(0.5f, 1.0f);
    private final LruCache<String, PointF> anchorCache;
    private C42385hs6 binding;
    private final Context context;
    private final FleetMarkerHelper fleetMarkerHelper;
    private final LruCache<Integer, C6378PT> noTimerValueBitmapCache;
    private final LruCache<Integer, C6378PT> zeroTimerValueBitmapCache;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BountyMarkerWithTimerOptionProvider$Companion;", "", "()V", "ANCHOR_CACHE_SIZE", "", "CACHE_SIZE", "TEMP_ANCHOR_POINT", "Landroid/graphics/PointF;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BountyMarkerWithTimerOptionProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.noTimerValueBitmapCache = new LruCache<>(5);
        this.zeroTimerValueBitmapCache = new LruCache<>(5);
        this.anchorCache = new LruCache<>(5);
        this.fleetMarkerHelper = new FleetMarkerHelper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6378PT bitmapDescriptorFlashing$lambda$0(Lazy<C6378PT> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: all -> 0x00e6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000b, B:8:0x001c, B:10:0x0043, B:12:0x0049, B:14:0x0072, B:16:0x0078, B:21:0x0083, B:23:0x00a1, B:27:0x00b7, B:31:0x00c6, B:34:0x00de, B:35:0x00e5), top: B:39:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized C6378PT createBitmapDescriptor(BountyMapMarker bountyMapMarker, boolean z, boolean z2) {
        Drawable drawable;
        String str;
        Context context;
        ConstraintLayout root;
        boolean z3;
        int i;
        String str2;
        FleetMarker marker = bountyMapMarker.getMarker();
        if (marker != null) {
            C42385hs6 c42385hs6 = this.binding;
            if (c42385hs6 == null) {
                c42385hs6 = C42385hs6.m35677c(C40788fB0.m41772j(this.context));
                this.binding = c42385hs6;
                Intrinsics.checkNotNullExpressionValue(c42385hs6, "inflate(context.layoutIn…vider.binding = binding }");
            }
            C41199fs6 m40618a = C41199fs6.m40618a(c42385hs6.getRoot());
            Intrinsics.checkNotNullExpressionValue(m40618a, "bind(binding.root)");
            this.fleetMarkerHelper.hydrateBinding(m40618a, marker, z);
            this.fleetMarkerHelper.calculateAnchorPoint(m40618a, marker, new BountyMarkerWithTimerOptionProvider$createBitmapDescriptor$1(this, bountyMapMarker));
            Drawable m94299e = NA0.m94299e(this.context, C47600qg4.fleet_marker_timer_bg);
            if (m94299e != null) {
                drawable = m94299e.mutate();
            } else {
                drawable = null;
            }
            Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setColor(c42385hs6.f86042c.m54572g());
            c42385hs6.f86044e.setBackground(gradientDrawable);
            TextView textView = c42385hs6.f86043d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.timer");
            int i2 = 0;
            C49520tu6.show$default(textView, z2, 0, 2, null);
            TextView textView2 = c42385hs6.f86043d;
            DateTime countdownUntil = bountyMapMarker.getCountdownUntil();
            if (countdownUntil != null) {
                DateTime countdownUntil2 = bountyMapMarker.getCountdownUntil();
                if (countdownUntil2 != null) {
                    z3 = true;
                    if (countdownUntil2.isAfterNow()) {
                        if (!z3) {
                            i2 = Hours.hoursBetween(DateTime.now(), countdownUntil).getHours() % 24;
                            i = Minutes.minutesBetween(DateTime.now(), countdownUntil).getMinutes() % 60;
                        } else {
                            i = 0;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        sb.append(":");
                        if (i >= 10) {
                            str2 = "0";
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        sb.append(i);
                        str = sb.toString();
                        if (str != null) {
                            textView2.setText(str);
                            context = this.context;
                            root = c42385hs6.getRoot();
                            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append(":");
                if (i >= 10) {
                }
                sb2.append(str2);
                sb2.append(i);
                str = sb2.toString();
                if (str != null) {
                }
            }
            str = CallerData.f61059NA;
            textView2.setText(str);
            context = this.context;
            root = c42385hs6.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        } else {
            throw new IllegalStateException("Cannot render marker without FleetMarker parameter");
        }
        return C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    public static /* synthetic */ C6378PT createBitmapDescriptor$default(BountyMarkerWithTimerOptionProvider bountyMarkerWithTimerOptionProvider, BountyMapMarker bountyMapMarker, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return bountyMarkerWithTimerOptionProvider.createBitmapDescriptor(bountyMapMarker, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAnchorKey(BountyMapMarker bountyMapMarker) {
        return String.valueOf(bountyMapMarker.getCountdownUntil() != null);
    }

    public final C6378PT bitmapDescriptorFlashing(BountyMapMarker marker, boolean z, boolean z2) {
        Lazy lazy;
        ThemedColors iconColor;
        ThemedColors iconColor2;
        Intrinsics.checkNotNullParameter(marker, "marker");
        lazy = LazyKt__LazyJVMKt.lazy(new C13842xd9294f8d(this, marker, z, z2));
        int i = 0;
        if (z2) {
            LruCache<Integer, C6378PT> lruCache = this.zeroTimerValueBitmapCache;
            FleetMarker marker2 = marker.getMarker();
            if (marker2 != null && (iconColor2 = marker2.getIconColor()) != null) {
                i = iconColor2.getLightMode();
            }
            return (C6378PT) C50896wE2.m7192a(lruCache, Integer.valueOf(i), new BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$1(lazy));
        }
        LruCache<Integer, C6378PT> lruCache2 = this.noTimerValueBitmapCache;
        FleetMarker marker3 = marker.getMarker();
        if (marker3 != null && (iconColor = marker3.getIconColor()) != null) {
            i = iconColor.getLightMode();
        }
        return (C6378PT) C50896wE2.m7192a(lruCache2, Integer.valueOf(i), new BountyMarkerWithTimerOptionProvider$bitmapDescriptorFlashing$2(lazy));
    }

    @Override // co.bird.android.app.feature.map.renderer.MarkerOptionProvider
    public PointF anchorPoint(BountyMapMarker marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        PointF pointF = this.anchorCache.get(getAnchorKey(marker));
        return pointF == null ? TEMP_ANCHOR_POINT : pointF;
    }

    @Override // co.bird.android.app.feature.map.renderer.MarkerOptionProvider
    public C6378PT bitmapDescriptor(BountyMapMarker marker, boolean z) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return createBitmapDescriptor$default(this, marker, z, false, 2, null);
    }

    private final PointF anchorPoint(C42385hs6 c42385hs6) {
        return new PointF(0.5f, c42385hs6.f86042c.getMeasuredHeight() / c42385hs6.getRoot().getMeasuredHeight());
    }
}
