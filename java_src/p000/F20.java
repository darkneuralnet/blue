package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LF20;", "LE20;", "LOs4;", "rect", "", "b", "(LOs4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LLX2;", "LH20;", C17296a.f69688o, "LLX2;", "c", "()LLX2;", "modifiers", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,154:1\n1182#2:155\n1161#2,2:156\n460#3,11:158\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n122#1:155\n122#1:156,2\n125#1:158,11\n*E\n"})
/* renamed from: F20 */
/* loaded from: classes.dex */
public final class F20 implements E20 {

    /* renamed from: a */
    public final LX2<H20> f8474a = new LX2<>(new H20[16], 0);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m28418f = "BringIntoViewRequester.kt", m28417i = {0, 0, 0, 0}, m28416l = {126}, m28415m = "bringIntoView", m28414n = {"rect", "content$iv", "size$iv", "i$iv"}, m28413s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: F20$a */
    /* loaded from: classes.dex */
    public static final class C2056a extends ContinuationImpl {

        /* renamed from: h */
        public Object f8475h;

        /* renamed from: i */
        public Object f8476i;

        /* renamed from: j */
        public int f8477j;

        /* renamed from: k */
        public int f8478k;

        /* renamed from: l */
        public /* synthetic */ Object f8479l;

        /* renamed from: n */
        public int f8481n;

        public C2056a(Continuation<? super C2056a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8479l = obj;
            this.f8481n |= Integer.MIN_VALUE;
            return F20.this.mo108092b(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r8 < r2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please submit an issue!!! */
    @Override // p000.E20
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo108092b(C35055Os4 c35055Os4, Continuation<? super Unit> continuation) {
        C2056a c2056a;
        Object coroutine_suspended;
        int i;
        int m96690u;
        C35055Os4 c35055Os42;
        int i2;
        Object[] objArr;
        if (continuation instanceof C2056a) {
            c2056a = (C2056a) continuation;
            int i3 = c2056a.f8481n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2056a.f8481n = i3 - Integer.MIN_VALUE;
                Object obj = c2056a.f8479l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2056a.f8481n;
                if (i == 0) {
                    if (i == 1) {
                        i2 = c2056a.f8478k;
                        m96690u = c2056a.f8477j;
                        ResultKt.throwOnFailure(obj);
                        c35055Os42 = (C35055Os4) c2056a.f8475h;
                        objArr = (Object[]) c2056a.f8476i;
                        i2++;
                        r4 = objArr;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LX2<H20> lx2 = this.f8474a;
                    m96690u = lx2.m96690u();
                    if (m96690u > 0) {
                        Object[] m96691s = lx2.m96691s();
                        c35055Os42 = c35055Os4;
                        i2 = 0;
                        Object[] objArr2 = m96691s;
                        c2056a.f8475h = c35055Os42;
                        c2056a.f8476i = objArr2;
                        c2056a.f8477j = m96690u;
                        c2056a.f8478k = i2;
                        c2056a.f8481n = 1;
                        Object m104490h = ((H20) objArr2[i2]).m104490h(c35055Os42, c2056a);
                        objArr = objArr2;
                        if (m104490h == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        objArr2 = objArr;
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        c2056a = new C2056a(continuation);
        Object obj2 = c2056a.f8479l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2056a.f8481n;
        if (i == 0) {
        }
    }

    /* renamed from: c */
    public final LX2<H20> m108091c() {
        return this.f8474a;
    }
}
