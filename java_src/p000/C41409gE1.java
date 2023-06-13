package p000;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\f\u0010\r\u001a\u00020\u0005*\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002R!\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R:\u00103\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010/2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010/8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b\u0006\u00100\u001a\u0004\b\u0013\u00101\"\u0004\b\u001d\u00102R*\u00108\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b$\u00105\"\u0004\b6\u00107R*\u0010?\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010B\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R*\u0010E\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R*\u0010H\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R*\u0010K\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010:\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R*\u0010N\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010:\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R*\u0010Q\u001a\u0002092\u0006\u0010\u001c\u001a\u0002098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010:\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\u0016\u0010R\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010%R\u0011\u0010T\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010SR\u0014\u0010V\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010U\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, m28432d2 = {"LgE1;", "LVi6;", "", "index", "instance", "", "h", "from", "to", "count", "i", "j", "LI61;", C17296a.f69688o, "", "toString", "t", "u", "LhN2;", "b", "[F", "groupMatrix", "", "c", "Ljava/util/List;", "children", "", "LpJ3;", "value", DateTokenConverter.CONVERTER_KEY, "getClipPathData", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "clipPathData", "", "e", "Z", "isClipPathDirty", "LcJ3;", "f", "LcJ3;", "clipPath", "LsJ3;", "g", "LsJ3;", "parser", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "invalidateListener", "Ljava/lang/String;", "()Ljava/lang/String;", "l", "(Ljava/lang/String;)V", "name", "", "F", "getRotation", "()F", "o", "(F)V", "rotation", "getPivotX", "m", "pivotX", "getPivotY", "n", "pivotY", "getScaleX", "p", "scaleX", "getScaleY", "q", "scaleY", "getTranslationX", "r", "translationX", "getTranslationY", "s", "translationY", "isMatrixDirty", "()I", "numChildren", "()Z", "willClipPath", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n33#2,6:556\n33#2,6:571\n33#2,6:580\n261#3,7:562\n268#3:570\n269#3,3:577\n1#4:569\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/GroupComponent\n*L\n374#1:556,6\n536#1:571,6\n549#1:580,6\n529#1:562,7\n529#1:570\n529#1:577,3\n*E\n"})
/* renamed from: gE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41409gE1 extends AbstractC36605Vi6 {

    /* renamed from: b */
    public float[] f81791b;

    /* renamed from: c */
    public final List<AbstractC36605Vi6> f81792c;

    /* renamed from: d */
    public List<? extends AbstractC46793pJ3> f81793d;

    /* renamed from: e */
    public boolean f81794e;

    /* renamed from: f */
    public InterfaceC39067cJ3 f81795f;

    /* renamed from: g */
    public C48571sJ3 f81796g;

    /* renamed from: h */
    public Function0<Unit> f81797h;

    /* renamed from: i */
    public String f81798i;

    /* renamed from: j */
    public float f81799j;

    /* renamed from: k */
    public float f81800k;

    /* renamed from: l */
    public float f81801l;

    /* renamed from: m */
    public float f81802m;

    /* renamed from: n */
    public float f81803n;

    /* renamed from: o */
    public float f81804o;

    /* renamed from: p */
    public float f81805p;

    /* renamed from: q */
    public boolean f81806q;

    public C41409gE1() {
        super(null);
        this.f81792c = new ArrayList();
        this.f81793d = C39934dk6.m43807e();
        this.f81794e = true;
        this.f81798i = "";
        this.f81802m = 1.0f;
        this.f81803n = 1.0f;
        this.f81806q = true;
    }

    @Override // p000.AbstractC36605Vi6
    /* renamed from: a */
    public void mo39843a(I61 i61) {
        Intrinsics.checkNotNullParameter(i61, "<this>");
        if (this.f81806q) {
            m39824u();
            this.f81806q = false;
        }
        if (this.f81794e) {
            m39825t();
            this.f81794e = false;
        }
        C61 mo20750d0 = i61.mo20750d0();
        long mo20721h = mo20750d0.mo20721h();
        mo20750d0.mo20724a().mo25245v();
        L61 mo20722c = mo20750d0.mo20722c();
        float[] fArr = this.f81791b;
        if (fArr != null) {
            mo20722c.mo19022h(C42084hN2.m36496a(fArr).m36483n());
        }
        InterfaceC39067cJ3 interfaceC39067cJ3 = this.f81795f;
        if (m39838g() && interfaceC39067cJ3 != null) {
            L61.m97774i(mo20722c, interfaceC39067cJ3, 0, 2, null);
        }
        List<AbstractC36605Vi6> list = this.f81792c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo39843a(i61);
        }
        mo20750d0.mo20724a().mo25251p();
        mo20750d0.mo20723b(mo20721h);
    }

    @Override // p000.AbstractC36605Vi6
    /* renamed from: b */
    public Function0<Unit> mo39842b() {
        return this.f81797h;
    }

    @Override // p000.AbstractC36605Vi6
    /* renamed from: d */
    public void mo39841d(Function0<Unit> function0) {
        this.f81797h = function0;
        List<AbstractC36605Vi6> list = this.f81792c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo39841d(function0);
        }
    }

    /* renamed from: e */
    public final String m39840e() {
        return this.f81798i;
    }

    /* renamed from: f */
    public final int m39839f() {
        return this.f81792c.size();
    }

    /* renamed from: g */
    public final boolean m39838g() {
        return !this.f81793d.isEmpty();
    }

    /* renamed from: h */
    public final void m39837h(int i, AbstractC36605Vi6 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (i < m39839f()) {
            this.f81792c.set(i, instance);
        } else {
            this.f81792c.add(instance);
        }
        instance.mo39841d(mo39842b());
        m79536c();
    }

    /* renamed from: i */
    public final void m39836i(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                this.f81792c.remove(i);
                this.f81792c.add(i2, this.f81792c.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                this.f81792c.remove(i);
                this.f81792c.add(i2 - 1, this.f81792c.get(i));
                i4++;
            }
        }
        m79536c();
    }

    /* renamed from: j */
    public final void m39835j(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.f81792c.size()) {
                this.f81792c.get(i).mo39841d(null);
                this.f81792c.remove(i);
            }
        }
        m79536c();
    }

    /* renamed from: k */
    public final void m39834k(List<? extends AbstractC46793pJ3> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f81793d = value;
        this.f81794e = true;
        m79536c();
    }

    /* renamed from: l */
    public final void m39833l(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f81798i = value;
        m79536c();
    }

    /* renamed from: m */
    public final void m39832m(float f) {
        this.f81800k = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: n */
    public final void m39831n(float f) {
        this.f81801l = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: o */
    public final void m39830o(float f) {
        this.f81799j = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: p */
    public final void m39829p(float f) {
        this.f81802m = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: q */
    public final void m39828q(float f) {
        this.f81803n = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: r */
    public final void m39827r(float f) {
        this.f81804o = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: s */
    public final void m39826s(float f) {
        this.f81805p = f;
        this.f81806q = true;
        m79536c();
    }

    /* renamed from: t */
    public final void m39825t() {
        if (m39838g()) {
            C48571sJ3 c48571sJ3 = this.f81796g;
            if (c48571sJ3 == null) {
                c48571sJ3 = new C48571sJ3();
                this.f81796g = c48571sJ3;
            } else {
                c48571sJ3.m14435e();
            }
            InterfaceC39067cJ3 interfaceC39067cJ3 = this.f81795f;
            if (interfaceC39067cJ3 == null) {
                interfaceC39067cJ3 = C28793td.m12007a();
                this.f81795f = interfaceC39067cJ3;
            } else {
                interfaceC39067cJ3.reset();
            }
            c48571sJ3.m14438b(this.f81793d).m14442D(interfaceC39067cJ3);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f81798i);
        List<AbstractC36605Vi6> list = this.f81792c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void m39824u() {
        float[] fArr = this.f81791b;
        if (fArr == null) {
            fArr = C42084hN2.m36494c(null, 1, null);
            this.f81791b = fArr;
        } else {
            C42084hN2.m36489h(fArr);
        }
        C42084hN2.m36484m(fArr, this.f81800k + this.f81804o, this.f81801l + this.f81805p, 0.0f, 4, null);
        C42084hN2.m36488i(fArr, this.f81799j);
        C42084hN2.m36487j(fArr, this.f81802m, this.f81803n, 1.0f);
        C42084hN2.m36484m(fArr, -this.f81800k, -this.f81801l, 0.0f, 4, null);
    }
}
