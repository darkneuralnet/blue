package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;
/* loaded from: classes6.dex */
public class TextRecognizerImpl extends MobileVisionBase<C46615p06> implements InterfaceC50191v26 {

    /* renamed from: h */
    public final InterfaceC51377x26 f74680h;

    public TextRecognizerImpl(C52563z26 c52563z26, Executor executor, C45293mm9 c45293mm9, InterfaceC51377x26 interfaceC51377x26) {
        super(c52563z26, executor);
        M39 m39;
        this.f74680h = interfaceC51377x26;
        C44879m49 c44879m49 = new C44879m49();
        if (interfaceC51377x26.mo5908d()) {
            m39 = M39.TYPE_THICK;
        } else {
            m39 = M39.TYPE_THIN;
        }
        c44879m49.m26380e(m39);
        C48178re9 c48178re9 = new C48178re9();
        Me9 me9 = new Me9();
        me9.m95085a(C37204Xx2.m76025a(interfaceC51377x26.mo5906f()));
        c48178re9.m15619e(me9.m95083c());
        c44879m49.m26377h(c48178re9.m15618f());
        c45293mm9.m25018d(Dm9.m109952e(c44879m49, 1), EnumC40135e49.ON_DEVICE_TEXT_CREATE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return C44856m26.m26457a(this.f74680h);
    }

    @Override // p000.InterfaceC50191v26
    /* renamed from: h */
    public final Task<C46615p06> mo9280h(C41304g32 c41304g32) {
        return super.m46762a(c41304g32);
    }
}
