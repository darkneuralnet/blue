package io.reactivex.rxkotlin;

import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28431k = 3, m28430mv = {1, 1, 15})
/* renamed from: io.reactivex.rxkotlin.k */
/* loaded from: classes8.dex */
public final class C24540k implements InterfaceC23484g {

    /* renamed from: b */
    public final /* synthetic */ Function1 f91185b;

    public C24540k(Function1 function1) {
        this.f91185b = function1;
    }

    @Override // io.reactivex.functions.InterfaceC23484g
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f91185b.invoke(obj), "invoke(...)");
    }
}
