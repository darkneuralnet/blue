package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008b\u0001\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0019\b\u0002\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¨\u0006\u0019"}, m28432d2 = {"LKp6;", "T", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "factory", "LgV2;", "modifier", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "update", C17296a.f69688o, "(Lkotlin/jvm/functions/Function3;LgV2;Lkotlin/jvm/functions/Function1;LEt0;II)V", "viewGroup", "", "Landroidx/fragment/app/FragmentContainerView;", "list", "c", "ui-viewbinding_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,137:1\n25#2:138\n36#2:146\n25#2:153\n36#2:160\n1114#3,6:139\n1114#3,6:147\n1114#3,6:154\n1114#3,6:161\n76#4:145\n76#4:167\n33#5,6:168\n55#6,4:174\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n64#1:138\n69#1:146\n77#1:153\n78#1:160\n64#1:139,6\n69#1:147,6\n77#1:154,6\n78#1:161,6\n65#1:145\n102#1:167\n103#1:168,6\n130#1:174,4\n*E\n"})
/* renamed from: de */
/* loaded from: classes.dex */
public final class C19814de {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: de$a */
    /* loaded from: classes.dex */
    public static final class C19815a extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public static final C19815a f76920g = new C19815a();

        public C19815a() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        /* renamed from: a */
        public final void m43996a(InterfaceC34094Kp6 interfaceC34094Kp6) {
            Intrinsics.checkNotNullParameter(interfaceC34094Kp6, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            m43996a((InterfaceC34094Kp6) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: de$b */
    /* loaded from: classes.dex */
    public static final class C19816b extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C44172kt4<T> f76921g;

        /* renamed from: h */
        public final /* synthetic */ Function1<T, Unit> f76922h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19816b(C44172kt4<T> c44172kt4, Function1<? super T, Unit> function1) {
            super(1);
            this.f76921g = c44172kt4;
            this.f76922h = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            InterfaceC34094Kp6 interfaceC34094Kp6 = (InterfaceC34094Kp6) this.f76921g.m28238a();
            if (interfaceC34094Kp6 != null) {
                this.f76922h.invoke(interfaceC34094Kp6);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,137:1\n62#2,5:138\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n*L\n110#1:138,5\n*E\n"})
    /* renamed from: de$c */
    /* loaded from: classes.dex */
    public static final class C19817c extends Lambda implements Function1<C44881m51, InterfaceC44288l51> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f76923g;

        /* renamed from: h */
        public final /* synthetic */ Context f76924h;

        /* renamed from: i */
        public final /* synthetic */ FragmentContainerView f76925i;

        @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"de$c$a", "Ll51;", "", "dispose", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,484:1\n111#2,4:485\n115#2,2:494\n118#2:502\n27#3,5:489\n32#3,6:496\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3$1\n*L\n114#1:489,5\n114#1:496,6\n*E\n"})
        /* renamed from: de$c$a */
        /* loaded from: classes.dex */
        public static final class C19818a implements InterfaceC44288l51 {

            /* renamed from: a */
            public final /* synthetic */ Fragment f76926a;

            /* renamed from: b */
            public final /* synthetic */ FragmentManager f76927b;

            public C19818a(Fragment fragment, FragmentManager fragmentManager) {
                this.f76926a = fragment;
                this.f76927b = fragmentManager;
            }

            @Override // p000.InterfaceC44288l51
            public void dispose() {
                if (this.f76926a != null && !this.f76927b.m67370U0()) {
                    AbstractC11685m m67311q = this.f76927b.m67311q();
                    Intrinsics.checkNotNullExpressionValue(m67311q, "beginTransaction()");
                    m67311q.mo67105s(this.f76926a);
                    m67311q.mo67115i();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19817c(Fragment fragment, Context context, FragmentContainerView fragmentContainerView) {
            super(1);
            this.f76923g = fragment;
            this.f76924h = context;
            this.f76925i = fragmentContainerView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC44288l51 invoke(C44881m51 DisposableEffect) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            Fragment fragment = this.f76923g;
            if (fragment == null || (supportFragmentManager = fragment.getChildFragmentManager()) == null) {
                Context context = this.f76924h;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
            }
            return new C19818a(supportFragmentManager != null ? supportFragmentManager.m67325l0(this.f76925i.getId()) : null, supportFragmentManager);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: de$d */
    /* loaded from: classes.dex */
    public static final class C19819d extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> f76928g;

        /* renamed from: h */
        public final /* synthetic */ InterfaceC41563gV2 f76929h;

        /* renamed from: i */
        public final /* synthetic */ Function1<T, Unit> f76930i;

        /* renamed from: j */
        public final /* synthetic */ int f76931j;

        /* renamed from: k */
        public final /* synthetic */ int f76932k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19819d(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super T, Unit> function1, int i, int i2) {
            super(2);
            this.f76928g = function3;
            this.f76929h = interfaceC41563gV2;
            this.f76930i = function1;
            this.f76931j = i;
            this.f76932k = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C19814de.m43999a(this.f76928g, this.f76929h, this.f76930i, interfaceC32720Et0, C47127ps4.m18626a(this.f76931j | 1), this.f76932k);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: de$e */
    /* loaded from: classes.dex */
    public static final class C19820e extends Lambda implements Function1<Context, View> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f76933g;

        /* renamed from: h */
        public final /* synthetic */ Function3<LayoutInflater, ViewGroup, Boolean, T> f76934h;

        /* renamed from: i */
        public final /* synthetic */ C44172kt4<T> f76935i;

        /* renamed from: j */
        public final /* synthetic */ MM5<FragmentContainerView> f76936j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19820e(Fragment fragment, Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, C44172kt4<T> c44172kt4, MM5<FragmentContainerView> mm5) {
            super(1);
            this.f76933g = fragment;
            this.f76934h = function3;
            this.f76935i = c44172kt4;
            this.f76936j = mm5;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(Context context) {
            LayoutInflater inflater;
            ViewGroup viewGroup;
            Intrinsics.checkNotNullParameter(context, "context");
            Fragment fragment = this.f76933g;
            if (fragment == null || (inflater = fragment.getLayoutInflater()) == null) {
                inflater = LayoutInflater.from(context);
            }
            Function3<LayoutInflater, ViewGroup, Boolean, T> function3 = this.f76934h;
            Intrinsics.checkNotNullExpressionValue(inflater, "inflater");
            InterfaceC34094Kp6 interfaceC34094Kp6 = (InterfaceC34094Kp6) function3.invoke(inflater, new FrameLayout(context), Boolean.FALSE);
            this.f76935i.m28237b(interfaceC34094Kp6);
            this.f76936j.clear();
            View root = interfaceC34094Kp6.getRoot();
            if (root instanceof ViewGroup) {
                viewGroup = (ViewGroup) root;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C19814de.m43997c(viewGroup, this.f76936j);
            }
            return interfaceC34094Kp6.getRoot();
        }
    }

    /* renamed from: a */
    public static final <T extends InterfaceC34094Kp6> void m43999a(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> factory, InterfaceC41563gV2 interfaceC41563gV2, Function1<? super T, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Fragment fragment;
        Intrinsics.checkNotNullParameter(factory, "factory");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1985291610);
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
                function1 = C19815a.f76920g;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1985291610, i3, -1, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:58)");
            }
            mo89518u.mo89638F(-492369756);
            Object mo89635G = mo89518u.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = new C44172kt4();
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C44172kt4 c44172kt4 = (C44172kt4) mo89635G;
            View view = (View) mo89518u.mo89572c(C11411h.m68320k());
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(view);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                try {
                    fragment = C31772Ar6.m115022a(view);
                } catch (IllegalStateException unused) {
                    fragment = null;
                }
                mo89635G2 = fragment;
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            Fragment fragment2 = (Fragment) mo89635G2;
            mo89518u.mo89638F(-492369756);
            Object mo89635G3 = mo89518u.mo89635G();
            InterfaceC32720Et0.C2012a c2012a2 = InterfaceC32720Et0.f8257a;
            if (mo89635G3 == c2012a2.m108267a()) {
                mo89635G3 = GM5.m105203d();
                mo89518u.mo89503z(mo89635G3);
            }
            mo89518u.mo89605Q();
            MM5 mm5 = (MM5) mo89635G3;
            mo89518u.mo89638F(1157296644);
            boolean mo89539n2 = mo89518u.mo89539n(view);
            Object mo89635G4 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G4 == c2012a2.m108267a()) {
                mo89635G4 = new C19820e(fragment2, factory, c44172kt4, mm5);
                mo89518u.mo89503z(mo89635G4);
            }
            mo89518u.mo89605Q();
            C24963je.m30175a((Function1) mo89635G4, interfaceC41563gV2, new C19816b(c44172kt4, function1), mo89518u, i3 & 112, 0);
            Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
            int size = mm5.size();
            for (int i9 = 0; i9 < size; i9++) {
                FragmentContainerView fragmentContainerView = (FragmentContainerView) mm5.get(i9);
                Y91.m75537b(context, fragmentContainerView, new C19817c(fragment2, context, fragmentContainerView), mo89518u, 72);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC41563gV2 interfaceC41563gV22 = interfaceC41563gV2;
        Function1<? super T, Unit> function12 = function1;
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C19819d(factory, interfaceC41563gV22, function12, i, i2));
        }
    }

    /* renamed from: c */
    public static final void m43997c(ViewGroup viewGroup, List<FragmentContainerView> list) {
        if (viewGroup instanceof FragmentContainerView) {
            list.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                m43997c((ViewGroup) childAt, list);
            }
        }
    }
}
