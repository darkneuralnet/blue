package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: CS7 */
/* loaded from: classes5.dex */
public final class CS7 {

    /* renamed from: a */
    public final Map f4097a;

    /* renamed from: b */
    public final Map f4098b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f4099c;

    public CS7(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f4097a = map;
        this.f4098b = map2;
        this.f4099c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m112225a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new JR7(byteArrayOutputStream, this.f4097a, this.f4098b, this.f4099c).m100452j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
