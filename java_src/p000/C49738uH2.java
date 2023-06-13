package p000;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.RideStatusBottomSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006JW\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0010\u0010%¨\u0006("}, m28432d2 = {"LuH2;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "", C17296a.f69688o, "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "", "rideId", "userGuestId", "vehicleCode", "rangeText", "rideLabel", "Lco/bird/android/model/RideStatusBottomSheetButton;", "ctaButton", "", "isSelected", "b", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "getVehicleCode", "getRangeText", "e", "getRideLabel", "f", "Lco/bird/android/model/RideStatusBottomSheetButton;", "getCtaButton", "()Lco/bird/android/model/RideStatusBottomSheetButton;", "g", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/RideStatusBottomSheetButton;Z)V", "co.bird.android.feature.rider.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49738uH2 {

    /* renamed from: a */
    public final String f112126a;

    /* renamed from: b */
    public final String f112127b;

    /* renamed from: c */
    public final String f112128c;

    /* renamed from: d */
    public final String f112129d;

    /* renamed from: e */
    public final String f112130e;

    /* renamed from: f */
    public final RideStatusBottomSheetButton f112131f;

    /* renamed from: g */
    public final boolean f112132g;

    public C49738uH2(String rideId, String str, String str2, String str3, String str4, RideStatusBottomSheetButton ctaButton, boolean z) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        this.f112126a = rideId;
        this.f112127b = str;
        this.f112128c = str2;
        this.f112129d = str3;
        this.f112130e = str4;
        this.f112131f = ctaButton;
        this.f112132g = z;
    }

    public static /* synthetic */ C49738uH2 copy$default(C49738uH2 c49738uH2, String str, String str2, String str3, String str4, String str5, RideStatusBottomSheetButton rideStatusBottomSheetButton, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49738uH2.f112126a;
        }
        if ((i & 2) != 0) {
            str2 = c49738uH2.f112127b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c49738uH2.f112128c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c49738uH2.f112129d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c49738uH2.f112130e;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            rideStatusBottomSheetButton = c49738uH2.f112131f;
        }
        RideStatusBottomSheetButton rideStatusBottomSheetButton2 = rideStatusBottomSheetButton;
        if ((i & 64) != 0) {
            z = c49738uH2.f112132g;
        }
        return c49738uH2.m10488b(str, str6, str7, str8, str9, rideStatusBottomSheetButton2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if ((!r1) == true) goto L22;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10489a(ConstraintLayout view) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(view, "view");
        view.dispatchSetSelected(this.f112132g);
        RadioButton radioButton = (RadioButton) C49520tu6.m11238m(view, C36828Wh4.radioButton);
        if (radioButton != null) {
            radioButton.setChecked(radioButton.isSelected());
        }
        TextView textView = (TextView) C49520tu6.m11238m(view, C36828Wh4.codeText);
        if (textView != null) {
            textView.setText(this.f112128c);
        }
        TextView textView2 = (TextView) C49520tu6.m11238m(view, C36828Wh4.rangeText);
        String str = "";
        if (textView2 != null) {
            String str2 = this.f112129d;
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) C49520tu6.m11238m(view, C36828Wh4.rideLabel);
        if (textView3 != null) {
            String str3 = this.f112130e;
            if (str3 != null) {
                str = str3;
            }
            textView3.setText(str);
            String str4 = this.f112130e;
            if (str4 != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str4);
                z = true;
            }
            z = false;
            C49520tu6.show$default(textView3, z, 0, 2, null);
        }
        Button button = (Button) C49520tu6.m11238m(view, C36828Wh4.button);
        if (button != null) {
            button.setTag(this.f112131f);
            button.setText(this.f112131f.getText());
            button.setEnabled(this.f112131f.isEnabled());
        }
        View m11238m = C49520tu6.m11238m(view, C36828Wh4.buttonProgressBar);
        if (m11238m != null) {
            C49520tu6.show$default(m11238m, this.f112131f.getInProgress(), 0, 2, null);
        }
    }

    /* renamed from: b */
    public final C49738uH2 m10488b(String rideId, String str, String str2, String str3, String str4, RideStatusBottomSheetButton ctaButton, boolean z) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        return new C49738uH2(rideId, str, str2, str3, str4, ctaButton, z);
    }

    /* renamed from: c */
    public final String m10487c() {
        return this.f112126a;
    }

    /* renamed from: d */
    public final String m10486d() {
        return this.f112127b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49738uH2) {
            C49738uH2 c49738uH2 = (C49738uH2) obj;
            return Intrinsics.areEqual(this.f112126a, c49738uH2.f112126a) && Intrinsics.areEqual(this.f112127b, c49738uH2.f112127b) && Intrinsics.areEqual(this.f112128c, c49738uH2.f112128c) && Intrinsics.areEqual(this.f112129d, c49738uH2.f112129d) && Intrinsics.areEqual(this.f112130e, c49738uH2.f112130e) && Intrinsics.areEqual(this.f112131f, c49738uH2.f112131f) && this.f112132g == c49738uH2.f112132g;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f112126a.hashCode() * 31;
        String str = this.f112127b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112128c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f112129d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f112130e;
        int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f112131f.hashCode()) * 31;
        boolean z = this.f112132g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode5 + i;
    }

    public String toString() {
        String str = this.f112126a;
        String str2 = this.f112127b;
        String str3 = this.f112128c;
        String str4 = this.f112129d;
        String str5 = this.f112130e;
        RideStatusBottomSheetButton rideStatusBottomSheetButton = this.f112131f;
        boolean z = this.f112132g;
        return "ManageGroupRidesEntryViewModel(rideId=" + str + ", userGuestId=" + str2 + ", vehicleCode=" + str3 + ", rangeText=" + str4 + ", rideLabel=" + str5 + ", ctaButton=" + rideStatusBottomSheetButton + ", isSelected=" + z + ")";
    }
}
