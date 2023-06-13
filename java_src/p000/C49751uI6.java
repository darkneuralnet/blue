package p000;

import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.constant.ColoredIcon;
import co.bird.android.model.persistence.ZoneFlightSheetDetails;
import co.bird.android.model.persistence.ZoneMarker;
import co.bird.android.model.persistence.ZoneOverlayAnalytics;
import co.bird.android.model.persistence.ZonePolygonable;
import co.bird.android.model.persistence.nestedstructures.Icon;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotationLabel;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LuI6;", "", "Lco/bird/android/model/persistence/ZoneMarker;", "marker", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "overlayAnalytics", "", "b", "Lco/bird/android/model/persistence/ZonePolygonable;", "polygonable", "c", "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;", "flightSheet", C17296a.f69688o, "LEa;", "LEa;", "analyticsManager", "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "selectedOverlayAnalytics", "Lco/bird/android/model/persistence/ZoneMarker;", "selectedMarker", "<init>", "(LEa;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneAnalyticsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneAnalyticsManager.kt\nco/bird/android/app/feature/operator/zone/ZoneAnalyticsManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: uI6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49751uI6 {

    /* renamed from: a */
    public final InterfaceC1880Ea f112174a;

    /* renamed from: b */
    public ZoneOverlayAnalytics f112175b;

    /* renamed from: c */
    public ZoneMarker f112176c;

    public C49751uI6(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f112174a = analyticsManager;
    }

    /* renamed from: a */
    public final void m10472a(ZoneFlightSheetDetails flightSheet) {
        ZoneOverlay overlay;
        String str;
        ZoneAnnotation zoneAnnotation;
        ColoredIcon coloredIcon;
        String name;
        Integer num;
        String str2;
        ZoneAnnotation zoneAnnotation2;
        ZoneAnnotationLabel label;
        ZoneAnnotation zoneAnnotation3;
        ThemedColors color;
        ZoneAnnotation zoneAnnotation4;
        Icon icon;
        ClientIcon icon2;
        Intrinsics.checkNotNullParameter(flightSheet, "flightSheet");
        ZoneMarker zoneMarker = this.f112176c;
        if (zoneMarker == null || !Intrinsics.areEqual(zoneMarker.getZoneId(), flightSheet.getZoneId())) {
            zoneMarker = null;
        }
        ZoneOverlayAnalytics zoneOverlayAnalytics = this.f112175b;
        if (zoneOverlayAnalytics != null) {
            if (!Intrinsics.areEqual(zoneOverlayAnalytics.getZoneId(), flightSheet.getZoneId())) {
                zoneOverlayAnalytics = null;
            }
            if (zoneOverlayAnalytics != null && (overlay = zoneOverlayAnalytics.getOverlay()) != null) {
                InterfaceC1880Ea interfaceC1880Ea = this.f112174a;
                String zoneId = flightSheet.getZoneId();
                if (zoneMarker == null || (zoneAnnotation4 = zoneMarker.getZoneAnnotation()) == null || (icon = zoneAnnotation4.getIcon()) == null || (icon2 = icon.getIcon()) == null || (name = icon2.name()) == null) {
                    if (zoneMarker != null && (zoneAnnotation = zoneMarker.getZoneAnnotation()) != null && (coloredIcon = zoneAnnotation.getColoredIcon()) != null) {
                        name = coloredIcon.name();
                    } else {
                        str = null;
                        if (zoneMarker == null && (zoneAnnotation3 = zoneMarker.getZoneAnnotation()) != null && (color = zoneAnnotation3.getColor()) != null) {
                            num = Integer.valueOf(color.getLightMode());
                        } else {
                            num = null;
                        }
                        if (zoneMarker == null && (zoneAnnotation2 = zoneMarker.getZoneAnnotation()) != null && (label = zoneAnnotation2.getLabel()) != null) {
                            str2 = label.getText();
                        } else {
                            str2 = null;
                        }
                        interfaceC1880Ea.mo55905y(new PI6(null, null, null, zoneId, str, str2, num, overlay.getColor().getLightMode(), overlay.getBorderColor().getLightMode(), flightSheet.getZoneStatus().getTitle(), 7, null));
                        this.f112176c = null;
                        this.f112175b = null;
                    }
                }
                str = name;
                if (zoneMarker == null) {
                }
                num = null;
                if (zoneMarker == null) {
                }
                str2 = null;
                interfaceC1880Ea.mo55905y(new PI6(null, null, null, zoneId, str, str2, num, overlay.getColor().getLightMode(), overlay.getBorderColor().getLightMode(), flightSheet.getZoneStatus().getTitle(), 7, null));
                this.f112176c = null;
                this.f112175b = null;
            }
        }
    }

    /* renamed from: b */
    public final void m10471b(ZoneMarker marker, ZoneOverlayAnalytics overlayAnalytics) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(overlayAnalytics, "overlayAnalytics");
        this.f112176c = marker;
        this.f112175b = overlayAnalytics;
    }

    /* renamed from: c */
    public final void m10470c(ZonePolygonable polygonable) {
        Intrinsics.checkNotNullParameter(polygonable, "polygonable");
        this.f112175b = new ZoneOverlayAnalytics(polygonable.getZoneId(), polygonable.getOverlay());
        this.f112176c = null;
    }
}
