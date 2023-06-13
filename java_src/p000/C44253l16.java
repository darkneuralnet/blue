package p000;

import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.focus.C11312i;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a:\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\u0011"}, m28432d2 = {"LgV2;", "LZ06;", "observer", "", "enabled", C17296a.f69688o, "Landroidx/compose/ui/focus/h;", "focusRequester", "LrX2;", "interactionSource", "Lkotlin/Function1;", "LWv1;", "", "onFocusChanged", "c", "LgW2;", "b", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: l16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44253l16 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", m28418f = "TextFieldGestureModifiers.kt", m28417i = {}, m28416l = {35}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: l16$a */
    /* loaded from: classes.dex */
    public static final class C25585a extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f95365h;

        /* renamed from: i */
        public /* synthetic */ Object f95366i;

        /* renamed from: j */
        public final /* synthetic */ Z06 f95367j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25585a(Z06 z06, Continuation<? super C25585a> continuation) {
            super(2, continuation);
            this.f95367j = z06;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25585a c25585a = new C25585a(this.f95367j, continuation);
            c25585a.f95366i = obj;
            return c25585a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C25585a) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95365h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Z06 z06 = this.f95367j;
                this.f95365h = 1;
                if (C44230kz2.m28049d((InterfaceC49290tX3) this.f95366i, z06, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LtX3;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", m28418f = "TextFieldGestureModifiers.kt", m28417i = {}, m28416l = {56}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: l16$b */
    /* loaded from: classes.dex */
    public static final class C25586b extends SuspendLambda implements Function2<InterfaceC49290tX3, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f95368h;

        /* renamed from: i */
        public /* synthetic */ Object f95369i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC41572gW2 f95370j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25586b(InterfaceC41572gW2 interfaceC41572gW2, Continuation<? super C25586b> continuation) {
            super(2, continuation);
            this.f95370j = interfaceC41572gW2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25586b c25586b = new C25586b(this.f95370j, continuation);
            c25586b.f95369i = obj;
            return c25586b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC49290tX3 interfaceC49290tX3, Continuation<? super Unit> continuation) {
            return ((C25586b) create(interfaceC49290tX3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95368h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41572gW2 interfaceC41572gW2 = this.f95370j;
                this.f95368h = 1;
                if (E26.m109481c((InterfaceC49290tX3) this.f95369i, interfaceC41572gW2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final InterfaceC41563gV2 m28019a(InterfaceC41563gV2 interfaceC41563gV2, Z06 observer, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (z) {
            return C52840zW5.m1270c(interfaceC41563gV2, observer, new C25585a(observer, null));
        }
        return interfaceC41563gV2;
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m28018b(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC41572gW2 observer, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (z) {
            return C52840zW5.m1270c(InterfaceC41563gV2.f82354b0, observer, new C25586b(observer, null));
        }
        return interfaceC41563gV2;
    }

    /* renamed from: c */
    public static final InterfaceC41563gV2 m28017c(InterfaceC41563gV2 interfaceC41563gV2, boolean z, C11309h focusRequester, InterfaceC48104rX2 interfaceC48104rX2, Function1<? super InterfaceC36951Wv1, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        return C38252aw1.m65236b(C11298b.m68823a(C11312i.m68775a(interfaceC41563gV2, focusRequester), onFocusChanged), z, interfaceC48104rX2);
    }
}
