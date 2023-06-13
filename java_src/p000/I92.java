package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LI92;", "LyS0;", "Lio/reactivex/Observable;", "", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "scanSerialNumberClicksSubject", "<init>", "()V", C17296a.f69688o, "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I92 */
/* loaded from: classes3.dex */
public final class I92 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<String> f14608c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LI92$a;", "Lw1;", "", "position", "", "bind", "Lyc2;", "b", "Lyc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LI92;Landroid/view/View;)V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInventoryScanningDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n18#2:57\n9#3,4:58\n1#4:62\n*S KotlinDebug\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder\n*L\n44#1:57\n44#1:58,4\n*E\n"})
    /* renamed from: I92$a */
    /* loaded from: classes3.dex */
    public final class C3358a extends C29735w1 {

        /* renamed from: b */
        public final C52300yc2 f14609b;

        /* renamed from: c */
        public final /* synthetic */ I92 f14610c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInventoryScanningDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,56:1\n18#2:57\n9#3,4:58\n*S KotlinDebug\n*F\n+ 1 InventoryScanningDetailsAdapter.kt\nco/bird/android/library/inventoryscanning/adapters/InventoryScanningDetailsAdapter$VehicleViewHolder$1\n*L\n37#1:57\n37#1:58,4\n*E\n"})
        /* renamed from: I92$a$a */
        /* loaded from: classes3.dex */
        public static final class C3359a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ I92 f14611g;

            /* renamed from: h */
            public final /* synthetic */ C3358a f14612h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3359a(I92 i92, C3358a c3358a) {
                super(1);
                this.f14611g = i92;
                this.f14612h = c3358a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f14611g.m94545o().m109394h().get(this.f14612h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof G92)) {
                    m105816c = null;
                }
                G92 g92 = (G92) m105816c;
                if (g92 != null) {
                    this.f14611g.f14608c.onNext(g92.m105685j());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3358a(I92 i92, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f14610c = i92;
            C52300yc2 m3171a = C52300yc2.m3171a(view);
            Intrinsics.checkNotNullExpressionValue(m3171a, "bind(view)");
            this.f14609b = m3171a;
            Button button = m3171a.f119841e;
            Intrinsics.checkNotNullExpressionValue(button, "binding.scanSerialButton");
            C34585Ms2.m94661j(button, new C3359a(i92, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ColorStateList colorStateList;
            Object m105816c = this.f14610c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof G92)) {
                m105816c = null;
            }
            G92 g92 = (G92) m105816c;
            if (g92 != null) {
                this.f14609b.f119843g.setText(g92.m105685j());
                this.f14609b.f119838b.setText(g92.m105691d());
                this.f14609b.f119838b.setTextColor(g92.m105690e());
                ImageView imageView = this.f14609b.f119840d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.greenCheck");
                C49520tu6.show$default(imageView, g92.m105688g(), 0, 2, null);
                this.f14609b.f119842f.setImageDrawable(g92.m105686i());
                ImageView imageView2 = this.f14609b.f119842f;
                Integer m105689f = g92.m105689f();
                if (m105689f != null) {
                    colorStateList = ColorStateList.valueOf(m105689f.intValue());
                } else {
                    colorStateList = null;
                }
                imageView2.setImageTintList(colorStateList);
                Button button = this.f14609b.f119841e;
                Intrinsics.checkNotNullExpressionValue(button, "binding.scanSerialButton");
                C49520tu6.show$default(button, g92.m105687h(), 0, 2, null);
            }
        }
    }

    public I92() {
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f14608c = m31902e;
    }

    /* renamed from: v */
    public final Observable<String> m102851v() {
        Observable<String> hide = this.f14608c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSerialNumberClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C42303hk4.item_inventory_scan ? new C3358a(this, m41761u) : new C29735w1(m41761u);
    }
}
