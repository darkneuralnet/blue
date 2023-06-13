package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.AN2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\bB\u0010CJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J!\u0010\t\u001a\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007H\u0004J\u0013\u0010\n\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00042!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00040\u0006H\u0004J\u0081\u0001\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u0011*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0018\u00010\u00152#\u0010\b\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\b\u0007H\u0014ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001d\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u001c2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0018\u00010\u00152#\u0010\b\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\b\u0007H\u0014JC\u0010\u001e\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u001c2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0002\b\u0007H\u0014JJ\u0010\u001f\u001a\u00020\u0019\"\b\b\u0001\u0010\u0011*\u00020\u0003*\b\u0012\u0004\u0012\u00028\u00010\u001c2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\"\u001a\u00020!H\u0016R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R&\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0004X\u0085\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R#\u00108\u001a\n 4*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b6\u00107R\u001c\u0010;\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010:R\u001a\u0010\u000e\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u00102\u001a\u0004\b<\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8F¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, m28432d2 = {"LxN2;", "LAN2;", "S", "", "", "k", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reducer", "j", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/ParameterName;", "name", TransferTable.COLUMN_STATE, "action", "l", "T", "Lkotlin/coroutines/Continuation;", "LSC0;", "dispatcher", "Lkotlin/reflect/KProperty1;", "Ldp;", "retainValue", "Lkotlin/Function2;", "Lzh2;", "e", "(Lkotlin/jvm/functions/Function1;LSC0;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)Lzh2;", "LEu1;", DateTokenConverter.CONVERTER_KEY, "i", "h", "(LEu1;Lkotlin/jvm/functions/Function2;)Lzh2;", "", "toString", "LyN2;", C17296a.f69688o, "LyN2;", "config", "LZC0;", "b", "LZC0;", "getCoroutineScope", "()LZC0;", "coroutineScope", "LEN2;", "LEN2;", "getStateStore", "()LEN2;", "getStateStore$annotations", "()V", "stateStore", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "getTag", "()Ljava/lang/String;", "tag", "LFX2;", "LFX2;", "mutableStateChecker", "f", "()LAN2;", "getState$annotations", "g", "()LEu1;", "stateFlow", "<init>", "(LyN2;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: xN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC51570xN2<S extends AN2> {

    /* renamed from: a */
    public final C52163yN2<S> f117475a;

    /* renamed from: b */
    public final ZC0 f117476b;

    /* renamed from: c */
    public final EN2<S> f117477c;

    /* renamed from: d */
    public final Lazy f117478d;

    /* renamed from: e */
    public final FX2<S> f117479e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, m28432d2 = {"LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$1", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$a */
    /* loaded from: classes2.dex */
    public static final class C30140a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117480h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC51570xN2<S> f117481i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30140a(AbstractC51570xN2<S> abstractC51570xN2, Continuation<? super C30140a> continuation) {
            super(2, continuation);
            this.f117481i = abstractC51570xN2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30140a(this.f117481i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30140a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117480h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f117481i.m5347k();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: xN2$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C30141b extends AdaptedFunctionReference implements Function1<S, Unit> {
        public C30141b(Object obj) {
            super(1, obj, InterfaceC42972is0.class, "complete", "complete(Ljava/lang/Object;)Z", 8);
        }

        /* renamed from: b */
        public final void m5344b(S p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC42972is0) this.receiver).mo29819r(p0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m5344b((AN2) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "value", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$execute$10", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$c */
    /* loaded from: classes2.dex */
    public static final class C30142c extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117482h;

        /* renamed from: i */
        public /* synthetic */ Object f117483i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC51570xN2<S> f117484j;

        /* renamed from: k */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117485k;

        /* JADX WARN: Unknown type variable: T in type: T */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$c$a */
        /* loaded from: classes2.dex */
        public static final class C30143a extends Lambda implements Function1<S, S> {

            /* renamed from: g */
            public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117486g;

            /* renamed from: h */
            public final /* synthetic */ T f117487h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: T */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
            public C30143a(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, T t) {
                super(1);
                this.f117486g = function2;
                this.f117487h = t;
            }

            /* renamed from: a */
            public final S m5342a(S setState) {
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                return this.f117486g.invoke(setState, new C51034wT5(this.f117487h));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5342a((AN2) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        public C30142c(AbstractC51570xN2<S> abstractC51570xN2, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, Continuation<? super C30142c> continuation) {
            super(2, continuation);
            this.f117484j = abstractC51570xN2;
            this.f117485k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30142c c30142c = new C30142c(this.f117484j, this.f117485k, continuation);
            c30142c.f117483i = obj;
            return c30142c;
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        /* renamed from: e */
        public final Object m5343e(T t, Continuation<? super Unit> continuation) {
            return ((C30142c) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return m5343e(obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117482h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f117484j.m5348j(new C30143a(this.f117485k, this.f117483i));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$d */
    /* loaded from: classes2.dex */
    public static final class C30144d extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117488g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        public C30144d(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2) {
            super(1);
            this.f117488g = function2;
        }

        /* renamed from: a */
        public final S m5341a(S setState) {
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            return this.f117488g.invoke(setState, new C31786At2(null, 1, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5341a((AN2) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$execute$3", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {206}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$e */
    /* loaded from: classes2.dex */
    public static final class C30145e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117489h;

        public C30145e(Continuation<? super C30145e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30145e(continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30145e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117489h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f117489h = 1;
                if (C48120rZ0.m15768a(LongCompanionObject.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$f */
    /* loaded from: classes2.dex */
    public static final class C30146f extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117490g;

        /* renamed from: h */
        public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117491h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
        public C30146f(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1) {
            super(1);
            this.f117490g = function2;
            this.f117491h = kProperty1;
        }

        /* renamed from: a */
        public final S m5340a(S setState) {
            Object obj;
            AbstractC19862dp abstractC19862dp;
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            Function2<S, AbstractC19862dp<? extends T>, S> function2 = this.f117490g;
            KProperty1<S, AbstractC19862dp<T>> kProperty1 = this.f117491h;
            if (kProperty1 != 0 && (abstractC19862dp = (AbstractC19862dp) kProperty1.get(setState)) != null) {
                obj = abstractC19862dp.mo6788a();
            } else {
                obj = null;
            }
            return function2.invoke(setState, new C31786At2(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5340a((AN2) obj);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$execute$5", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {213}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$g */
    /* loaded from: classes2.dex */
    public static final class C30147g extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117492h;

        /* renamed from: i */
        public final /* synthetic */ Function1<Continuation<? super T>, Object> f117493i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC51570xN2<S> f117494j;

        /* renamed from: k */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117495k;

        /* renamed from: l */
        public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117496l;

        /* JADX WARN: Unknown type variable: T in type: T */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$g$a */
        /* loaded from: classes2.dex */
        public static final class C30148a extends Lambda implements Function1<S, S> {

            /* renamed from: g */
            public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117497g;

            /* renamed from: h */
            public final /* synthetic */ T f117498h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: T */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
            public C30148a(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, T t) {
                super(1);
                this.f117497g = function2;
                this.f117498h = t;
            }

            /* renamed from: a */
            public final S m5339a(S setState) {
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                return this.f117497g.invoke(setState, new C51034wT5(this.f117498h));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5339a((AN2) obj);
            }
        }

        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$g$b */
        /* loaded from: classes2.dex */
        public static final class C30149b extends Lambda implements Function1<S, S> {

            /* renamed from: g */
            public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117499g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f117500h;

            /* renamed from: i */
            public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117501i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
            public C30149b(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, Throwable th, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1) {
                super(1);
                this.f117499g = function2;
                this.f117500h = th;
                this.f117501i = kProperty1;
            }

            /* renamed from: a */
            public final S m5338a(S setState) {
                Object obj;
                AbstractC19862dp abstractC19862dp;
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                Function2<S, AbstractC19862dp<? extends T>, S> function2 = this.f117499g;
                Throwable th = this.f117500h;
                KProperty1<S, AbstractC19862dp<T>> kProperty1 = this.f117501i;
                if (kProperty1 != 0 && (abstractC19862dp = (AbstractC19862dp) kProperty1.get(setState)) != null) {
                    obj = abstractC19862dp.mo6788a();
                } else {
                    obj = null;
                }
                return function2.invoke(setState, new C32163Cj1(th, obj));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5338a((AN2) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
        public C30147g(Function1<? super Continuation<? super T>, ? extends Object> function1, AbstractC51570xN2<S> abstractC51570xN2, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Continuation<? super C30147g> continuation) {
            super(2, continuation);
            this.f117493i = function1;
            this.f117494j = abstractC51570xN2;
            this.f117495k = function2;
            this.f117496l = kProperty1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30147g(this.f117493i, this.f117494j, this.f117495k, this.f117496l, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30147g) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117492h;
            try {
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super T>, Object> function1 = this.f117493i;
                    this.f117492h = 1;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f117494j.m5348j(new C30148a(this.f117495k, obj));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                this.f117494j.m5348j(new C30149b(this.f117495k, th, this.f117496l));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$h */
    /* loaded from: classes2.dex */
    public static final class C30150h extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117502g;

        /* renamed from: h */
        public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117503h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
        public C30150h(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1) {
            super(1);
            this.f117502g = function2;
            this.f117503h = kProperty1;
        }

        /* renamed from: a */
        public final S m5337a(S setState) {
            Object obj;
            AbstractC19862dp abstractC19862dp;
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            Function2<S, AbstractC19862dp<? extends T>, S> function2 = this.f117502g;
            KProperty1<S, AbstractC19862dp<T>> kProperty1 = this.f117503h;
            if (kProperty1 != 0 && (abstractC19862dp = (AbstractC19862dp) kProperty1.get(setState)) != null) {
                obj = abstractC19862dp.mo6788a();
            } else {
                obj = null;
            }
            return function2.invoke(setState, new C31786At2(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5337a((AN2) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$execute$7", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {246}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$i */
    /* loaded from: classes2.dex */
    public static final class C30151i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117504h;

        public C30151i(Continuation<? super C30151i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30151i(continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30151i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117504h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f117504h = 1;
                if (C48120rZ0.m15768a(LongCompanionObject.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$j */
    /* loaded from: classes2.dex */
    public static final class C30152j extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117505g;

        /* renamed from: h */
        public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117506h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
        public C30152j(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1) {
            super(1);
            this.f117505g = function2;
            this.f117506h = kProperty1;
        }

        /* renamed from: a */
        public final S m5336a(S setState) {
            Object obj;
            AbstractC19862dp abstractC19862dp;
            Intrinsics.checkNotNullParameter(setState, "$this$setState");
            Function2<S, AbstractC19862dp<? extends T>, S> function2 = this.f117505g;
            KProperty1<S, AbstractC19862dp<T>> kProperty1 = this.f117506h;
            if (kProperty1 != 0 && (abstractC19862dp = (AbstractC19862dp) kProperty1.get(setState)) != null) {
                obj = abstractC19862dp.mo6788a();
            } else {
                obj = null;
            }
            return function2.invoke(setState, new C31786At2(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5336a((AN2) obj);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "LGu1;", "", "error", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$execute$9", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$k */
    /* loaded from: classes2.dex */
    public static final class C30153k extends SuspendLambda implements Function3<InterfaceC33198Gu1<? super T>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117507h;

        /* renamed from: i */
        public /* synthetic */ Object f117508i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC51570xN2<S> f117509j;

        /* renamed from: k */
        public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117510k;

        /* renamed from: l */
        public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117511l;

        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, dp<? extends T>, S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, dp<T>> */
        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$k$a */
        /* loaded from: classes2.dex */
        public static final class C30154a extends Lambda implements Function1<S, S> {

            /* renamed from: g */
            public final /* synthetic */ Function2<S, AbstractC19862dp<? extends T>, S> f117512g;

            /* renamed from: h */
            public final /* synthetic */ Throwable f117513h;

            /* renamed from: i */
            public final /* synthetic */ KProperty1<S, AbstractC19862dp<T>> f117514i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
            public C30154a(Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, Throwable th, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1) {
                super(1);
                this.f117512g = function2;
                this.f117513h = th;
                this.f117514i = kProperty1;
            }

            /* renamed from: a */
            public final S m5334a(S setState) {
                Object obj;
                AbstractC19862dp abstractC19862dp;
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                Function2<S, AbstractC19862dp<? extends T>, S> function2 = this.f117512g;
                Throwable th = this.f117513h;
                KProperty1<S, AbstractC19862dp<T>> kProperty1 = this.f117514i;
                if (kProperty1 != 0 && (abstractC19862dp = (AbstractC19862dp) kProperty1.get(setState)) != null) {
                    obj = abstractC19862dp.mo6788a();
                } else {
                    obj = null;
                }
                return function2.invoke(setState, new C32163Cj1(th, obj));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5334a((AN2) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super dp<? extends T>, ? extends S> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.reflect.KProperty1<S extends AN2, ? extends dp<? extends T>> */
        public C30153k(AbstractC51570xN2<S> abstractC51570xN2, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> function2, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Continuation<? super C30153k> continuation) {
            super(3, continuation);
            this.f117509j = abstractC51570xN2;
            this.f117510k = function2;
            this.f117511l = kProperty1;
        }

        /* JADX WARN: Unknown type variable: T in type: Gu1<? super T> */
        /* renamed from: e */
        public final Object m5335e(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Throwable th, Continuation<? super Unit> continuation) {
            C30153k c30153k = new C30153k(this.f117509j, this.f117510k, this.f117511l, continuation);
            c30153k.f117508i = th;
            return c30153k.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th, Continuation<? super Unit> continuation) {
            return m5335e((InterfaceC33198Gu1) obj, th, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117507h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f117509j.m5348j(new C30154a(this.f117510k, (Throwable) this.f117508i, this.f117511l));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Unknown type variable: T in type: Eu1<T> */
    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> */
    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@"}, m28432d2 = {"", "T", "LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$resolveSubscription$1", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {409, 410}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$l */
    /* loaded from: classes2.dex */
    public static final class C30155l extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117515h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC32730Eu1<T> f117516i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> f117517j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: Eu1<? extends T> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
        public C30155l(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C30155l> continuation) {
            super(2, continuation);
            this.f117516i = interfaceC32730Eu1;
            this.f117517j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30155l(this.f117516i, this.f117517j, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30155l) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117515h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.f117515h = 1;
                if (C40857fI6.m41600a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InterfaceC32730Eu1<T> interfaceC32730Eu1 = this.f117516i;
            Function2<T, Continuation<? super Unit>, Object> function2 = this.f117517j;
            this.f117515h = 2;
            if (C36708Vu1.m79261j(interfaceC32730Eu1, function2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00020\u0003H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$setOnEach$1", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {271}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$m */
    /* loaded from: classes2.dex */
    public static final class C30156m extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117518h;

        public C30156m(Continuation<? super C30156m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30156m(continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30156m) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117518h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f117518h = 1;
                if (C48120rZ0.m15768a(LongCompanionObject.MAX_VALUE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return invoke2(zc0, continuation);
        }
    }

    /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, T, S> */
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, m28432d2 = {"T", "LAN2;", "S", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.airbnb.mvrx.MavericksRepository$setOnEach$2", m28418f = "MavericksRepository.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: xN2$n */
    /* loaded from: classes2.dex */
    public static final class C30157n extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117519h;

        /* renamed from: i */
        public /* synthetic */ Object f117520i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC51570xN2<S> f117521j;

        /* renamed from: k */
        public final /* synthetic */ Function2<S, T, S> f117522k;

        /* JADX WARN: Unknown type variable: T in type: T */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<S extends AN2, T, S> */
        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u00028\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$n$a */
        /* loaded from: classes2.dex */
        public static final class C30158a extends Lambda implements Function1<S, S> {

            /* renamed from: g */
            public final /* synthetic */ Function2<S, T, S> f117523g;

            /* renamed from: h */
            public final /* synthetic */ T f117524h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Unknown type variable: T in type: T */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super T, ? extends S extends AN2> */
            /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super T, ? extends S> */
            public C30158a(Function2<? super S, ? super T, ? extends S> function2, T t) {
                super(1);
                this.f117523g = function2;
                this.f117524h = t;
            }

            /* renamed from: a */
            public final S m5332a(S setState) {
                Intrinsics.checkNotNullParameter(setState, "$this$setState");
                return this.f117523g.invoke(setState, this.f117524h);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m5332a((AN2) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super T, ? extends S extends AN2> */
        /* JADX WARN: Unknown type variable: T in type: kotlin.jvm.functions.Function2<? super S extends AN2, ? super T, ? extends S> */
        public C30157n(AbstractC51570xN2<S> abstractC51570xN2, Function2<? super S, ? super T, ? extends S> function2, Continuation<? super C30157n> continuation) {
            super(2, continuation);
            this.f117521j = abstractC51570xN2;
            this.f117522k = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30157n c30157n = new C30157n(this.f117521j, this.f117522k, continuation);
            c30157n.f117520i = obj;
            return c30157n;
        }

        /* JADX WARN: Unknown type variable: T in type: T */
        /* renamed from: e */
        public final Object m5333e(T t, Continuation<? super Unit> continuation) {
            return ((C30157n) create(t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return m5333e(obj, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117519h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f117521j.m5348j(new C30158a(this.f117522k, this.f117520i));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LAN2;", "S", C17296a.f69688o, "(LAN2;)LAN2;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$o */
    /* loaded from: classes2.dex */
    public static final class C30159o extends Lambda implements Function1<S, S> {

        /* renamed from: g */
        public final /* synthetic */ Function1<S, S> f117525g;

        /* renamed from: h */
        public final /* synthetic */ AbstractC51570xN2<S> f117526h;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LAN2;", "S", "Ljava/lang/reflect/Field;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/reflect/Field;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: xN2$o$a */
        /* loaded from: classes2.dex */
        public static final class C30160a extends Lambda implements Function1<Field, Unit> {

            /* renamed from: g */
            public static final C30160a f117527g = new C30160a();

            static {
            }

            public C30160a() {
                super(1);
            }

            /* renamed from: a */
            public final void m5330a(Field field) {
                field.setAccessible(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Field field) {
                m5330a(field);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30159o(Function1<? super S, ? extends S> function1, AbstractC51570xN2<S> abstractC51570xN2) {
            super(1);
            this.f117525g = function1;
            this.f117526h = abstractC51570xN2;
        }

        /* renamed from: a */
        public final S m5331a(S set) {
            Sequence asSequence;
            Sequence onEach;
            Object obj;
            Field field;
            boolean z;
            Intrinsics.checkNotNullParameter(set, "$this$set");
            S invoke = this.f117525g.invoke(set);
            S invoke2 = this.f117525g.invoke(set);
            if (!Intrinsics.areEqual(invoke, invoke2)) {
                Field[] declaredFields = invoke.getClass().getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "firstState::class.java.declaredFields");
                asSequence = ArraysKt___ArraysKt.asSequence(declaredFields);
                onEach = SequencesKt___SequencesKt.onEach(asSequence, C30160a.f117527g);
                Iterator it = onEach.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Field field2 = (Field) obj;
                        try {
                            z = !Intrinsics.areEqual(field2.get(invoke), field2.get(invoke2));
                            continue;
                        } catch (Throwable unused) {
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
                if (((Field) obj) != null) {
                    throw new IllegalArgumentException("Impure reducer set on " + this.f117526h.getClass().getSimpleName() + "! " + field.getName() + " changed from " + field.get(invoke) + " to " + field.get(invoke2) + ". Ensure that your state properties properly implement hashCode.");
                }
                throw new IllegalArgumentException("Impure reducer set on " + this.f117526h.getClass().getSimpleName() + "! Differing states were provided by the same reducer.Ensure that your state properties properly implement hashCode. First state: " + invoke + " -> Second state: " + invoke2);
            }
            FX2 fx2 = this.f117526h.f117479e;
            if (fx2 != null) {
                fx2.m107040a(invoke);
            }
            return invoke;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5331a((AN2) obj);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LAN2;", "S", "", "kotlin.jvm.PlatformType", "invoke", "()Ljava/lang/String;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: xN2$p */
    /* loaded from: classes2.dex */
    public static final class C30161p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC51570xN2<S> f117528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30161p(AbstractC51570xN2<S> abstractC51570xN2) {
            super(0);
            this.f117528g = abstractC51570xN2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return invoke2();
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final String invoke2() {
            return this.f117528g.getClass().getSimpleName();
        }
    }

    public AbstractC51570xN2(C52163yN2<S> config) {
        Lazy lazy;
        FX2<S> fx2;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f117475a = config;
        ZC0 m3539a = config.m3539a();
        this.f117476b = m3539a;
        this.f117477c = config.m3536d();
        lazy = LazyKt__LazyJVMKt.lazy(new C30161p(this));
        this.f117478d = lazy;
        if (config.m3537c()) {
            fx2 = new FX2<>(config.m3536d().getState());
        } else {
            fx2 = null;
        }
        this.f117479e = fx2;
        if (config.m3537c()) {
            Z30.m73800d(m3539a, T41.m84378a(), null, new C30140a(this, null), 2, null);
        }
    }

    /* renamed from: c */
    public final Object m5355c(Continuation<? super S> continuation) {
        InterfaceC42972is0 m28258b = C44158ks0.m28258b(null, 1, null);
        m5346l(new C30141b(m28258b));
        return m28258b.mo29821k(continuation);
    }

    /* renamed from: d */
    public <T> InterfaceC52943zh2 m5354d(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        EnumC48606sN2 invoke = this.f117475a.m3538b().invoke(this);
        if (invoke != EnumC48606sN2.No) {
            if (invoke == EnumC48606sN2.WithLoading) {
                m5348j(new C30150h(reducer, kProperty1));
            }
            m73800d = Z30.m73800d(this.f117476b, null, null, new C30151i(null), 3, null);
            return m73800d;
        }
        m5348j(new C30152j(reducer, kProperty1));
        InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(C36708Vu1.m79265f(interfaceC32730Eu1, new C30153k(this, reducer, kProperty1, null)), new C30142c(this, reducer, null));
        ZC0 zc0 = this.f117476b;
        CoroutineContext coroutineContext = sc0;
        if (sc0 == null) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return C36708Vu1.m79279I(m79276L, C37824aD0.m71784g(zc0, coroutineContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.coroutines.EmptyCoroutineContext] */
    /* renamed from: e */
    public <T> InterfaceC52943zh2 m5353e(Function1<? super Continuation<? super T>, ? extends Object> function1, SC0 sc0, KProperty1<S, ? extends AbstractC19862dp<? extends T>> kProperty1, Function2<? super S, ? super AbstractC19862dp<? extends T>, ? extends S> reducer) {
        InterfaceC52943zh2 m73800d;
        InterfaceC52943zh2 m73800d2;
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        EnumC48606sN2 invoke = this.f117475a.m3538b().invoke(this);
        if (invoke != EnumC48606sN2.No) {
            if (invoke == EnumC48606sN2.WithLoading) {
                m5348j(new C30144d(reducer));
            }
            m73800d2 = Z30.m73800d(this.f117476b, null, null, new C30145e(null), 3, null);
            return m73800d2;
        }
        m5348j(new C30146f(reducer, kProperty1));
        ZC0 zc0 = this.f117476b;
        SC0 sc02 = sc0;
        if (sc0 == null) {
            sc02 = EmptyCoroutineContext.INSTANCE;
        }
        m73800d = Z30.m73800d(zc0, sc02, null, new C30147g(function1, this, reducer, kProperty1, null), 2, null);
        return m73800d;
    }

    /* renamed from: f */
    public final S m5352f() {
        return this.f117477c.getState();
    }

    /* renamed from: g */
    public final InterfaceC32730Eu1<S> m5351g() {
        return this.f117477c.mo41743a();
    }

    /* renamed from: h */
    public final <T> InterfaceC52943zh2 m5350h(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        m73800d = Z30.m73800d(C37824aD0.m71784g(this.f117476b, this.f117475a.m3535e()), null, EnumC38417bD0.UNDISPATCHED, new C30155l(interfaceC32730Eu1, action, null), 1, null);
        return m73800d;
    }

    /* renamed from: i */
    public <T> InterfaceC52943zh2 m5349i(InterfaceC32730Eu1<? extends T> interfaceC32730Eu1, SC0 sc0, Function2<? super S, ? super T, ? extends S> reducer) {
        InterfaceC52943zh2 m73800d;
        Intrinsics.checkNotNullParameter(interfaceC32730Eu1, "<this>");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        if (this.f117475a.m3538b().invoke(this) != EnumC48606sN2.No) {
            m73800d = Z30.m73800d(this.f117476b, null, null, new C30156m(null), 3, null);
            return m73800d;
        }
        InterfaceC32730Eu1 m79276L = C36708Vu1.m79276L(interfaceC32730Eu1, new C30157n(this, reducer, null));
        ZC0 zc0 = this.f117476b;
        CoroutineContext coroutineContext = sc0;
        if (sc0 == null) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return C36708Vu1.m79279I(m79276L, C37824aD0.m71784g(zc0, coroutineContext));
    }

    /* renamed from: j */
    public final void m5348j(Function1<? super S, ? extends S> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        if (this.f117475a.m3537c()) {
            this.f117477c.mo41741c(new C30159o(reducer, this));
        } else {
            this.f117477c.mo41741c(reducer);
        }
    }

    /* renamed from: k */
    public final void m5347k() {
        C50977wN2.m6960b(Reflection.getOrCreateKotlinClass(m5352f().getClass()), false, 2, null);
    }

    /* renamed from: l */
    public final void m5346l(Function1<? super S, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f117477c.mo41742b(action);
    }

    public String toString() {
        return getClass().getSimpleName() + ' ' + m5352f();
    }
}
