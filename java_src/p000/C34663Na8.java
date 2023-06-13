package p000;

import android.net.Uri;
import java.io.File;
/* renamed from: Na8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34663Na8 {

    /* renamed from: a */
    public final Uri.Builder f24826a = new Uri.Builder().scheme("file").authority("").path("/");

    /* renamed from: b */
    public final C42701iP8<String> f24827b = ZP8.m73202u();

    private C34663Na8() {
    }

    /* renamed from: a */
    public final Uri m93733a() {
        return this.f24826a.encodedFragment(C47001pf8.m19006a(this.f24827b.m34004f())).build();
    }

    /* renamed from: b */
    public final C34663Na8 m93732b(File file) {
        this.f24826a.path(file.getAbsolutePath());
        return this;
    }

    public /* synthetic */ C34663Na8(C52879za8 c52879za8) {
    }
}
