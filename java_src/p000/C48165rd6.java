package p000;

import java.util.UUID;
/* renamed from: rd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48165rd6 extends C20674g {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public UUID[] f107343e;

    public C48165rd6() {
    }

    @Override // p000.C20674g
    public String toString() {
        if (this.f107343e == null) {
            return String.format("UUIDs(%s)", "null");
        }
        StringBuilder sb = new StringBuilder();
        for (UUID uuid : this.f107343e) {
            sb.append(uuid);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
        }
        return String.format("UUIDs(%s)", sb.toString());
    }

    public C48165rd6(int i, int i2, byte[] bArr, UUID... uuidArr) {
        super(i, i2, bArr);
        this.f107343e = uuidArr;
    }
}
