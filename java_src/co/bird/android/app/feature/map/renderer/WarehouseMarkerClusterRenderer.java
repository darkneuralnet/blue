package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.warehousemarker.WarehouseMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.WarehouseMarkerClusterRenderer;
import co.bird.android.model.persistence.WarehouseMarker;
import com.google.android.gms.maps.model.MarkerOptions;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u000e\b\u0001\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$\u0012\b\b\u0001\u0010'\u001a\u00020&\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u001e\u001a\u00020\u001d*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006*"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer;", "Lco/bird/android/app/feature/map/renderer/AbstractMarkerClusterRenderer;", "Lco/bird/android/model/persistence/WarehouseMarker;", "Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterItem;", "LPT;", "bitmapDescriptor", "item", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "", "onBeforeClusterItemRendered", "LfM2;", "marker", "updateItem", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "Lps6;", "binding$delegate", "Lkotlin/Lazy;", "getBinding", "()Lps6;", "binding", "selectedBinding$delegate", "getSelectedBinding", "selectedBinding", "Landroid/graphics/PointF;", "anchorPoint", "Landroid/graphics/PointF;", "cachedDescriptor", "LPT;", "getAnchorPoint", "(Lps6;)Landroid/graphics/PointF;", "LGl0;", "clusterManager", "LcD1;", "map", "<init>", "(LGl0;LcD1;Landroid/content/Context;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/WarehouseMarkerClusterRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
/* loaded from: classes2.dex */
public final class WarehouseMarkerClusterRenderer extends AbstractMarkerClusterRenderer<WarehouseMarker, WarehouseMarkerClusterItem> {
    private PointF anchorPoint;
    private final Lazy binding$delegate;
    private C6378PT cachedDescriptor;
    private final Context context;
    private final Handler mainThreadHandler;
    private final Lazy selectedBinding$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarehouseMarkerClusterRenderer(C33116Gl0<WarehouseMarkerClusterItem> clusterManager, C39011cD1 map, Context context) {
        super(context, map, clusterManager);
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
        lazy = LazyKt__LazyJVMKt.lazy(new WarehouseMarkerClusterRenderer$binding$2(this));
        this.binding$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new WarehouseMarkerClusterRenderer$selectedBinding$2(this));
        this.selectedBinding$delegate = lazy2;
    }

    private final C6378PT bitmapDescriptor(WarehouseMarkerClusterItem warehouseMarkerClusterItem) {
        final C47129ps6 binding;
        if (warehouseMarkerClusterItem.getSelected()) {
            binding = getSelectedBinding();
        } else {
            binding = getBinding();
        }
        Intrinsics.checkNotNullExpressionValue(binding, "if (selected) selectedBinding else binding");
        binding.f104206b.setImageDrawable(NA0.m94299e(this.context, C48193rg4.ic_warehouse));
        if (this.anchorPoint == null) {
            if (binding.f104207c.getMeasuredHeight() > 0) {
                getAnchorPoint(binding);
                Unit unit = Unit.INSTANCE;
            } else {
                this.mainThreadHandler.post(new Runnable() { // from class: Uy6
                    @Override // java.lang.Runnable
                    public final void run() {
                        WarehouseMarkerClusterRenderer.bitmapDescriptor$lambda$1(WarehouseMarkerClusterRenderer.this, binding);
                    }
                });
                Unit unit2 = Unit.INSTANCE;
            }
        }
        Context context = this.context;
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return C40788fB0.iconBitmapDescriptor$default(context, root, (Drawable) null, (AP1) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bitmapDescriptor$lambda$1(WarehouseMarkerClusterRenderer this$0, C47129ps6 binding) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        this$0.getAnchorPoint(binding);
    }

    private final PointF getAnchorPoint(C47129ps6 c47129ps6) {
        PointF pointF = new PointF(0.5f, c47129ps6.f104207c.getBottom() / c47129ps6.getRoot().getMeasuredHeight());
        this.anchorPoint = pointF;
        return pointF;
    }

    private final C47129ps6 getBinding() {
        return (C47129ps6) this.binding$delegate.getValue();
    }

    private final C47129ps6 getSelectedBinding() {
        return (C47129ps6) this.selectedBinding$delegate.getValue();
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(WarehouseMarkerClusterItem item, MarkerOptions markerOptions) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        C6378PT c6378pt = this.cachedDescriptor;
        if (c6378pt == null) {
            c6378pt = bitmapDescriptor(item);
            this.cachedDescriptor = c6378pt;
        }
        PointF pointF = this.anchorPoint;
        if (pointF == null) {
            pointF = new PointF(0.5f, 1.0f);
        }
        markerOptions.m50657N0(c6378pt).m50644u(pointF.x, pointF.y);
    }

    @Override // co.bird.android.app.feature.map.renderer.AbstractMarkerClusterRenderer
    public void updateItem(WarehouseMarkerClusterItem item, C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        PointF pointF = this.anchorPoint;
        if (pointF == null) {
            pointF = new PointF(0.5f, 1.0f);
        }
        marker.m41523k(bitmapDescriptor);
        marker.m41526h(pointF.x, pointF.y);
        marker.m41515s(item.getZIndex());
    }
}
