package p000;

import com.google.crypto.tink.shaded.protobuf.C18148E;
import com.google.crypto.tink.shaded.protobuf.InterfaceC18147D;
/* renamed from: sK2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48579sK2 {

    /* renamed from: a */
    public static final InterfaceC18147D f108598a = m14393c();

    /* renamed from: b */
    public static final InterfaceC18147D f108599b = new C18148E();

    /* renamed from: a */
    public static InterfaceC18147D m14395a() {
        return f108598a;
    }

    /* renamed from: b */
    public static InterfaceC18147D m14394b() {
        return f108599b;
    }

    /* renamed from: c */
    public static InterfaceC18147D m14393c() {
        try {
            return (InterfaceC18147D) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
