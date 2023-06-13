package p000;

import com.facebook.share.internal.C17296a;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"", "", C17296a.f69688o, "Li30;", "b", "(Li30;)Z", "isProbablyPlainText", "LM70;", "c", "(LM70;)Z", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkioUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkioUtils.kt\ncom/chuckerteam/chucker/internal/support/OkioUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,34:1\n1206#2,2:35\n*S KotlinDebug\n*F\n+ 1 OkioUtils.kt\ncom/chuckerteam/chucker/internal/support/OkioUtilsKt\n*L\n22#1:35,2\n*E\n"})
/* renamed from: Pe3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35162Pe3 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.OkioUtilsKt$isProbablyPlainText$1", m28418f = "OkioUtils.kt", m28417i = {0}, m28416l = {20}, m28415m = "invokeSuspend", m28414n = {"$this$sequence"}, m28413s = {"L$0"})
    /* renamed from: Pe3$a */
    /* loaded from: classes5.dex */
    public static final class C6420a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f28790h;

        /* renamed from: i */
        public /* synthetic */ Object f28791i;

        /* renamed from: j */
        public final /* synthetic */ C42488i30 f28792j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6420a(C42488i30 c42488i30, Continuation<? super C6420a> continuation) {
            super(2, continuation);
            this.f28792j = c42488i30;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C6420a c6420a = new C6420a(this.f28792j, continuation);
            c6420a.f28791i = obj;
            return c6420a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            SequenceScope sequenceScope;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f28790h;
            if (i != 0) {
                if (i == 1) {
                    sequenceScope = (SequenceScope) this.f28791i;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                sequenceScope = (SequenceScope) this.f28791i;
            }
            while (!this.f28792j.mo21945O2()) {
                Integer boxInt = Boxing.boxInt(this.f28792j.m34572I());
                this.f28791i = sequenceScope;
                this.f28790h = 1;
                if (sequenceScope.yield(boxInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C6420a) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: a */
    public static final boolean m90043a(int i) {
        return Character.isWhitespace(i) || !Character.isISOControl(i);
    }

    /* renamed from: b */
    public static final boolean m90042b(C42488i30 c42488i30) {
        Sequence sequence;
        Sequence<Number> take;
        Intrinsics.checkNotNullParameter(c42488i30, "<this>");
        try {
            C42488i30 c42488i302 = new C42488i30();
            c42488i30.m34553l(c42488i302, 0L, Math.min(c42488i30.size(), 64L));
            sequence = SequencesKt__SequenceBuilderKt.sequence(new C6420a(c42488i302, null));
            take = SequencesKt___SequencesKt.take(sequence, 16);
            for (Number number : take) {
                if (!m90043a(number.intValue())) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m90041c(M70 m70) {
        Intrinsics.checkNotNullParameter(m70, "<this>");
        return m90042b(new C42488i30().m34566W(m70, 0, Math.min(m70.size(), 64)));
    }
}
