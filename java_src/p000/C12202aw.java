package p000;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001b\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"Law;", "", "LwO1;", "inAppMessageToPrepare", "", "g", "LLO1;", "inAppMessageHtml", "", "j", "inAppMessage", "h", "LpZ1;", "i", "f", "", "localImageUrl", "LKO1;", "inAppMessageWithImage", "LeO1;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Lw20;", "viewBounds", "e", DateTokenConverter.CONVERTER_KEY, "c", "(LwO1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: aw */
/* loaded from: classes5.dex */
public final class C12202aw {

    /* renamed from: a */
    public static final C12202aw f56552a = new C12202aw();

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C12203a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC52810zT2.values().length];
            iArr[EnumC52810zT2.HTML_FULL.ordinal()] = 1;
            iArr[EnumC52810zT2.HTML.ordinal()] = 2;
            iArr[EnumC52810zT2.SLIDEUP.ordinal()] = 3;
            iArr[EnumC52810zT2.MODAL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", m28418f = "BackgroundInAppMessagePreparer.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: aw$b */
    /* loaded from: classes5.dex */
    public static final class C12204b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f56553h;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC50985wO1 f56555j;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: aw$b$a */
        /* loaded from: classes5.dex */
        public static final class C12205a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C12205a f56556g = new C12205a();

            public C12205a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Displaying in-app message.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12204b(InterfaceC50985wO1 interfaceC50985wO1, Continuation<? super C12204b> continuation) {
            super(2, continuation);
            this.f56555j = interfaceC50985wO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12204b(this.f56555j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12204b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56553h == 0) {
                ResultKt.throwOnFailure(obj);
                C43664k20.m29442e(C43664k20.f93782a, C12202aw.this, null, null, false, C12205a.f56556g, 7, null);
                C42478i20.m35358s().m35360q(this.f56555j, false);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$c */
    /* loaded from: classes5.dex */
    public static final class C12206c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f56557g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12206c(String str) {
            super(0);
            this.f56557g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Passing in-app message local image url to image loader: ", this.f56557g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$d */
    /* loaded from: classes5.dex */
    public static final class C12207d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f56558g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12207d(String str) {
            super(0);
            this.f56558g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Removing local image url from IAM since it could not be loaded. URL: ", this.f56558g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$e */
    /* loaded from: classes5.dex */
    public static final class C12208e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12208e f56559g = new C12208e();

        public C12208e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Skipping in-app message preparation for control in-app message.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$f */
    /* loaded from: classes5.dex */
    public static final class C12209f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12209f f56560g = new C12209f();

        public C12209f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Starting asynchronous in-app message preparation for message.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$g */
    /* loaded from: classes5.dex */
    public static final class C12210g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12210g f56561g = new C12210g();

        public C12210g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Logging html in-app message zip asset download failure";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$h */
    /* loaded from: classes5.dex */
    public static final class C12211h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12211h f56562g = new C12211h();

        public C12211h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Logging in-app message image download failure";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", m28418f = "BackgroundInAppMessagePreparer.kt", m28417i = {0}, m28416l = {43}, m28415m = "invokeSuspend", m28414n = {"$this$launch"}, m28413s = {"L$0"})
    /* renamed from: aw$i */
    /* loaded from: classes5.dex */
    public static final class C12212i extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f56563h;

        /* renamed from: i */
        public /* synthetic */ Object f56564i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC50985wO1 f56565j;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: aw$i$a */
        /* loaded from: classes5.dex */
        public static final class C12213a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C12213a f56566g = new C12213a();

            public C12213a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cannot display the in-app message because the in-app message was null.";
            }
        }

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: aw$i$b */
        /* loaded from: classes5.dex */
        public static final class C12214b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C12214b f56567g = new C12214b();

            public C12214b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Caught error while preparing in app message in background";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12212i(InterfaceC50985wO1 interfaceC50985wO1, Continuation<? super C12212i> continuation) {
            super(2, continuation);
            this.f56565j = interfaceC50985wO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12212i c12212i = new C12212i(this.f56565j, continuation);
            c12212i.f56564i = obj;
            return c12212i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12212i) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            Exception exc;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56563h;
            if (i != 0) {
                if (i == 1) {
                    ZC0 zc02 = (ZC0) this.f56564i;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e) {
                        exc = e;
                        zc0 = zc02;
                        C43664k20.m29442e(C43664k20.f93782a, zc0, C43664k20.EnumC25082a.E, exc, false, C12214b.f56567g, 4, null);
                        return Unit.INSTANCE;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = (ZC0) this.f56564i;
                try {
                    C12202aw c12202aw = C12202aw.f56552a;
                    InterfaceC50985wO1 m65242f = c12202aw.m65242f(this.f56565j);
                    if (m65242f == null) {
                        C43664k20.m29442e(C43664k20.f93782a, obj2, C43664k20.EnumC25082a.W, null, false, C12213a.f56566g, 6, null);
                    } else {
                        this.f56564i = obj2;
                        this.f56563h = 1;
                        obj2 = c12202aw.m65245c(m65242f, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } catch (Exception e2) {
                    zc0 = obj2;
                    exc = e2;
                    C43664k20.m29442e(C43664k20.f93782a, zc0, C43664k20.EnumC25082a.E, exc, false, C12214b.f56567g, 4, null);
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$j */
    /* loaded from: classes5.dex */
    public static final class C12215j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12215j f56568g = new C12215j();

        public C12215j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot prepare non IInAppMessageWithImage object with bitmap download.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$k */
    /* loaded from: classes5.dex */
    public static final class C12216k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12216k f56569g = new C12216k();

        public C12216k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-app message already contains image bitmap. Not downloading image from URL.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$l */
    /* loaded from: classes5.dex */
    public static final class C12217l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12217l f56570g = new C12217l();

        public C12217l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$m */
    /* loaded from: classes5.dex */
    public static final class C12218m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f56571g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12218m(String str) {
            super(0);
            this.f56571g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("In-app message has remote image url. Downloading image at url: ", this.f56571g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$n */
    /* loaded from: classes5.dex */
    public static final class C12219n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12219n f56572g = new C12219n();

        public C12219n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-app message has no remote image url. Not downloading image.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$o */
    /* loaded from: classes5.dex */
    public static final class C12220o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12220o f56573g = new C12220o();

        public C12220o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "In-app message full has no remote image url yet is required to have an image. Failing message display.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$p */
    /* loaded from: classes5.dex */
    public static final class C12221p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12221p f56574g = new C12221p();

        public C12221p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "HTML in-app message does not have prefetched assets. Not performing any substitutions.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$q */
    /* loaded from: classes5.dex */
    public static final class C12222q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12222q f56575g = new C12222q();

        public C12222q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "HTML in-app message does not have message. Not performing any substitutions.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$r */
    /* loaded from: classes5.dex */
    public static final class C12223r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f56576g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12223r(String str) {
            super(0);
            this.f56576g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Local assets for html in-app message are already populated. Not downloading assets. Location = ", this.f56576g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$s */
    /* loaded from: classes5.dex */
    public static final class C12224s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12224s f56577g = new C12224s();

        public C12224s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Html in-app message has no remote asset zip. Continuing with in-app message preparation.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$t */
    /* loaded from: classes5.dex */
    public static final class C12225t extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C12225t f56578g = new C12225t();

        public C12225t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "BrazeInAppMessageManager applicationContext is null. Not downloading image.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$u */
    /* loaded from: classes5.dex */
    public static final class C12226u extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f56579g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12226u(String str) {
            super(0);
            this.f56579g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Local url for html in-app message assets is ", this.f56579g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: aw$v */
    /* loaded from: classes5.dex */
    public static final class C12227v extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ LO1 f56580g;

        /* renamed from: h */
        public final /* synthetic */ String f56581h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12227v(LO1 lo1, String str) {
            super(0);
            this.f56580g = lo1;
            this.f56581h = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Download of html content to local directory failed for remote url: " + ((Object) this.f56580g.mo96971m0()) + " . Returned local url is: " + ((Object) this.f56581h);
        }
    }

    private C12202aw() {
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m65241g(InterfaceC50985wO1 inAppMessageToPrepare) {
        Intrinsics.checkNotNullParameter(inAppMessageToPrepare, "inAppMessageToPrepare");
        Z30.m73800d(Z10.f47750b, null, null, new C12212i(inAppMessageToPrepare, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    @JvmStatic
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m65240h(InterfaceC50985wO1 interfaceC50985wO1) {
        boolean z;
        String mo98924w;
        boolean z2;
        boolean isBlank;
        boolean isBlank2;
        if (!(interfaceC50985wO1 instanceof KO1)) {
            C43664k20.m29442e(C43664k20.f93782a, f56552a, null, null, false, C12215j.f56568g, 7, null);
            return false;
        }
        KO1 ko1 = (KO1) interfaceC50985wO1;
        if (ko1.getBitmap() != null) {
            C43664k20.m29442e(C43664k20.f93782a, f56552a, C43664k20.EnumC25082a.I, null, false, C12216k.f56569g, 6, null);
            ko1.mo98923x(true);
            return true;
        }
        C12202aw c12202aw = f56552a;
        EnumC50778w20 m65244d = c12202aw.m65244d(interfaceC50985wO1);
        Context m6658b = C42478i20.m35358s().m6658b();
        if (m6658b == null) {
            C43664k20.m29442e(C43664k20.f93782a, c12202aw, C43664k20.EnumC25082a.W, null, false, C12217l.f56570g, 6, null);
            return false;
        }
        InterfaceC40313eO1 imageLoader = P10.getInstance(m6658b).getImageLoader();
        String mo98925e = ko1.mo98925e();
        if (mo98925e != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(mo98925e);
            if (!isBlank2) {
                z = false;
                if (!z) {
                    Intrinsics.checkNotNullExpressionValue(imageLoader, "imageLoader");
                    if (c12202aw.m65243e(mo98925e, ko1, imageLoader, m6658b, interfaceC50985wO1, m65244d)) {
                        return true;
                    }
                }
                mo98924w = ko1.mo98924w();
                if (mo98924w != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(mo98924w);
                    if (!isBlank) {
                        z2 = false;
                        if (!z2) {
                            C43664k20.m29442e(C43664k20.f93782a, c12202aw, C43664k20.EnumC25082a.I, null, false, new C12218m(mo98924w), 6, null);
                            ko1.mo98922y(imageLoader.mo10198b(m6658b, interfaceC50985wO1, mo98924w, m65244d));
                            if (ko1.getBitmap() == null) {
                                return false;
                            }
                            ko1.mo98923x(true);
                            return true;
                        }
                        C43664k20 c43664k20 = C43664k20.f93782a;
                        C43664k20.EnumC25082a enumC25082a = C43664k20.EnumC25082a.W;
                        C43664k20.m29442e(c43664k20, c12202aw, enumC25082a, null, false, C12219n.f56572g, 6, null);
                        if (!(ko1 instanceof C45749nZ1)) {
                            return true;
                        }
                        C43664k20.m29442e(c43664k20, c12202aw, enumC25082a, null, false, C12220o.f56573g, 6, null);
                        return false;
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
        }
        z = true;
        if (!z) {
        }
        mo98924w = ko1.mo98924w();
        if (mo98924w != null) {
        }
        z2 = true;
        if (!z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    @JvmStatic
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m65238j(LO1 inAppMessageHtml) {
        boolean z;
        String mo96971m0;
        boolean z2;
        boolean z3;
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        Intrinsics.checkNotNullParameter(inAppMessageHtml, "inAppMessageHtml");
        String mo3530U = inAppMessageHtml.mo3530U();
        if (mo3530U != null) {
            isBlank3 = StringsKt__StringsJVMKt.isBlank(mo3530U);
            if (!isBlank3) {
                z = false;
                if (z && new File(mo3530U).exists()) {
                    C43664k20.m29442e(C43664k20.f93782a, f56552a, C43664k20.EnumC25082a.I, null, false, new C12223r(mo3530U), 6, null);
                    return true;
                }
                mo96971m0 = inAppMessageHtml.mo96971m0();
                if (mo96971m0 != null) {
                    isBlank2 = StringsKt__StringsJVMKt.isBlank(mo96971m0);
                    if (!isBlank2) {
                        z2 = false;
                        if (z2) {
                            C43664k20.m29442e(C43664k20.f93782a, f56552a, C43664k20.EnumC25082a.I, null, false, C12224s.f56577g, 6, null);
                            return true;
                        }
                        Context m6658b = C42478i20.m35358s().m6658b();
                        if (m6658b == null) {
                            C43664k20.m29442e(C43664k20.f93782a, f56552a, C43664k20.EnumC25082a.W, null, false, C12225t.f56578g, 6, null);
                            return false;
                        }
                        String m77581b = C36992Wz6.m77581b(C36992Wz6.m77582a(m6658b), mo96971m0);
                        if (m77581b != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(m77581b);
                            if (!isBlank) {
                                z3 = false;
                                if (z3) {
                                    C43664k20.m29442e(C43664k20.f93782a, f56552a, null, null, false, new C12226u(m77581b), 7, null);
                                    inAppMessageHtml.mo3529W(m77581b);
                                    return true;
                                }
                                C43664k20.m29442e(C43664k20.f93782a, f56552a, C43664k20.EnumC25082a.W, null, false, new C12227v(inAppMessageHtml, m77581b), 6, null);
                                return false;
                            }
                        }
                        z3 = true;
                        if (z3) {
                        }
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        z = true;
        if (z) {
        }
        mo96971m0 = inAppMessageHtml.mo96971m0();
        if (mo96971m0 != null) {
        }
        z2 = true;
        if (z2) {
        }
    }

    /* renamed from: c */
    public final Object m65245c(InterfaceC50985wO1 interfaceC50985wO1, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(T41.m84376c(), new C12204b(interfaceC50985wO1, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    /* renamed from: d */
    public final EnumC50778w20 m65244d(InterfaceC50985wO1 interfaceC50985wO1) {
        int i = C12203a.$EnumSwitchMapping$0[interfaceC50985wO1.mo5008h0().ordinal()];
        if (i != 3) {
            if (i != 4) {
                return EnumC50778w20.NO_BOUNDS;
            }
            return EnumC50778w20.IN_APP_MESSAGE_MODAL;
        }
        return EnumC50778w20.IN_APP_MESSAGE_SLIDEUP;
    }

    /* renamed from: e */
    public final boolean m65243e(String str, KO1 ko1, InterfaceC40313eO1 interfaceC40313eO1, Context context, InterfaceC50985wO1 interfaceC50985wO1, EnumC50778w20 enumC50778w20) {
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, new C12206c(str), 6, null);
        ko1.mo98922y(interfaceC40313eO1.mo10198b(context, interfaceC50985wO1, str, enumC50778w20));
        if (ko1.getBitmap() != null) {
            ko1.mo98923x(true);
            return true;
        }
        C43664k20.m29442e(c43664k20, this, null, null, false, new C12207d(str), 7, null);
        ko1.mo98926b(null);
        return false;
    }

    /* renamed from: f */
    public final InterfaceC50985wO1 m65242f(InterfaceC50985wO1 interfaceC50985wO1) {
        if (interfaceC50985wO1.isControl()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12208e.f56559g, 7, null);
            return interfaceC50985wO1;
        }
        C43664k20 c43664k20 = C43664k20.f93782a;
        C43664k20.m29442e(c43664k20, this, null, null, false, C12209f.f56560g, 7, null);
        int i = C12203a.$EnumSwitchMapping$0[interfaceC50985wO1.mo5008h0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!m65240h(interfaceC50985wO1)) {
                    C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, C12211h.f56562g, 6, null);
                    interfaceC50985wO1.mo6945T(EnumC45156mZ1.IMAGE_DOWNLOAD);
                    return null;
                }
            } else {
                m65239i((C46935pZ1) interfaceC50985wO1);
            }
        } else if (!m65238j((LO1) interfaceC50985wO1)) {
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, C12210g.f56561g, 6, null);
            interfaceC50985wO1.mo6945T(EnumC45156mZ1.ZIP_ASSET_DOWNLOAD);
            return null;
        }
        return interfaceC50985wO1;
    }

    /* renamed from: i */
    public final void m65239i(C46935pZ1 inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        if (inAppMessage.m19106u0().isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12221p.f56574g, 7, null);
            return;
        }
        String message = inAppMessage.getMessage();
        if (message == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12222q.f56575g, 7, null);
        } else {
            inAppMessage.m36204i0(C36992Wz6.m77580c(message, inAppMessage.m19106u0()));
        }
    }
}
