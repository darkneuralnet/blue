package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;
/* renamed from: U98 */
/* loaded from: classes6.dex */
public final class U98 {

    /* renamed from: a */
    public final Context f36909a;

    /* renamed from: b */
    public final String f36910b;

    /* renamed from: c */
    public final String f36911c = "files";

    /* renamed from: d */
    public String f36912d = "common";

    /* renamed from: e */
    public final Account f36913e = C43986ka8.f94547b;

    /* renamed from: f */
    public String f36914f = "";

    /* renamed from: g */
    public final C42701iP8<String> f36915g = ZP8.m73202u();

    public /* synthetic */ U98(Context context, E98 e98) {
        boolean z;
        if (context != null) {
            z = true;
        } else {
            z = false;
        }
        C32368Df8.m110018a(z, "Context cannot be null", new Object[0]);
        this.f36909a = context;
        this.f36910b = context.getPackageName();
    }

    /* renamed from: a */
    public final Uri m81904a() {
        return new Uri.Builder().scheme("android").authority(this.f36910b).path(String.format("/%s/%s/%s/%s", this.f36911c, this.f36912d, C40767f88.m41951b(this.f36913e), this.f36914f)).encodedFragment(C47001pf8.m19006a(this.f36915g.m34004f())).build();
    }

    /* renamed from: b */
    public final U98 m81903b(String str) {
        C43986ka8.m28814b("recaptcha");
        this.f36912d = "recaptcha";
        return this;
    }

    /* renamed from: c */
    public final U98 m81902c(String str) {
        Pattern pattern = C43986ka8.f94546a;
        this.f36914f = "token.pb";
        return this;
    }
}
