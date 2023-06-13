package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001Bª\u0001\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00106\u001a\u00020\f\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u000107\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010N\u001a\u00020\u0004\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010O\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010Uø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR+\u0010\u0010\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R-\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR-\u0010&\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\b0\u00101\"\u0004\b\u0019\u00102R+\u00106\u001a\u00020\f8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR-\u0010<\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b5\u00108\u001a\u0004\b9\u0010:\"\u0004\b\r\u0010;R$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR+\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bB\u0010\u0006\u001a\u0004\bM\u0010\b\"\u0004\b\u0005\u0010\nR$\u0010T\u001a\u0004\u0018\u00010O8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bF\u0010SR$\u0010[\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\b>\u0010Z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, m28432d2 = {"LDX2;", "", "LGN5;", "m", "Lpm0;", C17296a.f69688o, "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "color", "LM26;", "b", "getFontSize-XSAIIZE", "e", "fontSize", "LJw1;", "LJw1;", "getFontWeight", "()LJw1;", "h", "(LJw1;)V", "fontWeight", "LEw1;", DateTokenConverter.CONVERTER_KEY, "LEw1;", "getFontStyle-4Lr2A7w", "()LEw1;", "f", "(LEw1;)V", "fontStyle", "LFw1;", "LFw1;", "getFontSynthesis-ZQGJjVo", "()LFw1;", "g", "(LFw1;)V", "fontSynthesis", "Lkw1;", "Lkw1;", "getFontFamily", "()Lkw1;", "setFontFamily", "(Lkw1;)V", "fontFamily", "", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "fontFeatureSettings", "getLetterSpacing-XSAIIZE", "i", "letterSpacing", "LHE;", "LHE;", "getBaselineShift-5SSeXJ0", "()LHE;", "(LHE;)V", "baselineShift", "LL16;", "j", "LL16;", "getTextGeometricTransform", "()LL16;", "l", "(LL16;)V", "textGeometricTransform", "Luv2;", "k", "Luv2;", "getLocaleList", "()Luv2;", "setLocaleList", "(Luv2;)V", "localeList", "getBackground-0d7_KjU", "background", "LR06;", "LR06;", "getTextDecoration", "()LR06;", "(LR06;)V", "textDecoration", "LPx5;", "n", "LPx5;", "getShadow", "()LPx5;", "(LPx5;)V", "shadow", "<init>", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DX2 */
/* loaded from: classes.dex */
public final class DX2 {

    /* renamed from: a */
    public long f5845a;

    /* renamed from: b */
    public long f5846b;

    /* renamed from: c */
    public C33918Jw1 f5847c;

    /* renamed from: d */
    public C32748Ew1 f5848d;

    /* renamed from: e */
    public C32982Fw1 f5849e;

    /* renamed from: f */
    public AbstractC44199kw1 f5850f;

    /* renamed from: g */
    public String f5851g;

    /* renamed from: h */
    public long f5852h;

    /* renamed from: i */
    public C3091HE f5853i;

    /* renamed from: j */
    public L16 f5854j;

    /* renamed from: k */
    public C50119uv2 f5855k;

    /* renamed from: l */
    public long f5856l;

    /* renamed from: m */
    public R06 f5857m;

    /* renamed from: n */
    public C35335Px5 f5858n;

    public /* synthetic */ DX2(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5);
    }

    /* renamed from: a */
    public final void m110298a(long j) {
        this.f5856l = j;
    }

    /* renamed from: b */
    public final void m110297b(C3091HE c3091he) {
        this.f5853i = c3091he;
    }

    /* renamed from: c */
    public final void m110296c(long j) {
        this.f5845a = j;
    }

    /* renamed from: d */
    public final void m110295d(String str) {
        this.f5851g = str;
    }

    /* renamed from: e */
    public final void m110294e(long j) {
        this.f5846b = j;
    }

    /* renamed from: f */
    public final void m110293f(C32748Ew1 c32748Ew1) {
        this.f5848d = c32748Ew1;
    }

    /* renamed from: g */
    public final void m110292g(C32982Fw1 c32982Fw1) {
        this.f5849e = c32982Fw1;
    }

    /* renamed from: h */
    public final void m110291h(C33918Jw1 c33918Jw1) {
        this.f5847c = c33918Jw1;
    }

    /* renamed from: i */
    public final void m110290i(long j) {
        this.f5852h = j;
    }

    /* renamed from: j */
    public final void m110289j(C35335Px5 c35335Px5) {
        this.f5858n = c35335Px5;
    }

    /* renamed from: k */
    public final void m110288k(R06 r06) {
        this.f5857m = r06;
    }

    /* renamed from: l */
    public final void m110287l(L16 l16) {
        this.f5854j = l16;
    }

    /* renamed from: m */
    public final GN5 m110286m() {
        return new GN5(this.f5845a, this.f5846b, this.f5847c, this.f5848d, this.f5849e, this.f5850f, this.f5851g, this.f5852h, this.f5853i, this.f5854j, this.f5855k, this.f5856l, this.f5857m, this.f5858n, (DefaultConstructorMarker) null);
    }

    public DX2(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5) {
        this.f5845a = j;
        this.f5846b = j2;
        this.f5847c = c33918Jw1;
        this.f5848d = c32748Ew1;
        this.f5849e = c32982Fw1;
        this.f5850f = abstractC44199kw1;
        this.f5851g = str;
        this.f5852h = j3;
        this.f5853i = c3091he;
        this.f5854j = l16;
        this.f5855k = c50119uv2;
        this.f5856l = j4;
        this.f5857m = r06;
        this.f5858n = c35335Px5;
    }

    public /* synthetic */ DX2(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47063pm0.f104050b.m18726g() : j, (i & 2) != 0 ? M26.f22473b.m95968a() : j2, (i & 4) != 0 ? null : c33918Jw1, (i & 8) != 0 ? null : c32748Ew1, (i & 16) != 0 ? null : c32982Fw1, (i & 32) != 0 ? null : abstractC44199kw1, (i & 64) != 0 ? null : str, (i & 128) != 0 ? M26.f22473b.m95968a() : j3, (i & 256) != 0 ? null : c3091he, (i & 512) != 0 ? null : l16, (i & 1024) != 0 ? null : c50119uv2, (i & 2048) != 0 ? C47063pm0.f104050b.m18726g() : j4, (i & 4096) != 0 ? null : r06, (i & 8192) != 0 ? null : c35335Px5, null);
    }
}
