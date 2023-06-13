package p000;

import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireArea;
import co.bird.android.model.wire.WireLocation;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireArea;", "", "role", "Lco/bird/android/model/persistence/Area;", C17296a.f69688o, "co.bird.android.repository.area"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Vm */
/* loaded from: classes4.dex */
public final class C8792Vm {
    /* renamed from: a */
    public static final Area m79432a(WireArea wireArea, String role) {
        Geolocation geolocation;
        Intrinsics.checkNotNullParameter(wireArea, "<this>");
        Intrinsics.checkNotNullParameter(role, "role");
        String id = wireArea.getId();
        String title = wireArea.getTitle();
        String label = wireArea.getLabel();
        String notes = wireArea.getNotes();
        boolean hideBirds = wireArea.getHideBirds();
        boolean rejectDrops = wireArea.getRejectDrops();
        boolean noRides = wireArea.getNoRides();
        boolean noParking = wireArea.getNoParking();
        boolean preferredParking = wireArea.getPreferredParking();
        boolean delivery = wireArea.getDelivery();
        boolean isReleaseConstrained = wireArea.isReleaseConstrained();
        boolean isDemandArea = wireArea.isDemandArea();
        Boolean feeModified = wireArea.getFeeModified();
        Integer demandLevel = wireArea.getDemandLevel();
        String overlayLabel = wireArea.getOverlayLabel();
        AreaIconType overlayIcon = wireArea.getOverlayIcon();
        Integer overlayMinZoomLevel = wireArea.getOverlayMinZoomLevel();
        String selectedOverlayLabel = wireArea.getSelectedOverlayLabel();
        Polygon region = wireArea.getRegion();
        int color = wireArea.getColor();
        int borderColor = wireArea.getBorderColor();
        int titleColor = wireArea.getTitleColor();
        ZoomBehavior zoomBehavior = wireArea.getZoomBehavior();
        boolean operational = wireArea.getOperational();
        Integer maxSpeed = wireArea.getMaxSpeed();
        Integer releaseCapacity = wireArea.getReleaseCapacity();
        String noParkingFineAlertTitle = wireArea.getNoParkingFineAlertTitle();
        String noParkingFineAlertMessage = wireArea.getNoParkingFineAlertMessage();
        String riderBarInRideMessageTitle = wireArea.getRiderBarInRideMessageTitle();
        String riderBarInRideMessageBody = wireArea.getRiderBarInRideMessageBody();
        String riderBarNotInRideMessageTitle = wireArea.getRiderBarNotInRideMessageTitle();
        String riderBarNotInRideMessageBody = wireArea.getRiderBarNotInRideMessageBody();
        AreaIconType riderBarInRideMessageIconType = wireArea.getRiderBarInRideMessageIconType();
        AreaIconType riderBarNotInRideMessageIconType = wireArea.getRiderBarNotInRideMessageIconType();
        AreaIconType areaReleaseCapacityIconType = wireArea.getAreaReleaseCapacityIconType();
        String partnerId = wireArea.getPartnerId();
        List<String> fleetIds = wireArea.getFleetIds();
        List<String> areaKeys = wireArea.getAreaKeys();
        boolean isUniversalArea = wireArea.isUniversalArea();
        String noParkingFineCurrency = wireArea.getNoParkingFineCurrency();
        Integer noParkingFineAmount = wireArea.getNoParkingFineAmount();
        List<String> areasMerged = wireArea.getAreasMerged();
        WireLocation centerPoint = wireArea.getCenterPoint();
        if (centerPoint != null) {
            geolocation = C47311qB0.m17966a(centerPoint);
        } else {
            geolocation = null;
        }
        Geolocation geolocation2 = geolocation;
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return new Area(id, title, label, notes, hideBirds, rejectDrops, noRides, noParking, preferredParking, delivery, isReleaseConstrained, isDemandArea, feeModified, demandLevel, overlayLabel, overlayIcon, overlayMinZoomLevel, selectedOverlayLabel, region, color, null, borderColor, null, titleColor, null, zoomBehavior, operational, maxSpeed, releaseCapacity, noParkingFineAlertTitle, noParkingFineAlertMessage, riderBarInRideMessageTitle, riderBarInRideMessageBody, riderBarNotInRideMessageTitle, riderBarNotInRideMessageBody, riderBarInRideMessageIconType, riderBarNotInRideMessageIconType, areaReleaseCapacityIconType, partnerId, fleetIds, areaKeys, isUniversalArea, noParkingFineCurrency, null, null, noParkingFineAmount, areasMerged, geolocation2, role, now, null, Boolean.FALSE, 0, 6144, null);
    }
}
