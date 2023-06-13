package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: ur7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50084ur7 {

    /* renamed from: a */
    public final Map f113101a;

    /* renamed from: b */
    public final Map f113102b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f113103c;

    public C50084ur7(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f113101a = map;
        this.f113102b = map2;
        this.f113103c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m9647a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C36660Vo7(byteArrayOutputStream, this.f113101a, this.f113102b, this.f113103c).m79404j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
