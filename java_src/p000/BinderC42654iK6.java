package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.List;
/* renamed from: iK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class BinderC42654iK6<T> extends AbstractBinderC41513gP6 {

    /* renamed from: a */
    public final C37929aO6<T> f87177a;

    /* renamed from: b */
    public final /* synthetic */ C49769uK6 f87178b;

    public BinderC42654iK6(C49769uK6 c49769uK6, C37929aO6<T> c37929aO6) {
        this.f87178b = c49769uK6;
        this.f87177a = c37929aO6;
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: M */
    public final void mo34015M(int i) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: N2 */
    public void mo34014N2(Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt(AnalyticsFields.SESSION_ID)));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: O1 */
    public void mo17605O1(Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        int i = bundle.getInt("error_code");
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36537b("onError(%d)", Integer.valueOf(i));
        this.f87177a.m71486d(new AssetPackException(i));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: P1 */
    public void mo29051P1(Bundle bundle, Bundle bundle2) throws RemoteException {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: R0 */
    public void mo34013R0(Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt(AnalyticsFields.SESSION_ID)));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: T4 */
    public void mo25821T4(List<Bundle> list) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onGetSessionStates", new Object[0]);
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: X1 */
    public void mo34012X1(Bundle bundle, Bundle bundle2) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: c3 */
    public void mo34011c3(Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt(AnalyticsFields.SESSION_ID)));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: d0 */
    public final void mo34010d0(int i) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: i */
    public void mo34009i() {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onCancelDownloads()", new Object[0]);
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: i1 */
    public void mo34008i1(int i, Bundle bundle) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: n */
    public void mo34007n() {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112217c;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onRemoveModule()", new Object[0]);
    }

    @Override // p000.InterfaceC42699iP6
    /* renamed from: x1 */
    public void mo21339x1(Bundle bundle, Bundle bundle2) {
        C52733zK6 c52733zK6;
        C42061hK6 c42061hK6;
        c52733zK6 = this.f87178b.f112218d;
        c52733zK6.m1532b();
        c42061hK6 = C49769uK6.f112213f;
        c42061hK6.m36535d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public BinderC42654iK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, byte[] bArr) {
        this(c49769uK6, c37929aO6);
    }

    public BinderC42654iK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, char[] cArr) {
        this(c49769uK6, c37929aO6);
    }

    public BinderC42654iK6(C49769uK6 c49769uK6, C37929aO6 c37929aO6, int[] iArr) {
        this(c49769uK6, c37929aO6);
    }
}
