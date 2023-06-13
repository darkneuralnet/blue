package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B$\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u0013\u0010\f\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0004R!\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR!\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,\"\u0004\b-\u0010.R+\u00100\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010+\u001a\u0004\b#\u0010,\"\u0004\b*\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, m28432d2 = {"Lqb5;", "", "", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "LI61;", "Lpm0;", "color", "e", "(LI61;J)V", "f", "g", "LCe3;", C17296a.f69688o, "LCe3;", AnalyticsRequestV2.HEADER_ORIGIN, "Lk61;", "b", "F", "radius", "", "c", "Z", "bounded", "", "Ljava/lang/Float;", "startRadius", "targetRadius", "targetCenter", "Lne;", "Lsf;", "Lne;", "animatedAlpha", "animatedRadiusPercent", "i", "animatedCenterPercent", "Lis0;", "j", "Lis0;", "finishSignalDeferred", "<set-?>", "k", "LEX2;", "()Z", "l", "(Z)V", "finishedFadingIn", "finishRequested", "<init>", "(LCe3;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n76#2:195\n102#2,2:196\n76#2:198\n102#2,2:199\n138#3:201\n214#4,8:202\n261#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
/* renamed from: qb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47551qb5 {

    /* renamed from: a */
    public C32120Ce3 f105460a;

    /* renamed from: b */
    public final float f105461b;

    /* renamed from: c */
    public final boolean f105462c;

    /* renamed from: d */
    public Float f105463d;

    /* renamed from: e */
    public Float f105464e;

    /* renamed from: f */
    public C32120Ce3 f105465f;

    /* renamed from: g */
    public final C26560ne<Float, C28366sf> f105466g;

    /* renamed from: h */
    public final C26560ne<Float, C28366sf> f105467h;

    /* renamed from: i */
    public final C26560ne<Float, C28366sf> f105468i;

    /* renamed from: j */
    public final InterfaceC42972is0<Unit> f105469j;

    /* renamed from: k */
    public final EX2 f105470k;

    /* renamed from: l */
    public final EX2 f105471l;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation", m28418f = "RippleAnimation.kt", m28417i = {0, 1}, m28416l = {80, 82, 83}, m28415m = "animate", m28414n = {"this", "this"}, m28413s = {"L$0", "L$0"})
    /* renamed from: qb5$a */
    /* loaded from: classes.dex */
    public static final class C27631a extends ContinuationImpl {

        /* renamed from: h */
        public Object f105472h;

        /* renamed from: i */
        public /* synthetic */ Object f105473i;

        /* renamed from: k */
        public int f105475k;

        public C27631a(Continuation<? super C27631a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f105473i = obj;
            this.f105475k |= Integer.MIN_VALUE;
            return C47551qb5.this.m17345d(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lzh2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: qb5$b */
    /* loaded from: classes.dex */
    public static final class C27632b extends SuspendLambda implements Function2<ZC0, Continuation<? super InterfaceC52943zh2>, Object> {

        /* renamed from: h */
        public int f105476h;

        /* renamed from: i */
        public /* synthetic */ Object f105477i;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {89}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: qb5$b$a */
        /* loaded from: classes.dex */
        public static final class C27633a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f105479h;

            /* renamed from: i */
            public final /* synthetic */ C47551qb5 f105480i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27633a(C47551qb5 c47551qb5, Continuation<? super C27633a> continuation) {
                super(2, continuation);
                this.f105480i = c47551qb5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C27633a(this.f105480i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C27633a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f105479h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26560ne c26560ne = this.f105480i.f105466g;
                    Float boxFloat = Boxing.boxFloat(1.0f);
                    C49330tb6 m25219k = C26160mf.m25219k(75, 0, C42549i91.m34394c(), 2, null);
                    this.f105479h = 1;
                    if (C26560ne.m23393f(c26560ne, boxFloat, m25219k, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {95}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: qb5$b$b */
        /* loaded from: classes.dex */
        public static final class C27634b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f105481h;

            /* renamed from: i */
            public final /* synthetic */ C47551qb5 f105482i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27634b(C47551qb5 c47551qb5, Continuation<? super C27634b> continuation) {
                super(2, continuation);
                this.f105482i = c47551qb5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C27634b(this.f105482i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C27634b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f105481h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26560ne c26560ne = this.f105482i.f105467h;
                    Float boxFloat = Boxing.boxFloat(1.0f);
                    C49330tb6 m25219k = C26160mf.m25219k(225, 0, C42549i91.m34395b(), 2, null);
                    this.f105481h = 1;
                    if (C26560ne.m23393f(c26560ne, boxFloat, m25219k, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {101}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: qb5$b$c */
        /* loaded from: classes.dex */
        public static final class C27635c extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f105483h;

            /* renamed from: i */
            public final /* synthetic */ C47551qb5 f105484i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27635c(C47551qb5 c47551qb5, Continuation<? super C27635c> continuation) {
                super(2, continuation);
                this.f105484i = c47551qb5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C27635c(this.f105484i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C27635c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f105483h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26560ne c26560ne = this.f105484i.f105468i;
                    Float boxFloat = Boxing.boxFloat(1.0f);
                    C49330tb6 m25219k = C26160mf.m25219k(225, 0, C42549i91.m34394c(), 2, null);
                    this.f105483h = 1;
                    if (C26560ne.m23393f(c26560ne, boxFloat, m25219k, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C27632b(Continuation<? super C27632b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27632b c27632b = new C27632b(continuation);
            c27632b.f105477i = obj;
            return c27632b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super InterfaceC52943zh2> continuation) {
            return ((C27632b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC52943zh2 m73800d;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f105476h == 0) {
                ResultKt.throwOnFailure(obj);
                ZC0 zc0 = (ZC0) this.f105477i;
                Z30.m73800d(zc0, null, null, new C27633a(C47551qb5.this, null), 3, null);
                Z30.m73800d(zc0, null, null, new C27634b(C47551qb5.this, null), 3, null);
                m73800d = Z30.m73800d(zc0, null, null, new C27635c(C47551qb5.this, null), 3, null);
                return m73800d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lzh2;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: qb5$c */
    /* loaded from: classes.dex */
    public static final class C27636c extends SuspendLambda implements Function2<ZC0, Continuation<? super InterfaceC52943zh2>, Object> {

        /* renamed from: h */
        public int f105485h;

        /* renamed from: i */
        public /* synthetic */ Object f105486i;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", m28418f = "RippleAnimation.kt", m28417i = {}, m28416l = {112}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: qb5$c$a */
        /* loaded from: classes.dex */
        public static final class C27637a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f105488h;

            /* renamed from: i */
            public final /* synthetic */ C47551qb5 f105489i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C27637a(C47551qb5 c47551qb5, Continuation<? super C27637a> continuation) {
                super(2, continuation);
                this.f105489i = c47551qb5;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C27637a(this.f105489i, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C27637a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f105488h;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26560ne c26560ne = this.f105489i.f105466g;
                    Float boxFloat = Boxing.boxFloat(0.0f);
                    C49330tb6 m25219k = C26160mf.m25219k(150, 0, C42549i91.m34394c(), 2, null);
                    this.f105488h = 1;
                    if (C26560ne.m23393f(c26560ne, boxFloat, m25219k, null, null, this, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C27636c(Continuation<? super C27636c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C27636c c27636c = new C27636c(continuation);
            c27636c.f105486i = obj;
            return c27636c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super InterfaceC52943zh2> continuation) {
            return ((C27636c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC52943zh2 m73800d;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f105485h == 0) {
                ResultKt.throwOnFailure(obj);
                m73800d = Z30.m73800d((ZC0) this.f105486i, null, null, new C27637a(C47551qb5.this, null), 3, null);
                return m73800d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ C47551qb5(C32120Ce3 c32120Ce3, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(c32120Ce3, f, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17345d(Continuation<? super Unit> continuation) {
        C27631a c27631a;
        Object coroutine_suspended;
        int i;
        C47551qb5 c47551qb5;
        InterfaceC42972is0<Unit> interfaceC42972is0;
        if (continuation instanceof C27631a) {
            c27631a = (C27631a) continuation;
            int i2 = c27631a.f105475k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27631a.f105475k = i2 - Integer.MIN_VALUE;
                Object obj = c27631a.f105473i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c27631a.f105475k;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c47551qb5 = (C47551qb5) c27631a.f105472h;
                        ResultKt.throwOnFailure(obj);
                        c27631a.f105472h = null;
                        c27631a.f105475k = 3;
                        if (c47551qb5.m17342g(c27631a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    c47551qb5 = (C47551qb5) c27631a.f105472h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    c27631a.f105472h = this;
                    c27631a.f105475k = 1;
                    if (m17343f(c27631a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c47551qb5 = this;
                }
                c47551qb5.m17337l(true);
                interfaceC42972is0 = c47551qb5.f105469j;
                c27631a.f105472h = c47551qb5;
                c27631a.f105475k = 2;
                if (interfaceC42972is0.mo29821k(c27631a) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c27631a.f105472h = null;
                c27631a.f105475k = 3;
                if (c47551qb5.m17342g(c27631a) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        c27631a = new C27631a(continuation);
        Object obj2 = c27631a.f105473i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c27631a.f105475k;
        if (i == 0) {
        }
        c47551qb5.m17337l(true);
        interfaceC42972is0 = c47551qb5.f105469j;
        c27631a.f105472h = c47551qb5;
        c27631a.f105475k = 2;
        if (interfaceC42972is0.mo29821k(c27631a) == coroutine_suspended) {
        }
        c27631a.f105472h = null;
        c27631a.f105475k = 3;
        if (c47551qb5.m17342g(c27631a) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public final void m17344e(I61 draw, long j) {
        float floatValue;
        Float valueOf;
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (this.f105463d == null) {
            this.f105463d = Float.valueOf(C48144rb5.m15715b(draw.mo96360h()));
        }
        if (this.f105464e == null) {
            if (Float.isNaN(this.f105461b)) {
                valueOf = Float.valueOf(C48144rb5.m15716a(draw, this.f105462c, draw.mo96360h()));
            } else {
                valueOf = Float.valueOf(draw.mo3411T0(this.f105461b));
            }
            this.f105464e = valueOf;
        }
        if (this.f105460a == null) {
            this.f105460a = C32120Ce3.m111955d(draw.mo96359l0());
        }
        if (this.f105465f == null) {
            this.f105465f = C32120Ce3.m111955d(C33056Ge3.m104938a(C51465xB5.m5730i(draw.mo96360h()) / 2.0f, C51465xB5.m5732g(draw.mo96360h()) / 2.0f));
        }
        if (m17340i() && !m17339j()) {
            floatValue = 1.0f;
        } else {
            floatValue = this.f105466g.m23385n().floatValue();
        }
        Float f = this.f105463d;
        Intrinsics.checkNotNull(f);
        float floatValue2 = f.floatValue();
        Float f2 = this.f105464e;
        Intrinsics.checkNotNull(f2);
        float m75146a = YM2.m75146a(floatValue2, f2.floatValue(), this.f105467h.m23385n().floatValue());
        C32120Ce3 c32120Ce3 = this.f105460a;
        Intrinsics.checkNotNull(c32120Ce3);
        float m111944o = C32120Ce3.m111944o(c32120Ce3.m111935x());
        C32120Ce3 c32120Ce32 = this.f105465f;
        Intrinsics.checkNotNull(c32120Ce32);
        float m75146a2 = YM2.m75146a(m111944o, C32120Ce3.m111944o(c32120Ce32.m111935x()), this.f105468i.m23385n().floatValue());
        C32120Ce3 c32120Ce33 = this.f105460a;
        Intrinsics.checkNotNull(c32120Ce33);
        float m111943p = C32120Ce3.m111943p(c32120Ce33.m111935x());
        C32120Ce3 c32120Ce34 = this.f105465f;
        Intrinsics.checkNotNull(c32120Ce34);
        long m104938a = C33056Ge3.m104938a(m75146a2, YM2.m75146a(m111943p, C32120Ce3.m111943p(c32120Ce34.m111935x()), this.f105468i.m23385n().floatValue()));
        long m18743m = C47063pm0.m18743m(j, C47063pm0.m18740p(j) * floatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (this.f105462c) {
            float m5730i = C51465xB5.m5730i(draw.mo96360h());
            float m5732g = C51465xB5.m5732g(draw.mo96360h());
            int m86404b = C35681Rk0.f32493a.m86404b();
            C61 mo20750d0 = draw.mo20750d0();
            long mo20721h = mo20750d0.mo20721h();
            mo20750d0.mo20724a().mo25245v();
            mo20750d0.mo20722c().mo19028a(0.0f, 0.0f, m5730i, m5732g, m86404b);
            I61.m102955J(draw, m18743m, m75146a, m104938a, 0.0f, null, null, 0, 120, null);
            mo20750d0.mo20724a().mo25251p();
            mo20750d0.mo20723b(mo20721h);
            return;
        }
        I61.m102955J(draw, m18743m, m75146a, m104938a, 0.0f, null, null, 0, 120, null);
    }

    /* renamed from: f */
    public final Object m17343f(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C27632b(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* renamed from: g */
    public final Object m17342g(Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m71786e = C37824aD0.m71786e(new C27636c(null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m71786e == coroutine_suspended ? m71786e : Unit.INSTANCE;
    }

    /* renamed from: h */
    public final void m17341h() {
        m17338k(true);
        this.f105469j.mo29819r(Unit.INSTANCE);
    }

    /* renamed from: i */
    public final boolean m17340i() {
        return ((Boolean) this.f105471l.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final boolean m17339j() {
        return ((Boolean) this.f105470k.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final void m17338k(boolean z) {
        this.f105471l.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m17337l(boolean z) {
        this.f105470k.setValue(Boolean.valueOf(z));
    }

    public C47551qb5(C32120Ce3 c32120Ce3, float f, boolean z) {
        EX2 m97025e;
        EX2 m97025e2;
        this.f105460a = c32120Ce3;
        this.f105461b = f;
        this.f105462c = z;
        this.f105466g = C28794te.m11987b(0.0f, 0.0f, 2, null);
        this.f105467h = C28794te.m11987b(0.0f, 0.0f, 2, null);
        this.f105468i = C28794te.m11987b(0.0f, 0.0f, 2, null);
        this.f105469j = C44158ks0.m28259a(null);
        Boolean bool = Boolean.FALSE;
        m97025e = LM5.m97025e(bool, null, 2, null);
        this.f105470k = m97025e;
        m97025e2 = LM5.m97025e(bool, null, 2, null);
        this.f105471l = m97025e2;
    }
}
