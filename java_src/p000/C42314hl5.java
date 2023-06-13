package p000;

import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import io.reactivex.InterfaceC23435C;
/* renamed from: hl5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42314hl5 implements InterfaceC39332cl5 {

    /* renamed from: a */
    public final C46978pd5 f85846a;

    /* renamed from: b */
    public final C49635u62 f85847b;

    /* renamed from: c */
    public final C37558Zk5 f85848c;

    /* renamed from: d */
    public final C3717Id f85849d;

    public C42314hl5(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5, C3717Id c3717Id) {
        this.f85846a = c46978pd5;
        this.f85847b = c49635u62;
        this.f85848c = c37558Zk5;
        this.f85849d = c3717Id;
    }

    /* renamed from: b */
    public static boolean m35886b(ScanFilter[] scanFilterArr) {
        boolean z = true;
        for (ScanFilter scanFilter : scanFilterArr) {
            z &= scanFilter.mo42593a();
        }
        return !z;
    }

    @Override // p000.InterfaceC39332cl5
    /* renamed from: a */
    public C38739bl5 mo35887a(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        boolean z;
        boolean z2;
        boolean m35886b = m35886b(scanFilterArr);
        if (scanSettings.m45832b() != 1) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC23435C<C51730xe5, C51730xe5> m43957a = C39871de3.m43957a();
        if (z && !m35886b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C52323ye5.m3127b("ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation.", new Object[0]);
            m43957a = this.f85848c.m72585a(scanSettings.m45832b());
            scanSettings = scanSettings.m45833a(1);
        }
        return new C38739bl5(new C48234rk5(this.f85846a, this.f85847b, this.f85849d, scanSettings, new C36996Xa1(new InterfaceC40525ek5[0]), scanFilterArr), m43957a);
    }
}
