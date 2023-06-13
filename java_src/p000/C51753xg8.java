package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
/* renamed from: xg8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51753xg8 implements InterfaceC52615z78<OutputStream> {

    /* renamed from: a */
    public C32332Db8[] f117971a;

    private C51753xg8() {
    }

    /* renamed from: b */
    public static C51753xg8 m4886b() {
        return new C51753xg8();
    }

    @Override // p000.InterfaceC52615z78
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ OutputStream mo1770a(C43722k78 c43722k78) throws IOException {
        List<OutputStream> m29261d = c43722k78.m29261d(c43722k78.m29263b().mo19076a(c43722k78.m29264a()));
        C32332Db8[] c32332Db8Arr = this.f117971a;
        if (c32332Db8Arr != null) {
            c32332Db8Arr[0].m110119a(m29261d);
        }
        return m29261d.get(0);
    }

    /* renamed from: c */
    public final C51753xg8 m4885c(C32332Db8... c32332Db8Arr) {
        this.f117971a = c32332Db8Arr;
        return this;
    }
}
