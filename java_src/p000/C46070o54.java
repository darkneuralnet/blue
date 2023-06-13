package p000;

import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010)\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010+\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0019\u0010/R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u0016\u0010/R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b\u001d\u0010/R \u00106\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b \u0010/R \u00108\u001a\b\u0012\u0004\u0012\u00020\u00070,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b&\u0010/¨\u0006;"}, m28432d2 = {"Lo54;", "Ln54;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "showLightsButton", "showLockButton", "", "i", "b", "", "resId", "c", "h", "Landroid/app/Activity;", C17296a.f69688o, "Landroid/app/Activity;", "activity", "Landroid/view/View;", "Landroid/view/View;", "root", "rideButton", DateTokenConverter.CONVERTER_KEY, "rideStatus", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "e", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomsheetBehavior", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "birdBatteryText", "g", "birdCodeText", "Landroid/widget/ImageButton;", "Landroid/widget/ImageButton;", "chirpButton", "lightOnButton", "j", "lightOffButton", "k", "lockButton", "l", "unlockButton", "Lio/reactivex/Observable;", "m", "Lio/reactivex/Observable;", "()Lio/reactivex/Observable;", "chirpClicks", "n", "lightOnClicks", "o", "lightOffClicks", "p", "lockClicks", "q", "unlockClicks", "<init>", "(Landroid/app/Activity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdUi.kt\nco/bird/android/app/feature/ride/ui/PrivateBirdUiImpl\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,83:1\n260#2:84\n262#2,2:85\n262#2,2:87\n262#2,2:89\n262#2,2:91\n*S KotlinDebug\n*F\n+ 1 PrivateBirdUi.kt\nco/bird/android/app/feature/ride/ui/PrivateBirdUiImpl\n*L\n58#1:84\n61#1:85,2\n62#1:87,2\n63#1:89,2\n76#1:91,2\n*E\n"})
/* renamed from: o54  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46070o54 implements InterfaceC45477n54 {

    /* renamed from: a */
    public final Activity f101346a;

    /* renamed from: b */
    public final View f101347b;

    /* renamed from: c */
    public final View f101348c;

    /* renamed from: d */
    public final View f101349d;

    /* renamed from: e */
    public final BottomSheetBehavior<View> f101350e;

    /* renamed from: f */
    public final TextView f101351f;

    /* renamed from: g */
    public final TextView f101352g;

    /* renamed from: h */
    public final ImageButton f101353h;

    /* renamed from: i */
    public final ImageButton f101354i;

    /* renamed from: j */
    public final ImageButton f101355j;

    /* renamed from: k */
    public final ImageButton f101356k;

    /* renamed from: l */
    public final ImageButton f101357l;

    /* renamed from: m */
    public final Observable<Unit> f101358m;

    /* renamed from: n */
    public final Observable<Unit> f101359n;

    /* renamed from: o */
    public final Observable<Unit> f101360o;

    /* renamed from: p */
    public final Observable<Unit> f101361p;

    /* renamed from: q */
    public final Observable<Unit> f101362q;

    public C46070o54(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f101346a = activity;
        View m41779c = C40788fB0.m41779c(activity, C36585Vg4.privateBirdFlightView);
        this.f101347b = m41779c;
        this.f101348c = C40788fB0.m41779c(activity, C36585Vg4.rideButton);
        this.f101349d = C40788fB0.m41779c(activity, C36585Vg4.rideStatusBottomSheet);
        BottomSheetBehavior<View> m50133G = BottomSheetBehavior.m50133G(m41779c);
        Intrinsics.checkNotNullExpressionValue(m50133G, "from(root)");
        this.f101350e = m50133G;
        this.f101351f = (TextView) C40788fB0.m41779c(activity, C52955zi4.privateBirdBatteryLevel);
        this.f101352g = (TextView) C40788fB0.m41779c(activity, C52955zi4.privateBirdCode);
        ImageButton imageButton = (ImageButton) C40788fB0.m41779c(activity, C52955zi4.actionChirp);
        this.f101353h = imageButton;
        ImageButton imageButton2 = (ImageButton) C40788fB0.m41779c(activity, C52955zi4.actionLightOn);
        this.f101354i = imageButton2;
        ImageButton imageButton3 = (ImageButton) C40788fB0.m41779c(activity, C52955zi4.actionLightOff);
        this.f101355j = imageButton3;
        ImageButton imageButton4 = (ImageButton) C40788fB0.m41779c(activity, C52955zi4.actionLock);
        this.f101356k = imageButton4;
        ImageButton imageButton5 = (ImageButton) C40788fB0.m41779c(activity, C52955zi4.actionUnlock);
        this.f101357l = imageButton5;
        this.f101358m = C44626lf5.clicksThrottle$default(imageButton, 0L, 1, null);
        this.f101359n = C44626lf5.clicksThrottle$default(imageButton2, 0L, 1, null);
        this.f101360o = C44626lf5.clicksThrottle$default(imageButton3, 0L, 1, null);
        this.f101361p = C44626lf5.clicksThrottle$default(imageButton4, 0L, 1, null);
        this.f101362q = C44626lf5.clicksThrottle$default(imageButton5, 0L, 1, null);
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: b */
    public void mo21810b() {
        this.f101347b.setVisibility(8);
        this.f101350e.m50082p0(5);
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: c */
    public void mo21809c(int i) {
        Toast.makeText(this.f101346a, i, 0).show();
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: d */
    public Observable<Unit> mo21808d() {
        return this.f101359n;
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: e */
    public Observable<Unit> mo21807e() {
        return this.f101358m;
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: f */
    public Observable<Unit> mo21806f() {
        return this.f101360o;
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: g */
    public Observable<Unit> mo21805g() {
        return this.f101361p;
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: h */
    public void mo21804h(int i) {
        Toast.makeText(this.f101346a, i, 0).show();
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: i */
    public void mo21803i(WireBird bird, boolean z, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f101347b.setVisibility(0);
        this.f101348c.setVisibility(8);
        this.f101349d.setVisibility(8);
        boolean z4 = true;
        this.f101351f.setText(C51916xx1.f118396a.m4411a(this.f101346a, bird.getBatteryLevel(), true));
        this.f101352g.setText(bird.getCode());
        C49520tu6.show$default(this.f101354i, z, 0, 2, null);
        C49520tu6.show$default(this.f101355j, z, 0, 2, null);
        ImageButton imageButton = this.f101356k;
        if (z2 && !bird.getLocked()) {
            z3 = true;
        } else {
            z3 = false;
        }
        C49520tu6.show$default(imageButton, z3, 0, 2, null);
        ImageButton imageButton2 = this.f101357l;
        if (!z2 || !bird.getLocked()) {
            z4 = false;
        }
        C49520tu6.show$default(imageButton2, z4, 0, 2, null);
        this.f101350e.m50082p0(3);
    }

    @Override // p000.InterfaceC45477n54
    /* renamed from: j */
    public Observable<Unit> mo21802j() {
        return this.f101362q;
    }
}
