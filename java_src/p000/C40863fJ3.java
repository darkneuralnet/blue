package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\u0010\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010 \u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R3\u00100\u001a\u00020*2\u0006\u0010\t\u001a\u00020*8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00103\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR*\u00106\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR.\u00109\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017R3\u0010=\u001a\u00020:2\u0006\u0010\t\u001a\u00020:8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R3\u0010A\u001a\u00020>2\u0006\u0010\t\u001a\u00020>8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b?\u0010-\"\u0004\b@\u0010/R*\u0010D\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001b\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR*\u0010G\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001b\u001a\u0004\bE\u0010\u001d\"\u0004\bF\u0010\u001fR*\u0010J\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001b\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010\u001fR*\u0010M\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001b\u001a\u0004\bK\u0010\u001d\"\u0004\bL\u0010\u001fR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010OR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010OR\u0016\u0010R\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010OR\u0018\u0010U\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010WR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b#\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, m28432d2 = {"LfJ3;", "LVi6;", "", "t", "u", "LI61;", C17296a.f69688o, "", "toString", "value", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "h", "(Ljava/lang/String;)V", "name", "La30;", "c", "La30;", "getFill", "()La30;", "f", "(La30;)V", "fill", "", DateTokenConverter.CONVERTER_KEY, "F", "getFillAlpha", "()F", "g", "(F)V", "fillAlpha", "", "LpJ3;", "e", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "i", "(Ljava/util/List;)V", "pathData", "LjJ3;", "I", "getPathFillType-Rg-k1Os", "()I", "j", "(I)V", "pathFillType", "getStrokeAlpha", "l", "strokeAlpha", "getStrokeLineWidth", "p", "strokeLineWidth", "getStroke", "k", "stroke", "LLS5;", "getStrokeLineCap-KaPHkGw", "m", "strokeLineCap", "LNS5;", "getStrokeLineJoin-LxFBmk8", "n", "strokeLineJoin", "getStrokeLineMiter", "o", "strokeLineMiter", "getTrimPathStart", "s", "trimPathStart", "getTrimPathEnd", "q", "trimPathEnd", "getTrimPathOffset", "r", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "LKS5;", "LKS5;", "strokeStyle", "LcJ3;", "LcJ3;", "path", "renderPath", "LoJ3;", "v", "Lkotlin/Lazy;", "()LoJ3;", "pathMeasure", "LsJ3;", "w", "LsJ3;", "parser", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
/* renamed from: fJ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40863fJ3 extends AbstractC36605Vi6 {

    /* renamed from: b */
    public String f79837b;

    /* renamed from: c */
    public AbstractC37727a30 f79838c;

    /* renamed from: d */
    public float f79839d;

    /* renamed from: e */
    public List<? extends AbstractC46793pJ3> f79840e;

    /* renamed from: f */
    public int f79841f;

    /* renamed from: g */
    public float f79842g;

    /* renamed from: h */
    public float f79843h;

    /* renamed from: i */
    public AbstractC37727a30 f79844i;

    /* renamed from: j */
    public int f79845j;

    /* renamed from: k */
    public int f79846k;

    /* renamed from: l */
    public float f79847l;

    /* renamed from: m */
    public float f79848m;

    /* renamed from: n */
    public float f79849n;

    /* renamed from: o */
    public float f79850o;

    /* renamed from: p */
    public boolean f79851p;

    /* renamed from: q */
    public boolean f79852q;

    /* renamed from: r */
    public boolean f79853r;

    /* renamed from: s */
    public KS5 f79854s;

    /* renamed from: t */
    public final InterfaceC39067cJ3 f79855t;

    /* renamed from: u */
    public final InterfaceC39067cJ3 f79856u;

    /* renamed from: v */
    public final Lazy f79857v;

    /* renamed from: w */
    public final C48571sJ3 f79858w;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LoJ3;", "b", "()LoJ3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: fJ3$a */
    /* loaded from: classes.dex */
    public static final class C20353a extends Lambda implements Function0<InterfaceC46200oJ3> {

        /* renamed from: g */
        public static final C20353a f79859g = new C20353a();

        public C20353a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC46200oJ3 invoke() {
            return C28362sd.m13937a();
        }
    }

    public C40863fJ3() {
        super(null);
        Lazy lazy;
        this.f79837b = "";
        this.f79839d = 1.0f;
        this.f79840e = C39934dk6.m43807e();
        this.f79841f = C39934dk6.m43810b();
        this.f79842g = 1.0f;
        this.f79845j = C39934dk6.m43809c();
        this.f79846k = C39934dk6.m43808d();
        this.f79847l = 4.0f;
        this.f79849n = 1.0f;
        this.f79851p = true;
        this.f79852q = true;
        this.f79853r = true;
        this.f79855t = C28793td.m12007a();
        this.f79856u = C28793td.m12007a();
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C20353a.f79859g);
        this.f79857v = lazy;
        this.f79858w = new C48571sJ3();
    }

    @Override // p000.AbstractC36605Vi6
    /* renamed from: a */
    public void mo39843a(I61 i61) {
        Intrinsics.checkNotNullParameter(i61, "<this>");
        if (this.f79851p) {
            m41574t();
        } else if (this.f79853r) {
            m41573u();
        }
        this.f79851p = false;
        this.f79853r = false;
        AbstractC37727a30 abstractC37727a30 = this.f79838c;
        if (abstractC37727a30 != null) {
            I61.m102954J0(i61, this.f79856u, abstractC37727a30, this.f79839d, null, null, 0, 56, null);
        }
        AbstractC37727a30 abstractC37727a302 = this.f79844i;
        if (abstractC37727a302 != null) {
            KS5 ks5 = this.f79854s;
            if (this.f79852q || ks5 == null) {
                ks5 = new KS5(this.f79843h, this.f79847l, this.f79845j, this.f79846k, null, 16, null);
                this.f79854s = ks5;
                this.f79852q = false;
            }
            I61.m102954J0(i61, this.f79856u, abstractC37727a302, this.f79842g, ks5, null, 0, 48, null);
        }
    }

    /* renamed from: e */
    public final InterfaceC46200oJ3 m41589e() {
        return (InterfaceC46200oJ3) this.f79857v.getValue();
    }

    /* renamed from: f */
    public final void m41588f(AbstractC37727a30 abstractC37727a30) {
        this.f79838c = abstractC37727a30;
        m79536c();
    }

    /* renamed from: g */
    public final void m41587g(float f) {
        this.f79839d = f;
        m79536c();
    }

    /* renamed from: h */
    public final void m41586h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79837b = value;
        m79536c();
    }

    /* renamed from: i */
    public final void m41585i(List<? extends AbstractC46793pJ3> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79840e = value;
        this.f79851p = true;
        m79536c();
    }

    /* renamed from: j */
    public final void m41584j(int i) {
        this.f79841f = i;
        this.f79856u.mo20777n(i);
        m79536c();
    }

    /* renamed from: k */
    public final void m41583k(AbstractC37727a30 abstractC37727a30) {
        this.f79844i = abstractC37727a30;
        m79536c();
    }

    /* renamed from: l */
    public final void m41582l(float f) {
        this.f79842g = f;
        m79536c();
    }

    /* renamed from: m */
    public final void m41581m(int i) {
        this.f79845j = i;
        this.f79852q = true;
        m79536c();
    }

    /* renamed from: n */
    public final void m41580n(int i) {
        this.f79846k = i;
        this.f79852q = true;
        m79536c();
    }

    /* renamed from: o */
    public final void m41579o(float f) {
        this.f79847l = f;
        this.f79852q = true;
        m79536c();
    }

    /* renamed from: p */
    public final void m41578p(float f) {
        this.f79843h = f;
        m79536c();
    }

    /* renamed from: q */
    public final void m41577q(float f) {
        boolean z;
        if (this.f79849n == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f79849n = f;
            this.f79853r = true;
            m79536c();
        }
    }

    /* renamed from: r */
    public final void m41576r(float f) {
        boolean z;
        if (this.f79850o == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f79850o = f;
            this.f79853r = true;
            m79536c();
        }
    }

    /* renamed from: s */
    public final void m41575s(float f) {
        boolean z;
        if (this.f79848m == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f79848m = f;
            this.f79853r = true;
            m79536c();
        }
    }

    /* renamed from: t */
    public final void m41574t() {
        this.f79858w.m14435e();
        this.f79855t.reset();
        this.f79858w.m14438b(this.f79840e).m14442D(this.f79855t);
        m41573u();
    }

    public String toString() {
        return this.f79855t.toString();
    }

    /* renamed from: u */
    public final void m41573u() {
        boolean z;
        boolean z2;
        this.f79856u.reset();
        if (this.f79848m == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f79849n == 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                InterfaceC39067cJ3.m61582e(this.f79856u, this.f79855t, 0L, 2, null);
                return;
            }
        }
        m41589e().mo15694b(this.f79855t, false);
        float mo15695a = m41589e().mo15695a();
        float f = this.f79848m;
        float f2 = this.f79850o;
        float f3 = ((f + f2) % 1.0f) * mo15695a;
        float f4 = ((this.f79849n + f2) % 1.0f) * mo15695a;
        if (f3 > f4) {
            m41589e().mo15693c(f3, mo15695a, this.f79856u, true);
            m41589e().mo15693c(0.0f, f4, this.f79856u, true);
            return;
        }
        m41589e().mo15693c(f3, f4, this.f79856u, true);
    }
}
