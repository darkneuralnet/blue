package p000;

import android.view.View;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* renamed from: Yw */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10083Yw implements InterfaceC39881df3, FunctionAdapter {

    /* renamed from: b */
    public final /* synthetic */ Function1 f47643b;

    public C10083Yw(Function1 function1) {
        this.f47643b = function1;
    }

    @Override // p000.InterfaceC39881df3
    /* renamed from: a */
    public final /* synthetic */ void mo43928a(View view) {
        this.f47643b.invoke(view);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC39881df3) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.f47643b;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
