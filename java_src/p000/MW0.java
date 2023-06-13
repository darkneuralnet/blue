package p000;

import android.content.Context;
import android.util.Log;
import p000.InterfaceC32531Dy0;
/* renamed from: MW0 */
/* loaded from: classes5.dex */
public class MW0 implements InterfaceC32765Ey0 {
    @Override // p000.InterfaceC32765Ey0
    /* renamed from: a */
    public InterfaceC32531Dy0 mo95241a(Context context, InterfaceC32531Dy0.InterfaceC1677a interfaceC1677a) {
        boolean z;
        String str;
        if (NA0.m94303a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            return new LW0(context, interfaceC1677a);
        }
        return new C44011kd3();
    }
}
