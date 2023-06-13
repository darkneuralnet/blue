package p000;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
/* renamed from: y */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30390y implements InterfaceC28515t5, FunctionAdapter {

    /* renamed from: b */
    public final /* synthetic */ Function1 f118555b;

    public C30390y(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f118555b = function;
    }

    @Override // p000.InterfaceC28515t5
    /* renamed from: a */
    public final /* synthetic */ void mo1514a(Object obj) {
        this.f118555b.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC28515t5) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.f118555b;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
