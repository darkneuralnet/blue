package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: B39 */
/* loaded from: classes5.dex */
public final class B39 {

    /* renamed from: a */
    public final Map f1587a;

    /* renamed from: b */
    public final Map f1588b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f1589c;

    public B39(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f1587a = map;
        this.f1588b = map2;
        this.f1589c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m114759a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new M29(byteArrayOutputStream, this.f1587a, this.f1588b, this.f1589c).m95961j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
