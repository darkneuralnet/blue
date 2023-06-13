package p000;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: w26  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50784w26 implements InterfaceC51377x26 {

    /* renamed from: c */
    public static final C50784w26 f115193c = new C29743a().m7544a();

    /* renamed from: a */
    public final AtomicReference f115194a = new AtomicReference();

    /* renamed from: b */
    public final Executor f115195b;

    /* renamed from: w26$a */
    /* loaded from: classes6.dex */
    public static class C29743a {

        /* renamed from: a */
        public Executor f115196a;

        /* renamed from: a */
        public C50784w26 m7544a() {
            return new C50784w26(this.f115196a, null);
        }
    }

    public /* synthetic */ C50784w26(Executor executor, C47000pf7 c47000pf7) {
        this.f115195b = executor;
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: a */
    public final Executor mo5911a() {
        return this.f115195b;
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: b */
    public final String mo5910b() {
        return true != mo5908d() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: c */
    public final String mo5909c() {
        return "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: d */
    public final boolean mo5908d() {
        return C51970y26.m4229a(this.f115194a, ModuleDescriptor.MODULE_ID);
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: e */
    public final String mo5907e() {
        return "en";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C50784w26)) {
            return false;
        }
        return Objects.equal(this.f115195b, ((C50784w26) obj).f115195b);
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: f */
    public final int mo5906f() {
        return 1;
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: g */
    public final String mo5905g() {
        return "optional-module-text-latin";
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: h */
    public final int mo5904h() {
        return mo5908d() ? 24317 : 24306;
    }

    public int hashCode() {
        return Objects.hashCode(this.f115195b);
    }

    @Override // p000.InterfaceC51377x26
    /* renamed from: i */
    public final String mo5903i() {
        return true != mo5908d() ? "com.google.android.gms.vision.ocr" : ModuleDescriptor.MODULE_ID;
    }
}
