package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001?B\u001f\u0012\u0006\u0010I\u001a\u00020\u0015\u0012\u0006\u0010K\u001a\u00020\u0015\u0012\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bh\u0010iJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J9\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010$\u001a\u00020\fH\u0002J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0003H\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020\u000eH\u0002J\u001b\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J3\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u0013H\u0002¢\u0006\u0004\b-\u0010.J!\u00102\u001a\u0002012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u0010\nJ\u001b\u00105\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u00107J%\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010+0\u00132\u0006\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\b\u0010;\u001a\u00020\u0003H\u0014J\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00132\u0006\u0010<\u001a\u00020\u0015H\u0014¢\u0006\u0004\b=\u0010>J\b\u0010?\u001a\u00020\fH\u0016J&\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0016R\u0014\u0010I\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\u0016\u0010W\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010HR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010HR\u0014\u0010Z\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u00107R\u0014\u0010]\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010_\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\\R\u0014\u0010`\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u00107R\u0014\u0010b\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u00107R\u001a\u0010g\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bc\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, m28432d2 = {"LUy5;", "T", "Lo1;", "LWy5;", "LBX2;", "", "LBA1;", "value", "", "Q", "(Ljava/lang/Object;)Z", "R", "", "D", "", "newHead", "A", "item", "G", "", "curBuffer", "", "curSize", "newSize", "P", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "F", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUy5$a;", "emitter", "x", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "U", "y", "slot", "S", "index", "L", "w", "(LWy5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "resumesIn", "H", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "LGu1;", "collector", "", "collect", "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "emit", "W", "()J", "oldIndex", "V", "(J)[Lkotlin/coroutines/Continuation;", "B", "size", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(I)[LWy5;", C17296a.f69688o, "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "capacity", "Lk30;", "onBufferOverflow", "LEu1;", "c", "f", "I", "replay", "g", "bufferCapacity", "h", "Lk30;", "i", "[Ljava/lang/Object;", "buffer", "j", "J", "replayIndex", "k", "minCollectorIndex", "l", "bufferSize", "m", "queueSize", "head", "N", "()I", "replaySize", "O", "totalSize", "bufferEndIndex", "M", "queueEndIndex", "K", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILk30;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Uy5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36514Uy5<T> extends AbstractC26786o1<C36982Wy5> implements BX2<T>, InterfaceC32730Eu1, BA1<T> {

    /* renamed from: f */
    public final int f38364f;

    /* renamed from: g */
    public final int f38365g;

    /* renamed from: h */
    public final EnumC43674k30 f38366h;

    /* renamed from: i */
    public Object[] f38367i;

    /* renamed from: j */
    public long f38368j;

    /* renamed from: k */
    public long f38369k;

    /* renamed from: l */
    public int f38370l;

    /* renamed from: m */
    public int f38371m;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LUy5$a;", "Lo51;", "", "dispose", "LUy5;", "b", "LUy5;", "flow", "", "c", "J", "index", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "value", "Lkotlin/coroutines/Continuation;", "e", "Lkotlin/coroutines/Continuation;", "cont", "<init>", "(LUy5;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Uy5$a */
    /* loaded from: classes8.dex */
    public static final class C8522a implements InterfaceC46067o51 {
        @JvmField

        /* renamed from: b */
        public final C36514Uy5<?> f38372b;
        @JvmField

        /* renamed from: c */
        public long f38373c;
        @JvmField

        /* renamed from: d */
        public final Object f38374d;
        @JvmField

        /* renamed from: e */
        public final Continuation<Unit> f38375e;

        /* JADX WARN: Multi-variable type inference failed */
        public C8522a(C36514Uy5<?> c36514Uy5, long j, Object obj, Continuation<? super Unit> continuation) {
            this.f38372b = c36514Uy5;
            this.f38373c = j;
            this.f38374d = obj;
            this.f38375e = continuation;
        }

        @Override // p000.InterfaceC46067o51
        public void dispose() {
            this.f38372b.m80525x(this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Uy5$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C8523b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43674k30.values().length];
            iArr[EnumC43674k30.SUSPEND.ordinal()] = 1;
            iArr[EnumC43674k30.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC43674k30.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "kotlinx.coroutines.flow.SharedFlowImpl", m28418f = "SharedFlow.kt", m28417i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m28416l = {373, 380, 383}, m28415m = "collect$suspendImpl", m28414n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: Uy5$c */
    /* loaded from: classes8.dex */
    public static final class C8524c extends ContinuationImpl {

        /* renamed from: h */
        public Object f38376h;

        /* renamed from: i */
        public Object f38377i;

        /* renamed from: j */
        public Object f38378j;

        /* renamed from: k */
        public Object f38379k;

        /* renamed from: l */
        public /* synthetic */ Object f38380l;

        /* renamed from: m */
        public final /* synthetic */ C36514Uy5<T> f38381m;

        /* renamed from: n */
        public int f38382n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8524c(C36514Uy5<T> c36514Uy5, Continuation<? super C8524c> continuation) {
            super(continuation);
            this.f38381m = c36514Uy5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38380l = obj;
            this.f38382n |= Integer.MIN_VALUE;
            return C36514Uy5.m80523z(this.f38381m, null, this);
        }
    }

    public C36514Uy5(int i, int i2, EnumC43674k30 enumC43674k30) {
        this.f38364f = i;
        this.f38365g = i2;
        this.f38366h = enumC43674k30;
    }

    /* renamed from: E */
    public static /* synthetic */ Object m80555E(C36514Uy5 c36514Uy5, Object obj, Continuation continuation) {
        Object coroutine_suspended;
        if (c36514Uy5.mo10357b(obj)) {
            return Unit.INSTANCE;
        }
        Object m80554F = c36514Uy5.m80554F(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m80554F == coroutine_suspended) {
            return m80554F;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab A[SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m80523z(C36514Uy5 c36514Uy5, InterfaceC33198Gu1 interfaceC33198Gu1, Continuation continuation) {
        C8524c c8524c;
        Object coroutine_suspended;
        int i;
        C36514Uy5 c36514Uy52;
        Throwable th;
        C36982Wy5 c36982Wy5;
        InterfaceC33198Gu1 interfaceC33198Gu12;
        InterfaceC52943zh2 interfaceC52943zh2;
        Object m80540T;
        InterfaceC52943zh2 interfaceC52943zh22;
        InterfaceC33198Gu1 interfaceC33198Gu13;
        if (continuation instanceof C8524c) {
            c8524c = (C8524c) continuation;
            int i2 = c8524c.f38382n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c8524c.f38382n = i2 - Integer.MIN_VALUE;
                Object obj = c8524c.f38380l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c8524c.f38382n;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                interfaceC52943zh22 = (InterfaceC52943zh2) c8524c.f38379k;
                                c36982Wy5 = (C36982Wy5) c8524c.f38378j;
                                interfaceC33198Gu13 = (InterfaceC33198Gu1) c8524c.f38377i;
                                c36514Uy52 = (C36514Uy5) c8524c.f38376h;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC52943zh22 = (InterfaceC52943zh2) c8524c.f38379k;
                            c36982Wy5 = (C36982Wy5) c8524c.f38378j;
                            interfaceC33198Gu13 = (InterfaceC33198Gu1) c8524c.f38377i;
                            c36514Uy52 = (C36514Uy5) c8524c.f38376h;
                        }
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC33198Gu12 = interfaceC33198Gu13;
                            interfaceC52943zh2 = interfaceC52943zh22;
                            c36514Uy5 = c36514Uy52;
                            while (true) {
                                m80540T = c36514Uy5.m80540T(c36982Wy5);
                                if (m80540T == C36748Vy5.f40167a) {
                                    c8524c.f38376h = c36514Uy5;
                                    c8524c.f38377i = interfaceC33198Gu12;
                                    c8524c.f38378j = c36982Wy5;
                                    c8524c.f38379k = interfaceC52943zh2;
                                    c8524c.f38382n = 2;
                                    if (c36514Uy5.m80526w(c36982Wy5, c8524c) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (interfaceC52943zh2 != null) {
                                        C34018Kh2.m98500l(interfaceC52943zh2);
                                    }
                                    c8524c.f38376h = c36514Uy5;
                                    c8524c.f38377i = interfaceC33198Gu12;
                                    c8524c.f38378j = c36982Wy5;
                                    c8524c.f38379k = interfaceC52943zh2;
                                    c8524c.f38382n = 3;
                                    if (interfaceC33198Gu12.emit(m80540T, c8524c) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        c36982Wy5 = (C36982Wy5) c8524c.f38378j;
                        InterfaceC33198Gu1 interfaceC33198Gu14 = (InterfaceC33198Gu1) c8524c.f38377i;
                        C36514Uy5 c36514Uy53 = (C36514Uy5) c8524c.f38376h;
                        try {
                            ResultKt.throwOnFailure(obj);
                            interfaceC33198Gu12 = interfaceC33198Gu14;
                            c36514Uy5 = c36514Uy53;
                        } catch (Throwable th3) {
                            th = th3;
                            c36514Uy52 = c36514Uy53;
                        }
                    }
                    c36514Uy52.m21988j(c36982Wy5);
                    throw th;
                }
                ResultKt.throwOnFailure(obj);
                C36982Wy5 c36982Wy52 = (C36982Wy5) c36514Uy5.m21989g();
                try {
                    if (interfaceC33198Gu1 instanceof C41548gT5) {
                        c8524c.f38376h = c36514Uy5;
                        c8524c.f38377i = interfaceC33198Gu1;
                        c8524c.f38378j = c36982Wy52;
                        c8524c.f38382n = 1;
                        if (((C41548gT5) interfaceC33198Gu1).m39364c(c8524c) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    interfaceC33198Gu12 = interfaceC33198Gu1;
                    c36982Wy5 = c36982Wy52;
                } catch (Throwable th4) {
                    c36514Uy52 = c36514Uy5;
                    th = th4;
                    c36982Wy5 = c36982Wy52;
                }
                interfaceC52943zh2 = (InterfaceC52943zh2) c8524c.getContext().get(InterfaceC52943zh2.f122077a0);
                while (true) {
                    m80540T = c36514Uy5.m80540T(c36982Wy5);
                    if (m80540T == C36748Vy5.f40167a) {
                    }
                }
            }
        }
        c8524c = new C8524c(c36514Uy5, continuation);
        Object obj2 = c8524c.f38380l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c8524c.f38382n;
        if (i == 0) {
        }
        interfaceC52943zh2 = (InterfaceC52943zh2) c8524c.getContext().get(InterfaceC52943zh2.f122077a0);
        while (true) {
            m80540T = c36514Uy5.m80540T(c36982Wy5);
            if (m80540T == C36748Vy5.f40167a) {
            }
        }
    }

    /* renamed from: A */
    public final void m80559A(long j) {
        AbstractC27450q1[] m21990f;
        if (AbstractC26786o1.m21991e(this) != 0 && (m21990f = AbstractC26786o1.m21990f(this)) != null) {
            for (AbstractC27450q1 abstractC27450q1 : m21990f) {
                if (abstractC27450q1 != null) {
                    C36982Wy5 c36982Wy5 = (C36982Wy5) abstractC27450q1;
                    long j2 = c36982Wy5.f42424a;
                    if (j2 >= 0 && j2 < j) {
                        c36982Wy5.f42424a = j;
                    }
                }
            }
        }
        this.f38369k = j;
    }

    @Override // p000.AbstractC26786o1
    /* renamed from: B */
    public C36982Wy5 mo10355h() {
        return new C36982Wy5();
    }

    @Override // p000.AbstractC26786o1
    /* renamed from: C */
    public C36982Wy5[] mo10354i(int i) {
        return new C36982Wy5[i];
    }

    /* renamed from: D */
    public final void m80556D() {
        Object[] objArr = this.f38367i;
        Intrinsics.checkNotNull(objArr);
        C36748Vy5.m79026g(objArr, m80550J(), null);
        this.f38370l--;
        long m80550J = m80550J() + 1;
        if (this.f38368j < m80550J) {
            this.f38368j = m80550J;
        }
        if (this.f38369k < m80550J) {
            m80559A(m80550J);
        }
    }

    /* renamed from: F */
    public final Object m80554F(T t, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Continuation<Unit>[] continuationArr;
        C8522a c8522a;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        Continuation<Unit>[] continuationArr2 = C27124p1.f102946a;
        synchronized (this) {
            if (m80543Q(t)) {
                Result.Companion companion = Result.Companion;
                c37013Xc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
                continuationArr = m80552H(continuationArr2);
                c8522a = null;
            } else {
                C8522a c8522a2 = new C8522a(this, m80545O() + m80550J(), t, c37013Xc0);
                m80553G(c8522a2);
                this.f38371m++;
                if (this.f38365g == 0) {
                    continuationArr2 = m80552H(continuationArr2);
                }
                continuationArr = continuationArr2;
                c8522a = c8522a2;
            }
        }
        if (c8522a != null) {
            C37481Zc0.m72855a(c37013Xc0, c8522a);
        }
        for (Continuation<Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                Result.Companion companion2 = Result.Companion;
                continuation2.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public final void m80553G(Object obj) {
        int m80545O = m80545O();
        Object[] objArr = this.f38367i;
        if (objArr == null) {
            objArr = m80544P(null, 0, 2);
        } else if (m80545O >= objArr.length) {
            objArr = m80544P(objArr, m80545O, objArr.length * 2);
        }
        C36748Vy5.m79026g(objArr, m80550J() + m80545O, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* renamed from: H */
    public final Continuation<Unit>[] m80552H(Continuation<Unit>[] continuationArr) {
        AbstractC27450q1[] m21990f;
        C36982Wy5 c36982Wy5;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (AbstractC26786o1.m21991e(this) != 0 && (m21990f = AbstractC26786o1.m21990f(this)) != null) {
            int length2 = m21990f.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                AbstractC27450q1 abstractC27450q1 = m21990f[i];
                if (abstractC27450q1 != null && (continuation = (c36982Wy5 = (C36982Wy5) abstractC27450q1).f42425b) != null && m80541S(c36982Wy5) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    c36982Wy5.f42425b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    /* renamed from: I */
    public final long m80551I() {
        return m80550J() + this.f38370l;
    }

    /* renamed from: J */
    public final long m80550J() {
        return Math.min(this.f38369k, this.f38368j);
    }

    /* renamed from: K */
    public final T m80549K() {
        Object m79027f;
        Object[] objArr = this.f38367i;
        Intrinsics.checkNotNull(objArr);
        m79027f = C36748Vy5.m79027f(objArr, (this.f38368j + m80546N()) - 1);
        return (T) m79027f;
    }

    /* renamed from: L */
    public final Object m80548L(long j) {
        Object m79027f;
        Object[] objArr = this.f38367i;
        Intrinsics.checkNotNull(objArr);
        m79027f = C36748Vy5.m79027f(objArr, j);
        if (m79027f instanceof C8522a) {
            return ((C8522a) m79027f).f38374d;
        }
        return m79027f;
    }

    /* renamed from: M */
    public final long m80547M() {
        return m80550J() + this.f38370l + this.f38371m;
    }

    /* renamed from: N */
    public final int m80546N() {
        return (int) ((m80550J() + this.f38370l) - this.f38368j);
    }

    /* renamed from: O */
    public final int m80545O() {
        return this.f38370l + this.f38371m;
    }

    /* renamed from: P */
    public final Object[] m80544P(Object[] objArr, int i, int i2) {
        boolean z;
        Object m79027f;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object[] objArr2 = new Object[i2];
            this.f38367i = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long m80550J = m80550J();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + m80550J;
                m79027f = C36748Vy5.m79027f(objArr, j);
                C36748Vy5.m79026g(objArr2, j, m79027f);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* renamed from: Q */
    public final boolean m80543Q(T t) {
        if (m21987k() == 0) {
            return m80542R(t);
        }
        if (this.f38370l >= this.f38365g && this.f38369k <= this.f38368j) {
            int i = C8523b.$EnumSwitchMapping$0[this.f38366h.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        m80553G(t);
        int i2 = this.f38370l + 1;
        this.f38370l = i2;
        if (i2 > this.f38365g) {
            m80556D();
        }
        if (m80546N() > this.f38364f) {
            m80539U(this.f38368j + 1, this.f38369k, m80551I(), m80547M());
        }
        return true;
    }

    /* renamed from: R */
    public final boolean m80542R(T t) {
        if (this.f38364f == 0) {
            return true;
        }
        m80553G(t);
        int i = this.f38370l + 1;
        this.f38370l = i;
        if (i > this.f38364f) {
            m80556D();
        }
        this.f38369k = m80550J() + this.f38370l;
        return true;
    }

    /* renamed from: S */
    public final long m80541S(C36982Wy5 c36982Wy5) {
        long j = c36982Wy5.f42424a;
        if (j < m80551I()) {
            return j;
        }
        if (this.f38365g > 0 || j > m80550J() || this.f38371m == 0) {
            return -1L;
        }
        return j;
    }

    /* renamed from: T */
    public final Object m80540T(C36982Wy5 c36982Wy5) {
        Object obj;
        Continuation<Unit>[] continuationArr = C27124p1.f102946a;
        synchronized (this) {
            long m80541S = m80541S(c36982Wy5);
            if (m80541S < 0) {
                obj = C36748Vy5.f40167a;
            } else {
                long j = c36982Wy5.f42424a;
                Object m80548L = m80548L(m80541S);
                c36982Wy5.f42424a = m80541S + 1;
                continuationArr = m80538V(j);
                obj = m80548L;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* renamed from: U */
    public final void m80539U(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long m80550J = m80550J(); m80550J < min; m80550J++) {
            Object[] objArr = this.f38367i;
            Intrinsics.checkNotNull(objArr);
            C36748Vy5.m79026g(objArr, m80550J, null);
        }
        this.f38368j = j;
        this.f38369k = j2;
        this.f38370l = (int) (j3 - min);
        this.f38371m = (int) (j4 - j3);
    }

    /* renamed from: V */
    public final Continuation<Unit>[] m80538V(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        boolean z;
        Object m79027f;
        Object m79027f2;
        long j5;
        AbstractC27450q1[] m21990f;
        if (j > this.f38369k) {
            return C27124p1.f102946a;
        }
        long m80550J = m80550J();
        long j6 = this.f38370l + m80550J;
        if (this.f38365g == 0 && this.f38371m > 0) {
            j6++;
        }
        if (AbstractC26786o1.m21991e(this) != 0 && (m21990f = AbstractC26786o1.m21990f(this)) != null) {
            for (AbstractC27450q1 abstractC27450q1 : m21990f) {
                if (abstractC27450q1 != null) {
                    long j7 = ((C36982Wy5) abstractC27450q1).f42424a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.f38369k) {
            return C27124p1.f102946a;
        }
        long m80551I = m80551I();
        if (m21987k() > 0) {
            i = Math.min(this.f38371m, this.f38365g - ((int) (m80551I - j6)));
        } else {
            i = this.f38371m;
        }
        Continuation<Unit>[] continuationArr = C27124p1.f102946a;
        long j8 = this.f38371m + m80551I;
        if (i > 0) {
            continuationArr = new Continuation[i];
            Object[] objArr = this.f38367i;
            Intrinsics.checkNotNull(objArr);
            long j9 = m80551I;
            int i2 = 0;
            while (true) {
                if (m80551I < j8) {
                    m79027f2 = C36748Vy5.m79027f(objArr, m80551I);
                    j2 = j6;
                    C49885uX5 c49885uX5 = C36748Vy5.f40167a;
                    if (m79027f2 != c49885uX5) {
                        if (m79027f2 != null) {
                            C8522a c8522a = (C8522a) m79027f2;
                            int i3 = i2 + 1;
                            j3 = j8;
                            continuationArr[i2] = c8522a.f38375e;
                            C36748Vy5.m79026g(objArr, m80551I, c49885uX5);
                            C36748Vy5.m79026g(objArr, j9, c8522a.f38374d);
                            j5 = 1;
                            j9++;
                            if (i3 >= i) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                    } else {
                        j3 = j8;
                        j5 = 1;
                    }
                    m80551I += j5;
                    j6 = j2;
                    j8 = j3;
                } else {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
            }
            m80551I = j9;
        } else {
            j2 = j6;
            j3 = j8;
        }
        int i4 = (int) (m80551I - m80550J);
        if (m21987k() == 0) {
            j4 = m80551I;
        } else {
            j4 = j2;
        }
        long max = Math.max(this.f38368j, m80551I - Math.min(this.f38364f, i4));
        if (this.f38365g == 0 && max < j3) {
            Object[] objArr2 = this.f38367i;
            Intrinsics.checkNotNull(objArr2);
            m79027f = C36748Vy5.m79027f(objArr2, max);
            if (Intrinsics.areEqual(m79027f, C36748Vy5.f40167a)) {
                m80551I++;
                max++;
            }
        }
        m80539U(max, j4, m80551I, j3);
        m80524y();
        if (continuationArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m80552H(continuationArr);
        }
        return continuationArr;
    }

    /* renamed from: W */
    public final long m80537W() {
        long j = this.f38368j;
        if (j < this.f38369k) {
            this.f38369k = j;
        }
        return j;
    }

    @Override // p000.BX2
    /* renamed from: a */
    public void mo10358a() {
        synchronized (this) {
            m80539U(m80551I(), this.f38369k, m80551I(), m80547M());
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.BX2
    /* renamed from: b */
    public boolean mo10357b(T t) {
        int i;
        boolean z;
        Continuation<Unit>[] continuationArr = C27124p1.f102946a;
        synchronized (this) {
            if (m80543Q(t)) {
                continuationArr = m80552H(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
        }
        return z;
    }

    @Override // p000.BA1
    /* renamed from: c */
    public InterfaceC32730Eu1<T> mo10356c(CoroutineContext coroutineContext, int i, EnumC43674k30 enumC43674k30) {
        return C36748Vy5.m79028e(this, coroutineContext, i, enumC43674k30);
    }

    @Override // p000.InterfaceC36280Ty5, p000.InterfaceC32730Eu1
    public Object collect(InterfaceC33198Gu1<? super T> interfaceC33198Gu1, Continuation<?> continuation) {
        return m80523z(this, interfaceC33198Gu1, continuation);
    }

    @Override // p000.BX2, p000.InterfaceC33198Gu1
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return m80555E(this, t, continuation);
    }

    /* renamed from: w */
    public final Object m80526w(C36982Wy5 c36982Wy5, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 c37013Xc0 = new C37013Xc0(intercepted, 1);
        c37013Xc0.m76766u();
        synchronized (this) {
            if (m80541S(c36982Wy5) < 0) {
                c36982Wy5.f42425b = c37013Xc0;
            } else {
                Result.Companion companion = Result.Companion;
                c37013Xc0.resumeWith(Result.m116783constructorimpl(Unit.INSTANCE));
            }
            Unit unit = Unit.INSTANCE;
        }
        Object m76770q = c37013Xc0.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public final void m80525x(C8522a c8522a) {
        Object m79027f;
        synchronized (this) {
            if (c8522a.f38373c < m80550J()) {
                return;
            }
            Object[] objArr = this.f38367i;
            Intrinsics.checkNotNull(objArr);
            m79027f = C36748Vy5.m79027f(objArr, c8522a.f38373c);
            if (m79027f != c8522a) {
                return;
            }
            C36748Vy5.m79026g(objArr, c8522a.f38373c, C36748Vy5.f40167a);
            m80524y();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: y */
    public final void m80524y() {
        Object m79027f;
        if (this.f38365g == 0 && this.f38371m <= 1) {
            return;
        }
        Object[] objArr = this.f38367i;
        Intrinsics.checkNotNull(objArr);
        while (this.f38371m > 0) {
            m79027f = C36748Vy5.m79027f(objArr, (m80550J() + m80545O()) - 1);
            if (m79027f == C36748Vy5.f40167a) {
                this.f38371m--;
                C36748Vy5.m79026g(objArr, m80550J() + m80545O(), null);
            } else {
                return;
            }
        }
    }
}
