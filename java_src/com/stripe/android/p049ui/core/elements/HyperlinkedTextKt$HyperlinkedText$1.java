package com.stripe.android.p049ui.core.elements;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C1577Df;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1", m28418f = "HyperlinkedText.kt", m28417i = {}, m28416l = {49}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1 */
/* loaded from: classes7.dex */
public final class HyperlinkedTextKt$HyperlinkedText$1 extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {
    final /* synthetic */ C1577Df $annotatedString;
    final /* synthetic */ EX2<C42484i26> $layoutResult;
    final /* synthetic */ InterfaceC32366Df6 $uriHandler;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$1$1 */
    /* loaded from: classes7.dex */
    public static final class C194061 extends Lambda implements Function1<C32120Ce3, Unit> {
        final /* synthetic */ C1577Df $annotatedString;
        final /* synthetic */ EX2<C42484i26> $layoutResult;
        final /* synthetic */ InterfaceC32366Df6 $uriHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194061(EX2<C42484i26> ex2, C1577Df c1577Df, InterfaceC32366Df6 interfaceC32366Df6) {
            super(1);
            this.$layoutResult = ex2;
            this.$annotatedString = c1577Df;
            this.$uriHandler = interfaceC32366Df6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m116664invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        public final void m116664invokek4lQ0M(long j) {
            Object firstOrNull;
            C42484i26 value = this.$layoutResult.getValue();
            if (value != null) {
                C1577Df c1577Df = this.$annotatedString;
                InterfaceC32366Df6 interfaceC32366Df6 = this.$uriHandler;
                int m34585w = value.m34585w(j);
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c1577Df.m110054h(m34585w, m34585w));
                C1577Df.C1580b c1580b = (C1577Df.C1580b) firstOrNull;
                if (c1580b != null && Intrinsics.areEqual(c1580b.m110026g(), "URL")) {
                    interfaceC32366Df6.openUri((String) c1580b.m110028e());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperlinkedTextKt$HyperlinkedText$1(EX2<C42484i26> ex2, C1577Df c1577Df, InterfaceC32366Df6 interfaceC32366Df6, Continuation<? super HyperlinkedTextKt$HyperlinkedText$1> continuation) {
        super(2, continuation);
        this.$layoutResult = ex2;
        this.$annotatedString = c1577Df;
        this.$uriHandler = interfaceC32366Df6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HyperlinkedTextKt$HyperlinkedText$1 hyperlinkedTextKt$HyperlinkedText$1 = new HyperlinkedTextKt$HyperlinkedText$1(this.$layoutResult, this.$annotatedString, this.$uriHandler, continuation);
        hyperlinkedTextKt$HyperlinkedText$1.L$0 = obj;
        return hyperlinkedTextKt$HyperlinkedText$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
        return ((HyperlinkedTextKt$HyperlinkedText$1) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC49290tX3 interfaceC49290tX3 = (InterfaceC49290tX3) this.L$0;
            C194061 c194061 = new C194061(this.$layoutResult, this.$annotatedString, this.$uriHandler);
            this.label = 1;
            if (KY5.m98768j(interfaceC49290tX3, null, null, null, c194061, this, 7, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
