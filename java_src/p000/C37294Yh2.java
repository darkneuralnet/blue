package p000;

import androidx.camera.core.C11242n;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC11183i;
import java.util.Objects;
/* renamed from: Yh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37294Yh2 implements InterfaceC37529Zh3<MD3<byte[]>, MD3<InterfaceC11183i>> {
    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<InterfaceC11183i> apply(MD3<byte[]> md3) throws ImageCaptureException {
        C11242n c11242n = new C11242n(MX1.m95184a(md3.mo80661h().getWidth(), md3.mo80661h().getHeight(), 256, 2));
        InterfaceC11183i m69651e = ImageProcessingUtil.m69651e(c11242n, md3.mo80666c());
        c11242n.m69125m();
        Objects.requireNonNull(m69651e);
        C36357Uh1 mo80665d = md3.mo80665d();
        Objects.requireNonNull(mo80665d);
        return MD3.m95564k(m69651e, mo80665d, md3.mo80667b(), md3.mo80663f(), md3.mo80662g(), md3.mo80668a());
    }
}
