package p000;

import android.content.Context;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"LoG2;", "", "Landroid/content/Context;", "applicationContext", "LlG2;", C17296a.f69688o, "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oG2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46172oG2 {

    /* renamed from: a */
    public static final C46172oG2 f101711a = new C46172oG2();

    private C46172oG2() {
    }

    /* renamed from: a */
    public final InterfaceC44393lG2 m21419a(Context applicationContext) {
        InterfaceC44986mG2 interfaceC44986mG2;
        InterfaceC44393lG2 mo25860a;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (applicationContext instanceof InterfaceC44986mG2) {
            interfaceC44986mG2 = (InterfaceC44986mG2) applicationContext;
        } else {
            interfaceC44986mG2 = null;
        }
        if (interfaceC44986mG2 != null && (mo25860a = interfaceC44986mG2.mo25860a()) != null) {
            return mo25860a;
        }
        throw new IllegalStateException("The application context you have passed does not implement MainComponentHolder");
    }
}
