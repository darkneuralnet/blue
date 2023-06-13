package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\b\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\r0\r0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LuT2;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "", "c", "Lkotlin/Lazy;", "v", "()Lio/reactivex/Observable;", "messageAtBottom", "Lma4;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lma4;", "messageAtBottomRelay", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uT2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49846uT2 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final Lazy f112417c;

    /* renamed from: d */
    public final C45168ma4<Boolean> f112418d;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LuT2$a;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "Lqd2;", "b", "Lqd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LuT2;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMessageListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageListAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/MessageListAdapter$MessageAssetViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n*S KotlinDebug\n*F\n+ 1 MessageListAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/MessageListAdapter$MessageAssetViewHolder\n*L\n59#1:78\n59#1:79,4\n*E\n"})
    /* renamed from: uT2$a */
    /* loaded from: classes3.dex */
    public final class C29198a extends C29735w1 {

        /* renamed from: b */
        public final C47568qd2 f112419b;

        /* renamed from: c */
        public final /* synthetic */ C49846uT2 f112420c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29198a(C49846uT2 c49846uT2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f112420c = c49846uT2;
            C47568qd2 m17317a = C47568qd2.m17317a(view);
            Intrinsics.checkNotNullExpressionValue(m17317a, "bind(view)");
            this.f112419b = m17317a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f112420c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof LegacyAsset)) {
                m105816c = null;
            }
            LegacyAsset legacyAsset = (LegacyAsset) m105816c;
            if (legacyAsset != null) {
                if (!legacyAsset.getMedia().isLottieJson()) {
                    Intrinsics.checkNotNullExpressionValue(ComponentCallbacks2C17096a.m53137u(this.f112419b.f105515b).m81653k(legacyAsset.getMedia().getMediaUrl()).m16096R0(this.f112419b.f105515b), "{\n          Glide.with(b…(binding.image)\n        }");
                    return;
                }
                this.f112419b.getRoot().setAnimationFromUrl(legacyAsset.getMedia().getMediaUrl());
                this.f112419b.getRoot().setRepeatCount(3);
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f112419b.getRoot().m53539y();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LuT2$b;", "Lw1;", "", "position", "", "bind", "Lpd2;", "b", "Lpd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LuT2;Landroid/view/View;)V", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMessageListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageListAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/MessageListAdapter$MessageTextViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n*S KotlinDebug\n*F\n+ 1 MessageListAdapter.kt\nco/bird/android/feature/configurabletutorial/tutorial/adapters/MessageListAdapter$MessageTextViewHolder\n*L\n51#1:78\n51#1:79,4\n*E\n"})
    /* renamed from: uT2$b */
    /* loaded from: classes3.dex */
    public final class C29199b extends C29735w1 {

        /* renamed from: b */
        public final C46975pd2 f112421b;

        /* renamed from: c */
        public final /* synthetic */ C49846uT2 f112422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29199b(C49846uT2 c49846uT2, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f112422c = c49846uT2;
            C46975pd2 m19056a = C46975pd2.m19056a(view);
            Intrinsics.checkNotNullExpressionValue(m19056a, "bind(view)");
            this.f112421b = m19056a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            TextView root = this.f112421b.getRoot();
            Object m105816c = this.f112422c.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uT2$c */
    /* loaded from: classes3.dex */
    public static final class C29200c extends Lambda implements Function0<Observable<Boolean>> {
        public C29200c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Boolean> invoke() {
            return C49846uT2.this.f112418d.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"uT2$d", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "co.bird.android.feature.configurabletutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uT2$d */
    /* loaded from: classes3.dex */
    public static final class C29201d extends RecyclerView.AbstractC11863t {
        public C29201d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11863t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C49846uT2.this.f112418d.accept(Boolean.valueOf(!recyclerView.canScrollVertically(1)));
        }
    }

    public C49846uT2() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C29200c());
        this.f112417c = lazy;
        C45168ma4<Boolean> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Boolean>()");
        this.f112418d = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C50438vT2());
        }
        recyclerView.addOnScrollListener(new C29201d());
    }

    /* renamed from: v */
    public final Observable<Boolean> m10246v() {
        Object value = this.f112417c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-messageAtBottom>(...)");
        return (Observable) value;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36837Wi4.item_message_title || i == C36837Wi4.item_message_bullet ? new C29199b(this, m41761u) : i == C36837Wi4.item_message_image ? new C29198a(this, m41761u) : new C29735w1(m41761u);
    }
}
