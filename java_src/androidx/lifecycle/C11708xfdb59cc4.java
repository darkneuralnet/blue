package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/i;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "lifecycle-runtime-ktx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* loaded from: classes.dex */
public final class C11708xfdb59cc4 implements InterfaceC11728i {

    /* renamed from: b */
    public final /* synthetic */ AbstractC11719f.EnumC11724b f54890b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC11719f f54891c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC36779Wc0<Object> f54892d;

    /* renamed from: e */
    public final /* synthetic */ Function0<Object> f54893e;

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Object m116783constructorimpl;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC11719f.EnumC11720a.Companion.m67015c(this.f54890b)) {
            this.f54891c.mo67006d(this);
            InterfaceC36779Wc0<Object> interfaceC36779Wc0 = this.f54892d;
            Function0<Object> function0 = this.f54893e;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(function0.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            interfaceC36779Wc0.resumeWith(m116783constructorimpl);
        } else if (event == AbstractC11719f.EnumC11720a.ON_DESTROY) {
            this.f54891c.mo67006d(this);
            InterfaceC36779Wc0<Object> interfaceC36779Wc02 = this.f54892d;
            Result.Companion companion3 = Result.Companion;
            interfaceC36779Wc02.resumeWith(Result.m116783constructorimpl(ResultKt.createFailure(new LifecycleDestroyedException())));
        }
    }
}
