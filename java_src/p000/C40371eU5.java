package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.bottomsheet.BaseBottomSheet;
import co.bird.android.model.BottomSheetButton;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0003()\u0011B\u0007¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R0\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\n0\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R0\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\n0\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R.\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, m28432d2 = {"LeU5;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "onDetachedFromRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "w", "()Lkotlin/jvm/functions/Function1;", "A", "(Lkotlin/jvm/functions/Function1;)V", "onNameUpdated", DateTokenConverter.CONVERTER_KEY, "x", "B", "onNoteUpdated", "e", "v", "y", "onCapacityUpdated", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "Lco/bird/android/model/BottomSheetButton;", "f", "Lco/bird/android/bottomsheet/BaseBottomSheet;", "bottomSheet", "<init>", "()V", "g", C17296a.f69688o, "b", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n9#2,4:160\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter\n*L\n51#1:160,4\n*E\n"})
/* renamed from: eU5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40371eU5 extends AbstractC52206yS0 {

    /* renamed from: g */
    public static final C20048b f78433g = new C20048b(null);

    /* renamed from: c */
    public Function1<? super String, Unit> f78434c = C20055e.f78451g;

    /* renamed from: d */
    public Function1<? super String, Unit> f78435d = C20056f.f78452g;

    /* renamed from: e */
    public Function1<? super Integer, Unit> f78436e = C20054d.f78450g;

    /* renamed from: f */
    public BaseBottomSheet<BottomSheetButton> f78437f;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LeU5$a;", "Lw1;", "", "position", "", "bind", "capacity", "maxCapacity", "e", "(ILjava/lang/Integer;)V", "LHd2;", "b", "LHd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LeU5;Landroid/view/View;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n1#4:165\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder\n*L\n142#1:160\n142#1:161,4\n*E\n"})
    /* renamed from: eU5$a */
    /* loaded from: classes3.dex */
    public final class C20045a extends C29735w1 {

        /* renamed from: b */
        public final C33280Hd2 f78438b;

        /* renamed from: c */
        public final /* synthetic */ C40371eU5 f78439c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n1#2:160\n18#3:161\n9#4,4:162\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder$3\n*L\n118#1:161\n118#1:162,4\n*E\n"})
        /* renamed from: eU5$a$a */
        /* loaded from: classes3.dex */
        public static final class C20046a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40371eU5 f78441h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20046a(C40371eU5 c40371eU5) {
                super(1);
                this.f78441h = c40371eU5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C20045a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f78441h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    Integer num = (Integer) pair.component1();
                    Integer num2 = (Integer) pair.component2();
                    if (num != null) {
                        int intValue = num.intValue() + 1;
                        C20045a.this.f78438b.f13668c.setText(String.valueOf(intValue));
                        this.f78441h.m42849v().invoke(Integer.valueOf(intValue));
                        C20045a.this.m42843e(intValue, num2);
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n1#2:160\n18#3:161\n9#4,4:162\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$CapacityViewHolder$4\n*L\n130#1:161\n130#1:162,4\n*E\n"})
        /* renamed from: eU5$a$b */
        /* loaded from: classes3.dex */
        public static final class C20047b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40371eU5 f78443h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20047b(C40371eU5 c40371eU5) {
                super(1);
                this.f78443h = c40371eU5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C20045a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f78443h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof Pair)) {
                    m105816c = null;
                }
                Pair pair = (Pair) m105816c;
                if (pair != null) {
                    Integer num = (Integer) pair.component1();
                    Integer num2 = (Integer) pair.component2();
                    if (num != null) {
                        int intValue = num.intValue() - 1;
                        C20045a.this.f78438b.f13668c.setText(String.valueOf(intValue));
                        this.f78443h.m42849v().invoke(Integer.valueOf(intValue));
                        C20045a.this.m42843e(intValue, num2);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20045a(C40371eU5 c40371eU5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f78439c = c40371eU5;
            C33280Hd2 m103643a = C33280Hd2.m103643a(view);
            Intrinsics.checkNotNullExpressionValue(m103643a, "bind(view)");
            this.f78438b = m103643a;
            TextView textView = m103643a.f13672g;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            int i = C37044Xf4.activity_horizontal_margin;
            layoutParams2.setMarginStart(C40788fB0.m41774h(context, i));
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "itemView.context");
            layoutParams2.setMarginEnd(C40788fB0.m41774h(context2, i));
            textView.setLayoutParams(layoutParams2);
            ImageView imageView = m103643a.f13667b;
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            Context context3 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "itemView.context");
            layoutParams4.setMarginEnd(C40788fB0.m41774h(context3, i));
            imageView.setLayoutParams(layoutParams4);
            ImageView imageView2 = m103643a.f13667b;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.add");
            C34585Ms2.m94661j(imageView2, new C20046a(c40371eU5));
            ImageView imageView3 = m103643a.f13671f;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.subtract");
            C34585Ms2.m94661j(imageView3, new C20047b(c40371eU5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f78439c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                C40371eU5 c40371eU5 = this.f78439c;
                Integer num = (Integer) pair.component1();
                Integer num2 = (Integer) pair.component2();
                TextView textView = this.f78438b.f13668c;
                if (num != null) {
                    str = num.toString();
                }
                textView.setText(str);
                if (num != null) {
                    m42843e(num.intValue(), num2);
                    BaseBottomSheet baseBottomSheet = c40371eU5.f78437f;
                    if (baseBottomSheet != null) {
                        View itemView = this.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        baseBottomSheet.m59064n("capacity", itemView);
                    }
                }
            }
        }

        /* renamed from: e */
        public final void m42843e(int i, Integer num) {
            int i2;
            boolean z;
            ImageView imageView = this.f78438b.f13667b;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 99;
            }
            boolean z2 = false;
            if (i < Math.min(i2, 99)) {
                z = true;
            } else {
                z = false;
            }
            imageView.setEnabled(z);
            ImageView imageView2 = this.f78438b.f13671f;
            if (i > 1) {
                z2 = true;
            }
            imageView2.setEnabled(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LeU5$b;", "", "", "MAX_NEST_QUANTITY", "I", "<init>", "()V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: eU5$b */
    /* loaded from: classes3.dex */
    public static final class C20048b {
        public /* synthetic */ C20048b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20048b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LeU5$c;", "Lw1;", "", "position", "", "bind", "LJf2;", "b", "LJf2;", "binding", "Landroid/view/View;", "view", "<init>", "(LeU5;Landroid/view/View;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n18#2:160\n9#3,4:161\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder\n*L\n80#1:160\n80#1:161,4\n*E\n"})
    /* renamed from: eU5$c */
    /* loaded from: classes3.dex */
    public final class C20049c extends C29735w1 {

        /* renamed from: b */
        public final C33766Jf2 f78444b;

        /* renamed from: c */
        public final /* synthetic */ C40371eU5 f78445c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: eU5$c$a */
        /* loaded from: classes3.dex */
        public static final class C20050a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C40371eU5 f78447h;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            @SourceDebugExtension({"SMAP\nSuggestNestAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,159:1\n1#2:160\n18#3:161\n9#4,4:162\n*S KotlinDebug\n*F\n+ 1 SuggestNestAdapter.kt\nco/bird/android/feature/suggestanest/bottomsheet/adapter/SuggestNestAdapter$DetailViewHolder$1$1\n*L\n68#1:161\n68#1:162,4\n*E\n"})
            /* renamed from: eU5$c$a$a */
            /* loaded from: classes3.dex */
            public static final class C20051a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C20049c f78448g;

                /* renamed from: h */
                public final /* synthetic */ C40371eU5 f78449h;

                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: eU5$c$a$a$a */
                /* loaded from: classes3.dex */
                public /* synthetic */ class C20052a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[EnumC43929kU5.values().length];
                        try {
                            iArr[EnumC43929kU5.NAME.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[EnumC43929kU5.NOTES.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C20051a(C20049c c20049c, C40371eU5 c40371eU5) {
                    super(4);
                    this.f78448g = c20049c;
                    this.f78449h = c40371eU5;
                }

                /* renamed from: a */
                public final void m42841a(CharSequence charSequence, int i, int i2, int i3) {
                    C2637G6 m109397e;
                    Integer safePosition = this.f78448g.getSafePosition();
                    if (safePosition != null && (m109397e = this.f78449h.m94545o().m109397e(safePosition.intValue())) != null) {
                        Object m105816c = m109397e.m105816c();
                        String str = null;
                        if (!(m105816c instanceof C43336jU5)) {
                            m105816c = null;
                        }
                        C43336jU5 c43336jU5 = (C43336jU5) m105816c;
                        if (c43336jU5 != null) {
                            C40371eU5 c40371eU5 = this.f78449h;
                            int i4 = C20052a.$EnumSwitchMapping$0[c43336jU5.m30568f().ordinal()];
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    Function1<String, Unit> m42847x = c40371eU5.m42847x();
                                    if (charSequence != null) {
                                        str = charSequence.toString();
                                    }
                                    m42847x.invoke(str);
                                    return;
                                }
                                return;
                            }
                            Function1<String, Unit> m42848w = c40371eU5.m42848w();
                            if (charSequence != null) {
                                str = charSequence.toString();
                            }
                            m42848w.invoke(str);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m42841a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20050a(C40371eU5 c40371eU5) {
                super(1);
                this.f78447h = c40371eU5;
            }

            /* renamed from: a */
            public final void m42842a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C20051a(C20049c.this, this.f78447h));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m42842a(hj6);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: eU5$c$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C20053b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC43929kU5.values().length];
                try {
                    iArr[EnumC43929kU5.NAME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC43929kU5.NOTES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20049c(C40371eU5 c40371eU5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f78445c = c40371eU5;
            C33766Jf2 m100050a = C33766Jf2.m100050a(view);
            Intrinsics.checkNotNullExpressionValue(m100050a, "bind(view)");
            this.f78444b = m100050a;
            EditText editText = m100050a.f17978b;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.detail");
            C34585Ms2.m94647x(editText, new C20050a(c40371eU5));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f78445c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C43336jU5)) {
                m105816c = null;
            }
            C43336jU5 c43336jU5 = (C43336jU5) m105816c;
            if (c43336jU5 != null) {
                C40371eU5 c40371eU5 = this.f78445c;
                this.f78444b.f17981e.setText(c43336jU5.m30569e());
                this.f78444b.f17978b.setHint(c43336jU5.m30570d());
                this.f78444b.f17978b.setText(c43336jU5.m30572b());
                this.f78444b.f17978b.setEnabled(c43336jU5.m30571c());
                TextView textView = this.f78444b.f17980d;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.optionalLabel");
                C49520tu6.show$default(textView, c43336jU5.m30571c(), 0, 2, null);
                View view = this.f78444b.f17979c;
                Intrinsics.checkNotNullExpressionValue(view, "binding.editTextUnderline");
                C49520tu6.show$default(view, c43336jU5.m30571c(), 0, 2, null);
                EditText editText = this.f78444b.f17978b;
                int i2 = C20053b.$EnumSwitchMapping$0[c43336jU5.m30568f().ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    if (i2 == 2) {
                        i3 = 180225;
                    }
                } else {
                    i3 = 8193;
                }
                editText.setInputType(i3);
                BaseBottomSheet baseBottomSheet = c40371eU5.f78437f;
                if (baseBottomSheet != null) {
                    String obj = c43336jU5.m30568f().toString();
                    View itemView = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    baseBottomSheet.m59064n(obj, itemView);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eU5$d */
    /* loaded from: classes3.dex */
    public static final class C20054d extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C20054d f78450g = new C20054d();

        public C20054d() {
            super(1);
        }

        public final void invoke(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eU5$e */
    /* loaded from: classes3.dex */
    public static final class C20055e extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C20055e f78451g = new C20055e();

        public C20055e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eU5$f */
    /* loaded from: classes3.dex */
    public static final class C20056f extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C20056f f78452g = new C20056f();

        public C20056f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public final void m42851A(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f78434c = function1;
    }

    /* renamed from: B */
    public final void m42850B(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f78435d = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        ViewParent parent = recyclerView.getParent();
        if (parent != null) {
            z = parent instanceof BaseBottomSheet;
        } else {
            z = true;
        }
        if (!z) {
            parent = null;
        }
        this.f78437f = (BaseBottomSheet) parent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f78437f = null;
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C40964fU5();
    }

    /* renamed from: v */
    public final Function1<Integer, Unit> m42849v() {
        return this.f78436e;
    }

    /* renamed from: w */
    public final Function1<String, Unit> m42848w() {
        return this.f78434c;
    }

    /* renamed from: x */
    public final Function1<String, Unit> m42847x() {
        return this.f78435d;
    }

    /* renamed from: y */
    public final void m42846y(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f78436e = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35208Pj4.item_suggest_nest_detail ? new C20049c(this, m41761u) : i == C45268mk4.item_nest_size ? new C20045a(this, m41761u) : new C29735w1(m41761u);
    }
}
