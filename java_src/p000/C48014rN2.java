package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J&\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LrN2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTN2;", "viewModelConfigFactory", "LQr6;", "viewModelDelegateFactory", "", "b", "", "debugMode", "c", "LQr6;", "getViewModelDelegateFactory", "()LQr6;", "setViewModelDelegateFactory", "(LQr6;)V", "LTN2;", "_viewModelConfigFactory", "value", C17296a.f69688o, "()LTN2;", "setViewModelConfigFactory", "(LTN2;)V", "<init>", "()V", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: rN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48014rN2 {

    /* renamed from: a */
    public static final C48014rN2 f106907a = new C48014rN2();

    /* renamed from: b */
    public static InterfaceC35516Qr6 f106908b = new XY0();

    /* renamed from: c */
    public static TN2 f106909c;

    private C48014rN2() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m16033d(C48014rN2 c48014rN2, Context context, TN2 tn2, InterfaceC35516Qr6 interfaceC35516Qr6, int i, Object obj) {
        if ((i & 2) != 0) {
            tn2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC35516Qr6 = null;
        }
        c48014rN2.m16035b(context, tn2, interfaceC35516Qr6);
    }

    /* renamed from: a */
    public final TN2 m16036a() {
        TN2 tn2 = f106909c;
        if (tn2 != null) {
            return tn2;
        }
        throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
    }

    /* renamed from: b */
    public final void m16035b(Context context, TN2 tn2, InterfaceC35516Qr6 interfaceC35516Qr6) {
        Intrinsics.checkNotNullParameter(context, "context");
        m16034c(UN2.m81572a(context), tn2, interfaceC35516Qr6);
    }

    /* renamed from: c */
    public final void m16034c(boolean z, TN2 tn2, InterfaceC35516Qr6 interfaceC35516Qr6) {
        if (tn2 == null) {
            tn2 = new TN2(z, null, null, null, 14, null);
        }
        f106909c = tn2;
        if (interfaceC35516Qr6 == null) {
            interfaceC35516Qr6 = f106908b;
            if (!(interfaceC35516Qr6 instanceof XY0)) {
                interfaceC35516Qr6 = new XY0();
            }
        }
        f106908b = interfaceC35516Qr6;
    }
}
