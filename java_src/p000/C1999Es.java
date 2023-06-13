package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00030\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00050\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LEs;", "LyS0;", "Lio/reactivex/Observable;", "", "v", "", "J0", "Lco/bird/android/buava/Optional;", "LDs;", "w", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "autoReloadToggleSubject", DateTokenConverter.CONVERTER_KEY, "autoReloadInformationClickSubject", "La94;", "e", "La94;", "optionModelSelectedRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Es */
/* loaded from: classes3.dex */
public final class C1999Es extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Boolean> f8203c;

    /* renamed from: d */
    public final C24558d<Unit> f8204d;

    /* renamed from: e */
    public final C37791a94<Optional<C1630Ds>> f8205e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEs$a;", "Lw1;", "", "position", "", "bind", "LEe2;", "b", "LEe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEs;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoReloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsAdapter$AutoReloadSectionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,117:1\n18#2:118\n9#3,4:119\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsAdapter$AutoReloadSectionViewHolder\n*L\n97#1:118\n97#1:119,4\n*E\n"})
    /* renamed from: Es$a */
    /* loaded from: classes3.dex */
    public final class C2000a extends C29735w1 {

        /* renamed from: b */
        public final C32587Ee2 f8206b;

        /* renamed from: c */
        public final /* synthetic */ C1999Es f8207c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Es$a$a */
        /* loaded from: classes3.dex */
        public static final class C2001a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C1999Es f8208g;

            /* renamed from: h */
            public final /* synthetic */ C2000a f8209h;

            /* renamed from: i */
            public final /* synthetic */ C0292As f8210i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2001a(C1999Es c1999Es, C2000a c2000a, C0292As c0292As) {
                super(2);
                this.f8208g = c1999Es;
                this.f8209h = c2000a;
                this.f8210i = c0292As;
            }

            /* renamed from: a */
            public final void m108314a(CompoundButton compoundButton, boolean z) {
                String m115006c;
                this.f8208g.f8203c.onNext(Boolean.valueOf(z));
                TextView textView = this.f8209h.f8206b.f7913d;
                if (z) {
                    m115006c = this.f8210i.m115005d();
                } else {
                    m115006c = this.f8210i.m115006c();
                }
                textView.setText(m115006c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m108314a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Es$a$b */
        /* loaded from: classes3.dex */
        public static final class C2002b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C1999Es f8211g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2002b(C1999Es c1999Es) {
                super(1);
                this.f8211g = c1999Es;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f8211g.f8204d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2000a(C1999Es c1999Es, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8207c = c1999Es;
            C32587Ee2 m108616a = C32587Ee2.m108616a(view);
            Intrinsics.checkNotNullExpressionValue(m108616a, "bind(view)");
            this.f8206b = m108616a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f8207c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C0292As)) {
                m105816c = null;
            }
            C0292As c0292As = (C0292As) m105816c;
            if (c0292As != null) {
                C1999Es c1999Es = this.f8207c;
                C24558d c24558d = c1999Es.f8203c;
                Boolean m115007b = c0292As.m115007b();
                boolean z2 = false;
                if (m115007b != null) {
                    z = m115007b.booleanValue();
                } else {
                    z = false;
                }
                c24558d.onNext(Boolean.valueOf(z));
                Switch r1 = this.f8206b.f7912c;
                Boolean m115007b2 = c0292As.m115007b();
                if (m115007b2 != null) {
                    z2 = m115007b2.booleanValue();
                }
                r1.setChecked(z2);
                Switch r12 = this.f8206b.f7912c;
                Intrinsics.checkNotNullExpressionValue(r12, "binding.autoReloadToggle");
                C34585Ms2.m94663h(r12, new C2001a(c1999Es, this, c0292As));
                TextView textView = this.f8206b.f7911b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.autoReloadTitle");
                C34585Ms2.m94661j(textView, new C2002b(c1999Es));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LEs$b;", "Lw1;", "", "position", "", "bind", "LFe2;", "b", "LFe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LEs;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoReloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsAdapter$PreloadV2OptionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n18#2:118\n9#3,4:119\n1#4:123\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsAdapter$PreloadV2OptionViewHolder\n*L\n64#1:118\n64#1:119,4\n*E\n"})
    /* renamed from: Es$b */
    /* loaded from: classes3.dex */
    public final class C2003b extends C29735w1 {

        /* renamed from: b */
        public final C32821Fe2 f8212b;

        /* renamed from: c */
        public final /* synthetic */ C1999Es f8213c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Es$b$a */
        /* loaded from: classes3.dex */
        public static final class C2004a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C1999Es f8214g;

            /* renamed from: h */
            public final /* synthetic */ C1630Ds f8215h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2004a(C1999Es c1999Es, C1630Ds c1630Ds) {
                super(1);
                this.f8214g = c1999Es;
                this.f8215h = c1630Ds;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f8214g.f8205e.accept(Optional.f63040c.m59032c(this.f8215h));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2003b(C1999Es c1999Es, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f8213c = c1999Es;
            C32821Fe2 m106819a = C32821Fe2.m106819a(view);
            Intrinsics.checkNotNullExpressionValue(m106819a, "bind(view)");
            this.f8212b = m106819a;
            m106819a.getRoot().setClipToOutline(true);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ColorStateList valueOf;
            Object m105816c = this.f8213c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C1630Ds)) {
                m105816c = null;
            }
            C1630Ds c1630Ds = (C1630Ds) m105816c;
            if (c1630Ds != null) {
                C1999Es c1999Es = this.f8213c;
                Group group = this.f8212b.f9879i;
                Intrinsics.checkNotNullExpressionValue(group, "binding.selectedIndicator");
                C49520tu6.show$default(group, c1630Ds.m109838g(), 0, 2, null);
                this.f8212b.f9876f.setSelected(c1630Ds.m109838g());
                View view = this.f8212b.f9875e;
                Intrinsics.checkNotNullExpressionValue(view, "binding.outline");
                C49520tu6.show$default(view, c1630Ds.m109838g(), 0, 2, null);
                this.f8212b.f9872b.setText(c1630Ds.m109843b());
                TextView textView = this.f8212b.f9876f;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.promoText");
                C49520tu6.m11235p(textView, c1630Ds.m109839f(), 4);
                TextView textView2 = this.f8212b.f9874d;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.incentive");
                C49520tu6.setTextAndVisibility$default(textView2, c1630Ds.m109842c(), 0, 2, null);
                Long m109841d = c1630Ds.m109841d();
                if (m109841d != null && (valueOf = ColorStateList.valueOf((int) m109841d.longValue())) != null) {
                    TextView textView3 = this.f8212b.f9874d;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.incentive");
                    textView3.setBackgroundTintList(valueOf);
                }
                if (c1630Ds.m109838g()) {
                    c1999Es.f8205e.accept(Optional.f63040c.m59032c(c1630Ds));
                }
                ConstraintLayout root = this.f8212b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                C34585Ms2.m94661j(root, new C2004a(c1999Es, c1630Ds));
            }
        }
    }

    public C1999Es() {
        C24558d<Boolean> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Boolean>()");
        this.f8203c = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f8204d = m31902e2;
        this.f8205e = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: J0 */
    public final Observable<Unit> m108318J0() {
        Observable<Unit> hide = this.f8204d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "autoReloadInformationClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C3238Hs());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C2492Fs();
    }

    /* renamed from: v */
    public final Observable<Boolean> m108317v() {
        Observable<Boolean> hide = this.f8203c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "autoReloadToggleSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<Optional<C1630Ds>> m108316w() {
        Observable<Optional<C1630Ds>> distinctUntilChanged = this.f8205e.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "optionModelSelectedRelay…().distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31932Bj4.item_preload_v2_option ? new C2003b(this, m41761u) : i == C31932Bj4.item_preload_v2_autoreload_section ? new C2000a(this, m41761u) : new C29735w1(m41761u);
    }
}
