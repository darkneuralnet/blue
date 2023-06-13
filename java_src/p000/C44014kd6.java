package p000;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
/* renamed from: kd6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44014kd6 {

    /* renamed from: a */
    public final URL f94687a;

    public C44014kd6(URL url) {
        this.f94687a = url;
    }

    /* renamed from: a */
    public URLConnection m28713a() throws IOException {
        return this.f94687a.openConnection();
    }

    public String toString() {
        return this.f94687a.toString();
    }
}
