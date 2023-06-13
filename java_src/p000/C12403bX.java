package p000;

import co.bird.android.bluetooth.model.ScannedDevice;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¨\u0006\u0003"}, m28432d2 = {"Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "Lco/bird/android/bluetooth/model/ScannedDevice;", C17296a.f69688o, "interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: bX */
/* loaded from: classes2.dex */
public final class C12403bX {
    /* renamed from: a */
    public static final ScannedDevice m64485a(ScanResult scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        String address = scanResult.m22434a().getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "this.device.address");
        return new ScannedDevice(scanResult, address, scanResult.m22433b(), 0, scanResult.m22433b(), C36856Wk5.m77889a(scanResult), 8, null);
    }
}
