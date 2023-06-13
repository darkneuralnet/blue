package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, m28432d2 = {"Lbo/app/q0;", "Lbo/app/m2;", "Lbo/app/l2;", "request", "", "c", "b", C17296a.f69688o, "Lbo/app/g2;", "internalEventPublisher", "", "shouldStoreMockedHistory", "<init>", "(Lbo/app/g2;Z)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.q0 */
/* loaded from: classes.dex */
public final class C13041q0 implements InterfaceC12909m2 {

    /* renamed from: a */
    private final InterfaceC12658g2 f59117a;

    /* renamed from: b */
    private boolean f59118b;

    /* renamed from: c */
    private final List<InterfaceC13280z1> f59119c;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.q0$a */
    /* loaded from: classes.dex */
    public static final class C13042a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13042a f59120b = new C13042a();

        public C13042a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Short circuiting execution of network request and immediately marking it as succeeded.";
        }
    }

    public C13041q0(InterfaceC12658g2 internalEventPublisher, boolean z) {
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        this.f59117a = internalEventPublisher;
        this.f59118b = z;
        this.f59119c = new ArrayList();
    }

    /* renamed from: c */
    private final void m63103c(InterfaceC12868l2 interfaceC12868l2) {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13042a.f59120b, 3, null);
        interfaceC12868l2.mo62660a(this.f59117a, null);
        interfaceC12868l2.mo63063b(this.f59117a);
        if (interfaceC12868l2 instanceof InterfaceC13280z1) {
            this.f59117a.mo63715a((InterfaceC12658g2) new C13013p0((InterfaceC13280z1) interfaceC12868l2), (Class<InterfaceC12658g2>) C13013p0.class);
        }
    }

    @Override // bo.app.InterfaceC12909m2
    /* renamed from: a */
    public void mo63105a(InterfaceC12868l2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        m63103c(request);
    }

    @Override // bo.app.InterfaceC12909m2
    /* renamed from: b */
    public void mo63104b(InterfaceC12868l2 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        m63103c(request);
    }
}
