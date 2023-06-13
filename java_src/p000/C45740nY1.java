package p000;

import co.bird.android.imageupload.worker.ImageUploadWorker;
import dagger.MembersInjector;
/* renamed from: nY1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45740nY1 implements MembersInjector<ImageUploadWorker> {

    /* renamed from: a */
    public final Y94<InterfaceC40476ef6> f100109a;

    /* renamed from: b */
    public static void m23554b(ImageUploadWorker imageUploadWorker, InterfaceC40476ef6 interfaceC40476ef6) {
        imageUploadWorker.f66041h = interfaceC40476ef6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(ImageUploadWorker imageUploadWorker) {
        m23554b(imageUploadWorker, this.f100109a.get());
    }
}
