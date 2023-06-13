package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.recaptcha.zzes;
import com.google.android.gms.internal.recaptcha.zzeu;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
/* renamed from: Z88 */
/* loaded from: classes6.dex */
public final class Z88 extends AbstractC39295ch8 {

    /* renamed from: a */
    public final Context f47894a;

    /* renamed from: b */
    public final InterfaceC34483Mg8 f47895b;

    /* renamed from: c */
    public final Object f47896c = new Object();

    /* renamed from: d */
    public String f47897d;

    public /* synthetic */ Z88(K88 k88, C49661u88 c49661u88) {
        C48157rc8 c48157rc8;
        Context context;
        c48157rc8 = k88.f19169b;
        this.f47895b = new C46961pb8(c48157rc8);
        context = k88.f19168a;
        this.f47894a = context;
    }

    /* renamed from: i */
    public static K88 m73658i(Context context) {
        return new K88(context, null);
    }

    /* renamed from: k */
    public static final void m73656k() throws zzes {
        throw new zzes("Android backend cannot perform remote operations without a remote backend");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.AbstractC39295ch8, p000.InterfaceC34483Mg8
    /* renamed from: c */
    public final File mo19074c(Uri uri) throws IOException {
        char c;
        File filesDir;
        String str;
        if (!m73657j(uri)) {
            Context context = this.f47894a;
            if (uri.getScheme().equals("android")) {
                if (!uri.getPathSegments().isEmpty()) {
                    if (TextUtils.isEmpty(uri.getQuery())) {
                        ArrayList arrayList = new ArrayList(uri.getPathSegments());
                        String str2 = (String) arrayList.get(0);
                        switch (str2.hashCode()) {
                            case -1820761141:
                                if (str2.equals("external")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94416770:
                                if (str2.equals("cache")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 97434231:
                                if (str2.equals("files")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 835260319:
                                if (str2.equals("managed")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 988548496:
                                if (str2.equals("directboot-cache")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 991565957:
                                if (str2.equals("directboot-files")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    if (c != 3) {
                                        if (c != 4) {
                                            if (c == 5) {
                                                filesDir = context.getExternalFilesDir(null);
                                            } else {
                                                throw new zzeu(String.format("Path must start with a valid logical location: %s", uri));
                                            }
                                        } else {
                                            File file = new File(C46707p98.m19855a(context), "managed");
                                            if (arrayList.size() >= 3) {
                                                try {
                                                    if (!C40767f88.f79536a.equals(C40767f88.m41952a((String) arrayList.get(2)))) {
                                                        throw new zzeu("AccountManager cannot be null");
                                                    }
                                                } catch (IllegalArgumentException e) {
                                                    throw new zzeu(e);
                                                }
                                            }
                                            filesDir = file;
                                        }
                                    } else {
                                        filesDir = context.getCacheDir();
                                    }
                                } else {
                                    filesDir = C46707p98.m19855a(context);
                                }
                            } else {
                                filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                            }
                        } else {
                            filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                        }
                        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                        if (!C50203v38.m9262a(this.f47894a)) {
                            synchronized (this.f47896c) {
                                if (this.f47897d == null) {
                                    this.f47897d = C46707p98.m19855a(this.f47894a.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.f47897d;
                            }
                            if (!file2.getAbsolutePath().startsWith(str)) {
                                throw new zzes("Cannot access credential-protected data from direct boot");
                            }
                        }
                        return file2;
                    }
                    throw new zzeu("Did not expect uri to have query");
                }
                throw new zzeu(String.format("Path must start with a valid logical location: %s", uri));
            }
            throw new zzeu("Scheme must be 'android'");
        }
        throw new IOException("operation is not permitted in other authorities.");
    }

    @Override // p000.AbstractC39295ch8, p000.InterfaceC34483Mg8
    /* renamed from: d */
    public final InputStream mo19073d(Uri uri) throws IOException {
        if (!m73657j(uri)) {
            return C48759sd8.m13918a(C38642bb8.m64283a(mo61041g(uri)));
        }
        m73656k();
        throw null;
    }

    @Override // p000.AbstractC39295ch8, p000.InterfaceC34483Mg8
    /* renamed from: e */
    public final boolean mo19072e(Uri uri) throws IOException {
        if (!m73657j(uri)) {
            return C38642bb8.m64283a(mo61041g(uri)).exists();
        }
        m73656k();
        throw null;
    }

    @Override // p000.AbstractC39295ch8
    /* renamed from: g */
    public final Uri mo61041g(Uri uri) throws IOException {
        if (!m73657j(uri)) {
            File mo19074c = mo19074c(uri);
            C34663Na8 c34663Na8 = new C34663Na8(null);
            c34663Na8.m93732b(mo19074c);
            return c34663Na8.m93733a();
        }
        throw new zzeu("Operation across authorities is not allowed.");
    }

    @Override // p000.AbstractC39295ch8
    /* renamed from: h */
    public final InterfaceC34483Mg8 mo61040h() {
        return this.f47895b;
    }

    /* renamed from: j */
    public final boolean m73657j(Uri uri) {
        if (!TextUtils.isEmpty(uri.getAuthority()) && !this.f47894a.getPackageName().equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: x */
    public final String mo19070x() {
        return "android";
    }
}
