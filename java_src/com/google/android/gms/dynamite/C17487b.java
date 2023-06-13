package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* renamed from: com.google.android.gms.dynamite.b */
/* loaded from: classes5.dex */
public final class C17487b implements DynamiteModule.InterfaceC17483a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC17483a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC17483a.C17485b mo51583a(Context context, String str, DynamiteModule.InterfaceC17483a.InterfaceC17484a interfaceC17484a) throws DynamiteModule.LoadingException {
        DynamiteModule.InterfaceC17483a.C17485b c17485b = new DynamiteModule.InterfaceC17483a.C17485b();
        int mo51582a = interfaceC17484a.mo51582a(context, str, true);
        c17485b.f70357b = mo51582a;
        if (mo51582a != 0) {
            c17485b.f70358c = 1;
        } else {
            int mo51581b = interfaceC17484a.mo51581b(context, str);
            c17485b.f70356a = mo51581b;
            if (mo51581b != 0) {
                c17485b.f70358c = -1;
            }
        }
        return c17485b;
    }
}
