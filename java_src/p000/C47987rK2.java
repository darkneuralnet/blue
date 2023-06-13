package p000;

import com.google.protobuf.C18459C;
import com.google.protobuf.InterfaceC18458B;
/* renamed from: rK2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47987rK2 {

    /* renamed from: a */
    public static final InterfaceC18458B f106870a = m16052c();

    /* renamed from: b */
    public static final InterfaceC18458B f106871b = new C18459C();

    /* renamed from: a */
    public static InterfaceC18458B m16054a() {
        return f106870a;
    }

    /* renamed from: b */
    public static InterfaceC18458B m16053b() {
        return f106871b;
    }

    /* renamed from: c */
    public static InterfaceC18458B m16052c() {
        try {
            return (InterfaceC18458B) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
