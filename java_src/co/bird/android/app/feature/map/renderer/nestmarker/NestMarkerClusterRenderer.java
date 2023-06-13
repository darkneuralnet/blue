package co.bird.android.app.feature.map.renderer.nestmarker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.nestmarker.NestMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRenderer;
import co.bird.android.app.feature.map.renderer.nestmarker.adapters.NestAvailableSpaceDetailsAdapter;
import co.bird.android.model.Detail;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.NestIcon;
import co.bird.android.model.constant.NestProminence;
import co.bird.android.model.persistence.NestMarker;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.configs.OperatorNestMapConfig;
import co.bird.android.widget.NestBadgeView;
import co.bird.android.widget.NestMarkerPin;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B3\b\u0007\u0012\u000e\b\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u000305\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b7\u00108J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0014\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\r\u001a\u00020\f*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010*0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u00020\t*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006:"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer;", "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "Lco/bird/android/model/persistence/NestMarker;", "Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;", "LPT;", "bitmapDescriptor", "bitmapDescriptorExpanded", "LTq4;", "reactiveConfig", "", "anchorCacheKey", "Ljs6;", "Landroid/graphics/PointF;", "anchorPoint", "Lks6;", "config", "", "useExpandedPin", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "updateItem", "LcD1;", "map", "LcD1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LTq4;", "nestMarkerViewBinding", "Ljs6;", "nestMarkerViewSelectedBinding", "nestMarkerExpandedViewBinding", "Lks6;", "nestMarkerExpandedViewSelectedBinding", "Landroid/util/LruCache;", "bitmapCache", "Landroid/util/LruCache;", "Landroid/graphics/drawable/Drawable;", "iconCache", "", "anchorCache", "Ljava/util/Map;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "getCacheKey", "(Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterItem;)Ljava/lang/String;", "cacheKey", "LGl0;", "clusterManager", "<init>", "(LGl0;LcD1;Landroid/content/Context;LTq4;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,333:1\n1#2:334\n177#3,2:335\n*S KotlinDebug\n*F\n+ 1 NestMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer\n*L\n174#1:335,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NestMarkerClusterRenderer extends AbstractMarkerClusterRenderer<NestMarker, NestMarkerClusterItem> {
    private static final int CLAIMED_ICON_PADDING_DP = 2;
    private static final String CLAIMED_KEY = "claimed";
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_ICON_PADDING_DP = 5;
    private static final int NEST_MARKER_PIN_DEFAULT_WIDTH_DP = 42;
    private static final int NEST_MARKER_PIN_ICON_1_DIGIT_WIDTH_DP = 52;
    private static final int NEST_MARKER_PIN_ICON_2_DIGIT_WIDTH_DP = 60;
    private static final int NEST_MARKER_PIN_SELECTED_DEFAULT_WIDTH_DP = 58;
    private static final int NEST_MARKER_PIN_SELECTED_ICON_1_DIGIT_WIDTH_DP = 72;
    private static final int NEST_MARKER_PIN_SELECTED_ICON_2_DIGIT_WIDTH_DP = 82;
    private static final String STANDARD_ANCHOR_KEY = "anchor";
    private final Map<String, PointF> anchorCache;
    private final LruCache<String, C6378PT> bitmapCache;
    private final Context context;
    private final LruCache<String, Drawable> iconCache;
    private final Handler mainThreadHandler;
    private final C39011cD1 map;
    private C44164ks6 nestMarkerExpandedViewBinding;
    private C44164ks6 nestMarkerExpandedViewSelectedBinding;
    private C43571js6 nestMarkerViewBinding;
    private C43571js6 nestMarkerViewSelectedBinding;
    private final C36207Tq4 reactiveConfig;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/nestmarker/NestMarkerClusterRenderer$Companion;", "", "()V", "CLAIMED_ICON_PADDING_DP", "", "CLAIMED_KEY", "", "DEFAULT_ICON_PADDING_DP", "NEST_MARKER_PIN_DEFAULT_WIDTH_DP", "NEST_MARKER_PIN_ICON_1_DIGIT_WIDTH_DP", "NEST_MARKER_PIN_ICON_2_DIGIT_WIDTH_DP", "NEST_MARKER_PIN_SELECTED_DEFAULT_WIDTH_DP", "NEST_MARKER_PIN_SELECTED_ICON_1_DIGIT_WIDTH_DP", "NEST_MARKER_PIN_SELECTED_ICON_2_DIGIT_WIDTH_DP", "STANDARD_ANCHOR_KEY", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NestProminence.values().length];
            try {
                iArr[NestProminence.MINIMIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NestProminence.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestMarkerClusterRenderer(C33116Gl0<NestMarkerClusterItem> clusterManager, C39011cD1 map, Context context, C36207Tq4 reactiveConfig) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.map = map;
        this.context = context;
        this.reactiveConfig = reactiveConfig;
        this.bitmapCache = new LruCache<>(20);
        this.iconCache = new LruCache<>(3);
        this.anchorCache = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    private final String anchorCacheKey(NestMarkerClusterItem nestMarkerClusterItem, C36207Tq4 c36207Tq4) {
        int i;
        if (nestMarkerClusterItem.getMarker().getSecondaryIcon() != null) {
            Integer valueOf = Integer.valueOf(nestMarkerClusterItem.getMarker().getAvailableSpaceDetails().size());
            valueOf.intValue();
            if (!useExpandedPin(nestMarkerClusterItem, c36207Tq4)) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else if (nestMarkerClusterItem.getMarker().getIcon() != null) {
                i = 1;
            } else {
                i = 0;
            }
            return String.valueOf(i);
        }
        return STANDARD_ANCHOR_KEY;
    }

    private final PointF anchorPoint(C43571js6 c43571js6, String str) {
        PointF pointF = new PointF(((c43571js6.f93493e.getRight() + c43571js6.f93493e.getLeft()) / 2.0f) / c43571js6.getRoot().getMeasuredWidth(), c43571js6.f93493e.getBottom() / c43571js6.getRoot().getMeasuredHeight());
        this.anchorCache.put(str, pointF);
        return pointF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6378PT bitmapDescriptor(final NestMarkerClusterItem nestMarkerClusterItem) {
        final C43571js6 c43571js6;
        String str;
        String name;
        Drawable drawable;
        int i;
        NestMarkerPin.EnumC16542b enumC16542b;
        int m94301c;
        int m12001b;
        boolean z;
        float m12001b2;
        int m94301c2;
        int m94301c3;
        boolean z2;
        ClientIcon secondaryIcon;
        Drawable drawable2;
        ThemedColors secondaryIconBackgroundColor;
        ThemedColors secondaryIconColor;
        int i2;
        ColorStateList valueOf;
        if (nestMarkerClusterItem.getSelected()) {
            c43571js6 = this.nestMarkerViewSelectedBinding;
            if (c43571js6 == null) {
                c43571js6 = C43571js6.m29800a(C45350ms6.m24783c(C40788fB0.m41772j(this.context)).getRoot());
                this.nestMarkerViewSelectedBinding = c43571js6;
                Intrinsics.checkNotNullExpressionValue(c43571js6, "bind(ViewOperatorNestMar…lectedBinding = binding }");
            }
        } else {
            c43571js6 = this.nestMarkerViewBinding;
            if (c43571js6 == null) {
                c43571js6 = C43571js6.m29798c(C40788fB0.m41772j(this.context));
                this.nestMarkerViewBinding = c43571js6;
                Intrinsics.checkNotNullExpressionValue(c43571js6, "inflate(context.layoutIn…erViewBinding = binding }");
            }
        }
        c43571js6.f93491c.setText(String.valueOf(nestMarkerClusterItem.getMarker().getCapacity()));
        if (nestMarkerClusterItem.getClaimedProgress() > 0) {
            str = CLAIMED_KEY;
        } else {
            NestIcon icon = nestMarkerClusterItem.getMarker().getIcon();
            if (icon != null && (name = icon.name()) != null) {
                str = name.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                str = null;
            }
        }
        if (str != null) {
            drawable = (Drawable) C50896wE2.m7192a(this.iconCache, str, new NestMarkerClusterRenderer$bitmapDescriptor$drawable$1(nestMarkerClusterItem, this));
        } else {
            drawable = null;
        }
        NestProminence prominence = nestMarkerClusterItem.getMarker().getProminence();
        boolean z3 = true;
        if (prominence == null || !(!nestMarkerClusterItem.getSelected())) {
            prominence = null;
        }
        if (prominence == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[prominence.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                enumC16542b = NestMarkerPin.EnumC16542b.SMALL;
                if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
                    m94301c = NA0.m94301c(this.context, C32364Df4.primaryAccent);
                    m12001b = (int) C49347td3.m12001b(2);
                    ProgressBar progressBar = c43571js6.f93494f;
                    Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progress");
                    C49520tu6.m11233r(progressBar);
                    c43571js6.f93494f.setProgress(nestMarkerClusterItem.getClaimedProgress());
                } else {
                    m94301c = NA0.m94301c(this.context, C32364Df4.birdLightGray);
                    m12001b = (int) C49347td3.m12001b(5);
                    ProgressBar progressBar2 = c43571js6.f93494f;
                    Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.progress");
                    C49520tu6.show$default(progressBar2, false, 0, 2, null);
                }
                c43571js6.f93492d.setImageDrawable(drawable);
                c43571js6.f93492d.setBackgroundTintList(ColorStateList.valueOf(m94301c));
                ImageView imageView = c43571js6.f93492d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
                if ((nestMarkerClusterItem.getClaimedProgress() <= 0 || nestMarkerClusterItem.getMarker().getIcon() != null) && enumC16542b == NestMarkerPin.EnumC16542b.STANDARD) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ImageView imageView2 = c43571js6.f93492d;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.icon");
                imageView2.setPadding(m12001b, m12001b, m12001b, m12001b);
                ViewGroup.LayoutParams layoutParams = c43571js6.f93493e.getLayoutParams();
                if ((nestMarkerClusterItem.getClaimedProgress() <= 0 || nestMarkerClusterItem.getMarker().getIcon() != null) && nestMarkerClusterItem.getMarker().getCapacity() < 10 && nestMarkerClusterItem.getSelected()) {
                    m12001b2 = C49347td3.m12001b(72);
                } else if ((nestMarkerClusterItem.getClaimedProgress() > 0 || nestMarkerClusterItem.getMarker().getIcon() != null) && nestMarkerClusterItem.getSelected()) {
                    m12001b2 = C49347td3.m12001b(82);
                } else if (nestMarkerClusterItem.getSelected()) {
                    m12001b2 = C49347td3.m12001b(58);
                } else if ((nestMarkerClusterItem.getClaimedProgress() > 0 || nestMarkerClusterItem.getMarker().getIcon() != null) && nestMarkerClusterItem.getMarker().getCapacity() < 10) {
                    m12001b2 = C49347td3.m12001b(52);
                } else if (nestMarkerClusterItem.getClaimedProgress() <= 0 && nestMarkerClusterItem.getMarker().getIcon() == null) {
                    m12001b2 = C49347td3.m12001b(42);
                } else {
                    m12001b2 = C49347td3.m12001b(60);
                }
                layoutParams.width = (int) m12001b2;
                if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
                    m94301c2 = NA0.m94301c(this.context, C32364Df4.primaryAccent);
                    m94301c3 = NA0.m94301c(this.context, C32364Df4.transparent);
                } else {
                    m94301c2 = NA0.m94301c(this.context, C32364Df4.birdWhite);
                    m94301c3 = NA0.m94301c(this.context, C32364Df4.birdSubtleGray);
                }
                c43571js6.f93493e.setColor(m94301c2);
                c43571js6.f93493e.setOutlineColor(m94301c3);
                c43571js6.f93493e.setPinStyle(enumC16542b);
                NestBadgeView nestBadgeView = c43571js6.f93490b;
                Intrinsics.checkNotNullExpressionValue(nestBadgeView, "binding.badge");
                if (nestMarkerClusterItem.getClaimedProgress() != 0 && nestMarkerClusterItem.getMarker().getSecondaryIcon() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C49520tu6.show$default(nestBadgeView, z2, 0, 2, null);
                NestBadgeView nestBadgeView2 = c43571js6.f93490b;
                secondaryIcon = nestMarkerClusterItem.getMarker().getSecondaryIcon();
                if (secondaryIcon == null) {
                    drawable2 = C33341Hk0.m103484a(secondaryIcon, this.context);
                } else {
                    drawable2 = null;
                }
                nestBadgeView2.setImageDrawable(drawable2);
                secondaryIconBackgroundColor = nestMarkerClusterItem.getMarker().getSecondaryIconBackgroundColor();
                if (secondaryIconBackgroundColor != null) {
                    int lightMode = secondaryIconBackgroundColor.getLightMode();
                    final NestBadgeView nestBadgeView3 = c43571js6.f93490b;
                    Intrinsics.checkNotNullExpressionValue(nestBadgeView3, "binding.badge");
                    new MutablePropertyReference0Impl(nestBadgeView3) { // from class: co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRenderer$bitmapDescriptor$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                        public Object get() {
                            return Integer.valueOf(((NestBadgeView) this.receiver).m54536c());
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                        public void set(Object obj) {
                            ((NestBadgeView) this.receiver).setInnerColor(((Number) obj).intValue());
                        }
                    }.set(Integer.valueOf(lightMode));
                }
                secondaryIconColor = nestMarkerClusterItem.getMarker().getSecondaryIconColor();
                if (secondaryIconColor != null && (valueOf = ColorStateList.valueOf(secondaryIconColor.getLightMode())) != null) {
                    NestBadgeView nestBadgeView4 = c43571js6.f93490b;
                    Intrinsics.checkNotNullExpressionValue(nestBadgeView4, "binding.badge");
                    nestBadgeView4.setImageTintList(valueOf);
                }
                c43571js6.f93491c.setText(String.valueOf(nestMarkerClusterItem.getMarker().getCapacity()));
                TextView textView = c43571js6.f93491c;
                Context context = this.context;
                if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
                    i2 = C32364Df4.birdWhite;
                } else {
                    i2 = C32364Df4.primaryText;
                }
                textView.setTextColor(NA0.m94301c(context, i2));
                TextView textView2 = c43571js6.f93491c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.capacity");
                if (c43571js6.f93493e.m54532c() != NestMarkerPin.EnumC16542b.STANDARD) {
                    z3 = false;
                }
                C49520tu6.show$default(textView2, z3, 0, 2, null);
                Context context2 = this.context;
                ConstraintLayout root = c43571js6.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                C6378PT iconBitmapDescriptor$default = C40788fB0.iconBitmapDescriptor$default(context2, root, (Drawable) null, (AP1) null, 4, (Object) null);
                if (this.anchorCache.get(anchorCacheKey(nestMarkerClusterItem, this.reactiveConfig)) == null) {
                    if (c43571js6.f93493e.getMeasuredHeight() > 0) {
                        anchorPoint(c43571js6, anchorCacheKey(nestMarkerClusterItem, this.reactiveConfig));
                        Unit unit = Unit.INSTANCE;
                    } else {
                        this.mainThreadHandler.post(new Runnable() { // from class: b43
                            @Override // java.lang.Runnable
                            public final void run() {
                                NestMarkerClusterRenderer.bitmapDescriptor$lambda$6$lambda$5(NestMarkerClusterRenderer.this, c43571js6, nestMarkerClusterItem);
                            }
                        });
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
                return iconBitmapDescriptor$default;
            }
        }
        enumC16542b = NestMarkerPin.EnumC16542b.STANDARD;
        if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
        }
        c43571js6.f93492d.setImageDrawable(drawable);
        c43571js6.f93492d.setBackgroundTintList(ColorStateList.valueOf(m94301c));
        ImageView imageView3 = c43571js6.f93492d;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.icon");
        if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
        }
        z = true;
        C49520tu6.show$default(imageView3, z, 0, 2, null);
        ImageView imageView22 = c43571js6.f93492d;
        Intrinsics.checkNotNullExpressionValue(imageView22, "binding.icon");
        imageView22.setPadding(m12001b, m12001b, m12001b, m12001b);
        ViewGroup.LayoutParams layoutParams2 = c43571js6.f93493e.getLayoutParams();
        if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
        }
        m12001b2 = C49347td3.m12001b(72);
        layoutParams2.width = (int) m12001b2;
        if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
        }
        c43571js6.f93493e.setColor(m94301c2);
        c43571js6.f93493e.setOutlineColor(m94301c3);
        c43571js6.f93493e.setPinStyle(enumC16542b);
        NestBadgeView nestBadgeView5 = c43571js6.f93490b;
        Intrinsics.checkNotNullExpressionValue(nestBadgeView5, "binding.badge");
        if (nestMarkerClusterItem.getClaimedProgress() != 0) {
        }
        z2 = false;
        C49520tu6.show$default(nestBadgeView5, z2, 0, 2, null);
        NestBadgeView nestBadgeView22 = c43571js6.f93490b;
        secondaryIcon = nestMarkerClusterItem.getMarker().getSecondaryIcon();
        if (secondaryIcon == null) {
        }
        nestBadgeView22.setImageDrawable(drawable2);
        secondaryIconBackgroundColor = nestMarkerClusterItem.getMarker().getSecondaryIconBackgroundColor();
        if (secondaryIconBackgroundColor != null) {
        }
        secondaryIconColor = nestMarkerClusterItem.getMarker().getSecondaryIconColor();
        if (secondaryIconColor != null) {
            NestBadgeView nestBadgeView42 = c43571js6.f93490b;
            Intrinsics.checkNotNullExpressionValue(nestBadgeView42, "binding.badge");
            nestBadgeView42.setImageTintList(valueOf);
        }
        c43571js6.f93491c.setText(String.valueOf(nestMarkerClusterItem.getMarker().getCapacity()));
        TextView textView3 = c43571js6.f93491c;
        Context context3 = this.context;
        if (nestMarkerClusterItem.getClaimedProgress() <= 0) {
        }
        textView3.setTextColor(NA0.m94301c(context3, i2));
        TextView textView22 = c43571js6.f93491c;
        Intrinsics.checkNotNullExpressionValue(textView22, "binding.capacity");
        if (c43571js6.f93493e.m54532c() != NestMarkerPin.EnumC16542b.STANDARD) {
        }
        C49520tu6.show$default(textView22, z3, 0, 2, null);
        Context context22 = this.context;
        ConstraintLayout root2 = c43571js6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
        C6378PT iconBitmapDescriptor$default2 = C40788fB0.iconBitmapDescriptor$default(context22, root2, (Drawable) null, (AP1) null, 4, (Object) null);
        if (this.anchorCache.get(anchorCacheKey(nestMarkerClusterItem, this.reactiveConfig)) == null) {
        }
        return iconBitmapDescriptor$default2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bitmapDescriptor$lambda$6$lambda$5(NestMarkerClusterRenderer this$0, C43571js6 binding, NestMarkerClusterItem this_bitmapDescriptor) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this_bitmapDescriptor, "$this_bitmapDescriptor");
        this$0.anchorPoint(binding, this$0.anchorCacheKey(this_bitmapDescriptor, this$0.reactiveConfig));
    }

    private final C6378PT bitmapDescriptorExpanded(final NestMarkerClusterItem nestMarkerClusterItem) {
        final C44164ks6 c44164ks6;
        NestAvailableSpaceDetailsAdapter nestAvailableSpaceDetailsAdapter;
        boolean z;
        ColorStateList valueOf;
        if (nestMarkerClusterItem.getSelected()) {
            c44164ks6 = this.nestMarkerExpandedViewSelectedBinding;
            if (c44164ks6 == null) {
                c44164ks6 = C44164ks6.m28249a(C44757ls6.m26715c(C40788fB0.m41772j(this.context)).getRoot());
                this.nestMarkerExpandedViewSelectedBinding = c44164ks6;
                Intrinsics.checkNotNullExpressionValue(c44164ks6, "bind(ViewOperatorNestMar…lectedBinding = binding }");
            }
        } else {
            c44164ks6 = this.nestMarkerExpandedViewBinding;
            if (c44164ks6 == null) {
                c44164ks6 = C44164ks6.m28247c(C40788fB0.m41772j(this.context));
                this.nestMarkerExpandedViewBinding = c44164ks6;
                Intrinsics.checkNotNullExpressionValue(c44164ks6, "inflate(context.layoutIn…edViewBinding = binding }");
            }
        }
        RecyclerView.AbstractC11843h adapter = c44164ks6.f95145c.getAdapter();
        Drawable drawable = null;
        if (adapter instanceof NestAvailableSpaceDetailsAdapter) {
            nestAvailableSpaceDetailsAdapter = (NestAvailableSpaceDetailsAdapter) adapter;
        } else {
            nestAvailableSpaceDetailsAdapter = null;
        }
        if (nestAvailableSpaceDetailsAdapter == null) {
            nestAvailableSpaceDetailsAdapter = new NestAvailableSpaceDetailsAdapter();
            c44164ks6.f95145c.setAdapter(nestAvailableSpaceDetailsAdapter);
            c44164ks6.f95145c.setLayoutManager(new LinearLayoutManager(this.context, 0, false));
        }
        nestAvailableSpaceDetailsAdapter.setSelected(nestMarkerClusterItem.getSelected());
        nestAvailableSpaceDetailsAdapter.setAvailableSpaceDetails(nestMarkerClusterItem.getMarker().getAvailableSpaceDetails());
        NestBadgeView nestBadgeView = c44164ks6.f95144b;
        Intrinsics.checkNotNullExpressionValue(nestBadgeView, "binding.badge");
        if (nestMarkerClusterItem.getClaimedProgress() == 0 && nestMarkerClusterItem.getMarker().getSecondaryIcon() != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(nestBadgeView, z, 0, 2, null);
        NestBadgeView nestBadgeView2 = c44164ks6.f95144b;
        ClientIcon secondaryIcon = nestMarkerClusterItem.getMarker().getSecondaryIcon();
        if (secondaryIcon != null) {
            drawable = C33341Hk0.m103484a(secondaryIcon, this.context);
        }
        nestBadgeView2.setImageDrawable(drawable);
        ThemedColors secondaryIconBackgroundColor = nestMarkerClusterItem.getMarker().getSecondaryIconBackgroundColor();
        if (secondaryIconBackgroundColor != null) {
            int lightMode = secondaryIconBackgroundColor.getLightMode();
            final NestBadgeView nestBadgeView3 = c44164ks6.f95144b;
            Intrinsics.checkNotNullExpressionValue(nestBadgeView3, "binding.badge");
            new MutablePropertyReference0Impl(nestBadgeView3) { // from class: co.bird.android.app.feature.map.renderer.nestmarker.NestMarkerClusterRenderer$bitmapDescriptorExpanded$2
                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return Integer.valueOf(((NestBadgeView) this.receiver).m54536c());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                public void set(Object obj) {
                    ((NestBadgeView) this.receiver).setInnerColor(((Number) obj).intValue());
                }
            }.set(Integer.valueOf(lightMode));
        }
        ThemedColors secondaryIconColor = nestMarkerClusterItem.getMarker().getSecondaryIconColor();
        if (secondaryIconColor != null && (valueOf = ColorStateList.valueOf(secondaryIconColor.getLightMode())) != null) {
            NestBadgeView nestBadgeView4 = c44164ks6.f95144b;
            Intrinsics.checkNotNullExpressionValue(nestBadgeView4, "binding.badge");
            nestBadgeView4.setImageTintList(valueOf);
        }
        c44164ks6.f95145c.setAdapter(nestAvailableSpaceDetailsAdapter);
        Context context = this.context;
        ConstraintLayout root = c44164ks6.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        C6378PT iconBitmapDescriptor$default = C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
        if (this.anchorCache.get(anchorCacheKey(nestMarkerClusterItem, this.reactiveConfig)) == null) {
            if (c44164ks6.f95146d.getMeasuredHeight() > 0) {
                anchorPoint(c44164ks6, anchorCacheKey(nestMarkerClusterItem, this.reactiveConfig));
                Unit unit = Unit.INSTANCE;
            } else {
                this.mainThreadHandler.post(new Runnable() { // from class: a43
                    @Override // java.lang.Runnable
                    public final void run() {
                        NestMarkerClusterRenderer.bitmapDescriptorExpanded$lambda$14$lambda$13(NestMarkerClusterRenderer.this, c44164ks6, nestMarkerClusterItem);
                    }
                });
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return iconBitmapDescriptor$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bitmapDescriptorExpanded$lambda$14$lambda$13(NestMarkerClusterRenderer this$0, C44164ks6 binding, NestMarkerClusterItem this_bitmapDescriptorExpanded) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this_bitmapDescriptorExpanded, "$this_bitmapDescriptorExpanded");
        this$0.anchorPoint(binding, this$0.anchorCacheKey(this_bitmapDescriptorExpanded, this$0.reactiveConfig));
    }

    private final String getCacheKey(NestMarkerClusterItem nestMarkerClusterItem) {
        if (nestMarkerClusterItem.getClaimedProgress() > 0) {
            int claimedProgress = nestMarkerClusterItem.getClaimedProgress();
            boolean selected = nestMarkerClusterItem.getSelected();
            int capacity = nestMarkerClusterItem.getMarker().getCapacity();
            NestProminence prominence = nestMarkerClusterItem.getMarker().getProminence();
            return "claimed-" + claimedProgress + Detail.EMPTY_CHAR + selected + Detail.EMPTY_CHAR + capacity + Detail.EMPTY_CHAR + prominence;
        }
        NestIcon icon = nestMarkerClusterItem.getMarker().getIcon();
        boolean selected2 = nestMarkerClusterItem.getSelected();
        int capacity2 = nestMarkerClusterItem.getMarker().getCapacity();
        NestProminence prominence2 = nestMarkerClusterItem.getMarker().getProminence();
        ClientIcon secondaryIcon = nestMarkerClusterItem.getMarker().getSecondaryIcon();
        return icon + Detail.EMPTY_CHAR + selected2 + Detail.EMPTY_CHAR + capacity2 + Detail.EMPTY_CHAR + prominence2 + Detail.EMPTY_CHAR + secondaryIcon;
    }

    private final boolean useExpandedPin(NestMarkerClusterItem nestMarkerClusterItem, C36207Tq4 c36207Tq4) {
        OperatorNestMapConfig nestMap = c36207Tq4.m82623f8().m73665a().getOperatorConfig().getFeatures().getNestMap();
        if (nestMap.getEnableExpandedNestPin() && this.map.m61679i().f71395c > nestMap.getExpandedPinZoomThreshold() && (!nestMarkerClusterItem.getMarker().getAvailableSpaceDetails().isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(NestMarkerClusterItem item, MarkerOptions markerOptions) {
        C6378PT c6378pt;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((NestMarkerClusterRenderer) item, markerOptions);
        if (useExpandedPin(item, this.reactiveConfig)) {
            c6378pt = bitmapDescriptorExpanded(item);
        } else {
            c6378pt = (C6378PT) C50896wE2.m7192a(this.bitmapCache, getCacheKey(item), new C13845x2e51d2d5(this, item));
        }
        PointF pointF = this.anchorCache.get(anchorCacheKey(item, this.reactiveConfig));
        if (pointF == null) {
            pointF = new PointF(0.5f, 1.0f);
        }
        markerOptions.m50657N0(c6378pt).m50644u(pointF.x, pointF.y);
    }

    @Override // co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer
    public void updateItem(NestMarkerClusterItem item, C40889fM2 marker) {
        C6378PT c6378pt;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        if (useExpandedPin(item, this.reactiveConfig)) {
            c6378pt = bitmapDescriptorExpanded(item);
        } else {
            c6378pt = (C6378PT) C50896wE2.m7192a(this.bitmapCache, getCacheKey(item), new NestMarkerClusterRenderer$updateItem$descriptor$1(this, item));
        }
        PointF pointF = this.anchorCache.get(anchorCacheKey(item, this.reactiveConfig));
        if (pointF == null) {
            pointF = new PointF(0.5f, 1.0f);
        }
        marker.m41523k(c6378pt);
        marker.m41526h(pointF.x, pointF.y);
        marker.m41515s(item.getZIndex());
    }

    private final PointF anchorPoint(C44164ks6 c44164ks6, String str) {
        PointF pointF = new PointF(((c44164ks6.f95146d.getRight() + c44164ks6.f95146d.getLeft()) / 2.0f) / c44164ks6.getRoot().getMeasuredWidth(), c44164ks6.f95146d.getBottom() / c44164ks6.getRoot().getMeasuredHeight());
        this.anchorCache.put(str, pointF);
        return pointF;
    }
}
