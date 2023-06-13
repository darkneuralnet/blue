package co.bird.android.app.feature.map.renderer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.renderer.OperatorBirdMarkerClusterRenderer;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.persistence.FleetIconAnimation;
import co.bird.android.model.persistence.FleetMarker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001BC\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010+\u001a\u00020*\u0012\u0014\b\u0001\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020,\u0012\b\b\u0001\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/J \u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0010H\u0014J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u001e\u0010\u0017\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\b\u0010\u001b\u001a\u00020\u0007H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u00060"}, m28432d2 = {"Lco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer;", "LEW0;", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "Lco/bird/android/model/persistence/BirdMapMarker;", "item", "LfM2;", "marker", "", "maybeAnimate", "Lco/bird/android/model/persistence/FleetIconAnimation;", "Landroid/animation/Animator;", "animator", "LPT;", "bitmapDescriptor", "Landroid/graphics/PointF;", "anchorPoint", "LDl0;", "cluster", "", "shouldRenderAsCluster", "Lcom/google/android/gms/maps/model/MarkerOptions;", "markerOptions", "onBeforeClusterItemRendered", "selectItem", "deselectItem", "clusterItem", "onClusterItemRendered", "startMarkerAnimation", "LTq4;", "reactiveConfig", "LTq4;", "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;", "markerOptionProvider", "Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;", "", "animatedMarkers", "Ljava/util/Set;", "", "animators", "Ljava/util/List;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LcD1;", "map", "LGl0;", "clusterManager", "<init>", "(Landroid/content/Context;LTq4;LcD1;LGl0;Lco/bird/android/app/feature/map/renderer/BirdMarkerClusterItemOptionProvider;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorBirdMarkerClusterRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorBirdMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n1855#2,2:149\n1855#2,2:154\n1855#2,2:156\n1#3:151\n13579#4,2:152\n*S KotlinDebug\n*F\n+ 1 OperatorBirdMarkerClusterRenderer.kt\nco/bird/android/app/feature/map/renderer/OperatorBirdMarkerClusterRenderer\n*L\n110#1:149,2\n113#1:154,2\n125#1:156,2\n112#1:152,2\n*E\n"})
/* loaded from: classes2.dex */
public final class OperatorBirdMarkerClusterRenderer extends EW0<BirdMarkerClusterItem<BirdMapMarker>> {
    private final Set<C40889fM2> animatedMarkers;
    private List<Animator> animators;
    private final BirdMarkerClusterItemOptionProvider markerOptionProvider;
    private final C36207Tq4 reactiveConfig;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FleetIconAnimation.values().length];
            try {
                iArr[FleetIconAnimation.FLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FleetIconAnimation.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorBirdMarkerClusterRenderer(Context context, C36207Tq4 reactiveConfig, C39011cD1 map, C33116Gl0<BirdMarkerClusterItem<BirdMapMarker>> clusterManager, BirdMarkerClusterItemOptionProvider markerOptionProvider) {
        super(context, map, clusterManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(clusterManager, "clusterManager");
        Intrinsics.checkNotNullParameter(markerOptionProvider, "markerOptionProvider");
        this.reactiveConfig = reactiveConfig;
        this.markerOptionProvider = markerOptionProvider;
        this.animatedMarkers = new LinkedHashSet();
        this.animators = new ArrayList();
    }

    private final PointF anchorPoint(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        return this.markerOptionProvider.anchorPoint(birdMarkerClusterItem);
    }

    private final Animator animator(final FleetIconAnimation fleetIconAnimation) {
        int i = WhenMappings.$EnumSwitchMapping$0[fleetIconAnimation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 3);
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Ij3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                OperatorBirdMarkerClusterRenderer.animator$lambda$9$lambda$8(OperatorBirdMarkerClusterRenderer.this, fleetIconAnimation, valueAnimator);
            }
        });
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animator$lambda$9$lambda$8(OperatorBirdMarkerClusterRenderer this$0, FleetIconAnimation this_animator, ValueAnimator it) {
        BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem;
        boolean z;
        BirdMapMarker marker;
        FleetMarker fleetMarker;
        FleetIconAnimation iconAnimation;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_animator, "$this_animator");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        for (C40889fM2 c40889fM2 : this$0.animatedMarkers) {
            Object m41531c = c40889fM2.m41531c();
            String str = null;
            if (m41531c instanceof BirdMarkerClusterItem) {
                birdMarkerClusterItem = (BirdMarkerClusterItem) m41531c;
            } else {
                birdMarkerClusterItem = null;
            }
            if (birdMarkerClusterItem != null && (marker = birdMarkerClusterItem.getMarker()) != null && (fleetMarker = marker.getFleetMarker()) != null && (iconAnimation = fleetMarker.getIconAnimation()) != null) {
                str = iconAnimation.name();
            }
            if (Intrinsics.areEqual(str, this_animator.name())) {
                BirdMarkerClusterItemOptionProvider birdMarkerClusterItemOptionProvider = this$0.markerOptionProvider;
                if (intValue % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c40889fM2.m41523k(birdMarkerClusterItemOptionProvider.bitmapDescriptor(birdMarkerClusterItem, z));
            }
        }
    }

    private final C6378PT bitmapDescriptor(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem) {
        boolean z;
        if (this.reactiveConfig.m82623f8().m73665a().getOperatorConfig().getFeatures().getFleetStatus().getEnableFleetMarkerAnimation() && birdMarkerClusterItem.getMarker().getFleetMarker().getFleetIcon() != ClientIcon.UNKNOWN) {
            z = true;
        } else {
            z = false;
        }
        return this.markerOptionProvider.bitmapDescriptor(birdMarkerClusterItem, z);
    }

    private final void maybeAnimate(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem, C40889fM2 c40889fM2) {
        BirdMapMarker marker;
        FleetMarker fleetMarker;
        FleetIconAnimation iconAnimation;
        if (this.reactiveConfig.m82623f8().m73665a().getOperatorConfig().getFeatures().getFleetStatus().getEnableFleetMarkerAnimation() && birdMarkerClusterItem != null && (marker = birdMarkerClusterItem.getMarker()) != null && (fleetMarker = marker.getFleetMarker()) != null && (iconAnimation = fleetMarker.getIconAnimation()) != null && iconAnimation != FleetIconAnimation.UNKNOWN) {
            c40889fM2.m41518p(birdMarkerClusterItem.getMarker());
            this.animatedMarkers.add(c40889fM2);
        }
    }

    @Override // p000.EW0
    public boolean shouldRenderAsCluster(InterfaceC32414Dl0<BirdMarkerClusterItem<BirdMapMarker>> cluster) {
        Intrinsics.checkNotNullParameter(cluster, "cluster");
        if (cluster.mo75549a() > 30) {
            return true;
        }
        return false;
    }

    @Override // p000.EW0
    public void startMarkerAnimation() {
        this.animatedMarkers.clear();
        for (Animator animator : this.animators) {
            animator.end();
        }
        Unit unit = Unit.INSTANCE;
        this.animators.clear();
        for (FleetIconAnimation fleetIconAnimation : FleetIconAnimation.values()) {
            Animator animator2 = animator(fleetIconAnimation);
            if (animator2 != null) {
                this.animators.add(animator2);
            }
        }
        for (Animator animator3 : this.animators) {
            animator3.start();
        }
    }

    @Override // p000.EW0
    public void deselectItem(BirdMarkerClusterItem<BirdMapMarker> item, C40889fM2 marker) {
        PointF anchorPoint;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.selectItem((OperatorBirdMarkerClusterRenderer) item, marker);
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        if (bitmapDescriptor == null || (anchorPoint = anchorPoint(item)) == null) {
            return;
        }
        marker.m41523k(bitmapDescriptor);
        marker.m41526h(anchorPoint.x, anchorPoint.y);
        marker.m41515s(item.getZIndex());
        maybeAnimate(item, marker);
    }

    @Override // p000.EW0
    public void onBeforeClusterItemRendered(BirdMarkerClusterItem<BirdMapMarker> item, MarkerOptions markerOptions) {
        PointF anchorPoint;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(markerOptions, "markerOptions");
        super.onBeforeClusterItemRendered((OperatorBirdMarkerClusterRenderer) item, markerOptions);
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        if (bitmapDescriptor == null || (anchorPoint = anchorPoint(item)) == null) {
            return;
        }
        markerOptions.m50657N0(bitmapDescriptor).m50644u(anchorPoint.x, anchorPoint.y);
    }

    @Override // p000.EW0
    public void onClusterItemRendered(BirdMarkerClusterItem<BirdMapMarker> birdMarkerClusterItem, C40889fM2 c40889fM2) {
        super.onClusterItemRendered((OperatorBirdMarkerClusterRenderer) birdMarkerClusterItem, c40889fM2);
        if (c40889fM2 != null) {
            maybeAnimate(birdMarkerClusterItem, c40889fM2);
        }
    }

    @Override // p000.EW0
    public void selectItem(BirdMarkerClusterItem<BirdMapMarker> item, C40889fM2 marker) {
        PointF anchorPoint;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(marker, "marker");
        super.selectItem((OperatorBirdMarkerClusterRenderer) item, marker);
        C6378PT bitmapDescriptor = bitmapDescriptor(item);
        if (bitmapDescriptor == null || (anchorPoint = anchorPoint(item)) == null) {
            return;
        }
        marker.m41523k(bitmapDescriptor);
        marker.m41526h(anchorPoint.x, anchorPoint.y);
        marker.m41515s(item.getZIndex());
        maybeAnimate(item, marker);
    }
}
