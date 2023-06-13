package p000;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
/* renamed from: u81  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49654u81 {

    /* renamed from: a */
    public final C34296Lm1 f111784a;

    /* renamed from: b */
    public final Bundle f111785b;

    /* renamed from: c */
    public final Bundle f111786c;

    public C49654u81(C34296Lm1 c34296Lm1) {
        this.f111784a = c34296Lm1;
        Bundle bundle = new Bundle();
        this.f111785b = bundle;
        bundle.putString("apiKey", c34296Lm1.m96367f().m115290m().m18706b());
        Bundle bundle2 = new Bundle();
        this.f111786c = bundle2;
        bundle.putBundle("parameters", bundle2);
    }

    /* renamed from: a */
    public Task<InterfaceC36523Uz5> m10819a(int i) {
        m10813g();
        this.f111785b.putInt("suffix", i);
        return this.f111784a.m96368e(this.f111785b);
    }

    /* renamed from: b */
    public C49654u81 m10818b(C49061t81 c49061t81) {
        this.f111786c.putAll(c49061t81.f109913a);
        return this;
    }

    /* renamed from: c */
    public C49654u81 m10817c(String str) {
        if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
            this.f111785b.putString("domain", str.replace("https://", ""));
        }
        this.f111785b.putString("domainUriPrefix", str);
        return this;
    }

    /* renamed from: d */
    public C49654u81 m10816d(C50246v81 c50246v81) {
        this.f111786c.putAll(c50246v81.f113581a);
        return this;
    }

    /* renamed from: e */
    public C49654u81 m10815e(Uri uri) {
        this.f111786c.putParcelable("link", uri);
        return this;
    }

    /* renamed from: f */
    public C49654u81 m10814f(C50839w81 c50839w81) {
        this.f111786c.putAll(c50839w81.f115402a);
        return this;
    }

    /* renamed from: g */
    public final void m10813g() {
        if (this.f111785b.getString("apiKey") != null) {
            return;
        }
        throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
    }
}
