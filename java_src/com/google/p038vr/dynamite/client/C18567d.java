package com.google.p038vr.dynamite.client;
/* renamed from: com.google.vr.dynamite.client.d */
/* loaded from: classes6.dex */
public final class C18567d extends Exception {

    /* renamed from: b */
    public final int f74903b = 1;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f74903b != 1 ? "Unknown error" : "Package not available";
        return "LoaderException{" + str + "}";
    }
}
