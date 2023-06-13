package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"Le40;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/Bird;", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "birdClicksRelay", "<init>", "()V", C17296a.f69688o, "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40126e40 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<Bird> f77659c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Le40$a;", "Lw1;", "", "position", "", "bind", "LNd2;", "b", "LNd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Le40;Landroid/view/View;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBulkBirdDetailAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n*S KotlinDebug\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder\n*L\n52#1:71\n52#1:72,4\n*E\n"})
    /* renamed from: e40$a */
    /* loaded from: classes3.dex */
    public final class C19958a extends C29735w1 {

        /* renamed from: b */
        public final C34684Nd2 f77660b;

        /* renamed from: c */
        public final /* synthetic */ C40126e40 f77661c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nBulkBirdDetailAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n18#2:71\n9#3,4:72\n1#4:76\n*S KotlinDebug\n*F\n+ 1 BulkBirdDetailAdapter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapter$BirdDetailViewHolder$1\n*L\n45#1:71\n45#1:72,4\n*E\n"})
        /* renamed from: e40$a$a */
        /* loaded from: classes3.dex */
        public static final class C19959a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C40126e40 f77662g;

            /* renamed from: h */
            public final /* synthetic */ C19958a f77663h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19959a(C40126e40 c40126e40, C19958a c19958a) {
                super(1);
                this.f77662g = c40126e40;
                this.f77663h = c19958a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Bird m44395c;
                C1737E6 m94545o = this.f77662g.m94545o();
                Integer safePosition = this.f77663h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C19728dL)) {
                        m105816c = null;
                    }
                    C19728dL c19728dL = (C19728dL) m105816c;
                    if (c19728dL == null || (m44395c = c19728dL.m44395c()) == null) {
                        return;
                    }
                    this.f77662g.f77659c.accept(m44395c);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19958a(C40126e40 c40126e40, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f77661c = c40126e40;
            C34684Nd2 m93691a = C34684Nd2.m93691a(view);
            Intrinsics.checkNotNullExpressionValue(m93691a, "bind(view)");
            this.f77660b = m93691a;
            CardView root = m93691a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C19959a(c40126e40, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean isBlank;
            Object m105816c = this.f77661c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C19728dL)) {
                m105816c = null;
            }
            C19728dL c19728dL = (C19728dL) m105816c;
            if (c19728dL != null) {
                this.f77660b.f24863b.setText(C51916xx1.f118396a.m4411a(getContext(), c19728dL.m44396b(), true));
                this.f77660b.f24864c.setPercent(c19728dL.m44396b());
                this.f77660b.f24866e.setText(c19728dL.m44394d());
                this.f77660b.f24867f.setText(c19728dL.m44391g());
                isBlank = StringsKt__StringsJVMKt.isBlank(c19728dL.m44391g());
                if (!isBlank) {
                    if (c19728dL.m44392f()) {
                        this.f77660b.f24867f.setTextColor(NA0.m94301c(getContext(), C32364Df4.white));
                        this.f77660b.f24867f.setBackgroundTintList(ColorStateList.valueOf(c19728dL.m44393e()));
                        return;
                    }
                    this.f77660b.f24867f.setTextColor(c19728dL.m44393e());
                }
            }
        }
    }

    public C40126e40() {
        C45168ma4<Bird> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Bird>()");
        this.f77659c = m25409g;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C40719f40();
    }

    /* renamed from: v */
    public final Observable<Bird> m43302v() {
        Observable<Bird> hide = this.f77659c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdClicksRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35901Si4.item_operator_bird_detail ? new C19958a(this, m41761u) : new C29735w1(m41761u);
    }
}
