package p000;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.recaptcha.zzeu;
import java.io.File;
/* renamed from: bb8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38642bb8 {

    /* renamed from: a */
    public static final C38642bb8 f57748a = new C38642bb8();

    private C38642bb8() {
    }

    /* renamed from: a */
    public static final File m64283a(Uri uri) throws zzeu {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new zzeu("Did not expect uri to have authority");
            }
            throw new zzeu("Did not expect uri to have query");
        }
        throw new zzeu("Scheme must be 'file'");
    }
}
