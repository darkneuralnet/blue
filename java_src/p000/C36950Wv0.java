package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LWv0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "itemClicks", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36950Wv0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<String> f42291c;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LWv0$a;", "Lw1;", "", "position", "", "bind", "LWf2;", "b", "LWf2;", "binding", "", "c", "Ljava/lang/String;", "tutorialId", "Landroid/view/View;", "view", "<init>", "(LWv0;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialGroupAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupAdapter.kt\nco/bird/android/feature/configurabletutorial/group/adapters/ConfigurableTutorialGroupAdapter$TutorialCardViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,52:1\n18#2:53\n9#3,4:54\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialGroupAdapter.kt\nco/bird/android/feature/configurabletutorial/group/adapters/ConfigurableTutorialGroupAdapter$TutorialCardViewHolder\n*L\n40#1:53\n40#1:54,4\n*E\n"})
    /* renamed from: Wv0$a */
    /* loaded from: classes3.dex */
    public final class C9208a extends C29735w1 {

        /* renamed from: b */
        public final C36808Wf2 f42292b;

        /* renamed from: c */
        public String f42293c;

        /* renamed from: d */
        public final /* synthetic */ C36950Wv0 f42294d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nConfigurableTutorialGroupAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialGroupAdapter.kt\nco/bird/android/feature/configurabletutorial/group/adapters/ConfigurableTutorialGroupAdapter$TutorialCardViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
        /* renamed from: Wv0$a$a */
        /* loaded from: classes3.dex */
        public static final class C9209a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C36950Wv0 f42296h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9209a(C36950Wv0 c36950Wv0) {
                super(1);
                this.f42296h = c36950Wv0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String str = C9208a.this.f42293c;
                if (str != null) {
                    this.f42296h.f42291c.accept(str);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9208a(C36950Wv0 c36950Wv0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f42294d = c36950Wv0;
            C36808Wf2 m78027a = C36808Wf2.m78027a(view);
            Intrinsics.checkNotNullExpressionValue(m78027a, "bind(view)");
            this.f42292b = m78027a;
            CardView root = m78027a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C9209a(c36950Wv0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f42294d.m94545o().m109397e(i).m105816c();
            AbstractC33662It6<ImageView, Drawable> abstractC33662It6 = null;
            if (!(m105816c instanceof Tutorial)) {
                m105816c = null;
            }
            Tutorial tutorial = (Tutorial) m105816c;
            if (tutorial != null) {
                this.f42293c = tutorial.getId();
                this.f42292b.f41484c.setText(tutorial.getMenuTitle());
                LegacyAsset menuAsset = tutorial.getMenuAsset();
                if (menuAsset != null) {
                    abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f42292b.f41483b).m81653k(menuAsset.getMedia().getMediaUrl()).m16096R0(this.f42292b.f41483b);
                }
                if (abstractC33662It6 == null) {
                    this.f42292b.f41483b.setImageDrawable(NA0.m94299e(getContext(), C48193rg4.ic_rectangle));
                }
            }
        }
    }

    public C36950Wv0() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f42291c = m25409g;
    }

    /* renamed from: v */
    public final Observable<String> m77712v() {
        Observable<String> hide = this.f42291c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemClicks.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        return new C9208a(this, C40788fB0.m41761u(context, i, parent, false));
    }
}
