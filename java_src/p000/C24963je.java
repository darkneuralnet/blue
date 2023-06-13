package p000;

import android.content.Context;
import android.view.View;
import androidx.compose.p003ui.platform.C11411h;
import androidx.compose.p003ui.viewinterop.AndroidViewHolder;
import androidx.compose.p003ui.viewinterop.ViewFactoryHolder;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001#\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aQ\u0010\u001a\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u000eH\u0002\"(\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u001e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m28432d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "LgV2;", "modifier", "", "update", C17296a.f69688o, "(Lkotlin/jvm/functions/Function1;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V", "LC43;", "dispatcher", "Lkotlin/Function0;", "LJm2;", "c", "(Lkotlin/jvm/functions/Function1;LC43;LEt0;I)Lkotlin/jvm/functions/Function0;", "Lbf6;", "Lg01;", "density", "LLifecycleOwner;", "lifecycleOwner", "LPi5;", "savedStateRegistryOwner", "Lpm2;", "layoutDirection", "f", "(LEt0;LgV2;Lg01;LLifecycleOwner;LPi5;Lpm2;)V", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "e", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/jvm/functions/Function1;", "NoOpUpdate", "je$d", "b", "Lje$d;", "NoOpScrollConnection", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,374:1\n25#2:375\n251#2,10:386\n25#2:396\n286#2,10:407\n1114#3,6:376\n1114#3,6:397\n76#4:382\n76#4:383\n76#4:384\n76#4:385\n76#4:403\n76#4:404\n76#4:405\n76#4:406\n76#4:417\n76#4:418\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n101#1:375\n115#1:386,10\n204#1:396\n219#1:407,10\n101#1:376,6\n204#1:397,6\n105#1:382\n106#1:383\n112#1:384\n113#1:385\n209#1:403\n210#1:404\n216#1:405\n217#1:406\n241#1:417\n243#1:418\n*E\n"})
/* renamed from: je */
/* loaded from: classes.dex */
public final class C24963je {

    /* renamed from: a */
    public static final Function1<View, Unit> f93046a = C24968e.f93055g;

    /* renamed from: b */
    public static final C24967d f93047b = new C24967d();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    /* renamed from: je$a */
    /* loaded from: classes.dex */
    public static final class C24964a extends Lambda implements Function0<C33829Jm2> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f93048g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24964a(Function0 function0) {
            super(0);
            this.f93048g = function0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Jm2] */
        @Override // kotlin.jvm.functions.Function0
        public final C33829Jm2 invoke() {
            return this.f93048g.invoke();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je$b */
    /* loaded from: classes.dex */
    public static final class C24965b extends Lambda implements Function2<C33829Jm2, Function1<? super T, ? extends Unit>, Unit> {

        /* renamed from: g */
        public static final C24965b f93049g = new C24965b();

        public C24965b() {
            super(2);
        }

        /* renamed from: a */
        public final void m30169a(C33829Jm2 set, Function1<? super T, Unit> it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            C24963je.m30171e(set).setUpdateBlock(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, Object obj) {
            m30169a(c33829Jm2, (Function1) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je$c */
    /* loaded from: classes.dex */
    public static final class C24966c extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Context, T> f93050g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f93051h;

        /* renamed from: i */
        public final /* synthetic */ Function1<T, Unit> f93052i;

        /* renamed from: j */
        public final /* synthetic */ int f93053j;

        /* renamed from: k */
        public final /* synthetic */ int f93054k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24966c(Function1<? super Context, ? extends T> function1, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super T, Unit> function12, int i, int i2) {
            super(2);
            this.f93050g = function1;
            this.f93051h = interfaceC41563gV2;
            this.f93052i = function12;
            this.f93053j = i;
            this.f93054k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C24963je.m30175a(this.f93050g, this.f93051h, this.f93052i, interfaceC32720Et0, C47127ps4.m18626a(this.f93053j | 1), this.f93054k);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"je$d", "LB43;", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: je$d */
    /* loaded from: classes.dex */
    public static final class C24967d implements B43 {
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je$e */
    /* loaded from: classes.dex */
    public static final class C24968e extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public static final C24968e f93055g = new C24968e();

        public C24968e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            Intrinsics.checkNotNullParameter(view, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: je$f */
    /* loaded from: classes.dex */
    public static final class C24969f extends Lambda implements Function0<C33829Jm2> {

        /* renamed from: g */
        public final /* synthetic */ Context f93056g;

        /* renamed from: h */
        public final /* synthetic */ Function1<Context, T> f93057h;

        /* renamed from: i */
        public final /* synthetic */ AbstractC37400Yt0 f93058i;

        /* renamed from: j */
        public final /* synthetic */ C43 f93059j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC33328Hi5 f93060k;

        /* renamed from: l */
        public final /* synthetic */ String f93061l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24969f(Context context, Function1<? super Context, ? extends T> function1, AbstractC37400Yt0 abstractC37400Yt0, C43 c43, InterfaceC33328Hi5 interfaceC33328Hi5, String str) {
            super(0);
            this.f93056g = context;
            this.f93057h = function1;
            this.f93058i = abstractC37400Yt0;
            this.f93059j = c43;
            this.f93060k = interfaceC33328Hi5;
            this.f93061l = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C33829Jm2 invoke() {
            return new ViewFactoryHolder(this.f93056g, this.f93057h, this.f93058i, this.f93059j, this.f93060k, this.f93061l).m68275h();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/view/View;", "T", "LJm2;", "LgV2;", "it", "", C17296a.f69688o, "(LJm2;LgV2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: je$g */
    /* loaded from: classes.dex */
    public static final class C24970g extends Lambda implements Function2<C33829Jm2, InterfaceC41563gV2, Unit> {

        /* renamed from: g */
        public static final C24970g f93062g = new C24970g();

        public C24970g() {
            super(2);
        }

        /* renamed from: a */
        public final void m30167a(C33829Jm2 set, InterfaceC41563gV2 it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            C24963je.m30171e(set).setModifier(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, InterfaceC41563gV2 interfaceC41563gV2) {
            m30167a(c33829Jm2, interfaceC41563gV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/view/View;", "T", "LJm2;", "Lg01;", "it", "", C17296a.f69688o, "(LJm2;Lg01;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: je$h */
    /* loaded from: classes.dex */
    public static final class C24971h extends Lambda implements Function2<C33829Jm2, InterfaceC41273g01, Unit> {

        /* renamed from: g */
        public static final C24971h f93063g = new C24971h();

        public C24971h() {
            super(2);
        }

        /* renamed from: a */
        public final void m30166a(C33829Jm2 set, InterfaceC41273g01 it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            C24963je.m30171e(set).setDensity(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, InterfaceC41273g01 interfaceC41273g01) {
            m30166a(c33829Jm2, interfaceC41273g01);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/view/View;", "T", "LJm2;", "LLifecycleOwner;", "it", "", C17296a.f69688o, "(LJm2;LLifecycleOwner;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: je$i */
    /* loaded from: classes.dex */
    public static final class C24972i extends Lambda implements Function2<C33829Jm2, LifecycleOwner, Unit> {

        /* renamed from: g */
        public static final C24972i f93064g = new C24972i();

        public C24972i() {
            super(2);
        }

        /* renamed from: a */
        public final void m30165a(C33829Jm2 set, LifecycleOwner it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            C24963je.m30171e(set).setLifecycleOwner(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, LifecycleOwner lifecycleOwner) {
            m30165a(c33829Jm2, lifecycleOwner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/view/View;", "T", "LJm2;", "LPi5;", "it", "", C17296a.f69688o, "(LJm2;LPi5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: je$j */
    /* loaded from: classes.dex */
    public static final class C24973j extends Lambda implements Function2<C33829Jm2, InterfaceC35200Pi5, Unit> {

        /* renamed from: g */
        public static final C24973j f93065g = new C24973j();

        public C24973j() {
            super(2);
        }

        /* renamed from: a */
        public final void m30164a(C33829Jm2 set, InterfaceC35200Pi5 it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            C24963je.m30171e(set).setSavedStateRegistryOwner(it);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, InterfaceC35200Pi5 interfaceC35200Pi5) {
            m30164a(c33829Jm2, interfaceC35200Pi5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Landroid/view/View;", "T", "LJm2;", "Lpm2;", "it", "", C17296a.f69688o, "(LJm2;Lpm2;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: je$k */
    /* loaded from: classes.dex */
    public static final class C24974k extends Lambda implements Function2<C33829Jm2, EnumC47065pm2, Unit> {

        /* renamed from: g */
        public static final C24974k f93066g = new C24974k();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: je$k$a */
        /* loaded from: classes.dex */
        public /* synthetic */ class C24975a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC47065pm2.values().length];
                try {
                    iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C24974k() {
            super(2);
        }

        /* renamed from: a */
        public final void m30163a(C33829Jm2 set, EnumC47065pm2 it) {
            Intrinsics.checkNotNullParameter(set, "$this$set");
            Intrinsics.checkNotNullParameter(it, "it");
            ViewFactoryHolder m30171e = C24963je.m30171e(set);
            int i = C24975a.$EnumSwitchMapping$0[it.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i2 = 0;
            }
            m30171e.setLayoutDirection(i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(C33829Jm2 c33829Jm2, EnumC47065pm2 enumC47065pm2) {
            m30163a(c33829Jm2, enumC47065pm2);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public static final <T extends View> void m30175a(Function1<? super Context, ? extends T> factory, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super T, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(factory, "factory");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89629I(factory)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89629I(function1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i7 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (i8 != 0) {
                function1 = f93046a;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:95)");
            }
            mo89518u.mo89638F(-492369756);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C43();
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C43 c43 = (C43) mo89635G;
            InterfaceC41563gV2 m109806c = C32486Dt0.m109806c(mo89518u, E43.m109419a(interfaceC41563gV2, f93047b, c43));
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
            InterfaceC35200Pi5 interfaceC35200Pi5 = (InterfaceC35200Pi5) mo89518u.mo89572c(C11411h.m68321j());
            Function0<C33829Jm2> m30173c = m30173c(factory, c43, mo89518u, (i3 & 14) | 64);
            mo89518u.mo89638F(1886828752);
            if (!(mo89518u.mo89515v() instanceof C50535vd6)) {
                C52468yt0.m2335c();
            }
            mo89518u.mo89509x();
            if (mo89518u.mo89521t()) {
                mo89518u.mo89617M(new C24964a(m30173c));
            } else {
                mo89518u.mo89566e();
            }
            InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
            m30170f(m64192a, m109806c, interfaceC41273g01, lifecycleOwner, interfaceC35200Pi5, enumC47065pm2);
            C38680bf6.m64191b(m64192a, function1, C24965b.f93049g);
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        Function1<? super T, Unit> function12 = function1;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C24966c(factory, interfaceC41563gV22, function12, i, i2));
        }
    }

    /* renamed from: c */
    public static final <T extends View> Function0<C33829Jm2> m30173c(Function1<? super Context, ? extends T> function1, C43 c43, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-430628662);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-430628662, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:236)");
        }
        C24969f c24969f = new C24969f((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g()), function1, C52468yt0.m2334d(interfaceC32720Et0, 0), c43, (InterfaceC33328Hi5) interfaceC32720Et0.mo89572c(C33796Ji5.m99923b()), String.valueOf(C52468yt0.m2337a(interfaceC32720Et0, 0)));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c24969f;
    }

    /* renamed from: d */
    public static final Function1<View, Unit> m30172d() {
        return f93046a;
    }

    /* renamed from: e */
    public static final <T extends View> ViewFactoryHolder<T> m30171e(C33829Jm2 c33829Jm2) {
        AndroidViewHolder m99802U = c33829Jm2.m99802U();
        if (m99802U != null) {
            Intrinsics.checkNotNull(m99802U, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) m99802U;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: f */
    public static final <T extends View> void m30170f(InterfaceC32720Et0 interfaceC32720Et0, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC41273g01 interfaceC41273g01, LifecycleOwner lifecycleOwner, InterfaceC35200Pi5 interfaceC35200Pi5, EnumC47065pm2 enumC47065pm2) {
        C38680bf6.m64191b(interfaceC32720Et0, interfaceC41563gV2, C24970g.f93062g);
        C38680bf6.m64191b(interfaceC32720Et0, interfaceC41273g01, C24971h.f93063g);
        C38680bf6.m64191b(interfaceC32720Et0, lifecycleOwner, C24972i.f93064g);
        C38680bf6.m64191b(interfaceC32720Et0, interfaceC35200Pi5, C24973j.f93065g);
        C38680bf6.m64191b(interfaceC32720Et0, enumC47065pm2, C24974k.f93066g);
    }
}
