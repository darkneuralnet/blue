package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p000.C1577Df;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1", m28418f = "Text.kt", m28417i = {}, m28416l = {59}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1 */
/* loaded from: classes7.dex */
public final class TextKt$AnnotatedText$pressIndicator$1$1 extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {
    final /* synthetic */ EX2<C42484i26> $layoutResult$delegate;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ EX2<String> $pressedAnnotation$delegate;
    final /* synthetic */ C1577Df $resource;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$1", m28418f = "Text.kt", m28417i = {}, m28416l = {65}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189341 extends SuspendLambda implements Function3<N14, C32120Ce3, Continuation<? super Unit>, Object> {
        final /* synthetic */ EX2<C42484i26> $layoutResult$delegate;
        final /* synthetic */ EX2<String> $pressedAnnotation$delegate;
        final /* synthetic */ C1577Df $resource;
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C189341(C1577Df c1577Df, EX2<C42484i26> ex2, EX2<String> ex22, Continuation<? super C189341> continuation) {
            super(3, continuation);
            this.$resource = c1577Df;
            this.$layoutResult$delegate = ex2;
            this.$pressedAnnotation$delegate = ex22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(N14 n14, C32120Ce3 c32120Ce3, Continuation<? super Unit> continuation) {
            return m116435invoked4ec7I(n14, c32120Ce3.m111935x(), continuation);
        }

        /* renamed from: invoke-d-4ec7I  reason: not valid java name */
        public final Object m116435invoked4ec7I(N14 n14, long j, Continuation<? super Unit> continuation) {
            C189341 c189341 = new C189341(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, continuation);
            c189341.L$0 = n14;
            c189341.J$0 = j;
            return c189341.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C42484i26 AnnotatedText$lambda$4;
            C1577Df.C1580b c1580b;
            String str;
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
                N14 n14 = (N14) this.L$0;
                long j = this.J$0;
                AnnotatedText$lambda$4 = TextKt.AnnotatedText$lambda$4(this.$layoutResult$delegate);
                if (AnnotatedText$lambda$4 != null) {
                    c1580b = TextKt.m116434clickedAnnotationd4ec7I(AnnotatedText$lambda$4, j, this.$resource);
                } else {
                    c1580b = null;
                }
                EX2<String> ex2 = this.$pressedAnnotation$delegate;
                if (c1580b != null) {
                    str = (String) c1580b.m110028e();
                } else {
                    str = null;
                }
                ex2.setValue(str);
                this.label = 1;
                if (n14.mo92995H0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.$pressedAnnotation$delegate.setValue(null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.components.TextKt$AnnotatedText$pressIndicator$1$1$2 */
    /* loaded from: classes7.dex */
    public static final class C189352 extends Lambda implements Function1<C32120Ce3, Unit> {
        final /* synthetic */ EX2<C42484i26> $layoutResult$delegate;
        final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
        final /* synthetic */ C1577Df $resource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C189352(C1577Df c1577Df, EX2<C42484i26> ex2, Function1<? super String, Unit> function1) {
            super(1);
            this.$resource = c1577Df;
            this.$layoutResult$delegate = ex2;
            this.$onClickableTextClick = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m116436invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
            r3 = com.stripe.android.financialconnections.p041ui.components.TextKt.m116434clickedAnnotationd4ec7I(r0, r3, r2.$resource);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m116436invokek4lQ0M(long j) {
            C42484i26 AnnotatedText$lambda$4;
            C1577Df.C1580b m116434clickedAnnotationd4ec7I;
            AnnotatedText$lambda$4 = TextKt.AnnotatedText$lambda$4(this.$layoutResult$delegate);
            if (AnnotatedText$lambda$4 != null && m116434clickedAnnotationd4ec7I != null) {
                this.$onClickableTextClick.invoke(m116434clickedAnnotationd4ec7I.m110028e());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextKt$AnnotatedText$pressIndicator$1$1(C1577Df c1577Df, EX2<C42484i26> ex2, EX2<String> ex22, Function1<? super String, Unit> function1, Continuation<? super TextKt$AnnotatedText$pressIndicator$1$1> continuation) {
        super(2, continuation);
        this.$resource = c1577Df;
        this.$layoutResult$delegate = ex2;
        this.$pressedAnnotation$delegate = ex22;
        this.$onClickableTextClick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextKt$AnnotatedText$pressIndicator$1$1 textKt$AnnotatedText$pressIndicator$1$1 = new TextKt$AnnotatedText$pressIndicator$1$1(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, this.$onClickableTextClick, continuation);
        textKt$AnnotatedText$pressIndicator$1$1.L$0 = obj;
        return textKt$AnnotatedText$pressIndicator$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
        return ((TextKt$AnnotatedText$pressIndicator$1$1) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C189341 c189341 = new C189341(this.$resource, this.$layoutResult$delegate, this.$pressedAnnotation$delegate, null);
            C189352 c189352 = new C189352(this.$resource, this.$layoutResult$delegate, this.$onClickableTextClick);
            this.label = 1;
            if (KY5.m98768j(interfaceC49290tX3, null, null, c189341, c189352, this, 3, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
