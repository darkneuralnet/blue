package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, m28432d2 = {"LKq;", "LnV5$c;", "LnV5$b;", "configuration", "LJq;", "b", C17296a.f69688o, "LnV5$c;", "delegate", "LIq;", "LIq;", "autoCloser", "<init>", "(LnV5$c;LIq;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Kq */
/* loaded from: classes.dex */
public final class C4603Kq implements InterfaceC45717nV5.InterfaceC26536c {

    /* renamed from: a */
    public final InterfaceC45717nV5.InterfaceC26536c f20267a;

    /* renamed from: b */
    public final C3770Iq f20268b;

    public C4603Kq(InterfaceC45717nV5.InterfaceC26536c delegate, C3770Iq autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f20267a = delegate;
        this.f20268b = autoCloser;
    }

    @Override // p000.InterfaceC45717nV5.InterfaceC26536c
    /* renamed from: b */
    public C4251Jq mo4888a(InterfaceC45717nV5.C26533b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C4251Jq(this.f20267a.mo4888a(configuration), this.f20268b);
    }
}
