package io.reactivex.rxkotlin;

import io.reactivex.functions.InterfaceC23478a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {1, 0, 3}, m28431k = 3, m28430mv = {1, 1, 15})
/* renamed from: io.reactivex.rxkotlin.j */
/* loaded from: classes8.dex */
public final class C24539j implements InterfaceC23478a {

    /* renamed from: b */
    public final /* synthetic */ Function0 f91184b;

    public C24539j(Function0 function0) {
        this.f91184b = function0;
    }

    @Override // io.reactivex.functions.InterfaceC23478a
    public final /* synthetic */ void run() {
        Intrinsics.checkExpressionValueIsNotNull(this.f91184b.invoke(), "invoke(...)");
    }
}
