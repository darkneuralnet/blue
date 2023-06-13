package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0092\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b)\u00109R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b0\u0010;R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b7\u0010>¨\u0006A"}, m28432d2 = {"Lgo;", "LRm;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "k", "", "titleRes", "titleLabel", "color", "description", "descriptionTextStyle", "Lco/bird/android/model/constant/AreaIconType;", "iconType", "Lye0;", "kind", "releaseCapacity", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "location", "", "distanceToZone", "Lorg/joda/time/DateTime;", "lastUpdate", "", "showRefreshUI", C17296a.f69688o, "(ILjava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Ljava/lang/Integer;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Lorg/joda/time/DateTime;Z)Lgo;", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "I", "getTitleRes", "()I", "b", "Ljava/lang/String;", "getTitleLabel", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Lco/bird/android/model/constant/AreaIconType;", "()Lco/bird/android/model/constant/AreaIconType;", "g", "Lye0;", "()Lye0;", "h", "Ljava/lang/Integer;", "getReleaseCapacity", "()Ljava/lang/Integer;", "i", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "j", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "l", "Z", "()Z", "<init>", "(ILjava/lang/String;ILjava/lang/String;ILco/bird/android/model/constant/AreaIconType;Lye0;Ljava/lang/Integer;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/Double;Lorg/joda/time/DateTime;Z)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: go */
/* loaded from: classes3.dex */
public final class C22473go implements InterfaceC7269Rm {

    /* renamed from: a */
    public final int f84272a;

    /* renamed from: b */
    public final String f84273b;

    /* renamed from: c */
    public final int f84274c;

    /* renamed from: d */
    public final String f84275d;

    /* renamed from: e */
    public final int f84276e;

    /* renamed from: f */
    public final AreaIconType f84277f;

    /* renamed from: g */
    public final EnumC52318ye0 f84278g;

    /* renamed from: h */
    public final Integer f84279h;

    /* renamed from: i */
    public final Geolocation f84280i;

    /* renamed from: j */
    public final Double f84281j;

    /* renamed from: k */
    public final DateTime f84282k;

    /* renamed from: l */
    public final boolean f84283l;

    public C22473go(int i, String str, int i2, String description, int i3, AreaIconType iconType, EnumC52318ye0 kind, Integer num, Geolocation geolocation, Double d, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f84272a = i;
        this.f84273b = str;
        this.f84274c = i2;
        this.f84275d = description;
        this.f84276e = i3;
        this.f84277f = iconType;
        this.f84278g = kind;
        this.f84279h = num;
        this.f84280i = geolocation;
        this.f84281j = d;
        this.f84282k = dateTime;
        this.f84283l = z;
    }

    /* renamed from: a */
    public final C22473go m37475a(int i, String str, int i2, String description, int i3, AreaIconType iconType, EnumC52318ye0 kind, Integer num, Geolocation geolocation, Double d, DateTime dateTime, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new C22473go(i, str, i2, description, i3, iconType, kind, num, geolocation, d, dateTime, z);
    }

    /* renamed from: b */
    public final int m37474b() {
        return this.f84274c;
    }

    /* renamed from: c */
    public final String m37473c() {
        return this.f84275d;
    }

    /* renamed from: d */
    public final int m37472d() {
        return this.f84276e;
    }

    /* renamed from: e */
    public final Double m37471e() {
        return this.f84281j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C22473go) {
            C22473go c22473go = (C22473go) obj;
            return this.f84272a == c22473go.f84272a && Intrinsics.areEqual(this.f84273b, c22473go.f84273b) && this.f84274c == c22473go.f84274c && Intrinsics.areEqual(this.f84275d, c22473go.f84275d) && this.f84276e == c22473go.f84276e && this.f84277f == c22473go.f84277f && this.f84278g == c22473go.f84278g && Intrinsics.areEqual(this.f84279h, c22473go.f84279h) && Intrinsics.areEqual(this.f84280i, c22473go.f84280i) && Intrinsics.areEqual((Object) this.f84281j, (Object) c22473go.f84281j) && Intrinsics.areEqual(this.f84282k, c22473go.f84282k) && this.f84283l == c22473go.f84283l;
        }
        return false;
    }

    /* renamed from: f */
    public final AreaIconType m37470f() {
        return this.f84277f;
    }

    /* renamed from: g */
    public final EnumC52318ye0 m37469g() {
        return this.f84278g;
    }

    /* renamed from: h */
    public final DateTime m37468h() {
        return this.f84282k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f84272a) * 31;
        String str = this.f84273b;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f84274c)) * 31) + this.f84275d.hashCode()) * 31) + Integer.hashCode(this.f84276e)) * 31) + this.f84277f.hashCode()) * 31) + this.f84278g.hashCode()) * 31;
        Integer num = this.f84279h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Geolocation geolocation = this.f84280i;
        int hashCode4 = (hashCode3 + (geolocation == null ? 0 : geolocation.hashCode())) * 31;
        Double d = this.f84281j;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        DateTime dateTime = this.f84282k;
        int hashCode6 = (hashCode5 + (dateTime != null ? dateTime.hashCode() : 0)) * 31;
        boolean z = this.f84283l;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode6 + i;
    }

    /* renamed from: i */
    public final Geolocation m37467i() {
        return this.f84280i;
    }

    /* renamed from: j */
    public final boolean m37466j() {
        return this.f84283l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0 == null) goto L8;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m37465k(Context context) {
        String string;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = this.f84279h;
        if (num != null) {
            string = context.getString(this.f84272a, Integer.valueOf(num.intValue()));
        }
        int i = this.f84272a;
        if (i == C46464ol4.empty && (str = this.f84273b) != null) {
            string = str;
        } else {
            string = context.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(titleRes)");
        }
        Intrinsics.checkNotNullExpressionValue(string, "releaseCapacity?.let {\n …ntext.getString(titleRes)");
        return string;
    }

    public String toString() {
        int i = this.f84272a;
        String str = this.f84273b;
        int i2 = this.f84274c;
        String str2 = this.f84275d;
        int i3 = this.f84276e;
        AreaIconType areaIconType = this.f84277f;
        EnumC52318ye0 enumC52318ye0 = this.f84278g;
        Integer num = this.f84279h;
        Geolocation geolocation = this.f84280i;
        Double d = this.f84281j;
        DateTime dateTime = this.f84282k;
        boolean z = this.f84283l;
        return "AreaRestrictedCapBottomSheetModel(titleRes=" + i + ", titleLabel=" + str + ", color=" + i2 + ", description=" + str2 + ", descriptionTextStyle=" + i3 + ", iconType=" + areaIconType + ", kind=" + enumC52318ye0 + ", releaseCapacity=" + num + ", location=" + geolocation + ", distanceToZone=" + d + ", lastUpdate=" + dateTime + ", showRefreshUI=" + z + ")";
    }

    public /* synthetic */ C22473go(int i, String str, int i2, String str2, int i3, AreaIconType areaIconType, EnumC52318ye0 enumC52318ye0, Integer num, Geolocation geolocation, Double d, DateTime dateTime, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? null : str, i2, str2, i3, (i4 & 32) != 0 ? AreaIconType.UNKNOWN : areaIconType, enumC52318ye0, (i4 & 128) != 0 ? null : num, (i4 & 256) != 0 ? null : geolocation, (i4 & 512) != 0 ? null : d, (i4 & 1024) != 0 ? null : dateTime, (i4 & 2048) != 0 ? false : z);
    }
}
