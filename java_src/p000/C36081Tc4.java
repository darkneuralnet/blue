package p000;

import android.text.Spanned;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m28432d2 = {"LTc4;", "Lht5;", "", "LDW3;", "", "", "value", "c", "b", "<init>", "()V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Tc4  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36081Tc4 implements InterfaceC42394ht5<Map<DW3, ? extends CharSequence>, String> {

    /* renamed from: a */
    public static final C36081Tc4 f35781a = new C36081Tc4();

    private C36081Tc4() {
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: b */
    public Map<DW3, CharSequence> mo35621a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return C35847Sc4.f33962c.m85186a(value).m85188a();
    }

    @Override // p000.InterfaceC42394ht5
    /* renamed from: c */
    public String serialize(Map<DW3, ? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        boolean z = false;
        if (!value.isEmpty()) {
            Iterator<Map.Entry<DW3, ? extends CharSequence>> it = value.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next() instanceof Spanned) {
                    z = true;
                    break;
                }
            }
        }
        return new C35847Sc4(value, z).m85187b();
    }
}
