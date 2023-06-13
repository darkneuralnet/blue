package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.cluster.bird.BirdClusterItemState;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.configs.Config;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 J2\u00020\u0001:\u0003JKLB'\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bH\u0010IJ,\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J2\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u0013\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u0014\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u001a\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\"\u0010\u001a\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u0012\u0010\u001b\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001c\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001d\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001e\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010\u001f\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u001b\u0010 \u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0012\u0010#\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J.\u0010%\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\tH\u0002J#\u0010&\u001a\u0004\u0018\u00010\u0011*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0004\b&\u0010'J\u001c\u0010*\u001a\u00020(2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(J\u001c\u0010+\u001a\u00020(2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(J\u001c\u0010,\u001a\u00020(2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010)\u001a\u00020(R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R'\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020>0=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010AR\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010ER\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010E¨\u0006M"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconLoader;", "", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/wire/WireBird;", "item", "", "selected", "Lkotlin/Pair;", "LPT;", "", "getIconAndAccessibilityLabel", "multiModalEnabled", "shouldShowPills", "privateBirdContentDescription", "defaultContentDescription", "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;", "toPinState", "", "getViewRes", "getBatteryLevelColor", "getBatteryLevelDrawable", "isMultiModalEnabled", "shouldShowGroundOverlay", "LBK2;", "markerOverridesManager", "Lrt2;", "getOverrideContentIcon", "getMultiModalContentDrawable", "getPinBackgroundColor", "getPinContentColor", "getPinRingColor", "getPinAccentColor", "getBadgeIcon", "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;)Ljava/lang/Integer;", "getBadgeBackgroundColor", "getBadgeContentColor", "overrideContentDescription", "getContentDescription", "getPillText", "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;Z)Ljava/lang/Integer;", "LnM2;", "markerSettings", "renderSelected", "renderDeselected", "renderForState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LBK2;", "LTq4;", "reactiveConfig", "LTq4;", "LOh;", "buildConfig", "LOh;", "LAP1;", "iconGenerator$delegate", "Lkotlin/Lazy;", "getIconGenerator", "()LAP1;", "iconGenerator", "", "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;", "markerPinViews$delegate", "getMarkerPinViews", "()Ljava/util/Map;", "markerPinViews", "privateBirdContentDescription$delegate", "getPrivateBirdContentDescription", "()Ljava/lang/String;", "defaultContentDescription$delegate", "getDefaultContentDescription", "<init>", "(Landroid/content/Context;LBK2;LTq4;LOh;)V", "Companion", "MapMarkerPinState", "MarkerPinWrapper", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIconLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconLoader.kt\nco/bird/android/app/feature/map/renderer/IconLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"})
/* loaded from: classes2.dex */
public final class IconLoader {
    private static final int BATTERY_25 = 25;
    private static final int BATTERY_50 = 50;
    private static final int BATTERY_75 = 75;
    private static final int LOW_BATTERY_THRESHOLD = 10;
    public static final float MAP_MARKER_ANCHOR_POINT_HEIGHT_PERCENTAGE = 1.0f;
    public static final float MAP_MARKER_ANCHOR_POINT_WIDTH_PERCENTAGE = 0.5f;
    private final InterfaceC6097Oh buildConfig;
    private final Context context;
    private final Lazy defaultContentDescription$delegate;
    private final Lazy iconGenerator$delegate;
    private final BK2 markerOverridesManager;
    private final Lazy markerPinViews$delegate;
    private final Lazy privateBirdContentDescription$delegate;
    private final C36207Tq4 reactiveConfig;
    public static final Companion Companion = new Companion(null);
    private static final LruCache<MapMarkerPinState, C6378PT> pinStateBitmapDescriptorCache = new LruCache<>(24);

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconLoader$Companion;", "", "", "BATTERY_25", "I", "BATTERY_50", "BATTERY_75", "LOW_BATTERY_THRESHOLD", "", "MAP_MARKER_ANCHOR_POINT_HEIGHT_PERCENTAGE", "F", "MAP_MARKER_ANCHOR_POINT_WIDTH_PERCENTAGE", "Landroid/util/LruCache;", "Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;", "LPT;", "pinStateBitmapDescriptorCache", "Landroid/util/LruCache;", "<init>", "()V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b<\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003JÊ\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00032\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0005HÖ\u0001J\t\u0010E\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\"R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006F"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;", "", "multiModalEnabled", "", "viewRes", "", "batteryLevelColor", "batteryLevelDrawable", "showGroundOverlay", "overrideId", "", "overrideBitmapReady", "multiModalContentDrawable", "pinBackgroundColor", "pinContentColor", "pinRingColor", "pinAccentColor", "badgeIconDrawable", "badgeBackgroundColor", "badgeContentColor", "pillTextRes", "contentDescription", "isExternalFeedVehicle", "(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)V", "getBadgeBackgroundColor", "()I", "getBadgeContentColor", "getBadgeIconDrawable", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBatteryLevelColor", "getBatteryLevelDrawable", "getContentDescription", "()Ljava/lang/String;", "()Z", "getMultiModalContentDrawable", "getMultiModalEnabled", "getOverrideBitmapReady", "getOverrideId", "getPillTextRes", "getPinAccentColor", "getPinBackgroundColor", "getPinContentColor", "getPinRingColor", "getShowGroundOverlay", "getViewRes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZIIIZLjava/lang/String;ZIIIIILjava/lang/Integer;IILjava/lang/Integer;Ljava/lang/String;Z)Lco/bird/android/app/feature/map/renderer/IconLoader$MapMarkerPinState;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class MapMarkerPinState {
        private final int badgeBackgroundColor;
        private final int badgeContentColor;
        private final Integer badgeIconDrawable;
        private final int batteryLevelColor;
        private final int batteryLevelDrawable;
        private final String contentDescription;
        private final boolean isExternalFeedVehicle;
        private final int multiModalContentDrawable;
        private final boolean multiModalEnabled;
        private final boolean overrideBitmapReady;
        private final String overrideId;
        private final Integer pillTextRes;
        private final int pinAccentColor;
        private final int pinBackgroundColor;
        private final int pinContentColor;
        private final int pinRingColor;
        private final boolean showGroundOverlay;
        private final int viewRes;

        public MapMarkerPinState(boolean z, int i, int i2, int i3, boolean z2, String str, boolean z3, int i4, int i5, int i6, int i7, int i8, Integer num, int i9, int i10, Integer num2, String str2, boolean z4) {
            this.multiModalEnabled = z;
            this.viewRes = i;
            this.batteryLevelColor = i2;
            this.batteryLevelDrawable = i3;
            this.showGroundOverlay = z2;
            this.overrideId = str;
            this.overrideBitmapReady = z3;
            this.multiModalContentDrawable = i4;
            this.pinBackgroundColor = i5;
            this.pinContentColor = i6;
            this.pinRingColor = i7;
            this.pinAccentColor = i8;
            this.badgeIconDrawable = num;
            this.badgeBackgroundColor = i9;
            this.badgeContentColor = i10;
            this.pillTextRes = num2;
            this.contentDescription = str2;
            this.isExternalFeedVehicle = z4;
        }

        public final boolean component1() {
            return this.multiModalEnabled;
        }

        public final int component10() {
            return this.pinContentColor;
        }

        public final int component11() {
            return this.pinRingColor;
        }

        public final int component12() {
            return this.pinAccentColor;
        }

        public final Integer component13() {
            return this.badgeIconDrawable;
        }

        public final int component14() {
            return this.badgeBackgroundColor;
        }

        public final int component15() {
            return this.badgeContentColor;
        }

        public final Integer component16() {
            return this.pillTextRes;
        }

        public final String component17() {
            return this.contentDescription;
        }

        public final boolean component18() {
            return this.isExternalFeedVehicle;
        }

        public final int component2() {
            return this.viewRes;
        }

        public final int component3() {
            return this.batteryLevelColor;
        }

        public final int component4() {
            return this.batteryLevelDrawable;
        }

        public final boolean component5() {
            return this.showGroundOverlay;
        }

        public final String component6() {
            return this.overrideId;
        }

        public final boolean component7() {
            return this.overrideBitmapReady;
        }

        public final int component8() {
            return this.multiModalContentDrawable;
        }

        public final int component9() {
            return this.pinBackgroundColor;
        }

        public final MapMarkerPinState copy(boolean z, int i, int i2, int i3, boolean z2, String str, boolean z3, int i4, int i5, int i6, int i7, int i8, Integer num, int i9, int i10, Integer num2, String str2, boolean z4) {
            return new MapMarkerPinState(z, i, i2, i3, z2, str, z3, i4, i5, i6, i7, i8, num, i9, i10, num2, str2, z4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MapMarkerPinState) {
                MapMarkerPinState mapMarkerPinState = (MapMarkerPinState) obj;
                return this.multiModalEnabled == mapMarkerPinState.multiModalEnabled && this.viewRes == mapMarkerPinState.viewRes && this.batteryLevelColor == mapMarkerPinState.batteryLevelColor && this.batteryLevelDrawable == mapMarkerPinState.batteryLevelDrawable && this.showGroundOverlay == mapMarkerPinState.showGroundOverlay && Intrinsics.areEqual(this.overrideId, mapMarkerPinState.overrideId) && this.overrideBitmapReady == mapMarkerPinState.overrideBitmapReady && this.multiModalContentDrawable == mapMarkerPinState.multiModalContentDrawable && this.pinBackgroundColor == mapMarkerPinState.pinBackgroundColor && this.pinContentColor == mapMarkerPinState.pinContentColor && this.pinRingColor == mapMarkerPinState.pinRingColor && this.pinAccentColor == mapMarkerPinState.pinAccentColor && Intrinsics.areEqual(this.badgeIconDrawable, mapMarkerPinState.badgeIconDrawable) && this.badgeBackgroundColor == mapMarkerPinState.badgeBackgroundColor && this.badgeContentColor == mapMarkerPinState.badgeContentColor && Intrinsics.areEqual(this.pillTextRes, mapMarkerPinState.pillTextRes) && Intrinsics.areEqual(this.contentDescription, mapMarkerPinState.contentDescription) && this.isExternalFeedVehicle == mapMarkerPinState.isExternalFeedVehicle;
            }
            return false;
        }

        public final int getBadgeBackgroundColor() {
            return this.badgeBackgroundColor;
        }

        public final int getBadgeContentColor() {
            return this.badgeContentColor;
        }

        public final Integer getBadgeIconDrawable() {
            return this.badgeIconDrawable;
        }

        public final int getBatteryLevelColor() {
            return this.batteryLevelColor;
        }

        public final int getBatteryLevelDrawable() {
            return this.batteryLevelDrawable;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final int getMultiModalContentDrawable() {
            return this.multiModalContentDrawable;
        }

        public final boolean getMultiModalEnabled() {
            return this.multiModalEnabled;
        }

        public final boolean getOverrideBitmapReady() {
            return this.overrideBitmapReady;
        }

        public final String getOverrideId() {
            return this.overrideId;
        }

        public final Integer getPillTextRes() {
            return this.pillTextRes;
        }

        public final int getPinAccentColor() {
            return this.pinAccentColor;
        }

        public final int getPinBackgroundColor() {
            return this.pinBackgroundColor;
        }

        public final int getPinContentColor() {
            return this.pinContentColor;
        }

        public final int getPinRingColor() {
            return this.pinRingColor;
        }

        public final boolean getShowGroundOverlay() {
            return this.showGroundOverlay;
        }

        public final int getViewRes() {
            return this.viewRes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v36 */
        /* JADX WARN: Type inference failed for: r0v37 */
        /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
        public int hashCode() {
            boolean z = this.multiModalEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int hashCode = ((((((r0 * 31) + Integer.hashCode(this.viewRes)) * 31) + Integer.hashCode(this.batteryLevelColor)) * 31) + Integer.hashCode(this.batteryLevelDrawable)) * 31;
            ?? r2 = this.showGroundOverlay;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            String str = this.overrideId;
            int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            ?? r22 = this.overrideBitmapReady;
            int i3 = r22;
            if (r22 != 0) {
                i3 = 1;
            }
            int hashCode3 = (((((((((((hashCode2 + i3) * 31) + Integer.hashCode(this.multiModalContentDrawable)) * 31) + Integer.hashCode(this.pinBackgroundColor)) * 31) + Integer.hashCode(this.pinContentColor)) * 31) + Integer.hashCode(this.pinRingColor)) * 31) + Integer.hashCode(this.pinAccentColor)) * 31;
            Integer num = this.badgeIconDrawable;
            int hashCode4 = (((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.badgeBackgroundColor)) * 31) + Integer.hashCode(this.badgeContentColor)) * 31;
            Integer num2 = this.pillTextRes;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.contentDescription;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z2 = this.isExternalFeedVehicle;
            return hashCode6 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean isExternalFeedVehicle() {
            return this.isExternalFeedVehicle;
        }

        public String toString() {
            boolean z = this.multiModalEnabled;
            int i = this.viewRes;
            int i2 = this.batteryLevelColor;
            int i3 = this.batteryLevelDrawable;
            boolean z2 = this.showGroundOverlay;
            String str = this.overrideId;
            boolean z3 = this.overrideBitmapReady;
            int i4 = this.multiModalContentDrawable;
            int i5 = this.pinBackgroundColor;
            int i6 = this.pinContentColor;
            int i7 = this.pinRingColor;
            int i8 = this.pinAccentColor;
            Integer num = this.badgeIconDrawable;
            int i9 = this.badgeBackgroundColor;
            int i10 = this.badgeContentColor;
            Integer num2 = this.pillTextRes;
            String str2 = this.contentDescription;
            boolean z4 = this.isExternalFeedVehicle;
            return "MapMarkerPinState(multiModalEnabled=" + z + ", viewRes=" + i + ", batteryLevelColor=" + i2 + ", batteryLevelDrawable=" + i3 + ", showGroundOverlay=" + z2 + ", overrideId=" + str + ", overrideBitmapReady=" + z3 + ", multiModalContentDrawable=" + i4 + ", pinBackgroundColor=" + i5 + ", pinContentColor=" + i6 + ", pinRingColor=" + i7 + ", pinAccentColor=" + i8 + ", badgeIconDrawable=" + num + ", badgeBackgroundColor=" + i9 + ", badgeContentColor=" + i10 + ", pillTextRes=" + num2 + ", contentDescription=" + str2 + ", isExternalFeedVehicle=" + z4 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 F2\u00020\u0001:\u0001FB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010B\u001a\u00020C*\u00020\b2\u0006\u0010D\u001a\u00020EH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u001f\u0010\nR\u001d\u0010!\u001a\u0004\u0018\u00010\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b'\u0010\nR\u001d\u0010)\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\f\u001a\u0004\b*\u0010\nR\u001d\u0010,\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b-\u0010\nR\u001d\u0010/\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\f\u001a\u0004\b0\u0010\nR\u001d\u00102\u001a\u0004\u0018\u00010\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b3\u0010\u0013R\u001d\u00105\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b6\u0010\nR\u001d\u00108\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\f\u001a\u0004\b9\u0010\nR\u001d\u0010;\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b<\u0010\nR\u0011\u0010>\u001a\u00020?¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006G"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "viewRes", "", "(Landroid/content/Context;I)V", "badgeBg", "Landroid/widget/ImageView;", "getBadgeBg", "()Landroid/widget/ImageView;", "badgeBg$delegate", "Lkotlin/Lazy;", "badgeContent", "getBadgeContent", "badgeContent$delegate", "badgeFrame", "Landroid/widget/FrameLayout;", "getBadgeFrame", "()Landroid/widget/FrameLayout;", "badgeFrame$delegate", "badgeInnerBg", "getBadgeInnerBg", "badgeInnerBg$delegate", "badgeOuter", "getBadgeOuter", "badgeOuter$delegate", "badgeShadow", "getBadgeShadow", "badgeShadow$delegate", "overrideImage", "getOverrideImage", "overrideImage$delegate", "pillText", "Landroid/widget/TextView;", "getPillText", "()Landroid/widget/TextView;", "pillText$delegate", "pinBatteryBg", "getPinBatteryBg", "pinBatteryBg$delegate", "pinBatteryLevel", "getPinBatteryLevel", "pinBatteryLevel$delegate", "pinBg", "getPinBg", "pinBg$delegate", "pinContent", "getPinContent", "pinContent$delegate", "pinFrame", "getPinFrame", "pinFrame$delegate", "pinGround", "getPinGround", "pinGround$delegate", "pinRing", "getPinRing", "pinRing$delegate", "pinShadow", "getPinShadow", "pinShadow$delegate", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "applyShadow", "", "shadowParams", "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class MarkerPinWrapper {
        public static final Companion Companion = new Companion(null);
        private static final int SHADOW_COLOR = 1207959552;
        private static final int SHADOW_PAINT_COLOR = 1207959552;
        private final Lazy badgeBg$delegate;
        private final Lazy badgeContent$delegate;
        private final Lazy badgeFrame$delegate;
        private final Lazy badgeInnerBg$delegate;
        private final Lazy badgeOuter$delegate;
        private final Lazy badgeShadow$delegate;
        private final Lazy overrideImage$delegate;
        private final Lazy pillText$delegate;
        private final Lazy pinBatteryBg$delegate;
        private final Lazy pinBatteryLevel$delegate;
        private final Lazy pinBg$delegate;
        private final Lazy pinContent$delegate;
        private final Lazy pinFrame$delegate;
        private final Lazy pinGround$delegate;
        private final Lazy pinRing$delegate;
        private final Lazy pinShadow$delegate;
        private final View view;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper$Companion;", "", "()V", "SHADOW_COLOR", "", "SHADOW_PAINT_COLOR", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public MarkerPinWrapper(Context context, int i) {
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
            IconInitParams iconInitParams;
            ShadowInitParams badgeShadow;
            ShadowInitParams pinShadow;
            Intrinsics.checkNotNullParameter(context, "context");
            this.view = C40788fB0.m41762t(context, i, null);
            lazy = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pillText$2(this));
            this.pillText$delegate = lazy;
            lazy2 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinFrame$2(this));
            this.pinFrame$delegate = lazy2;
            lazy3 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinShadow$2(this));
            this.pinShadow$delegate = lazy3;
            lazy4 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinBg$2(this));
            this.pinBg$delegate = lazy4;
            lazy5 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinRing$2(this));
            this.pinRing$delegate = lazy5;
            lazy6 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinGround$2(this));
            this.pinGround$delegate = lazy6;
            lazy7 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinBatteryBg$2(this));
            this.pinBatteryBg$delegate = lazy7;
            lazy8 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinBatteryLevel$2(this));
            this.pinBatteryLevel$delegate = lazy8;
            lazy9 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$pinContent$2(this));
            this.pinContent$delegate = lazy9;
            lazy10 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$overrideImage$2(this));
            this.overrideImage$delegate = lazy10;
            lazy11 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeFrame$2(this));
            this.badgeFrame$delegate = lazy11;
            lazy12 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeShadow$2(this));
            this.badgeShadow$delegate = lazy12;
            lazy13 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeBg$2(this));
            this.badgeBg$delegate = lazy13;
            lazy14 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeOuter$2(this));
            this.badgeOuter$delegate = lazy14;
            lazy15 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeInnerBg$2(this));
            this.badgeInnerBg$delegate = lazy15;
            lazy16 = LazyKt__LazyJVMKt.lazy(new IconLoader$MarkerPinWrapper$badgeContent$2(this));
            this.badgeContent$delegate = lazy16;
            if (i == C45258mj4.marker_bird_unselected) {
                iconInitParams = new IconInitParams(new ShadowInitParams(50.0f, 50.0f, 5.0f, 0.0f, 1.0f, 7.0f, 10.0f), new ShadowInitParams(22.0f, 22.0f, 1.0f, 0.0f, 1.0f, 8.0f, 8.0f));
            } else if (i == C45258mj4.marker_bird_selected) {
                iconInitParams = new IconInitParams(new ShadowInitParams(52.0f, 52.0f, 5.0f, 0.0f, 1.0f, 6.0f, 6.0f), new ShadowInitParams(22.0f, 22.0f, 1.0f, 0.0f, 1.0f, 8.0f, 8.0f));
            } else if (i == C45258mj4.marker_bird_riding) {
                iconInitParams = new IconInitParams(new ShadowInitParams(78.0f, 70.0f, 8.0f, 0.0f, 3.0f, 13.0f, 18.0f), new ShadowInitParams(28.0f, 28.0f, 1.0f, 0.0f, 1.0f, 7.0f, 8.0f));
            } else {
                iconInitParams = new IconInitParams(null, null, 3, null);
            }
            ImageView pinShadow2 = getPinShadow();
            if (pinShadow2 != null && (pinShadow = iconInitParams.getPinShadow()) != null) {
                applyShadow(pinShadow2, pinShadow);
            }
            ImageView badgeShadow2 = getBadgeShadow();
            if (badgeShadow2 != null && (badgeShadow = iconInitParams.getBadgeShadow()) != null) {
                applyShadow(badgeShadow2, badgeShadow);
            }
        }

        private final void applyShadow(ImageView imageView, ShadowInitParams shadowInitParams) {
            int m11248c = C49520tu6.m11248c(imageView, shadowInitParams.getWidthDp());
            int m11248c2 = C49520tu6.m11248c(imageView, shadowInitParams.getHeightDp());
            float m11248c3 = C49520tu6.m11248c(imageView, shadowInitParams.getRadiusDp());
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShadow(m11248c, m11248c2, m11248c3, 1207959552, null, 16, null));
            imageView.setLayerType(1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer(m11248c3, C49520tu6.m11248c(imageView, shadowInitParams.getOffsetXDp()), C49520tu6.m11248c(imageView, shadowInitParams.getOffsetYDp()), 1207959552);
            shapeDrawable.getPaint().setColor(1207959552);
            imageView.setTranslationX(C49520tu6.m11248c(imageView, shadowInitParams.getTranslationXDp()));
            imageView.setTranslationY(C49520tu6.m11248c(imageView, shadowInitParams.getTranslationYDp()));
            imageView.setBackground(shapeDrawable);
        }

        public final ImageView getBadgeBg() {
            return (ImageView) this.badgeBg$delegate.getValue();
        }

        public final ImageView getBadgeContent() {
            return (ImageView) this.badgeContent$delegate.getValue();
        }

        public final FrameLayout getBadgeFrame() {
            return (FrameLayout) this.badgeFrame$delegate.getValue();
        }

        public final ImageView getBadgeInnerBg() {
            return (ImageView) this.badgeInnerBg$delegate.getValue();
        }

        public final ImageView getBadgeOuter() {
            return (ImageView) this.badgeOuter$delegate.getValue();
        }

        public final ImageView getBadgeShadow() {
            return (ImageView) this.badgeShadow$delegate.getValue();
        }

        public final ImageView getOverrideImage() {
            return (ImageView) this.overrideImage$delegate.getValue();
        }

        public final TextView getPillText() {
            return (TextView) this.pillText$delegate.getValue();
        }

        public final ImageView getPinBatteryBg() {
            return (ImageView) this.pinBatteryBg$delegate.getValue();
        }

        public final ImageView getPinBatteryLevel() {
            return (ImageView) this.pinBatteryLevel$delegate.getValue();
        }

        public final ImageView getPinBg() {
            return (ImageView) this.pinBg$delegate.getValue();
        }

        public final ImageView getPinContent() {
            return (ImageView) this.pinContent$delegate.getValue();
        }

        public final FrameLayout getPinFrame() {
            return (FrameLayout) this.pinFrame$delegate.getValue();
        }

        public final ImageView getPinGround() {
            return (ImageView) this.pinGround$delegate.getValue();
        }

        public final ImageView getPinRing() {
            return (ImageView) this.pinRing$delegate.getValue();
        }

        public final ImageView getPinShadow() {
            return (ImageView) this.pinShadow$delegate.getValue();
        }

        public final View getView() {
            return this.view;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdClusterItemState.values().length];
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_NEAR_PARKING_NEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_NO_RIDE_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_FULL_NEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_NO_PARK_AREA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_WARNING_RED_AREA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_SLOW_AREA.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE_IN_WARNING_YELLOW_AREA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BirdClusterItemState.ACTIVE_RIDE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BirdClusterItemState.SELECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BirdClusterItemState.AVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IconLoader(Context context, BK2 markerOverridesManager, C36207Tq4 reactiveConfig, InterfaceC6097Oh buildConfig) {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        this.context = context;
        this.markerOverridesManager = markerOverridesManager;
        this.reactiveConfig = reactiveConfig;
        this.buildConfig = buildConfig;
        lazy = LazyKt__LazyJVMKt.lazy(new IconLoader$iconGenerator$2(this));
        this.iconGenerator$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new IconLoader$markerPinViews$2(this));
        this.markerPinViews$delegate = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new IconLoader$privateBirdContentDescription$2(this));
        this.privateBirdContentDescription$delegate = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new IconLoader$defaultContentDescription$2(this));
        this.defaultContentDescription$delegate = lazy4;
    }

    private final int getBadgeBackgroundColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if ((birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED || birdMarkerClusterItem.getState() == BirdClusterItemState.AVAILABLE) && birdMarkerClusterItem.getMarker().getHasHelmet()) {
            return C32364Df4.birdWhite;
        }
        return getPinAccentColor(birdMarkerClusterItem);
    }

    private final int getBadgeContentColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if ((birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED || birdMarkerClusterItem.getState() == BirdClusterItemState.AVAILABLE) && birdMarkerClusterItem.getMarker().getHasHelmet()) {
            return C32364Df4.birdMatteBlack;
        }
        return C32364Df4.birdWhite;
    }

    private final Integer getBadgeIcon(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        switch (WhenMappings.$EnumSwitchMapping$0[birdMarkerClusterItem.getState().ordinal()]) {
            case 1:
                return null;
            case 2:
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_parking);
            case 3:
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_dont_enter);
            case 4:
            case 5:
            case 6:
            case 7:
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_no_parking);
            case 8:
            case 9:
            case 10:
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_issue);
            case 11:
                if (!birdMarkerClusterItem.getMarker().getLocked()) {
                    return null;
                }
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_paused);
            case 12:
            case 13:
                if (!birdMarkerClusterItem.getMarker().getHasHelmet()) {
                    return null;
                }
                return Integer.valueOf(C48193rg4.ic_marker_bird_riding_badge_filled_helmet);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final int getBatteryLevelColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getMarker().getBatteryLevel() > 10) {
            return C32364Df4.birdESBlue;
        }
        return C32364Df4.birdRed;
    }

    private final int getBatteryLevelDrawable(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        int batteryLevel = birdMarkerClusterItem.getMarker().getBatteryLevel();
        if (batteryLevel < 25) {
            if (birdMarkerClusterItem.getState().getInRide()) {
                return C48193rg4.ic_marker_bird_riding_battery_25;
            }
            if (birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED) {
                return C48193rg4.ic_marker_bird_selected_battery_25;
            }
            return C48193rg4.ic_marker_bird_unselected_battery_25;
        } else if (batteryLevel < 50) {
            if (birdMarkerClusterItem.getState().getInRide()) {
                return C48193rg4.ic_marker_bird_riding_battery_50;
            }
            if (birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED) {
                return C48193rg4.ic_marker_bird_selected_battery_50;
            }
            return C48193rg4.ic_marker_bird_unselected_battery_50;
        } else if (batteryLevel < 75) {
            if (birdMarkerClusterItem.getState().getInRide()) {
                return C48193rg4.ic_marker_bird_riding_battery_75;
            }
            if (birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED) {
                return C48193rg4.ic_marker_bird_selected_battery_75;
            }
            return C48193rg4.ic_marker_bird_unselected_battery_75;
        } else if (birdMarkerClusterItem.getState().getInRide()) {
            return C48193rg4.ic_marker_bird_riding_battery_100;
        } else {
            if (birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED) {
                return C48193rg4.ic_marker_bird_selected_battery_100;
            }
            return C48193rg4.ic_marker_bird_unselected_battery_100;
        }
    }

    private final String getContentDescription(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, String str, String str2, String str3) {
        return birdMarkerClusterItem.getMarker().getPrivateBird() != null ? str : str3 == null ? str2 : str3;
    }

    public static /* synthetic */ String getContentDescription$default(IconLoader iconLoader, BirdMarkerClusterItem birdMarkerClusterItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return iconLoader.getContentDescription(birdMarkerClusterItem, str, str2, str3);
    }

    private final String getDefaultContentDescription() {
        return (String) this.defaultContentDescription$delegate.getValue();
    }

    private final Pair<C6378PT, String> getIconAndAccessibilityLabel(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, boolean z) {
        boolean z2;
        int m11247d;
        boolean z3;
        boolean z4;
        Config m80769c = C36441Uq4.m80769c(this.reactiveConfig, birdMarkerClusterItem.getMarker());
        boolean enableMultiModalMapPins = m80769c.getRideConfig().getEnableMultiModalMapPins();
        boolean areEqual = Intrinsics.areEqual(m80769c.getRideConfig().getWarningConfig().getEnableRiderAnnotationPills(), Boolean.TRUE);
        String privateBirdContentDescription = getPrivateBirdContentDescription();
        Intrinsics.checkNotNullExpressionValue(privateBirdContentDescription, "privateBirdContentDescription");
        String defaultContentDescription = getDefaultContentDescription();
        Intrinsics.checkNotNullExpressionValue(defaultContentDescription, "defaultContentDescription");
        MapMarkerPinState pinState = toPinState(birdMarkerClusterItem, enableMultiModalMapPins, areEqual, privateBirdContentDescription, defaultContentDescription);
        LruCache<MapMarkerPinState, C6378PT> lruCache = pinStateBitmapDescriptorCache;
        C6378PT c6378pt = lruCache.get(pinState);
        if (c6378pt == null) {
            MarkerPinWrapper markerPinWrapper = getMarkerPinViews().get(Integer.valueOf(pinState.getViewRes()));
            Intrinsics.checkNotNull(markerPinWrapper);
            MarkerPinWrapper markerPinWrapper2 = markerPinWrapper;
            TextView pillText = markerPinWrapper2.getPillText();
            boolean z5 = true;
            if (pillText != null) {
                pillText.setBackgroundTintList(ColorStateList.valueOf(NA0.m94301c(pillText.getContext(), pinState.getPinAccentColor())));
                Integer pillTextRes = pinState.getPillTextRes();
                if (pillTextRes != null) {
                    pillText.setText(pillTextRes.intValue());
                }
                if (pinState.getPillTextRes() != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C49520tu6.show$default(pillText, z4, 0, 2, null);
            }
            ImageView pinBg = markerPinWrapper2.getPinBg();
            if (pinBg != null) {
                pinBg.setColorFilter(NA0.m94301c(pinBg.getContext(), pinState.getPinBackgroundColor()));
            }
            ImageView pinRing = markerPinWrapper2.getPinRing();
            if (pinRing != null) {
                pinRing.setColorFilter(NA0.m94301c(pinRing.getContext(), pinState.getPinRingColor()));
            }
            ImageView pinGround = markerPinWrapper2.getPinGround();
            if (pinGround != null) {
                C49520tu6.show$default(pinGround, pinState.getShowGroundOverlay(), 0, 2, null);
            }
            ImageView pinBatteryBg = markerPinWrapper2.getPinBatteryBg();
            if (pinBatteryBg != null) {
                C49520tu6.show$default(pinBatteryBg, !pinState.isExternalFeedVehicle(), 0, 2, null);
            }
            ImageView pinBatteryLevel = markerPinWrapper2.getPinBatteryLevel();
            if (pinBatteryLevel != null) {
                pinBatteryLevel.setImageResource(pinState.getBatteryLevelDrawable());
                pinBatteryLevel.setColorFilter(NA0.m94301c(pinBatteryLevel.getContext(), pinState.getBatteryLevelColor()));
                C49520tu6.show$default(pinBatteryLevel, !pinState.isExternalFeedVehicle(), 0, 2, null);
            }
            ImageView pinContent = markerPinWrapper2.getPinContent();
            if (pinContent != null) {
                if (pinState.getMultiModalEnabled() && !pinState.isExternalFeedVehicle()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    pinContent.setImageResource(pinState.getMultiModalContentDrawable());
                    pinContent.setColorFilter(NA0.m94301c(pinContent.getContext(), pinState.getPinContentColor()));
                }
                C49520tu6.show$default(pinContent, z3, 0, 2, null);
            }
            ImageView overrideImage = markerPinWrapper2.getOverrideImage();
            if (overrideImage != null) {
                if (pinState.getMultiModalEnabled() && !pinState.isExternalFeedVehicle()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    Bitmap m15136a = this.markerOverridesManager.mo114100a(birdMarkerClusterItem.getMarker()).m15136a();
                    if (m15136a != null) {
                        overrideImage.setImageBitmap(m15136a);
                        overrideImage.setColorFilter((ColorFilter) null);
                        if (pinState.isExternalFeedVehicle()) {
                            m11247d = C49520tu6.m11247d(overrideImage, 5);
                        } else {
                            m11247d = C49520tu6.m11247d(overrideImage, 2);
                        }
                        overrideImage.setTranslationY(m11247d);
                    } else {
                        overrideImage.setImageResource(this.buildConfig.mo89925g());
                        overrideImage.setColorFilter(NA0.m94301c(overrideImage.getContext(), pinState.getPinContentColor()));
                        overrideImage.setTranslationY(C49520tu6.m11247d(overrideImage, 4));
                    }
                }
                C49520tu6.show$default(overrideImage, z2, 0, 2, null);
            }
            FrameLayout badgeFrame = markerPinWrapper2.getBadgeFrame();
            if (badgeFrame != null) {
                if (pinState.getBadgeIconDrawable() == null) {
                    z5 = false;
                }
                C49520tu6.show$default(badgeFrame, z5, 0, 2, null);
            }
            ImageView badgeInnerBg = markerPinWrapper2.getBadgeInnerBg();
            if (badgeInnerBg != null) {
                badgeInnerBg.setColorFilter(NA0.m94301c(badgeInnerBg.getContext(), pinState.getBadgeBackgroundColor()));
            }
            ImageView badgeContent = markerPinWrapper2.getBadgeContent();
            if (badgeContent != null) {
                Integer badgeIconDrawable = pinState.getBadgeIconDrawable();
                if (badgeIconDrawable != null) {
                    badgeContent.setImageResource(badgeIconDrawable.intValue());
                }
                badgeContent.setColorFilter(NA0.m94301c(badgeContent.getContext(), pinState.getBadgeContentColor()));
            }
            c6378pt = C40788fB0.m41764r(this.context, markerPinWrapper2.getView(), null, getIconGenerator());
            lruCache.put(pinState, c6378pt);
        }
        return TuplesKt.m28425to(c6378pt, pinState.getContentDescription());
    }

    private final AP1 getIconGenerator() {
        return (AP1) this.iconGenerator$delegate.getValue();
    }

    private final Map<Integer, MarkerPinWrapper> getMarkerPinViews() {
        return (Map) this.markerPinViews$delegate.getValue();
    }

    private final int getMultiModalContentDrawable(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getState().getInRide()) {
            if (WireBirdKt.isBikeType(birdMarkerClusterItem.getMarker())) {
                return C48193rg4.ic_marker_bird_riding_bike;
            }
            return C48193rg4.ic_marker_bird_riding_scooter;
        } else if (birdMarkerClusterItem.getState() == BirdClusterItemState.SELECTED) {
            if (WireBirdKt.isBikeType(birdMarkerClusterItem.getMarker())) {
                return C48193rg4.ic_marker_bird_selected_bike;
            }
            return C48193rg4.ic_marker_bird_selected_scooter;
        } else if (WireBirdKt.isBikeType(birdMarkerClusterItem.getMarker())) {
            return C48193rg4.ic_marker_bird_unselected_bike;
        } else {
            return C48193rg4.ic_marker_bird_unselected_scooter;
        }
    }

    private final C48321rt2 getOverrideContentIcon(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, BK2 bk2, boolean z) {
        if (z && birdMarkerClusterItem.getMarker().getExternalFeedType() == null) {
            return new C48321rt2(null, "", null);
        }
        return bk2.mo114100a(birdMarkerClusterItem.getMarker());
    }

    private final Integer getPillText(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, boolean z) {
        if (!z) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[birdMarkerClusterItem.getState().ordinal()]) {
            case 1:
                return Integer.valueOf(C45871nl4.parking_spot_nearby);
            case 2:
                return Integer.valueOf(C45871nl4.rider_pill_parking_zone);
            case 3:
                return Integer.valueOf(C45871nl4.rider_pill_no_ride_zone);
            case 4:
                return Integer.valueOf(C45871nl4.parking_unavailable);
            case 5:
                return Integer.valueOf(C45871nl4.rider_pill_no_ride_no_park_zone);
            case 6:
                return Integer.valueOf(C45871nl4.rider_pill_slow_no_park_zone);
            case 7:
                return Integer.valueOf(C45871nl4.rider_pill_no_park_zone);
            case 8:
            case 10:
            case 11:
            default:
                return null;
            case 9:
                return Integer.valueOf(C45871nl4.rider_pill_slow_zone);
        }
    }

    private final int getPinAccentColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        switch (WhenMappings.$EnumSwitchMapping$0[birdMarkerClusterItem.getState().ordinal()]) {
            case 1:
            case 2:
                return C32364Df4.birdParkingBlue;
            case 3:
                return C32364Df4.birdMatteBlack;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return C32364Df4.birdRed;
            case 9:
            case 10:
                return C32364Df4.birdGold;
            case 11:
                if (birdMarkerClusterItem.getMarker().getLocked()) {
                    return C32364Df4.birdDarkBlueGray;
                }
                return C32364Df4.birdESBlue;
            case 12:
                return C32364Df4.birdESBlue;
            default:
                return C32364Df4.birdESBlue;
        }
    }

    private final int getPinBackgroundColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getMarker().getPrivateBird() != null) {
            return C32364Df4.birdMatteBlack;
        }
        return C32364Df4.birdWhite;
    }

    private final int getPinContentColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getMarker().getPrivateBird() != null) {
            return C32364Df4.birdWhite;
        }
        return C32364Df4.birdMatteBlack;
    }

    private final int getPinRingColor(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getMarker().getPrivateBird() != null) {
            return C32364Df4.birdWhite;
        }
        return getPinAccentColor(birdMarkerClusterItem);
    }

    private final String getPrivateBirdContentDescription() {
        return (String) this.privateBirdContentDescription$delegate.getValue();
    }

    private final int getViewRes(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem) {
        if (birdMarkerClusterItem.getState().getInRide()) {
            return C45258mj4.marker_bird_riding;
        }
        if (birdMarkerClusterItem.isSelected()) {
            return C45258mj4.marker_bird_selected;
        }
        return C45258mj4.marker_bird_unselected;
    }

    private final boolean shouldShowGroundOverlay(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, boolean z) {
        return birdMarkerClusterItem.getState().getInRide() && z;
    }

    private final MapMarkerPinState toPinState(BirdMarkerClusterItem<WireBird> birdMarkerClusterItem, boolean z, boolean z2, String str, String str2) {
        boolean z3;
        boolean z4;
        C48321rt2 overrideContentIcon = getOverrideContentIcon(birdMarkerClusterItem, this.markerOverridesManager, z);
        Bitmap m15136a = overrideContentIcon.m15136a();
        String m15135b = overrideContentIcon.m15135b();
        String m15134c = overrideContentIcon.m15134c();
        int viewRes = getViewRes(birdMarkerClusterItem);
        int batteryLevelColor = getBatteryLevelColor(birdMarkerClusterItem);
        int batteryLevelDrawable = getBatteryLevelDrawable(birdMarkerClusterItem);
        boolean shouldShowGroundOverlay = shouldShowGroundOverlay(birdMarkerClusterItem, z);
        if (m15136a != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        int multiModalContentDrawable = getMultiModalContentDrawable(birdMarkerClusterItem);
        int pinBackgroundColor = getPinBackgroundColor(birdMarkerClusterItem);
        int pinContentColor = getPinContentColor(birdMarkerClusterItem);
        int pinRingColor = getPinRingColor(birdMarkerClusterItem);
        int pinAccentColor = getPinAccentColor(birdMarkerClusterItem);
        Integer badgeIcon = getBadgeIcon(birdMarkerClusterItem);
        int badgeBackgroundColor = getBadgeBackgroundColor(birdMarkerClusterItem);
        int badgeContentColor = getBadgeContentColor(birdMarkerClusterItem);
        Integer pillText = getPillText(birdMarkerClusterItem, z2);
        String contentDescription = getContentDescription(birdMarkerClusterItem, str, str2, m15134c);
        if (birdMarkerClusterItem.getMarker().getExternalFeedType() != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new MapMarkerPinState(z, viewRes, batteryLevelColor, batteryLevelDrawable, shouldShowGroundOverlay, m15135b, z3, multiModalContentDrawable, pinBackgroundColor, pinContentColor, pinRingColor, pinAccentColor, badgeIcon, badgeBackgroundColor, badgeContentColor, pillText, contentDescription, z4);
    }

    public final C45633nM2 renderDeselected(BirdMarkerClusterItem<WireBird> item, C45633nM2 markerSettings) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerSettings, "markerSettings");
        Pair<C6378PT, String> iconAndAccessibilityLabel = getIconAndAccessibilityLabel(item, false);
        C45633nM2 m23948a = markerSettings.m23944e(iconAndAccessibilityLabel.component2()).m23945d(iconAndAccessibilityLabel.component1()).m23948a(0.5f, 0.9259259f);
        Intrinsics.checkNotNullExpressionValue(m23948a, "markerSettings\n      .ti…TH_PERCENTAGE, 50f / 54f)");
        return m23948a;
    }

    public final C45633nM2 renderForState(BirdMarkerClusterItem<WireBird> item, C45633nM2 markerSettings) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerSettings, "markerSettings");
        Pair<C6378PT, String> iconAndAccessibilityLabel = getIconAndAccessibilityLabel(item, item.isSelected());
        C45633nM2 m23948a = markerSettings.m23944e(iconAndAccessibilityLabel.component2()).m23945d(iconAndAccessibilityLabel.component1()).m23948a(0.5f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(m23948a, "markerSettings\n      .ti…_POINT_HEIGHT_PERCENTAGE)");
        return m23948a;
    }

    public final C45633nM2 renderSelected(BirdMarkerClusterItem<WireBird> item, C45633nM2 markerSettings) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerSettings, "markerSettings");
        Pair<C6378PT, String> iconAndAccessibilityLabel = getIconAndAccessibilityLabel(item, true);
        C45633nM2 m23948a = markerSettings.m23944e(iconAndAccessibilityLabel.component2()).m23945d(iconAndAccessibilityLabel.component1()).m23948a(0.5f, 0.9868421f);
        Intrinsics.checkNotNullExpressionValue(m23948a, "markerSettings\n      .ti…TH_PERCENTAGE, 75f / 76f)");
        return m23948a;
    }
}
