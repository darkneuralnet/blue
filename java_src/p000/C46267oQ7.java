package p000;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
/* renamed from: oQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C46267oQ7 implements OnFailureListener {

    /* renamed from: a */
    public static final /* synthetic */ C46267oQ7 f101971a = new C46267oQ7();

    private /* synthetic */ C46267oQ7() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        MobileVisionBase.f74664g.m51613e("MobileVisionBase", "Error preloading model resource", exc);
    }
}
