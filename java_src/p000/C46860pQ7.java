package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.face.internal.FaceDetectorImpl;
/* renamed from: pQ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46860pQ7 {

    /* renamed from: a */
    public final G68 f103662a;

    /* renamed from: b */
    public final C33549Ih1 f103663b;

    public C46860pQ7(G68 g68, C33549Ih1 c33549Ih1) {
        this.f103662a = g68;
        this.f103663b = c33549Ih1;
    }

    /* renamed from: a */
    public final FaceDetectorImpl m19316a(C42290hj1 c42290hj1) {
        Preconditions.checkNotNull(c42290hj1, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((C31792At8) this.f103662a.m98291b(c42290hj1), this.f103663b, c42290hj1, null);
    }
}
