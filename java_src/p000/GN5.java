package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BÂ\u0001\b\u0000\u0012\u0006\u0010.\u001a\u00020*\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010[ø\u0001\u0001¢\u0006\u0004\bi\u0010jB¬\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0001¢\u0006\u0004\bi\u0010kB¸\u0001\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002ø\u0001\u0001¢\u0006\u0004\bi\u0010lBÄ\u0001\b\u0017\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010[ø\u0001\u0001¢\u0006\u0004\bi\u0010mJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0002J\u0014\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007J³\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b%\u0010&J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b,\u0010-R \u0010\u000b\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u0016\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010I\u001a\u0004\b;\u0010JR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bE\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b1\u0010N\u001a\u0004\bO\u0010PR \u0010\u001d\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b7\u00102R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b=\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b5\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010Z\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010W\u001a\u0004\bX\u0010YR\"\u0010`\u001a\u0004\u0018\u00010[8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010\\\u0012\u0004\b^\u0010_\u001a\u0004\bG\u0010]R\u001a\u0010\t\u001a\u00020\b8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bC\u00102R\u001c\u0010d\u001a\u0004\u0018\u00010a8GX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010_\u001a\u0004\b?\u0010bR\u001a\u0010h\u001a\u00020e8GX\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010_\u001a\u0004\b3\u0010f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006n"}, m28432d2 = {"LGN5;", "", "LdW3;", LegacyRepairType.OTHER_KEY, "y", "", "w", "x", "Lpm0;", "color", "LM26;", "fontSize", "LJw1;", "fontWeight", "LEw1;", "fontStyle", "LFw1;", "fontSynthesis", "Lkw1;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LHE;", "baselineShift", "LL16;", "textGeometricTransform", "Luv2;", "localeList", "background", "LR06;", "textDecoration", "LPx5;", "shadow", C17296a.f69688o, "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;)LGN5;", "equals", "v", "(LGN5;)Z", "", "hashCode", "toString", "LH16;", "LH16;", "t", "()LH16;", "textForegroundStyle", "b", "J", "k", "()J", "c", "LJw1;", "n", "()LJw1;", DateTokenConverter.CONVERTER_KEY, "LEw1;", "l", "()LEw1;", "e", "LFw1;", "m", "()LFw1;", "f", "Lkw1;", "i", "()Lkw1;", "g", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "h", "o", "LHE;", "()LHE;", "LL16;", "u", "()LL16;", "Luv2;", "p", "()Luv2;", "LR06;", "s", "()LR06;", "LPx5;", "r", "()LPx5;", "LdW3;", "q", "()LdW3;", "platformStyle", "LJ61;", "LJ61;", "()LJ61;", "getDrawStyle$annotations", "()V", "drawStyle", "La30;", "()La30;", "getBrush$annotations", "brush", "", "()F", "getAlpha$annotations", "alpha", "<init>", "(LH16;JLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;LdW3;LJ61;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;LdW3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;LdW3;LJ61;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyle\n*L\n442#1:857\n442#1:858\n*E\n"})
/* renamed from: GN5 */
/* loaded from: classes.dex */
public final class GN5 {

    /* renamed from: a */
    public final H16 f11829a;

    /* renamed from: b */
    public final long f11830b;

    /* renamed from: c */
    public final C33918Jw1 f11831c;

    /* renamed from: d */
    public final C32748Ew1 f11832d;

    /* renamed from: e */
    public final C32982Fw1 f11833e;

    /* renamed from: f */
    public final AbstractC44199kw1 f11834f;

    /* renamed from: g */
    public final String f11835g;

    /* renamed from: h */
    public final long f11836h;

    /* renamed from: i */
    public final C3091HE f11837i;

    /* renamed from: j */
    public final L16 f11838j;

    /* renamed from: k */
    public final C50119uv2 f11839k;

    /* renamed from: l */
    public final long f11840l;

    /* renamed from: m */
    public final R06 f11841m;

    /* renamed from: n */
    public final C35335Px5 f11842n;

    /* renamed from: o */
    public final C39795dW3 f11843o;

    /* renamed from: p */
    public final J61 f11844p;

    public /* synthetic */ GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, J61 j61, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c39795dW3, j61);
    }

    /* renamed from: a */
    public final GN5 m105174a(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5) {
        H16 m104494b;
        if (C47063pm0.m18741o(j, m105168g())) {
            m104494b = this.f11829a;
        } else {
            m104494b = H16.f12733a.m104494b(j);
        }
        return new GN5(m104494b, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, this.f11843o, this.f11844p, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final float m105172c() {
        return this.f11829a.mo61988h();
    }

    /* renamed from: d */
    public final long m105171d() {
        return this.f11840l;
    }

    /* renamed from: e */
    public final C3091HE m105170e() {
        return this.f11837i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GN5)) {
            return false;
        }
        GN5 gn5 = (GN5) obj;
        if (m105153v(gn5) && m105152w(gn5)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC37727a30 m105169f() {
        return this.f11829a.mo61990d();
    }

    /* renamed from: g */
    public final long m105168g() {
        return this.f11829a.mo61991a();
    }

    /* renamed from: h */
    public final J61 m105167h() {
        return this.f11844p;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int m18735u = C47063pm0.m18735u(m105168g()) * 31;
        AbstractC37727a30 m105169f = m105169f();
        int i13 = 0;
        if (m105169f != null) {
            i = m105169f.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (((((m18735u + i) * 31) + Float.hashCode(m105172c())) * 31) + M26.m95971i(this.f11830b)) * 31;
        C33918Jw1 c33918Jw1 = this.f11831c;
        if (c33918Jw1 != null) {
            i2 = c33918Jw1.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (hashCode + i2) * 31;
        C32748Ew1 c32748Ew1 = this.f11832d;
        if (c32748Ew1 != null) {
            i3 = C32748Ew1.m108205g(c32748Ew1.m108203i());
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        C32982Fw1 c32982Fw1 = this.f11833e;
        if (c32982Fw1 != null) {
            i4 = C32982Fw1.m106237i(c32982Fw1.m106233m());
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        AbstractC44199kw1 abstractC44199kw1 = this.f11834f;
        if (abstractC44199kw1 != null) {
            i5 = abstractC44199kw1.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str = this.f11835g;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int m95971i = (((i17 + i6) * 31) + M26.m95971i(this.f11836h)) * 31;
        C3091HE c3091he = this.f11837i;
        if (c3091he != null) {
            i7 = C3091HE.m104157f(c3091he.m104155h());
        } else {
            i7 = 0;
        }
        int i18 = (m95971i + i7) * 31;
        L16 l16 = this.f11838j;
        if (l16 != null) {
            i8 = l16.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        C50119uv2 c50119uv2 = this.f11839k;
        if (c50119uv2 != null) {
            i9 = c50119uv2.hashCode();
        } else {
            i9 = 0;
        }
        int m18735u2 = (((i19 + i9) * 31) + C47063pm0.m18735u(this.f11840l)) * 31;
        R06 r06 = this.f11841m;
        if (r06 != null) {
            i10 = r06.hashCode();
        } else {
            i10 = 0;
        }
        int i20 = (m18735u2 + i10) * 31;
        C35335Px5 c35335Px5 = this.f11842n;
        if (c35335Px5 != null) {
            i11 = c35335Px5.hashCode();
        } else {
            i11 = 0;
        }
        int i21 = (i20 + i11) * 31;
        C39795dW3 c39795dW3 = this.f11843o;
        if (c39795dW3 != null) {
            i12 = c39795dW3.hashCode();
        } else {
            i12 = 0;
        }
        int i22 = (i21 + i12) * 31;
        J61 j61 = this.f11844p;
        if (j61 != null) {
            i13 = j61.hashCode();
        }
        return i22 + i13;
    }

    /* renamed from: i */
    public final AbstractC44199kw1 m105166i() {
        return this.f11834f;
    }

    /* renamed from: j */
    public final String m105165j() {
        return this.f11835g;
    }

    /* renamed from: k */
    public final long m105164k() {
        return this.f11830b;
    }

    /* renamed from: l */
    public final C32748Ew1 m105163l() {
        return this.f11832d;
    }

    /* renamed from: m */
    public final C32982Fw1 m105162m() {
        return this.f11833e;
    }

    /* renamed from: n */
    public final C33918Jw1 m105161n() {
        return this.f11831c;
    }

    /* renamed from: o */
    public final long m105160o() {
        return this.f11836h;
    }

    /* renamed from: p */
    public final C50119uv2 m105159p() {
        return this.f11839k;
    }

    /* renamed from: q */
    public final C39795dW3 m105158q() {
        return this.f11843o;
    }

    /* renamed from: r */
    public final C35335Px5 m105157r() {
        return this.f11842n;
    }

    /* renamed from: s */
    public final R06 m105156s() {
        return this.f11841m;
    }

    /* renamed from: t */
    public final H16 m105155t() {
        return this.f11829a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C47063pm0.m18734v(m105168g())) + ", brush=" + m105169f() + ", alpha=" + m105172c() + ", fontSize=" + ((Object) M26.m95970j(this.f11830b)) + ", fontWeight=" + this.f11831c + ", fontStyle=" + this.f11832d + ", fontSynthesis=" + this.f11833e + ", fontFamily=" + this.f11834f + ", fontFeatureSettings=" + this.f11835g + ", letterSpacing=" + ((Object) M26.m95970j(this.f11836h)) + ", baselineShift=" + this.f11837i + ", textGeometricTransform=" + this.f11838j + ", localeList=" + this.f11839k + ", background=" + ((Object) C47063pm0.m18734v(this.f11840l)) + ", textDecoration=" + this.f11841m + ", shadow=" + this.f11842n + ", platformStyle=" + this.f11843o + ", drawStyle=" + this.f11844p + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final L16 m105154u() {
        return this.f11838j;
    }

    /* renamed from: v */
    public final boolean m105153v(GN5 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this == other) {
            return true;
        }
        if (M26.m95975e(this.f11830b, other.f11830b) && Intrinsics.areEqual(this.f11831c, other.f11831c) && Intrinsics.areEqual(this.f11832d, other.f11832d) && Intrinsics.areEqual(this.f11833e, other.f11833e) && Intrinsics.areEqual(this.f11834f, other.f11834f) && Intrinsics.areEqual(this.f11835g, other.f11835g) && M26.m95975e(this.f11836h, other.f11836h) && Intrinsics.areEqual(this.f11837i, other.f11837i) && Intrinsics.areEqual(this.f11838j, other.f11838j) && Intrinsics.areEqual(this.f11839k, other.f11839k) && C47063pm0.m18741o(this.f11840l, other.f11840l) && Intrinsics.areEqual(this.f11843o, other.f11843o)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m105152w(GN5 gn5) {
        if (!Intrinsics.areEqual(this.f11829a, gn5.f11829a) || !Intrinsics.areEqual(this.f11841m, gn5.f11841m) || !Intrinsics.areEqual(this.f11842n, gn5.f11842n) || !Intrinsics.areEqual(this.f11844p, gn5.f11844p)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final GN5 m105151x(GN5 gn5) {
        long j;
        long j2;
        boolean z;
        if (gn5 == null) {
            return this;
        }
        H16 m104496c = this.f11829a.m104496c(gn5.f11829a);
        AbstractC44199kw1 abstractC44199kw1 = gn5.f11834f;
        if (abstractC44199kw1 == null) {
            abstractC44199kw1 = this.f11834f;
        }
        AbstractC44199kw1 abstractC44199kw12 = abstractC44199kw1;
        if (!N26.m94413g(gn5.f11830b)) {
            j = gn5.f11830b;
        } else {
            j = this.f11830b;
        }
        long j3 = j;
        C33918Jw1 c33918Jw1 = gn5.f11831c;
        if (c33918Jw1 == null) {
            c33918Jw1 = this.f11831c;
        }
        C33918Jw1 c33918Jw12 = c33918Jw1;
        C32748Ew1 c32748Ew1 = gn5.f11832d;
        if (c32748Ew1 == null) {
            c32748Ew1 = this.f11832d;
        }
        C32748Ew1 c32748Ew12 = c32748Ew1;
        C32982Fw1 c32982Fw1 = gn5.f11833e;
        if (c32982Fw1 == null) {
            c32982Fw1 = this.f11833e;
        }
        C32982Fw1 c32982Fw12 = c32982Fw1;
        String str = gn5.f11835g;
        if (str == null) {
            str = this.f11835g;
        }
        String str2 = str;
        if (!N26.m94413g(gn5.f11836h)) {
            j2 = gn5.f11836h;
        } else {
            j2 = this.f11836h;
        }
        long j4 = j2;
        C3091HE c3091he = gn5.f11837i;
        if (c3091he == null) {
            c3091he = this.f11837i;
        }
        C3091HE c3091he2 = c3091he;
        L16 l16 = gn5.f11838j;
        if (l16 == null) {
            l16 = this.f11838j;
        }
        L16 l162 = l16;
        C50119uv2 c50119uv2 = gn5.f11839k;
        if (c50119uv2 == null) {
            c50119uv2 = this.f11839k;
        }
        C50119uv2 c50119uv22 = c50119uv2;
        long j5 = gn5.f11840l;
        if (j5 != C47063pm0.f104050b.m18726g()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            j5 = this.f11840l;
        }
        long j6 = j5;
        R06 r06 = gn5.f11841m;
        if (r06 == null) {
            r06 = this.f11841m;
        }
        R06 r062 = r06;
        C35335Px5 c35335Px5 = gn5.f11842n;
        if (c35335Px5 == null) {
            c35335Px5 = this.f11842n;
        }
        C35335Px5 c35335Px52 = c35335Px5;
        C39795dW3 m105150y = m105150y(gn5.f11843o);
        J61 j61 = gn5.f11844p;
        if (j61 == null) {
            j61 = this.f11844p;
        }
        return new GN5(m104496c, j3, c33918Jw12, c32748Ew12, c32982Fw12, abstractC44199kw12, str2, j4, c3091he2, l162, c50119uv22, j6, r062, c35335Px52, m105150y, j61, (DefaultConstructorMarker) null);
    }

    /* renamed from: y */
    public final C39795dW3 m105150y(C39795dW3 c39795dW3) {
        C39795dW3 c39795dW32 = this.f11843o;
        if (c39795dW32 == null) {
            return c39795dW3;
        }
        if (c39795dW3 == null) {
            return c39795dW32;
        }
        return c39795dW32.m44203b(c39795dW3);
    }

    public /* synthetic */ GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c39795dW3);
    }

    public /* synthetic */ GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5);
    }

    public /* synthetic */ GN5(H16 h16, long j, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j2, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j3, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, J61 j61, DefaultConstructorMarker defaultConstructorMarker) {
        this(h16, j, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j2, c3091he, l16, c50119uv2, j3, r06, c35335Px5, c39795dW3, j61);
    }

    public GN5(H16 h16, long j, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j2, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j3, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, J61 j61) {
        this.f11829a = h16;
        this.f11830b = j;
        this.f11831c = c33918Jw1;
        this.f11832d = c32748Ew1;
        this.f11833e = c32982Fw1;
        this.f11834f = abstractC44199kw1;
        this.f11835g = str;
        this.f11836h = j2;
        this.f11837i = c3091he;
        this.f11838j = l16;
        this.f11839k = c50119uv2;
        this.f11840l = j3;
        this.f11841m = r06;
        this.f11842n = c35335Px5;
        this.f11843o = c39795dW3;
        this.f11844p = j61;
    }

    public /* synthetic */ GN5(H16 h16, long j, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j2, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j3, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, J61 j61, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(h16, (i & 2) != 0 ? M26.f22473b.m95968a() : j, (i & 4) != 0 ? null : c33918Jw1, (i & 8) != 0 ? null : c32748Ew1, (i & 16) != 0 ? null : c32982Fw1, (i & 32) != 0 ? null : abstractC44199kw1, (i & 64) != 0 ? null : str, (i & 128) != 0 ? M26.f22473b.m95968a() : j2, (i & 256) != 0 ? null : c3091he, (i & 512) != 0 ? null : l16, (i & 1024) != 0 ? null : c50119uv2, (i & 2048) != 0 ? C47063pm0.f104050b.m18726g() : j3, (i & 4096) != 0 ? null : r06, (i & 8192) != 0 ? null : c35335Px5, (i & 16384) != 0 ? null : c39795dW3, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : j61, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47063pm0.f104050b.m18726g() : j, (i & 2) != 0 ? M26.f22473b.m95968a() : j2, (i & 4) != 0 ? null : c33918Jw1, (i & 8) != 0 ? null : c32748Ew1, (i & 16) != 0 ? null : c32982Fw1, (i & 32) != 0 ? null : abstractC44199kw1, (i & 64) != 0 ? null : str, (i & 128) != 0 ? M26.f22473b.m95968a() : j3, (i & 256) != 0 ? null : c3091he, (i & 512) != 0 ? null : l16, (i & 1024) != 0 ? null : c50119uv2, (i & 2048) != 0 ? C47063pm0.f104050b.m18726g() : j4, (i & 4096) != 0 ? null : r06, (i & 8192) != 0 ? null : c35335Px5, (DefaultConstructorMarker) null);
    }

    public GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5) {
        this(H16.f12733a.m104494b(j), j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, null, null, DateUtils.FORMAT_ABBREV_WEEKDAY, null);
    }

    public GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3) {
        this(H16.f12733a.m104494b(j), j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c39795dW3, null, DateUtils.FORMAT_ABBREV_WEEKDAY, null);
    }

    public GN5(long j, long j2, C33918Jw1 c33918Jw1, C32748Ew1 c32748Ew1, C32982Fw1 c32982Fw1, AbstractC44199kw1 abstractC44199kw1, String str, long j3, C3091HE c3091he, L16 l16, C50119uv2 c50119uv2, long j4, R06 r06, C35335Px5 c35335Px5, C39795dW3 c39795dW3, J61 j61) {
        this(H16.f12733a.m104494b(j), j2, c33918Jw1, c32748Ew1, c32982Fw1, abstractC44199kw1, str, j3, c3091he, l16, c50119uv2, j4, r06, c35335Px5, c39795dW3, j61, (DefaultConstructorMarker) null);
    }
}
