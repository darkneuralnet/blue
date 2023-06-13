package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.elements.TextFieldIcon;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2", m28418f = "TextFieldUI.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class TextFieldUIKt$AnimatedIcons$target$2 extends SuspendLambda implements Function2<InterfaceC43718k74<TextFieldIcon.Trailing>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ZC0 $composableScope;
    final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1", m28418f = "TextFieldUI.kt", m28417i = {0}, m28416l = {285}, m28415m = "invokeSuspend", m28414n = {"it"}, m28413s = {"L$2"})
    @SourceDebugExtension({"SMAP\nTextFieldUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,346:1\n1855#2,2:347\n*S KotlinDebug\n*F\n+ 1 TextFieldUI.kt\ncom/stripe/android/uicore/elements/TextFieldUIKt$AnimatedIcons$target$2$1\n*L\n284#1:347,2\n*E\n"})
    /* renamed from: com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2$1 */
    /* loaded from: classes7.dex */
    public static final class C194941 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC43718k74<TextFieldIcon.Trailing> $$this$produceState;
        final /* synthetic */ List<TextFieldIcon.Trailing> $icons;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194941(List<TextFieldIcon.Trailing> list, InterfaceC43718k74<TextFieldIcon.Trailing> interfaceC43718k74, Continuation<? super C194941> continuation) {
            super(2, continuation);
            this.$icons = list;
            this.$$this$produceState = interfaceC43718k74;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C194941(this.$icons, this.$$this$produceState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C194941) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:15:0x0051). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0028 -> B:10:0x0034). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r7.L$2
                com.stripe.android.uicore.elements.TextFieldIcon$Trailing r1 = (com.stripe.android.uicore.elements.TextFieldIcon.Trailing) r1
                java.lang.Object r3 = r7.L$1
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.L$0
                k74 r4 = (p000.InterfaceC43718k74) r4
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L51
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
            L28:
                java.util.List<com.stripe.android.uicore.elements.TextFieldIcon$Trailing> r1 = r8.$icons
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                k74<com.stripe.android.uicore.elements.TextFieldIcon$Trailing> r3 = r8.$$this$produceState
                java.util.Iterator r1 = r1.iterator()
                r4 = r3
                r3 = r1
            L34:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L28
                java.lang.Object r1 = r3.next()
                com.stripe.android.uicore.elements.TextFieldIcon$Trailing r1 = (com.stripe.android.uicore.elements.TextFieldIcon.Trailing) r1
                r8.L$0 = r4
                r8.L$1 = r3
                r8.L$2 = r1
                r8.label = r2
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r5 = p000.C48120rZ0.m15768a(r5, r8)
                if (r5 != r0) goto L51
                return r0
            L51:
                r4.setValue(r1)
                goto L34
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.uicore.elements.TextFieldUIKt$AnimatedIcons$target$2.C194941.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$AnimatedIcons$target$2(ZC0 zc0, List<TextFieldIcon.Trailing> list, Continuation<? super TextFieldUIKt$AnimatedIcons$target$2> continuation) {
        super(2, continuation);
        this.$composableScope = zc0;
        this.$icons = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextFieldUIKt$AnimatedIcons$target$2 textFieldUIKt$AnimatedIcons$target$2 = new TextFieldUIKt$AnimatedIcons$target$2(this.$composableScope, this.$icons, continuation);
        textFieldUIKt$AnimatedIcons$target$2.L$0 = obj;
        return textFieldUIKt$AnimatedIcons$target$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC43718k74<TextFieldIcon.Trailing> interfaceC43718k74, Continuation<? super Unit> continuation) {
        return ((TextFieldUIKt$AnimatedIcons$target$2) create(interfaceC43718k74, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Z30.m73800d(this.$composableScope, null, null, new C194941(this.$icons, (InterfaceC43718k74) this.L$0, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
