package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LQ73;", "Ldz0;", "LP73;", "", "h", "i", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "Q73$a", "g", "LQ73$a;", "networkCallback", "k", "()LP73;", "initialState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LmZ5;", "taskExecutor", "<init>", "(Landroid/content/Context;LmZ5;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Q73 */
/* loaded from: classes.dex */
public final class Q73 extends AbstractC40077dz0<P73> {

    /* renamed from: f */
    public final ConnectivityManager f29850f;

    /* renamed from: g */
    public final C6683a f29851g;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"Q73$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "", "onCapabilitiesChanged", "onLost", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Q73$a */
    /* loaded from: classes.dex */
    public static final class C6683a extends ConnectivityManager.NetworkCallback {
        public C6683a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str = R73.f31580a;
            m113272e.mo113269a(str, "Network capabilities changed: " + capabilities);
            Q73 q73 = Q73.this;
            q73.m43449g(R73.m87280c(q73.f29850f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            Intrinsics.checkNotNullParameter(network, "network");
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str = R73.f31580a;
            m113272e.mo113269a(str, "Network connection lost");
            Q73 q73 = Q73.this;
            q73.m43449g(R73.m87280c(q73.f29850f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q73(Context context, InterfaceC45160mZ5 taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = m43451d().getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f29850f = (ConnectivityManager) systemService;
        this.f29851g = new C6683a();
    }

    @Override // p000.AbstractC40077dz0
    /* renamed from: h */
    public void mo43448h() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str3 = R73.f31580a;
            m113272e.mo113269a(str3, "Registering network callback");
            C51424x73.m5833a(this.f29850f, this.f29851g);
        } catch (IllegalArgumentException e) {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            str2 = R73.f31580a;
            m113272e2.mo113266d(str2, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
            str = R73.f31580a;
            m113272e3.mo113266d(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // p000.AbstractC40077dz0
    /* renamed from: i */
    public void mo43447i() {
        String str;
        String str2;
        String str3;
        try {
            AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
            str3 = R73.f31580a;
            m113272e.mo113269a(str3, "Unregistering network callback");
            C50238v73.m9165c(this.f29850f, this.f29851g);
        } catch (IllegalArgumentException e) {
            AbstractC32056Bx2 m113272e2 = AbstractC32056Bx2.m113272e();
            str2 = R73.f31580a;
            m113272e2.mo113266d(str2, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            AbstractC32056Bx2 m113272e3 = AbstractC32056Bx2.m113272e();
            str = R73.f31580a;
            m113272e3.mo113266d(str, "Received exception while unregistering network callback", e2);
        }
    }

    @Override // p000.AbstractC40077dz0
    /* renamed from: k */
    public P73 mo41369e() {
        return R73.m87280c(this.f29850f);
    }
}
