package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b;\u0010<J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002Jz\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b'\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u00102R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006="}, m28432d2 = {"Lze0;", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "view", "", C17296a.f69688o, "", "title", "", "color", "description", "descriptionTextStyle", "Lco/bird/android/model/constant/AreaIconType;", "iconType", "Lye0;", "kind", "Lorg/joda/time/DateTime;", "lastUpdate", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "", "distanceToZone", "", "showRefreshUi", "b", "(Ljava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Z)Lze0;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "I", "getColor", "()I", "c", DateTokenConverter.CONVERTER_KEY, "getDescriptionTextStyle", "e", "Lco/bird/android/model/constant/AreaIconType;", "getIconType", "()Lco/bird/android/model/constant/AreaIconType;", "f", "Lye0;", "()Lye0;", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "h", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "i", "Ljava/lang/Double;", "getDistanceToZone", "()Ljava/lang/Double;", "j", "Z", "getShowRefreshUi", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Lorg/joda/time/DateTime;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Z)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ze0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52911ze0 {

    /* renamed from: a */
    public final String f121672a;

    /* renamed from: b */
    public final int f121673b;

    /* renamed from: c */
    public final String f121674c;

    /* renamed from: d */
    public final int f121675d;

    /* renamed from: e */
    public final AreaIconType f121676e;

    /* renamed from: f */
    public final EnumC52318ye0 f121677f;

    /* renamed from: g */
    public final DateTime f121678g;

    /* renamed from: h */
    public final Geolocation f121679h;

    /* renamed from: i */
    public final Double f121680i;

    /* renamed from: j */
    public final boolean f121681j;

    public C52911ze0(String title, int i, String description, int i2, AreaIconType iconType, EnumC52318ye0 kind, DateTime dateTime, Geolocation geolocation, Double d, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f121672a = title;
        this.f121673b = i;
        this.f121674c = description;
        this.f121675d = i2;
        this.f121676e = iconType;
        this.f121677f = kind;
        this.f121678g = dateTime;
        this.f121679h = geolocation;
        this.f121680i = d;
        this.f121681j = z;
    }

    /* renamed from: a */
    public final void m948a(ConstraintLayout view) {
        Unit unit;
        boolean z;
        double d;
        Intrinsics.checkNotNullParameter(view, "view");
        View m11238m = C49520tu6.m11238m(view, C40494eh4.titleBackground);
        if (m11238m != null) {
            m11238m.setBackgroundTintList(ColorStateList.valueOf(this.f121673b));
        }
        TextView textView = (TextView) C49520tu6.m11238m(view, C40494eh4.title);
        if (textView != null) {
            textView.setText(this.f121672a);
        }
        TextView textView2 = (TextView) C49520tu6.m11238m(view, C40494eh4.description);
        if (textView2 != null) {
            textView2.setText(this.f121674c);
            Q26.m89061o(textView2, this.f121675d);
        }
        TextView textView3 = (TextView) C49520tu6.m11238m(view, C40494eh4.directionsButton);
        if (textView3 != null) {
            if (this.f121679h != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(textView3, z, 0, 2, null);
            if (this.f121679h != null) {
                C51916xx1 c51916xx1 = C51916xx1.f118396a;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                Double d2 = this.f121680i;
                if (d2 != null) {
                    d = d2.doubleValue();
                } else {
                    d = 0.0d;
                }
                textView3.setText(c51916xx1.m4404h(context, d, 0.0d, true));
            }
        }
        ImageView imageView = (ImageView) C49520tu6.m11238m(view, C40494eh4.icon);
        if (imageView != null) {
            Integer m70749b = C10854an.m70749b(this.f121676e);
            if (m70749b != null) {
                int intValue = m70749b.intValue();
                imageView.setVisibility(0);
                imageView.setImageResource(intValue);
                imageView.setImageTintList(ColorStateList.valueOf(this.f121673b));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                imageView.setVisibility(4);
            }
        }
        LinearLayout linearLayout = (LinearLayout) C49520tu6.m11238m(view, C40494eh4.refreshContainer);
        if (linearLayout != null) {
            C49520tu6.show$default(linearLayout, this.f121681j, 0, 2, null);
        }
    }

    /* renamed from: b */
    public final C52911ze0 m947b(String title, int i, String description, int i2, AreaIconType iconType, EnumC52318ye0 kind, DateTime dateTime, Geolocation geolocation, Double d, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new C52911ze0(title, i, description, i2, iconType, kind, dateTime, geolocation, d, z);
    }

    /* renamed from: c */
    public final String m946c() {
        return this.f121674c;
    }

    /* renamed from: d */
    public final EnumC52318ye0 m945d() {
        return this.f121677f;
    }

    /* renamed from: e */
    public final DateTime m944e() {
        return this.f121678g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52911ze0) {
            C52911ze0 c52911ze0 = (C52911ze0) obj;
            return Intrinsics.areEqual(this.f121672a, c52911ze0.f121672a) && this.f121673b == c52911ze0.f121673b && Intrinsics.areEqual(this.f121674c, c52911ze0.f121674c) && this.f121675d == c52911ze0.f121675d && this.f121676e == c52911ze0.f121676e && this.f121677f == c52911ze0.f121677f && Intrinsics.areEqual(this.f121678g, c52911ze0.f121678g) && Intrinsics.areEqual(this.f121679h, c52911ze0.f121679h) && Intrinsics.areEqual((Object) this.f121680i, (Object) c52911ze0.f121680i) && this.f121681j == c52911ze0.f121681j;
        }
        return false;
    }

    /* renamed from: f */
    public final Geolocation m943f() {
        return this.f121679h;
    }

    /* renamed from: g */
    public final String m942g() {
        return this.f121672a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f121672a.hashCode() * 31) + Integer.hashCode(this.f121673b)) * 31) + this.f121674c.hashCode()) * 31) + Integer.hashCode(this.f121675d)) * 31) + this.f121676e.hashCode()) * 31) + this.f121677f.hashCode()) * 31;
        DateTime dateTime = this.f121678g;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Geolocation geolocation = this.f121679h;
        int hashCode3 = (hashCode2 + (geolocation == null ? 0 : geolocation.hashCode())) * 31;
        Double d = this.f121680i;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 31;
        boolean z = this.f121681j;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f121672a;
        int i = this.f121673b;
        String str2 = this.f121674c;
        int i2 = this.f121675d;
        AreaIconType areaIconType = this.f121676e;
        EnumC52318ye0 enumC52318ye0 = this.f121677f;
        DateTime dateTime = this.f121678g;
        Geolocation geolocation = this.f121679h;
        Double d = this.f121680i;
        boolean z = this.f121681j;
        return "CapRestrictionViewModel(title=" + str + ", color=" + i + ", description=" + str2 + ", descriptionTextStyle=" + i2 + ", iconType=" + areaIconType + ", kind=" + enumC52318ye0 + ", lastUpdate=" + dateTime + ", location=" + geolocation + ", distanceToZone=" + d + ", showRefreshUi=" + z + ")";
    }

    public /* synthetic */ C52911ze0(String str, int i, String str2, int i2, AreaIconType areaIconType, EnumC52318ye0 enumC52318ye0, DateTime dateTime, Geolocation geolocation, Double d, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i2, areaIconType, enumC52318ye0, (i3 & 64) != 0 ? null : dateTime, (i3 & 128) != 0 ? null : geolocation, (i3 & 256) != 0 ? null : d, (i3 & 512) != 0 ? false : z);
    }
}
