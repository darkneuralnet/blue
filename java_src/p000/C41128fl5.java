package p000;

import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
/* renamed from: fl5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41128fl5 implements InterfaceC39332cl5 {

    /* renamed from: a */
    public final C46978pd5 f80603a;

    /* renamed from: b */
    public final C49635u62 f80604b;

    /* renamed from: c */
    public final C37558Zk5 f80605c;

    /* renamed from: d */
    public final C3717Id f80606d;

    public C41128fl5(C46978pd5 c46978pd5, C49635u62 c49635u62, C37558Zk5 c37558Zk5, C3717Id c3717Id) {
        this.f80603a = c46978pd5;
        this.f80604b = c49635u62;
        this.f80605c = c37558Zk5;
        this.f80606d = c3717Id;
    }

    @Override // p000.InterfaceC39332cl5
    /* renamed from: a */
    public C38739bl5 mo35887a(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        return new C38739bl5(new C48234rk5(this.f80603a, this.f80604b, this.f80606d, scanSettings, new C36996Xa1(scanFilterArr), null), this.f80605c.m72585a(scanSettings.m45832b()));
    }
}
