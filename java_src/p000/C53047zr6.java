package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "Lkotlin/sequences/Sequence;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "ancestors", C17296a.f69688o, "allViews", "core-ktx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: zr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53047zr6 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "Landroid/view/View;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "androidx.core.view.ViewKt$allViews$1", m28418f = "View.kt", m28417i = {0}, m28416l = {414, 416}, m28415m = "invokeSuspend", m28414n = {"$this$sequence"}, m28413s = {"L$0"})
    /* renamed from: zr6$a */
    /* loaded from: classes.dex */
    public static final class C31576a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super View>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f122392h;

        /* renamed from: i */
        public /* synthetic */ Object f122393i;

        /* renamed from: j */
        public final /* synthetic */ View f122394j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31576a(View view, Continuation<? super C31576a> continuation) {
            super(2, continuation);
            this.f122394j = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31576a c31576a = new C31576a(this.f122394j, continuation);
            c31576a.f122393i = obj;
            return c31576a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SequenceScope sequenceScope;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f122392h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sequenceScope = (SequenceScope) this.f122393i;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f122393i;
                View view = this.f122394j;
                this.f122393i = sequenceScope;
                this.f122392h = 1;
                if (sequenceScope.yield(view, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            View view2 = this.f122394j;
            if (view2 instanceof ViewGroup) {
                Sequence<View> m37378c = C41782gr6.m37378c((ViewGroup) view2);
                this.f122393i = null;
                this.f122392h = 2;
                if (sequenceScope.yieldAll(m37378c, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super View> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C31576a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: zr6$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C31577b extends FunctionReferenceImpl implements Function1<ViewParent, ViewParent> {

        /* renamed from: b */
        public static final C31577b f122395b = new C31577b();

        public C31577b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ViewParent invoke(ViewParent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return p0.getParent();
        }
    }

    /* renamed from: a */
    public static final Sequence<View> m221a(View view) {
        Sequence<View> sequence;
        Intrinsics.checkNotNullParameter(view, "<this>");
        sequence = SequencesKt__SequenceBuilderKt.sequence(new C31576a(view, null));
        return sequence;
    }

    /* renamed from: b */
    public static final Sequence<ViewParent> m220b(View view) {
        Sequence<ViewParent> generateSequence;
        Intrinsics.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view.getParent(), C31577b.f122395b);
        return generateSequence;
    }
}
