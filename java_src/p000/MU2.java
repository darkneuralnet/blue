package p000;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m28432d2 = {"LMU2;", "Lh13;", "", "close", "e3", "LDU2;", "k", "LDU2;", "modal", "LOh;", "buildConfig", "Lgl;", "appPreference", "LTq4;", "reactiveConfig", "Landroid/content/Context;", "appContext", "LEa;", "analyticsManager", "<init>", "(LOh;Lgl;LTq4;Landroid/content/Context;LEa;LDU2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MU2 */
/* loaded from: classes2.dex */
public final class MU2 extends C41878h13 {

    /* renamed from: k */
    public final DU2 f23149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MU2(InterfaceC6097Oh buildConfig, C22454gl appPreference, C36207Tq4 reactiveConfig, Context appContext, InterfaceC1880Ea analyticsManager, DU2 modal) {
        super(appPreference, analyticsManager, reactiveConfig, buildConfig, appContext);
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(modal, "modal");
        this.f23149k = modal;
    }

    @Override // p000.C41878h13, p000.InterfaceC40099e13
    public void close() {
        this.f23149k.m110367l().dismiss();
    }

    @Override // p000.C41878h13, p000.InterfaceC40099e13
    /* renamed from: e3 */
    public void mo37030e3() {
        this.f23149k.m110367l().dismiss();
    }
}
