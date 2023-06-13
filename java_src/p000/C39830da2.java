package p000;

import android.bluetooth.le.ScanResult;
/* renamed from: da2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C39830da2 implements Z92 {
    @Override // p000.Z92
    /* renamed from: a */
    public Y92 mo44116a(ScanResult scanResult) {
        boolean isConnectable;
        isConnectable = scanResult.isConnectable();
        return isConnectable ? Y92.CONNECTABLE : Y92.NOT_CONNECTABLE;
    }
}
