package p000;

import android.annotation.SuppressLint;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import com.polidea.rxandroidble2.scan.ScanSettings;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Id */
/* loaded from: classes6.dex */
public class C3717Id {

    /* renamed from: a */
    public final int f15942a;

    public C3717Id(int i) {
        this.f15942a = i;
    }

    /* renamed from: a */
    public static void m101886a(ScanSettings scanSettings, ScanSettings.Builder builder) {
        builder.setCallbackType(scanSettings.m45832b()).setMatchMode(scanSettings.m45830d()).setNumOfMatches(scanSettings.m45829e());
    }

    /* renamed from: b */
    public static ScanFilter m101885b(com.polidea.rxandroidble2.scan.ScanFilter scanFilter) {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        if (scanFilter.m45853m() != null) {
            builder.setServiceData(scanFilter.m45853m(), scanFilter.m45855k(), scanFilter.m45854l());
        }
        if (scanFilter.m45860e() != null) {
            builder.setDeviceAddress(scanFilter.m45860e());
        }
        return builder.setDeviceName(scanFilter.m45859g()).setManufacturerData(scanFilter.m45856j(), scanFilter.m45858h(), scanFilter.m45857i()).setServiceUuid(scanFilter.m45852n(), scanFilter.m45851o()).build();
    }

    /* renamed from: c */
    public List<ScanFilter> m101884c(com.polidea.rxandroidble2.scan.ScanFilter... scanFilterArr) {
        boolean z;
        if (scanFilterArr != null && scanFilterArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(scanFilterArr.length);
            for (com.polidea.rxandroidble2.scan.ScanFilter scanFilter : scanFilterArr) {
                arrayList.add(m101885b(scanFilter));
            }
            return arrayList;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public android.bluetooth.le.ScanSettings m101883d(com.polidea.rxandroidble2.scan.ScanSettings scanSettings) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        if (this.f15942a >= 23) {
            m101886a(scanSettings, builder);
            if (this.f15942a >= 26) {
                builder.setLegacy(scanSettings.m45831c());
            }
        }
        return builder.setReportDelay(scanSettings.m45828g()).setScanMode(scanSettings.m45827h()).build();
    }
}
