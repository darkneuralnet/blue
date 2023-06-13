package p000;

import android.content.Context;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: KU2 */
/* loaded from: classes2.dex */
public final class KU2 implements JU2 {

    /* renamed from: a */
    public final LU2 f19678a;

    public KU2(LU2 lu2) {
        this.f19678a = lu2;
    }

    /* renamed from: b */
    public static Y94<JU2> m98837b(LU2 lu2) {
        return C39546d52.m44621a(new KU2(lu2));
    }

    @Override // p000.JU2
    /* renamed from: a */
    public IU2 mo98838a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, Context context) {
        return this.f19678a.m96892b(lifecycleScopeProvider, context);
    }
}
