package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bv\b\u0007\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u000108ø\u0001\u0001¢\u0006\u0004\bE\u0010FBj\b\u0016\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013ø\u0001\u0001¢\u0006\u0004\bE\u0010GJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007Jq\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b,\u00105R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b$\u00107R\"\u0010>\u001a\u0004\u0018\u0001088\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R#\u0010B\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010AR#\u0010C\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010?\u001a\u0004\b0\u0010AR#\u0010D\u001a\u00020\u00138\u0000X\u0080\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b(\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006H"}, m28432d2 = {"LDE3;", "", "LZV3;", LegacyRepairType.OTHER_KEY, "p", "o", "Lr06;", "textAlign", "LW06;", "textDirection", "LM26;", "lineHeight", "LN16;", "textIndent", "platformStyle", "Lor2;", "lineHeightStyle", "Lfr2;", "lineBreak", "LUN1;", "hyphens", C17296a.f69688o, "(Lr06;LW06;JLN16;LZV3;Lor2;Lfr2;LUN1;)LDE3;", "", "equals", "", "hashCode", "", "toString", "Lr06;", "j", "()Lr06;", "b", "LW06;", "l", "()LW06;", "c", "J", "g", "()J", DateTokenConverter.CONVERTER_KEY, "LN16;", "m", "()LN16;", "e", "LZV3;", "i", "()LZV3;", "f", "Lor2;", "h", "()Lor2;", "Lfr2;", "()Lfr2;", "LUN1;", "()LUN1;", "Ll26;", "Ll26;", "n", "()Ll26;", "getTextMotion$annotations", "()V", "textMotion", "I", "k", "()I", "textAlignOrDefault", "lineBreakOrDefault", "hyphensOrDefault", "<init>", "(Lr06;LW06;JLN16;LZV3;Lor2;Lfr2;LUN1;Ll26;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lr06;LW06;JLN16;LZV3;Lor2;Lfr2;LUN1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DE3 */
/* loaded from: classes.dex */
public final class DE3 {

    /* renamed from: a */
    public final C47801r06 f5408a;

    /* renamed from: b */
    public final W06 f5409b;

    /* renamed from: c */
    public final long f5410c;

    /* renamed from: d */
    public final N16 f5411d;

    /* renamed from: e */
    public final ZV3 f5412e;

    /* renamed from: f */
    public final C46522or2 f5413f;

    /* renamed from: g */
    public final C41185fr2 f5414g;

    /* renamed from: h */
    public final UN1 f5415h;

    /* renamed from: i */
    public final C44263l26 f5416i;

    /* renamed from: j */
    public final int f5417j;

    /* renamed from: k */
    public final int f5418k;

    /* renamed from: l */
    public final int f5419l;

    public /* synthetic */ DE3(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, C44263l26 c44263l26, DefaultConstructorMarker defaultConstructorMarker) {
        this(c47801r06, w06, j, n16, zv3, c46522or2, c41185fr2, un1, c44263l26);
    }

    /* renamed from: b */
    public static /* synthetic */ DE3 m110660b(DE3 de3, C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, int i, Object obj) {
        C47801r06 c47801r062;
        W06 w062;
        long j2;
        N16 n162;
        ZV3 zv32;
        C46522or2 c46522or22;
        C41185fr2 c41185fr22;
        UN1 un12;
        if ((i & 1) != 0) {
            c47801r062 = de3.f5408a;
        } else {
            c47801r062 = c47801r06;
        }
        if ((i & 2) != 0) {
            w062 = de3.f5409b;
        } else {
            w062 = w06;
        }
        if ((i & 4) != 0) {
            j2 = de3.f5410c;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            n162 = de3.f5411d;
        } else {
            n162 = n16;
        }
        if ((i & 16) != 0) {
            zv32 = de3.f5412e;
        } else {
            zv32 = zv3;
        }
        if ((i & 32) != 0) {
            c46522or22 = de3.f5413f;
        } else {
            c46522or22 = c46522or2;
        }
        if ((i & 64) != 0) {
            c41185fr22 = de3.f5414g;
        } else {
            c41185fr22 = c41185fr2;
        }
        if ((i & 128) != 0) {
            un12 = de3.f5415h;
        } else {
            un12 = un1;
        }
        return de3.m110661a(c47801r062, w062, j2, n162, zv32, c46522or22, c41185fr22, un12);
    }

    /* renamed from: a */
    public final DE3 m110661a(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1) {
        return new DE3(c47801r06, w06, j, n16, zv3, c46522or2, c41185fr2, un1, this.f5416i, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final UN1 m110659c() {
        return this.f5415h;
    }

    /* renamed from: d */
    public final int m110658d() {
        return this.f5419l;
    }

    /* renamed from: e */
    public final C41185fr2 m110657e() {
        return this.f5414g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DE3)) {
            return false;
        }
        DE3 de3 = (DE3) obj;
        if (Intrinsics.areEqual(this.f5408a, de3.f5408a) && Intrinsics.areEqual(this.f5409b, de3.f5409b) && M26.m95975e(this.f5410c, de3.f5410c) && Intrinsics.areEqual(this.f5411d, de3.f5411d) && Intrinsics.areEqual(this.f5412e, de3.f5412e) && Intrinsics.areEqual(this.f5413f, de3.f5413f) && Intrinsics.areEqual(this.f5414g, de3.f5414g) && Intrinsics.areEqual(this.f5415h, de3.f5415h) && Intrinsics.areEqual(this.f5416i, de3.f5416i)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m110656f() {
        return this.f5418k;
    }

    /* renamed from: g */
    public final long m110655g() {
        return this.f5410c;
    }

    /* renamed from: h */
    public final C46522or2 m110654h() {
        return this.f5413f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C47801r06 c47801r06 = this.f5408a;
        int i8 = 0;
        if (c47801r06 != null) {
            i = C47801r06.m16681k(c47801r06.m16679m());
        } else {
            i = 0;
        }
        int i9 = i * 31;
        W06 w06 = this.f5409b;
        if (w06 != null) {
            i2 = W06.m78949j(w06.m78947l());
        } else {
            i2 = 0;
        }
        int m95971i = (((i9 + i2) * 31) + M26.m95971i(this.f5410c)) * 31;
        N16 n16 = this.f5411d;
        if (n16 != null) {
            i3 = n16.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (m95971i + i3) * 31;
        ZV3 zv3 = this.f5412e;
        if (zv3 != null) {
            i4 = zv3.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        C46522or2 c46522or2 = this.f5413f;
        if (c46522or2 != null) {
            i5 = c46522or2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        C41185fr2 c41185fr2 = this.f5414g;
        if (c41185fr2 != null) {
            i6 = C41185fr2.m40744i(c41185fr2.m40742k());
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        UN1 un1 = this.f5415h;
        if (un1 != null) {
            i7 = UN1.m81577g(un1.m81575i());
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        C44263l26 c44263l26 = this.f5416i;
        if (c44263l26 != null) {
            i8 = c44263l26.hashCode();
        }
        return i14 + i8;
    }

    /* renamed from: i */
    public final ZV3 m110653i() {
        return this.f5412e;
    }

    /* renamed from: j */
    public final C47801r06 m110652j() {
        return this.f5408a;
    }

    /* renamed from: k */
    public final int m110651k() {
        return this.f5417j;
    }

    /* renamed from: l */
    public final W06 m110650l() {
        return this.f5409b;
    }

    /* renamed from: m */
    public final N16 m110649m() {
        return this.f5411d;
    }

    /* renamed from: n */
    public final C44263l26 m110648n() {
        return this.f5416i;
    }

    /* renamed from: o */
    public final DE3 m110647o(DE3 de3) {
        long j;
        if (de3 == null) {
            return this;
        }
        if (N26.m94413g(de3.f5410c)) {
            j = this.f5410c;
        } else {
            j = de3.f5410c;
        }
        long j2 = j;
        N16 n16 = de3.f5411d;
        if (n16 == null) {
            n16 = this.f5411d;
        }
        N16 n162 = n16;
        C47801r06 c47801r06 = de3.f5408a;
        if (c47801r06 == null) {
            c47801r06 = this.f5408a;
        }
        C47801r06 c47801r062 = c47801r06;
        W06 w06 = de3.f5409b;
        if (w06 == null) {
            w06 = this.f5409b;
        }
        W06 w062 = w06;
        ZV3 m110646p = m110646p(de3.f5412e);
        C46522or2 c46522or2 = de3.f5413f;
        if (c46522or2 == null) {
            c46522or2 = this.f5413f;
        }
        C46522or2 c46522or22 = c46522or2;
        C41185fr2 c41185fr2 = de3.f5414g;
        if (c41185fr2 == null) {
            c41185fr2 = this.f5414g;
        }
        C41185fr2 c41185fr22 = c41185fr2;
        UN1 un1 = de3.f5415h;
        if (un1 == null) {
            un1 = this.f5415h;
        }
        UN1 un12 = un1;
        C44263l26 c44263l26 = de3.f5416i;
        if (c44263l26 == null) {
            c44263l26 = this.f5416i;
        }
        return new DE3(c47801r062, w062, j2, n162, m110646p, c46522or22, c41185fr22, un12, c44263l26, (DefaultConstructorMarker) null);
    }

    /* renamed from: p */
    public final ZV3 m110646p(ZV3 zv3) {
        ZV3 zv32 = this.f5412e;
        if (zv32 == null) {
            return zv3;
        }
        if (zv3 == null) {
            return zv32;
        }
        return zv32.m73000d(zv3);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + this.f5408a + ", textDirection=" + this.f5409b + ", lineHeight=" + ((Object) M26.m95970j(this.f5410c)) + ", textIndent=" + this.f5411d + ", platformStyle=" + this.f5412e + ", lineHeightStyle=" + this.f5413f + ", lineBreak=" + this.f5414g + ", hyphens=" + this.f5415h + ", textMotion=" + this.f5416i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ DE3(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, DefaultConstructorMarker defaultConstructorMarker) {
        this(c47801r06, w06, j, n16, zv3, c46522or2, c41185fr2, un1);
    }

    public DE3(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, C44263l26 c44263l26) {
        this.f5408a = c47801r06;
        this.f5409b = w06;
        this.f5410c = j;
        this.f5411d = n16;
        this.f5412e = zv3;
        this.f5413f = c46522or2;
        this.f5414g = c41185fr2;
        this.f5415h = un1;
        this.f5416i = c44263l26;
        this.f5417j = c47801r06 != null ? c47801r06.m16679m() : C47801r06.f106195b.m16673f();
        this.f5418k = c41185fr2 != null ? c41185fr2.m40742k() : C41185fr2.f80839b.m40741a();
        this.f5419l = un1 != null ? un1.m81575i() : UN1.f37309b.m81573b();
        if (M26.m95975e(j, M26.f22473b.m95968a())) {
            return;
        }
        if (M26.m95972h(j) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + M26.m95972h(j) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public /* synthetic */ DE3(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c47801r06, (i & 2) != 0 ? null : w06, (i & 4) != 0 ? M26.f22473b.m95968a() : j, (i & 8) != 0 ? null : n16, (i & 16) != 0 ? null : zv3, (i & 32) != 0 ? null : c46522or2, (i & 64) != 0 ? null : c41185fr2, (i & 128) == 0 ? un1 : null, (DefaultConstructorMarker) null);
    }

    public DE3(C47801r06 c47801r06, W06 w06, long j, N16 n16, ZV3 zv3, C46522or2 c46522or2, C41185fr2 c41185fr2, UN1 un1) {
        this(c47801r06, w06, j, n16, zv3, c46522or2, c41185fr2, un1, (C44263l26) null, (DefaultConstructorMarker) null);
    }
}
