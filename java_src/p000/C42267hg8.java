package p000;

import java.io.IOException;
import java.io.InputStream;
/* renamed from: hg8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42267hg8 implements InterfaceC52615z78<InputStream> {
    private C42267hg8() {
    }

    /* renamed from: b */
    public static C42267hg8 m36100b() {
        return new C42267hg8();
    }

    /* renamed from: c */
    public static final InputStream m36099c(C43722k78 c43722k78) throws IOException {
        return c43722k78.m29262c(c43722k78.m29263b().mo19073d(c43722k78.m29264a())).get(0);
    }

    @Override // p000.InterfaceC52615z78
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo1770a(C43722k78 c43722k78) throws IOException {
        return m36099c(c43722k78);
    }
}
