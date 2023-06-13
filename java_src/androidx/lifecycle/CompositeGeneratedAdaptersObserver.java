package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/i;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "", "Landroidx/lifecycle/d;", "b", "[Landroidx/lifecycle/d;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/d;)V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC11728i {

    /* renamed from: b */
    public final InterfaceC11717d[] f54832b;

    public CompositeGeneratedAdaptersObserver(InterfaceC11717d[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f54832b = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        XT2 xt2 = new XT2();
        for (InterfaceC11717d interfaceC11717d : this.f54832b) {
            interfaceC11717d.mo45185a(source, event, false, xt2);
        }
        for (InterfaceC11717d interfaceC11717d2 : this.f54832b) {
            interfaceC11717d2.mo45185a(source, event, true, xt2);
        }
    }
}
