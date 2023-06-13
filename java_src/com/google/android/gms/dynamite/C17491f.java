package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes5.dex */
public final class C17491f implements DynamiteModule.InterfaceC17483a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC17483a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC17483a.C17485b mo51583a(Context context, String str, DynamiteModule.InterfaceC17483a.InterfaceC17484a interfaceC17484a) throws DynamiteModule.LoadingException {
        int mo51582a;
        DynamiteModule.InterfaceC17483a.C17485b c17485b = new DynamiteModule.InterfaceC17483a.C17485b();
        int mo51581b = interfaceC17484a.mo51581b(context, str);
        c17485b.f70356a = mo51581b;
        int i = 0;
        if (mo51581b != 0) {
            mo51582a = interfaceC17484a.mo51582a(context, str, false);
            c17485b.f70357b = mo51582a;
        } else {
            mo51582a = interfaceC17484a.mo51582a(context, str, true);
            c17485b.f70357b = mo51582a;
        }
        int i2 = c17485b.f70356a;
        if (i2 == 0) {
            if (mo51582a == 0) {
                c17485b.f70358c = 0;
                return c17485b;
            }
        } else {
            i = i2;
        }
        if (i >= mo51582a) {
            c17485b.f70358c = -1;
        } else {
            c17485b.f70358c = 1;
        }
        return c17485b;
    }
}
