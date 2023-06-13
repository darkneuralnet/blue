package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: gT7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41550gT7 {

    /* renamed from: a */
    public final Map f82276a;

    /* renamed from: b */
    public final Map f82277b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f82278c;

    public C41550gT7(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f82276a = map;
        this.f82277b = map2;
        this.f82278c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m39362a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C45099mS7(byteArrayOutputStream, this.f82276a, this.f82277b, this.f82278c).m25581j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
