package androidx.compose.p003ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p003ui.platform.AndroidComposeView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\"\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00128\u0006¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b&\u0010\u0015¨\u0006("}, m28432d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "", "content", C17296a.f69688o, "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;LEt0;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/res/Configuration;", "configuration", "LuY1;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;LEt0;I)LuY1;", "", "name", "", "l", "LU94;", "LU94;", "f", "()LU94;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "LLifecycleOwner;", DateTokenConverter.CONVERTER_KEY, "i", "LocalLifecycleOwner", "LPi5;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,170:1\n25#2:171\n36#2:178\n25#2:185\n25#2:192\n25#2:199\n25#2:206\n25#2:214\n1114#3,6:172\n1114#3,6:179\n1114#3,6:186\n1114#3,6:193\n1114#3,6:200\n1114#3,3:207\n1117#3,3:211\n1114#3,6:215\n1#4:210\n76#5:221\n102#5,2:222\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n90#1:171\n97#1:178\n99#1:185\n104#1:192\n137#1:199\n138#1:206\n141#1:214\n90#1:172,6\n97#1:179,6\n99#1:186,6\n104#1:193,6\n137#1:200,6\n138#1:207,3\n138#1:211,3\n141#1:215,6\n90#1:221\n90#1:222,2\n*E\n"})
/* renamed from: androidx.compose.ui.platform.h */
/* loaded from: classes.dex */
public final class C11411h {

    /* renamed from: a */
    public static final U94<Configuration> f53334a = C41806gu0.m37352b(GM5.m105198i(), C11412a.f53340g);

    /* renamed from: b */
    public static final U94<Context> f53335b = C41806gu0.m37350d(C11413b.f53341g);

    /* renamed from: c */
    public static final U94<C49890uY1> f53336c = C41806gu0.m37350d(C11414c.f53342g);

    /* renamed from: d */
    public static final U94<LifecycleOwner> f53337d = C41806gu0.m37350d(C11415d.f53343g);

    /* renamed from: e */
    public static final U94<InterfaceC35200Pi5> f53338e = C41806gu0.m37350d(C11416e.f53344g);

    /* renamed from: f */
    public static final U94<View> f53339f = C41806gu0.m37350d(C11417f.f53345g);

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/content/res/Configuration;", "b", "()Landroid/content/res/Configuration;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$a */
    /* loaded from: classes.dex */
    public static final class C11412a extends Lambda implements Function0<Configuration> {

        /* renamed from: g */
        public static final C11412a f53340g = new C11412a();

        public C11412a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Configuration invoke() {
            C11411h.m68319l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/content/Context;", "b", "()Landroid/content/Context;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$b */
    /* loaded from: classes.dex */
    public static final class C11413b extends Lambda implements Function0<Context> {

        /* renamed from: g */
        public static final C11413b f53341g = new C11413b();

        public C11413b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Context invoke() {
            C11411h.m68319l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LuY1;", "b", "()LuY1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$c */
    /* loaded from: classes.dex */
    public static final class C11414c extends Lambda implements Function0<C49890uY1> {

        /* renamed from: g */
        public static final C11414c f53342g = new C11414c();

        public C11414c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C49890uY1 invoke() {
            C11411h.m68319l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LLifecycleOwner;", "b", "()LLifecycleOwner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$d */
    /* loaded from: classes.dex */
    public static final class C11415d extends Lambda implements Function0<LifecycleOwner> {

        /* renamed from: g */
        public static final C11415d f53343g = new C11415d();

        public C11415d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final LifecycleOwner invoke() {
            C11411h.m68319l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LPi5;", "b", "()LPi5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$e */
    /* loaded from: classes.dex */
    public static final class C11416e extends Lambda implements Function0<InterfaceC35200Pi5> {

        /* renamed from: g */
        public static final C11416e f53344g = new C11416e();

        public C11416e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final InterfaceC35200Pi5 invoke() {
            C11411h.m68319l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.h$f */
    /* loaded from: classes.dex */
    public static final class C11417f extends Lambda implements Function0<View> {

        /* renamed from: g */
        public static final C11417f f53345g = new C11417f();

        public C11417f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final View invoke() {
            C11411h.m68319l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.h$g */
    /* loaded from: classes.dex */
    public static final class C11418g extends Lambda implements Function1<Configuration, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EX2<Configuration> f53346g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11418g(EX2<Configuration> ex2) {
            super(1);
            this.f53346g = ex2;
        }

        /* renamed from: a */
        public final void m68311a(Configuration it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C11411h.m68328c(this.f53346g, it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
            m68311a(configuration);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,170:1\n62#2,5:171\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n108#1:171,5\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.h$h */
    /* loaded from: classes.dex */
    public static final class C11419h extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ C46660p51 f53347g;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"androidx/compose/ui/platform/h$h$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n1#1,484:1\n109#2,2:485\n*E\n"})
        /* renamed from: androidx.compose.ui.platform.h$h$a */
        /* loaded from: classes.dex */
        public static final class C11420a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ C46660p51 f53348a;

            public C11420a(C46660p51 c46660p51) {
                this.f53348a = c46660p51;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f53348a.m19980c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11419h(C46660p51 c46660p51) {
            super(1);
            this.f53347g = c46660p51;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new C11420a(this.f53347g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.h$i */
    /* loaded from: classes.dex */
    public static final class C11421i extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AndroidComposeView f53349g;

        /* renamed from: h */
        public final /* synthetic */ C10780ae f53350h;

        /* renamed from: i */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f53351i;

        /* renamed from: j */
        public final /* synthetic */ int f53352j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11421i(AndroidComposeView androidComposeView, C10780ae c10780ae, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f53349g = androidComposeView;
            this.f53350h = c10780ae;
            this.f53351i = function2;
            this.f53352j = i;
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
                C35528Qt0.m87816Z(1471621628, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:121)");
            }
            C42399hu0.m35618a(this.f53349g, this.f53350h, this.f53351i, interfaceC32720Et0, ((this.f53352j << 3) & 896) | 72);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.h$j */
    /* loaded from: classes.dex */
    public static final class C11422j extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ AndroidComposeView f53353g;

        /* renamed from: h */
        public final /* synthetic */ Function2<InterfaceC32720Et0, Integer, Unit> f53354h;

        /* renamed from: i */
        public final /* synthetic */ int f53355i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11422j(AndroidComposeView androidComposeView, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f53353g = androidComposeView;
            this.f53354h = function2;
            this.f53355i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C11411h.m68330a(this.f53353g, this.f53354h, interfaceC32720Et0, C47127ps4.m18626a(this.f53355i | 1));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,170:1\n62#2,5:171\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n160#1:171,5\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.h$k */
    /* loaded from: classes.dex */
    public static final class C11423k extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ Context f53356g;

        /* renamed from: h */
        public final /* synthetic */ ComponentCallbacks2C11425l f53357h;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"androidx/compose/ui/platform/h$k$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n1#1,484:1\n161#2,2:485\n*E\n"})
        /* renamed from: androidx.compose.ui.platform.h$k$a */
        /* loaded from: classes.dex */
        public static final class C11424a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ Context f53358a;

            /* renamed from: b */
            public final /* synthetic */ ComponentCallbacks2C11425l f53359b;

            public C11424a(Context context, ComponentCallbacks2C11425l componentCallbacks2C11425l) {
                this.f53358a = context;
                this.f53359b = componentCallbacks2C11425l;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                this.f53358a.getApplicationContext().unregisterComponentCallbacks(this.f53359b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11423k(Context context, ComponentCallbacks2C11425l componentCallbacks2C11425l) {
            super(1);
            this.f53356g = context;
            this.f53357h = componentCallbacks2C11425l;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            this.f53356g.getApplicationContext().registerComponentCallbacks(this.f53357h);
            return new C11424a(this.f53356g, this.f53357h);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: androidx.compose.ui.platform.h$l */
    /* loaded from: classes.dex */
    public static final class ComponentCallbacks2C11425l implements ComponentCallbacks2 {

        /* renamed from: b */
        public final /* synthetic */ Configuration f53360b;

        /* renamed from: c */
        public final /* synthetic */ C49890uY1 f53361c;

        public ComponentCallbacks2C11425l(Configuration configuration, C49890uY1 c49890uY1) {
            this.f53360b = configuration;
            this.f53361c = c49890uY1;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f53361c.m10090c(this.f53360b.updateFrom(configuration));
            this.f53360b.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f53361c.m10092a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            this.f53361c.m10092a();
        }
    }

    /* renamed from: a */
    public static final void m68330a(AndroidComposeView owner, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1396852028);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = owner.getContext();
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = GM5.m105200g(context.getResources().getConfiguration(), GM5.m105198i());
            mo89518u.mo89503z(mo89635G);
        }
        mo89518u.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(ex2);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new C11418g(ex2);
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        owner.setConfigurationChangeObserver((Function1) mo89635G2);
        mo89518u.mo89638F(-492369756);
        Object mo89635G3 = mo89518u.mo89635G();
        if (mo89635G3 == c2012a.m108267a()) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            mo89635G3 = new C10780ae(context);
            mo89518u.mo89503z(mo89635G3);
        }
        mo89518u.mo89605Q();
        C10780ae c10780ae = (C10780ae) mo89635G3;
        AndroidComposeView.C11339b m68610C0 = owner.m68610C0();
        if (m68610C0 != null) {
            mo89518u.mo89638F(-492369756);
            Object mo89635G4 = mo89518u.mo89635G();
            if (mo89635G4 == c2012a.m108267a()) {
                mo89635G4 = C47253q51.m18224a(owner, m68610C0.m68544b());
                mo89518u.mo89503z(mo89635G4);
            }
            mo89518u.mo89605Q();
            C46660p51 c46660p51 = (C46660p51) mo89635G4;
            Y91.m75536c(Unit.INSTANCE, new C11419h(c46660p51), mo89518u, 6);
            Intrinsics.checkNotNullExpressionValue(context, "context");
            C49890uY1 m68318m = m68318m(context, m68329b(ex2), mo89518u, 72);
            U94<Configuration> u94 = f53334a;
            Configuration configuration = m68329b(ex2);
            Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
            C41806gu0.m37353a(new W94[]{u94.m81907c(configuration), f53335b.m81907c(context), f53337d.m81907c(m68610C0.m68545a()), f53338e.m81907c(m68610C0.m68544b()), C33796Ji5.m99923b().m81907c(c46660p51), f53339f.m81907c(owner.m68611B0()), f53336c.m81907c(m68318m)}, C43575jt0.m29791b(mo89518u, 1471621628, true, new C11421i(owner, c10780ae, content, i)), mo89518u, 56);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
                mo89512w.mo20405a(new C11422j(owner, content, i));
                return;
            }
            return;
        }
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    /* renamed from: b */
    public static final Configuration m68329b(EX2<Configuration> ex2) {
        return ex2.getValue();
    }

    /* renamed from: c */
    public static final void m68328c(EX2<Configuration> ex2, Configuration configuration) {
        ex2.setValue(configuration);
    }

    /* renamed from: f */
    public static final U94<Configuration> m68325f() {
        return f53334a;
    }

    /* renamed from: g */
    public static final U94<Context> m68324g() {
        return f53335b;
    }

    /* renamed from: h */
    public static final U94<C49890uY1> m68323h() {
        return f53336c;
    }

    /* renamed from: i */
    public static final U94<LifecycleOwner> m68322i() {
        return f53337d;
    }

    /* renamed from: j */
    public static final U94<InterfaceC35200Pi5> m68321j() {
        return f53338e;
    }

    /* renamed from: k */
    public static final U94<View> m68320k() {
        return f53339f;
    }

    /* renamed from: l */
    public static final Void m68319l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* renamed from: m */
    public static final C49890uY1 m68318m(Context context, Configuration configuration, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-485908294);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:132)");
        }
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = new C49890uY1();
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C49890uY1 c49890uY1 = (C49890uY1) mo89635G;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G2 = interfaceC32720Et0.mo89635G();
        Object obj = mo89635G2;
        if (mo89635G2 == c2012a.m108267a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            interfaceC32720Et0.mo89503z(configuration2);
            obj = configuration2;
        }
        interfaceC32720Et0.mo89605Q();
        Configuration configuration3 = (Configuration) obj;
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G3 = interfaceC32720Et0.mo89635G();
        if (mo89635G3 == c2012a.m108267a()) {
            mo89635G3 = new ComponentCallbacks2C11425l(configuration3, c49890uY1);
            interfaceC32720Et0.mo89503z(mo89635G3);
        }
        interfaceC32720Et0.mo89605Q();
        Y91.m75536c(c49890uY1, new C11423k(context, (ComponentCallbacks2C11425l) mo89635G3), interfaceC32720Et0, 8);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c49890uY1;
    }
}
