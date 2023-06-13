package p000;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
/* renamed from: ai2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38113ai2 implements InterfaceC37529Zh3<MD3<InterfaceC11183i>, InterfaceC11183i> {
    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public InterfaceC11183i apply(MD3<InterfaceC11183i> md3) throws ImageCaptureException {
        InterfaceC11183i mo80666c = md3.mo80666c();
        C41238fw5 c41238fw5 = new C41238fw5(mo80666c, md3.mo80661h(), TY1.m83423d(mo80666c.mo40428i1().mo3254b(), mo80666c.mo40428i1().getTimestamp(), md3.mo80663f(), md3.mo80662g()));
        c41238fw5.setCropRect(md3.mo80667b());
        return c41238fw5;
    }
}
