package co.bird.android.app.feature.map.infowindow;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.app.feature.map.infowindow.tag.PolygonTag;
import co.bird.android.app.feature.map.infowindow.widget.AreaInfoWindowView;
import co.bird.android.app.feature.map.infowindow.widget.BatteryInfoWindowView;
import co.bird.android.app.feature.map.infowindow.widget.OperatorInfoWindowView;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.persistence.BirdMapMarker;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.RangeInfoWindowView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C39011cD1;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/BirdInfoWindowAdapter;", "LcD1$b;", "LfM2;", "marker", "Landroid/view/View;", "getInfoWindow", "getInfoContents", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lco/bird/android/model/constant/MapMode;", "mode", "Lco/bird/android/model/constant/MapMode;", "getMode", "()Lco/bird/android/model/constant/MapMode;", "", "useRange", "Z", "Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;", "areaView", "Lco/bird/android/app/feature/map/infowindow/widget/AreaInfoWindowView;", "Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;", "batteryView", "Lco/bird/android/app/feature/map/infowindow/widget/BatteryInfoWindowView;", "Lco/bird/android/widget/RangeInfoWindowView;", "rangeView", "Lco/bird/android/widget/RangeInfoWindowView;", "Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;", "operatorView", "Lco/bird/android/app/feature/map/infowindow/widget/OperatorInfoWindowView;", "<init>", "(Landroid/content/Context;Lco/bird/android/model/constant/MapMode;Z)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdInfoWindowAdapter implements C39011cD1.InterfaceC13460b {
    private final AreaInfoWindowView areaView;
    private final BatteryInfoWindowView batteryView;
    private final Context context;
    private final MapMode mode;
    private final OperatorInfoWindowView operatorView;
    private final RangeInfoWindowView rangeView;
    private final boolean useRange;

    public BirdInfoWindowAdapter(Context context, MapMode mode, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.context = context;
        this.mode = mode;
        this.useRange = z;
        this.areaView = new AreaInfoWindowView(context, null, 0, 6, null);
        this.batteryView = new BatteryInfoWindowView(context, null, 0, 6, null);
        this.rangeView = new RangeInfoWindowView(context, null, 0, 6, null);
        this.operatorView = new OperatorInfoWindowView(context, null, 0, 6, null);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // p000.C39011cD1.InterfaceC13460b
    public View getInfoContents(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Object m41531c = marker.m41531c();
        if (m41531c instanceof PolygonTag) {
            this.areaView.show((PolygonTag) m41531c);
            return this.areaView;
        }
        return null;
    }

    @Override // p000.C39011cD1.InterfaceC13460b
    public View getInfoWindow(C40889fM2 marker) {
        BirdMarkerClusterItem birdMarkerClusterItem;
        Object marker2;
        Intrinsics.checkNotNullParameter(marker, "marker");
        Object m41531c = marker.m41531c();
        if (m41531c instanceof BirdMarkerClusterItem) {
            birdMarkerClusterItem = (BirdMarkerClusterItem) m41531c;
        } else {
            birdMarkerClusterItem = null;
        }
        if (birdMarkerClusterItem == null || (marker2 = birdMarkerClusterItem.getMarker()) == null) {
            return null;
        }
        if ((marker2 instanceof WireBird) && this.mode == MapMode.RIDER) {
            if (!((BirdMarkerClusterItem) m41531c).isSelected()) {
                return null;
            }
            if (this.useRange) {
                WireBird wireBird = (WireBird) marker2;
                if (wireBird.getEstimatedRange() != null) {
                    RangeInfoWindowView rangeInfoWindowView = this.rangeView;
                    Integer estimatedRange = wireBird.getEstimatedRange();
                    Intrinsics.checkNotNull(estimatedRange);
                    rangeInfoWindowView.setRange(estimatedRange.intValue());
                    return rangeInfoWindowView;
                }
            }
            BatteryInfoWindowView batteryInfoWindowView = this.batteryView;
            batteryInfoWindowView.setBird((WireBird) marker2);
            return batteryInfoWindowView;
        } else if (!(marker2 instanceof BirdMapMarker) || this.mode != MapMode.OPERATOR) {
            return null;
        } else {
            OperatorInfoWindowView operatorInfoWindowView = this.operatorView;
            operatorInfoWindowView.setBirdMarker((BirdMapMarker) marker2);
            return operatorInfoWindowView;
        }
    }

    public final MapMode getMode() {
        return this.mode;
    }
}
