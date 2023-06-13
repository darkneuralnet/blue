package p000;

import android.app.Application;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014¨\u0006\f"}, m28432d2 = {"LPy4;", "LAk1;", "LNy4;", "Landroid/app/Application;", "application", "", "", "", "extras", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Py4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35343Py4 extends AbstractC31704Ak1<InterfaceC34875Ny4> {

    /* renamed from: b */
    public static final C35343Py4 f29494b = new C35343Py4();

    private C35343Py4() {
    }

    @Override // p000.AbstractC31704Ak1
    /* renamed from: c */
    public InterfaceC34875Ny4 instantiateComponent(Application application, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(application, "application");
        return IO0.m102429a().mo93096a(C46172oG2.f101711a.m21419a(application));
    }
}
