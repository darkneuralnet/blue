package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: FX7 */
/* loaded from: classes5.dex */
public final class FX7 {

    /* renamed from: a */
    public final Map f9613a;

    /* renamed from: b */
    public final Map f9614b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f9615c;

    public FX7(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f9613a = map;
        this.f9614b = map2;
        this.f9615c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m107019a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new MW7(byteArrayOutputStream, this.f9613a, this.f9614b, this.f9615c).m95228j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
