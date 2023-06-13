package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: V28 */
/* loaded from: classes5.dex */
public final class V28 {

    /* renamed from: a */
    public final Map f38458a;

    /* renamed from: b */
    public final Map f38459b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f38460c;

    public V28(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f38458a = map;
        this.f38459b = map2;
        this.f38460c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m80467a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C40707f28(byteArrayOutputStream, this.f38458a, this.f38459b, this.f38460c).m42252j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
