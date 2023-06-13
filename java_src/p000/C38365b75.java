package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideStatusBottomSheetButton;
import co.bird.android.widget.CountdownView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006Ji\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b)\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b \u0010,¨\u0006/"}, m28432d2 = {"Lb75;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "", C17296a.f69688o, "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "vehicleImageResource", "", "vehicleCode", "durationSeconds", "LR46;", "timerState", "rangeText", "Lco/bird/android/model/RideStatusBottomSheetButton;", "primaryCTAButton", "secondaryCTAButton", "", "showNoParkingOverlay", "anyActionInProgress", "b", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "I", "k", "()I", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "LR46;", "i", "()LR46;", "e", "f", "Lco/bird/android/model/RideStatusBottomSheetButton;", "()Lco/bird/android/model/RideStatusBottomSheetButton;", "g", "h", "Z", "()Z", "<init>", "(ILjava/lang/String;ILR46;Ljava/lang/String;Lco/bird/android/model/RideStatusBottomSheetButton;Lco/bird/android/model/RideStatusBottomSheetButton;ZZ)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStatusViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStatusViewModel.kt\nco/bird/android/feature/rider/bottomsheets/viewmodels/RideStatusViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: b75  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38365b75 {

    /* renamed from: a */
    public final int f56946a;

    /* renamed from: b */
    public final String f56947b;

    /* renamed from: c */
    public final int f56948c;

    /* renamed from: d */
    public final R46 f56949d;

    /* renamed from: e */
    public final String f56950e;

    /* renamed from: f */
    public final RideStatusBottomSheetButton f56951f;

    /* renamed from: g */
    public final RideStatusBottomSheetButton f56952g;

    /* renamed from: h */
    public final boolean f56953h;

    /* renamed from: i */
    public final boolean f56954i;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"b75$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: b75$a */
    /* loaded from: classes3.dex */
    public static final class C12297a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (outline == null) {
                new Outline();
                return;
            }
            outline.setEmpty();
            Unit unit = Unit.INSTANCE;
        }
    }

    public C38365b75(int i, String vehicleCode, int i2, R46 timerState, String str, RideStatusBottomSheetButton rideStatusBottomSheetButton, RideStatusBottomSheetButton rideStatusBottomSheetButton2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(vehicleCode, "vehicleCode");
        Intrinsics.checkNotNullParameter(timerState, "timerState");
        this.f56946a = i;
        this.f56947b = vehicleCode;
        this.f56948c = i2;
        this.f56949d = timerState;
        this.f56950e = str;
        this.f56951f = rideStatusBottomSheetButton;
        this.f56952g = rideStatusBottomSheetButton2;
        this.f56953h = z;
        this.f56954i = z2;
    }

    /* renamed from: a */
    public final void m64948a(ConstraintLayout view) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        Unit unit;
        boolean z3;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(view, "view");
        ImageView imageView = (ImageView) C49520tu6.m11238m(view, C36828Wh4.scooterImage);
        if (imageView != null) {
            imageView.setImageResource(this.f56946a);
        }
        TextView textView = (TextView) C49520tu6.m11238m(view, C36828Wh4.codeText);
        if (textView != null) {
            textView.setText(this.f56947b);
        }
        CountdownView countdownView = (CountdownView) C49520tu6.m11238m(view, C36828Wh4.durationText);
        int i5 = 0;
        if (countdownView != null) {
            C41318g46.m40163a("TimerState: " + this.f56949d + " with duration " + this.f56948c, new Object[0]);
            countdownView.setTimerState(this.f56949d);
            CountdownView.init$default(countdownView, this.f56948c, null, null, null, null, null, null, null, 254, null);
        }
        TextView textView2 = (TextView) C49520tu6.m11238m(view, C36828Wh4.rangeText);
        if (textView2 != null) {
            String str = this.f56950e;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
            if (this.f56950e != null) {
                Integer num = 0;
                i3 = num.intValue();
            } else {
                i3 = 4;
            }
            textView2.setVisibility(i3);
            View m11238m = C49520tu6.m11238m(view, C36828Wh4.rangeIcon);
            if (m11238m != null) {
                if (this.f56950e != null) {
                    Integer num2 = 0;
                    i4 = num2.intValue();
                } else {
                    i4 = 4;
                }
                m11238m.setVisibility(i4);
            }
        }
        Button button = (Button) C49520tu6.m11238m(view, C36828Wh4.primaryButton);
        Unit unit2 = null;
        boolean z4 = true;
        if (button != null) {
            RideStatusBottomSheetButton rideStatusBottomSheetButton = this.f56951f;
            if (rideStatusBottomSheetButton != null) {
                button.setTag(rideStatusBottomSheetButton);
                button.setText(rideStatusBottomSheetButton.getText());
                if (rideStatusBottomSheetButton.isEnabled() && !this.f56954i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                button.setEnabled(z3);
                button.setVisibility(0);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                button.setVisibility(4);
            }
        }
        Button button2 = (Button) C49520tu6.m11238m(view, C36828Wh4.secondaryButton);
        if (button2 != null) {
            RideStatusBottomSheetButton rideStatusBottomSheetButton2 = this.f56952g;
            if (rideStatusBottomSheetButton2 != null) {
                button2.setTag(rideStatusBottomSheetButton2);
                button2.setText(rideStatusBottomSheetButton2.getText());
                if (rideStatusBottomSheetButton2.isEnabled() && !this.f56954i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                button2.setEnabled(z2);
                button2.setVisibility(0);
                unit2 = Unit.INSTANCE;
            }
            if (unit2 == null) {
                button2.setVisibility(4);
            }
        }
        View m11238m2 = C49520tu6.m11238m(view, C36828Wh4.noParkingOverlay);
        if (m11238m2 != null) {
            if (this.f56953h) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            m11238m2.setVisibility(i2);
            m11238m2.setOutlineProvider(new C12297a());
        }
        View m11238m3 = C49520tu6.m11238m(view, C36828Wh4.primaryButtonProgressBar);
        if (m11238m3 != null) {
            RideStatusBottomSheetButton rideStatusBottomSheetButton3 = this.f56951f;
            if (rideStatusBottomSheetButton3 != null && rideStatusBottomSheetButton3.getInProgress()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m11238m3.setVisibility(i);
        }
        View m11238m4 = C49520tu6.m11238m(view, C36828Wh4.secondaryButtonProgressBar);
        if (m11238m4 != null) {
            RideStatusBottomSheetButton rideStatusBottomSheetButton4 = this.f56952g;
            if (rideStatusBottomSheetButton4 == null || !rideStatusBottomSheetButton4.getInProgress()) {
                z4 = false;
            }
            if (!z4) {
                i5 = 8;
            }
            m11238m4.setVisibility(i5);
        }
    }

    /* renamed from: b */
    public final C38365b75 m64947b(int i, String vehicleCode, int i2, R46 timerState, String str, RideStatusBottomSheetButton rideStatusBottomSheetButton, RideStatusBottomSheetButton rideStatusBottomSheetButton2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(vehicleCode, "vehicleCode");
        Intrinsics.checkNotNullParameter(timerState, "timerState");
        return new C38365b75(i, vehicleCode, i2, timerState, str, rideStatusBottomSheetButton, rideStatusBottomSheetButton2, z, z2);
    }

    /* renamed from: c */
    public final boolean m64946c() {
        return this.f56954i;
    }

    /* renamed from: d */
    public final int m64945d() {
        return this.f56948c;
    }

    /* renamed from: e */
    public final RideStatusBottomSheetButton m64944e() {
        return this.f56951f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38365b75) {
            C38365b75 c38365b75 = (C38365b75) obj;
            return this.f56946a == c38365b75.f56946a && Intrinsics.areEqual(this.f56947b, c38365b75.f56947b) && this.f56948c == c38365b75.f56948c && this.f56949d == c38365b75.f56949d && Intrinsics.areEqual(this.f56950e, c38365b75.f56950e) && Intrinsics.areEqual(this.f56951f, c38365b75.f56951f) && Intrinsics.areEqual(this.f56952g, c38365b75.f56952g) && this.f56953h == c38365b75.f56953h && this.f56954i == c38365b75.f56954i;
        }
        return false;
    }

    /* renamed from: f */
    public final String m64943f() {
        return this.f56950e;
    }

    /* renamed from: g */
    public final RideStatusBottomSheetButton m64942g() {
        return this.f56952g;
    }

    /* renamed from: h */
    public final boolean m64941h() {
        return this.f56953h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f56946a) * 31) + this.f56947b.hashCode()) * 31) + Integer.hashCode(this.f56948c)) * 31) + this.f56949d.hashCode()) * 31;
        String str = this.f56950e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        RideStatusBottomSheetButton rideStatusBottomSheetButton = this.f56951f;
        int hashCode3 = (hashCode2 + (rideStatusBottomSheetButton == null ? 0 : rideStatusBottomSheetButton.hashCode())) * 31;
        RideStatusBottomSheetButton rideStatusBottomSheetButton2 = this.f56952g;
        int hashCode4 = (hashCode3 + (rideStatusBottomSheetButton2 != null ? rideStatusBottomSheetButton2.hashCode() : 0)) * 31;
        boolean z = this.f56953h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.f56954i;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final R46 m64940i() {
        return this.f56949d;
    }

    /* renamed from: j */
    public final String m64939j() {
        return this.f56947b;
    }

    /* renamed from: k */
    public final int m64938k() {
        return this.f56946a;
    }

    public String toString() {
        int i = this.f56946a;
        String str = this.f56947b;
        int i2 = this.f56948c;
        R46 r46 = this.f56949d;
        String str2 = this.f56950e;
        RideStatusBottomSheetButton rideStatusBottomSheetButton = this.f56951f;
        RideStatusBottomSheetButton rideStatusBottomSheetButton2 = this.f56952g;
        boolean z = this.f56953h;
        boolean z2 = this.f56954i;
        return "RideStatusViewModel(vehicleImageResource=" + i + ", vehicleCode=" + str + ", durationSeconds=" + i2 + ", timerState=" + r46 + ", rangeText=" + str2 + ", primaryCTAButton=" + rideStatusBottomSheetButton + ", secondaryCTAButton=" + rideStatusBottomSheetButton2 + ", showNoParkingOverlay=" + z + ", anyActionInProgress=" + z2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C38365b75(int i, String str, int i2, R46 r46, String str2, RideStatusBottomSheetButton rideStatusBottomSheetButton, RideStatusBottomSheetButton rideStatusBottomSheetButton2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, r46, str2, rideStatusBottomSheetButton, rideStatusBottomSheetButton2, z, r11);
        boolean z3;
        if ((i3 & 256) != 0) {
            boolean z4 = true;
            if (!(rideStatusBottomSheetButton != null && rideStatusBottomSheetButton.getInProgress())) {
                if (!(rideStatusBottomSheetButton2 != null && rideStatusBottomSheetButton2.getInProgress())) {
                    z4 = false;
                }
            }
            z3 = z4;
        } else {
            z3 = z2;
        }
    }
}
