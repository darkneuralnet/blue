package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p000.C43744kA0;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LD20;", "", "LkA0$a;", "request", "", "c", "", DateTokenConverter.CONVERTER_KEY, "", "cause", "b", "LLX2;", C17296a.f69688o, "LLX2;", "requests", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1182#2:138\n1161#2,2:139\n53#3:141\n523#3:142\n523#3:143\n492#3,11:144\n53#3:155\n523#3:156\n48#3:157\n664#3,2:158\n523#3:160\n13579#4,2:161\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n72#1:141\n73#1:142\n91#1:143\n107#1:144,11\n111#1:155\n112#1:156\n121#1:157\n132#1:158,2\n132#1:160\n132#1:161,2\n*E\n"})
/* renamed from: D20 */
/* loaded from: classes.dex */
public final class D20 {

    /* renamed from: a */
    public final LX2<C43744kA0.C25120a> f5099a = new LX2<>(new C43744kA0.C25120a[16], 0);

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D20$a */
    /* loaded from: classes.dex */
    public static final class C1335a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C43744kA0.C25120a f5101h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1335a(C43744kA0.C25120a c25120a) {
            super(1);
            this.f5101h = c25120a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            D20.this.f5099a.m96709A(this.f5101h);
        }
    }

    /* renamed from: b */
    public final void m111030b(Throwable th) {
        LX2<C43744kA0.C25120a> lx2 = this.f5099a;
        int m96690u = lx2.m96690u();
        InterfaceC36779Wc0[] interfaceC36779Wc0Arr = new InterfaceC36779Wc0[m96690u];
        for (int i = 0; i < m96690u; i++) {
            interfaceC36779Wc0Arr[i] = lx2.m96691s()[i].m29209a();
        }
        for (int i2 = 0; i2 < m96690u; i2++) {
            interfaceC36779Wc0Arr[i2].mo76765v(th);
        }
        if (this.f5099a.m96688w()) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final boolean m111029c(C43744kA0.C25120a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        C35055Os4 invoke = request.m29208b().invoke();
        if (invoke == null) {
            InterfaceC36779Wc0<Unit> m29209a = request.m29209a();
            Result.Companion companion = Result.Companion;
            m29209a.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            return false;
        }
        request.m29209a().mo76794H(new C1335a(request));
        IntRange intRange = new IntRange(0, this.f5099a.m96690u() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                C35055Os4 invoke2 = this.f5099a.m96691s()[last].m29208b().invoke();
                if (invoke2 != null) {
                    C35055Os4 m91251p = invoke.m91251p(invoke2);
                    if (Intrinsics.areEqual(m91251p, invoke)) {
                        this.f5099a.m96702a(last + 1, request);
                        return true;
                    } else if (!Intrinsics.areEqual(m91251p, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int m96690u = this.f5099a.m96690u() - 1;
                        if (m96690u <= last) {
                            while (true) {
                                this.f5099a.m96691s()[last].m29209a().mo76765v(cancellationException);
                                if (m96690u == last) {
                                    break;
                                }
                                m96690u++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.f5099a.m96702a(0, request);
        return true;
    }

    /* renamed from: d */
    public final void m111028d() {
        IntRange intRange = new IntRange(0, this.f5099a.m96690u() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (true) {
                this.f5099a.m96691s()[first].m29209a().resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                if (first == last) {
                    break;
                }
                first++;
            }
        }
        this.f5099a.m96696h();
    }
}
