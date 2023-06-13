package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"LtX3;", "LgW2;", "observer", "", "c", "(LtX3;LgW2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWu;", "LYW3;", "b", "(LWu;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
/* renamed from: E26 */
/* loaded from: classes.dex */
public final class E26 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", m28418f = "TextSelectionMouseDetector.kt", m28417i = {0}, m28416l = {125}, m28415m = "awaitMouseEventDown", m28414n = {"$this$awaitMouseEventDown"}, m28413s = {"L$0"})
    /* renamed from: E26$a */
    /* loaded from: classes.dex */
    public static final class C1722a extends ContinuationImpl {

        /* renamed from: h */
        public Object f6875h;

        /* renamed from: i */
        public /* synthetic */ Object f6876i;

        /* renamed from: j */
        public int f6877j;

        public C1722a(Continuation<? super C1722a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6876i = obj;
            this.f6877j |= Integer.MIN_VALUE;
            return E26.m109482b(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LWu;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", m28418f = "TextSelectionMouseDetector.kt", m28417i = {0, 0, 1, 1, 2, 2}, m28416l = {89, 96, 111}, m28415m = "invokeSuspend", m28414n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: E26$b */
    /* loaded from: classes.dex */
    public static final class C1723b extends RestrictedSuspendLambda implements Function2<InterfaceC9204Wu, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f6878h;

        /* renamed from: i */
        public int f6879i;

        /* renamed from: j */
        public /* synthetic */ Object f6880j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC41572gW2 f6881k;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: E26$b$a */
        /* loaded from: classes.dex */
        public static final class C1724a extends Lambda implements Function1<C43361jX3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC41572gW2 f6882g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1724a(InterfaceC41572gW2 interfaceC41572gW2) {
                super(1);
                this.f6882g = interfaceC41572gW2;
            }

            /* renamed from: a */
            public final void m109479a(C43361jX3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f6882g.mo5924c(it.m30359f())) {
                    it.m30364a();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3) {
                m109479a(c43361jX3);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LjX3;", "it", "", C17296a.f69688o, "(LjX3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: E26$b$b */
        /* loaded from: classes.dex */
        public static final class C1725b extends Lambda implements Function1<C43361jX3, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC41572gW2 f6883g;

            /* renamed from: h */
            public final /* synthetic */ InterfaceC35281Pr5 f6884h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1725b(InterfaceC41572gW2 interfaceC41572gW2, InterfaceC35281Pr5 interfaceC35281Pr5) {
                super(1);
                this.f6883g = interfaceC41572gW2;
                this.f6884h = interfaceC35281Pr5;
            }

            /* renamed from: a */
            public final void m109478a(C43361jX3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (this.f6883g.mo5925b(it.m30359f(), this.f6884h)) {
                    it.m30364a();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43361jX3 c43361jX3) {
                m109478a(c43361jX3);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1723b(InterfaceC41572gW2 interfaceC41572gW2, Continuation<? super C1723b> continuation) {
            super(2, continuation);
            this.f6881k = interfaceC41572gW2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1723b c1723b = new C1723b(this.f6881k, continuation);
            c1723b.f6880j = obj;
            return c1723b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(InterfaceC9204Wu interfaceC9204Wu, Continuation<? super Unit> continuation) {
            return ((C1723b) create(interfaceC9204Wu, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:14:0x0045). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            InterfaceC9204Wu interfaceC9204Wu;
            C40520ek0 c40520ek0;
            InterfaceC35281Pr5 m89691e;
            C1723b c1723b;
            Object m109482b;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6879i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c40520ek0 = (C40520ek0) this.f6878h;
                    ResultKt.throwOnFailure(obj);
                    interfaceC9204Wu = (InterfaceC9204Wu) this.f6880j;
                } else {
                    c40520ek0 = (C40520ek0) this.f6878h;
                    InterfaceC9204Wu interfaceC9204Wu2 = (InterfaceC9204Wu) this.f6880j;
                    ResultKt.throwOnFailure(obj);
                    C1723b c1723b2 = this;
                    YW3 yw3 = (YW3) obj;
                    c40520ek0.m42596d(yw3);
                    C43361jX3 c43361jX3 = yw3.m74945c().get(0);
                    if (C52553z16.m2013a(yw3)) {
                        if (c1723b2.f6881k.mo5923d(c43361jX3.m30359f())) {
                            c43361jX3.m30364a();
                            long m30360e = c43361jX3.m30360e();
                            C1724a c1724a = new C1724a(c1723b2.f6881k);
                            c1723b2.f6880j = interfaceC9204Wu2;
                            c1723b2.f6878h = c40520ek0;
                            c1723b2.f6879i = 2;
                            if (C47263q61.m18181f(interfaceC9204Wu2, m30360e, c1724a, c1723b2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        int m42599a = c40520ek0.m42599a();
                        if (m42599a != 1) {
                            if (m42599a != 2) {
                                m89691e = InterfaceC35281Pr5.f29167a.m89690f();
                            } else {
                                m89691e = InterfaceC35281Pr5.f29167a.m89689g();
                            }
                        } else {
                            m89691e = InterfaceC35281Pr5.f29167a.m89691e();
                        }
                        if (c1723b2.f6881k.mo5926a(c43361jX3.m30359f(), m89691e)) {
                            c43361jX3.m30364a();
                            long m30360e2 = c43361jX3.m30360e();
                            C1725b c1725b = new C1725b(c1723b2.f6881k, m89691e);
                            c1723b2.f6880j = interfaceC9204Wu2;
                            c1723b2.f6878h = c40520ek0;
                            c1723b2.f6879i = 3;
                            if (C47263q61.m18181f(interfaceC9204Wu2, m30360e2, c1725b, c1723b2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    interfaceC9204Wu = interfaceC9204Wu2;
                    c1723b = c1723b2;
                    c1723b.f6880j = interfaceC9204Wu;
                    c1723b.f6878h = c40520ek0;
                    c1723b.f6879i = 1;
                    m109482b = E26.m109482b(interfaceC9204Wu, c1723b);
                    if (m109482b == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    C1723b c1723b3 = c1723b;
                    interfaceC9204Wu2 = interfaceC9204Wu;
                    obj = m109482b;
                    c1723b2 = c1723b3;
                    YW3 yw32 = (YW3) obj;
                    c40520ek0.m42596d(yw32);
                    C43361jX3 c43361jX32 = yw32.m74945c().get(0);
                    if (C52553z16.m2013a(yw32)) {
                    }
                    interfaceC9204Wu = interfaceC9204Wu2;
                    c1723b = c1723b2;
                    c1723b.f6880j = interfaceC9204Wu;
                    c1723b.f6878h = c40520ek0;
                    c1723b.f6879i = 1;
                    m109482b = E26.m109482b(interfaceC9204Wu, c1723b);
                    if (m109482b == coroutine_suspended) {
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC9204Wu = (InterfaceC9204Wu) this.f6880j;
                c40520ek0 = new C40520ek0(interfaceC9204Wu.mo3400s());
            }
            c1723b = this;
            c1723b.f6880j = interfaceC9204Wu;
            c1723b.f6878h = c40520ek0;
            c1723b.f6879i = 1;
            m109482b = E26.m109482b(interfaceC9204Wu, c1723b);
            if (m109482b == coroutine_suspended) {
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m109482b(p000.InterfaceC9204Wu r10, kotlin.coroutines.Continuation<? super p000.YW3> r11) {
        /*
            boolean r0 = r11 instanceof p000.E26.C1722a
            if (r0 == 0) goto L13
            r0 = r11
            E26$a r0 = (p000.E26.C1722a) r0
            int r1 = r0.f6877j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6877j = r1
            goto L18
        L13:
            E26$a r0 = new E26$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f6876i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6877j
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.f6875h
            Wu r10 = (p000.InterfaceC9204Wu) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L45
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.ResultKt.throwOnFailure(r11)
        L38:
            aX3 r11 = p000.EnumC38007aX3.Main
            r0.f6875h = r10
            r0.f6877j = r3
            java.lang.Object r11 = r10.mo3401r0(r11, r0)
            if (r11 != r1) goto L45
            return r1
        L45:
            YW3 r11 = (p000.YW3) r11
            int r2 = r11.m74946b()
            boolean r2 = p000.C39193cX3.m61252b(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r11.m74945c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5b:
            if (r6 >= r4) goto L82
            java.lang.Object r7 = r2.get(r6)
            jX3 r7 = (p000.C43361jX3) r7
            int r8 = r7.m30353l()
            yX3$a r9 = p000.C52254yX3.f119686a
            int r9 = r9.m3351b()
            boolean r8 = p000.C52254yX3.m3355g(r8, r9)
            if (r8 == 0) goto L7b
            boolean r7 = p000.ZW3.m72998a(r7)
            if (r7 == 0) goto L7b
            r7 = r3
            goto L7c
        L7b:
            r7 = r5
        L7c:
            if (r7 != 0) goto L7f
            goto L83
        L7f:
            int r6 = r6 + 1
            goto L5b
        L82:
            r5 = r3
        L83:
            if (r5 == 0) goto L38
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.E26.m109482b(Wu, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: c */
    public static final Object m109481c(InterfaceC49290tX3 interfaceC49290tX3, InterfaceC41572gW2 interfaceC41572gW2, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m94550c = C34620Mw1.m94550c(interfaceC49290tX3, new C1723b(interfaceC41572gW2, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m94550c == coroutine_suspended ? m94550c : Unit.INSTANCE;
    }
}
