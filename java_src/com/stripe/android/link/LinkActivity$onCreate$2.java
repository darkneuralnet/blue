package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class LinkActivity$onCreate$2 extends FunctionReferenceImpl implements Function1<LinkActivityResult, Unit> {
    public LinkActivity$onCreate$2(Object obj) {
        super(1, obj, LinkActivity.class, "dismiss", "dismiss(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LinkActivityResult linkActivityResult) {
        invoke2(linkActivityResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkActivityResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LinkActivity) this.receiver).dismiss(p0);
    }
}
