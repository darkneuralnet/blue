package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.animation.MarkerClickAnimation;
import co.bird.android.app.feature.map.cluster.BaseBirdMarkerClusterManager;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.Detail;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.ChargerBirdBadgeType;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.google.android.gms.maps.model.MarkerOptions;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BQ\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001\u0012\u0014\u0010\u0090\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u008f\u0001\u0012\u0006\u0010,\u001a\u00020\u0013\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u00020\u0013¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001e\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\f\u0010\u0014\u001a\u00020\u0013*\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001a\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0002J\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0003H\u0002J\u001c\u0010 \u001a\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001eH\u0014J\u001e\u0010#\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\"\u001a\u00020!H\u0014J\u001e\u0010$\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u001e\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010&\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-R\u001b\u00109\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010<\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b;\u00108R\u001b\u0010?\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00106\u001a\u0004\b>\u00108R\u001b\u0010B\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\bA\u00108R\u001b\u0010E\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bD\u00108R\u001b\u0010H\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u00108R\u001b\u0010K\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108R\u001b\u0010N\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bM\u00108R\u001b\u0010Q\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\bP\u00108R\u001b\u0010T\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00106\u001a\u0004\bS\u00108R\u001b\u0010W\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bV\u00108R\u001b\u0010Z\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00106\u001a\u0004\bY\u00108R\u001b\u0010]\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u00106\u001a\u0004\b\\\u00108R\u001b\u0010`\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00106\u001a\u0004\b_\u00108R\u001b\u0010c\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\bb\u00108R\u001b\u0010f\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u00106\u001a\u0004\be\u00108R\u001b\u0010i\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u00106\u001a\u0004\bh\u00108R\u001b\u0010l\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u00106\u001a\u0004\bk\u00108R\u001b\u0010o\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u00106\u001a\u0004\bn\u00108R\u001b\u0010r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u00106\u001a\u0004\bq\u00108R\u001b\u0010u\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u00106\u001a\u0004\bt\u00108R\u001b\u0010x\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u00106\u001a\u0004\bw\u00108R\u001b\u0010{\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u00106\u001a\u0004\bz\u00108R \u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R \u0010\u008c\u0001\u001a\u00030\u0088\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0001\u00106\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u0093\u0001"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer;", "LEW0;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "item", "LfM2;", "marker", "", "showInfoWindowForSelectedItem", "LnM2;", "markerSettings", "renderSelected", "renderDeselected", "bird", "LPT;", "deselectedIcon", "selectedIcon", "legacyChargeMarker", "deselectedChargeMarker", "", "markerIconChangesOnSelection", "deselectedPriceBountyMarker", "Landroid/graphics/Bitmap;", "selectedPriceBountyBitmap", "", Entry.TYPE_TEXT, "", "icon", "Landroid/graphics/drawable/Drawable;", "priceBountyIcon", "LDl0;", "cluster", "shouldRenderAsCluster", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "onBeforeClusterItemRendered", "onClusterItemRendered", "selectItem", "deselectItem", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "hourly", "Z", "Lco/bird/android/model/constant/MapMode;", "mode", "Lco/bird/android/model/constant/MapMode;", "LTq4;", "reactiveConfig", "LTq4;", "showDamagedBadges", "incident$delegate", "Lkotlin/Lazy;", "getIncident", "()LPT;", "incident", "alarm$delegate", "getAlarm", "alarm", "asleep$delegate", "getAsleep", "asleep", "captive$delegate", "getCaptive", "captive", "charging$delegate", "getCharging", "charging", "debug$delegate", "getDebug", "debug", "lock$delegate", "getLock", "lock", "lost$delegate", "getLost", "lost", "ready$delegate", "getReady", "ready", "ride$delegate", "getRide", "ride", "relocate$delegate", "getRelocate", "relocate", "unborn$delegate", "getUnborn", "unborn", "offline$delegate", "getOffline", "offline", "low$delegate", "getLow", "low", "repair$delegate", "getRepair", "repair", "noGps$delegate", "getNoGps", "noGps", "broken$delegate", "getBroken", "broken", "charge$delegate", "getCharge", "charge", "bounty$delegate", "getBounty", "bounty", "service$delegate", "getService", "service", "bountyGreen$delegate", "getBountyGreen", "bountyGreen", "bountyRed$delegate", "getBountyRed", "bountyRed", "bountyYellow$delegate", "getBountyYellow", "bountyYellow", "Landroid/util/LruCache;", "iconCache", "Landroid/util/LruCache;", "Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;", "markerAnim", "Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;", "selectedMarkerBitmap", "Landroid/graphics/Bitmap;", "Landroid/view/View;", "deselectedInfoPillView", "Landroid/view/View;", "selectedInfoPillView", "LAP1;", "iconGenerator$delegate", "getIconGenerator", "()LAP1;", "iconGenerator", "LcD1;", "map", "LGl0;", "clusterManager", "<init>", "(Landroid/content/Context;LcD1;LGl0;ZLco/bird/android/model/constant/MapMode;LTq4;Z)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaskBirdClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskBirdClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/TaskBirdClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"})
/* loaded from: classes2.dex */
public final class TaskBirdClusterRenderer extends EW0<BirdMarkerClusterItem<WireBird>> {
    private final Lazy alarm$delegate;
    private final Lazy asleep$delegate;
    private final Lazy bounty$delegate;
    private final Lazy bountyGreen$delegate;
    private final Lazy bountyRed$delegate;
    private final Lazy bountyYellow$delegate;
    private final Lazy broken$delegate;
    private final Lazy captive$delegate;
    private final Lazy charge$delegate;
    private final Lazy charging$delegate;
    private final Context context;
    private final Lazy debug$delegate;
    private View deselectedInfoPillView;
    private final boolean hourly;
    private final LruCache<String, C6378PT> iconCache;
    private final Lazy iconGenerator$delegate;
    private final Lazy incident$delegate;
    private final Lazy lock$delegate;
    private final Lazy lost$delegate;
    private final Lazy low$delegate;
    private final MarkerClickAnimation markerAnim;
    private final MapMode mode;
    private final Lazy noGps$delegate;
    private final Lazy offline$delegate;
    private final C36207Tq4 reactiveConfig;
    private final Lazy ready$delegate;
    private final Lazy relocate$delegate;
    private final Lazy repair$delegate;
    private final Lazy ride$delegate;
    private View selectedInfoPillView;
    private Bitmap selectedMarkerBitmap;
    private final Lazy service$delegate;
    private final boolean showDamagedBadges;
    private final Lazy unborn$delegate;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BirdClusterItemState.values().length];
            try {
                iArr[BirdClusterItemState.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChargerBirdBadgeType.values().length];
            try {
                iArr2[ChargerBirdBadgeType.DAMAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[ChargerBirdBadgeType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskBirdClusterRenderer(Context context, C39011cD1 map, C33116Gl0<BirdMarkerClusterItem<WireBird>> clusterManager, boolean z, MapMode mode, C36207Tq4 reactiveConfig, boolean z2) {
        super(context, map, clusterManager);
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        Lazy lazy9;
        Lazy lazy10;
        Lazy lazy11;
        Lazy lazy12;
        Lazy lazy13;
        Lazy lazy14;
        Lazy lazy15;
        Lazy lazy16;
        Lazy lazy17;
        Lazy lazy18;
        Lazy lazy19;
        Lazy lazy20;
        Lazy lazy21;
        Lazy lazy22;
        Lazy lazy23;
        Lazy lazy24;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.context = context;
        this.hourly = z;
        this.mode = mode;
        this.reactiveConfig = reactiveConfig;
        this.showDamagedBadges = z2;
        lazy = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$incident$2(this));
        this.incident$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$alarm$2(this));
        this.alarm$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$asleep$2(this));
        this.asleep$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$captive$2(this));
        this.captive$delegate = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$charging$2(this));
        this.charging$delegate = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$debug$2(this));
        this.debug$delegate = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$lock$2(this));
        this.lock$delegate = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$lost$2(this));
        this.lost$delegate = lazy8;
        lazy9 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$ready$2(this));
        this.ready$delegate = lazy9;
        lazy10 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$ride$2(this));
        this.ride$delegate = lazy10;
        lazy11 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$relocate$2(this));
        this.relocate$delegate = lazy11;
        lazy12 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$unborn$2(this));
        this.unborn$delegate = lazy12;
        lazy13 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$offline$2(this));
        this.offline$delegate = lazy13;
        lazy14 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$low$2(this));
        this.low$delegate = lazy14;
        lazy15 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$repair$2(this));
        this.repair$delegate = lazy15;
        lazy16 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$noGps$2(this));
        this.noGps$delegate = lazy16;
        lazy17 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$broken$2(this));
        this.broken$delegate = lazy17;
        lazy18 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$charge$2(this));
        this.charge$delegate = lazy18;
        lazy19 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$bounty$2(this));
        this.bounty$delegate = lazy19;
        lazy20 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$service$2(this));
        this.service$delegate = lazy20;
        lazy21 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$bountyGreen$2(this));
        this.bountyGreen$delegate = lazy21;
        lazy22 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$bountyRed$2(this));
        this.bountyRed$delegate = lazy22;
        lazy23 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$bountyYellow$2(this));
        this.bountyYellow$delegate = lazy23;
        this.iconCache = new LruCache<>(20);
        this.markerAnim = new MarkerClickAnimation();
        lazy24 = LazyKt__LazyJVMKt.lazy(new TaskBirdClusterRenderer$iconGenerator$2(this));
        this.iconGenerator$delegate = lazy24;
    }

    private final C6378PT deselectedChargeMarker(WireBird wireBird) {
        boolean z;
        String str;
        String marker = wireBird.getLabel().getMarker();
        if (this.showDamagedBadges && WireBirdKt.isDamaged(wireBird)) {
            z = true;
        } else {
            z = false;
        }
        BountyKind bountyKind = wireBird.getBountyKind();
        String brandName = wireBird.getBrandName();
        if (brandName == null) {
            brandName = "empty";
        }
        if (this.hourly) {
            str = marker + Detail.EMPTY_CHAR + z + Detail.EMPTY_CHAR + bountyKind + Detail.EMPTY_CHAR + brandName;
        } else {
            str = marker + Detail.EMPTY_CHAR + TaskBirdClusterRendererKt.priceLabel(wireBird, EnumC36501Ux1.SHOW_IF_NON_ZERO) + Detail.EMPTY_CHAR + z + Detail.EMPTY_CHAR + bountyKind + Detail.EMPTY_CHAR + brandName;
        }
        C6378PT c6378pt = this.iconCache.get(str);
        if (c6378pt == null) {
            C6378PT deselectedPriceBountyMarker = deselectedPriceBountyMarker(wireBird);
            this.iconCache.put(str, deselectedPriceBountyMarker);
            return deselectedPriceBountyMarker;
        }
        return c6378pt;
    }

    private final C6378PT deselectedIcon(WireBird wireBird) {
        if (WireBirdKt.isSpecialTaskDispatch(wireBird)) {
            return deselectedChargeMarker(wireBird);
        }
        String marker = wireBird.getLabel().getMarker();
        if (marker != null) {
            switch (marker.hashCode()) {
                case -2077740394:
                    if (marker.equals("Captive")) {
                        return getCaptive();
                    }
                    break;
                case -1850668115:
                    if (marker.equals("Repair")) {
                        return getRepair();
                    }
                    break;
                case -1771425505:
                    if (marker.equals("BountyYellow")) {
                        return getBountyYellow();
                    }
                    break;
                case -1756872318:
                    if (marker.equals("Unborn")) {
                        return getUnborn();
                    }
                    break;
                case -1680869110:
                    if (marker.equals("Collect")) {
                        return getIncident();
                    }
                    break;
                case -1194668620:
                    if (marker.equals("RebalanceForCharge")) {
                        return deselectedChargeMarker(wireBird);
                    }
                    break;
                case -1193575755:
                    if (marker.equals("Damaged")) {
                        return getRepair();
                    }
                    break;
                case -1112309080:
                    if (marker.equals("PriceRed")) {
                        C6378PT legacyChargeMarker = legacyChargeMarker(wireBird);
                        if (legacyChargeMarker == null) {
                            return getReady();
                        }
                        return legacyChargeMarker;
                    }
                    break;
                case -926363907:
                    if (marker.equals("PriceYellow")) {
                        C6378PT legacyChargeMarker2 = legacyChargeMarker(wireBird);
                        if (legacyChargeMarker2 == null) {
                            return getReady();
                        }
                        return legacyChargeMarker2;
                    }
                    break;
                case -646160747:
                    if (marker.equals("Service")) {
                        return getService();
                    }
                    break;
                case -477376667:
                    if (marker.equals("Relocate")) {
                        return getRelocate();
                    }
                    break;
                case -2363959:
                    if (marker.equals("DamagedCharge")) {
                        return deselectedChargeMarker(wireBird);
                    }
                    break;
                case 76596:
                    if (marker.equals("Low")) {
                        return getLow();
                    }
                    break;
                case 2373963:
                    if (marker.equals("Lock")) {
                        return getLock();
                    }
                    break;
                case 2374468:
                    if (marker.equals("Lost")) {
                        return getLost();
                    }
                    break;
                case 2546968:
                    if (marker.equals("Ride")) {
                        return getRide();
                    }
                    break;
                case 63343153:
                    if (marker.equals("Alarm")) {
                        return getAlarm();
                    }
                    break;
                case 65906227:
                    if (marker.equals("Debug")) {
                        return getDebug();
                    }
                    break;
                case 75413257:
                    if (marker.equals("NoGps")) {
                        return getNoGps();
                    }
                    break;
                case 78834051:
                    if (marker.equals("Ready")) {
                        return getReady();
                    }
                    break;
                case 116041155:
                    if (marker.equals("Offline")) {
                        return getOffline();
                    }
                    break;
                case 151628018:
                    if (marker.equals("Incident")) {
                        return getIncident();
                    }
                    break;
                case 508063578:
                    if (marker.equals("PriceGreen")) {
                        C6378PT legacyChargeMarker3 = legacyChargeMarker(wireBird);
                        if (legacyChargeMarker3 == null) {
                            return getReady();
                        }
                        return legacyChargeMarker3;
                    }
                    break;
                case 869278662:
                    if (marker.equals("BountyRed")) {
                        return getBountyRed();
                    }
                    break;
                case 1500755056:
                    if (marker.equals("ChargeV2")) {
                        return deselectedChargeMarker(wireBird);
                    }
                    break;
                case 1500759697:
                    if (marker.equals("Charging")) {
                        return getCharging();
                    }
                    break;
                case 1703588137:
                    if (marker.equals("Rebalance")) {
                        return deselectedChargeMarker(wireBird);
                    }
                    break;
                case 1970417462:
                    if (marker.equals("Asleep")) {
                        return getAsleep();
                    }
                    break;
                case 1995629771:
                    if (marker.equals("Bounty")) {
                        return getBounty();
                    }
                    break;
                case 1998218229:
                    if (marker.equals("Broken")) {
                        return getBroken();
                    }
                    break;
                case 2017201876:
                    if (marker.equals("Charge")) {
                        return getCharge();
                    }
                    break;
                case 2073024500:
                    if (marker.equals("DamagedTransport")) {
                        return deselectedChargeMarker(wireBird);
                    }
                    break;
                case 2143371512:
                    if (marker.equals("BountyGreen")) {
                        return getBountyGreen();
                    }
                    break;
            }
        }
        return getReady();
    }

    private final C6378PT deselectedPriceBountyMarker(WireBird wireBird) {
        C36434Up6 m80778c;
        boolean z;
        int dispatchDrawable;
        View view = this.deselectedInfoPillView;
        if (view == null || (m80778c = C36434Up6.m80780a(view)) == null) {
            m80778c = C36434Up6.m80778c(C40788fB0.m41772j(this.context));
            this.deselectedInfoPillView = m80778c.getRoot();
        }
        Intrinsics.checkNotNullExpressionValue(m80778c, "deselectedInfoPillView?.…illView = it.root\n      }");
        Unit unit = null;
        if (WireBirdKt.isSpecialTaskDispatch(wireBird)) {
            m80778c.f38091d.setBorderColor(-16777216);
            m80778c.f38095h.setImageDrawable(new ColorDrawable(-16777216));
            ImageView imageView = m80778c.f38094g;
            Context context = this.context;
            dispatchDrawable = TaskBirdClusterRendererKt.dispatchDrawable(wireBird);
            imageView.setImageDrawable(NA0.m94299e(context, dispatchDrawable));
            ImageView imageView2 = m80778c.f38092e;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.smallDamagedBadge");
            C49520tu6.show$default(imageView2, false, 0, 2, null);
            ImageView imageView3 = m80778c.f38093f;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.smallDispatchBadge");
            C49520tu6.m11233r(imageView3);
        } else {
            m80778c.f38091d.setBorderColor(wireBird.getLabel().getColor());
            m80778c.f38095h.setImageDrawable(new ColorDrawable(wireBird.getLabel().getColor()));
            m80778c.f38094g.setImageDrawable(priceBountyIcon(wireBird));
            int i = WhenMappings.$EnumSwitchMapping$1[wireBird.getLabel().getChargerBadgeType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ImageView imageView4 = m80778c.f38092e;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "binding.smallDamagedBadge");
                    if (WireBirdKt.isDamaged(wireBird) && this.showDamagedBadges) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C49520tu6.show$default(imageView4, z, 0, 2, null);
                }
            } else {
                ImageView imageView5 = m80778c.f38092e;
                Intrinsics.checkNotNullExpressionValue(imageView5, "binding.smallDamagedBadge");
                C49520tu6.show$default(imageView5, this.showDamagedBadges, 0, 2, null);
            }
            ImageView imageView6 = m80778c.f38093f;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.smallDispatchBadge");
            C49520tu6.show$default(imageView6, false, 0, 2, null);
        }
        if (!this.hourly) {
            m80778c.f38089b.setText(TaskBirdClusterRendererKt.priceLabel(wireBird, EnumC36501Ux1.SHOW_IF_NON_ZERO));
        }
        TextView textView = m80778c.f38089b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.amount");
        C49520tu6.show$default(textView, !this.hourly, 0, 2, null);
        if (this.reactiveConfig.m82623f8().getValue().getChargerConfig().getEnableBrandedChargerExperience()) {
            String brandName = wireBird.getBrandName();
            if (brandName != null) {
                m80778c.f38090c.setText(brandName);
                TextView textView2 = m80778c.f38090c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.brand");
                C49520tu6.m11233r(textView2);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                TextView textView3 = m80778c.f38090c;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.brand");
                C49520tu6.m11239l(textView3);
            }
        } else {
            TextView textView4 = m80778c.f38090c;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.brand");
            C49520tu6.m11239l(textView4);
        }
        Context context2 = this.context;
        FrameLayout root = m80778c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C40788fB0.iconBitmapDescriptor$default(context2, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    private final C6378PT getAlarm() {
        return (C6378PT) this.alarm$delegate.getValue();
    }

    private final C6378PT getAsleep() {
        return (C6378PT) this.asleep$delegate.getValue();
    }

    private final C6378PT getBounty() {
        return (C6378PT) this.bounty$delegate.getValue();
    }

    private final C6378PT getBountyGreen() {
        return (C6378PT) this.bountyGreen$delegate.getValue();
    }

    private final C6378PT getBountyRed() {
        return (C6378PT) this.bountyRed$delegate.getValue();
    }

    private final C6378PT getBountyYellow() {
        return (C6378PT) this.bountyYellow$delegate.getValue();
    }

    private final C6378PT getBroken() {
        return (C6378PT) this.broken$delegate.getValue();
    }

    private final C6378PT getCaptive() {
        return (C6378PT) this.captive$delegate.getValue();
    }

    private final C6378PT getCharge() {
        return (C6378PT) this.charge$delegate.getValue();
    }

    private final C6378PT getCharging() {
        return (C6378PT) this.charging$delegate.getValue();
    }

    private final C6378PT getDebug() {
        return (C6378PT) this.debug$delegate.getValue();
    }

    private final AP1 getIconGenerator() {
        return (AP1) this.iconGenerator$delegate.getValue();
    }

    private final C6378PT getIncident() {
        return (C6378PT) this.incident$delegate.getValue();
    }

    private final C6378PT getLock() {
        return (C6378PT) this.lock$delegate.getValue();
    }

    private final C6378PT getLost() {
        return (C6378PT) this.lost$delegate.getValue();
    }

    private final C6378PT getLow() {
        return (C6378PT) this.low$delegate.getValue();
    }

    private final C6378PT getNoGps() {
        return (C6378PT) this.noGps$delegate.getValue();
    }

    private final C6378PT getOffline() {
        return (C6378PT) this.offline$delegate.getValue();
    }

    private final C6378PT getReady() {
        return (C6378PT) this.ready$delegate.getValue();
    }

    private final C6378PT getRelocate() {
        return (C6378PT) this.relocate$delegate.getValue();
    }

    private final C6378PT getRepair() {
        return (C6378PT) this.repair$delegate.getValue();
    }

    private final C6378PT getRide() {
        return (C6378PT) this.ride$delegate.getValue();
    }

    private final C6378PT getService() {
        return (C6378PT) this.service$delegate.getValue();
    }

    private final C6378PT getUnborn() {
        return (C6378PT) this.unborn$delegate.getValue();
    }

    private final C6378PT icon(String str, int i) {
        C33419Hs6 m103254c = C33419Hs6.m103254c(C40788fB0.m41772j(this.context));
        Intrinsics.checkNotNullExpressionValue(m103254c, "inflate(context.layoutInflater)");
        if (this.hourly) {
            m103254c.f14116b.setImageResource(C48193rg4.charger_pin_hourly);
            m103254c.f14117c.setVisibility(4);
        } else {
            m103254c.f14116b.setImageResource(i);
            m103254c.f14117c.setText(str);
        }
        Context context = this.context;
        FrameLayout root = m103254c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C6378PT legacyChargeMarker(WireBird wireBird) {
        C6378PT c6378pt;
        String marker = wireBird.getLabel().getMarker();
        String priceLabel = TaskBirdClusterRendererKt.priceLabel(wireBird, EnumC36501Ux1.SHOW_NEVER);
        String str = "v1-" + marker + Detail.EMPTY_CHAR + priceLabel;
        C6378PT c6378pt2 = this.iconCache.get(str);
        if (c6378pt2 == null) {
            if (marker != null) {
                int hashCode = marker.hashCode();
                if (hashCode != -1112309080) {
                    if (hashCode != -926363907) {
                        if (hashCode == 508063578 && marker.equals("PriceGreen")) {
                            c6378pt = icon(priceLabel, C34479Mg4.marker_price_green);
                        }
                    } else if (marker.equals("PriceYellow")) {
                        c6378pt = icon(priceLabel, C34479Mg4.marker_price_yellow);
                    }
                } else if (marker.equals("PriceRed")) {
                    c6378pt = icon(priceLabel, C34479Mg4.marker_price_red);
                }
                if (c6378pt != null) {
                    return null;
                }
                this.iconCache.put(str, c6378pt);
                return c6378pt;
            }
            c6378pt = null;
            if (c6378pt != null) {
            }
        } else {
            return c6378pt2;
        }
    }

    private final boolean markerIconChangesOnSelection(WireBird wireBird) {
        List listOf;
        boolean contains;
        if (!WireBirdKt.isSpecialTaskDispatch(wireBird)) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ChargeV2", "Rebalance", "RebalanceForCharge", "DamagedTransport"});
            contains = CollectionsKt___CollectionsKt.contains(listOf, wireBird.getLabel().getMarker());
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Drawable priceBountyIcon(WireBird wireBird) {
        int i;
        String marker = wireBird.getLabel().getMarker();
        if (marker != null) {
            switch (marker.hashCode()) {
                case -1194668620:
                    if (marker.equals("RebalanceForCharge")) {
                        i = C48193rg4.ic_rebalance_white;
                        break;
                    }
                    break;
                case -2363959:
                    if (marker.equals("DamagedCharge")) {
                        i = C48193rg4.ic_charge_white;
                        break;
                    }
                    break;
                case 1703588137:
                    if (marker.equals("Rebalance")) {
                        i = C48193rg4.ic_rebalance_white;
                        break;
                    }
                    break;
                case 2073024500:
                    if (marker.equals("DamagedTransport")) {
                        i = C48193rg4.ic_rebalance_white;
                        break;
                    }
                    break;
            }
            return NA0.m94299e(this.context, i);
        }
        i = C48193rg4.ic_charge_white;
        return NA0.m94299e(this.context, i);
    }

    private final void renderDeselected(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, C45633nM2 c45633nM2) {
        c45633nM2.m23943f(0.0f);
        c45633nM2.m23945d(deselectedIcon(birdMarkerClusterItem.getMarker()));
    }

    private final void renderSelected(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, C45633nM2 c45633nM2) {
        c45633nM2.m23943f(Float.MAX_VALUE);
        C6378PT selectedIcon = selectedIcon(birdMarkerClusterItem.getMarker());
        if (selectedIcon != null) {
            c45633nM2.m23945d(selectedIcon);
        } else {
            renderDeselected(birdMarkerClusterItem, c45633nM2);
        }
    }

    private final C6378PT selectedIcon(WireBird wireBird) {
        if (!markerIconChangesOnSelection(wireBird)) {
            return null;
        }
        Bitmap bitmap = this.selectedMarkerBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap selectedPriceBountyBitmap = selectedPriceBountyBitmap(wireBird);
        this.selectedMarkerBitmap = selectedPriceBountyBitmap;
        if (selectedPriceBountyBitmap == null) {
            return null;
        }
        return C6780QT.m88495a(selectedPriceBountyBitmap);
    }

    private final Bitmap selectedPriceBountyBitmap(WireBird wireBird) {
        C36668Vp6 m79381c;
        int dispatchDrawable;
        View view = this.selectedInfoPillView;
        if (view == null || (m79381c = C36668Vp6.m79383a(view)) == null) {
            m79381c = C36668Vp6.m79381c(C40788fB0.m41772j(this.context));
            this.selectedInfoPillView = m79381c.getRoot();
        }
        Intrinsics.checkNotNullExpressionValue(m79381c, "selectedInfoPillView?.le…illView = it.root\n      }");
        boolean z = true;
        if (WireBirdKt.isSpecialTaskDispatch(wireBird)) {
            m79381c.f39813e.setBorderColor(-16777216);
            m79381c.f39817i.setImageDrawable(new ColorDrawable(-16777216));
            ImageView imageView = m79381c.f39816h;
            Context context = this.context;
            dispatchDrawable = TaskBirdClusterRendererKt.dispatchDrawable(wireBird);
            imageView.setImageDrawable(NA0.m94299e(context, dispatchDrawable));
            ImageView imageView2 = m79381c.f39814f;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.largeDamagedBadge");
            C49520tu6.show$default(imageView2, false, 0, 2, null);
            ImageView imageView3 = m79381c.f39815g;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.largeDispatchBadge");
            C49520tu6.show$default(imageView3, true, 0, 2, null);
        } else {
            m79381c.f39813e.setBorderColor(wireBird.getLabel().getColor());
            m79381c.f39817i.setImageDrawable(new ColorDrawable(wireBird.getLabel().getColor()));
            m79381c.f39816h.setImageDrawable(priceBountyIcon(wireBird));
            int i = WhenMappings.$EnumSwitchMapping$1[wireBird.getLabel().getChargerBadgeType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    ImageView imageView4 = m79381c.f39814f;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "binding.largeDamagedBadge");
                    if (!WireBirdKt.isDamaged(wireBird) || !this.showDamagedBadges) {
                        z = false;
                    }
                    C49520tu6.show$default(imageView4, z, 0, 2, null);
                }
            } else {
                ImageView imageView5 = m79381c.f39814f;
                Intrinsics.checkNotNullExpressionValue(imageView5, "binding.largeDamagedBadge");
                C49520tu6.show$default(imageView5, this.showDamagedBadges, 0, 2, null);
            }
            ImageView imageView6 = m79381c.f39815g;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.largeDispatchBadge");
            C49520tu6.show$default(imageView6, false, 0, 2, null);
        }
        boolean showBatteryPercent = this.reactiveConfig.m82623f8().getValue().getChargerMapConfig().getShowBatteryPercent();
        Group group = m79381c.f39811c;
        Intrinsics.checkNotNullExpressionValue(group, "binding.batteryInfoContainer");
        C49520tu6.show$default(group, showBatteryPercent, 0, 2, null);
        TextView textView = m79381c.f39812d;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (showBatteryPercent) {
            layoutParams2.removeRule(6);
        } else {
            layoutParams2.addRule(6, C31680Ah4.largeIconBackground);
        }
        textView.setLayoutParams(layoutParams2);
        m79381c.f39818j.setText(C51916xx1.percentage$default(C51916xx1.f118396a, Float.valueOf(wireBird.getBatteryLevel() / 100.0f), 0, 2, null));
        m79381c.f39810b.setPercent(wireBird.getBatteryLevel());
        m79381c.f39812d.setText(wireBird.getCode());
        Context context2 = this.context;
        AP1 iconGenerator = getIconGenerator();
        FrameLayout root = m79381c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C40788fB0.m41766p(context2, iconGenerator, root, null);
    }

    private final void showInfoWindowForSelectedItem(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, C40889fM2 c40889fM2) {
        if (!markerIconChangesOnSelection(birdMarkerClusterItem.getMarker())) {
            BaseBirdMarkerClusterManager.Companion.showInfoWindow(c40889fM2, birdMarkerClusterItem);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // p000.EW0
    public boolean shouldRenderAsCluster(InterfaceC32414Dl0<BirdMarkerClusterItem<WireBird>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        if (cluster.mo75549a() > 30) {
            return true;
        }
        return false;
    }

    @Override // p000.EW0
    public void deselectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        C45633nM2 c45633nM2 = new C45633nM2();
        renderDeselected(item, c45633nM2);
        c45633nM2.m23947b(marker);
        marker.m41530d();
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(BirdMarkerClusterItem<WireBird> item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        C45633nM2 c45633nM2 = new C45633nM2();
        if (WhenMappings.$EnumSwitchMapping$0[item.getState().ordinal()] == 1) {
            renderSelected(item, c45633nM2);
        } else {
            renderDeselected(item, c45633nM2);
        }
        c45633nM2.m23946c(markerOptions);
    }

    @Override // p000.EW0
    public void onClusterItemRendered(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.onClusterItemRendered((TaskBirdClusterRenderer) item, marker);
        if (WhenMappings.$EnumSwitchMapping$0[item.getState().ordinal()] == 1) {
            showInfoWindowForSelectedItem(item, marker);
        } else {
            marker.m41530d();
        }
    }

    @Override // p000.EW0
    public void selectItem(BirdMarkerClusterItem<WireBird> item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        C45633nM2 c45633nM2 = new C45633nM2();
        renderSelected(item, c45633nM2);
        c45633nM2.m23947b(marker);
        showInfoWindowForSelectedItem(item, marker);
    }
}
