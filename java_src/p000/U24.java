package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\u000b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\r\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\bR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"LU24;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "Lco/bird/android/model/persistence/Bird;", "w", "c", "Lkotlin/jvm/functions/Function1;", "infoClickListener", DateTokenConverter.CONVERTER_KEY, "privateBirdClickListener", "<init>", "()V", C17296a.f69688o, "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: U24 */
/* loaded from: classes3.dex */
public final class U24 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super Unit, Unit> f36745c;

    /* renamed from: d */
    public Function1<? super Bird, Unit> f36746d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LU24$a;", "Lw1;", "", "position", "", "bind", "LIe2;", "b", "LIe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LU24;Landroid/view/View;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPrivateBirdAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder\n*L\n57#1:68\n57#1:69,4\n*E\n"})
    /* renamed from: U24$a */
    /* loaded from: classes3.dex */
    public final class C8182a extends C29735w1 {

        /* renamed from: b */
        public final C33523Ie2 f36747b;

        /* renamed from: c */
        public final /* synthetic */ U24 f36748c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nPrivateBirdAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder$1\n*L\n45#1:68\n45#1:69,4\n*E\n"})
        /* renamed from: U24$a$a */
        /* loaded from: classes3.dex */
        public static final class C8183a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ U24 f36750h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8183a(U24 u24) {
                super(1);
                this.f36750h = u24;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                int adapterPosition = C8182a.this.getAdapterPosition();
                if (adapterPosition != -1) {
                    Object m105816c = this.f36750h.m94545o().m109397e(adapterPosition).m105816c();
                    if (!(m105816c instanceof K44)) {
                        m105816c = null;
                    }
                    K44 k44 = (K44) m105816c;
                    if (k44 != null) {
                        U24 u24 = this.f36750h;
                        if (k44.m99260c()) {
                            Function1 function1 = u24.f36746d;
                            if (function1 != null) {
                                function1.invoke(k44.m99261b());
                                return;
                            }
                            return;
                        }
                        Function1 function12 = u24.f36745c;
                        if (function12 != null) {
                            function12.invoke(Unit.INSTANCE);
                        }
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8182a(U24 u24, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f36748c = u24;
            C33523Ie2 m101852a = C33523Ie2.m101852a(view);
            Intrinsics.checkNotNullExpressionValue(m101852a, "bind(view)");
            this.f36747b = m101852a;
            ConstraintLayout root = m101852a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C8183a(u24));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            String code;
            Object m105816c = this.f36748c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof K44)) {
                m105816c = null;
            }
            K44 k44 = (K44) m105816c;
            if (k44 != null) {
                if (Bird_Kt.isBirdAir(k44.m99261b()) && !k44.m99260c()) {
                    z = true;
                } else {
                    z = false;
                }
                TextView textView = this.f36747b.f15970c;
                PrivateBird privateBird = k44.m99261b().getPrivateBird();
                if (privateBird == null || (code = privateBird.getNickname()) == null) {
                    code = k44.m99261b().getCode();
                }
                textView.setText(code);
                this.f36747b.f15969b.setText(k44.m99259d());
                ImageView imageView = this.f36747b.f15971d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.chevron");
                C49520tu6.m11232s(imageView, !z, 4);
                ImageView imageView2 = this.f36747b.f15973f;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.info");
                C49520tu6.m11232s(imageView2, z, 4);
            }
        }
    }

    /* renamed from: v */
    public final void m82043v(Function1<? super Unit, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36745c = listener;
    }

    /* renamed from: w */
    public final void m82042w(Function1<? super Bird, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36746d = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31698Aj4.item_private_bird ? new C8182a(this, m41761u) : new C29735w1(m41761u);
    }
}
