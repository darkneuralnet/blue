package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LlF1;", "LyS0;", "Lio/reactivex/Observable;", "", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "scanSerialNumberClicksSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44383lF1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<String> f95770c;

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0016\u001a\n \u0007*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LlF1$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/TextView;", "title", "c", "details", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/ImageView;", "scooter", "e", "greenCheck", "Landroid/widget/Button;", "f", "Landroid/widget/Button;", "scanSerialNumberButton", "Landroid/view/View;", "view", "<init>", "(LlF1;Landroid/view/View;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsAdapter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsAdapter$VehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n18#2:63\n9#3,4:64\n1#4:68\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsAdapter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsAdapter$VehicleViewHolder\n*L\n50#1:63\n50#1:64,4\n*E\n"})
    /* renamed from: lF1$a */
    /* loaded from: classes3.dex */
    public final class C25667a extends C29735w1 {

        /* renamed from: b */
        public final TextView f95771b;

        /* renamed from: c */
        public final TextView f95772c;

        /* renamed from: d */
        public final ImageView f95773d;

        /* renamed from: e */
        public final ImageView f95774e;

        /* renamed from: f */
        public final Button f95775f;

        /* renamed from: g */
        public final /* synthetic */ C44383lF1 f95776g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nHardCountDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsAdapter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsAdapter$VehicleViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,62:1\n18#2:63\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsAdapter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsAdapter$VehicleViewHolder$1\n*L\n43#1:63\n43#1:64,4\n*E\n"})
        /* renamed from: lF1$a$a */
        /* loaded from: classes3.dex */
        public static final class C25668a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C44383lF1 f95777g;

            /* renamed from: h */
            public final /* synthetic */ C25667a f95778h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25668a(C44383lF1 c44383lF1, C25667a c25667a) {
                super(1);
                this.f95777g = c44383lF1;
                this.f95778h = c25667a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f95777g.m94545o().m109394h().get(this.f95778h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C47366qH1)) {
                    m105816c = null;
                }
                C47366qH1 c47366qH1 = (C47366qH1) m105816c;
                if (c47366qH1 != null) {
                    this.f95777g.f95770c.onNext(c47366qH1.m17697j());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25667a(C44383lF1 c44383lF1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f95776g = c44383lF1;
            this.f95771b = (TextView) view.findViewById(C48203rh4.title);
            this.f95772c = (TextView) view.findViewById(C48203rh4.details);
            this.f95773d = (ImageView) view.findViewById(C48203rh4.scooter);
            this.f95774e = (ImageView) view.findViewById(C48203rh4.greenCheck);
            Button scanSerialNumberButton = (Button) view.findViewById(C48203rh4.scanSerialButton);
            this.f95775f = scanSerialNumberButton;
            Intrinsics.checkNotNullExpressionValue(scanSerialNumberButton, "scanSerialNumberButton");
            C34585Ms2.m94661j(scanSerialNumberButton, new C25668a(c44383lF1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            ColorStateList colorStateList;
            Object m105816c = this.f95776g.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C47366qH1)) {
                m105816c = null;
            }
            C47366qH1 c47366qH1 = (C47366qH1) m105816c;
            if (c47366qH1 != null) {
                this.f95771b.setText(c47366qH1.m17697j());
                this.f95772c.setText(c47366qH1.m17703d());
                this.f95772c.setTextColor(c47366qH1.m17702e());
                this.f95773d.setImageDrawable(c47366qH1.m17700g());
                ImageView greenCheck = this.f95774e;
                Intrinsics.checkNotNullExpressionValue(greenCheck, "greenCheck");
                C49520tu6.show$default(greenCheck, c47366qH1.m17699h(), 0, 2, null);
                ImageView imageView = this.f95773d;
                Integer m17701f = c47366qH1.m17701f();
                if (m17701f != null) {
                    colorStateList = ColorStateList.valueOf(m17701f.intValue());
                } else {
                    colorStateList = null;
                }
                imageView.setImageTintList(colorStateList);
                Button scanSerialNumberButton = this.f95775f;
                Intrinsics.checkNotNullExpressionValue(scanSerialNumberButton, "scanSerialNumberButton");
                C49520tu6.show$default(scanSerialNumberButton, c47366qH1.m17698i(), 0, 2, null);
            }
        }
    }

    public C44383lF1() {
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f95770c = m31902e;
    }

    /* renamed from: v */
    public final Observable<String> m27626v() {
        Observable<String> hide = this.f95770c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanSerialNumberClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C40514ej4.item_hard_count ? new C25667a(this, m41761u) : new C29735w1(m41761u);
    }
}
