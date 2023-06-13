package io.reactivex.disposables;

import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.util.C24475k;
/* renamed from: io.reactivex.disposables.a */
/* loaded from: classes6.dex */
public final class C23463a extends AbstractC23467e<InterfaceC23478a> {
    private static final long serialVersionUID = -8219729196779211169L;

    public C23463a(InterfaceC23478a interfaceC23478a) {
        super(interfaceC23478a);
    }

    @Override // io.reactivex.disposables.AbstractC23467e
    /* renamed from: b */
    public void mo33019a(InterfaceC23478a interfaceC23478a) {
        try {
            interfaceC23478a.run();
        } catch (Throwable th) {
            throw C24475k.m32256e(th);
        }
    }
}
