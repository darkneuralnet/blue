package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32105Cc6;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0017\u0010'\"\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m28432d2 = {"Lep;", "LsP5;", "", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lew1;", "h", "(Lew1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/util/List;", "fontList", "LAc6;", "c", "LAc6;", "typefaceRequest", "Lmp;", DateTokenConverter.CONVERTER_KEY, "Lmp;", "asyncTypefaceCache", "Lkotlin/Function1;", "LCc6$b;", "e", "Lkotlin/jvm/functions/Function1;", "onCompletion", "LxV3;", "LxV3;", "platformFontLoader", "<set-?>", "g", "LEX2;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "Z", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "initialType", "<init>", "(Ljava/util/List;Ljava/lang/Object;LAc6;Lmp;Lkotlin/jvm/functions/Function1;LxV3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n76#2:428\n102#2,2:429\n33#3,6:431\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n252#1:428\n252#1:429,2\n259#1:431,6\n*E\n"})
/* renamed from: ep */
/* loaded from: classes.dex */
public final class C20106ep implements InterfaceC48627sP5<Object> {

    /* renamed from: b */
    public final List<InterfaceC40641ew1> f78900b;

    /* renamed from: c */
    public final C31637Ac6 f78901c;

    /* renamed from: d */
    public final C26259mp f78902d;

    /* renamed from: e */
    public final Function1<InterfaceC32105Cc6.C1107b, Unit> f78903e;

    /* renamed from: f */
    public final InterfaceC51643xV3 f78904f;

    /* renamed from: g */
    public final EX2 f78905g;

    /* renamed from: h */
    public boolean f78906h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AsyncFontListLoader", m28418f = "FontListFontFamilyTypefaceAdapter.kt", m28417i = {0, 0, 0, 0, 1, 1, 1}, m28416l = {268, 281}, m28415m = "load", m28414n = {"this", "$this$fastForEach$iv", PaymentSheetEvent.FIELD_FONT, "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, m28413s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    /* renamed from: ep$a */
    /* loaded from: classes.dex */
    public static final class C20107a extends ContinuationImpl {

        /* renamed from: h */
        public Object f78907h;

        /* renamed from: i */
        public Object f78908i;

        /* renamed from: j */
        public Object f78909j;

        /* renamed from: k */
        public int f78910k;

        /* renamed from: l */
        public int f78911l;

        /* renamed from: m */
        public /* synthetic */ Object f78912m;

        /* renamed from: o */
        public int f78914o;

        public C20107a(Continuation<? super C20107a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78912m = obj;
            this.f78914o |= Integer.MIN_VALUE;
            return C20106ep.this.m42532f(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m28418f = "FontListFontFamilyTypefaceAdapter.kt", m28417i = {}, m28416l = {269}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ep$b */
    /* loaded from: classes.dex */
    public static final class C20108b extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {

        /* renamed from: h */
        public int f78915h;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC40641ew1 f78917j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20108b(InterfaceC40641ew1 interfaceC40641ew1, Continuation<? super C20108b> continuation) {
            super(1, continuation);
            this.f78917j = interfaceC40641ew1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C20108b(this.f78917j, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f78915h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C20106ep c20106ep = C20106ep.this;
                InterfaceC40641ew1 interfaceC40641ew1 = this.f78917j;
                this.f78915h = 1;
                obj = c20106ep.m42531h(interfaceC40641ew1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C20108b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AsyncFontListLoader", m28418f = "FontListFontFamilyTypefaceAdapter.kt", m28417i = {0}, m28416l = {300}, m28415m = "loadWithTimeoutOrNull$ui_text_release", m28414n = {"$this$loadWithTimeoutOrNull"}, m28413s = {"L$0"})
    /* renamed from: ep$c */
    /* loaded from: classes.dex */
    public static final class C20109c extends ContinuationImpl {

        /* renamed from: h */
        public Object f78918h;

        /* renamed from: i */
        public /* synthetic */ Object f78919i;

        /* renamed from: k */
        public int f78921k;

        public C20109c(Continuation<? super C20109c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78919i = obj;
            this.f78921k |= Integer.MIN_VALUE;
            return C20106ep.this.m42531h(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", m28418f = "FontListFontFamilyTypefaceAdapter.kt", m28417i = {}, m28416l = {Constants.BUCKET_REDIRECT_STATUS_CODE}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: ep$d */
    /* loaded from: classes.dex */
    public static final class C20110d extends SuspendLambda implements Function2<ZC0, Continuation<? super Object>, Object> {

        /* renamed from: h */
        public int f78922h;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC40641ew1 f78924j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20110d(InterfaceC40641ew1 interfaceC40641ew1, Continuation<? super C20110d> continuation) {
            super(2, continuation);
            this.f78924j = interfaceC40641ew1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20110d(this.f78924j, continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(ZC0 zc0, Continuation<Object> continuation) {
            return ((C20110d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f78922h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC51643xV3 interfaceC51643xV3 = C20106ep.this.f78904f;
                InterfaceC40641ew1 interfaceC40641ew1 = this.f78924j;
                this.f78922h = 1;
                obj = interfaceC51643xV3.mo5113c(interfaceC40641ew1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Object> continuation) {
            return invoke2(zc0, (Continuation<Object>) continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20106ep(List<? extends InterfaceC40641ew1> fontList, Object initialType, C31637Ac6 typefaceRequest, C26259mp asyncTypefaceCache, Function1<? super InterfaceC32105Cc6.C1107b, Unit> onCompletion, InterfaceC51643xV3 platformFontLoader) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.f78900b = fontList;
        this.f78901c = typefaceRequest;
        this.f78902d = asyncTypefaceCache;
        this.f78903e = onCompletion;
        this.f78904f = platformFontLoader;
        m97025e = LM5.m97025e(initialType, null, 2, null);
        this.f78905g = m97025e;
        this.f78906h = true;
    }

    /* renamed from: e */
    public final boolean m42533e() {
        return this.f78906h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef A[Catch: all -> 0x0107, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:28:0x0075, B:30:0x008c, B:35:0x00bb, B:38:0x00ef), top: B:55:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0102 -> B:42:0x0103). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x010a -> B:46:0x010c). Please submit an issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42532f(Continuation<? super Unit> continuation) {
        C20107a c20107a;
        Object coroutine_suspended;
        int i;
        C20106ep c20106ep;
        List<InterfaceC40641ew1> list;
        int size;
        C20106ep c20106ep2;
        int i2;
        InterfaceC40641ew1 interfaceC40641ew1;
        List<InterfaceC40641ew1> list2;
        int i3;
        if (continuation instanceof C20107a) {
            c20107a = (C20107a) continuation;
            int i4 = c20107a.f78914o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c20107a.f78914o = i4 - Integer.MIN_VALUE;
                Object obj = c20107a.f78912m;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c20107a.f78914o;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            size = c20107a.f78911l;
                            i3 = c20107a.f78910k;
                            list2 = (List) c20107a.f78908i;
                            c20106ep = (C20106ep) c20107a.f78907h;
                            try {
                                ResultKt.throwOnFailure(obj);
                                i2 = i3;
                                list = list2;
                                c20106ep2 = c20106ep;
                                i2++;
                                if (i2 >= size) {
                                    try {
                                        InterfaceC40641ew1 interfaceC40641ew12 = list.get(i2);
                                        if (C50128uw1.m9479e(interfaceC40641ew12.mo39575a(), C50128uw1.f113218a.m9476a())) {
                                            C26259mp c26259mp = c20106ep2.f78902d;
                                            InterfaceC51643xV3 interfaceC51643xV3 = c20106ep2.f78904f;
                                            C20108b c20108b = new C20108b(interfaceC40641ew12, null);
                                            c20107a.f78907h = c20106ep2;
                                            c20107a.f78908i = list;
                                            c20107a.f78909j = interfaceC40641ew12;
                                            c20107a.f78910k = i2;
                                            c20107a.f78911l = size;
                                            c20107a.f78914o = 1;
                                            int i5 = i2;
                                            Object m24893g = c26259mp.m24893g(interfaceC40641ew12, interfaceC51643xV3, false, c20108b, c20107a);
                                            if (m24893g == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            list2 = list;
                                            obj = m24893g;
                                            i3 = i5;
                                            interfaceC40641ew1 = interfaceC40641ew12;
                                            if (obj == null) {
                                                c20106ep2.setValue(C33216Gw1.m104572a(c20106ep2.f78901c.m115433e(), obj, interfaceC40641ew1, c20106ep2.f78901c.m115432f(), c20106ep2.f78901c.m115434d()));
                                                Unit unit = Unit.INSTANCE;
                                                boolean m98497o = C34018Kh2.m98497o(c20107a.getContext());
                                                c20106ep2.f78906h = false;
                                                c20106ep2.f78903e.invoke(new InterfaceC32105Cc6.C1107b(c20106ep2.getValue(), m98497o));
                                                return unit;
                                            }
                                            c20107a.f78907h = c20106ep2;
                                            c20107a.f78908i = list2;
                                            c20107a.f78909j = null;
                                            c20107a.f78910k = i3;
                                            c20107a.f78911l = size;
                                            c20107a.f78914o = 2;
                                            if (C40857fI6.m41600a(c20107a) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            c20106ep = c20106ep2;
                                            i2 = i3;
                                            list = list2;
                                            c20106ep2 = c20106ep;
                                            i2++;
                                            if (i2 >= size) {
                                                boolean m98497o2 = C34018Kh2.m98497o(c20107a.getContext());
                                                c20106ep2.f78906h = false;
                                                c20106ep2.f78903e.invoke(new InterfaceC32105Cc6.C1107b(c20106ep2.getValue(), m98497o2));
                                                return Unit.INSTANCE;
                                            }
                                        } else {
                                            i2++;
                                            if (i2 >= size) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c20106ep = c20106ep2;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        size = c20107a.f78911l;
                        i3 = c20107a.f78910k;
                        InterfaceC40641ew1 interfaceC40641ew13 = (InterfaceC40641ew1) c20107a.f78909j;
                        List<InterfaceC40641ew1> list3 = (List) c20107a.f78908i;
                        C20106ep c20106ep3 = (C20106ep) c20107a.f78907h;
                        try {
                            ResultKt.throwOnFailure(obj);
                            c20106ep2 = c20106ep3;
                            interfaceC40641ew1 = interfaceC40641ew13;
                            list2 = list3;
                            if (obj == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c20106ep = c20106ep3;
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        list = this.f78900b;
                        size = list.size();
                        c20106ep2 = this;
                        i2 = 0;
                        if (i2 >= size) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c20106ep = this;
                    }
                }
                boolean m98497o3 = C34018Kh2.m98497o(c20107a.getContext());
                c20106ep.f78906h = false;
                c20106ep.f78903e.invoke(new InterfaceC32105Cc6.C1107b(c20106ep.getValue(), m98497o3));
                throw th;
            }
        }
        c20107a = new C20107a(continuation);
        Object obj2 = c20107a.f78912m;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20107a.f78914o;
        if (i == 0) {
        }
        boolean m98497o32 = C34018Kh2.m98497o(c20107a.getContext());
        c20106ep.f78906h = false;
        c20106ep.f78903e.invoke(new InterfaceC32105Cc6.C1107b(c20106ep.getValue(), m98497o32));
        throw th;
    }

    @Override // p000.InterfaceC48627sP5
    public Object getValue() {
        return this.f78905g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42531h(InterfaceC40641ew1 interfaceC40641ew1, Continuation<Object> continuation) {
        C20109c c20109c;
        Object coroutine_suspended;
        int i;
        Object obj;
        try {
            if (continuation instanceof C20109c) {
                c20109c = (C20109c) continuation;
                int i2 = c20109c.f78921k;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c20109c.f78921k = i2 - Integer.MIN_VALUE;
                    Object obj2 = c20109c.f78919i;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c20109c.f78921k;
                    obj = null;
                    if (i == 0) {
                        if (i == 1) {
                            interfaceC40641ew1 = (InterfaceC40641ew1) c20109c.f78918h;
                            ResultKt.throwOnFailure(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj2);
                        C20110d c20110d = new C20110d(interfaceC40641ew1, null);
                        c20109c.f78918h = interfaceC40641ew1;
                        c20109c.f78921k = 1;
                        obj2 = N46.m94393c(15000L, c20110d, c20109c);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i == 0) {
            }
            obj = obj2;
            return obj;
        } catch (CancellationException e) {
            if (C34018Kh2.m98497o(c20109c.getContext())) {
                return obj;
            }
            throw e;
        } catch (Exception e2) {
            TC0 tc0 = (TC0) c20109c.getContext().get(TC0.f34895N);
            if (tc0 != null) {
                CoroutineContext context = c20109c.getContext();
                tc0.mo3742u(context, new IllegalStateException("Unable to load font " + interfaceC40641ew1, e2));
                return obj;
            }
            return obj;
        }
        c20109c = new C20109c(continuation);
        Object obj22 = c20109c.f78919i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c20109c.f78921k;
        obj = null;
    }

    public final void setValue(Object obj) {
        this.f78905g.setValue(obj);
    }
}
