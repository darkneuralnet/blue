package p000;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Objects;
/* renamed from: xW1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51650xW1 implements InterfaceC37529Zh3<AbstractC30220a, MD3<byte[]>> {

    /* renamed from: xW1$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC30220a {
        /* renamed from: c */
        public static AbstractC30220a m5099c(MD3<InterfaceC11183i> md3, int i) {
            return new C2011Et(md3, i);
        }

        /* renamed from: a */
        public abstract int mo5101a();

        /* renamed from: b */
        public abstract MD3<InterfaceC11183i> mo5100b();
    }

    /* renamed from: b */
    public static C36357Uh1 m5104b(byte[] bArr) throws ImageCaptureException {
        try {
            return C36357Uh1.m81168k(new ByteArrayInputStream(bArr));
        } catch (IOException e) {
            throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
        }
    }

    @Override // p000.InterfaceC37529Zh3
    /* renamed from: a */
    public MD3<byte[]> apply(AbstractC30220a abstractC30220a) throws ImageCaptureException {
        MD3<byte[]> m5102d;
        try {
            int mo80664e = abstractC30220a.mo5100b().mo80664e();
            if (mo80664e != 35) {
                if (mo80664e == 256) {
                    m5102d = m5103c(abstractC30220a);
                } else {
                    throw new IllegalArgumentException("Unexpected format: " + mo80664e);
                }
            } else {
                m5102d = m5102d(abstractC30220a);
            }
            return m5102d;
        } finally {
            abstractC30220a.mo5100b().mo80666c().close();
        }
    }

    /* renamed from: c */
    public final MD3<byte[]> m5103c(AbstractC30220a abstractC30220a) {
        MD3<InterfaceC11183i> mo5100b = abstractC30220a.mo5100b();
        byte[] m69219k = ImageUtil.m69219k(mo5100b.mo80666c());
        C36357Uh1 mo80665d = mo5100b.mo80665d();
        Objects.requireNonNull(mo80665d);
        return MD3.m95562m(m69219k, mo80665d, 256, mo5100b.mo80661h(), mo5100b.mo80667b(), mo5100b.mo80663f(), mo5100b.mo80662g(), mo5100b.mo80668a());
    }

    /* renamed from: d */
    public final MD3<byte[]> m5102d(AbstractC30220a abstractC30220a) throws ImageCaptureException {
        MD3<InterfaceC11183i> mo5100b = abstractC30220a.mo5100b();
        InterfaceC11183i mo80666c = mo5100b.mo80666c();
        Rect mo80667b = mo5100b.mo80667b();
        try {
            byte[] m69213q = ImageUtil.m69213q(mo80666c, mo80667b, abstractC30220a.mo5101a(), mo5100b.mo80663f());
            return MD3.m95562m(m69213q, m5104b(m69213q), 256, new Size(mo80667b.width(), mo80667b.height()), new Rect(0, 0, mo80667b.width(), mo80667b.height()), mo5100b.mo80663f(), C46705p96.m19857r(mo5100b.mo80662g(), mo80667b), mo5100b.mo80668a());
        } catch (ImageUtil.CodecFailedException e) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e);
        }
    }
}
