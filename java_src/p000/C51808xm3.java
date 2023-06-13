package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#JG\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010 ¨\u0006$"}, m28432d2 = {"Lxm3;", "", "", "id", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "batteryLevel", "markerIcon", "markerLabel", "markerBadgeType", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getCode", "c", "I", "getBatteryLevel", "()I", DateTokenConverter.CONVERTER_KEY, "getMarkerIcon", "e", "getMarkerLabel", "f", "getMarkerBadgeType", "", "()Ljava/util/Map;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xm3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51808xm3 {

    /* renamed from: a */
    public final String f118083a;

    /* renamed from: b */
    public final String f118084b;

    /* renamed from: c */
    public final int f118085c;

    /* renamed from: d */
    public final String f118086d;

    /* renamed from: e */
    public final String f118087e;

    /* renamed from: f */
    public final String f118088f;

    public C51808xm3(String id, String code, int i, String markerIcon, String markerLabel, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(markerIcon, "markerIcon");
        Intrinsics.checkNotNullParameter(markerLabel, "markerLabel");
        this.f118083a = id;
        this.f118084b = code;
        this.f118085c = i;
        this.f118086d = markerIcon;
        this.f118087e = markerLabel;
        this.f118088f = str;
    }

    public static /* synthetic */ C51808xm3 copy$default(C51808xm3 c51808xm3, String str, String str2, int i, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c51808xm3.f118083a;
        }
        if ((i2 & 2) != 0) {
            str2 = c51808xm3.f118084b;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            i = c51808xm3.f118085c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = c51808xm3.f118086d;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = c51808xm3.f118087e;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = c51808xm3.f118088f;
        }
        return c51808xm3.m4718a(str, str6, i3, str7, str8, str5);
    }

    /* renamed from: a */
    public final C51808xm3 m4718a(String id, String code, int i, String markerIcon, String markerLabel, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(markerIcon, "markerIcon");
        Intrinsics.checkNotNullParameter(markerLabel, "markerLabel");
        return new C51808xm3(id, code, i, markerIcon, markerLabel, str);
    }

    /* renamed from: b */
    public final Map<String, Object> m4717b() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("id", this.f118083a), TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, this.f118084b), TuplesKt.m28425to("battery_level", Integer.valueOf(this.f118085c)), TuplesKt.m28425to("marker_icon", this.f118086d), TuplesKt.m28425to("marker_label", this.f118087e), TuplesKt.m28425to("marker_badge_type", this.f118088f));
        return mapOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C51808xm3) {
            C51808xm3 c51808xm3 = (C51808xm3) obj;
            return Intrinsics.areEqual(this.f118083a, c51808xm3.f118083a) && Intrinsics.areEqual(this.f118084b, c51808xm3.f118084b) && this.f118085c == c51808xm3.f118085c && Intrinsics.areEqual(this.f118086d, c51808xm3.f118086d) && Intrinsics.areEqual(this.f118087e, c51808xm3.f118087e) && Intrinsics.areEqual(this.f118088f, c51808xm3.f118088f);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f118083a.hashCode() * 31) + this.f118084b.hashCode()) * 31) + Integer.hashCode(this.f118085c)) * 31) + this.f118086d.hashCode()) * 31) + this.f118087e.hashCode()) * 31;
        String str = this.f118088f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f118083a;
        String str2 = this.f118084b;
        int i = this.f118085c;
        String str3 = this.f118086d;
        String str4 = this.f118087e;
        String str5 = this.f118088f;
        return "OperatorMapBird(id=" + str + ", code=" + str2 + ", batteryLevel=" + i + ", markerIcon=" + str3 + ", markerLabel=" + str4 + ", markerBadgeType=" + str5 + ")";
    }

    public /* synthetic */ C51808xm3(String str, String str2, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, (i2 & 32) != 0 ? null : str5);
    }
}
