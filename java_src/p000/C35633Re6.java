package p000;

import co.bird.android.imageupload.worker.UpdateRidePhotoWorker;
import dagger.MembersInjector;
/* renamed from: Re6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35633Re6 implements MembersInjector<UpdateRidePhotoWorker> {

    /* renamed from: a */
    public final Y94<YR4> f32423a;

    /* renamed from: b */
    public static void m86474b(UpdateRidePhotoWorker updateRidePhotoWorker, YR4 yr4) {
        updateRidePhotoWorker.f66048h = yr4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(UpdateRidePhotoWorker updateRidePhotoWorker) {
        m86474b(updateRidePhotoWorker, this.f32423a.get());
    }
}
