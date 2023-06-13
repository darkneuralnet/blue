package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import p000.C9555Xx;
/* loaded from: classes6.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<C0774Bx>> implements InterfaceC8509Ux {

    /* renamed from: i */
    public static final C9555Xx f74662i = new C9555Xx.C9556a().m76027a();

    /* renamed from: h */
    public final boolean f74663h;

    public BarcodeScannerImpl(C9555Xx c9555Xx, BA8 ba8, Executor executor, C40559en9 c40559en9) {
        super(ba8, executor);
        EnumC52003y59 enumC52003y59;
        boolean m112613f = CC7.m112613f();
        this.f74663h = m112613f;
        K79 k79 = new K79();
        k79.m99180i(CC7.m112616c(c9555Xx));
        Y79 m99179j = k79.m99179j();
        W59 w59 = new W59();
        if (m112613f) {
            enumC52003y59 = EnumC52003y59.TYPE_THICK;
        } else {
            enumC52003y59 = EnumC52003y59.TYPE_THIN;
        }
        w59.m78840e(enumC52003y59);
        w59.m78838g(m99179j);
        c40559en9.m42550d(C51231wn9.m6313e(w59, 1), O59.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f74663h ? C45407my3.f99159a : new Feature[]{C45407my3.f99160b};
    }

    @Override // p000.InterfaceC8509Ux
    /* renamed from: h */
    public final Task<List<C0774Bx>> mo46763h(C41304g32 c41304g32) {
        return super.m46762a(c41304g32);
    }
}
