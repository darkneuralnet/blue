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
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00030\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LW04;", "LyS0;", "Lio/reactivex/Observable;", "", "J0", "Lco/bird/android/buava/Optional;", "LS04;", "w", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "", "<set-?>", "c", "Ljava/lang/Boolean;", "v", "()Ljava/lang/Boolean;", "autoReloadToggle", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "autoReloadInformationClickSubject", "La94;", "e", "La94;", "optionModelSelectedRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: W04 */
/* loaded from: classes3.dex */
public final class W04 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Boolean f40230c;

    /* renamed from: d */
    public final C24558d<Unit> f40231d;

    /* renamed from: e */
    public final C37791a94<Optional<S04>> f40232e;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LW04$a;", "Lw1;", "", "position", "", "bind", "LEe2;", "b", "LEe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LW04;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPreloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$AutoReloadSectionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$AutoReloadSectionViewHolder\n*L\n85#1:111\n85#1:112,4\n*E\n"})
    /* renamed from: W04$a */
    /* loaded from: classes3.dex */
    public final class C8904a extends C29735w1 {

        /* renamed from: b */
        public final C32587Ee2 f40233b;

        /* renamed from: c */
        public final /* synthetic */ W04 f40234c;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: W04$a$a */
        /* loaded from: classes3.dex */
        public static final class C8905a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: g */
            public final /* synthetic */ W04 f40235g;

            /* renamed from: h */
            public final /* synthetic */ C8904a f40236h;

            /* renamed from: i */
            public final /* synthetic */ C0292As f40237i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8905a(W04 w04, C8904a c8904a, C0292As c0292As) {
                super(2);
                this.f40235g = w04;
                this.f40236h = c8904a;
                this.f40237i = c0292As;
            }

            /* renamed from: a */
            public final void m78959a(CompoundButton compoundButton, boolean z) {
                String m115006c;
                this.f40235g.f40230c = Boolean.valueOf(z);
                TextView textView = this.f40236h.f40233b.f7913d;
                if (z) {
                    m115006c = this.f40237i.m115005d();
                } else {
                    m115006c = this.f40237i.m115006c();
                }
                textView.setText(m115006c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m78959a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: W04$a$b */
        /* loaded from: classes3.dex */
        public static final class C8906b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ W04 f40238g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8906b(W04 w04) {
                super(1);
                this.f40238g = w04;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f40238g.f40231d.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8904a(W04 w04, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f40234c = w04;
            C32587Ee2 m108616a = C32587Ee2.m108616a(view);
            Intrinsics.checkNotNullExpressionValue(m108616a, "bind(view)");
            this.f40233b = m108616a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f40234c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C0292As)) {
                m105816c = null;
            }
            C0292As c0292As = (C0292As) m105816c;
            if (c0292As != null) {
                W04 w04 = this.f40234c;
                if (w04.m78962v() == null) {
                    w04.f40230c = c0292As.m115007b();
                }
                Switch r1 = this.f40233b.f7912c;
                Intrinsics.checkNotNullExpressionValue(r1, "binding.autoReloadToggle");
                C34585Ms2.m94663h(r1, new C8905a(w04, this, c0292As));
                Boolean m78962v = w04.m78962v();
                if (m78962v != null) {
                    this.f40233b.f7912c.setChecked(m78962v.booleanValue());
                }
                TextView textView = this.f40233b.f7911b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.autoReloadTitle");
                C34585Ms2.m94661j(textView, new C8906b(w04));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LW04$b;", "Lw1;", "", "position", "", "bind", "LFe2;", "b", "LFe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LW04;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPreloadV2OptionsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$PreloadV2OptionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n18#2:111\n9#3,4:112\n1#4:116\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsAdapter.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapter$PreloadV2OptionViewHolder\n*L\n56#1:111\n56#1:112,4\n*E\n"})
    /* renamed from: W04$b */
    /* loaded from: classes3.dex */
    public final class C8907b extends C29735w1 {

        /* renamed from: b */
        public final C32821Fe2 f40239b;

        /* renamed from: c */
        public final /* synthetic */ W04 f40240c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: W04$b$a */
        /* loaded from: classes3.dex */
        public static final class C8908a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ W04 f40241g;

            /* renamed from: h */
            public final /* synthetic */ S04 f40242h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8908a(W04 w04, S04 s04) {
                super(1);
                this.f40241g = w04;
                this.f40242h = s04;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f40241g.f40232e.accept(Optional.f63040c.m59032c(this.f40242h));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8907b(W04 w04, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f40240c = w04;
            C32821Fe2 m106819a = C32821Fe2.m106819a(view);
            Intrinsics.checkNotNullExpressionValue(m106819a, "bind(view)");
            this.f40239b = m106819a;
            m106819a.getRoot().setClipToOutline(true);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Integer num;
            ColorStateList valueOf;
            Object m105816c = this.f40240c.m94545o().m109397e(i).m105816c();
            Integer num2 = null;
            if (!(m105816c instanceof S04)) {
                m105816c = null;
            }
            S04 s04 = (S04) m105816c;
            if (s04 != null) {
                W04 w04 = this.f40240c;
                Group group = this.f40239b.f9879i;
                Intrinsics.checkNotNullExpressionValue(group, "binding.selectedIndicator");
                C49520tu6.show$default(group, s04.m86126h(), 0, 2, null);
                this.f40239b.f9876f.setSelected(s04.m86126h());
                View view = this.f40239b.f9875e;
                Intrinsics.checkNotNullExpressionValue(view, "binding.outline");
                C49520tu6.show$default(view, s04.m86126h(), 0, 2, null);
                this.f40239b.f9872b.setText(s04.m86131c());
                TextView textView = this.f40239b.f9876f;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.promoText");
                C49520tu6.m11235p(textView, s04.m86127g(), 4);
                TextView textView2 = this.f40239b.f9874d;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.incentive");
                C49520tu6.setTextAndVisibility$default(textView2, s04.m86130d(), 0, 2, null);
                Long m86129e = s04.m86129e();
                if (m86129e != null) {
                    num = Integer.valueOf((int) m86129e.longValue());
                } else {
                    num = null;
                }
                ColorStateList backgroundTintList = this.f40239b.f9874d.getBackgroundTintList();
                if (backgroundTintList != null) {
                    num2 = Integer.valueOf(backgroundTintList.getDefaultColor());
                }
                if (!Intrinsics.areEqual(num2, num) && num != null && (valueOf = ColorStateList.valueOf(num.intValue())) != null) {
                    TextView textView3 = this.f40239b.f9874d;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.incentive");
                    textView3.setBackgroundTintList(valueOf);
                }
                if (s04.m86126h()) {
                    w04.f40232e.accept(Optional.f63040c.m59032c(s04));
                }
                ConstraintLayout root = this.f40239b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                C34585Ms2.m94661j(root, new C8908a(w04, s04));
            }
        }
    }

    public W04() {
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f40231d = m31902e;
        this.f40232e = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
    }

    /* renamed from: J0 */
    public final Observable<Unit> m78963J0() {
        Observable<Unit> hide = this.f40231d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "autoReloadInformationClickSubject.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new X04();
    }

    /* renamed from: v */
    public final Boolean m78962v() {
        return this.f40230c;
    }

    /* renamed from: w */
    public final Observable<Optional<S04>> m78961w() {
        Observable<Optional<S04>> distinctUntilChanged = this.f40232e.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "optionModelSelectedRelay…().distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31932Bj4.item_preload_v2_option ? new C8907b(this, m41761u) : i == C31932Bj4.item_preload_v2_autoreload_section ? new C8904a(this, m41761u) : new C29735w1(m41761u);
    }
}
