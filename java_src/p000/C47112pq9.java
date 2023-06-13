package p000;
/* renamed from: pq9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47112pq9 implements InterfaceC42999iu7 {

    /* renamed from: a */
    public static final InterfaceC42999iu7 f104168a = new C47112pq9();

    private C47112pq9() {
    }

    @Override // p000.InterfaceC42999iu7
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2) {
            switch (i) {
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                case 128:
                case 256:
                case 512:
                case 1024:
                case 2048:
                case 4096:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
