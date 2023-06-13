package p000;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
/* renamed from: FO6 */
/* loaded from: classes6.dex */
public final class FO6 implements InterfaceC50972wM6<Object> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f9276a;

    /* renamed from: b */
    public final InterfaceC50972wM6 f9277b;

    /* renamed from: c */
    public final /* synthetic */ int f9278c = 0;

    public FO6(InterfaceC50972wM6<C39115cO6> interfaceC50972wM6, InterfaceC50972wM6<Context> interfaceC50972wM62) {
        this.f9276a = interfaceC50972wM6;
        this.f9277b = interfaceC50972wM62;
    }

    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6967a() {
        int i = this.f9278c;
        if (i == 0) {
            Object mo6967a = this.f9276a.mo6967a();
            Context mo6967a2 = ((TO6) this.f9277b).mo6967a();
            C39115cO6 c39115cO6 = (C39115cO6) mo6967a;
            C46814pL6.m19451h(mo6967a2.getPackageManager(), new ComponentName(mo6967a2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            C46814pL6.m19451h(mo6967a2.getPackageManager(), new ComponentName(mo6967a2.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.m48466a(mo6967a2);
            C46814pL6.m19448k(c39115cO6);
            return c39115cO6;
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return new OM6((HK6) this.f9277b.mo6967a(), C48601sM6.m14271c(this.f9276a));
                }
                return new HK6(((TO6) this.f9276a).mo6967a(), (MM6) this.f9277b.mo6967a());
            }
            return new C49769uK6(((TO6) this.f9276a).mo6967a(), (C51556xL6) this.f9277b.mo6967a());
        } else {
            return new BinderC39088cL6(((TO6) this.f9277b).mo6967a(), (HK6) this.f9276a.mo6967a());
        }
    }

    public FO6(InterfaceC50972wM6<Context> interfaceC50972wM6, InterfaceC50972wM6<HK6> interfaceC50972wM62, byte[] bArr) {
        this.f9277b = interfaceC50972wM6;
        this.f9276a = interfaceC50972wM62;
    }

    public FO6(InterfaceC50972wM6<Context> interfaceC50972wM6, InterfaceC50972wM6<C51556xL6> interfaceC50972wM62, char[] cArr) {
        this.f9276a = interfaceC50972wM6;
        this.f9277b = interfaceC50972wM62;
    }

    public FO6(InterfaceC50972wM6<HK6> interfaceC50972wM6, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM62, int[] iArr) {
        this.f9277b = interfaceC50972wM6;
        this.f9276a = interfaceC50972wM62;
    }

    public FO6(InterfaceC50972wM6<Context> interfaceC50972wM6, InterfaceC50972wM6<MM6> interfaceC50972wM62, short[] sArr) {
        this.f9276a = interfaceC50972wM6;
        this.f9277b = interfaceC50972wM62;
    }
}
