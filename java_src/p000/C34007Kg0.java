package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import co.bird.android.model.wire.WirePartCategory;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\t0\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LKg0;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WirePartCategory;", "v", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "categorySubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kg0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34007Kg0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<WirePartCategory> f20008c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKg0$a;", "Lw1;", "", "position", "", "bind", "Lob2;", "b", "Lob2;", "binding", "Landroid/view/View;", "view", "<init>", "(LKg0;Landroid/view/View;)V", "co.bird.android.feature.operator-inventory"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCategoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,58:1\n18#2:59\n9#3,4:60\n*S KotlinDebug\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder\n*L\n42#1:59\n42#1:60,4\n*E\n"})
    /* renamed from: Kg0$a */
    /* loaded from: classes3.dex */
    public final class C4537a extends C29735w1 {

        /* renamed from: b */
        public final C46362ob2 f20009b;

        /* renamed from: c */
        public final /* synthetic */ C34007Kg0 f20010c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nCategoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n18#2:59\n9#3,4:60\n1#4:64\n*S KotlinDebug\n*F\n+ 1 CategoryAdapter.kt\nco/bird/android/feature/operatorinventory/adapter/CategoryAdapter$PartHeaderViewHolder$1\n*L\n37#1:59\n37#1:60,4\n*E\n"})
        /* renamed from: Kg0$a$a */
        /* loaded from: classes3.dex */
        public static final class C4538a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C34007Kg0 f20011g;

            /* renamed from: h */
            public final /* synthetic */ C4537a f20012h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4538a(C34007Kg0 c34007Kg0, C4537a c4537a) {
                super(1);
                this.f20011g = c34007Kg0;
                this.f20012h = c4537a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f20011g.m94545o().m109397e(this.f20012h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof WirePartCategory)) {
                    m105816c = null;
                }
                WirePartCategory wirePartCategory = (WirePartCategory) m105816c;
                if (wirePartCategory != null) {
                    this.f20011g.f20008c.onNext(wirePartCategory);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4537a(C34007Kg0 c34007Kg0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20010c = c34007Kg0;
            C46362ob2 m20814a = C46362ob2.m20814a(view);
            Intrinsics.checkNotNullExpressionValue(m20814a, "bind(view)");
            this.f20009b = m20814a;
            C34585Ms2.m94661j(view, new C4538a(c34007Kg0, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            AbstractC33662It6<ImageView, Bitmap> abstractC33662It6;
            Object m105816c = this.f20010c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof WirePartCategory)) {
                m105816c = null;
            }
            WirePartCategory wirePartCategory = (WirePartCategory) m105816c;
            if (wirePartCategory != null) {
                this.f20009b.f102167d.setText(wirePartCategory.getName());
                String imageUrl = wirePartCategory.getImageUrl();
                if (imageUrl != null) {
                    abstractC33662It6 = ComponentCallbacks2C17096a.m53137u(this.f20009b.f102166c).m81662b().m16089a1(imageUrl).m16082g1(C24847jU.m30574l()).m16096R0(this.f20009b.f102166c);
                } else {
                    abstractC33662It6 = null;
                }
                if (abstractC33662It6 == null) {
                    this.f20009b.f102166c.setImageDrawable(null);
                }
            }
        }
    }

    public C34007Kg0() {
        C24558d<WirePartCategory> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WirePartCategory>()");
        this.f20008c = m31902e;
    }

    /* renamed from: v */
    public final Observable<WirePartCategory> m98574v() {
        Observable<WirePartCategory> hide = this.f20008c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "categorySubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C52965zj4.item_category_selection ? new C4537a(this, m41761u) : new C29735w1(m41761u);
    }
}
