package com.stripe.android.uicore.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.text.HtmlKt$ClickableText$pressIndicator$1$1", m28418f = "Html.kt", m28417i = {}, m28416l = {399}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class HtmlKt$ClickableText$pressIndicator$1$1 extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {
    final /* synthetic */ EX2<C42484i26> $layoutResult;
    final /* synthetic */ Function1<Integer, Unit> $onClick;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n288#2,2:434\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$ClickableText$pressIndicator$1$1$1\n*L\n402#1:434,2\n*E\n"})
    /* renamed from: com.stripe.android.uicore.text.HtmlKt$ClickableText$pressIndicator$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C194991 extends Lambda implements Function1<C32120Ce3, Unit> {
        final /* synthetic */ EX2<C42484i26> $layoutResult;
        final /* synthetic */ Function1<Integer, Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C194991(EX2<C42484i26> ex2, Function1<? super Integer, Unit> function1) {
            super(1);
            this.$layoutResult = ex2;
            this.$onClick = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C32120Ce3 c32120Ce3) {
            m116774invokek4lQ0M(c32120Ce3.m111935x());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
            r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
         */
        /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m116774invokek4lQ0M(long j) {
            List filterNotNull;
            Object obj;
            boolean z;
            C42484i26 value = this.$layoutResult.getValue();
            if (value != null && (r0 = value.m34582z()) != null && filterNotNull != null) {
                Iterator it = filterNotNull.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        C35055Os4 c35055Os4 = (C35055Os4) obj;
                        if (C32120Ce3.m111944o(j) > C32120Ce3.m111944o(c35055Os4.m91254m()) && C32120Ce3.m111944o(j) < C32120Ce3.m111944o(c35055Os4.m91253n())) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C35055Os4 c35055Os42 = (C35055Os4) obj;
                if (c35055Os42 != null) {
                    j = C32120Ce3.m111950i(c35055Os42.m91253n(), C32120Ce3.m111944o(c35055Os42.m91253n()) + 0.1f, 0.0f, 2, null);
                }
            }
            C42484i26 value2 = this.$layoutResult.getValue();
            if (value2 != null) {
                this.$onClick.invoke(Integer.valueOf(value2.m34585w(j) - 1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$pressIndicator$1$1(EX2<C42484i26> ex2, Function1<? super Integer, Unit> function1, Continuation<? super HtmlKt$ClickableText$pressIndicator$1$1> continuation) {
        super(2, continuation);
        this.$layoutResult = ex2;
        this.$onClick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HtmlKt$ClickableText$pressIndicator$1$1 htmlKt$ClickableText$pressIndicator$1$1 = new HtmlKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, continuation);
        htmlKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return htmlKt$ClickableText$pressIndicator$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
        return ((HtmlKt$ClickableText$pressIndicator$1$1) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C194991 c194991 = new C194991(this.$layoutResult, this.$onClick);
            this.label = 1;
            if (KY5.m98768j(interfaceC49290tX3, null, null, null, c194991, this, 7, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
