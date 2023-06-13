package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\b\u000e\u000f\u0007\u0010\u0011\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R(\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00030\u00030\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lf86;", "LUl0;", "Lio/reactivex/Observable;", "", "x", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "w", "()Lio/reactivex/subjects/d;", "skuClicksSubject", "<init>", "()V", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: f86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC40765f86 extends AbstractC36392Ul0 {

    /* renamed from: c */
    public final C24558d<String> f79517c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$a;", "Lw1;", "", "position", "", "bind", "LAb2;", "b", "LAb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$ContainerOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$ContainerOrderViewHolder\n*L\n122#1:146\n122#1:147,4\n*E\n"})
    /* renamed from: f86$a */
    /* loaded from: classes3.dex */
    public final class C20235a extends C29735w1 {

        /* renamed from: b */
        public final C31624Ab2 f79518b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20235a(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79519c = abstractC40765f86;
            C31624Ab2 m115494a = C31624Ab2.m115494a(view);
            Intrinsics.checkNotNullExpressionValue(m115494a, "bind(view)");
            this.f79518b = m115494a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79519c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C52521yy3)) {
                m105816c = null;
            }
            C52521yy3 c52521yy3 = (C52521yy3) m105816c;
            if (c52521yy3 != null) {
                this.f79518b.f832c.setText(c52521yy3.m2201c());
                this.f79518b.f833d.setText(c52521yy3.m2202b());
                this.f79518b.f836g.setText(c52521yy3.m2200d().m103900b());
                this.f79518b.f836g.setTextColor(c52521yy3.m2200d().m103899c());
                Boolean m2199e = c52521yy3.m2199e();
                if (Intrinsics.areEqual(m2199e, Boolean.TRUE)) {
                    ImageView imageView = this.f79518b.f835f;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.statusIconSuccess");
                    C49520tu6.m11233r(imageView);
                    ImageView imageView2 = this.f79518b.f834e;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "binding.statusIconFailure");
                    C49520tu6.m11232s(imageView2, false, 4);
                } else if (Intrinsics.areEqual(m2199e, Boolean.FALSE)) {
                    ImageView imageView3 = this.f79518b.f835f;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "binding.statusIconSuccess");
                    C49520tu6.m11232s(imageView3, false, 4);
                    ImageView imageView4 = this.f79518b.f834e;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "binding.statusIconFailure");
                    C49520tu6.m11233r(imageView4);
                } else {
                    ImageView imageView5 = this.f79518b.f835f;
                    Intrinsics.checkNotNullExpressionValue(imageView5, "binding.statusIconSuccess");
                    C49520tu6.m11232s(imageView5, false, 4);
                    ImageView imageView6 = this.f79518b.f834e;
                    Intrinsics.checkNotNullExpressionValue(imageView6, "binding.statusIconFailure");
                    C49520tu6.m11232s(imageView6, false, 4);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0094\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lf86$b;", "Lw1;", "", "position", "", "bind", "Llc2;", "b", "Llc2;", C17296a.f69688o, "()Llc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$HeaderSpannableStatusCTAViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$HeaderSpannableStatusCTAViewHolder\n*L\n34#1:146\n34#1:147,4\n*E\n"})
    /* renamed from: f86$b */
    /* loaded from: classes3.dex */
    public class C20236b extends C29735w1 {

        /* renamed from: b */
        public final C44593lc2 f79520b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79521c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20236b(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79521c = abstractC40765f86;
            C44593lc2 m27092a = C44593lc2.m27092a(view);
            Intrinsics.checkNotNullExpressionValue(m27092a, "bind(view)");
            this.f79520b = m27092a;
        }

        /* renamed from: a */
        public final C44593lc2 m41957a() {
            return this.f79520b;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79521c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof HH1)) {
                m105816c = null;
            }
            HH1 hh1 = (HH1) m105816c;
            if (hh1 != null) {
                this.f79520b.f96426c.setText(hh1.m104063c());
                this.f79520b.f96427d.setText(hh1.m104062d());
                this.f79520b.f96425b.setText(hh1.m104064b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$c;", "Lw1;", "", "position", "", "bind", "Lkd2;", "b", "Lkd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$LineItemStatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$LineItemStatusViewHolder\n*L\n78#1:146\n78#1:147,4\n*E\n"})
    /* renamed from: f86$c */
    /* loaded from: classes3.dex */
    public final class C20237c extends C29735w1 {

        /* renamed from: b */
        public final C44010kd2 f79522b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20237c(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79523c = abstractC40765f86;
            C44010kd2 m28716a = C44010kd2.m28716a(view);
            Intrinsics.checkNotNullExpressionValue(m28716a, "bind(view)");
            this.f79522b = m28716a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79523c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C49486tr2)) {
                m105816c = null;
            }
            C49486tr2 c49486tr2 = (C49486tr2) m105816c;
            if (c49486tr2 != null) {
                this.f79522b.f94678b.setText(c49486tr2.m11593b());
                this.f79522b.f94679c.setText(c49486tr2.m11592c().m103900b());
                this.f79522b.f94679c.setTextColor(c49486tr2.m11592c().m103899c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$d;", "Lw1;", "", "position", "", "bind", "Lmc2;", "b", "Lmc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$LineItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$LineItemViewHolder\n*L\n67#1:146\n67#1:147,4\n*E\n"})
    /* renamed from: f86$d */
    /* loaded from: classes3.dex */
    public final class C20238d extends C29735w1 {

        /* renamed from: b */
        public final C45186mc2 f79524b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20238d(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79525c = abstractC40765f86;
            C45186mc2 m25314a = C45186mc2.m25314a(view);
            Intrinsics.checkNotNullExpressionValue(m25314a, "bind(view)");
            this.f79524b = m25314a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79525c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C50079ur2)) {
                m105816c = null;
            }
            C50079ur2 c50079ur2 = (C50079ur2) m105816c;
            if (c50079ur2 != null) {
                this.f79524b.f98443c.setText(c50079ur2.m9652d());
                this.f79524b.f98442b.setText(c50079ur2.m9653c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$e;", "Lw1;", "", "position", "", "bind", "LCb2;", "b", "LCb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$OrderStatusViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$OrderStatusViewHolder\n*L\n90#1:146\n90#1:147,4\n*E\n"})
    /* renamed from: f86$e */
    /* loaded from: classes3.dex */
    public final class C20239e extends C29735w1 {

        /* renamed from: b */
        public final C32092Cb2 f79526b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20239e(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79527c = abstractC40765f86;
            C32092Cb2 m112084a = C32092Cb2.m112084a(view);
            Intrinsics.checkNotNullExpressionValue(m112084a, "bind(view)");
            this.f79526b = m112084a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79527c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof HQ5)) {
                m105816c = null;
            }
            HQ5 hq5 = (HQ5) m105816c;
            if (hq5 != null) {
                this.f79526b.f4293c.setText(hq5.m103900b());
                this.f79526b.f4293c.setTextColor(hq5.m103899c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$f;", "Lw1;", "", "position", "", "bind", "LEf2;", "b", "LEf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SectionHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SectionHeaderViewHolder\n*L\n114#1:146\n114#1:147,4\n*E\n"})
    /* renamed from: f86$f */
    /* loaded from: classes3.dex */
    public final class C20240f extends C29735w1 {

        /* renamed from: b */
        public final C32596Ef2 f79528b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20240f(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79529c = abstractC40765f86;
            C32596Ef2 m108595a = C32596Ef2.m108595a(view);
            Intrinsics.checkNotNullExpressionValue(m108595a, "bind(view)");
            this.f79528b = m108595a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f79528b.f7926b;
            Object m105816c = this.f79529c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0094\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"Lf86$g;", "Lw1;", "", "position", "", "bind", "LBb2;", "b", "LBb2;", C17296a.f69688o, "()LBb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SkuViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SkuViewHolder\n*L\n54#1:146\n54#1:147,4\n*E\n"})
    /* renamed from: f86$g */
    /* loaded from: classes3.dex */
    public class C20241g extends C29735w1 {

        /* renamed from: b */
        public final C31858Bb2 f79530b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79531c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SkuViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$SkuViewHolder$1\n*L\n47#1:146\n47#1:147,4\n*E\n"})
        /* renamed from: f86$g$a */
        /* loaded from: classes3.dex */
        public static final class C20242a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ AbstractC40765f86 f79532g;

            /* renamed from: h */
            public final /* synthetic */ C20241g f79533h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20242a(AbstractC40765f86 abstractC40765f86, C20241g c20241g) {
                super(1);
                this.f79532g = abstractC40765f86;
                this.f79533h = c20241g;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                List<C2637G6> m109394h = this.f79532g.m94545o().m109394h();
                Integer safePosition = this.f79533h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m109394h.get(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C52521yy3)) {
                        m105816c = null;
                    }
                    C52521yy3 c52521yy3 = (C52521yy3) m105816c;
                    if (c52521yy3 != null) {
                        this.f79532g.m41959w().onNext(c52521yy3.m2202b());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20241g(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79531c = abstractC40765f86;
            C31858Bb2 m113832a = C31858Bb2.m113832a(view);
            Intrinsics.checkNotNullExpressionValue(m113832a, "bind(view)");
            this.f79530b = m113832a;
            TextView textView = m113832a.f2544f;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.viewAction");
            C34585Ms2.m94661j(textView, new C20242a(abstractC40765f86, this));
        }

        /* renamed from: a */
        public final C31858Bb2 m41956a() {
            return this.f79530b;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79531c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C52521yy3)) {
                m105816c = null;
            }
            C52521yy3 c52521yy3 = (C52521yy3) m105816c;
            if (c52521yy3 != null) {
                this.f79530b.f2541c.setText(c52521yy3.m2201c());
                this.f79530b.f2542d.setText(c52521yy3.m2202b());
                this.f79530b.f2543e.setText(c52521yy3.m2200d().m103900b());
                this.f79530b.f2543e.setTextColor(c52521yy3.m2200d().m103899c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lf86$h;", "Lw1;", "", "position", "", "bind", "LVf2;", "b", "LVf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lf86;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransferOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$TransferOrderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,145:1\n18#2:146\n9#3,4:147\n*S KotlinDebug\n*F\n+ 1 TransferOrderAdapter.kt\nco/bird/android/feature/transferorder/adapters/TransferOrderAdapter$TransferOrderViewHolder\n*L\n101#1:146\n101#1:147,4\n*E\n"})
    /* renamed from: f86$h */
    /* loaded from: classes3.dex */
    public final class C20243h extends C29735w1 {

        /* renamed from: b */
        public final C36574Vf2 f79534b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC40765f86 f79535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20243h(AbstractC40765f86 abstractC40765f86, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f79535c = abstractC40765f86;
            C36574Vf2 m79592a = C36574Vf2.m79592a(view);
            Intrinsics.checkNotNullExpressionValue(m79592a, "bind(view)");
            this.f79534b = m79592a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f79535c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C52521yy3)) {
                m105816c = null;
            }
            C52521yy3 c52521yy3 = (C52521yy3) m105816c;
            if (c52521yy3 != null) {
                this.f79534b.f39419c.setText(c52521yy3.m2201c());
                this.f79534b.f39420d.setText(c52521yy3.m2202b());
                this.f79534b.f39421e.setText(c52521yy3.m2200d().m103900b());
                this.f79534b.f39421e.setTextColor(c52521yy3.m2200d().m103899c());
            }
        }
    }

    public AbstractC40765f86() {
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f79517c = m31902e;
    }

    /* renamed from: w */
    public final C24558d<String> m41959w() {
        return this.f79517c;
    }

    /* renamed from: x */
    public final Observable<String> m41958x() {
        Observable<String> hide = this.f79517c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "skuClicksSubject.hide()");
        return hide;
    }
}
