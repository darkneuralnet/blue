package p000;

import com.amazonaws.services.p026s3.internal.Constants;
/* renamed from: Nk9 */
/* loaded from: classes5.dex */
public final class Nk9 implements InterfaceC42999iu7 {

    /* renamed from: a */
    public static final InterfaceC42999iu7 f25089a = new Nk9();

    private Nk9() {
    }

    @Override // p000.InterfaceC42999iu7
    public final boolean zza(int i) {
        if (i != 9999) {
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
                    return true;
                default:
                    switch (i) {
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                            return true;
                        default:
                            switch (i) {
                                case 201:
                                case 202:
                                case 203:
                                case 204:
                                case 205:
                                case 206:
                                case 207:
                                    return true;
                                default:
                                    switch (i) {
                                        case Constants.BUCKET_REDIRECT_STATUS_CODE /* 301 */:
                                        case 302:
                                        case 303:
                                        case 304:
                                        case 305:
                                            return true;
                                        default:
                                            switch (i) {
                                                case 400:
                                                case 401:
                                                case 402:
                                                case Constants.BUCKET_ACCESS_FORBIDDEN_STATUS_CODE /* 403 */:
                                                case Constants.NO_SUCH_BUCKET_STATUS_CODE /* 404 */:
                                                case 405:
                                                case 406:
                                                case 407:
                                                    return true;
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                    }
            }
        }
        return true;
    }
}
