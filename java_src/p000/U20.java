package p000;

import android.content.Intent;
import android.net.Uri;
import com.paypal.android.sdk.onetouch.core.Request;
import com.paypal.android.sdk.onetouch.core.Result;
/* renamed from: U20 */
/* loaded from: classes6.dex */
public class U20 {

    /* renamed from: U20$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C8177a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36742a;

        static {
            int[] iArr = new int[EnumC42679iN4.values().length];
            f36742a = iArr;
            try {
                iArr[EnumC42679iN4.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36742a[EnumC42679iN4.Cancel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36742a[EnumC42679iN4.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public static Intent m82053a(XA0 xa0, C46560ov0 c46560ov0, Request request) {
        C36044Sy3 m20280b = c46560ov0.m20280b();
        String mo45891g = request.mo45891g();
        AbstractC45348ms4 mo45892e = request.mo45892e(m20280b);
        for (String str : mo45892e.m24830e()) {
            if (AbstractC45348ms4.m24827i(xa0.m77268b(), mo45891g, str)) {
                request.mo45881q(xa0.m77268b(), EnumC45489n66.SwitchToBrowser, mo45892e.m24833b());
                return AbstractC45348ms4.m24834a(xa0.m77268b(), mo45891g, str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Result m82052b(XA0 xa0, Request request, Uri uri) {
        Result mo45884n = request.mo45884n(uri);
        int i = C8177a.f36742a[mo45884n.m45877c().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    request.mo45881q(xa0.m77268b(), EnumC45489n66.Return, null);
                }
            } else {
                request.mo45881q(xa0.m77268b(), EnumC45489n66.Cancel, null);
            }
        } else {
            request.mo45881q(xa0.m77268b(), EnumC45489n66.Error, null);
        }
        return mo45884n;
    }
}
