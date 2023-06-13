package p000;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
/* renamed from: KT */
/* loaded from: classes.dex */
public class C4448KT implements InterfaceC37529Zh3<AbstractC4449a, MD3<byte[]>> {

    /* renamed from: KT$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC4449a {
        /* renamed from: c */
        public static AbstractC4449a m98855c(MD3<Bitmap> md3, int i) {
            return new C25810lt(md3, i);
        }

        /* renamed from: a */
        public abstract int mo26706a();

        /* renamed from: b */
        public abstract MD3<Bitmap> mo26705b();
    }

    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<byte[]> apply(AbstractC4449a abstractC4449a) throws ImageCaptureException {
        MD3<Bitmap> mo26705b = abstractC4449a.mo26705b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo26705b.mo80666c().compress(Bitmap.CompressFormat.JPEG, abstractC4449a.mo26706a(), byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C36357Uh1 mo80665d = mo26705b.mo80665d();
        Objects.requireNonNull(mo80665d);
        return MD3.m95562m(byteArray, mo80665d, 256, mo26705b.mo80661h(), mo26705b.mo80667b(), mo26705b.mo80663f(), mo26705b.mo80662g(), mo26705b.mo80668a());
    }
}
