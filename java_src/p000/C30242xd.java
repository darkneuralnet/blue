package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.p003ui.platform.C11411h;
import androidx.compose.p003ui.window.PopupLayout;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.OU3;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28432d2 = {"LzY3;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismissRequest", "LAY3;", "properties", "content", C17296a.f69688o, "(LzY3;Lkotlin/jvm/functions/Function0;LAY3;Lkotlin/jvm/functions/Function2;LEt0;II)V", "Landroid/view/View;", "", "e", "Landroid/graphics/Rect;", "LD52;", "f", "LU94;", "", "LU94;", "getLocalPopupTestTag", "()LU94;", "LocalPopupTestTag", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n50#2:825\n49#2:826\n25#2:837\n456#2,14:857\n456#2,14:885\n1114#3,6:827\n1114#3,6:838\n76#4:833\n76#4:834\n76#4:835\n76#4:836\n76#4:845\n76#4:873\n74#5:844\n75#5,11:846\n88#5:871\n74#5:872\n75#5,11:874\n88#5:899\n76#6:900\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:825\n194#1:826\n235#1:837\n309#1:857,14\n341#1:885,14\n194#1:827,6\n235#1:838,6\n228#1:833\n229#1:834\n230#1:835\n231#1:836\n309#1:845\n341#1:873\n309#1:844\n309#1:846,11\n309#1:871\n341#1:872\n341#1:874,11\n341#1:899\n233#1:900\n*E\n"})
/* renamed from: xd */
/* loaded from: classes.dex */
public final class C30242xd {

    /* renamed from: a */
    public static final U94<String> f117869a = C41806gu0.m37351c(null, C30243a.f117870g, 1, null);

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$a */
    /* loaded from: classes.dex */
    public static final class C30243a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C30243a f117870g = new C30243a();

        public C30243a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,824:1\n62#2,5:825\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n271#1:825,5\n*E\n"})
    /* renamed from: xd$b */
    /* loaded from: classes.dex */
    public static final class C30244b extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ PopupLayout f117871g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f117872h;

        /* renamed from: i */
        public final /* synthetic */ AY3 f117873i;

        /* renamed from: j */
        public final /* synthetic */ String f117874j;

        /* renamed from: k */
        public final /* synthetic */ EnumC47065pm2 f117875k;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"xd$b$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n1#1,484:1\n272#2,4:485\n*E\n"})
        /* renamed from: xd$b$a */
        /* loaded from: classes.dex */
        public static final class C30245a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ PopupLayout f117876a;

            public C30245a(PopupLayout popupLayout) {
                this.f117876a = popupLayout;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f117876a.disposeComposition();
                this.f117876a.m68240d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30244b(PopupLayout popupLayout, Function0<Unit> function0, AY3 ay3, String str, EnumC47065pm2 enumC47065pm2) {
            super(1);
            this.f117871g = popupLayout;
            this.f117872h = function0;
            this.f117873i = ay3;
            this.f117874j = str;
            this.f117875k = enumC47065pm2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f117871g.m68228p();
            this.f117871g.m68226r(this.f117872h, this.f117873i, this.f117874j, this.f117875k);
            return new C30245a(this.f117871g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$c */
    /* loaded from: classes.dex */
    public static final class C30246c extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ PopupLayout f117877g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f117878h;

        /* renamed from: i */
        public final /* synthetic */ AY3 f117879i;

        /* renamed from: j */
        public final /* synthetic */ String f117880j;

        /* renamed from: k */
        public final /* synthetic */ EnumC47065pm2 f117881k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30246c(PopupLayout popupLayout, Function0<Unit> function0, AY3 ay3, String str, EnumC47065pm2 enumC47065pm2) {
            super(0);
            this.f117877g = popupLayout;
            this.f117878h = function0;
            this.f117879i = ay3;
            this.f117880j = str;
            this.f117881k = enumC47065pm2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f117877g.m68226r(this.f117878h, this.f117879i, this.f117880j, this.f117881k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,824:1\n62#2,5:825\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n290#1:825,5\n*E\n"})
    /* renamed from: xd$d */
    /* loaded from: classes.dex */
    public static final class C30247d extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ PopupLayout f117882g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC52856zY3 f117883h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"xd$d$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n1#1,484:1\n290#2:485\n*E\n"})
        /* renamed from: xd$d$a */
        /* loaded from: classes.dex */
        public static final class C30248a implements InterfaceC44288l51 {
            @Override // p000.InterfaceC44288l51
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30247d(PopupLayout popupLayout, InterfaceC52856zY3 interfaceC52856zY3) {
            super(1);
            this.f117882g = popupLayout;
            this.f117883h = interfaceC52856zY3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f117882g.setPositionProvider(this.f117883h);
            this.f117882g.m68223u();
            return new C30248a();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", m28418f = "AndroidPopup.android.kt", m28417i = {0}, m28416l = {Constants.BUCKET_REDIRECT_STATUS_CODE}, m28415m = "invokeSuspend", m28414n = {"$this$LaunchedEffect"}, m28413s = {"L$0"})
    /* renamed from: xd$e */
    /* loaded from: classes.dex */
    public static final class C30249e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f117884h;

        /* renamed from: i */
        public /* synthetic */ Object f117885i;

        /* renamed from: j */
        public final /* synthetic */ PopupLayout f117886j;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xd$e$a */
        /* loaded from: classes.dex */
        public static final class C30250a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public static final C30250a f117887g = new C30250a();

            public C30250a() {
                super(1);
            }

            /* renamed from: a */
            public final void m4925a(long j) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m4925a(l.longValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30249e(PopupLayout popupLayout, Continuation<? super C30249e> continuation) {
            super(2, continuation);
            this.f117886j = popupLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30249e c30249e = new C30249e(this.f117886j, continuation);
            c30249e.f117885i = obj;
            return c30249e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C30249e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0035 -> B:31:0x0038). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            ZC0 zc0;
            C30249e c30249e;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f117884h;
            if (i != 0) {
                if (i == 1) {
                    zc0 = (ZC0) this.f117885i;
                    ResultKt.throwOnFailure(obj);
                    c30249e = this;
                    c30249e.f117886j.m68233k();
                    if (C37824aD0.m71785f(zc0)) {
                        C30250a c30250a = C30250a.f117887g;
                        c30249e.f117885i = zc0;
                        c30249e.f117884h = 1;
                        if (G12.m105952a(c30250a, c30249e) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c30249e.f117886j.m68233k();
                        if (C37824aD0.m71785f(zc0)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                zc0 = (ZC0) this.f117885i;
                c30249e = this;
                if (C37824aD0.m71785f(zc0)) {
                }
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$f */
    /* loaded from: classes.dex */
    public static final class C30251f extends Lambda implements Function1<InterfaceC45879nm2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PopupLayout f117888g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30251f(PopupLayout popupLayout) {
            super(1);
            this.f117888g = popupLayout;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC45879nm2 interfaceC45879nm2) {
            invoke2(interfaceC45879nm2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(InterfaceC45879nm2 childCoordinates) {
            Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
            InterfaceC45879nm2 mo23182t = childCoordinates.mo23182t();
            Intrinsics.checkNotNull(mo23182t);
            this.f117888g.m68224t(mo23182t);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$g */
    /* loaded from: classes.dex */
    public static final class C30252g implements InterfaceC51579xO2 {

        /* renamed from: a */
        public final /* synthetic */ PopupLayout f117889a;

        /* renamed from: b */
        public final /* synthetic */ EnumC47065pm2 f117890b;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xd$g$a */
        /* loaded from: classes.dex */
        public static final class C30253a extends Lambda implements Function1<OU3.AbstractC6015a, Unit> {

            /* renamed from: g */
            public static final C30253a f117891g = new C30253a();

            public C30253a() {
                super(1);
            }

            /* renamed from: a */
            public final void m4924a(OU3.AbstractC6015a layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OU3.AbstractC6015a abstractC6015a) {
                m4924a(abstractC6015a);
                return Unit.INSTANCE;
            }
        }

        public C30252g(PopupLayout popupLayout, EnumC47065pm2 enumC47065pm2) {
            this.f117889a = popupLayout;
            this.f117890b = enumC47065pm2;
        }

        @Override // p000.InterfaceC51579xO2
        /* renamed from: a */
        public final InterfaceC52172yO2 mo3160a(InterfaceC52765zO2 Layout, List<? extends InterfaceC50393vO2> list, long j) {
            Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
            Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
            this.f117889a.setParentLayoutDirection(this.f117890b);
            return InterfaceC52765zO2.m1430Y(Layout, 0, 0, null, C30253a.f117891g, 4, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$h */
    /* loaded from: classes.dex */
    public static final class C30254h extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC52856zY3 f117892g;

        /* renamed from: h */
        public final /* synthetic */ Function0<Unit> f117893h;

        /* renamed from: i */
        public final /* synthetic */ AY3 f117894i;

        /* renamed from: j */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f117895j;

        /* renamed from: k */
        public final /* synthetic */ int f117896k;

        /* renamed from: l */
        public final /* synthetic */ int f117897l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30254h(InterfaceC52856zY3 interfaceC52856zY3, Function0<Unit> function0, AY3 ay3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i, int i2) {
            super(2);
            this.f117892g = interfaceC52856zY3;
            this.f117893h = function0;
            this.f117894i = ay3;
            this.f117895j = function2;
            this.f117896k = i;
            this.f117897l = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C30242xd.m4931a(this.f117892g, this.f117893h, this.f117894i, this.f117895j, interfaceC32720Et0, C47127ps4.m18626a(this.f117896k | 1), this.f117897l);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xd$i */
    /* loaded from: classes.dex */
    public static final class C30255i extends Lambda implements Function0<UUID> {

        /* renamed from: g */
        public static final C30255i f117898g = new C30255i();

        public C30255i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,824:1\n341#2:825\n368#2:854\n74#3:826\n75#3,11:828\n88#3:853\n76#4:827\n456#5,14:839\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n246#1:825\n246#1:854\n246#1:826\n246#1:828,11\n246#1:853\n246#1:827\n246#1:839,14\n*E\n"})
    /* renamed from: xd$j */
    /* loaded from: classes.dex */
    public static final class C30256j extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ PopupLayout f117899g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC48627sP5<Function2<InterfaceC32720Et0, Integer, Unit>> f117900h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xd$j$a */
        /* loaded from: classes.dex */
        public static final class C30257a extends Lambda implements Function1<InterfaceC48906ss5, Unit> {

            /* renamed from: g */
            public static final C30257a f117901g = new C30257a();

            public C30257a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
                invoke2(interfaceC48906ss5);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(InterfaceC48906ss5 semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                C47128ps5.m18574y(semantics);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xd$j$b */
        /* loaded from: classes.dex */
        public static final class C30258b extends Lambda implements Function1<G52, Unit> {

            /* renamed from: g */
            public final /* synthetic */ PopupLayout f117902g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30258b(PopupLayout popupLayout) {
                super(1);
                this.f117902g = popupLayout;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(G52 g52) {
                m118450invokeozmzZPI(g52.m105826j());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI */
            public final void m118450invokeozmzZPI(long j) {
                this.f117902g.m116235setPopupContentSizefhxjrPA(G52.m105834b(j));
                this.f117902g.m68223u();
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: xd$j$c */
        /* loaded from: classes.dex */
        public static final class C30259c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

            /* renamed from: g */
            public final /* synthetic */ InterfaceC48627sP5<Function2<InterfaceC32720Et0, Integer, Unit>> f117903g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C30259c(InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
                super(2);
                this.f117903g = interfaceC48627sP5;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
                if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(606497925, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:255)");
                }
                C30242xd.m4930b(this.f117903g).invoke(interfaceC32720Et0, 0);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C30256j(PopupLayout popupLayout, InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
            super(2);
            this.f117899g = popupLayout;
            this.f117900h = interfaceC48627sP5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1302892335, i, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:244)");
            }
            InterfaceC41563gV2 m81909a = C8203U9.m81909a(C42272hh3.m36095a(C41198fs5.m40620b(InterfaceC41563gV2.f82354b0, false, C30257a.f117901g, 1, null), new C30258b(this.f117899g)), this.f117899g.m68239e() ? 1.0f : 0.0f);
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, 606497925, true, new C30259c(this.f117900h));
            interfaceC32720Et0.mo89638F(1406149896);
            C30637yd c30637yd = C30637yd.f119855a;
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m81909a);
            if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
                C52468yt0.m2335c();
            }
            interfaceC32720Et0.mo89557h();
            if (interfaceC32720Et0.mo89521t()) {
                interfaceC32720Et0.mo89617M(m113415a);
            } else {
                interfaceC32720Et0.mo89566e();
            }
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
            C38680bf6.m64191b(m64192a, c30637yd, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89638F(2058660585);
            m29791b.invoke(interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4931a(InterfaceC52856zY3 popupPositionProvider, Function0<Unit> function0, AY3 ay3, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        Object obj3;
        AY3 ay32;
        Object mo89635G;
        EnumC47065pm2 enumC47065pm2;
        Continuation continuation;
        Function0<Unit> function02;
        AY3 ay33;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(popupPositionProvider)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = function0;
            if (mo89518u.mo89629I(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = ay3;
                if (mo89518u.mo89539n(obj2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (mo89518u.mo89629I(content)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i3 |= i8;
                }
                i9 = i3;
                if ((i9 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    function02 = obj;
                    ay33 = obj2;
                } else {
                    if (i10 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj;
                    }
                    if (i6 != 0) {
                        ay32 = new AY3(false, false, false, null, false, false, 63, null);
                    } else {
                        ay32 = obj2;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-830247068, i9, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
                    }
                    View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    String str = (String) mo89518u.mo89572c(f117869a);
                    EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    AbstractC37400Yt0 m2334d = C52468yt0.m2334d(mo89518u, 0);
                    InterfaceC48627sP5 m105193n = GM5.m105193n(content, mo89518u, (i9 >> 9) & 14);
                    UUID popupId = (UUID) C35550Qv4.m87571b(new Object[0], null, null, C30255i.f117898g, mo89518u, 3080, 6);
                    mo89518u.mo89638F(-492369756);
                    mo89635G = mo89518u.mo89635G();
                    if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                        Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                        enumC47065pm2 = enumC47065pm22;
                        continuation = null;
                        PopupLayout popupLayout = new PopupLayout(obj3, ay32, str, view, interfaceC41273g01, popupPositionProvider, popupId, null, 128, null);
                        popupLayout.setContent(m2334d, C43575jt0.m29790c(1302892335, true, new C30256j(popupLayout, m105193n)));
                        mo89518u.mo89503z(popupLayout);
                        mo89635G = popupLayout;
                    } else {
                        enumC47065pm2 = enumC47065pm22;
                        continuation = null;
                    }
                    mo89518u.mo89605Q();
                    PopupLayout popupLayout2 = (PopupLayout) mo89635G;
                    Function0<Unit> function03 = obj3;
                    AY3 ay34 = ay32;
                    EnumC47065pm2 enumC47065pm23 = enumC47065pm2;
                    Y91.m75536c(popupLayout2, new C30244b(popupLayout2, function03, ay34, str, enumC47065pm23), mo89518u, 8);
                    Y91.m75531h(new C30246c(popupLayout2, function03, ay34, str, enumC47065pm23), mo89518u, 0);
                    Y91.m75536c(popupPositionProvider, new C30247d(popupLayout2, popupPositionProvider), mo89518u, i9 & 14);
                    Y91.m75533f(popupLayout2, new C30249e(popupLayout2, continuation), mo89518u, 72);
                    InterfaceC41563gV2 m83186a = C36116Tg3.m83186a(InterfaceC41563gV2.f82354b0, new C30251f(popupLayout2));
                    C30252g c30252g = new C30252g(popupLayout2, enumC47065pm2);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm24 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m83186a);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    mo89518u.mo89557h();
                    if (mo89518u.mo89521t()) {
                        mo89518u.mo89617M(m113415a);
                    } else {
                        mo89518u.mo89566e();
                    }
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a, c30252g, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g012, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm24, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89605Q();
                    mo89518u.mo89563f();
                    mo89518u.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    function02 = obj3;
                    ay33 = ay32;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new C30254h(popupPositionProvider, function02, ay33, content, i, i2));
                    return;
                }
                return;
            }
            obj2 = ay3;
            if ((i2 & 8) != 0) {
            }
            i9 = i3;
            if ((i9 & 5851) != 1170) {
            }
            if (i10 != 0) {
            }
            if (i6 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            View view2 = (View) mo89518u.mo89572c(C11411h.m68320k());
            InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            String str2 = (String) mo89518u.mo89572c(f117869a);
            EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            AbstractC37400Yt0 m2334d2 = C52468yt0.m2334d(mo89518u, 0);
            InterfaceC48627sP5 m105193n2 = GM5.m105193n(content, mo89518u, (i9 >> 9) & 14);
            UUID popupId2 = (UUID) C35550Qv4.m87571b(new Object[0], null, null, C30255i.f117898g, mo89518u, 3080, 6);
            mo89518u.mo89638F(-492369756);
            mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            }
            mo89518u.mo89605Q();
            PopupLayout popupLayout22 = (PopupLayout) mo89635G;
            Function0<Unit> function032 = obj3;
            AY3 ay342 = ay32;
            EnumC47065pm2 enumC47065pm232 = enumC47065pm2;
            Y91.m75536c(popupLayout22, new C30244b(popupLayout22, function032, ay342, str2, enumC47065pm232), mo89518u, 8);
            Y91.m75531h(new C30246c(popupLayout22, function032, ay342, str2, enumC47065pm232), mo89518u, 0);
            Y91.m75536c(popupPositionProvider, new C30247d(popupLayout22, popupPositionProvider), mo89518u, i9 & 14);
            Y91.m75533f(popupLayout22, new C30249e(popupLayout22, continuation), mo89518u, 72);
            InterfaceC41563gV2 m83186a2 = C36116Tg3.m83186a(InterfaceC41563gV2.f82354b0, new C30251f(popupLayout22));
            C30252g c30252g2 = new C30252g(popupLayout22, enumC47065pm2);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm242 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m83186a2);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, c30252g2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g0122, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm242, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            function02 = obj3;
            ay33 = ay32;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = function0;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj2 = ay3;
        if ((i2 & 8) != 0) {
        }
        i9 = i3;
        if ((i9 & 5851) != 1170) {
        }
        if (i10 != 0) {
        }
        if (i6 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        View view22 = (View) mo89518u.mo89572c(C11411h.m68320k());
        InterfaceC41273g01 interfaceC41273g0132 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        String str22 = (String) mo89518u.mo89572c(f117869a);
        EnumC47065pm2 enumC47065pm2222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        AbstractC37400Yt0 m2334d22 = C52468yt0.m2334d(mo89518u, 0);
        InterfaceC48627sP5 m105193n22 = GM5.m105193n(content, mo89518u, (i9 >> 9) & 14);
        UUID popupId22 = (UUID) C35550Qv4.m87571b(new Object[0], null, null, C30255i.f117898g, mo89518u, 3080, 6);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        PopupLayout popupLayout222 = (PopupLayout) mo89635G;
        Function0<Unit> function0322 = obj3;
        AY3 ay3422 = ay32;
        EnumC47065pm2 enumC47065pm2322 = enumC47065pm2;
        Y91.m75536c(popupLayout222, new C30244b(popupLayout222, function0322, ay3422, str22, enumC47065pm2322), mo89518u, 8);
        Y91.m75531h(new C30246c(popupLayout222, function0322, ay3422, str22, enumC47065pm2322), mo89518u, 0);
        Y91.m75536c(popupPositionProvider, new C30247d(popupLayout222, popupPositionProvider), mo89518u, i9 & 14);
        Y91.m75533f(popupLayout222, new C30249e(popupLayout222, continuation), mo89518u, 72);
        InterfaceC41563gV2 m83186a22 = C36116Tg3.m83186a(InterfaceC41563gV2.f82354b0, new C30251f(popupLayout222));
        C30252g c30252g22 = new C30252g(popupLayout222, enumC47065pm2);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01222 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2422 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m83186a22);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, c30252g22, c0757a22.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g01222, c0757a22.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm2422, c0757a22.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        function02 = obj3;
        ay33 = ay32;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* renamed from: b */
    public static final Function2<InterfaceC32720Et0, Integer, Unit> m4930b(InterfaceC48627sP5<? extends Function2<? super InterfaceC32720Et0, ? super Integer, Unit>> interfaceC48627sP5) {
        return (Function2) interfaceC48627sP5.getValue();
    }

    /* renamed from: e */
    public static final boolean m4927e(View view) {
        WindowManager.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final D52 m4926f(Rect rect) {
        return new D52(rect.left, rect.top, rect.right, rect.bottom);
    }
}
