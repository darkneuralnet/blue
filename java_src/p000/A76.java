package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C11759u;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"LA76;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "view", "onViewCreated", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "encodeUrl", "D9", "La86;", "b", "Lkotlin/Lazy;", "t8", "()La86;", "viewModel", "Lnj0;", "c", "Lnj0;", "overviewBinding", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionOverviewFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,93:1\n172#2,9:94\n*S KotlinDebug\n*F\n+ 1 TransactionOverviewFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment\n*L\n19#1:94,9\n*E\n"})
/* renamed from: A76 */
/* loaded from: classes5.dex */
public final class A76 extends Fragment {

    /* renamed from: b */
    public final Lazy f178b;

    /* renamed from: c */
    public C45847nj0 f179c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LWr6;", "invoke", "()LWr6;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$4\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: A76$a */
    /* loaded from: classes5.dex */
    public static final class C0034a extends Lambda implements Function0<C36920Wr6> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f180g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0034a(Fragment fragment) {
            super(0);
            this.f180g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C36920Wr6 invoke() {
            C36920Wr6 viewModelStore = this.f180g.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "LFE0;", "invoke", "()LFE0;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$5\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: A76$b */
    /* loaded from: classes5.dex */
    public static final class C0035b extends Lambda implements Function0<FE0> {

        /* renamed from: g */
        public final /* synthetic */ Function0 f181g;

        /* renamed from: h */
        public final /* synthetic */ Fragment f182h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0035b(Function0 function0, Fragment fragment) {
            super(0);
            this.f181g = function0;
            this.f182h = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FE0 invoke() {
            FE0 fe0;
            Function0 function0 = this.f181g;
            if (function0 == null || (fe0 = (FE0) function0.invoke()) == null) {
                FE0 defaultViewModelCreationExtras = this.f182h.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return fe0;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LOr6;", "VM", "Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6\n*L\n1#1,222:1\n*E\n"})
    /* renamed from: A76$c */
    /* loaded from: classes5.dex */
    public static final class C0036c extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public final /* synthetic */ Fragment f183g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0036c(Fragment fragment) {
            super(0);
            this.f183g = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            C11759u.InterfaceC11763b defaultViewModelProviderFactory = this.f183g.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "invoke", "()Landroidx/lifecycle/u$b;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: A76$d */
    /* loaded from: classes5.dex */
    public static final class C0037d extends Lambda implements Function0<C11759u.InterfaceC11763b> {

        /* renamed from: g */
        public static final C0037d f184g = new C0037d();

        public C0037d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C11759u.InterfaceC11763b invoke() {
            return new C38376b86(0L, 1, null);
        }
    }

    public A76() {
        Function0 function0 = C0037d.f184g;
        this.f178b = C33234Gy1.m104545b(this, Reflection.getOrCreateKotlinClass(C37783a86.class), new C0034a(this), new C0035b(null, this), function0 == null ? new C0036c(this) : function0);
    }

    /* renamed from: A9 */
    public static final void m116078A9(Menu menu, Boolean it) {
        Intrinsics.checkNotNullParameter(menu, "$menu");
        MenuItem findItem = menu.findItem(C33093Gi4.encode_url);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        findItem.setVisible(it.booleanValue());
    }

    /* renamed from: B9 */
    public static final void m116077B9(A76 this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m116076D9((HttpTransaction) pair.component1(), ((Boolean) pair.component2()).booleanValue());
    }

    /* renamed from: D9 */
    public final void m116076D9(HttpTransaction httpTransaction, boolean z) {
        String str;
        String str2;
        String str3;
        HttpTransaction.EnumC17143a enumC17143a;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        C45847nj0 c45847nj0 = this.f179c;
        String str12 = null;
        if (c45847nj0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
            c45847nj0 = null;
        }
        TextView textView = c45847nj0.f100395D;
        if (httpTransaction != null) {
            str = httpTransaction.getFormattedUrl(z);
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = c45847nj0.f100405j;
        if (httpTransaction != null) {
            str2 = httpTransaction.getMethod();
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = c45847nj0.f100407l;
        if (httpTransaction != null) {
            str3 = httpTransaction.getProtocol();
        } else {
            str3 = null;
        }
        textView3.setText(str3);
        TextView textView4 = c45847nj0.f100420y;
        if (httpTransaction != null) {
            enumC17143a = httpTransaction.getStatus();
        } else {
            enumC17143a = null;
        }
        textView4.setText(String.valueOf(enumC17143a));
        TextView textView5 = c45847nj0.f100412q;
        if (httpTransaction != null) {
            str4 = httpTransaction.getResponseSummaryText();
        } else {
            str4 = null;
        }
        textView5.setText(str4);
        if (httpTransaction != null) {
            bool = Boolean.valueOf(httpTransaction.isSsl());
        } else {
            bool = null;
        }
        if (bool == null) {
            c45847nj0.f100418w.setVisibility(8);
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            c45847nj0.f100418w.setVisibility(0);
            c45847nj0.f100419x.setText(C38145al4.chucker_yes);
        } else {
            c45847nj0.f100418w.setVisibility(0);
            c45847nj0.f100419x.setText(C38145al4.chucker_no);
        }
        if (httpTransaction != null) {
            str5 = httpTransaction.getResponseTlsVersion();
        } else {
            str5 = null;
        }
        if (str5 != null) {
            c45847nj0.f100393B.setText(httpTransaction.getResponseTlsVersion());
            c45847nj0.f100421z.setVisibility(0);
        }
        if (httpTransaction != null) {
            str6 = httpTransaction.getResponseCipherSuite();
        } else {
            str6 = null;
        }
        if (str6 != null) {
            c45847nj0.f100403h.setText(httpTransaction.getResponseCipherSuite());
            c45847nj0.f100402g.setVisibility(0);
        }
        TextView textView6 = c45847nj0.f100410o;
        if (httpTransaction != null) {
            str7 = httpTransaction.getRequestDateString();
        } else {
            str7 = null;
        }
        textView6.setText(str7);
        TextView textView7 = c45847nj0.f100415t;
        if (httpTransaction != null) {
            str8 = httpTransaction.getResponseDateString();
        } else {
            str8 = null;
        }
        textView7.setText(str8);
        TextView textView8 = c45847nj0.f100404i;
        if (httpTransaction != null) {
            str9 = httpTransaction.getDurationString();
        } else {
            str9 = null;
        }
        textView8.setText(str9);
        TextView textView9 = c45847nj0.f100408m;
        if (httpTransaction != null) {
            str10 = httpTransaction.getRequestSizeString();
        } else {
            str10 = null;
        }
        textView9.setText(str10);
        TextView textView10 = c45847nj0.f100413r;
        if (httpTransaction != null) {
            str11 = httpTransaction.getResponseSizeString();
        } else {
            str11 = null;
        }
        textView10.setText(str11);
        TextView textView11 = c45847nj0.f100394C;
        if (httpTransaction != null) {
            str12 = httpTransaction.getTotalSizeString();
        }
        textView11.setText(str12);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(final Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        menu.findItem(C33093Gi4.save_body).setVisible(false);
        m116073t8().m71858g().observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: z76
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                A76.m116078A9(menu, (Boolean) obj);
            }
        });
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C45847nj0 m23271c = C45847nj0.m23271c(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(m23271c, "inflate(inflater, container, false)");
        this.f179c = m23271c;
        if (m23271c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
            m23271c = null;
        }
        return m23271c.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        C37159Xs2.m76191b(m116073t8().m71855j(), m116073t8().m71857h()).observe(getViewLifecycleOwner(), new InterfaceC41056fe3() { // from class: y76
            @Override // p000.InterfaceC41056fe3
            public final void onChanged(Object obj) {
                A76.m116077B9(A76.this, (Pair) obj);
            }
        });
    }

    /* renamed from: t8 */
    public final C37783a86 m116073t8() {
        return (C37783a86) this.f178b.getValue();
    }
}
