package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Detail;
import co.bird.android.model.persistence.FleetMarker;
import co.bird.android.model.persistence.nestedstructures.FleetMarkerPinShape;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001d\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010!\u001a\u00020\u000f*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006&²\u0006\f\u0010%\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider;", "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;", "Lco/bird/android/model/persistence/FleetMarker;", "", "withIcon", "LPT;", "createBitmapDescriptor", "marker", "Landroid/graphics/PointF;", "anchorPoint", "bitmapDescriptor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/util/LruCache;", "", "noIconBitmapCache", "Landroid/util/LruCache;", "bitmapCache", "anchorCache", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "fleetMarkerHelper", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "Lfs6;", "fleetBinding", "Lfs6;", "bountyBinding", "getBitmapKey", "(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;", "bitmapKey", "getNoIconBitmapKey", "noIconBitmapKey", "getAnchorKey", "anchorKey", "<init>", "(Landroid/content/Context;)V", "Companion", "descriptor", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetMarkerOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetMarkerOptionProvider.kt\nco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/* loaded from: classes2.dex */
public class FleetMarkerOptionProvider implements MarkerOptionProvider<FleetMarker> {
    private static final int ANCHOR_CACHE_SIZE = 5;
    private static final int BITMAP_CACHE_SIZE = 30;
    private static final int NO_ICON_CACHE_SIZE = 10;
    private final LruCache<String, PointF> anchorCache;
    private final LruCache<String, C6378PT> bitmapCache;
    private C41199fs6 bountyBinding;
    private final Context context;
    private C41199fs6 fleetBinding;
    private final FleetMarkerHelper fleetMarkerHelper;
    private final LruCache<String, C6378PT> noIconBitmapCache;
    public static final Companion Companion = new Companion(null);
    private static final PointF DEFAULT_ANCHOR = new PointF(0.5f, 1.0f);
    private static final PointF DEFAULT_ANCHOR_CENTERED = new PointF(0.5f, 0.5f);
    private static final IntRange STANDARD_PIN_STYLE_PROMINENCES = new IntRange(0, 1);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/FleetMarkerOptionProvider$Companion;", "", "()V", "ANCHOR_CACHE_SIZE", "", "BITMAP_CACHE_SIZE", "DEFAULT_ANCHOR", "Landroid/graphics/PointF;", "DEFAULT_ANCHOR_CENTERED", "NO_ICON_CACHE_SIZE", "STANDARD_PIN_STYLE_PROMINENCES", "Lkotlin/ranges/IntRange;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FleetMarkerOptionProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.noIconBitmapCache = new LruCache<>(10);
        this.bitmapCache = new LruCache<>(30);
        this.anchorCache = new LruCache<>(5);
        this.fleetMarkerHelper = new FleetMarkerHelper(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6378PT bitmapDescriptor$lambda$1(Lazy<C6378PT> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6378PT createBitmapDescriptor(FleetMarker fleetMarker, boolean z) {
        C41199fs6 c41199fs6;
        if (fleetMarker.getShape() == FleetMarkerPinShape.TEARDROP) {
            c41199fs6 = this.bountyBinding;
            if (c41199fs6 == null) {
                c41199fs6 = C41199fs6.m40618a(C40013ds6.m43567c(C40788fB0.m41772j(this.context)).getRoot());
                this.bountyBinding = c41199fs6;
                Intrinsics.checkNotNullExpressionValue(c41199fs6, "bind(ViewOperatorBountyM…bountyBinding = binding }");
            }
        } else {
            c41199fs6 = this.fleetBinding;
            if (c41199fs6 == null) {
                c41199fs6 = C41199fs6.m40616c(C40788fB0.m41772j(this.context));
                this.fleetBinding = c41199fs6;
                Intrinsics.checkNotNullExpressionValue(c41199fs6, "inflate(context.layoutIn… fleetBinding = binding }");
            }
        }
        this.fleetMarkerHelper.hydrateBinding(c41199fs6, fleetMarker, z);
        this.fleetMarkerHelper.calculateAnchorPoint(c41199fs6, fleetMarker, new FleetMarkerOptionProvider$createBitmapDescriptor$1(this, fleetMarker));
        Context context = this.context;
        ConstraintLayout root = c41199fs6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAnchorKey(FleetMarker fleetMarker) {
        return String.valueOf(fleetMarker.getProminence());
    }

    private final String getBitmapKey(FleetMarker fleetMarker) {
        int prominence = fleetMarker.getProminence();
        String name = fleetMarker.getFleetIcon().name();
        int lightMode = fleetMarker.getStandardPinColor().getLightMode();
        return prominence + Detail.EMPTY_CHAR + name + Detail.EMPTY_CHAR + lightMode;
    }

    private final String getNoIconBitmapKey(FleetMarker fleetMarker) {
        return String.valueOf(fleetMarker.getStandardPinColor().getLightMode());
    }

    @Override // co.bird.android.app.feature.map.renderer.MarkerOptionProvider
    public PointF anchorPoint(FleetMarker marker) {
        PointF pointF;
        Intrinsics.checkNotNullParameter(marker, "marker");
        PointF pointF2 = this.anchorCache.get(getAnchorKey(marker));
        if (pointF2 == null) {
            IntRange intRange = STANDARD_PIN_STYLE_PROMINENCES;
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int prominence = marker.getProminence();
            boolean z = false;
            if (first <= prominence && prominence <= last) {
                z = true;
            }
            if (z) {
                pointF = DEFAULT_ANCHOR;
            } else {
                pointF = DEFAULT_ANCHOR_CENTERED;
            }
            return pointF;
        }
        return pointF2;
    }

    @Override // co.bird.android.app.feature.map.renderer.MarkerOptionProvider
    public C6378PT bitmapDescriptor(FleetMarker marker, boolean z) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(marker, "marker");
        lazy = LazyKt__LazyJVMKt.lazy(new FleetMarkerOptionProvider$bitmapDescriptor$descriptor$2(this, marker, z));
        if (z) {
            return (C6378PT) C50896wE2.m7192a(this.bitmapCache, getBitmapKey(marker), new FleetMarkerOptionProvider$bitmapDescriptor$1(lazy));
        }
        return (C6378PT) C50896wE2.m7192a(this.noIconBitmapCache, getNoIconBitmapKey(marker), new FleetMarkerOptionProvider$bitmapDescriptor$2(lazy));
    }
}
