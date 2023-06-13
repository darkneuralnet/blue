package p000;

import android.net.Uri;
/* renamed from: fA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40782fA3 {
    /* renamed from: b */
    public static AbstractC40782fA3 m41782b(Uri uri) {
        HZ3.m103730h(uri, "OutputUri cannot be null.");
        return new C7570St(uri);
    }

    /* renamed from: a */
    public abstract Uri mo41783a();
}
