package p000;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.internal.utils.ImageUtil;
import java.util.Objects;
/* renamed from: UT */
/* loaded from: classes.dex */
public class C8302UT implements InterfaceC37529Zh3<MD3<Bitmap>, MD3<Bitmap>> {

    /* renamed from: a */
    public final C48449s62 f37452a;

    public C8302UT(C48449s62 c48449s62) {
        this.f37452a = c48449s62;
    }

    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<Bitmap> apply(MD3<Bitmap> md3) throws ImageCaptureException {
        InterfaceC11183i m103794a = this.f37452a.m14777e(new IX1(new TO4(md3), 1)).m103794a();
        Objects.requireNonNull(m103794a);
        Bitmap m69227c = ImageUtil.m69227c(m103794a.mo69480A0(), m103794a.getWidth(), m103794a.getHeight());
        C36357Uh1 mo80665d = md3.mo80665d();
        Objects.requireNonNull(mo80665d);
        return MD3.m95565j(m69227c, mo80665d, md3.mo80667b(), md3.mo80663f(), md3.mo80662g(), md3.mo80668a());
    }
}
