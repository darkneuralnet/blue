package p000;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.location.places.Place;
/* renamed from: VQ6 */
/* loaded from: classes5.dex */
public final class VQ6 implements InterfaceC43402jb7 {

    /* renamed from: a */
    public static final InterfaceC43402jb7 f39095a = new VQ6();

    private VQ6() {
    }

    @Override // p000.InterfaceC43402jb7
    /* renamed from: a */
    public final boolean mo953a(int i) {
        if (i == 3000 || i == 4000 || i == 5000) {
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
                return true;
            default:
                switch (i) {
                    case 1000:
                    case 1001:
                    case 1002:
                    case Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3 /* 1003 */:
                    case 1004:
                    case 1005:
                    case Place.TYPE_FLOOR /* 1006 */:
                    case 1007:
                    case Place.TYPE_INTERSECTION /* 1008 */:
                    case Place.TYPE_LOCALITY /* 1009 */:
                    case Place.TYPE_NATURAL_FEATURE /* 1010 */:
                    case Place.TYPE_NEIGHBORHOOD /* 1011 */:
                    case Place.TYPE_POLITICAL /* 1012 */:
                    case Place.TYPE_POINT_OF_INTEREST /* 1013 */:
                    case Place.TYPE_POST_BOX /* 1014 */:
                        return true;
                    default:
                        switch (i) {
                            case CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE /* 2000 */:
                            case 2001:
                            case 2002:
                            case 2003:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }
}
