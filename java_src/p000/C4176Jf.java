package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C11947r;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.widget.ClampToRatioImageView;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC36187To2;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LJf;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LTo2;", "c", "LTo2;", "assetManager", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "<init>", "(LTo2;)V", C17296a.f69688o, "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jf */
/* loaded from: classes3.dex */
public final class C4176Jf extends AbstractC52206yS0 {

    /* renamed from: c */
    public final InterfaceC36187To2 f17971c;

    /* renamed from: d */
    public RecyclerView f17972d;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LJf$a;", "Lw1;", "", "position", "", "bind", "LOa2;", "b", "LOa2;", "binding", "Landroid/view/View;", "view", "<init>", "(LJf;Landroid/view/View;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnouncementAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementAdapter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementAdapter$AnnouncementViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n41#4:73\n237#5:74\n*S KotlinDebug\n*F\n+ 1 AnnouncementAdapter.kt\nco/bird/android/lib/announcement/adapter/AnnouncementAdapter$AnnouncementViewHolder\n*L\n53#1:68\n53#1:69,4\n60#1:73\n60#1:74\n*E\n"})
    /* renamed from: Jf$a */
    /* loaded from: classes3.dex */
    public final class C4177a extends C29735w1 {

        /* renamed from: b */
        public final C34891Oa2 f17973b;

        /* renamed from: c */
        public final /* synthetic */ C4176Jf f17974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4177a(C4176Jf c4176Jf, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f17974c = c4176Jf;
            C34891Oa2 m92010a = C34891Oa2.m92010a(view);
            Intrinsics.checkNotNullExpressionValue(m92010a, "bind(view)");
            this.f17973b = m92010a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f17974c.m94545o().m109397e(i).m105816c();
            RecyclerView recyclerView = null;
            if (!(m105816c instanceof C23323ig)) {
                m105816c = null;
            }
            C23323ig c23323ig = (C23323ig) m105816c;
            if (c23323ig != null) {
                C4176Jf c4176Jf = this.f17974c;
                TextView textView = this.f17973b.f26789b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.birdUnlockingText");
                C49520tu6.setTextAndVisibility$default(textView, c23323ig.m33606b(), 0, 2, null);
                this.f17973b.f26792e.setText(c23323ig.m33605c().getTitle());
                this.f17973b.f26791d.setText(c23323ig.m33605c().getMessage());
                LegacyAsset titleAsset = c23323ig.m33605c().getTitleAsset();
                if (titleAsset != null) {
                    InterfaceC36187To2 interfaceC36187To2 = c4176Jf.f17971c;
                    ClampToRatioImageView clampToRatioImageView = this.f17973b.f26790c;
                    Intrinsics.checkNotNullExpressionValue(clampToRatioImageView, "binding.image");
                    AbstractC23461c m33069Q = InterfaceC36187To2.C7925a.drawable$default(interfaceC36187To2, titleAsset, clampToRatioImageView, 0, 0, 12, null).m33069Q();
                    Intrinsics.checkNotNullExpressionValue(m33069Q, "assetManager.drawable(as…       .onErrorComplete()");
                    RecyclerView recyclerView2 = c4176Jf.f17972d;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    } else {
                        recyclerView = recyclerView2;
                    }
                    ScopeProvider m45202a = ViewScopeProvider.m45202a(recyclerView);
                    Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
                    Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m45202a));
                    Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    ((CompletableSubscribeProxy) m33041n).subscribe();
                }
            }
        }
    }

    public C4176Jf(InterfaceC36187To2 assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f17971c = assetManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f17972d = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C39633dE3(0, 0, NA0.m94301c(recyclerView.getContext(), C32364Df4.birdNewRoad), NA0.m94301c(recyclerView.getContext(), C32364Df4.darkerGray), 3, null));
        }
        new C11947r().m66132b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C38135ak4.item_announcement ? new C4177a(this, m41761u) : new C29735w1(m41761u);
    }
}
