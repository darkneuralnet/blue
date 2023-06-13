package p000;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* renamed from: ao1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ComponentCallbacks2C38172ao1 implements InterfaceC35574Qy1, ComponentCallbacks2 {
    @Override // p000.InterfaceC35574Qy1
    /* renamed from: a */
    public void mo62575a(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }
}
