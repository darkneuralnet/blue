package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u009e\u0001\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010'\u001a\u00020\u001f\u0012\b\b\u0002\u0010*\u001a\u00020\u001f\u0012\b\b\u0002\u0010-\u001a\u00020+\u0012\b\b\u0002\u00101\u001a\u00020.\u0012\b\b\u0002\u00104\u001a\u00020\u001f\u0012\b\b\u0002\u00107\u001a\u00020\u001f\u0012\b\b\u0002\u0010:\u001a\u00020\u001f\u0012\b\b\u0002\u0010<\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\u00020\u00148\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b\t\u0010!R\u0019\u0010%\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010'\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b&\u0010!R\u0017\u0010*\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010!R \u0010-\u001a\u00020+8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b,\u0010\u0018R \u00101\u001a\u00020.8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0017\u00104\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b2\u0010 \u001a\u0004\b3\u0010!R\u0017\u00107\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010!R\u0017\u0010:\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010!R\u0017\u0010<\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b;\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m28432d2 = {"Lhk6;", "Lek6;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "", "LpJ3;", "Ljava/util/List;", "e", "()Ljava/util/List;", "pathData", "LjJ3;", DateTokenConverter.CONVERTER_KEY, "I", "f", "()I", "pathFillType", "La30;", "La30;", C17296a.f69688o, "()La30;", "fill", "", "F", "()F", "fillAlpha", "g", "h", "stroke", "j", "strokeAlpha", "i", "v", "strokeLineWidth", "LLS5;", "o", "strokeLineCap", "LNS5;", "k", "s", "strokeLineJoin", "l", "u", "strokeLineMiter", "m", "y", "trimPathStart", "n", "w", "trimPathEnd", "x", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILa30;FLa30;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42305hk6 extends AbstractC40526ek6 {

    /* renamed from: b */
    public final String f85823b;

    /* renamed from: c */
    public final List<AbstractC46793pJ3> f85824c;

    /* renamed from: d */
    public final int f85825d;

    /* renamed from: e */
    public final AbstractC37727a30 f85826e;

    /* renamed from: f */
    public final float f85827f;

    /* renamed from: g */
    public final AbstractC37727a30 f85828g;

    /* renamed from: h */
    public final float f85829h;

    /* renamed from: i */
    public final float f85830i;

    /* renamed from: j */
    public final int f85831j;

    /* renamed from: k */
    public final int f85832k;

    /* renamed from: l */
    public final float f85833l;

    /* renamed from: m */
    public final float f85834m;

    /* renamed from: n */
    public final float f85835n;

    /* renamed from: o */
    public final float f85836o;

    public /* synthetic */ C42305hk6(String str, List list, int i, AbstractC37727a30 abstractC37727a30, float f, AbstractC37727a30 abstractC37727a302, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, abstractC37727a30, f, abstractC37727a302, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    /* renamed from: a */
    public final AbstractC37727a30 m35916a() {
        return this.f85826e;
    }

    /* renamed from: b */
    public final float m35915b() {
        return this.f85827f;
    }

    /* renamed from: c */
    public final String m35914c() {
        return this.f85823b;
    }

    /* renamed from: e */
    public final List<AbstractC46793pJ3> m35913e() {
        return this.f85824c;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || C42305hk6.class != obj.getClass()) {
            return false;
        }
        C42305hk6 c42305hk6 = (C42305hk6) obj;
        if (!Intrinsics.areEqual(this.f85823b, c42305hk6.f85823b) || !Intrinsics.areEqual(this.f85826e, c42305hk6.f85826e)) {
            return false;
        }
        if (this.f85827f == c42305hk6.f85827f) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !Intrinsics.areEqual(this.f85828g, c42305hk6.f85828g)) {
            return false;
        }
        if (this.f85829h == c42305hk6.f85829h) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f85830i == c42305hk6.f85830i) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || !LS5.m96924g(this.f85831j, c42305hk6.f85831j) || !NS5.m93883g(this.f85832k, c42305hk6.f85832k)) {
            return false;
        }
        if (this.f85833l == c42305hk6.f85833l) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f85834m == c42305hk6.f85834m) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f85835n == c42305hk6.f85835n) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f85836o == c42305hk6.f85836o) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && C43235jJ3.m30796f(this.f85825d, c42305hk6.f85825d) && Intrinsics.areEqual(this.f85824c, c42305hk6.f85824c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m35912f() {
        return this.f85825d;
    }

    /* renamed from: h */
    public final AbstractC37727a30 m35911h() {
        return this.f85828g;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f85823b.hashCode() * 31) + this.f85824c.hashCode()) * 31;
        AbstractC37727a30 abstractC37727a30 = this.f85826e;
        int i2 = 0;
        if (abstractC37727a30 != null) {
            i = abstractC37727a30.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + Float.hashCode(this.f85827f)) * 31;
        AbstractC37727a30 abstractC37727a302 = this.f85828g;
        if (abstractC37727a302 != null) {
            i2 = abstractC37727a302.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i2) * 31) + Float.hashCode(this.f85829h)) * 31) + Float.hashCode(this.f85830i)) * 31) + LS5.m96923h(this.f85831j)) * 31) + NS5.m93882h(this.f85832k)) * 31) + Float.hashCode(this.f85833l)) * 31) + Float.hashCode(this.f85834m)) * 31) + Float.hashCode(this.f85835n)) * 31) + Float.hashCode(this.f85836o)) * 31) + C43235jJ3.m30795g(this.f85825d);
    }

    /* renamed from: j */
    public final float m35910j() {
        return this.f85829h;
    }

    /* renamed from: o */
    public final int m35909o() {
        return this.f85831j;
    }

    /* renamed from: s */
    public final int m35908s() {
        return this.f85832k;
    }

    /* renamed from: u */
    public final float m35907u() {
        return this.f85833l;
    }

    /* renamed from: v */
    public final float m35906v() {
        return this.f85830i;
    }

    /* renamed from: w */
    public final float m35905w() {
        return this.f85835n;
    }

    /* renamed from: x */
    public final float m35904x() {
        return this.f85836o;
    }

    /* renamed from: y */
    public final float m35903y() {
        return this.f85834m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42305hk6(String str, List<? extends AbstractC46793pJ3> list, int i, AbstractC37727a30 abstractC37727a30, float f, AbstractC37727a30 abstractC37727a302, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        this.f85823b = str;
        this.f85824c = list;
        this.f85825d = i;
        this.f85826e = abstractC37727a30;
        this.f85827f = f;
        this.f85828g = abstractC37727a302;
        this.f85829h = f2;
        this.f85830i = f3;
        this.f85831j = i2;
        this.f85832k = i3;
        this.f85833l = f4;
        this.f85834m = f5;
        this.f85835n = f6;
        this.f85836o = f7;
    }
}
