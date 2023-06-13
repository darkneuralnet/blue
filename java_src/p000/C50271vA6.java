package p000;

import android.webkit.WebView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"LvA6;", "", "Landroid/webkit/WebView;", "", "c", "(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZC0;", C17296a.f69688o, "LZC0;", "coroutineScope", "LBX2;", "LvA6$a;", "b", "LBX2;", "navigationEvents", "", "<set-?>", "LEX2;", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "canGoBack", "getCanGoForward", "e", "canGoForward", "<init>", "(LZC0;)V", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: vA6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50271vA6 {

    /* renamed from: a */
    public final ZC0 f113645a;

    /* renamed from: b */
    public final BX2<EnumC29449a> f113646b;

    /* renamed from: c */
    public final EX2 f113647c;

    /* renamed from: d */
    public final EX2 f113648d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LvA6$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "web_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: vA6$a */
    /* loaded from: classes5.dex */
    public enum EnumC29449a {
        BACK,
        FORWARD,
        RELOAD,
        STOP_LOADING
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.google.accompanist.web.WebViewNavigator", m28418f = "WebView.kt", m28417i = {}, m28416l = {372}, m28415m = "handleNavigationEvents$web_release", m28414n = {}, m28413s = {})
    /* renamed from: vA6$b */
    /* loaded from: classes5.dex */
    public static final class C29450b extends ContinuationImpl {

        /* renamed from: h */
        public /* synthetic */ Object f113654h;

        /* renamed from: j */
        public int f113656j;

        public C29450b(Continuation<? super C29450b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f113654h = obj;
            this.f113656j |= Integer.MIN_VALUE;
            return C50271vA6.this.m9061c(null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "com.google.accompanist.web.WebViewNavigator$handleNavigationEvents$2", m28418f = "WebView.kt", m28417i = {}, m28416l = {373}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: vA6$c */
    /* loaded from: classes5.dex */
    public static final class C29451c extends SuspendLambda implements Function2<ZC0, Continuation<?>, Object> {

        /* renamed from: h */
        public int f113657h;

        /* renamed from: j */
        public final /* synthetic */ WebView f113659j;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"LvA6$a;", "event", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        /* renamed from: vA6$c$a */
        /* loaded from: classes5.dex */
        public static final class C29452a implements InterfaceC33198Gu1<EnumC29449a> {

            /* renamed from: b */
            public final /* synthetic */ WebView f113660b;

            @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
            /* renamed from: vA6$c$a$a */
            /* loaded from: classes5.dex */
            public /* synthetic */ class C29453a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC29449a.values().length];
                    try {
                        iArr[EnumC29449a.BACK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC29449a.FORWARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC29449a.RELOAD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC29449a.STOP_LOADING.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public C29452a(WebView webView) {
                this.f113660b = webView;
            }

            @Override // p000.InterfaceC33198Gu1
            /* renamed from: c */
            public final Object emit(EnumC29449a enumC29449a, Continuation<? super Unit> continuation) {
                int i = C29453a.$EnumSwitchMapping$0[enumC29449a.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                this.f113660b.stopLoading();
                            }
                        } else {
                            this.f113660b.reload();
                        }
                    } else {
                        this.f113660b.goForward();
                    }
                } else {
                    this.f113660b.goBack();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29451c(WebView webView, Continuation<? super C29451c> continuation) {
            super(2, continuation);
            this.f113659j = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29451c(this.f113659j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<?> continuation) {
            return ((C29451c) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f113657h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                BX2 bx2 = C50271vA6.this.f113646b;
                C29452a c29452a = new C29452a(this.f113659j);
                this.f113657h = 1;
                if (bx2.collect(c29452a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public C50271vA6(ZC0 coroutineScope) {
        EX2 m97025e;
        EX2 m97025e2;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f113645a = coroutineScope;
        this.f113646b = C36748Vy5.m79031b(0, 0, null, 7, null);
        Boolean bool = Boolean.FALSE;
        m97025e = LM5.m97025e(bool, null, 2, null);
        this.f113647c = m97025e;
        m97025e2 = LM5.m97025e(bool, null, 2, null);
        this.f113648d = m97025e2;
    }

    /* renamed from: b */
    public final boolean m9062b() {
        return ((Boolean) this.f113647c.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9061c(WebView webView, Continuation<?> continuation) {
        C29450b c29450b;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C29450b) {
            c29450b = (C29450b) continuation;
            int i2 = c29450b.f113656j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c29450b.f113656j = i2 - Integer.MIN_VALUE;
                Object obj = c29450b.f113654h;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c29450b.f113656j;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    AbstractC46765pG2 m84376c = T41.m84376c();
                    C29451c c29451c = new C29451c(webView, null);
                    c29450b.f113656j = 1;
                    if (X30.m77504g(m84376c, c29451c, c29450b) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        c29450b = new C29450b(continuation);
        Object obj2 = c29450b.f113654h;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c29450b.f113656j;
        if (i == 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* renamed from: d */
    public final void m9060d(boolean z) {
        this.f113647c.setValue(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void m9059e(boolean z) {
        this.f113648d.setValue(Boolean.valueOf(z));
    }
}
