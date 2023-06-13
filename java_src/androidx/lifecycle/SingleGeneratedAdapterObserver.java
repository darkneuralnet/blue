package androidx.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/i;", "LLifecycleOwner;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroidx/lifecycle/f$a;", "event", "", "onStateChanged", "Landroidx/lifecycle/d;", "b", "Landroidx/lifecycle/d;", "generatedAdapter", "<init>", "(Landroidx/lifecycle/d;)V", "lifecycle-common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements InterfaceC11728i {

    /* renamed from: b */
    public final InterfaceC11717d f54889b;

    public SingleGeneratedAdapterObserver(InterfaceC11717d generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.f54889b = generatedAdapter;
    }

    @Override // androidx.lifecycle.InterfaceC11728i
    public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f54889b.mo45185a(source, event, false, null);
        this.f54889b.mo45185a(source, event, true, null);
    }
}
