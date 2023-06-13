package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.zonemarker.ZoneMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.ZoneMarkerClusterRenderer;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.nestedstructures.Icon;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotationLabel;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B+\b\u0007\u0012\u000e\b\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\b\b\u0001\u0010+\u001a\u00020*\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010$\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006/"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer;", "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "Lco/bird/android/model/persistence/ZoneMarker;", "Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterItem;", "LPT;", "bitmapDescriptor", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "updateItem", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lrs6;", "zoneMarkerViewBinding$delegate", "Lkotlin/Lazy;", "getZoneMarkerViewBinding", "()Lrs6;", "zoneMarkerViewBinding", "selectedZoneMarkerViewBinding$delegate", "getSelectedZoneMarkerViewBinding", "selectedZoneMarkerViewBinding", "Landroid/util/LruCache;", "", "bitmapCache", "Landroid/util/LruCache;", "Landroid/graphics/drawable/Drawable;", "iconCache", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Landroid/graphics/PointF;", "anchorPoint", "Landroid/graphics/PointF;", "getAnchorPoint", "(Lrs6;)Landroid/graphics/PointF;", "LGl0;", "clusterManager", "LcD1;", "map", "<init>", "(LGl0;LcD1;Landroid/content/Context;)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes2.dex */
public final class ZoneMarkerClusterRenderer extends AbstractMarkerClusterRenderer<ZoneMarker, ZoneMarkerClusterItem> {
    private static final int CLAIMED_ICON_PADDING_DP = 5;
    private static final int COLORED_ICON_PADDING_DP = 4;
    private static final int DEFAULT_ICON_PADDING_DP = 0;
    private static final int SELECTED_CLAIMED_ICON_PADDING_DP = 4;
    private static final float SELECTED_COLORED_ICON_PADDING_DP = 5.54f;
    private PointF anchorPoint;
    private final LruCache<String, C6378PT> bitmapCache;
    private final Context context;
    private final LruCache<String, Drawable> iconCache;
    private final Handler mainThreadHandler;
    private final Lazy selectedZoneMarkerViewBinding$delegate;
    private final Lazy zoneMarkerViewBinding$delegate;
    public static final Companion Companion = new Companion(null);
    private static final PointF TEMP_ANCHOR_POINT = new PointF(0.5f, 1.0f);

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/ZoneMarkerClusterRenderer$Companion;", "", "()V", "CLAIMED_ICON_PADDING_DP", "", "COLORED_ICON_PADDING_DP", "DEFAULT_ICON_PADDING_DP", "SELECTED_CLAIMED_ICON_PADDING_DP", "SELECTED_COLORED_ICON_PADDING_DP", "", "TEMP_ANCHOR_POINT", "Landroid/graphics/PointF;", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneMarkerClusterRenderer(C33116Gl0<ZoneMarkerClusterItem> clusterManager, C39011cD1 map, Context context) {
        super(context, map, clusterManager);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        lazy = LazyKt__LazyJVMKt.lazy(new ZoneMarkerClusterRenderer$zoneMarkerViewBinding$2(this));
        this.zoneMarkerViewBinding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new ZoneMarkerClusterRenderer$selectedZoneMarkerViewBinding$2(this));
        this.selectedZoneMarkerViewBinding$delegate = lazy2;
        this.bitmapCache = new LruCache<>(20);
        this.iconCache = new LruCache<>(8);
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if (r1 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6378PT bitmapDescriptor(ZoneMarkerClusterItem zoneMarkerClusterItem) {
        final C48315rs6 zoneMarkerViewBinding;
        String str;
        Drawable drawable;
        Unit unit;
        int i;
        ClientIcon clientIcon;
        ThemedColors color;
        ColorStateList valueOf;
        String cacheKey;
        ThemedColors color2;
        if (zoneMarkerClusterItem.getSelected()) {
            zoneMarkerViewBinding = getSelectedZoneMarkerViewBinding();
        } else {
            zoneMarkerViewBinding = getZoneMarkerViewBinding();
        }
        Intrinsics.checkNotNullExpressionValue(zoneMarkerViewBinding, "if (selected) {\n      se…neMarkerViewBinding\n    }");
        TextView textView = zoneMarkerViewBinding.f107813b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.capacity");
        ZoneAnnotationLabel label = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getLabel();
        ClientIcon clientIcon2 = null;
        if (label != null) {
            str = label.getText();
        } else {
            str = null;
        }
        C49520tu6.setTextAndVisibility$default(textView, str, 0, 2, null);
        ZoneAnnotationLabel label2 = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getLabel();
        if (label2 != null && (color2 = label2.getColor()) != null) {
            int lightMode = color2.getLightMode();
            TextView textView2 = zoneMarkerViewBinding.f107813b;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.capacity");
            textView2.setTextColor(lightMode);
        }
        Icon icon = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getIcon();
        if (icon != null) {
            LruCache<String, Drawable> lruCache = this.iconCache;
            cacheKey = ZoneMarkerClusterRendererKt.getCacheKey(icon);
            drawable = (Drawable) C50896wE2.m7192a(lruCache, cacheKey, new ZoneMarkerClusterRenderer$bitmapDescriptor$icon$1$1(icon, this));
        }
        ColoredIcon coloredIcon = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColoredIcon();
        if (coloredIcon != null) {
            drawable = (Drawable) C50896wE2.m7192a(this.iconCache, coloredIcon.name(), new ZoneMarkerClusterRenderer$bitmapDescriptor$icon$2$1(coloredIcon, this));
        } else {
            drawable = null;
        }
        zoneMarkerViewBinding.f107814c.setImageDrawable(drawable);
        Icon icon2 = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getIcon();
        if (icon2 != null && (color = icon2.getColor()) != null && (valueOf = ColorStateList.valueOf(color.getLightMode())) != null) {
            ImageView imageView = zoneMarkerViewBinding.f107814c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
            imageView.setImageTintList(valueOf);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            zoneMarkerViewBinding.f107814c.setImageTintList(null);
        }
        if (zoneMarkerClusterItem.getSelected()) {
            Icon icon3 = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getIcon();
            if (icon3 != null) {
                clientIcon = icon3.getIcon();
            } else {
                clientIcon = null;
            }
            if (clientIcon == ClientIcon.IC_FILLED_CLOCK) {
                i = 4;
                int m12001b = (int) C49347td3.m12001b(i);
                zoneMarkerViewBinding.f107814c.setPadding(m12001b, m12001b, m12001b, m12001b);
                zoneMarkerViewBinding.f107815d.setOutlineColor(zoneMarkerClusterItem.getMarker().getZoneAnnotation().getBorderColor().getLightMode());
                zoneMarkerViewBinding.f107815d.setColor(zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColor().getLightMode());
                if (this.anchorPoint == null) {
                    if (zoneMarkerViewBinding.f107815d.getMeasuredHeight() > 0) {
                        getAnchorPoint(zoneMarkerViewBinding);
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        this.mainThreadHandler.post(new Runnable() { // from class: VI6
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZoneMarkerClusterRenderer.bitmapDescriptor$lambda$5(ZoneMarkerClusterRenderer.this, zoneMarkerViewBinding);
                            }
                        });
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
                Context context = this.context;
                ConstraintLayout root = zoneMarkerViewBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                return C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
            }
        }
        Icon icon4 = zoneMarkerClusterItem.getMarker().getZoneAnnotation().getIcon();
        if (icon4 != null) {
            clientIcon2 = icon4.getIcon();
        }
        if (clientIcon2 == ClientIcon.IC_FILLED_CLOCK) {
            i = 5;
        } else if (zoneMarkerClusterItem.getSelected() && zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColoredIcon() != null) {
            i = Float.valueOf((float) SELECTED_COLORED_ICON_PADDING_DP);
        } else if (zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColoredIcon() != null) {
            i = 4;
        } else {
            i = 0;
        }
        int m12001b2 = (int) C49347td3.m12001b(i);
        zoneMarkerViewBinding.f107814c.setPadding(m12001b2, m12001b2, m12001b2, m12001b2);
        zoneMarkerViewBinding.f107815d.setOutlineColor(zoneMarkerClusterItem.getMarker().getZoneAnnotation().getBorderColor().getLightMode());
        zoneMarkerViewBinding.f107815d.setColor(zoneMarkerClusterItem.getMarker().getZoneAnnotation().getColor().getLightMode());
        if (this.anchorPoint == null) {
        }
        Context context2 = this.context;
        ConstraintLayout root2 = zoneMarkerViewBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
        return C40788fB0.iconBitmapDescriptor$default(context2, root2, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bitmapDescriptor$lambda$5(ZoneMarkerClusterRenderer this$0, C48315rs6 binding) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        this$0.getAnchorPoint(binding);
    }

    private final PointF getAnchorPoint(C48315rs6 c48315rs6) {
        PointF pointF = new PointF(0.5f, c48315rs6.f107815d.getBottom() / c48315rs6.getRoot().getMeasuredHeight());
        this.anchorPoint = pointF;
        return pointF;
    }

    private final C48315rs6 getSelectedZoneMarkerViewBinding() {
        return (C48315rs6) this.selectedZoneMarkerViewBinding$delegate.getValue();
    }

    private final C48315rs6 getZoneMarkerViewBinding() {
        return (C48315rs6) this.zoneMarkerViewBinding$delegate.getValue();
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(ZoneMarkerClusterItem item, MarkerOptions markerOptions) {
        String cacheKey;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((ZoneMarkerClusterRenderer) item, markerOptions);
        LruCache<String, C6378PT> lruCache = this.bitmapCache;
        cacheKey = ZoneMarkerClusterRendererKt.getCacheKey(item);
        C6378PT c6378pt = (C6378PT) C50896wE2.m7192a(lruCache, cacheKey, new C13843x74b91129(this, item));
        PointF pointF = this.anchorPoint;
        if (pointF == null) {
            pointF = TEMP_ANCHOR_POINT;
        }
        markerOptions.m50657N0(c6378pt).m50644u(pointF.x, pointF.y);
    }

    @Override // co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer
    public void updateItem(ZoneMarkerClusterItem item, C40889fM2 marker) {
        String cacheKey;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        LruCache<String, C6378PT> lruCache = this.bitmapCache;
        cacheKey = ZoneMarkerClusterRendererKt.getCacheKey(item);
        C6378PT c6378pt = (C6378PT) C50896wE2.m7192a(lruCache, cacheKey, new ZoneMarkerClusterRenderer$updateItem$descriptor$1(this, item));
        PointF pointF = this.anchorPoint;
        if (pointF == null) {
            pointF = TEMP_ANCHOR_POINT;
        }
        marker.m41523k(c6378pt);
        marker.m41526h(pointF.x, pointF.y);
        marker.m41515s(item.getZIndex());
    }
}
