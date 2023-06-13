package p000;

import android.os.ParcelUuid;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
/* renamed from: Dk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C32410Dk5 implements InterfaceC32176Ck5 {

    /* renamed from: a */
    public final int f6252a;

    /* renamed from: b */
    public final List<ParcelUuid> f6253b;

    /* renamed from: c */
    public final List<ParcelUuid> f6254c;

    /* renamed from: d */
    public final SparseArray<byte[]> f6255d;

    /* renamed from: e */
    public final Map<ParcelUuid, byte[]> f6256e;

    /* renamed from: f */
    public final int f6257f;

    /* renamed from: g */
    public final String f6258g;

    /* renamed from: h */
    public final byte[] f6259h;

    public C32410Dk5(List<ParcelUuid> list, List<ParcelUuid> list2, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.f6253b = list;
        this.f6254c = list2;
        this.f6255d = sparseArray;
        this.f6256e = map;
        this.f6258g = str;
        this.f6252a = i;
        this.f6257f = i2;
        this.f6259h = bArr;
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: a */
    public byte[] mo106631a() {
        return this.f6259h;
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: b */
    public byte[] mo106630b(int i) {
        return this.f6255d.get(i);
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: c */
    public List<ParcelUuid> mo106629c() {
        return this.f6253b;
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: d */
    public List<ParcelUuid> mo106628d() {
        return this.f6254c;
    }

    @Override // p000.InterfaceC32176Ck5
    /* renamed from: e */
    public byte[] mo106627e(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.f6256e.get(parcelUuid);
    }

    @Override // p000.InterfaceC32176Ck5
    public String getDeviceName() {
        return this.f6258g;
    }
}
