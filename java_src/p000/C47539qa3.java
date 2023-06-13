package p000;

import android.app.Application;
import androidx.fragment.app.FragmentManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC46946pa3;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014¨\u0006\f"}, m28432d2 = {"Lqa3;", "LAk1;", "Lpa3;", "Landroid/app/Application;", "application", "", "", "", "extras", "c", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qa3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47539qa3 extends AbstractC31704Ak1<InterfaceC46946pa3> {

    /* renamed from: b */
    public static final C47539qa3 f105440b = new C47539qa3();

    private C47539qa3() {
    }

    @Override // p000.AbstractC31704Ak1
    /* renamed from: c */
    public InterfaceC46946pa3 instantiateComponent(Application application, Map<String, ? extends Object> map) {
        Object obj;
        Intrinsics.checkNotNullParameter(application, "application");
        InterfaceC46946pa3.InterfaceC27318a m107301a = FM0.m107301a();
        InterfaceC44393lG2 m21419a = C46172oG2.f101711a.m21419a(application);
        if (map != null) {
            obj = map.get("fragment_manager");
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentManager");
        Object obj2 = map.get("container_id");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        return m107301a.mo19098a(m21419a, new C38657bd3((FragmentManager) obj, ((Integer) obj2).intValue()));
    }
}
