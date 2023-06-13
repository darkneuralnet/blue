package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ComplaintResolutionField;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.ComplaintIssueOption;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52438yq0;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\t./\u001c\u001f!#\u0006&(B\u0007¢\u0006\u0004\b,\u0010-J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0002J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00030\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00050\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00050\u00050\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR:\u0010$\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n \u001b*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b0\b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\"\u0010%\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000e0\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\"\u0010'\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\f0\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001dR\"\u0010)\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\f0\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001dR\"\u0010+\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\f0\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001d¨\u00060"}, m28432d2 = {"Lyq0;", "LyS0;", "Lio/reactivex/Observable;", "Lga2;", "w", "Lco/bird/android/model/constant/ComplaintResolutionField;", "g", "A", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;", "", "x", "", "v", "", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "y", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "issueCategorySubject", DateTokenConverter.CONVERTER_KEY, "addPhotoClicksSubject", "e", "removePhotoClicksSubject", "f", "issuesUpdatedSubject", "scanVehiclesSubject", "h", "vehicleRemovedSubject", "i", "actionTakenSubject", "j", "notesSubject", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yq0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52438yq0 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<EnumC41608ga2> f120241c;

    /* renamed from: d */
    public final C24558d<ComplaintResolutionField> f120242d;

    /* renamed from: e */
    public final C24558d<ComplaintResolutionField> f120243e;

    /* renamed from: f */
    public final C24558d<Pair<ComplaintIssueOption, Boolean>> f120244f;

    /* renamed from: g */
    public final C24558d<Unit> f120245g;

    /* renamed from: h */
    public final C24558d<String> f120246h;

    /* renamed from: i */
    public final C24558d<String> f120247i;

    /* renamed from: j */
    public final C24558d<String> f120248j;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lyq0$a;", "Lw1;", "", "position", "", "bind", "LJa2;", "b", "LJa2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ActionTakenViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n1549#4:265\n1620#4,3:266\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ActionTakenViewHolder\n*L\n145#1:260\n145#1:261,4\n146#1:265\n146#1:266,3\n*E\n"})
    /* renamed from: yq0$a */
    /* loaded from: classes3.dex */
    public final class C30714a extends C29735w1 {

        /* renamed from: b */
        public final C33721Ja2 f120249b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30714a(final C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120250c = c52438yq0;
            C33721Ja2 m100184a = C33721Ja2.m100184a(view);
            Intrinsics.checkNotNullExpressionValue(m100184a, "bind(view)");
            this.f120249b = m100184a;
            m100184a.getRoot().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: xq0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    C52438yq0.C30714a.m2478b(C52438yq0.this, radioGroup, i);
                }
            });
        }

        /* renamed from: b */
        public static final void m2478b(C52438yq0 this$0, RadioGroup radioGroup, int i) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            C24558d c24558d = this$0.f120247i;
            Object tag = ((RadioButton) radioGroup.findViewById(i)).getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
            c24558d.onNext((String) tag);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            int collectionSizeOrDefault;
            super.bind(i);
            Object m105816c = this.f120250c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof List)) {
                m105816c = null;
            }
            List list = (List) m105816c;
            if (list != null) {
                List<ComplaintIssueOption> list2 = list;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (ComplaintIssueOption complaintIssueOption : list2) {
                    RadioButton root = C33955Ka2.m98725c(C40788fB0.m41772j(getContext()), this.f120249b.getRoot(), false).getRoot();
                    root.setText(complaintIssueOption.getLabel());
                    root.setTag(complaintIssueOption.getValue());
                    Intrinsics.checkNotNullExpressionValue(root, "inflate(context.layoutIn… option.value\n          }");
                    this.f120249b.getRoot().addView(root);
                    arrayList.add(Unit.INSTANCE);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lyq0$b;", "Lw1;", "LMa2;", "b", "LMa2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: yq0$b */
    /* loaded from: classes3.dex */
    public final class C30715b extends C29735w1 {

        /* renamed from: b */
        public final C34423Ma2 f120251b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120252c;

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"yq0$b$a", "Ld36;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: yq0$b$a */
        /* loaded from: classes3.dex */
        public static final class C30716a extends C39530d36 {

            /* renamed from: b */
            public final /* synthetic */ C52438yq0 f120253b;

            public C30716a(C52438yq0 c52438yq0) {
                this.f120253b = c52438yq0;
            }

            @Override // p000.C39530d36, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
                this.f120253b.f120248j.onNext(s.toString());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30715b(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120252c = c52438yq0;
            C34423Ma2 m95160a = C34423Ma2.m95160a(view);
            Intrinsics.checkNotNullExpressionValue(m95160a, "bind(view)");
            this.f120251b = m95160a;
            m95160a.f23256b.addTextChangedListener(new C30716a(c52438yq0));
            m95160a.f23256b.setBackground(NA0.m94299e(getContext(), C33309Hg4.frame_rectangle_border_rounded_transparent));
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lyq0$c;", "Lw1;", "", "position", "", "bind", "Lwb2;", "b", "Lwb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$HeaderViewHolder\n*L\n231#1:260\n231#1:261,4\n*E\n"})
    /* renamed from: yq0$c */
    /* loaded from: classes3.dex */
    public final class C30717c extends C29735w1 {

        /* renamed from: b */
        public final C51104wb2 f120254b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30717c(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120255c = c52438yq0;
            C51104wb2 m6617a = C51104wb2.m6617a(view);
            Intrinsics.checkNotNullExpressionValue(m6617a, "bind(view)");
            this.f120254b = m6617a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f120255c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof IH1)) {
                m105816c = null;
            }
            IH1 ih1 = (IH1) m105816c;
            if (ih1 != null) {
                TextView textView = this.f120254b.f116241d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
                C49520tu6.setTextAndVisibility$default(textView, ih1.m102622d(), 0, 2, null);
                TextView textView2 = this.f120254b.f116239b;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.body");
                C49520tu6.setTextAndVisibility$default(textView2, ih1.m102624b(), 0, 2, null);
                ImageView imageView = this.f120254b.f116240c;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.mainImage");
                C49520tu6.show$default(imageView, ih1.m102623c(), 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lyq0$d;", "Lw1;", "", "position", "", "bind", "Lnb2;", "b", "Lnb2;", "binding", "Lga2;", "c", "Lga2;", "category", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueCategoryViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueCategoryViewHolder\n*L\n251#1:260\n251#1:261,4\n*E\n"})
    /* renamed from: yq0$d */
    /* loaded from: classes3.dex */
    public final class C30718d extends C29735w1 {

        /* renamed from: b */
        public final C45769nb2 f120256b;

        /* renamed from: c */
        public EnumC41608ga2 f120257c;

        /* renamed from: d */
        public final /* synthetic */ C52438yq0 f120258d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yq0$d$a */
        /* loaded from: classes3.dex */
        public static final class C30719a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52438yq0 f120259g;

            /* renamed from: h */
            public final /* synthetic */ C30718d f120260h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30719a(C52438yq0 c52438yq0, C30718d c30718d) {
                super(1);
                this.f120259g = c52438yq0;
                this.f120260h = c30718d;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C24558d c24558d = this.f120259g.f120241c;
                EnumC41608ga2 enumC41608ga2 = this.f120260h.f120257c;
                if (enumC41608ga2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("category");
                    enumC41608ga2 = null;
                }
                c24558d.onNext(enumC41608ga2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30718d(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120258d = c52438yq0;
            C45769nb2 m23488a = C45769nb2.m23488a(view);
            Intrinsics.checkNotNullExpressionValue(m23488a, "bind(view)");
            this.f120256b = m23488a;
            MaterialCardView root = m23488a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C30719a(c52438yq0, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f120258d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof EnumC41608ga2)) {
                m105816c = null;
            }
            EnumC41608ga2 enumC41608ga2 = (EnumC41608ga2) m105816c;
            if (enumC41608ga2 != null) {
                this.f120256b.f100169d.setText(getContext().getString(enumC41608ga2.m39151c()));
                this.f120256b.f100168c.setImageDrawable(NA0.m94299e(getContext(), enumC41608ga2.m39152b()));
                this.f120257c = enumC41608ga2;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lyq0$e;", "Lw1;", "", "position", "", "bind", "Lzc2;", "b", "Lzc2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n1#4:265\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueViewHolder\n*L\n207#1:260\n207#1:261,4\n*E\n"})
    /* renamed from: yq0$e */
    /* loaded from: classes3.dex */
    public final class C30720e extends C29735w1 {

        /* renamed from: b */
        public final C52893zc2 f120261b;

        /* renamed from: c */
        public boolean f120262c;

        /* renamed from: d */
        public final /* synthetic */ C52438yq0 f120263d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n1#2:260\n18#3:261\n9#4,4:262\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$IssueViewHolder$1\n*L\n199#1:261\n199#1:262,4\n*E\n"})
        /* renamed from: yq0$e$a */
        /* loaded from: classes3.dex */
        public static final class C30721a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C52438yq0 f120265h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30721a(C52438yq0 c52438yq0) {
                super(2);
                this.f120265h = c52438yq0;
            }

            /* renamed from: a */
            public final void m2475a(CompoundButton compoundButton, boolean z) {
                Integer safePosition;
                C2637G6 m109397e;
                ComplaintIssueOption complaintIssueOption;
                if (!C30720e.this.f120262c && (safePosition = C30720e.this.getSafePosition()) != null && (m109397e = this.f120265h.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair != null && (complaintIssueOption = (ComplaintIssueOption) pair.getFirst()) != null) {
                        this.f120265h.f120244f.onNext(TuplesKt.m28425to(complaintIssueOption, Boolean.valueOf(z)));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m2475a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30720e(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120263d = c52438yq0;
            C52893zc2 m1021a = C52893zc2.m1021a(view);
            Intrinsics.checkNotNullExpressionValue(m1021a, "bind(view)");
            this.f120261b = m1021a;
            CheckBox root = m1021a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94663h(root, new C30721a(c52438yq0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f120262c = true;
            Object m105816c = this.f120263d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f120261b.getRoot().setText(((ComplaintIssueOption) pair.component1()).getLabel());
                this.f120261b.getRoot().setChecked(booleanValue);
            }
            this.f120262c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lyq0$f;", "Lw1;", "", "position", "", "bind", "Lvf2;", "b", "Lvf2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ScanVehiclesViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ScanVehiclesViewHolder\n*L\n130#1:260\n130#1:261,4\n*E\n"})
    /* renamed from: yq0$f */
    /* loaded from: classes3.dex */
    public final class C30722f extends C29735w1 {

        /* renamed from: b */
        public final C50551vf2 f120266b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120267c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yq0$f$a */
        /* loaded from: classes3.dex */
        public static final class C30723a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52438yq0 f120268g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30723a(C52438yq0 c52438yq0) {
                super(1);
                this.f120268g = c52438yq0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                this.f120268g.f120245g.onNext(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30722f(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120267c = c52438yq0;
            C50551vf2 m8274a = C50551vf2.m8274a(view);
            Intrinsics.checkNotNullExpressionValue(m8274a, "bind(view)");
            this.f120266b = m8274a;
            Button root = m8274a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C30723a(c52438yq0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Button root = this.f120266b.getRoot();
            Object m105816c = this.f120267c.m94545o().m109397e(i).m105816c();
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

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lyq0$g;", "Lw1;", "", "position", "", "bind", "Lxb2;", "b", "Lxb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$SectionHeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$SectionHeaderViewHolder\n*L\n220#1:260\n220#1:261,4\n*E\n"})
    /* renamed from: yq0$g */
    /* loaded from: classes3.dex */
    public final class C30724g extends C29735w1 {

        /* renamed from: b */
        public final C51697xb2 f120269b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30724g(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120270c = c52438yq0;
            C51697xb2 m4967a = C51697xb2.m4967a(view);
            Intrinsics.checkNotNullExpressionValue(m4967a, "bind(view)");
            this.f120269b = m4967a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f120270c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C34804Nq5)) {
                m105816c = null;
            }
            C34804Nq5 c34804Nq5 = (C34804Nq5) m105816c;
            if (c34804Nq5 != null) {
                this.f120269b.f117841b.setText(c34804Nq5.m93286b());
                TextView textView = this.f120269b.f117842c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.required");
                C49520tu6.show$default(textView, c34804Nq5.m93285c(), 0, 2, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lyq0$h;", "Lw1;", "", "position", "", "bind", "LMf2;", "b", "LMf2;", "binding", "Lco/bird/android/model/constant/ComplaintResolutionField;", "c", "Lco/bird/android/model/constant/ComplaintResolutionField;", "field", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$TakePhotoViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$TakePhotoViewHolder\n*L\n173#1:260\n173#1:261,4\n*E\n"})
    /* renamed from: yq0$h */
    /* loaded from: classes3.dex */
    public final class C30725h extends C29735w1 {

        /* renamed from: b */
        public final C34468Mf2 f120271b;

        /* renamed from: c */
        public ComplaintResolutionField f120272c;

        /* renamed from: d */
        public final /* synthetic */ C52438yq0 f120273d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yq0$h$a */
        /* loaded from: classes3.dex */
        public static final class C30726a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52438yq0 f120274g;

            /* renamed from: h */
            public final /* synthetic */ C30725h f120275h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30726a(C52438yq0 c52438yq0, C30725h c30725h) {
                super(1);
                this.f120274g = c52438yq0;
                this.f120275h = c30725h;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C24558d c24558d = this.f120274g.f120242d;
                ComplaintResolutionField complaintResolutionField = this.f120275h.f120272c;
                if (complaintResolutionField == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("field");
                    complaintResolutionField = null;
                }
                c24558d.onNext(complaintResolutionField);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yq0$h$b */
        /* loaded from: classes3.dex */
        public static final class C30727b extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C52438yq0 f120276g;

            /* renamed from: h */
            public final /* synthetic */ C30725h f120277h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30727b(C52438yq0 c52438yq0, C30725h c30725h) {
                super(1);
                this.f120276g = c52438yq0;
                this.f120277h = c30725h;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C24558d c24558d = this.f120276g.f120243e;
                ComplaintResolutionField complaintResolutionField = this.f120277h.f120272c;
                if (complaintResolutionField == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("field");
                    complaintResolutionField = null;
                }
                c24558d.onNext(complaintResolutionField);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30725h(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120273d = c52438yq0;
            C34468Mf2 m95082a = C34468Mf2.m95082a(view);
            Intrinsics.checkNotNullExpressionValue(m95082a, "bind(view)");
            this.f120271b = m95082a;
            ConstraintLayout root = m95082a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C30726a(c52438yq0, this));
            ImageView imageView = m95082a.f23369c;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.closeIcon");
            C34585Ms2.m94661j(imageView, new C30727b(c52438yq0, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            AbstractC33662It6<ImageView, Drawable> abstractC33662It6;
            super.bind(i);
            Object m105816c = this.f120273d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof AY5)) {
                m105816c = null;
            }
            AY5 ay5 = (AY5) m105816c;
            if (ay5 != null) {
                this.f120271b.f23370d.setText(ay5.m115559c());
                TextView textView = this.f120271b.f23372f;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.required");
                C49520tu6.show$default(textView, ay5.m115558d(), 0, 2, null);
                ImageView imageView = this.f120271b.f23368b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.cameraIcon");
                boolean z2 = true;
                if (ay5.m115557e() == null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(imageView, z, 0, 2, null);
                ImageView imageView2 = this.f120271b.f23369c;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.closeIcon");
                if (ay5.m115557e() == null) {
                    z2 = false;
                }
                C49520tu6.show$default(imageView2, z2, 0, 2, null);
                String m115557e = ay5.m115557e();
                if (m115557e != null) {
                    abstractC33662It6 = ComponentCallbacks2C17096a.m53138t(getContext()).m81653k(m115557e).mo16086d(new YI4().m97561f()).m16096R0(this.f120271b.f23371e);
                } else {
                    abstractC33662It6 = null;
                }
                if (abstractC33662It6 == null) {
                    this.f120271b.f23371e.setImageDrawable(null);
                }
                this.f120272c = ay5.m115560b();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lyq0$i;", "Lw1;", "", "position", "", "bind", "Lyb2;", "b", "Lyb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lyq0;Landroid/view/View;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$VehicleInvolvedViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$VehicleInvolvedViewHolder\n*L\n100#1:260\n100#1:261,4\n*E\n"})
    /* renamed from: yq0$i */
    /* loaded from: classes3.dex */
    public final class C30728i extends C29735w1 {

        /* renamed from: b */
        public final C52290yb2 f120278b;

        /* renamed from: c */
        public final /* synthetic */ C52438yq0 f120279c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$VehicleInvolvedViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,259:1\n1#2:260\n18#3:261\n9#4,4:262\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$VehicleInvolvedViewHolder$1\n*L\n93#1:261\n93#1:262,4\n*E\n"})
        /* renamed from: yq0$i$a */
        /* loaded from: classes3.dex */
        public static final class C30729a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C52438yq0 f120281h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30729a(C52438yq0 c52438yq0) {
                super(1);
                this.f120281h = c52438yq0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                String id;
                Integer safePosition = C30728i.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f120281h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Bird)) {
                    m105816c = null;
                }
                Bird bird = (Bird) m105816c;
                if (bird == null || (id = bird.getId()) == null) {
                    return;
                }
                this.f120281h.f120246h.onNext(id);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30728i(C52438yq0 c52438yq0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f120279c = c52438yq0;
            C52290yb2 m3206a = C52290yb2.m3206a(view);
            Intrinsics.checkNotNullExpressionValue(m3206a, "bind(view)");
            this.f120278b = m3206a;
            ImageView imageView = m3206a.f119799d;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.remove");
            C34585Ms2.m94661j(imageView, new C30729a(c52438yq0));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            super.bind(i);
            Object m105816c = this.f120279c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Bird)) {
                m105816c = null;
            }
            Bird bird = (Bird) m105816c;
            if (bird != null) {
                this.f120278b.f119797b.setText(bird.getCode());
            }
        }
    }

    public C52438yq0() {
        C24558d<EnumC41608ga2> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<IssueCategory>()");
        this.f120241c = m31902e;
        C24558d<ComplaintResolutionField> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<ComplaintResolutionField>()");
        this.f120242d = m31902e2;
        C24558d<ComplaintResolutionField> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<ComplaintResolutionField>()");
        this.f120243e = m31902e3;
        C24558d<Pair<ComplaintIssueOption, Boolean>> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Pair<ComplaintIssueOption, Boolean>>()");
        this.f120244f = m31902e4;
        C24558d<Unit> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<Unit>()");
        this.f120245g = m31902e5;
        C24558d<String> m31902e6 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e6, "create<String>()");
        this.f120246h = m31902e6;
        C24558d<String> m31902e7 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e7, "create<String>()");
        this.f120247i = m31902e7;
        C24558d<String> m31902e8 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e8, "create<String>()");
        this.f120248j = m31902e8;
    }

    /* renamed from: A */
    public final Observable<ComplaintResolutionField> m2487A() {
        Observable<ComplaintResolutionField> hide = this.f120243e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "removePhotoClicksSubject.hide()");
        return hide;
    }

    /* renamed from: B */
    public final Observable<Unit> m2486B() {
        Observable<Unit> hide = this.f120245g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "scanVehiclesSubject.hide()");
        return hide;
    }

    /* renamed from: C */
    public final Observable<String> m2485C() {
        Observable<String> hide = this.f120246h.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "vehicleRemovedSubject.hide()");
        return hide;
    }

    /* renamed from: g */
    public final Observable<ComplaintResolutionField> m2484g() {
        Observable<ComplaintResolutionField> hide = this.f120242d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "addPhotoClicksSubject.hide()");
        return hide;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C53031zq0();
    }

    /* renamed from: v */
    public final Observable<String> m2483v() {
        Observable<String> hide = this.f120247i.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "actionTakenSubject.hide()");
        return hide;
    }

    /* renamed from: w */
    public final Observable<EnumC41608ga2> m2482w() {
        Observable<EnumC41608ga2> hide = this.f120241c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issueCategorySubject.hide()");
        return hide;
    }

    /* renamed from: x */
    public final Observable<Pair<ComplaintIssueOption, Boolean>> m2481x() {
        Observable<Pair<ComplaintIssueOption, Boolean>> hide = this.f120244f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "issuesUpdatedSubject.hide()");
        return hide;
    }

    /* renamed from: y */
    public final Observable<String> m2480y() {
        Observable<String> hide = this.f120248j.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "notesSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C36603Vi4.item_category ? new C30718d(this, m41761u) : i == C36603Vi4.item_complaint_section_header ? new C30724g(this, m41761u) : i == C36603Vi4.item_complaint_resolution_header ? new C30717c(this, m41761u) : i == C36603Vi4.item_issue ? new C30720e(this, m41761u) : i == C36603Vi4.item_take_photo ? new C30725h(this, m41761u) : i == C36603Vi4.item_action_taken ? new C30714a(this, m41761u) : i == C36603Vi4.item_scan_vehicles ? new C30722f(this, m41761u) : i == C36603Vi4.item_additional_notes ? new C30715b(this, m41761u) : i == C36603Vi4.item_complaint_vehicle_involved ? new C30728i(this, m41761u) : new C29735w1(m41761u);
    }
}
