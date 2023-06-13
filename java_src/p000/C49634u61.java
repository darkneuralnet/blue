package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC46670p61;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B£\u0001\u0012<\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012<\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0013\u0012\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c\u0012\b\u0010'\u001a\u0004\u0018\u00010\"ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fRS\u0010\u0017\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016RS\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u00138\u0006ø\u0001\u0000ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001f\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"Lu61;", "", "LZC0;", "Lp61$c;", "event", "", "b", "(LZC0;Lp61$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp61$d;", "c", "(LZC0;Lp61$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "LCe3;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "onDragStarted", "Lro6;", "velocity", "getOnDragStopped", "onDragStopped", "LEX2;", "Ls61;", "LEX2;", "getDragStartInteraction", "()LEX2;", "dragStartInteraction", "LrX2;", DateTokenConverter.CONVERTER_KEY, "LrX2;", "getInteractionSource", "()LrX2;", "interactionSource", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEX2;LrX2;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49634u61 {

    /* renamed from: a */
    public final Function3<ZC0, C32120Ce3, Continuation<? super Unit>, Object> f111732a;

    /* renamed from: b */
    public final Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> f111733b;

    /* renamed from: c */
    public final EX2<C48448s61> f111734c;

    /* renamed from: d */
    public final InterfaceC48104rX2 f111735d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragLogic", m28418f = "Draggable.kt", m28417i = {0, 0}, m28416l = {422, 425}, m28415m = "processDragCancel", m28414n = {"this", "$this$processDragCancel"}, m28413s = {"L$0", "L$1"})
    /* renamed from: u61$a */
    /* loaded from: classes.dex */
    public static final class C29055a extends ContinuationImpl {

        /* renamed from: h */
        public Object f111736h;

        /* renamed from: i */
        public Object f111737i;

        /* renamed from: j */
        public /* synthetic */ Object f111738j;

        /* renamed from: l */
        public int f111740l;

        public C29055a(Continuation<? super C29055a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111738j = obj;
            this.f111740l |= Integer.MIN_VALUE;
            return C49634u61.this.m10865a(null, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragLogic", m28418f = "Draggable.kt", m28417i = {0, 0, 0, 1, 1, 1, 1}, m28416l = {Constants.NO_SUCH_BUCKET_STATUS_CODE, 407, 409}, m28415m = "processDragStart", m28414n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: u61$b */
    /* loaded from: classes.dex */
    public static final class C29056b extends ContinuationImpl {

        /* renamed from: h */
        public Object f111741h;

        /* renamed from: i */
        public Object f111742i;

        /* renamed from: j */
        public Object f111743j;

        /* renamed from: k */
        public Object f111744k;

        /* renamed from: l */
        public /* synthetic */ Object f111745l;

        /* renamed from: n */
        public int f111747n;

        public C29056b(Continuation<? super C29056b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111745l = obj;
            this.f111747n |= Integer.MIN_VALUE;
            return C49634u61.this.m10864b(null, null, this);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.foundation.gestures.DragLogic", m28418f = "Draggable.kt", m28417i = {0, 0, 0}, m28416l = {414, 417}, m28415m = "processDragStop", m28414n = {"this", "$this$processDragStop", "event"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: u61$c */
    /* loaded from: classes.dex */
    public static final class C29057c extends ContinuationImpl {

        /* renamed from: h */
        public Object f111748h;

        /* renamed from: i */
        public Object f111749i;

        /* renamed from: j */
        public Object f111750j;

        /* renamed from: k */
        public /* synthetic */ Object f111751k;

        /* renamed from: m */
        public int f111753m;

        public C29057c(Continuation<? super C29057c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f111751k = obj;
            this.f111753m |= Integer.MIN_VALUE;
            return C49634u61.this.m10863c(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49634u61(Function3<? super ZC0, ? super C32120Ce3, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, Function3<? super ZC0, ? super C48275ro6, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, EX2<C48448s61> dragStartInteraction, InterfaceC48104rX2 interfaceC48104rX2) {
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Intrinsics.checkNotNullParameter(dragStartInteraction, "dragStartInteraction");
        this.f111732a = onDragStarted;
        this.f111733b = onDragStopped;
        this.f111734c = dragStartInteraction;
        this.f111735d = interfaceC48104rX2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10865a(ZC0 zc0, Continuation<? super Unit> continuation) {
        C29055a c29055a;
        Object coroutine_suspended;
        int i;
        C49634u61 c49634u61;
        Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> function3;
        C48275ro6 m15363b;
        if (continuation instanceof C29055a) {
            c29055a = (C29055a) continuation;
            int i2 = c29055a.f111740l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29055a.f111740l = i2 - Integer.MIN_VALUE;
                Object obj = c29055a.f111738j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29055a.f111740l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zc0 = (ZC0) c29055a.f111737i;
                    c49634u61 = (C49634u61) c29055a.f111736h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    C48448s61 value = this.f111734c.getValue();
                    if (value != null) {
                        InterfaceC48104rX2 interfaceC48104rX2 = this.f111735d;
                        if (interfaceC48104rX2 != null) {
                            C47856r61 c47856r61 = new C47856r61(value);
                            c29055a.f111736h = this;
                            c29055a.f111737i = zc0;
                            c29055a.f111740l = 1;
                            if (interfaceC48104rX2.mo14088c(c47856r61, c29055a) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        c49634u61 = this;
                    } else {
                        c49634u61 = this;
                        function3 = c49634u61.f111733b;
                        m15363b = C48275ro6.m15363b(C48275ro6.f107663b.m15349a());
                        c29055a.f111736h = null;
                        c29055a.f111737i = null;
                        c29055a.f111740l = 2;
                        if (function3.invoke(zc0, m15363b, c29055a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c49634u61.f111734c.setValue(null);
                function3 = c49634u61.f111733b;
                m15363b = C48275ro6.m15363b(C48275ro6.f107663b.m15349a());
                c29055a.f111736h = null;
                c29055a.f111737i = null;
                c29055a.f111740l = 2;
                if (function3.invoke(zc0, m15363b, c29055a) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        c29055a = new C29055a(continuation);
        Object obj2 = c29055a.f111738j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29055a.f111740l;
        if (i == 0) {
        }
        c49634u61.f111734c.setValue(null);
        function3 = c49634u61.f111733b;
        m15363b = C48275ro6.m15363b(C48275ro6.f107663b.m15349a());
        c29055a.f111736h = null;
        c29055a.f111737i = null;
        c29055a.f111740l = 2;
        if (function3.invoke(zc0, m15363b, c29055a) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10864b(ZC0 zc0, AbstractC46670p61.C27143c c27143c, Continuation<? super Unit> continuation) {
        C29056b c29056b;
        Object coroutine_suspended;
        int i;
        C49634u61 c49634u61;
        InterfaceC48104rX2 interfaceC48104rX2;
        C48448s61 c48448s61;
        InterfaceC48104rX2 interfaceC48104rX22;
        C49634u61 c49634u612;
        ZC0 zc02;
        C48448s61 c48448s612;
        Function3<ZC0, C32120Ce3, Continuation<? super Unit>, Object> function3;
        C32120Ce3 m111955d;
        if (continuation instanceof C29056b) {
            c29056b = (C29056b) continuation;
            int i2 = c29056b.f111747n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29056b.f111747n = i2 - Integer.MIN_VALUE;
                Object obj = c29056b.f111745l;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29056b.f111747n;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c48448s612 = (C48448s61) c29056b.f111744k;
                        c27143c = (AbstractC46670p61.C27143c) c29056b.f111743j;
                        zc02 = (ZC0) c29056b.f111742i;
                        c49634u612 = (C49634u61) c29056b.f111741h;
                        ResultKt.throwOnFailure(obj);
                        c48448s61 = c48448s612;
                        zc0 = zc02;
                        c49634u61 = c49634u612;
                        c49634u61.f111734c.setValue(c48448s61);
                        function3 = c49634u61.f111732a;
                        m111955d = C32120Ce3.m111955d(c27143c.m19959a());
                        c29056b.f111741h = null;
                        c29056b.f111742i = null;
                        c29056b.f111743j = null;
                        c29056b.f111744k = null;
                        c29056b.f111747n = 3;
                        if (function3.invoke(zc0, m111955d, c29056b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    ZC0 zc03 = (ZC0) c29056b.f111742i;
                    c49634u61 = (C49634u61) c29056b.f111741h;
                    ResultKt.throwOnFailure(obj);
                    c27143c = (AbstractC46670p61.C27143c) c29056b.f111743j;
                    zc0 = zc03;
                } else {
                    ResultKt.throwOnFailure(obj);
                    C48448s61 value = this.f111734c.getValue();
                    if (value != null && (interfaceC48104rX2 = this.f111735d) != null) {
                        C47856r61 c47856r61 = new C47856r61(value);
                        c29056b.f111741h = this;
                        c29056b.f111742i = zc0;
                        c29056b.f111743j = c27143c;
                        c29056b.f111747n = 1;
                        if (interfaceC48104rX2.mo14088c(c47856r61, c29056b) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    c49634u61 = this;
                }
                c48448s61 = new C48448s61();
                interfaceC48104rX22 = c49634u61.f111735d;
                if (interfaceC48104rX22 != null) {
                    c29056b.f111741h = c49634u61;
                    c29056b.f111742i = zc0;
                    c29056b.f111743j = c27143c;
                    c29056b.f111744k = c48448s61;
                    c29056b.f111747n = 2;
                    if (interfaceC48104rX22.mo14088c(c48448s61, c29056b) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c49634u612 = c49634u61;
                    zc02 = zc0;
                    c48448s612 = c48448s61;
                    c48448s61 = c48448s612;
                    zc0 = zc02;
                    c49634u61 = c49634u612;
                }
                c49634u61.f111734c.setValue(c48448s61);
                function3 = c49634u61.f111732a;
                m111955d = C32120Ce3.m111955d(c27143c.m19959a());
                c29056b.f111741h = null;
                c29056b.f111742i = null;
                c29056b.f111743j = null;
                c29056b.f111744k = null;
                c29056b.f111747n = 3;
                if (function3.invoke(zc0, m111955d, c29056b) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        c29056b = new C29056b(continuation);
        Object obj2 = c29056b.f111745l;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29056b.f111747n;
        if (i == 0) {
        }
        c48448s61 = new C48448s61();
        interfaceC48104rX22 = c49634u61.f111735d;
        if (interfaceC48104rX22 != null) {
        }
        c49634u61.f111734c.setValue(c48448s61);
        function3 = c49634u61.f111732a;
        m111955d = C32120Ce3.m111955d(c27143c.m19959a());
        c29056b.f111741h = null;
        c29056b.f111742i = null;
        c29056b.f111743j = null;
        c29056b.f111744k = null;
        c29056b.f111747n = 3;
        if (function3.invoke(zc0, m111955d, c29056b) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10863c(ZC0 zc0, AbstractC46670p61.C27144d c27144d, Continuation<? super Unit> continuation) {
        C29057c c29057c;
        Object coroutine_suspended;
        int i;
        C49634u61 c49634u61;
        Function3<ZC0, C48275ro6, Continuation<? super Unit>, Object> function3;
        C48275ro6 m15363b;
        if (continuation instanceof C29057c) {
            c29057c = (C29057c) continuation;
            int i2 = c29057c.f111753m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29057c.f111753m = i2 - Integer.MIN_VALUE;
                Object obj = c29057c.f111751k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29057c.f111753m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ZC0 zc02 = (ZC0) c29057c.f111749i;
                    c49634u61 = (C49634u61) c29057c.f111748h;
                    ResultKt.throwOnFailure(obj);
                    c27144d = (AbstractC46670p61.C27144d) c29057c.f111750j;
                    zc0 = zc02;
                } else {
                    ResultKt.throwOnFailure(obj);
                    C48448s61 value = this.f111734c.getValue();
                    if (value != null) {
                        InterfaceC48104rX2 interfaceC48104rX2 = this.f111735d;
                        if (interfaceC48104rX2 != null) {
                            C49041t61 c49041t61 = new C49041t61(value);
                            c29057c.f111748h = this;
                            c29057c.f111749i = zc0;
                            c29057c.f111750j = c27144d;
                            c29057c.f111753m = 1;
                            if (interfaceC48104rX2.mo14088c(c49041t61, c29057c) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        c49634u61 = this;
                    } else {
                        c49634u61 = this;
                        function3 = c49634u61.f111733b;
                        m15363b = C48275ro6.m15363b(c27144d.m19958a());
                        c29057c.f111748h = null;
                        c29057c.f111749i = null;
                        c29057c.f111750j = null;
                        c29057c.f111753m = 2;
                        if (function3.invoke(zc0, m15363b, c29057c) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                c49634u61.f111734c.setValue(null);
                function3 = c49634u61.f111733b;
                m15363b = C48275ro6.m15363b(c27144d.m19958a());
                c29057c.f111748h = null;
                c29057c.f111749i = null;
                c29057c.f111750j = null;
                c29057c.f111753m = 2;
                if (function3.invoke(zc0, m15363b, c29057c) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        c29057c = new C29057c(continuation);
        Object obj2 = c29057c.f111751k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29057c.f111753m;
        if (i == 0) {
        }
        c49634u61.f111734c.setValue(null);
        function3 = c49634u61.f111733b;
        m15363b = C48275ro6.m15363b(c27144d.m19958a());
        c29057c.f111748h = null;
        c29057c.f111749i = null;
        c29057c.f111750j = null;
        c29057c.f111753m = 2;
        if (function3.invoke(zc0, m15363b, c29057c) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
