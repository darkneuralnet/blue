package p000;
/* renamed from: bz9 */
/* loaded from: classes5.dex */
public enum bz9 implements Z19 {
    UNKNOWN_ERROR(0),
    NO_CONNECTION(1),
    RPC_ERROR(2),
    RPC_RETURNED_MALFORMED_RESULT(3),
    RPC_EXPONENTIAL_BACKOFF_FAILED(5),
    RPC_CLIENT_ERROR(6),
    DIRECTORY_CREATION_FAILED(10),
    FILE_WRITE_FAILED(11),
    FILE_READ_FAILED(12),
    FILE_READ_RETURNED_MALFORMED_DATA(13);
    

    /* renamed from: b */
    public final int f59867b;

    bz9(int i) {
        this.f59867b = i;
    }

    @Override // p000.Z19
    public final int zza() {
        return this.f59867b;
    }
}
