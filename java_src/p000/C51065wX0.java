package p000;

import androidx.emoji2.text.C11581c;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\f"}, m28432d2 = {"LwX0;", "Lya1;", "LsP5;", "", "c", C17296a.f69688o, "LsP5;", "loadState", "()LsP5;", "fontLoaded", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51065wX0 implements InterfaceC52279ya1 {

    /* renamed from: a */
    public InterfaceC48627sP5<Boolean> f116122a;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0007"}, m28432d2 = {"wX0$a", "Landroidx/emoji2/text/c$f;", "", "b", "", "throwable", C17296a.f69688o, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wX0$a */
    /* loaded from: classes.dex */
    public static final class C29908a extends C11581c.AbstractC11588f {

        /* renamed from: a */
        public final /* synthetic */ EX2<Boolean> f116123a;

        /* renamed from: b */
        public final /* synthetic */ C51065wX0 f116124b;

        public C29908a(EX2<Boolean> ex2, C51065wX0 c51065wX0) {
            this.f116123a = ex2;
            this.f116124b = c51065wX0;
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: a */
        public void mo6704a(Throwable th) {
            OY1 oy1;
            C51065wX0 c51065wX0 = this.f116124b;
            oy1 = C52872za1.f121556a;
            c51065wX0.f116122a = oy1;
        }

        @Override // androidx.emoji2.text.C11581c.AbstractC11588f
        /* renamed from: b */
        public void mo6703b() {
            this.f116123a.setValue(Boolean.TRUE);
            this.f116124b.f116122a = new OY1(true);
        }
    }

    public C51065wX0() {
        InterfaceC48627sP5<Boolean> interfaceC48627sP5;
        if (C11581c.m67521k()) {
            interfaceC48627sP5 = m6705c();
        } else {
            interfaceC48627sP5 = null;
        }
        this.f116122a = interfaceC48627sP5;
    }

    @Override // p000.InterfaceC52279ya1
    /* renamed from: a */
    public InterfaceC48627sP5<Boolean> mo3251a() {
        OY1 oy1;
        InterfaceC48627sP5<Boolean> interfaceC48627sP5 = this.f116122a;
        if (interfaceC48627sP5 != null) {
            Intrinsics.checkNotNull(interfaceC48627sP5);
            return interfaceC48627sP5;
        } else if (C11581c.m67521k()) {
            InterfaceC48627sP5<Boolean> m6705c = m6705c();
            this.f116122a = m6705c;
            Intrinsics.checkNotNull(m6705c);
            return m6705c;
        } else {
            oy1 = C52872za1.f121556a;
            return oy1;
        }
    }

    /* renamed from: c */
    public final InterfaceC48627sP5<Boolean> m6705c() {
        EX2 m97025e;
        C11581c m67529c = C11581c.m67529c();
        Intrinsics.checkNotNullExpressionValue(m67529c, "get()");
        if (m67529c.m67525g() == 1) {
            return new OY1(true);
        }
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        m67529c.m67510v(new C29908a(m97025e, this));
        return m97025e;
    }
}
