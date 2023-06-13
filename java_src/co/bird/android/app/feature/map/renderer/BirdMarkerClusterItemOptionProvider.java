package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.BirdMarkerClusterItemOptionProvider;
import co.bird.android.model.Detail;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.FleetMarker;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 22\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u00012B\u0011\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J,\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002J\u0014\u0010\u0011\u001a\u00020\r*\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u0010-\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u001e\u0010/\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*¨\u00064²\u0006\f\u00103\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;", "Lco/bird/android/app/feature/map/renderer/MarkerOptionProvider;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/persistence/BirdMapMarker;", "", "withIcon", "LPT;", "createBitmapDescriptor", "Lgs6;", "binding", "Lco/bird/android/model/persistence/FleetMarker;", "marker", "Lkotlin/Function1;", "Landroid/graphics/PointF;", "", "setAnchorPointAsync", "calculateAnchorPoint", "anchorPoint", "bitmapDescriptor", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/util/LruCache;", "", "noIconBitmapCache", "Landroid/util/LruCache;", "bitmapCache", "anchorCache", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "fleetMarkerHelper", "Lco/bird/android/app/feature/map/renderer/FleetMarkerHelper;", "selectedBinding", "Lgs6;", "Lfs6;", "Lfs6;", "Los6;", "taskBinding", "Los6;", "Landroid/os/Handler;", "uiHandler", "Landroid/os/Handler;", "getBitmapKey", "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/String;", "bitmapKey", "getNoIconBitmapKey", "noIconBitmapKey", "getAnchorKey", "anchorKey", "<init>", "(Landroid/content/Context;)V", "Companion", "descriptor", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdMarkerClusterItemOptionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMarkerClusterItemOptionProvider.kt\nco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
/* loaded from: classes2.dex */
public final class BirdMarkerClusterItemOptionProvider implements MarkerOptionProvider<BirdMarkerClusterItem<BirdMapMarker>> {
    private static final int ANCHOR_CACHE_SIZE = 5;
    private static final int BITMAP_CACHE_SIZE = 30;
    private static final int NO_ICON_CACHE_SIZE = 10;
    private final LruCache<String, PointF> anchorCache;
    private C41199fs6 binding;
    private final LruCache<String, C6378PT> bitmapCache;
    private final Context context;
    private final FleetMarkerHelper fleetMarkerHelper;
    private final LruCache<String, C6378PT> noIconBitmapCache;
    private C41792gs6 selectedBinding;
    private C46536os6 taskBinding;
    private final Handler uiHandler;
    public static final Companion Companion = new Companion(null);
    private static final PointF DEFAULT_ANCHOR = new PointF(0.5f, 1.0f);
    private static final PointF DEFAULT_ANCHOR_CENTERED = new PointF(0.5f, 0.5f);
    private static final IntRange STANDARD_PIN_STYLE_PROMINENCES = new IntRange(0, 1);

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider$Companion;", "", "()V", "ANCHOR_CACHE_SIZE", "", "BITMAP_CACHE_SIZE", "DEFAULT_ANCHOR", "Landroid/graphics/PointF;", "DEFAULT_ANCHOR_CENTERED", "NO_ICON_CACHE_SIZE", "STANDARD_PIN_STYLE_PROMINENCES", "Lkotlin/ranges/IntRange;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BirdMarkerClusterItemOptionProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.noIconBitmapCache = new LruCache<>(10);
        this.bitmapCache = new LruCache<>(30);
        this.anchorCache = new LruCache<>(5);
        this.fleetMarkerHelper = new FleetMarkerHelper(context);
        this.uiHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6378PT bitmapDescriptor$lambda$1(Lazy<C6378PT> lazy) {
        return lazy.getValue();
    }

    private final void calculateAnchorPoint(final C41792gs6 c41792gs6, final FleetMarker fleetMarker, final Function1<? super PointF, Unit> function1) {
        if (c41792gs6.f84397f.getMeasuredHeight() > 0) {
            function1.invoke(anchorPoint(c41792gs6, fleetMarker));
        } else {
            this.uiHandler.post(new Runnable() { // from class: LM
                @Override // java.lang.Runnable
                public final void run() {
                    BirdMarkerClusterItemOptionProvider.calculateAnchorPoint$lambda$9(Function1.this, this, c41792gs6, fleetMarker);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculateAnchorPoint$lambda$9(Function1 setAnchorPointAsync, BirdMarkerClusterItemOptionProvider this$0, C41792gs6 binding, FleetMarker marker) {
        Intrinsics.checkNotNullParameter(setAnchorPointAsync, "$setAnchorPointAsync");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(marker, "$marker");
        setAnchorPointAsync.invoke(this$0.anchorPoint(binding, marker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6378PT createBitmapDescriptor(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem, boolean z) {
        ConstraintLayout root;
        if (birdMarkerClusterItem.isSelected()) {
            C41792gs6 c41792gs6 = this.selectedBinding;
            if (c41792gs6 == null) {
                c41792gs6 = C41792gs6.m37371c(C40788fB0.m41772j(this.context));
                this.selectedBinding = c41792gs6;
                Intrinsics.checkNotNullExpressionValue(c41792gs6, "inflate(context.layoutIn…lectedBinding = binding }");
            }
            c41792gs6.f84394c.setText(birdMarkerClusterItem.getMarker().getCode());
            c41792gs6.f84393b.setBatteryLevel(birdMarkerClusterItem.getMarker().getBatteryLevel() / 100.0f);
            c41792gs6.f84395d.setImageDrawable(C33341Hk0.m103484a(birdMarkerClusterItem.getMarker().getFleetMarker().getFleetIcon(), this.context));
            c41792gs6.f84395d.setImageTintList(ColorStateList.valueOf(birdMarkerClusterItem.getMarker().getFleetMarker().getIconColor().getLightMode()));
            c41792gs6.f84395d.setBackgroundTintList(ColorStateList.valueOf(birdMarkerClusterItem.getMarker().getFleetMarker().getStandardPinColor().getLightMode()));
            c41792gs6.f84397f.setOutlineColor(birdMarkerClusterItem.getMarker().getFleetMarker().getStandardPinColor().getLightMode());
            c41792gs6.f84396e.setText(this.context.getString(C45871nl4.battery_percent, Integer.valueOf(birdMarkerClusterItem.getMarker().getBatteryLevel())));
            calculateAnchorPoint(c41792gs6, birdMarkerClusterItem.getMarker().getFleetMarker(), new C13833xcf39b17a(this, birdMarkerClusterItem));
            root = c41792gs6.getRoot();
        } else if (birdMarkerClusterItem.getMarker().getFleetMarker().getLabel() != null) {
            C46536os6 c46536os6 = this.taskBinding;
            if (c46536os6 == null) {
                c46536os6 = C46536os6.m20375c(C40788fB0.m41772j(this.context));
                this.taskBinding = c46536os6;
                Intrinsics.checkNotNullExpressionValue(c46536os6, "inflate(context.layoutIn…> taskBinding = binding }");
            }
            this.fleetMarkerHelper.hydrateBinding(c46536os6, birdMarkerClusterItem.getMarker().getFleetMarker());
            this.fleetMarkerHelper.calculateAnchorPoint(c46536os6, birdMarkerClusterItem.getMarker().getFleetMarker(), new C13834xcf39b17b(this, birdMarkerClusterItem));
            root = c46536os6.getRoot();
        } else {
            C41199fs6 c41199fs6 = this.binding;
            if (c41199fs6 == null) {
                c41199fs6 = C41199fs6.m40616c(C40788fB0.m41772j(this.context));
                this.binding = c41199fs6;
                Intrinsics.checkNotNullExpressionValue(c41199fs6, "inflate(context.layoutIn…vider.binding = binding }");
            }
            this.fleetMarkerHelper.hydrateBinding(c41199fs6, birdMarkerClusterItem.getMarker().getFleetMarker(), z);
            this.fleetMarkerHelper.calculateAnchorPoint(c41199fs6, birdMarkerClusterItem.getMarker().getFleetMarker(), new C13835xcf39b17c(this, birdMarkerClusterItem));
            root = c41199fs6.getRoot();
        }
        ConstraintLayout constraintLayout = root;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "private fun BirdMarkerCl…w, background = null)\n  }");
        return C40788fB0.iconBitmapDescriptor$default(this.context, constraintLayout, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAnchorKey(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        int prominence = birdMarkerClusterItem.getMarker().getFleetMarker().getProminence();
        boolean isSelected = birdMarkerClusterItem.isSelected();
        boolean z = birdMarkerClusterItem.getMarker().getFleetMarker().getLabel() != null;
        return prominence + Detail.EMPTY_CHAR + isSelected + Detail.EMPTY_CHAR + z;
    }

    private final String getBitmapKey(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.isSelected()) {
            return null;
        }
        int prominence = birdMarkerClusterItem.getMarker().getFleetMarker().getProminence();
        String name = birdMarkerClusterItem.getMarker().getFleetMarker().getFleetIcon().name();
        int lightMode = birdMarkerClusterItem.getMarker().getFleetMarker().getStandardPinColor().getLightMode();
        String label = birdMarkerClusterItem.getMarker().getFleetMarker().getLabel();
        return prominence + Detail.EMPTY_CHAR + name + Detail.EMPTY_CHAR + lightMode + Detail.EMPTY_CHAR + label;
    }

    private final String getNoIconBitmapKey(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        int lightMode = birdMarkerClusterItem.getMarker().getFleetMarker().getStandardPinColor().getLightMode();
        String label = birdMarkerClusterItem.getMarker().getFleetMarker().getLabel();
        return lightMode + Detail.EMPTY_CHAR + label;
    }

    @Override // co.bird.android.app.feature.map.renderer.MarkerOptionProvider
    public PointF anchorPoint(BirdMarkerClusterItem<BirdMapMarker> marker) {
        PointF pointF;
        Intrinsics.checkNotNullParameter(marker, "marker");
        PointF pointF2 = this.anchorCache.get(getAnchorKey(marker));
        if (pointF2 == null) {
            IntRange intRange = STANDARD_PIN_STYLE_PROMINENCES;
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int prominence = marker.getMarker().getFleetMarker().getProminence();
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
    public C6378PT bitmapDescriptor(BirdMarkerClusterItem<BirdMapMarker> marker, boolean z) {
        Lazy lazy;
        C6378PT c6378pt;
        Intrinsics.checkNotNullParameter(marker, "marker");
        lazy = LazyKt__LazyJVMKt.lazy(new C13832xc521775f(this, marker, z));
        if (z) {
            String bitmapKey = getBitmapKey(marker);
            return (bitmapKey == null || (c6378pt = (C6378PT) C50896wE2.m7192a(this.bitmapCache, bitmapKey, new BirdMarkerClusterItemOptionProvider$bitmapDescriptor$1$1(lazy))) == null) ? bitmapDescriptor$lambda$1(lazy) : c6378pt;
        }
        return (C6378PT) C50896wE2.m7192a(this.noIconBitmapCache, getNoIconBitmapKey(marker), new BirdMarkerClusterItemOptionProvider$bitmapDescriptor$2(lazy));
    }

    private final PointF anchorPoint(C41792gs6 c41792gs6, FleetMarker fleetMarker) {
        return new PointF(0.5f, c41792gs6.f84397f.getBottom() / c41792gs6.getRoot().getMeasuredHeight());
    }
}
