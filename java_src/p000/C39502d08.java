package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* renamed from: d08  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39502d08 {

    /* renamed from: a */
    public final Map f75964a;

    /* renamed from: b */
    public final Map f75965b;

    /* renamed from: c */
    public final InterfaceC34919Od3 f75966c;

    public C39502d08(Map map, Map map2, InterfaceC34919Od3 interfaceC34919Od3) {
        this.f75964a = map;
        this.f75965b = map2;
        this.f75966c = interfaceC34919Od3;
    }

    /* renamed from: a */
    public final byte[] m44737a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C45755nZ7(byteArrayOutputStream, this.f75964a, this.f75965b, this.f75966c).m23523j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
