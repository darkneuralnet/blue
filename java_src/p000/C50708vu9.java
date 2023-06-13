package p000;
/* renamed from: vu9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50708vu9 implements InterfaceC42999iu7 {

    /* renamed from: a */
    public static final InterfaceC42999iu7 f114901a = new C50708vu9();

    private C50708vu9() {
    }

    @Override // p000.InterfaceC42999iu7
    public final boolean zza(int i) {
        if (i == 400 || i == 401 || i == 403 || i == 404 || i == 408 || i == 409 || i == 429 || i == 511 || i == 503 || i == 504) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return true;
            default:
                switch (i) {
                    case 499:
                    case 500:
                    case 501:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
