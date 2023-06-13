package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00030\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Lei5;", "LyS0;", "Lio/reactivex/Observable;", "Lhi5;", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "saveMoneyCardClickSubject", "<init>", "()V", C17296a.f69688o, "b", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ei5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40505ei5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<EnumC42284hi5> f78718c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lei5$a;", "Lw1;", "", "position", "", "bind", "Lsf2;", "b", "Lsf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lei5;Landroid/view/View;)V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSaveMoneyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$SaveMoneyCardViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$SaveMoneyCardViewHolder\n*L\n39#1:64\n39#1:65,4\n*E\n"})
    /* renamed from: ei5$a */
    /* loaded from: classes3.dex */
    public final class C20091a extends C29735w1 {

        /* renamed from: b */
        public final C48773sf2 f78719b;

        /* renamed from: c */
        public final /* synthetic */ C40505ei5 f78720c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: ei5$a$a */
        /* loaded from: classes3.dex */
        public static final class C20092a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C40505ei5 f78721g;

            /* renamed from: h */
            public final /* synthetic */ EnumC42284hi5 f78722h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20092a(C40505ei5 c40505ei5, EnumC42284hi5 enumC42284hi5) {
                super(1);
                this.f78721g = c40505ei5;
                this.f78722h = enumC42284hi5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f78721g.f78718c.onNext(this.f78722h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20091a(C40505ei5 c40505ei5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f78720c = c40505ei5;
            C48773sf2 m13861a = C48773sf2.m13861a(view);
            Intrinsics.checkNotNullExpressionValue(m13861a, "bind(view)");
            this.f78719b = m13861a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f78720c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof EnumC42284hi5)) {
                m105816c = null;
            }
            EnumC42284hi5 enumC42284hi5 = (EnumC42284hi5) m105816c;
            if (enumC42284hi5 != null) {
                C40505ei5 c40505ei5 = this.f78720c;
                this.f78719b.f109085f.setBackgroundResource(enumC42284hi5.m36065b());
                this.f78719b.f109084e.setText(enumC42284hi5.m36061f());
                this.f78719b.f109083d.setText(enumC42284hi5.m36062e());
                this.f78719b.f109081b.setText(enumC42284hi5.m36064c());
                this.f78719b.f109082c.setImageResource(enumC42284hi5.m36063d());
                ConstraintLayout constraintLayout = this.f78719b.f109085f;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.mainContainer");
                C34585Ms2.m94661j(constraintLayout, new C20092a(c40505ei5, enumC42284hi5));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lei5$b;", "Lw1;", "", "position", "", "bind", "LPf2;", "b", "LPf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lei5;Landroid/view/View;)V", "save-money_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSaveMoneyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$TitleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n*S KotlinDebug\n*F\n+ 1 SaveMoneyAdapter.kt\nco/bird/android/feature/savemoney/SaveMoneyAdapter$TitleViewHolder\n*L\n57#1:64\n57#1:65,4\n*E\n"})
    /* renamed from: ei5$b */
    /* loaded from: classes3.dex */
    public final class C20093b extends C29735w1 {

        /* renamed from: b */
        public final C35170Pf2 f78723b;

        /* renamed from: c */
        public final /* synthetic */ C40505ei5 f78724c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20093b(C40505ei5 c40505ei5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f78724c = c40505ei5;
            C35170Pf2 m89968a = C35170Pf2.m89968a(view);
            Intrinsics.checkNotNullExpressionValue(m89968a, "bind(view)");
            this.f78723b = m89968a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f78724c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Integer)) {
                m105816c = null;
            }
            Integer num = (Integer) m105816c;
            if (num != null) {
                this.f78723b.f28862b.setText(num.intValue());
            }
        }
    }

    public C40505ei5() {
        C24558d<EnumC42284hi5> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<SaveMoneyCards>()");
        this.f78718c = m31902e;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C41098fi5();
    }

    /* renamed from: v */
    public final Observable<EnumC42284hi5> m42605v() {
        Observable<EnumC42284hi5> hide = this.f78718c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "saveMoneyCardClickSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34038Kj4.item_save_money_card ? new C20091a(this, m41761u) : i == C34038Kj4.item_title ? new C20093b(this, m41761u) : new C29735w1(m41761u);
    }
}
