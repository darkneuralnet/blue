package p000;
/* renamed from: zm7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC52998zm7 implements Z19 {
    UNKNOWN_ERROR(0),
    NO_CONNECTION(1),
    RPC_ERROR(2),
    RPC_RETURNED_INVALID_RESULT(3),
    RPC_RETURNED_MALFORMED_RESULT(4),
    RPC_EXPONENTIAL_BACKOFF_FAILED(5),
    DIRECTORY_CREATION_FAILED(10),
    FILE_WRITE_FAILED_DISK_FULL(11),
    FILE_WRITE_FAILED(12),
    FILE_READ_FAILED(13),
    FILE_READ_RETURNED_INVALID_DATA(14),
    FILE_READ_RETURNED_MALFORMED_DATA(15);
    

    /* renamed from: b */
    public final int f122208b;

    EnumC52998zm7(int i) {
        this.f122208b = i;
    }

    @Override // p000.Z19
    public final int zza() {
        return this.f122208b;
    }
}