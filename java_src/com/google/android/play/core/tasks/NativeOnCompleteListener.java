package com.google.android.play.core.tasks;

import android.support.annotation.Nullable;
/* loaded from: classes6.dex */
public class NativeOnCompleteListener implements InterfaceC44031kf3<Object> {

    /* renamed from: a */
    public final long f73717a;

    /* renamed from: b */
    public final int f73718b;

    @Override // p000.InterfaceC44031kf3
    /* renamed from: a */
    public void mo17508a(XY5<Object> xy5) {
        if (!xy5.mo1422f()) {
            int i = this.f73718b;
            StringBuilder sb = new StringBuilder(50);
            sb.append("onComplete called for incomplete task: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (xy5.mo1421g()) {
            nativeOnComplete(this.f73717a, this.f73718b, xy5.mo1423e(), 0);
        } else {
            Exception mo1424d = xy5.mo1424d();
            if (!(mo1424d instanceof AbstractC17969j)) {
                nativeOnComplete(this.f73717a, this.f73718b, null, -100);
                return;
            }
            int mo39546a = ((AbstractC17969j) mo1424d).mo39546a();
            if (mo39546a != 0) {
                nativeOnComplete(this.f73717a, this.f73718b, null, mo39546a);
                return;
            }
            int i2 = this.f73718b;
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("TaskException has error code 0 on task: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public native void nativeOnComplete(long j, int i, @Nullable Object obj, int i2);
}
