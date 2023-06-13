package p000;

import android.content.Context;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.android.model.wire.WireBirdLocationTrack;
import co.bird.android.model.wire.WireLocation;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001c\u0010\n\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lbt3;", "", "", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/OperatorRideHistoryItem;", RequestHeadersFactory.MODEL, "Lco/bird/android/model/wire/WireLocation;", "fallbackLocation", "e", "LcD1;", "c", "LKp6;", "Landroid/content/Context;", "b", "Lz4;", C17296a.f69688o, "Lz4;", "binding", "<init>", "(Lz4;)V", "ridedetail_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorRideDetailUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorRideDetailUi.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailUi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1855#2:120\n1856#2:122\n1#3:121\n*S KotlinDebug\n*F\n+ 1 OperatorRideDetailUi.kt\nco/bird/android/feature/operator/ridedetail/OperatorRideDetailUi\n*L\n77#1:120\n77#1:122\n*E\n"})
/* renamed from: bt3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38817bt3 {

    /* renamed from: a */
    public final C30900z4 f59713a;

    public C38817bt3(C30900z4 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f59713a = binding;
    }

    /* renamed from: f */
    public static final void m62201f(C38817bt3 this$0, OperatorRideHistoryItem model, WireLocation fallbackLocation, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(fallbackLocation, "$fallbackLocation");
        Intrinsics.checkNotNullParameter(map, "map");
        this$0.m62204c(map, model, fallbackLocation);
    }

    /* renamed from: b */
    public final Context m62205b(InterfaceC34094Kp6 interfaceC34094Kp6) {
        Context context = interfaceC34094Kp6.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.root.context");
        return context;
    }

    /* renamed from: c */
    public final void m62204c(C39011cD1 c39011cD1, OperatorRideHistoryItem operatorRideHistoryItem, WireLocation wireLocation) {
        Object firstOrNull;
        Object lastOrNull;
        List<WireBirdLocationTrack> tracks = operatorRideHistoryItem.getTracks();
        if (!tracks.isEmpty()) {
            C41318g46.m40163a("drawing route with tracks", new Object[0]);
            try {
                PolylineOptions m50611j1 = new PolylineOptions().m50622E(C40788fB0.m41776f(m62205b(this.f59713a), C32364Df4.birdESBlue)).m50610k1(new RoundCap()).m50620F(new RoundCap()).m50611j1(2);
                Intrinsics.checkNotNullExpressionValue(m50611j1, "PolylineOptions()\n      …ointType(JointType.ROUND)");
                LatLngBounds.C17620a c17620a = new LatLngBounds.C17620a();
                for (WireBirdLocationTrack wireBirdLocationTrack : tracks) {
                    WireLocation location = wireBirdLocationTrack.getLocation();
                    LatLng latLng = new LatLng(location.component1(), location.component2());
                    m50611j1.m50607s(latLng);
                    c17620a = c17620a.m50666b(latLng);
                    Intrinsics.checkNotNullExpressionValue(c17620a, "bounds.include(point)");
                }
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) tracks);
                WireBirdLocationTrack wireBirdLocationTrack2 = (WireBirdLocationTrack) firstOrNull;
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) tracks);
                WireBirdLocationTrack wireBirdLocationTrack3 = (WireBirdLocationTrack) lastOrNull;
                if (wireBirdLocationTrack2 != null && wireBirdLocationTrack3 != null) {
                    WireLocation location2 = wireBirdLocationTrack2.getLocation();
                    c39011cD1.m61685c(new MarkerOptions().m50657N0(C6780QT.m88494b(C33309Hg4.ic_receipt_ride_start)).m50644u(0.5f, 1.0f).m50643u1(new LatLng(location2.getLatitude(), location2.getLongitude())));
                    WireLocation location3 = wireBirdLocationTrack3.getLocation();
                    c39011cD1.m61685c(new MarkerOptions().m50657N0(C6780QT.m88494b(C33309Hg4.ic_receipt_ride_end)).m50644u(0.5f, 1.0f).m50643u1(new LatLng(location3.getLatitude(), location3.getLongitude())));
                }
                c39011cD1.m61683e(m50611j1);
                LatLngBounds m50667a = c17620a.m50667a();
                Intrinsics.checkNotNullExpressionValue(m50667a, "bounds.build()");
                c39011cD1.m61675m(C48149rc0.m15707c(m50667a, 100));
                c39011cD1.m61673o(false);
                return;
            } catch (Exception e) {
                C41318g46.m40159e(e);
                return;
            }
        }
        c39011cD1.m61675m(C48149rc0.m15705e(new LatLng(wireLocation.getLatitude(), wireLocation.getLongitude()), 14.0f));
    }

    /* renamed from: d */
    public final void m62203d() {
        this.f59713a.f120728l.m50725b(new Bundle());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if ((!r8) == true) goto L21;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m62202e(final OperatorRideHistoryItem model, final WireLocation fallbackLocation) {
        int i;
        boolean z;
        boolean isBlank;
        AppCompatActivity appCompatActivity;
        ActionBar actionBar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fallbackLocation, "fallbackLocation");
        C30900z4 c30900z4 = this.f59713a;
        DateTime completedAt = model.getCompletedAt();
        if (completedAt == null) {
            completedAt = model.getCanceledAt();
        }
        if (completedAt != null) {
            Context m62205b = m62205b(c30900z4);
            if (m62205b instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) m62205b;
            } else {
                appCompatActivity = null;
            }
            if (appCompatActivity != null) {
                actionBar = appCompatActivity.getSupportActionBar();
            } else {
                actionBar = null;
            }
            if (actionBar != null) {
                actionBar.mo70242E(C51916xx1.shortDateAndTimeOfDay$default(C51916xx1.f118396a, completedAt, null, 2, null));
            }
        }
        c30900z4.f120721e.setText(model.getDistance());
        c30900z4.f120725i.setText(model.getDuration());
        RatingBar ratingBar = c30900z4.f120729m;
        Integer rating = model.getRating();
        if (rating != null) {
            i = rating.intValue();
        } else {
            i = 0;
        }
        ratingBar.setNumStars(i);
        c30900z4.f120728l.m50726a(new InterfaceC36350Ug3() { // from class: at3
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                C38817bt3.m62201f(C38817bt3.this, model, fallbackLocation, c39011cD1);
            }
        });
        String endPhotoUrl = model.getEndPhotoUrl();
        if (endPhotoUrl != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(endPhotoUrl);
            z = true;
        }
        z = false;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(ComponentCallbacks2C17096a.m53137u(c30900z4.f120727k).m81653k(model.getEndPhotoUrl()).m16096R0(c30900z4.f120727k), "{\n        Glide.with(end…nto(endRidePhoto)\n      }");
            return;
        }
        TextView endRideLabel = c30900z4.f120726j;
        Intrinsics.checkNotNullExpressionValue(endRideLabel, "endRideLabel");
        C49520tu6.m11232s(endRideLabel, false, 4);
        Unit unit = Unit.INSTANCE;
    }
}
