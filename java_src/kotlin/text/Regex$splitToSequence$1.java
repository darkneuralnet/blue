package kotlin.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "kotlin.text.Regex$splitToSequence$1", m28418f = "Regex.kt", m28417i = {1, 1, 1}, m28416l = {276, 284, 288}, m28415m = "invokeSuspend", m28414n = {"$this$sequence", "matcher", "splitCount"}, m28413s = {"L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $limit;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Regex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Regex$splitToSequence$1(Regex regex, CharSequence charSequence, int i, Continuation<? super Regex$splitToSequence$1> continuation) {
        super(2, continuation);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.this$0, this.$input, this.$limit, continuation);
        regex$splitToSequence$1.L$0 = obj;
        return regex$splitToSequence$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Pattern pattern;
        Regex$splitToSequence$1 regex$splitToSequence$1;
        SequenceScope sequenceScope;
        Matcher matcher;
        int i;
        String obj2;
        String obj3;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                sequenceScope = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                regex$splitToSequence$1 = this;
                matcher = (Matcher) this.L$1;
                r5 = matcher.end();
                i++;
                if (i != regex$splitToSequence$1.$limit - 1 || !matcher.find()) {
                    CharSequence charSequence = regex$splitToSequence$1.$input;
                    obj3 = charSequence.subSequence(r5, charSequence.length()).toString();
                    regex$splitToSequence$1.L$0 = null;
                    regex$splitToSequence$1.L$1 = null;
                    regex$splitToSequence$1.label = 3;
                    if (sequenceScope.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                obj2 = regex$splitToSequence$1.$input.subSequence(r5, matcher.start()).toString();
                regex$splitToSequence$1.L$0 = sequenceScope;
                regex$splitToSequence$1.L$1 = matcher;
                regex$splitToSequence$1.I$0 = i;
                regex$splitToSequence$1.label = 2;
                if (sequenceScope.yield(obj2, regex$splitToSequence$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r5 = matcher.end();
                i++;
                if (i != regex$splitToSequence$1.$limit - 1) {
                }
                CharSequence charSequence2 = regex$splitToSequence$1.$input;
                obj3 = charSequence2.subSequence(r5, charSequence2.length()).toString();
                regex$splitToSequence$1.L$0 = null;
                regex$splitToSequence$1.L$1 = null;
                regex$splitToSequence$1.label = 3;
                if (sequenceScope.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            pattern = this.this$0.nativePattern;
            Matcher matcher2 = pattern.matcher(this.$input);
            if (this.$limit != 1 && matcher2.find()) {
                int i3 = 0;
                regex$splitToSequence$1 = this;
                sequenceScope = sequenceScope2;
                matcher = matcher2;
                i = 0;
                obj2 = regex$splitToSequence$1.$input.subSequence(i3, matcher.start()).toString();
                regex$splitToSequence$1.L$0 = sequenceScope;
                regex$splitToSequence$1.L$1 = matcher;
                regex$splitToSequence$1.I$0 = i;
                regex$splitToSequence$1.label = 2;
                if (sequenceScope.yield(obj2, regex$splitToSequence$1) == coroutine_suspended) {
                }
                i3 = matcher.end();
                i++;
                if (i != regex$splitToSequence$1.$limit - 1) {
                }
                CharSequence charSequence22 = regex$splitToSequence$1.$input;
                obj3 = charSequence22.subSequence(i3, charSequence22.length()).toString();
                regex$splitToSequence$1.L$0 = null;
                regex$splitToSequence$1.L$1 = null;
                regex$splitToSequence$1.label = 3;
                if (sequenceScope.yield(obj3, regex$splitToSequence$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
            String obj4 = this.$input.toString();
            this.label = 1;
            if (sequenceScope2.yield(obj4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
        return ((Regex$splitToSequence$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}