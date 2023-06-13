package androidx.compose.p003ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43640jz5;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0012\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\"\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\"&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\",\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001a\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001e\u0010\u001f\u001a\u00020\f*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Landroid/view/View;", "LYt0;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "applicationContext", "LtP5;", "", "e", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/f;", "lifecycle", "Lqs4;", "b", "", C17296a.f69688o, "Ljava/util/Map;", "animationScale", "value", "f", "(Landroid/view/View;)LYt0;", "i", "(Landroid/view/View;LYt0;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)Lqs4;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n34#2:427\n361#3,7:428\n1#4:435\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:427\n99#1:428,7\n*E\n"})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a */
    public static final Map<Context, InterfaceC49220tP5<Float>> f53197a = new LinkedHashMap();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC11359a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ View f53198b;

        /* renamed from: c */
        public final /* synthetic */ C47720qs4 f53199c;

        public View$OnAttachStateChangeListenerC11359a(View view, C47720qs4 c47720qs4) {
            this.f53198b = view;
            this.f53199c = c47720qs4;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            this.f53198b.removeOnAttachStateChangeListener(this);
            this.f53199c.m16876T();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m28432d2 = {"LGu1;", "", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", m28418f = "WindowRecomposer.android.kt", m28417i = {0, 1}, m28416l = {115, 121}, m28415m = "invokeSuspend", m28414n = {"$this$flow", "$this$flow"}, m28413s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$b */
    /* loaded from: classes.dex */
    public static final class C11360b extends SuspendLambda implements Function2<InterfaceC33198Gu1<? super Float>, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public Object f53200h;

        /* renamed from: i */
        public int f53201i;

        /* renamed from: j */
        public /* synthetic */ Object f53202j;

        /* renamed from: k */
        public final /* synthetic */ ContentResolver f53203k;

        /* renamed from: l */
        public final /* synthetic */ Uri f53204l;

        /* renamed from: m */
        public final /* synthetic */ C11361c f53205m;

        /* renamed from: n */
        public final /* synthetic */ InterfaceC32846Fh0<Unit> f53206n;

        /* renamed from: o */
        public final /* synthetic */ Context f53207o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11360b(ContentResolver contentResolver, Uri uri, C11361c c11361c, InterfaceC32846Fh0<Unit> interfaceC32846Fh0, Context context, Continuation<? super C11360b> continuation) {
            super(2, continuation);
            this.f53203k = contentResolver;
            this.f53204l = uri;
            this.f53205m = c11361c;
            this.f53206n = interfaceC32846Fh0;
            this.f53207o = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C11360b c11360b = new C11360b(this.f53203k, this.f53204l, this.f53205m, this.f53206n, this.f53207o, continuation);
            c11360b.f53202j = obj;
            return c11360b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC33198Gu1<? super Float> interfaceC33198Gu1, Continuation<? super Unit> continuation) {
            return ((C11360b) create(interfaceC33198Gu1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            C11360b c11360b;
            InterfaceC33198Gu1 interfaceC33198Gu1;
            InterfaceC34952Oh0<Unit> it;
            Object mo31286a;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53201i;
            try {
            } catch (Throwable th) {
                th = th;
                c11360b = this;
            }
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            it = (InterfaceC34952Oh0) this.f53200h;
                            InterfaceC33198Gu1 interfaceC33198Gu12 = (InterfaceC33198Gu1) this.f53202j;
                            ResultKt.throwOnFailure(obj);
                            interfaceC33198Gu1 = interfaceC33198Gu12;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        it = (InterfaceC34952Oh0) this.f53200h;
                        InterfaceC33198Gu1 interfaceC33198Gu13 = (InterfaceC33198Gu1) this.f53202j;
                        ResultKt.throwOnFailure(obj);
                        InterfaceC33198Gu1 interfaceC33198Gu14 = interfaceC33198Gu13;
                        c11360b = this;
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            Float boxFloat = Boxing.boxFloat(Settings.Global.getFloat(c11360b.f53207o.getContentResolver(), "animator_duration_scale", 1.0f));
                            c11360b.f53202j = interfaceC33198Gu14;
                            c11360b.f53200h = it;
                            c11360b.f53201i = 2;
                            if (interfaceC33198Gu14.emit(boxFloat, c11360b) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            interfaceC33198Gu1 = interfaceC33198Gu14;
                            c11360b.f53202j = interfaceC33198Gu1;
                            c11360b.f53200h = it;
                            c11360b.f53201i = 1;
                            mo31286a = it.mo31286a(c11360b);
                            if (mo31286a != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            interfaceC33198Gu14 = interfaceC33198Gu1;
                            obj = mo31286a;
                            if (!((Boolean) obj).booleanValue()) {
                                c11360b.f53203k.unregisterContentObserver(c11360b.f53205m);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    interfaceC33198Gu1 = (InterfaceC33198Gu1) this.f53202j;
                    this.f53203k.registerContentObserver(this.f53204l, false, this.f53205m);
                    it = this.f53206n.iterator();
                }
                c11360b.f53202j = interfaceC33198Gu1;
                c11360b.f53200h = it;
                c11360b.f53201i = 1;
                mo31286a = it.mo31286a(c11360b);
                if (mo31286a != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                th = th2;
                c11360b.f53203k.unregisterContentObserver(c11360b.f53205m);
                throw th;
            }
            c11360b = this;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, m28432d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$c", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$c */
    /* loaded from: classes.dex */
    public static final class C11361c extends ContentObserver {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC32846Fh0<Unit> f53208a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11361c(InterfaceC32846Fh0<Unit> interfaceC32846Fh0, Handler handler) {
            super(handler);
            this.f53208a = interfaceC32846Fh0;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            this.f53208a.mo2349h(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, QV2] */
    /* renamed from: b */
    public static final C47720qs4 m68507b(final View view, CoroutineContext coroutineContext, AbstractC11719f abstractC11719f) {
        final C37899aL3 c37899aL3;
        CoroutineContext coroutineContext2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        if (coroutineContext.get(ContinuationInterceptor.Key) == null || coroutineContext.get(IV2.f15812c0) == null) {
            coroutineContext = C11426i.f53362m.m68293a().plus(coroutineContext);
        }
        IV2 iv2 = (IV2) coroutineContext.get(IV2.f15812c0);
        if (iv2 != null) {
            C37899aL3 c37899aL32 = new C37899aL3(iv2);
            c37899aL32.m71616e();
            c37899aL3 = c37899aL32;
        } else {
            c37899aL3 = null;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        PV2 pv2 = (PV2) coroutineContext.get(PV2.f28583d0);
        PV2 pv22 = pv2;
        if (pv2 == null) {
            ?? qv2 = new QV2();
            objectRef.element = qv2;
            pv22 = qv2;
        }
        if (c37899aL3 != null) {
            coroutineContext2 = c37899aL3;
        } else {
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext plus = coroutineContext.plus(coroutineContext2).plus(pv22);
        final C47720qs4 c47720qs4 = new C47720qs4(plus);
        final ZC0 m71790a = C37824aD0.m71790a(plus);
        if (abstractC11719f == null) {
            LifecycleOwner m87653a = C35534Qt6.m87653a(view);
            if (m87653a != null) {
                abstractC11719f = m87653a.getLifecycle();
            } else {
                abstractC11719f = null;
            }
        }
        if (abstractC11719f != null) {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC11359a(view, c47720qs4));
            abstractC11719f.mo67008a(new InterfaceC11728i() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$a */
                /* loaded from: classes.dex */
                public /* synthetic */ class C11363a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[AbstractC11719f.EnumC11720a.values().length];
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[AbstractC11719f.EnumC11720a.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                @DebugMetadata(m28419c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", m28418f = "WindowRecomposer.android.kt", m28417i = {0}, m28416l = {392}, m28415m = "invokeSuspend", m28414n = {"durationScaleJob"}, m28413s = {"L$0"})
                /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b */
                /* loaded from: classes.dex */
                public static final class C11364b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                    /* renamed from: h */
                    public int f53214h;

                    /* renamed from: i */
                    public /* synthetic */ Object f53215i;

                    /* renamed from: j */
                    public final /* synthetic */ Ref.ObjectRef<QV2> f53216j;

                    /* renamed from: k */
                    public final /* synthetic */ C47720qs4 f53217k;

                    /* renamed from: l */
                    public final /* synthetic */ LifecycleOwner f53218l;

                    /* renamed from: m */
                    public final /* synthetic */ C11362xff837ba9 f53219m;

                    /* renamed from: n */
                    public final /* synthetic */ View f53220n;

                    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                    @DebugMetadata(m28419c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", m28418f = "WindowRecomposer.android.kt", m28417i = {}, m28416l = {387}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
                    /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a */
                    /* loaded from: classes.dex */
                    public static final class C11365a extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

                        /* renamed from: h */
                        public int f53221h;

                        /* renamed from: i */
                        public final /* synthetic */ InterfaceC49220tP5<Float> f53222i;

                        /* renamed from: j */
                        public final /* synthetic */ QV2 f53223j;

                        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "scaleFactor", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a */
                        /* loaded from: classes.dex */
                        public static final class C11366a implements InterfaceC33198Gu1<Float> {

                            /* renamed from: b */
                            public final /* synthetic */ QV2 f53224b;

                            public C11366a(QV2 qv2) {
                                this.f53224b = qv2;
                            }

                            /* renamed from: c */
                            public final Object m68499c(float f, Continuation<? super Unit> continuation) {
                                this.f53224b.m88458e(f);
                                return Unit.INSTANCE;
                            }

                            @Override // p000.InterfaceC33198Gu1
                            public /* bridge */ /* synthetic */ Object emit(Float f, Continuation continuation) {
                                return m68499c(f.floatValue(), continuation);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C11365a(InterfaceC49220tP5<Float> interfaceC49220tP5, QV2 qv2, Continuation<? super C11365a> continuation) {
                            super(2, continuation);
                            this.f53222i = interfaceC49220tP5;
                            this.f53223j = qv2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C11365a(this.f53222i, this.f53223j, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                            return ((C11365a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended;
                            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.f53221h;
                            if (i != 0) {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            } else {
                                ResultKt.throwOnFailure(obj);
                                InterfaceC49220tP5<Float> interfaceC49220tP5 = this.f53222i;
                                C11366a c11366a = new C11366a(this.f53223j);
                                this.f53221h = 1;
                                if (interfaceC49220tP5.collect(c11366a, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11364b(Ref.ObjectRef<QV2> objectRef, C47720qs4 c47720qs4, LifecycleOwner lifecycleOwner, C11362xff837ba9 c11362xff837ba9, View view, Continuation<? super C11364b> continuation) {
                        super(2, continuation);
                        this.f53216j = objectRef;
                        this.f53217k = c47720qs4;
                        this.f53218l = lifecycleOwner;
                        this.f53219m = c11362xff837ba9;
                        this.f53220n = view;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C11364b c11364b = new C11364b(this.f53216j, this.f53217k, this.f53218l, this.f53219m, this.f53220n, continuation);
                        c11364b.f53215i = obj;
                        return c11364b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                        return ((C11364b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended;
                        InterfaceC52943zh2 interfaceC52943zh2;
                        InterfaceC52943zh2 interfaceC52943zh22;
                        InterfaceC49220tP5 m68504e;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.f53214h;
                        if (i != 0) {
                            if (i == 1) {
                                interfaceC52943zh2 = (InterfaceC52943zh2) this.f53215i;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                } catch (Throwable th) {
                                    th = th;
                                    if (interfaceC52943zh2 != null) {
                                        InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                                    }
                                    this.f53218l.getLifecycle().mo67006d(this.f53219m);
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.throwOnFailure(obj);
                            ZC0 zc0 = (ZC0) this.f53215i;
                            try {
                                QV2 qv2 = this.f53216j.element;
                                if (qv2 != null) {
                                    Context applicationContext = this.f53220n.getContext().getApplicationContext();
                                    Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                                    m68504e = WindowRecomposer_androidKt.m68504e(applicationContext);
                                    qv2.m88458e(((Number) m68504e.getValue()).floatValue());
                                    interfaceC52943zh22 = Z30.m73800d(zc0, null, null, new C11365a(m68504e, qv2, null), 3, null);
                                } else {
                                    interfaceC52943zh22 = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC52943zh2 = null;
                            }
                            try {
                                C47720qs4 c47720qs4 = this.f53217k;
                                this.f53215i = interfaceC52943zh22;
                                this.f53214h = 1;
                                if (c47720qs4.m16847m0(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                interfaceC52943zh2 = interfaceC52943zh22;
                            } catch (Throwable th3) {
                                interfaceC52943zh2 = interfaceC52943zh22;
                                th = th3;
                                if (interfaceC52943zh2 != null) {
                                }
                                this.f53218l.getLifecycle().mo67006d(this.f53219m);
                                throw th;
                            }
                        }
                        if (interfaceC52943zh2 != null) {
                            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
                        }
                        this.f53218l.getLifecycle().mo67006d(this.f53219m);
                        return Unit.INSTANCE;
                    }
                }

                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner source, AbstractC11719f.EnumC11720a event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    int i = C11363a.$EnumSwitchMapping$0[event.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    c47720qs4.m16876T();
                                    return;
                                }
                                return;
                            }
                            C37899aL3 c37899aL33 = c37899aL3;
                            if (c37899aL33 != null) {
                                c37899aL33.m71616e();
                                return;
                            }
                            return;
                        }
                        C37899aL3 c37899aL34 = c37899aL3;
                        if (c37899aL34 != null) {
                            c37899aL34.m71615h();
                            return;
                        }
                        return;
                    }
                    Z30.m73800d(ZC0.this, null, EnumC38417bD0.UNDISPATCHED, new C11364b(objectRef, c47720qs4, source, this, view, null), 1, null);
                }
            });
            return c47720qs4;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ C47720qs4 m68506c(View view, CoroutineContext coroutineContext, AbstractC11719f abstractC11719f, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            abstractC11719f = null;
        }
        return m68507b(view, coroutineContext, abstractC11719f);
    }

    /* renamed from: d */
    public static final AbstractC37400Yt0 m68505d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AbstractC37400Yt0 m68503f = m68503f(view);
        if (m68503f != null) {
            return m68503f;
        }
        for (ViewParent parent = view.getParent(); m68503f == null && (parent instanceof View); parent = parent.getParent()) {
            m68503f = m68503f((View) parent);
        }
        return m68503f;
    }

    /* renamed from: e */
    public static final InterfaceC49220tP5<Float> m68504e(Context context) {
        InterfaceC49220tP5<Float> interfaceC49220tP5;
        Map<Context, InterfaceC49220tP5<Float>> map = f53197a;
        synchronized (map) {
            InterfaceC49220tP5<Float> interfaceC49220tP52 = map.get(context);
            if (interfaceC49220tP52 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                InterfaceC32846Fh0 m89918b = C35186Ph0.m89918b(-1, null, null, 6, null);
                interfaceC49220tP52 = C36708Vu1.m79273O(C36708Vu1.m79283E(new C11360b(contentResolver, uriFor, new C11361c(m89918b, PE1.m90563a(Looper.getMainLooper())), m89918b, context, null)), C37824aD0.m71789b(), InterfaceC43640jz5.C25067a.m29522b(InterfaceC43640jz5.f93705a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, interfaceC49220tP52);
            }
            interfaceC49220tP5 = interfaceC49220tP52;
        }
        return interfaceC49220tP5;
    }

    /* renamed from: f */
    public static final AbstractC37400Yt0 m68503f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C46424oh4.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC37400Yt0) {
            return (AbstractC37400Yt0) tag;
        }
        return null;
    }

    /* renamed from: g */
    public static final View m68502g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    /* renamed from: h */
    public static final C47720qs4 m68501h(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            View m68502g = m68502g(view);
            AbstractC37400Yt0 m68503f = m68503f(m68502g);
            if (m68503f == null) {
                return C49104tC6.f110135a.m12601a(m68502g);
            }
            if (m68503f instanceof C47720qs4) {
                return (C47720qs4) m68503f;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    /* renamed from: i */
    public static final void m68500i(View view, AbstractC37400Yt0 abstractC37400Yt0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C46424oh4.androidx_compose_ui_view_composition_context, abstractC37400Yt0);
    }
}
