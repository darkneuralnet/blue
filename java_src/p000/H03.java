package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: H03 */
/* loaded from: classes2.dex */
public final class H03 implements F03 {

    /* renamed from: a */
    public final K03 f12718a;

    public H03(K03 k03) {
        this.f12718a = k03;
    }

    /* renamed from: b */
    public static Y94<F03> m104506b(K03 k03) {
        return C39546d52.m44621a(new H03(k03));
    }

    @Override // p000.F03
    /* renamed from: a */
    public C03 mo104507a(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, N03 n03) {
        return this.f12718a.m99360b(lifecycleScopeProvider, n03);
    }
}
