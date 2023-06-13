package co.bird.android.app.feature.map.p008ui.renderer;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.renderer.MapPolygonableRenderer;
import co.bird.android.model.Polygonable;
import co.bird.android.model.ZoomBehaviorable;
import co.bird.android.model.persistence.Area;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/Polygonable;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapPolygonableRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapPolygonableRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,518:1\n1#2:519\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MapPolygonableRenderer$3$filterVisiblePolygonables$1$zoomModifiedPolygon$2 */
/* loaded from: classes2.dex */
public final class C13891x3d7c66b4 extends Lambda implements Function0<Polygonable> {
    final /* synthetic */ Polygonable $polygonable;
    final /* synthetic */ Location $userLocation;
    final /* synthetic */ float $zoom;
    final /* synthetic */ MapPolygonableRenderer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13891x3d7c66b4(Polygonable polygonable, Location location, float f, MapPolygonableRenderer mapPolygonableRenderer) {
        super(0);
        this.$polygonable = polygonable;
        this.$userLocation = location;
        this.$zoom = f;
        this.this$0 = mapPolygonableRenderer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d3, code lost:
        if (r5 != r1.m30788c()) goto L20;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Polygonable invoke() {
        Area copy;
        Polygonable polygonable;
        Polygonable polygonable2;
        Polygonable polygonable3 = this.$polygonable;
        if (polygonable3 instanceof Area) {
            C43238jJ6 m98794a = KX3.m98794a((ZoomBehaviorable) polygonable3, this.$userLocation, this.$zoom);
            copy = r3.copy((r75 & 1) != 0 ? r3.f66669id : null, (r75 & 2) != 0 ? r3.title : null, (r75 & 4) != 0 ? r3.label : null, (r75 & 8) != 0 ? r3.notes : null, (r75 & 16) != 0 ? r3.hideBirds : false, (r75 & 32) != 0 ? r3.rejectDrops : false, (r75 & 64) != 0 ? r3.noRides : false, (r75 & 128) != 0 ? r3.noParking : false, (r75 & 256) != 0 ? r3.preferredParking : false, (r75 & 512) != 0 ? r3.delivery : false, (r75 & 1024) != 0 ? r3.isReleaseConstrained : false, (r75 & 2048) != 0 ? r3.isDemandArea : false, (r75 & 4096) != 0 ? r3.feeModified : null, (r75 & 8192) != 0 ? r3.demandLevel : null, (r75 & 16384) != 0 ? r3.overlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.overlayIcon : null, (r75 & 65536) != 0 ? r3.overlayMinZoomLevel : null, (r75 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.selectedOverlayLabel : null, (r75 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.region : null, (r75 & 524288) != 0 ? r3.color : m98794a.m30789b(), (r75 & 1048576) != 0 ? r3.colorDark : null, (r75 & 2097152) != 0 ? r3.borderColor : 0, (r75 & 4194304) != 0 ? r3.borderColorDark : null, (r75 & 8388608) != 0 ? r3.titleColor : 0, (r75 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.titleColorDark : null, (r75 & 33554432) != 0 ? r3.zoomBehavior : null, (r75 & 67108864) != 0 ? r3.operational : false, (r75 & 134217728) != 0 ? r3.maxSpeed : null, (r75 & 268435456) != 0 ? r3.releaseCapacity : null, (r75 & 536870912) != 0 ? r3.noParkingFineAlertTitle : null, (r75 & 1073741824) != 0 ? r3.noParkingFineAlertMessage : null, (r75 & Integer.MIN_VALUE) != 0 ? r3.riderBarInRideMessageTitle : null, (r76 & 1) != 0 ? r3.riderBarInRideMessageBody : null, (r76 & 2) != 0 ? r3.riderBarNotInRideMessageTitle : null, (r76 & 4) != 0 ? r3.riderBarNotInRideMessageBody : null, (r76 & 8) != 0 ? r3.riderBarInRideMessageIconType : null, (r76 & 16) != 0 ? r3.riderBarNotInRideMessageIconType : null, (r76 & 32) != 0 ? r3.areaReleaseCapacityIconType : null, (r76 & 64) != 0 ? r3.partnerId : null, (r76 & 128) != 0 ? r3.fleetIds : null, (r76 & 256) != 0 ? r3.areaKeys : null, (r76 & 512) != 0 ? r3.isUniversalArea : false, (r76 & 1024) != 0 ? r3.noParkingFineCurrency : null, (r76 & 2048) != 0 ? r3.noParkingWarningAlertTitle : null, (r76 & 4096) != 0 ? r3.noParkingWarningAlertBody : null, (r76 & 8192) != 0 ? r3.noParkingFineAmount : null, (r76 & 16384) != 0 ? r3.areasMerged : null, (r76 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.centerPoint : null, (r76 & 65536) != 0 ? r3.role : null, (r76 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? r3.updatedAt : null, (r76 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? r3.zoneId : null, (r76 & 524288) != 0 ? ((Area) this.$polygonable).walkway : null);
            if (this.this$0.polygonablePolygons.containsKey((Object) this.$polygonable)) {
                MapPolygonableRenderer.PolygonWrapper polygonWrapper = (MapPolygonableRenderer.PolygonWrapper) this.this$0.polygonablePolygons.get((Object) this.$polygonable);
                boolean z = true;
                if ((polygonWrapper == null || (polygonable2 = polygonWrapper.getPolygonable()) == null || polygonable2.getColor() != m98794a.m30789b()) ? false : true) {
                    MapPolygonableRenderer.PolygonWrapper polygonWrapper2 = (MapPolygonableRenderer.PolygonWrapper) this.this$0.polygonablePolygons.get((Object) this.$polygonable);
                    if (polygonWrapper2 == null || !polygonWrapper2.isAdded()) {
                        z = false;
                    }
                }
                C41318g46.AbstractC20723b abstractC20723b = this.this$0.logger;
                String id = this.$polygonable.getId();
                MapPolygonableRenderer.PolygonWrapper polygonWrapper3 = (MapPolygonableRenderer.PolygonWrapper) this.this$0.polygonablePolygons.get((Object) this.$polygonable);
                Integer valueOf = (polygonWrapper3 == null || (polygonable = polygonWrapper3.getPolygonable()) == null) ? null : Integer.valueOf(polygonable.getColor());
                abstractC20723b.mo7228a("setting " + id + " as modified by modifying value colors: " + valueOf + " vs " + m98794a.m30789b(), new Object[0]);
                MapPolygonableRenderer.PolygonWrapper polygonWrapper4 = (MapPolygonableRenderer.PolygonWrapper) this.this$0.polygonablePolygons.get((Object) this.$polygonable);
                if (polygonWrapper4 != null) {
                    polygonWrapper4.setPolygonable(copy);
                }
            }
            if (m98794a.m30788c()) {
                return copy;
            }
            return null;
        }
        return polygonable3;
    }
}
