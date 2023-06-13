package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010/\u001a\u00020\u0007\u0012\n\b\u0003\u00100\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bC\u0010DJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010$\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f\"\u0004\b#\u0010!R$\u0010&\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u0014\u0010\u001f\"\u0004\b%\u0010!R$\u0010)\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\"\u0010/\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0019\u00100\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u00103\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u0019\u00105\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b4\u0010\fR$\u00107\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b6\u0010\u000eR$\u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR$\u0010>\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\n\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR$\u0010@\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\n\u001a\u0004\b1\u0010\f\"\u0004\b?\u0010\u000eR$\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\n\u001a\u0004\b8\u0010\f\"\u0004\bA\u0010\u000e¨\u0006E"}, m28432d2 = {"Lkk6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "w", "(Ljava/lang/Integer;)V", "drawableStartRes", "b", "f", "u", "drawableEndRes", "c", DateTokenConverter.CONVERTER_KEY, "s", "drawableBottomRes", "j", "y", "drawableTopRes", "Landroid/graphics/drawable/Drawable;", "e", "Landroid/graphics/drawable/Drawable;", "g", "()Landroid/graphics/drawable/Drawable;", "v", "(Landroid/graphics/drawable/Drawable;)V", "drawableStart", "t", "drawableEnd", "r", "drawableBottom", "i", "x", "drawableTop", "Z", "q", "()Z", "z", "(Z)V", "isRtlLayout", "compoundDrawablePadding", "k", "m", "iconWidth", "l", "iconHeight", "setCompoundDrawablePaddingRes", "compoundDrawablePaddingRes", "n", "o", "setTintColor", "tintColor", "p", "setWidthRes", "widthRes", "setHeightRes", "heightRes", "setSquareSizeRes", "squareSizeRes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: kk6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44084kk6 {

    /* renamed from: a */
    public Integer f94850a;

    /* renamed from: b */
    public Integer f94851b;

    /* renamed from: c */
    public Integer f94852c;

    /* renamed from: d */
    public Integer f94853d;

    /* renamed from: e */
    public Drawable f94854e;

    /* renamed from: f */
    public Drawable f94855f;

    /* renamed from: g */
    public Drawable f94856g;

    /* renamed from: h */
    public Drawable f94857h;

    /* renamed from: i */
    public boolean f94858i;

    /* renamed from: j */
    public final Integer f94859j;

    /* renamed from: k */
    public final Integer f94860k;

    /* renamed from: l */
    public final Integer f94861l;

    /* renamed from: m */
    public Integer f94862m;

    /* renamed from: n */
    public Integer f94863n;

    /* renamed from: o */
    public Integer f94864o;

    /* renamed from: p */
    public Integer f94865p;

    /* renamed from: q */
    public Integer f94866q;

    public C44084kk6() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* renamed from: a */
    public final Integer m28553a() {
        return this.f94859j;
    }

    /* renamed from: b */
    public final Integer m28552b() {
        return this.f94862m;
    }

    /* renamed from: c */
    public final Drawable m28551c() {
        return this.f94856g;
    }

    /* renamed from: d */
    public final Integer m28550d() {
        return this.f94852c;
    }

    /* renamed from: e */
    public final Drawable m28549e() {
        return this.f94855f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44084kk6) {
            C44084kk6 c44084kk6 = (C44084kk6) obj;
            return Intrinsics.areEqual(this.f94850a, c44084kk6.f94850a) && Intrinsics.areEqual(this.f94851b, c44084kk6.f94851b) && Intrinsics.areEqual(this.f94852c, c44084kk6.f94852c) && Intrinsics.areEqual(this.f94853d, c44084kk6.f94853d) && Intrinsics.areEqual(this.f94854e, c44084kk6.f94854e) && Intrinsics.areEqual(this.f94855f, c44084kk6.f94855f) && Intrinsics.areEqual(this.f94856g, c44084kk6.f94856g) && Intrinsics.areEqual(this.f94857h, c44084kk6.f94857h) && this.f94858i == c44084kk6.f94858i && Intrinsics.areEqual(this.f94859j, c44084kk6.f94859j) && Intrinsics.areEqual(this.f94860k, c44084kk6.f94860k) && Intrinsics.areEqual(this.f94861l, c44084kk6.f94861l) && Intrinsics.areEqual(this.f94862m, c44084kk6.f94862m) && Intrinsics.areEqual(this.f94863n, c44084kk6.f94863n) && Intrinsics.areEqual(this.f94864o, c44084kk6.f94864o) && Intrinsics.areEqual(this.f94865p, c44084kk6.f94865p) && Intrinsics.areEqual(this.f94866q, c44084kk6.f94866q);
        }
        return false;
    }

    /* renamed from: f */
    public final Integer m28548f() {
        return this.f94851b;
    }

    /* renamed from: g */
    public final Drawable m28547g() {
        return this.f94854e;
    }

    /* renamed from: h */
    public final Integer m28546h() {
        return this.f94850a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Integer num = this.f94850a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f94851b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f94852c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f94853d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Drawable drawable = this.f94854e;
        int hashCode5 = (hashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f94855f;
        int hashCode6 = (hashCode5 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f94856g;
        int hashCode7 = (hashCode6 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31;
        Drawable drawable4 = this.f94857h;
        int hashCode8 = (hashCode7 + (drawable4 == null ? 0 : drawable4.hashCode())) * 31;
        boolean z = this.f94858i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode8 + i) * 31;
        Integer num5 = this.f94859j;
        int hashCode9 = (i2 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f94860k;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f94861l;
        int hashCode11 = (hashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f94862m;
        int hashCode12 = (hashCode11 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f94863n;
        int hashCode13 = (hashCode12 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f94864o;
        int hashCode14 = (hashCode13 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f94865p;
        int hashCode15 = (hashCode14 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f94866q;
        return hashCode15 + (num12 != null ? num12.hashCode() : 0);
    }

    /* renamed from: i */
    public final Drawable m28545i() {
        return this.f94857h;
    }

    /* renamed from: j */
    public final Integer m28544j() {
        return this.f94853d;
    }

    /* renamed from: k */
    public final Integer m28543k() {
        return this.f94865p;
    }

    /* renamed from: l */
    public final Integer m28542l() {
        return this.f94861l;
    }

    /* renamed from: m */
    public final Integer m28541m() {
        return this.f94860k;
    }

    /* renamed from: n */
    public final Integer m28540n() {
        return this.f94866q;
    }

    /* renamed from: o */
    public final Integer m28539o() {
        return this.f94863n;
    }

    /* renamed from: p */
    public final Integer m28538p() {
        return this.f94864o;
    }

    /* renamed from: q */
    public final boolean m28537q() {
        return this.f94858i;
    }

    /* renamed from: r */
    public final void m28536r(Drawable drawable) {
        this.f94856g = drawable;
    }

    /* renamed from: s */
    public final void m28535s(Integer num) {
        this.f94852c = num;
    }

    /* renamed from: t */
    public final void m28534t(Drawable drawable) {
        this.f94855f = drawable;
    }

    public String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f94850a + ", drawableEndRes=" + this.f94851b + ", drawableBottomRes=" + this.f94852c + ", drawableTopRes=" + this.f94853d + ", drawableStart=" + this.f94854e + ", drawableEnd=" + this.f94855f + ", drawableBottom=" + this.f94856g + ", drawableTop=" + this.f94857h + ", isRtlLayout=" + this.f94858i + ", compoundDrawablePadding=" + this.f94859j + ", iconWidth=" + this.f94860k + ", iconHeight=" + this.f94861l + ", compoundDrawablePaddingRes=" + this.f94862m + ", tintColor=" + this.f94863n + ", widthRes=" + this.f94864o + ", heightRes=" + this.f94865p + ", squareSizeRes=" + this.f94866q + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final void m28533u(Integer num) {
        this.f94851b = num;
    }

    /* renamed from: v */
    public final void m28532v(Drawable drawable) {
        this.f94854e = drawable;
    }

    /* renamed from: w */
    public final void m28531w(Integer num) {
        this.f94850a = num;
    }

    /* renamed from: x */
    public final void m28530x(Drawable drawable) {
        this.f94857h = drawable;
    }

    /* renamed from: y */
    public final void m28529y(Integer num) {
        this.f94853d = num;
    }

    /* renamed from: z */
    public final void m28528z(boolean z) {
        this.f94858i = z;
    }

    public C44084kk6(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        this.f94850a = num;
        this.f94851b = num2;
        this.f94852c = num3;
        this.f94853d = num4;
        this.f94854e = drawable;
        this.f94855f = drawable2;
        this.f94856g = drawable3;
        this.f94857h = drawable4;
        this.f94858i = z;
        this.f94859j = num5;
        this.f94860k = num6;
        this.f94861l = num7;
        this.f94862m = num8;
        this.f94863n = num9;
        this.f94864o = num10;
        this.f94865p = num11;
        this.f94866q = num12;
    }

    public /* synthetic */ C44084kk6(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, boolean z, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : drawable, (i & 32) != 0 ? null : drawable2, (i & 64) != 0 ? null : drawable3, (i & 128) != 0 ? null : drawable4, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : num6, (i & 2048) != 0 ? null : num7, (i & 4096) != 0 ? null : num8, (i & 8192) != 0 ? null : num9, (i & 16384) != 0 ? null : num10, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : num11, (i & 65536) != 0 ? null : num12);
    }
}
