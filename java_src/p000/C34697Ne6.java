package p000;

import co.bird.android.imageupload.worker.UpdatePhotosWorker;
import dagger.MembersInjector;
/* renamed from: Ne6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34697Ne6 implements MembersInjector<UpdatePhotosWorker> {

    /* renamed from: a */
    public final Y94<InterfaceC34088Kp0> f24950a;

    /* renamed from: a */
    public static void m93597a(UpdatePhotosWorker updatePhotosWorker, InterfaceC34088Kp0 interfaceC34088Kp0) {
        updatePhotosWorker.f66045h = interfaceC34088Kp0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(UpdatePhotosWorker updatePhotosWorker) {
        m93597a(updatePhotosWorker, this.f24950a.get());
    }
}
