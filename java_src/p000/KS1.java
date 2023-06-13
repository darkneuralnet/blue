package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationIngestionResult;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0004-.\u001c\u001fB\u0007¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000f0\u000f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00110\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\"\u0010$\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\"\u0010&\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00150\u00150\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001dR\"\u0010(\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00170\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001dR\"\u0010*\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00040\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001d¨\u0006/"}, m28432d2 = {"LKS1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "Lio/reactivex/Observable;", "Ljava/util/Locale;", "v", "Lco/bird/android/model/identification/IdentificationDocumentType;", "w", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "x", "", "A", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "y", "B", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "countryClicksSubject", DateTokenConverter.CONVERTER_KEY, "documentTypeClicksSubject", "e", "userAgeClicksSubject", "f", "expirationClicksSubject", "g", "scoreClicksSubject", "h", "ingestionResultsClicksSubject", "i", "secondsToResultClicksSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KS1 */
/* loaded from: classes3.dex */
public final class KS1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<Locale> f19600c;

    /* renamed from: d */
    public final C24558d<IdentificationDocumentType> f19601d;

    /* renamed from: e */
    public final C24558d<Integer> f19602e;

    /* renamed from: f */
    public final C24558d<Integer> f19603f;

    /* renamed from: g */
    public final C24558d<Double> f19604g;

    /* renamed from: h */
    public final C24558d<IdentificationIngestionResult> f19605h;

    /* renamed from: i */
    public final C24558d<Integer> f19606i;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0015"}, m28432d2 = {"LKS1$a;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "endIcon", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "title", DateTokenConverter.CONVERTER_KEY, "value", "Landroid/view/View;", "view", "<init>", "(LKS1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder\n*L\n148#1:166\n148#1:167,4\n*E\n"})
    /* renamed from: KS1$a */
    /* loaded from: classes3.dex */
    public final class C4440a extends C29735w1 {

        /* renamed from: b */
        public final ImageView f19607b;

        /* renamed from: c */
        public final TextView f19608c;

        /* renamed from: d */
        public final TextView f19609d;

        /* renamed from: e */
        public final /* synthetic */ KS1 f19610e;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DebugViewHolder$1\n*L\n133#1:166\n133#1:167,4\n*E\n"})
        /* renamed from: KS1$a$a */
        /* loaded from: classes3.dex */
        public static final class C4441a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ KS1 f19611g;

            /* renamed from: h */
            public final /* synthetic */ C4440a f19612h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4441a(KS1 ks1, C4440a c4440a) {
                super(1);
                this.f19611g = ks1;
                this.f19612h = c4440a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                AbstractC41544gT1 m36361d;
                Object m105816c = this.f19611g.m94545o().m109397e(this.f19612h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C42137hT1)) {
                    m105816c = null;
                }
                C42137hT1 c42137hT1 = (C42137hT1) m105816c;
                if (c42137hT1 == null || (m36361d = c42137hT1.m36361d()) == null) {
                    return;
                }
                KS1 ks1 = this.f19611g;
                if (m36361d instanceof C41672gg6) {
                    ks1.f19602e.onNext(Integer.valueOf(((C41672gg6) m36361d).m37910c()));
                } else if (m36361d instanceof C49988ui1) {
                    ks1.f19603f.onNext(Integer.valueOf(((C49988ui1) m36361d).m9859c()));
                } else if (m36361d instanceof C37342Ym5) {
                    ks1.f19604g.onNext(Double.valueOf(((C37342Ym5) m36361d).m74275c()));
                } else if (m36361d instanceof Y12) {
                    ks1.f19605h.onNext(((Y12) m36361d).m75825c());
                } else if (m36361d instanceof C34102Kq5) {
                    ks1.f19606i.onNext(Integer.valueOf(((C34102Kq5) m36361d).m98237c()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4440a(KS1 ks1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19610e = ks1;
            this.f19607b = (ImageView) this.itemView.findViewById(C49981uh4.endIconView);
            this.f19608c = (TextView) this.itemView.findViewById(C49981uh4.titleView);
            this.f19609d = (TextView) this.itemView.findViewById(C49981uh4.valueView);
            C34585Ms2.m94661j(view, new C4441a(ks1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f19610e.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C42137hT1)) {
                m105816c = null;
            }
            C42137hT1 c42137hT1 = (C42137hT1) m105816c;
            if (c42137hT1 != null) {
                this.f19608c.setText(getContext().getString(c42137hT1.m36362c()));
                this.f19609d.setText(c42137hT1.m36361d().m39366a());
                this.f19607b.setImageResource(c42137hT1.m36363b());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LKS1$b;", "Lw1;", "", "position", "", "bind", "Landroid/widget/RadioButton;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/RadioButton;", "radio", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "title", "Landroid/view/View;", "view", "<init>", "(LKS1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DocumentTypeHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DocumentTypeHolder\n*L\n85#1:166\n85#1:167,4\n*E\n"})
    /* renamed from: KS1$b */
    /* loaded from: classes3.dex */
    public final class C4442b extends C29735w1 {

        /* renamed from: b */
        public final RadioButton f19613b;

        /* renamed from: c */
        public final TextView f19614c;

        /* renamed from: d */
        public final /* synthetic */ KS1 f19615d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DocumentTypeHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$DocumentTypeHolder$1\n*L\n75#1:166\n75#1:167,4\n*E\n"})
        /* renamed from: KS1$b$a */
        /* loaded from: classes3.dex */
        public static final class C4443a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ KS1 f19616g;

            /* renamed from: h */
            public final /* synthetic */ C4442b f19617h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4443a(KS1 ks1, C4442b c4442b) {
                super(1);
                this.f19616g = ks1;
                this.f19617h = c4442b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C1737E6 m94545o = this.f19616g.m94545o();
                Integer safePosition = this.f19617h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof C42164hW1)) {
                        m105816c = null;
                    }
                    C42164hW1 c42164hW1 = (C42164hW1) m105816c;
                    if (c42164hW1 != null) {
                        this.f19616g.f19601d.onNext(((Pair) c42164hW1.m36256f()).getFirst());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4442b(KS1 ks1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19615d = ks1;
            this.f19613b = (RadioButton) this.itemView.findViewById(C49981uh4.radioButton);
            this.f19614c = (TextView) this.itemView.findViewById(C49981uh4.titleView);
            C34585Ms2.m94661j(view, new C4443a(ks1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            C1737E6 m94545o = this.f19615d.m94545o();
            Integer safePosition = getSafePosition();
            if (safePosition != null) {
                Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                if (!(m105816c instanceof C42164hW1)) {
                    m105816c = null;
                }
                C42164hW1 c42164hW1 = (C42164hW1) m105816c;
                if (c42164hW1 != null) {
                    this.f19614c.setText(c42164hW1.m36257e());
                    this.f19613b.setChecked(((Boolean) ((Pair) c42164hW1.m36256f()).getSecond()).booleanValue());
                    this.f19614c.setClickable(false);
                    this.f19613b.setClickable(false);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LKS1$c;", "Lw1;", "", "position", "", "bind", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "headerView", "Landroid/view/View;", "view", "<init>", "(LKS1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$HeaderViewHolder\n*L\n161#1:166\n161#1:167,4\n*E\n"})
    /* renamed from: KS1$c */
    /* loaded from: classes3.dex */
    public final class C4444c extends C29735w1 {

        /* renamed from: b */
        public final TextView f19618b;

        /* renamed from: c */
        public final /* synthetic */ KS1 f19619c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4444c(KS1 ks1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19619c = ks1;
            this.f19618b = (TextView) view;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            C49520tu6.m11233r(this.f19618b);
            TextView textView = this.f19618b;
            Object m105816c = this.f19619c.m94545o().m109394h().get(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof CharSequence;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            textView.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\n \u0007*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LKS1$d;", "Lw1;", "", "position", "", "bind", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "b", "Landroid/widget/ImageView;", "startIcon", "c", "endIcon", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "title", "e", "message", "Landroid/view/View;", "view", "<init>", "(LKS1;Landroid/view/View;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$IdentificationSelectorViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$IdentificationSelectorViewHolder\n*L\n116#1:166\n116#1:167,4\n*E\n"})
    /* renamed from: KS1$d */
    /* loaded from: classes3.dex */
    public final class C4445d extends C29735w1 {

        /* renamed from: b */
        public final ImageView f19620b;

        /* renamed from: c */
        public final ImageView f19621c;

        /* renamed from: d */
        public final TextView f19622d;

        /* renamed from: e */
        public final TextView f19623e;

        /* renamed from: f */
        public final /* synthetic */ KS1 f19624f;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdentificationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$IdentificationSelectorViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,165:1\n18#2:166\n9#3,4:167\n*S KotlinDebug\n*F\n+ 1 IdentificationAdapter.kt\nco/bird/android/feature/identification/adapters/IdentificationAdapter$IdentificationSelectorViewHolder$1\n*L\n103#1:166\n103#1:167,4\n*E\n"})
        /* renamed from: KS1$d$a */
        /* loaded from: classes3.dex */
        public static final class C4446a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ KS1 f19625g;

            /* renamed from: h */
            public final /* synthetic */ C4445d f19626h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4446a(KS1 ks1, C4445d c4445d) {
                super(1);
                this.f19625g = ks1;
                this.f19626h = c4445d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m36256f;
                Object m105816c = this.f19625g.m94545o().m109397e(this.f19626h.getAdapterPosition()).m105816c();
                if (!(m105816c instanceof C42164hW1)) {
                    m105816c = null;
                }
                C42164hW1 c42164hW1 = (C42164hW1) m105816c;
                if (c42164hW1 == null || (m36256f = c42164hW1.m36256f()) == null) {
                    return;
                }
                KS1 ks1 = this.f19625g;
                if (m36256f instanceof Locale) {
                    ks1.f19600c.onNext(m36256f);
                } else if (m36256f instanceof IdentificationDocumentType) {
                    ks1.f19601d.onNext(m36256f);
                } else {
                    C41318g46.m40163a("Unknown data type encountered when clicking on view in Identification recycler view", new Object[0]);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4445d(KS1 ks1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f19624f = ks1;
            this.f19620b = (ImageView) this.itemView.findViewById(C49981uh4.startIconView);
            this.f19621c = (ImageView) this.itemView.findViewById(C49981uh4.endIconView);
            this.f19622d = (TextView) this.itemView.findViewById(C49981uh4.titleView);
            this.f19623e = (TextView) this.itemView.findViewById(C49981uh4.messageView);
            C34585Ms2.m94661j(view, new C4446a(ks1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean isBlank;
            super.bind(i);
            Object m105816c = this.f19624f.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C42164hW1)) {
                m105816c = null;
            }
            C42164hW1 c42164hW1 = (C42164hW1) m105816c;
            if (c42164hW1 != null) {
                this.f19622d.setText(c42164hW1.m36257e());
                this.f19623e.setText(c42164hW1.m36259c());
                TextView message = this.f19623e;
                Intrinsics.checkNotNullExpressionValue(message, "message");
                String m36259c = c42164hW1.m36259c();
                if (m36259c != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(m36259c);
                    if (!isBlank) {
                        z = false;
                        C49520tu6.show$default(message, !z, 0, 2, null);
                        this.f19620b.setImageResource(c42164hW1.m36258d());
                        this.f19621c.setImageResource(c42164hW1.m36260b());
                    }
                }
                z = true;
                C49520tu6.show$default(message, !z, 0, 2, null);
                this.f19620b.setImageResource(c42164hW1.m36258d());
                this.f19621c.setImageResource(c42164hW1.m36260b());
            }
        }
    }

    public KS1() {
        C24558d<Locale> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Locale>()");
        this.f19600c = m31902e;
        C24558d<IdentificationDocumentType> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<IdentificationDocumentType>()");
        this.f19601d = m31902e2;
        C24558d<Integer> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Int>()");
        this.f19602e = m31902e3;
        C24558d<Integer> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Int>()");
        this.f19603f = m31902e4;
        C24558d<Double> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Double>()");
        this.f19604g = m31902e5;
        C24558d<IdentificationIngestionResult> m31902e6 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e6, "create<IdentificationIngestionResult>()");
        this.f19605h = m31902e6;
        C24558d<Integer> m31902e7 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e7, "create<Int>()");
        this.f19606i = m31902e7;
    }

    /* renamed from: A */
    public final Observable<Double> m98874A() {
        Observable<Double> hide = this.f19604g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scoreClicksSubject.hide()");
        return hide;
    }

    /* renamed from: B */
    public final Observable<Integer> m98873B() {
        Observable<Integer> hide = this.f19606i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "secondsToResultClicksSubject.hide()");
        return hide;
    }

    /* renamed from: C */
    public final Observable<Integer> m98872C() {
        Observable<Integer> hide = this.f19602e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "userAgeClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new YV1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new LS1();
    }

    /* renamed from: v */
    public final Observable<Locale> m98871v() {
        Observable<Locale> hide = this.f19600c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "countryClicksSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<IdentificationDocumentType> m98870w() {
        Observable<IdentificationDocumentType> hide = this.f19601d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "documentTypeClicksSubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Integer> m98869x() {
        Observable<Integer> hide = this.f19603f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "expirationClicksSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<IdentificationIngestionResult> m98868y() {
        Observable<IdentificationIngestionResult> hide = this.f19605h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "ingestionResultsClicksSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C42293hj4.item_selector) {
            return new C4445d(this, m41761u);
        }
        if (i != C42293hj4.item_selector_header && i != C42293hj4.item_debug_header) {
            return i == C42293hj4.item_document_type ? new C4442b(this, m41761u) : i == C42293hj4.item_debug ? new C4440a(this, m41761u) : new C29735w1(m41761u);
        }
        return new C4444c(this, m41761u);
    }
}
