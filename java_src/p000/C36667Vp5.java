package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001cR$\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0014\u0010\u001b\"\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LVp5;", "LlD3;", "", "b", "I", DateTokenConverter.CONVERTER_KEY, "()I", "semanticsNodeId", "", "c", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "allScopes", "", "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "oldXValue", "e", "h", "oldYValue", "LQp5;", "f", "LQp5;", C17296a.f69688o, "()LQp5;", "(LQp5;)V", "horizontalScrollAxisRange", "i", "verticalScrollAxisRange", "", "L", "()Z", "isValidOwnerScope", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LQp5;LQp5;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36667Vp5 implements InterfaceC44367lD3 {

    /* renamed from: b */
    public final int f39803b;

    /* renamed from: c */
    public final List<C36667Vp5> f39804c;

    /* renamed from: d */
    public Float f39805d;

    /* renamed from: e */
    public Float f39806e;

    /* renamed from: f */
    public C35497Qp5 f39807f;

    /* renamed from: g */
    public C35497Qp5 f39808g;

    public C36667Vp5(int i, List<C36667Vp5> allScopes, Float f, Float f2, C35497Qp5 c35497Qp5, C35497Qp5 c35497Qp52) {
        Intrinsics.checkNotNullParameter(allScopes, "allScopes");
        this.f39803b = i;
        this.f39804c = allScopes;
        this.f39805d = f;
        this.f39806e = f2;
        this.f39807f = c35497Qp5;
        this.f39808g = c35497Qp52;
    }

    @Override // p000.InterfaceC44367lD3
    /* renamed from: L */
    public boolean mo14142L() {
        return this.f39804c.contains(this);
    }

    /* renamed from: a */
    public final C35497Qp5 m79392a() {
        return this.f39807f;
    }

    /* renamed from: b */
    public final Float m79391b() {
        return this.f39805d;
    }

    /* renamed from: c */
    public final Float m79390c() {
        return this.f39806e;
    }

    /* renamed from: d */
    public final int m79389d() {
        return this.f39803b;
    }

    /* renamed from: e */
    public final C35497Qp5 m79388e() {
        return this.f39808g;
    }

    /* renamed from: f */
    public final void m79387f(C35497Qp5 c35497Qp5) {
        this.f39807f = c35497Qp5;
    }

    /* renamed from: g */
    public final void m79386g(Float f) {
        this.f39805d = f;
    }

    /* renamed from: h */
    public final void m79385h(Float f) {
        this.f39806e = f;
    }

    /* renamed from: i */
    public final void m79384i(C35497Qp5 c35497Qp5) {
        this.f39808g = c35497Qp5;
    }
}
