package p000;

import android.bluetooth.le.ScanRecord;
import android.os.Build;
import android.os.ParcelUuid;
import java.util.List;
/* renamed from: Fk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32878Fk5 implements InterfaceC32176Ck5 {

    /* renamed from: a */
    public final ScanRecord f10058a;

    /* renamed from: b */
    public final C33112Gk5 f10059b;

    public C32878Fk5(ScanRecord scanRecord, C33112Gk5 c33112Gk5) {
        this.f10058a = scanRecord;
        this.f10059b = c33112Gk5;
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: a */
    public byte[] mo106631a() {
        return this.f10058a.getBytes();
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: b */
    public byte[] mo106630b(int i) {
        return this.f10058a.getManufacturerSpecificData(i);
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: c */
    public List<ParcelUuid> mo106629c() {
        return this.f10058a.getServiceUuids();
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: d */
    public List<ParcelUuid> mo106628d() {
        List<ParcelUuid> serviceSolicitationUuids;
        if (Build.VERSION.SDK_INT >= 29) {
            serviceSolicitationUuids = this.f10058a.getServiceSolicitationUuids();
            return serviceSolicitationUuids;
        }
        return this.f10059b.m104812c(this.f10058a.getBytes()).mo106628d();
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: e */
    public byte[] mo106627e(ParcelUuid parcelUuid) {
        return this.f10058a.getServiceData(parcelUuid);
    }

    @Override // p000.InterfaceC32176Ck5
    public String getDeviceName() {
        return this.f10058a.getDeviceName();
    }
}
