package p000;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleScanException;
import com.polidea.rxandroidble2.scan.ScanFilter;
import com.polidea.rxandroidble2.scan.ScanSettings;
import io.reactivex.InterfaceC24578y;
import java.util.Arrays;
import java.util.List;
/* renamed from: rk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48234rk5 extends AbstractC47048pk5<C51730xe5, ScanCallback> {

    /* renamed from: c */
    public final C49635u62 f107550c;

    /* renamed from: d */
    public final C3717Id f107551d;

    /* renamed from: e */
    public final ScanSettings f107552e;

    /* renamed from: f */
    public final C36996Xa1 f107553f;

    /* renamed from: g */
    public final ScanFilter[] f107554g;

    /* renamed from: h */
    public InterfaceC24578y<C51730xe5> f107555h;

    /* renamed from: rk5$a */
    /* loaded from: classes6.dex */
    public class C27985a extends ScanCallback {
        public C27985a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            InterfaceC24578y interfaceC24578y;
            for (ScanResult scanResult : list) {
                C51730xe5 m10860c = C48234rk5.this.f107550c.m10860c(scanResult);
                if (C48234rk5.this.f107553f.m76848b(m10860c) && (interfaceC24578y = C48234rk5.this.f107555h) != null) {
                    interfaceC24578y.onNext(m10860c);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            InterfaceC24578y interfaceC24578y = C48234rk5.this.f107555h;
            if (interfaceC24578y != null) {
                interfaceC24578y.mo11914c(new BleScanException(C48234rk5.m15477i(i)));
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, ScanResult scanResult) {
            InterfaceC24578y interfaceC24578y;
            byte[] bArr;
            if (!C48234rk5.this.f107553f.m76849a() && C52323ye5.m3117l(3) && C52323ye5.m3120i()) {
                ScanRecord scanRecord = scanResult.getScanRecord();
                Object[] objArr = new Object[4];
                objArr[0] = C35098Ox2.m91172d(scanResult.getDevice().getAddress());
                objArr[1] = scanResult.getDevice().getName();
                objArr[2] = Integer.valueOf(scanResult.getRssi());
                if (scanRecord != null) {
                    bArr = scanRecord.getBytes();
                } else {
                    bArr = null;
                }
                objArr[3] = C35098Ox2.m91175a(bArr);
                C52323ye5.m3127b("%s, name=%s, rssi=%d, data=%s", objArr);
            }
            C51730xe5 m10862a = C48234rk5.this.f107550c.m10862a(i, scanResult);
            if (C48234rk5.this.f107553f.m76848b(m10862a) && (interfaceC24578y = C48234rk5.this.f107555h) != null) {
                interfaceC24578y.onNext(m10862a);
            }
        }
    }

    public C48234rk5(C46978pd5 c46978pd5, C49635u62 c49635u62, C3717Id c3717Id, ScanSettings scanSettings, C36996Xa1 c36996Xa1, ScanFilter[] scanFilterArr) {
        super(c46978pd5);
        this.f107550c = c49635u62;
        this.f107552e = scanSettings;
        this.f107553f = c36996Xa1;
        this.f107554g = scanFilterArr;
        this.f107551d = c3717Id;
        this.f107555h = null;
    }

    /* renamed from: i */
    public static int m15477i(int i) {
        if (i == 1) {
            return 5;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        C52323ye5.m3111r("Encountered unknown scanning error code: %d -> check android.bluetooth.le.ScanCallback", new Object[0]);
                        return Integer.MAX_VALUE;
                    }
                    return 9;
                }
                return 8;
            }
            return 7;
        }
        return 6;
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: h */
    public ScanCallback mo15482d(InterfaceC24578y<C51730xe5> interfaceC24578y) {
        this.f107555h = interfaceC24578y;
        return new C27985a();
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: j */
    public boolean mo15481e(C46978pd5 c46978pd5, ScanCallback scanCallback) {
        if (this.f107553f.m76849a()) {
            C52323ye5.m3127b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        c46978pd5.m19047d(this.f107551d.m101884c(this.f107554g), this.f107551d.m101883d(this.f107552e), scanCallback);
        return true;
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: k */
    public void mo15480f(C46978pd5 c46978pd5, ScanCallback scanCallback) {
        c46978pd5.m19045f(scanCallback);
        InterfaceC24578y<C51730xe5> interfaceC24578y = this.f107555h;
        if (interfaceC24578y != null) {
            interfaceC24578y.onComplete();
            this.f107555h = null;
        }
    }

    public String toString() {
        boolean z;
        String str;
        String str2;
        ScanFilter[] scanFilterArr = this.f107554g;
        if (scanFilterArr != null && scanFilterArr.length != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean m76849a = this.f107553f.m76849a();
        StringBuilder sb = new StringBuilder();
        sb.append("ScanOperationApi21{");
        String str3 = "";
        if (z) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> nativeFilters=" + Arrays.toString(this.f107554g);
        }
        sb.append(str);
        if (z || m76849a) {
            str2 = "";
        } else {
            str2 = " and then ";
        }
        sb.append(str2);
        if (!m76849a) {
            str3 = "ANY_MUST_MATCH -> " + this.f107553f;
        }
        sb.append(str3);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
