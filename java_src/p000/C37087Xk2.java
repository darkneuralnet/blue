package p000;

import androidx.compose.p003ui.focus.C11299c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.FY1;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"LXk2;", "LYk2;", "LFY1;", "imeAction", "", DateTokenConverter.CONVERTER_KEY, "(I)V", C17296a.f69688o, "LZk2;", "LZk2;", "c", "()LZk2;", "g", "(LZk2;)V", "keyboardActions", "LBv1;", "b", "LBv1;", "()LBv1;", "e", "(LBv1;)V", "focusManager", "La26;", "La26;", "getInputSession", "()La26;", "f", "(La26;)V", "inputSession", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xk2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37087Xk2 implements InterfaceC37321Yk2 {

    /* renamed from: a */
    public C37555Zk2 f43783a;

    /* renamed from: b */
    public InterfaceC32037Bv1 f43784b;

    /* renamed from: c */
    public C37723a26 f43785c;

    /* renamed from: a */
    public void m76488a(int i) {
        boolean m107007l;
        boolean m107007l2;
        FY1.C2347a c2347a = FY1.f9619b;
        if (FY1.m107007l(i, c2347a.m107000d())) {
            m76487b().mo68851i(C11299c.f52961b.m68803e());
        } else if (FY1.m107007l(i, c2347a.m106998f())) {
            m76487b().mo68851i(C11299c.f52961b.m68802f());
        } else if (FY1.m107007l(i, c2347a.m107002b())) {
            C37723a26 c37723a26 = this.f43785c;
            if (c37723a26 != null) {
                c37723a26.m71962b();
            }
        } else {
            boolean z = true;
            if (FY1.m107007l(i, c2347a.m107001c())) {
                m107007l = true;
            } else {
                m107007l = FY1.m107007l(i, c2347a.m106997g());
            }
            if (m107007l) {
                m107007l2 = true;
            } else {
                m107007l2 = FY1.m107007l(i, c2347a.m106996h());
            }
            if (!m107007l2) {
                z = FY1.m107007l(i, c2347a.m107003a());
            }
            if (!z) {
                FY1.m107007l(i, c2347a.m106999e());
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC32037Bv1 m76487b() {
        InterfaceC32037Bv1 interfaceC32037Bv1 = this.f43784b;
        if (interfaceC32037Bv1 != null) {
            return interfaceC32037Bv1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    /* renamed from: c */
    public final C37555Zk2 m76486c() {
        C37555Zk2 c37555Zk2 = this.f43783a;
        if (c37555Zk2 != null) {
            return c37555Zk2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* renamed from: d */
    public final void m76485d(int i) {
        boolean m107007l;
        Function1<InterfaceC37321Yk2, Unit> function1;
        FY1.C2347a c2347a = FY1.f9619b;
        Unit unit = null;
        if (FY1.m107007l(i, c2347a.m107002b())) {
            function1 = m76486c().m72593b();
        } else if (FY1.m107007l(i, c2347a.m107001c())) {
            function1 = m76486c().m72592c();
        } else if (FY1.m107007l(i, c2347a.m107000d())) {
            function1 = m76486c().m72591d();
        } else if (FY1.m107007l(i, c2347a.m106998f())) {
            function1 = m76486c().m72590e();
        } else if (FY1.m107007l(i, c2347a.m106997g())) {
            function1 = m76486c().m72589f();
        } else if (FY1.m107007l(i, c2347a.m106996h())) {
            function1 = m76486c().m72588g();
        } else {
            if (FY1.m107007l(i, c2347a.m107003a())) {
                m107007l = true;
            } else {
                m107007l = FY1.m107007l(i, c2347a.m106999e());
            }
            if (m107007l) {
                function1 = null;
            } else {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        if (function1 != null) {
            function1.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m76488a(i);
        }
    }

    /* renamed from: e */
    public final void m76484e(InterfaceC32037Bv1 interfaceC32037Bv1) {
        Intrinsics.checkNotNullParameter(interfaceC32037Bv1, "<set-?>");
        this.f43784b = interfaceC32037Bv1;
    }

    /* renamed from: f */
    public final void m76483f(C37723a26 c37723a26) {
        this.f43785c = c37723a26;
    }

    /* renamed from: g */
    public final void m76482g(C37555Zk2 c37555Zk2) {
        Intrinsics.checkNotNullParameter(c37555Zk2, "<set-?>");
        this.f43783a = c37555Zk2;
    }
}
