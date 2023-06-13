package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC44199kw1;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010Bh\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010 \u001a\u00020\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b\u0012\b\b\u0002\u0010(\u001a\u00020#\u0012\b\b\u0002\u0010+\u001a\u00020)\u0012\u0006\u00100\u001a\u00020,\u0012\u0006\u00104\u001a\u000201\u0012\u0014\b\u0002\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070605ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J/\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010+\u001a\u00020)8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0010\u0010/R\u0017\u00104\u001a\u0002018\u0006¢\u0006\f\n\u0004\b*\u00102\u001a\u0004\b\u0016\u00103R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020706058\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R$\u0010B\u001a\u0004\u0018\u00010<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0011\u0010I\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010J\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001fR\u0014\u0010K\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006N"}, m28432d2 = {"LT06;", "", "Lpm2;", "layoutDirection", "", "o", "Lkz0;", "constraints", "Li26;", "prevResult", "m", "(JLpm2;Li26;)Li26;", "LRW2;", "p", "(JLpm2;)LRW2;", "LDf;", C17296a.f69688o, "LDf;", "l", "()LDf;", Entry.TYPE_TEXT, "LG26;", "b", "LG26;", "k", "()LG26;", "style", "", "c", "I", DateTokenConverter.CONVERTER_KEY, "()I", "maxLines", "f", "minLines", "", "e", "Z", "j", "()Z", "softWrap", "Ln26;", "h", "overflow", "Lg01;", "g", "Lg01;", "()Lg01;", "density", "Lkw1$b;", "Lkw1$b;", "()Lkw1$b;", "fontFamilyResolver", "", "LDf$b;", "LTU3;", "i", "Ljava/util/List;", "()Ljava/util/List;", "placeholders", "LSW2;", "LSW2;", "getParagraphIntrinsics$foundation_release", "()LSW2;", "setParagraphIntrinsics$foundation_release", "(LSW2;)V", "paragraphIntrinsics", "Lpm2;", "getIntrinsicsLayoutDirection$foundation_release", "()Lpm2;", "setIntrinsicsLayoutDirection$foundation_release", "(Lpm2;)V", "intrinsicsLayoutDirection", "minIntrinsicWidth", "maxIntrinsicWidth", "nonNullIntrinsics", "<init>", "(LDf;LG26;IIZILg01;Lkw1$b;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: T06 */
/* loaded from: classes.dex */
public final class T06 {

    /* renamed from: l */
    public static final C7631a f34610l = new C7631a(null);

    /* renamed from: a */
    public final C1577Df f34611a;

    /* renamed from: b */
    public final G26 f34612b;

    /* renamed from: c */
    public final int f34613c;

    /* renamed from: d */
    public final int f34614d;

    /* renamed from: e */
    public final boolean f34615e;

    /* renamed from: f */
    public final int f34616f;

    /* renamed from: g */
    public final InterfaceC41273g01 f34617g;

    /* renamed from: h */
    public final AbstractC44199kw1.InterfaceC25559b f34618h;

    /* renamed from: i */
    public final List<C1577Df.C1580b<TU3>> f34619i;

    /* renamed from: j */
    public SW2 f34620j;

    /* renamed from: k */
    public EnumC47065pm2 f34621k;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"LT06$a;", "", "Lme0;", "canvas", "Li26;", "textLayoutResult", "", C17296a.f69688o, "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: T06$a */
    /* loaded from: classes.dex */
    public static final class C7631a {
        public /* synthetic */ C7631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m84429a(InterfaceC45204me0 canvas, C42484i26 textLayoutResult) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            C46635p26.f103035a.m20022a(canvas, textLayoutResult);
        }

        private C7631a() {
        }
    }

    public /* synthetic */ T06(C1577Df c1577Df, G26 g26, int i, int i2, boolean z, int i3, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1577Df, g26, i, i2, z, i3, interfaceC41273g01, interfaceC25559b, list);
    }

    /* renamed from: n */
    public static /* synthetic */ C42484i26 m84432n(T06 t06, long j, EnumC47065pm2 enumC47065pm2, C42484i26 c42484i26, int i, Object obj) {
        if ((i & 4) != 0) {
            c42484i26 = null;
        }
        return t06.m84433m(j, enumC47065pm2, c42484i26);
    }

    /* renamed from: a */
    public final InterfaceC41273g01 m84445a() {
        return this.f34617g;
    }

    /* renamed from: b */
    public final AbstractC44199kw1.InterfaceC25559b m84444b() {
        return this.f34618h;
    }

    /* renamed from: c */
    public final int m84443c() {
        return V06.m80500a(m84439g().mo28727c());
    }

    /* renamed from: d */
    public final int m84442d() {
        return this.f34613c;
    }

    /* renamed from: e */
    public final int m84441e() {
        return V06.m80500a(m84439g().mo28729a());
    }

    /* renamed from: f */
    public final int m84440f() {
        return this.f34614d;
    }

    /* renamed from: g */
    public final SW2 m84439g() {
        SW2 sw2 = this.f34620j;
        if (sw2 != null) {
            return sw2;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: h */
    public final int m84438h() {
        return this.f34616f;
    }

    /* renamed from: i */
    public final List<C1577Df.C1580b<TU3>> m84437i() {
        return this.f34619i;
    }

    /* renamed from: j */
    public final boolean m84436j() {
        return this.f34615e;
    }

    /* renamed from: k */
    public final G26 m84435k() {
        return this.f34612b;
    }

    /* renamed from: l */
    public final C1577Df m84434l() {
        return this.f34611a;
    }

    /* renamed from: m */
    public final C42484i26 m84433m(long j, EnumC47065pm2 layoutDirection, C42484i26 c42484i26) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (c42484i26 != null && C40705f26.m42259a(c42484i26, this.f34611a, this.f34612b, this.f34619i, this.f34613c, this.f34615e, this.f34616f, this.f34617g, layoutDirection, this.f34618h, j)) {
            return c42484i26.m34607a(new C41298g26(c42484i26.m34597k().m40259j(), this.f34612b, c42484i26.m34597k().m40262g(), c42484i26.m34597k().m40264e(), c42484i26.m34597k().m40261h(), c42484i26.m34597k().m40263f(), c42484i26.m34597k().m40267b(), c42484i26.m34597k().m40265d(), c42484i26.m34597k().m40266c(), j, (DefaultConstructorMarker) null), C46007nz0.m22040d(j, H52.m104430a(V06.m80500a(c42484i26.m34586v().m86646y()), V06.m80500a(c42484i26.m34586v().m86664g()))));
        }
        RW2 m84430p = m84430p(j, layoutDirection);
        return new C42484i26(new C41298g26(this.f34611a, this.f34612b, this.f34619i, this.f34613c, this.f34615e, this.f34616f, this.f34617g, layoutDirection, this.f34618h, j, (DefaultConstructorMarker) null), m84430p, C46007nz0.m22040d(j, H52.m104430a(V06.m80500a(m84430p.m86646y()), V06.m80500a(m84430p.m86664g()))), null);
    }

    /* renamed from: o */
    public final void m84431o(EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        SW2 sw2 = this.f34620j;
        if (sw2 == null || layoutDirection != this.f34621k || sw2.mo28728b()) {
            this.f34621k = layoutDirection;
            sw2 = new SW2(this.f34611a, H26.m104477d(this.f34612b, layoutDirection), this.f34619i, this.f34617g, this.f34618h);
        }
        this.f34620j = sw2;
    }

    /* renamed from: p */
    public final RW2 m84430p(long j, EnumC47065pm2 enumC47065pm2) {
        boolean z;
        int i;
        m84431o(enumC47065pm2);
        int m28061p = C44228kz0.m28061p(j);
        boolean z2 = false;
        int i2 = 1;
        if (!this.f34615e && !C45449n26.m24543e(this.f34616f, C45449n26.f99264a.m24539b())) {
            z = false;
        } else {
            z = true;
        }
        if (z && C44228kz0.m28067j(j)) {
            i = C44228kz0.m28063n(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!this.f34615e && C45449n26.m24543e(this.f34616f, C45449n26.f99264a.m24539b())) {
            z2 = true;
        }
        if (!z2) {
            i2 = this.f34613c;
        }
        int i3 = i2;
        if (m28061p != i) {
            i = RangesKt___RangesKt.coerceIn(m84443c(), m28061p, i);
        }
        return new RW2(m84439g(), C46007nz0.m22042b(0, i, 0, C44228kz0.m28064m(j), 5, null), i3, C45449n26.m24543e(this.f34616f, C45449n26.f99264a.m24539b()), null);
    }

    public T06(C1577Df c1577Df, G26 g26, int i, int i2, boolean z, int i3, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, List<C1577Df.C1580b<TU3>> list) {
        this.f34611a = c1577Df;
        this.f34612b = g26;
        this.f34613c = i;
        this.f34614d = i2;
        this.f34615e = z;
        this.f34616f = i3;
        this.f34617g = interfaceC41273g01;
        this.f34618h = interfaceC25559b;
        this.f34619i = list;
        if (!(i > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i2 > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i2 <= i)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ T06(C1577Df c1577Df, G26 g26, int i, int i2, boolean z, int i3, InterfaceC41273g01 interfaceC41273g01, AbstractC44199kw1.InterfaceC25559b interfaceC25559b, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1577Df, g26, r5, r6, r7, r8, interfaceC41273g01, interfaceC25559b, r11, null);
        List list2;
        List emptyList;
        int i5 = (i4 & 4) != 0 ? Integer.MAX_VALUE : i;
        int i6 = (i4 & 8) != 0 ? 1 : i2;
        boolean z2 = (i4 & 16) != 0 ? true : z;
        int m24540a = (i4 & 32) != 0 ? C45449n26.f99264a.m24540a() : i3;
        if ((i4 & 256) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list2 = emptyList;
        } else {
            list2 = list;
        }
    }
}
