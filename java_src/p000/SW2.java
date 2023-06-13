package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC44199kw1;
import p000.C1577Df;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020!\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001f¨\u0006("}, m28432d2 = {"LSW2;", "LAE3;", "LDE3;", "style", "defaultStyle", "h", "LDf;", C17296a.f69688o, "LDf;", "e", "()LDf;", "annotatedString", "", "LDf$b;", "LTU3;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "placeholders", "", "c", "Lkotlin/Lazy;", "()F", "minIntrinsicWidth", DateTokenConverter.CONVERTER_KEY, "maxIntrinsicWidth", "LzE3;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "LG26;", "Lg01;", "density", "Lkw1$b;", "fontFamilyResolver", "<init>", "(LDf;LG26;Ljava/util/List;Lg01;Lkw1$b;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n803#2:153\n804#2,5:162\n151#3,3:154\n33#3,4:157\n154#3:161\n155#3:167\n38#3:168\n156#3:169\n101#3,2:170\n33#3,6:172\n103#3:178\n1#4:179\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n95#1:153\n95#1:162,5\n95#1:154,3\n95#1:157,4\n95#1:161\n95#1:167\n95#1:168\n95#1:169\n120#1:170,2\n120#1:172,6\n120#1:178\n*E\n"})
/* renamed from: SW2 */
/* loaded from: classes.dex */
public final class SW2 implements AE3 {

    /* renamed from: a */
    public final C1577Df f33828a;

    /* renamed from: b */
    public final List<C1577Df.C1580b<TU3>> f33829b;

    /* renamed from: c */
    public final Lazy f33830c;

    /* renamed from: d */
    public final Lazy f33831d;

    /* renamed from: e */
    public final List<C52676zE3> f33832e;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n171#2,13:153\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n*L\n81#1:153,13\n*E\n"})
    /* renamed from: SW2$a */
    /* loaded from: classes.dex */
    public static final class C7466a extends Lambda implements Function0<Float> {
        public C7466a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            int lastIndex;
            C52676zE3 c52676zE3;
            float f;
            AE3 m1610b;
            List<C52676zE3> m85321f = SW2.this.m85321f();
            if (m85321f.isEmpty()) {
                c52676zE3 = null;
            } else {
                C52676zE3 c52676zE32 = m85321f.get(0);
                float mo28727c = c52676zE32.m1610b().mo28727c();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(m85321f);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        C52676zE3 c52676zE33 = m85321f.get(i);
                        float mo28727c2 = c52676zE33.m1610b().mo28727c();
                        if (Float.compare(mo28727c, mo28727c2) < 0) {
                            c52676zE32 = c52676zE33;
                            mo28727c = mo28727c2;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                c52676zE3 = c52676zE32;
            }
            C52676zE3 c52676zE34 = c52676zE3;
            if (c52676zE34 != null && (m1610b = c52676zE34.m1610b()) != null) {
                f = m1610b.mo28727c();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "b", "()Ljava/lang/Float;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n171#2,13:153\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n75#1:153,13\n*E\n"})
    /* renamed from: SW2$b */
    /* loaded from: classes.dex */
    public static final class C7467b extends Lambda implements Function0<Float> {
        public C7467b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Float invoke() {
            int lastIndex;
            C52676zE3 c52676zE3;
            float f;
            AE3 m1610b;
            List<C52676zE3> m85321f = SW2.this.m85321f();
            if (m85321f.isEmpty()) {
                c52676zE3 = null;
            } else {
                C52676zE3 c52676zE32 = m85321f.get(0);
                float mo28729a = c52676zE32.m1610b().mo28729a();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(m85321f);
                int i = 1;
                if (1 <= lastIndex) {
                    while (true) {
                        C52676zE3 c52676zE33 = m85321f.get(i);
                        float mo28729a2 = c52676zE33.m1610b().mo28729a();
                        if (Float.compare(mo28729a, mo28729a2) < 0) {
                            c52676zE32 = c52676zE33;
                            mo28729a = mo28729a2;
                        }
                        if (i == lastIndex) {
                            break;
                        }
                        i++;
                    }
                }
                c52676zE3 = c52676zE32;
            }
            C52676zE3 c52676zE34 = c52676zE3;
            if (c52676zE34 != null && (m1610b = c52676zE34.m1610b()) != null) {
                f = m1610b.mo28729a();
            } else {
                f = 0.0f;
            }
            return Float.valueOf(f);
        }
    }

    public SW2(C1577Df c1577Df, G26 style, List<C1577Df.C1580b<TU3>> placeholders, InterfaceC41273g01 density, AbstractC44199kw1.InterfaceC25559b fontFamilyResolver) {
        Lazy lazy;
        Lazy lazy2;
        C1577Df m108599n;
        List m83489b;
        C1577Df annotatedString = c1577Df;
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f33828a = annotatedString;
        this.f33829b = placeholders;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C7467b());
        this.f33830c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new C7466a());
        this.f33831d = lazy2;
        DE3 m105926K = style.m105926K();
        List<C1577Df.C1580b<DE3>> m108600m = C1921Ef.m108600m(annotatedString, m105926K);
        ArrayList arrayList = new ArrayList(m108600m.size());
        int size = m108600m.size();
        int i = 0;
        while (i < size) {
            C1577Df.C1580b<DE3> c1580b = m108600m.get(i);
            m108599n = C1921Ef.m108599n(annotatedString, c1580b.m110027f(), c1580b.m110029d());
            DE3 m85319h = m85319h(c1580b.m110028e(), m105926K);
            String m110052j = m108599n.m110052j();
            G26 m105928I = style.m105928I(m85319h);
            List<C1577Df.C1580b<GN5>> m110056f = m108599n.m110056f();
            m83489b = TW2.m83489b(m85320g(), c1580b.m110027f(), c1580b.m110029d());
            arrayList.add(new C52676zE3(BE3.m114196a(m110052j, m105928I, m110056f, m83489b, density, fontFamilyResolver), c1580b.m110027f(), c1580b.m110029d()));
            i++;
            annotatedString = c1577Df;
        }
        this.f33832e = arrayList;
    }

    @Override // p000.AE3
    /* renamed from: a */
    public float mo28729a() {
        return ((Number) this.f33830c.getValue()).floatValue();
    }

    @Override // p000.AE3
    /* renamed from: b */
    public boolean mo28728b() {
        List<C52676zE3> list = this.f33832e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).m1610b().mo28728b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.AE3
    /* renamed from: c */
    public float mo28727c() {
        return ((Number) this.f33831d.getValue()).floatValue();
    }

    /* renamed from: e */
    public final C1577Df m85322e() {
        return this.f33828a;
    }

    /* renamed from: f */
    public final List<C52676zE3> m85321f() {
        return this.f33832e;
    }

    /* renamed from: g */
    public final List<C1577Df.C1580b<TU3>> m85320g() {
        return this.f33829b;
    }

    /* renamed from: h */
    public final DE3 m85319h(DE3 de3, DE3 de32) {
        W06 m110650l = de3.m110650l();
        if (m110650l != null) {
            m110650l.m78947l();
            return de3;
        }
        return DE3.m110660b(de3, null, de32.m110650l(), 0L, null, null, null, null, null, 253, null);
    }
}
