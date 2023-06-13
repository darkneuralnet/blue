package p000;

import android.content.Intent;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PhotoReviewStatusKt;
import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LoH3;", "LnH3;", "Landroid/content/Intent;", "intent", "", C17296a.f69688o, "Landroid/view/Menu;", "menu", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MenuItem;", "item", "", "c", "LEa;", "LEa;", "analyticsManager", "LsH3;", "b", "LsH3;", "parkingReviewUi", "Le13;", "Le13;", "navigator", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "parkingEvaluation", "", "e", "Ljava/lang/String;", "rideId", "<init>", "(LEa;LsH3;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oH3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46182oH3 implements InterfaceC45589nH3 {

    /* renamed from: a */
    public final InterfaceC1880Ea f101725a;

    /* renamed from: b */
    public final InterfaceC48553sH3 f101726b;

    /* renamed from: c */
    public final InterfaceC40099e13 f101727c;

    /* renamed from: d */
    public WireEndRidePhotoParkingEvaluation f101728d;

    /* renamed from: e */
    public String f101729e;

    public C46182oH3(InterfaceC1880Ea analyticsManager, InterfaceC48553sH3 parkingReviewUi, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(parkingReviewUi, "parkingReviewUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f101725a = analyticsManager;
        this.f101726b = parkingReviewUi;
        this.f101727c = navigator;
    }

    /* renamed from: a */
    public void m21416a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Parcelable parcelableExtra = intent.getParcelableExtra("parking_photo_evaluation");
        Intrinsics.checkNotNull(parcelableExtra);
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = (WireEndRidePhotoParkingEvaluation) parcelableExtra;
        this.f101728d = wireEndRidePhotoParkingEvaluation;
        this.f101729e = intent.getStringExtra("ride_id");
        this.f101726b.mo12532nc(wireEndRidePhotoParkingEvaluation);
    }

    @Override // p000.InterfaceC45589nH3
    /* renamed from: c */
    public boolean mo21415c(MenuItem item) {
        String str;
        String str2;
        String str3;
        String reason;
        String id;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.parkingReviewHelp) {
            InterfaceC1880Ea interfaceC1880Ea = this.f101725a;
            WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.f101728d;
            if (wireEndRidePhotoParkingEvaluation == null || (id = wireEndRidePhotoParkingEvaluation.getId()) == null) {
                str = "";
            } else {
                str = id;
            }
            String photoReviewStatus = PhotoReviewStatusKt.toPhotoReviewStatus(this.f101728d);
            WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation2 = this.f101728d;
            if (wireEndRidePhotoParkingEvaluation2 == null || (reason = wireEndRidePhotoParkingEvaluation2.getReason()) == null) {
                str2 = "";
            } else {
                str2 = reason;
            }
            String str4 = this.f101729e;
            if (str4 == null) {
                str3 = "";
            } else {
                str3 = str4;
            }
            interfaceC1880Ea.mo55905y(new C44403lH3(null, null, null, str, photoReviewStatus, str2, str3, 7, null));
            String str5 = this.f101729e;
            if (str5 != null) {
                this.f101727c.mo37087U0(str5, this.f101728d);
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0.getProperParking() == true) goto L5;
     */
    @Override // p000.InterfaceC45589nH3
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo21414d(Menu menu) {
        boolean z;
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem findItem = menu.findItem(C36585Vg4.parkingReviewHelp);
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.f101728d;
        if (wireEndRidePhotoParkingEvaluation != null) {
            z = true;
        }
        z = false;
        if (z) {
            findItem.setVisible(false);
        }
    }
}
