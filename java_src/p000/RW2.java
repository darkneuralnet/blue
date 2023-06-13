package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010@\u001a\u00020;\u0012\u0006\u0010`\u001a\u00020_\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010a\u001a\u00020)ø\u0001\u0001¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002JU\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J]\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019J\u001b\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u000e\u0010(\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010+\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)J\u000e\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u000e\u00102\u001a\u00020'2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00103\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00104\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00106\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00107\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u00108\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010:\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u00109\u001a\u00020)R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010D\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010H\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b(\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010K\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\bI\u0010JR\u0017\u0010M\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bL\u0010JR\u0017\u0010P\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u001f\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0Q8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010TR \u0010X\u001a\b\u0012\u0004\u0012\u00020V0Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010R\u001a\u0004\bW\u0010TR\u0014\u0010[\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010ZR\u0011\u0010\\\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0011\u0010^\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b]\u0010J\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006d"}, m28432d2 = {"LRW2;", "", "", "offset", "", "E", "F", "lineIndex", "G", "Lme0;", "canvas", "Lpm0;", "color", "LPx5;", "shadow", "LR06;", "decoration", "LJ61;", "drawStyle", "LLW;", "blendMode", "A", "(Lme0;JLPx5;LR06;LJ61;I)V", "La30;", "brush", "", "alpha", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Lme0;La30;FLPx5;LR06;LJ61;I)V", "start", "end", "LcJ3;", "w", "vertical", "o", "LCe3;", "position", "t", "(J)I", "LOs4;", "c", "", "usePrimaryDirection", "h", "LUL4;", "u", "b", "Ls26;", "z", "(I)J", DateTokenConverter.CONVERTER_KEY, "n", "p", "q", "s", "k", "r", "visibleEnd", "m", "LSW2;", C17296a.f69688o, "LSW2;", "i", "()LSW2;", "intrinsics", "I", "getMaxLines", "()I", "maxLines", "Z", "e", "()Z", "didExceedMaxLines", "y", "()F", "width", "g", "height", "f", "l", "lineCount", "", "Ljava/util/List;", "x", "()Ljava/util/List;", "placeholderRects", "LyE3;", "v", "paragraphInfoList", "LDf;", "()LDf;", "annotatedString", "firstBaseline", "j", "lastBaseline", "Lkz0;", "constraints", "ellipsis", "<init>", "(LSW2;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n127#2,3:981\n130#2:988\n131#2,2:1000\n133#2:1003\n33#3,4:984\n151#3,3:989\n33#3,4:992\n154#3,2:996\n38#3:998\n156#3:999\n38#3:1002\n33#3,6:1005\n33#3,6:1011\n1#4:1004\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:981,3\n371#1:988\n371#1:1000,2\n371#1:1003\n371#1:984,4\n373#1:989,3\n373#1:992,4\n373#1:996,2\n373#1:998\n373#1:999\n371#1:1002\n395#1:1005,6\n413#1:1011,6\n*E\n"})
/* renamed from: RW2 */
/* loaded from: classes.dex */
public final class RW2 {

    /* renamed from: a */
    public final SW2 f32126a;

    /* renamed from: b */
    public final int f32127b;

    /* renamed from: c */
    public final boolean f32128c;

    /* renamed from: d */
    public final float f32129d;

    /* renamed from: e */
    public final float f32130e;

    /* renamed from: f */
    public final int f32131f;

    /* renamed from: g */
    public final List<C35055Os4> f32132g;

    /* renamed from: h */
    public final List<C52083yE3> f32133h;

    public /* synthetic */ RW2(SW2 sw2, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(sw2, j, i, z);
    }

    /* renamed from: B */
    public static /* synthetic */ void m86676B(RW2 rw2, InterfaceC45204me0 interfaceC45204me0, long j, C35335Px5 c35335Px5, R06 r06, J61 j61, int i, int i2, Object obj) {
        long j2;
        C35335Px5 c35335Px52;
        R06 r062;
        int i3;
        if ((i2 & 2) != 0) {
            j2 = C47063pm0.f104050b.m18726g();
        } else {
            j2 = j;
        }
        J61 j612 = null;
        if ((i2 & 4) != 0) {
            c35335Px52 = null;
        } else {
            c35335Px52 = c35335Px5;
        }
        if ((i2 & 8) != 0) {
            r062 = null;
        } else {
            r062 = r06;
        }
        if ((i2 & 16) == 0) {
            j612 = j61;
        }
        if ((i2 & 32) != 0) {
            i3 = I61.f14524O.m102944a();
        } else {
            i3 = i;
        }
        rw2.m86677A(interfaceC45204me0, j2, c35335Px52, r062, j612, i3);
    }

    /* renamed from: D */
    public static /* synthetic */ void m86674D(RW2 rw2, InterfaceC45204me0 interfaceC45204me0, AbstractC37727a30 abstractC37727a30, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i, int i2, Object obj) {
        float f2;
        C35335Px5 c35335Px52;
        R06 r062;
        J61 j612;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            c35335Px52 = null;
        } else {
            c35335Px52 = c35335Px5;
        }
        if ((i2 & 16) != 0) {
            r062 = null;
        } else {
            r062 = r06;
        }
        if ((i2 & 32) != 0) {
            j612 = null;
        } else {
            j612 = j61;
        }
        if ((i2 & 64) != 0) {
            i3 = I61.f14524O.m102944a();
        } else {
            i3 = i;
        }
        rw2.m86675C(interfaceC45204me0, abstractC37727a30, f2, c35335Px52, r062, j612, i3);
    }

    /* renamed from: A */
    public final void m86677A(InterfaceC45204me0 canvas, long j, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.mo25245v();
        List<C52083yE3> list = this.f32133h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C52083yE3 c52083yE3 = list.get(i2);
            c52083yE3.m3784e().mo5624t(canvas, j, c35335Px5, r06, j61, i);
            canvas.mo25265b(0.0f, c52083yE3.m3784e().getHeight());
        }
        canvas.mo25251p();
    }

    /* renamed from: C */
    public final void m86675C(InterfaceC45204me0 canvas, AbstractC37727a30 brush, float f, C35335Px5 c35335Px5, R06 r06, J61 j61, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        C20079ed.m42703a(this, canvas, brush, f, c35335Px5, r06, j61, i);
    }

    /* renamed from: E */
    public final void m86673E(int i) {
        boolean z = false;
        if (i >= 0 && i < m86670a().m110052j().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m86670a().length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: F */
    public final void m86672F(int i) {
        boolean z = false;
        if (i >= 0 && i <= m86670a().m110052j().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + m86670a().length() + ']').toString());
    }

    /* renamed from: G */
    public final void m86671G(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f32131f) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f32131f + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: a */
    public final C1577Df m86670a() {
        return this.f32126a.m85322e();
    }

    /* renamed from: b */
    public final UL4 m86669b(int i) {
        int m81401a;
        m86672F(i);
        if (i == m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3784e().mo5622v(c52083yE3.m3773p(i));
    }

    /* renamed from: c */
    public final C35055Os4 m86668c(int i) {
        m86673E(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81401a(this.f32133h, i));
        return c52083yE3.m3779j(c52083yE3.m3784e().mo5621w(c52083yE3.m3773p(i)));
    }

    /* renamed from: d */
    public final C35055Os4 m86667d(int i) {
        int m81401a;
        m86672F(i);
        if (i == m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3779j(c52083yE3.m3784e().mo5632l(c52083yE3.m3773p(i)));
    }

    /* renamed from: e */
    public final boolean m86666e() {
        return this.f32128c;
    }

    /* renamed from: f */
    public final float m86665f() {
        if (this.f32133h.isEmpty()) {
            return 0.0f;
        }
        return this.f32133h.get(0).m3784e().mo5639e();
    }

    /* renamed from: g */
    public final float m86664g() {
        return this.f32130e;
    }

    /* renamed from: h */
    public final float m86663h(int i, boolean z) {
        int m81401a;
        m86672F(i);
        if (i == m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3784e().mo5627q(c52083yE3.m3773p(i), z);
    }

    /* renamed from: i */
    public final SW2 m86662i() {
        return this.f32126a;
    }

    /* renamed from: j */
    public final float m86661j() {
        Object last;
        if (!this.f32133h.isEmpty()) {
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f32133h);
            C52083yE3 c52083yE3 = (C52083yE3) last;
            return c52083yE3.m3775n(c52083yE3.m3784e().mo5625s());
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final float m86660k(int i) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3775n(c52083yE3.m3784e().mo5633k(c52083yE3.m3772q(i)));
    }

    /* renamed from: l */
    public final int m86659l() {
        return this.f32131f;
    }

    /* renamed from: m */
    public final int m86658m(int i, boolean z) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3777l(c52083yE3.m3784e().mo5636h(c52083yE3.m3772q(i), z));
    }

    /* renamed from: n */
    public final int m86657n(int i) {
        int m81401a;
        if (i >= m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else if (i < 0) {
            m81401a = 0;
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3776m(c52083yE3.m3784e().mo5623u(c52083yE3.m3773p(i)));
    }

    /* renamed from: o */
    public final int m86656o(float f) {
        int m81399c;
        if (f <= 0.0f) {
            m81399c = 0;
        } else if (f >= this.f32130e) {
            m81399c = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81399c = UW2.m81399c(this.f32133h, f);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81399c);
        if (c52083yE3.m3785d() == 0) {
            return Math.max(0, c52083yE3.m3783f() - 1);
        }
        return c52083yE3.m3776m(c52083yE3.m3784e().mo5635i(c52083yE3.m3771r(f)));
    }

    /* renamed from: p */
    public final float m86655p(int i) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3784e().mo5634j(c52083yE3.m3772q(i));
    }

    /* renamed from: q */
    public final float m86654q(int i) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3784e().mo5630n(c52083yE3.m3772q(i));
    }

    /* renamed from: r */
    public final int m86653r(int i) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3777l(c52083yE3.m3784e().mo5637g(c52083yE3.m3772q(i)));
    }

    /* renamed from: s */
    public final float m86652s(int i) {
        m86671G(i);
        C52083yE3 c52083yE3 = this.f32133h.get(UW2.m81400b(this.f32133h, i));
        return c52083yE3.m3775n(c52083yE3.m3784e().mo5641c(c52083yE3.m3772q(i)));
    }

    /* renamed from: t */
    public final int m86651t(long j) {
        int m81399c;
        if (C32120Ce3.m111943p(j) <= 0.0f) {
            m81399c = 0;
        } else if (C32120Ce3.m111943p(j) >= this.f32130e) {
            m81399c = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81399c = UW2.m81399c(this.f32133h, C32120Ce3.m111943p(j));
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81399c);
        if (c52083yE3.m3785d() == 0) {
            return Math.max(0, c52083yE3.m3783f() - 1);
        }
        return c52083yE3.m3777l(c52083yE3.m3784e().mo5638f(c52083yE3.m3774o(j)));
    }

    /* renamed from: u */
    public final UL4 m86650u(int i) {
        int m81401a;
        m86672F(i);
        if (i == m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3784e().mo5642b(c52083yE3.m3773p(i));
    }

    /* renamed from: v */
    public final List<C52083yE3> m86649v() {
        return this.f32133h;
    }

    /* renamed from: w */
    public final InterfaceC39067cJ3 m86648w(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if ((!z || i2 > m86670a().m110052j().length()) ? false : false) {
            if (i == i2) {
                return C28793td.m12007a();
            }
            InterfaceC39067cJ3 m12007a = C28793td.m12007a();
            int size = this.f32133h.size();
            for (int m81401a = UW2.m81401a(this.f32133h, i); m81401a < size; m81401a++) {
                C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
                if (c52083yE3.m3783f() >= i2) {
                    break;
                }
                if (c52083yE3.m3783f() != c52083yE3.m3787b()) {
                    InterfaceC39067cJ3.m61582e(m12007a, c52083yE3.m3780i(c52083yE3.m3784e().mo5628p(c52083yE3.m3773p(i), c52083yE3.m3773p(i2))), 0L, 2, null);
                }
            }
            return m12007a;
        }
        throw new IllegalArgumentException(("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + m86670a().m110052j().length() + "), or start > end!").toString());
    }

    /* renamed from: x */
    public final List<C35055Os4> m86647x() {
        return this.f32132g;
    }

    /* renamed from: y */
    public final float m86646y() {
        return this.f32129d;
    }

    /* renamed from: z */
    public final long m86645z(int i) {
        int m81401a;
        m86672F(i);
        if (i == m86670a().length()) {
            m81401a = CollectionsKt__CollectionsKt.getLastIndex(this.f32133h);
        } else {
            m81401a = UW2.m81401a(this.f32133h, i);
        }
        C52083yE3 c52083yE3 = this.f32133h.get(m81401a);
        return c52083yE3.m3778k(c52083yE3.m3784e().mo5640d(c52083yE3.m3773p(i)));
    }

    public RW2(SW2 sw2, long j, int i, boolean z) {
        boolean z2;
        int m28064m;
        int lastIndex;
        this.f32126a = sw2;
        this.f32127b = i;
        int i2 = 0;
        if (C44228kz0.m28061p(j) == 0 && C44228kz0.m28062o(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<C52676zE3> m85321f = sw2.m85321f();
            int size = m85321f.size();
            int i3 = 0;
            float f = 0.0f;
            int i4 = 0;
            while (i4 < size) {
                C52676zE3 c52676zE3 = m85321f.get(i4);
                AE3 m1610b = c52676zE3.m1610b();
                int m28063n = C44228kz0.m28063n(j);
                if (C44228kz0.m28068i(j)) {
                    m28064m = RangesKt___RangesKt.coerceAtLeast(C44228kz0.m28064m(j) - CE3.m112592d(f), i2);
                } else {
                    m28064m = C44228kz0.m28064m(j);
                }
                InterfaceC51490xE3 m112593c = CE3.m112593c(m1610b, C46007nz0.m22042b(0, m28063n, 0, m28064m, 5, null), this.f32127b - i3, z);
                float height = f + m112593c.getHeight();
                int mo5631m = i3 + m112593c.mo5631m();
                arrayList.add(new C52083yE3(m112593c, c52676zE3.m1609c(), c52676zE3.m1611a(), i3, mo5631m, f, height));
                if (!m112593c.mo5629o()) {
                    if (mo5631m == this.f32127b) {
                        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f32126a.m85321f());
                        if (i4 != lastIndex) {
                        }
                    }
                    i4++;
                    i3 = mo5631m;
                    f = height;
                    i2 = 0;
                }
                i3 = mo5631m;
                f = height;
                z2 = true;
                break;
            }
            z2 = false;
            this.f32130e = f;
            this.f32131f = i3;
            this.f32128c = z2;
            this.f32133h = arrayList;
            this.f32129d = C44228kz0.m28063n(j);
            List<C35055Os4> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C52083yE3 c52083yE3 = (C52083yE3) arrayList.get(i5);
                List<C35055Os4> mo5620x = c52083yE3.m3784e().mo5620x();
                ArrayList arrayList3 = new ArrayList(mo5620x.size());
                int size3 = mo5620x.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    C35055Os4 c35055Os4 = mo5620x.get(i6);
                    arrayList3.add(c35055Os4 != null ? c52083yE3.m3779j(c35055Os4) : null);
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.f32126a.m85320g().size()) {
                int size4 = this.f32126a.m85320g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add(null);
                }
                arrayList2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.f32132g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }
}
