package p000;

import android.os.ParcelUuid;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.UByte;
/* renamed from: IY */
/* loaded from: classes8.dex */
public final class C3706IY {

    /* renamed from: a */
    public static final ParcelUuid f15868a = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    public static ParcelUuid m101943a(byte[] bArr) {
        long j;
        if (bArr != null) {
            int length = bArr.length;
            if (length != 2 && length != 4 && length != 16) {
                throw new IllegalArgumentException("uuidBytes length invalid - " + length);
            } else if (length == 16) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
            } else {
                if (length == 2) {
                    j = (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8);
                } else {
                    j = ((bArr[3] & UByte.MAX_VALUE) << 24) + (bArr[0] & UByte.MAX_VALUE) + ((bArr[1] & UByte.MAX_VALUE) << 8) + ((bArr[2] & UByte.MAX_VALUE) << 16);
                }
                ParcelUuid parcelUuid = f15868a;
                return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
            }
        }
        throw new IllegalArgumentException("uuidBytes cannot be null");
    }
}
