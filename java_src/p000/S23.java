package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.model.persistence.nestedstructures.NestFavoritePartner;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R:\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m28432d2 = {"LS23;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "c", "Lkotlin/jvm/functions/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "w", "(Lkotlin/jvm/functions/Function1;)V", "onNestPartnerChecked", "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S23 */
/* loaded from: classes2.dex */
public final class S23 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super Pair<NestFavoritePartner, Boolean>, Unit> f33058c = C7318b.f33064g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LS23$a;", "Lw1;", "", "position", "", "bind", "Lvd2;", "b", "Lvd2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(LS23;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFavoritePartnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1#4:69\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder\n*L\n55#1:64\n55#1:65,4\n*E\n"})
    /* renamed from: S23$a */
    /* loaded from: classes2.dex */
    public final class C7316a extends C29735w1 {

        /* renamed from: b */
        public final C50531vd2 f33059b;

        /* renamed from: c */
        public boolean f33060c;

        /* renamed from: d */
        public final /* synthetic */ S23 f33061d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNestFavoritePartnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,63:1\n1#2:64\n18#3:65\n9#4,4:66\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder$1\n*L\n47#1:65\n47#1:66,4\n*E\n"})
        /* renamed from: S23$a$a */
        /* loaded from: classes2.dex */
        public static final class C7317a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ S23 f33063h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7317a(S23 s23) {
                super(2);
                this.f33063h = s23;
            }

            /* renamed from: a */
            public final void m86073a(CompoundButton compoundButton, boolean z) {
                Integer safePosition;
                C2637G6 m109397e;
                NestFavoritePartner nestFavoritePartner;
                if (!C7316a.this.f33060c && (safePosition = C7316a.this.getSafePosition()) != null && (m109397e = this.f33063h.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair != null && (nestFavoritePartner = (NestFavoritePartner) pair.getFirst()) != null) {
                        this.f33063h.m86076v().invoke(TuplesKt.m28425to(nestFavoritePartner, Boolean.valueOf(z)));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m86073a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7316a(S23 s23, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f33061d = s23;
            C50531vd2 m8337a = C50531vd2.m8337a(view);
            Intrinsics.checkNotNullExpressionValue(m8337a, "bind(view)");
            this.f33059b = m8337a;
            AppCompatCheckBox root = m8337a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94663h(root, new C7317a(s23));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f33060c = true;
            Object m105816c = this.f33061d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f33059b.getRoot().setText(((NestFavoritePartner) pair.component1()).getDisplayName());
                this.f33059b.getRoot().setChecked(booleanValue);
            }
            this.f33060c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: S23$b */
    /* loaded from: classes2.dex */
    public static final class C7318b extends Lambda implements Function1<Pair<? extends NestFavoritePartner, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public static final C7318b f33064g = new C7318b();

        public C7318b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<NestFavoritePartner, Boolean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends NestFavoritePartner, ? extends Boolean> pair) {
            invoke2((Pair<NestFavoritePartner, Boolean>) pair);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new Z23());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new T23();
    }

    /* renamed from: v */
    public final Function1<Pair<NestFavoritePartner, Boolean>, Unit> m86076v() {
        return this.f33058c;
    }

    /* renamed from: w */
    public final void m86075w(Function1<? super Pair<NestFavoritePartner, Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f33058c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C39311cj4.item_nest_favorite_partner ? new C7316a(this, m41761u) : new C29735w1(m41761u);
    }
}
