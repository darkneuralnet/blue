package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireFlagNestReason;
import co.bird.android.widget.EditTextBox;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \"2\u00020\u0001:\u0004#$\u0010\u0018B\u0007¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R0\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015¨\u0006%"}, m28432d2 = {"Lm33;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/wire/WireFlagNestReason;", "c", "Lkotlin/jvm/functions/Function1;", "x", "()Lkotlin/jvm/functions/Function1;", "B", "(Lkotlin/jvm/functions/Function1;)V", "onReasonSelected", "", DateTokenConverter.CONVERTER_KEY, "w", "A", "onCommentUpdated", "e", "v", "y", "onCapacityUpdated", "<init>", "()V", "f", C17296a.f69688o, "b", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: m33  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44863m33 extends AbstractC52206yS0 {

    /* renamed from: f */
    public static final C25895c f97224f = new C25895c(null);

    /* renamed from: c */
    public Function1<? super WireFlagNestReason, Unit> f97225c = C25900g.f97245g;

    /* renamed from: d */
    public Function1<? super String, Unit> f97226d = C25899f.f97244g;

    /* renamed from: e */
    public Function1<? super Integer, Unit> f97227e = C25898e.f97243g;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lm33$a;", "Lw1;", "", "position", "", "bind", "capacity", "maxCapacity", "e", "(ILjava/lang/Integer;)V", "LHd2;", "b", "LHd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lm33;Landroid/view/View;)V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n1#4:158\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder\n*L\n137#1:153\n137#1:154,4\n*E\n"})
    /* renamed from: m33$a */
    /* loaded from: classes3.dex */
    public final class C25889a extends C29735w1 {

        /* renamed from: b */
        public final C33280Hd2 f97228b;

        /* renamed from: c */
        public final /* synthetic */ C44863m33 f97229c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n1#2:153\n18#3:154\n9#4,4:155\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$1\n*L\n113#1:154\n113#1:155,4\n*E\n"})
        /* renamed from: m33$a$a */
        /* loaded from: classes3.dex */
        public static final class C25890a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C44863m33 f97231h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25890a(C44863m33 c44863m33) {
                super(1);
                this.f97231h = c44863m33;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C25889a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f97231h.m94545o().m109397e(safePosition.intValue())) == null) {
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
                        C25889a.this.f97228b.f13668c.setText(String.valueOf(intValue));
                        this.f97231h.m26421v().invoke(Integer.valueOf(intValue));
                        C25889a.this.m26415e(intValue, num2);
                    }
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n1#2:153\n18#3:154\n9#4,4:155\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$2\n*L\n125#1:154\n125#1:155,4\n*E\n"})
        /* renamed from: m33$a$b */
        /* loaded from: classes3.dex */
        public static final class C25891b extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C44863m33 f97233h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25891b(C44863m33 c44863m33) {
                super(1);
                this.f97233h = c44863m33;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C25889a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f97233h.m94545o().m109397e(safePosition.intValue())) == null) {
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
                        C25889a.this.f97228b.f13668c.setText(String.valueOf(intValue));
                        this.f97233h.m26421v().invoke(Integer.valueOf(intValue));
                        C25889a.this.m26415e(intValue, num2);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25889a(C44863m33 c44863m33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97229c = c44863m33;
            C33280Hd2 m103643a = C33280Hd2.m103643a(view);
            Intrinsics.checkNotNullExpressionValue(m103643a, "bind(view)");
            this.f97228b = m103643a;
            ImageView imageView = m103643a.f13667b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.add");
            C34585Ms2.m94661j(imageView, new C25890a(c44863m33));
            ImageView imageView2 = m103643a.f13671f;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.subtract");
            C34585Ms2.m94661j(imageView2, new C25891b(c44863m33));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f97229c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                Integer num = (Integer) pair.component1();
                Integer num2 = (Integer) pair.component2();
                TextView textView = this.f97228b.f13668c;
                if (num != null) {
                    str = num.toString();
                }
                textView.setText(str);
                if (num != null) {
                    m26415e(num.intValue(), num2);
                }
            }
        }

        /* renamed from: e */
        public final void m26415e(int i, Integer num) {
            int i2;
            boolean z;
            ImageView imageView = this.f97228b.f13667b;
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
            ImageView imageView2 = this.f97228b.f13671f;
            if (i > 1) {
                z2 = true;
            }
            imageView2.setEnabled(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lm33$b;", "Lw1;", "", "position", "", "bind", "LJb2;", "b", "LJb2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lm33;Landroid/view/View;)V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CommentViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CommentViewHolder\n*L\n103#1:153\n103#1:154,4\n*E\n"})
    /* renamed from: m33$b */
    /* loaded from: classes3.dex */
    public final class C25892b extends C29735w1 {

        /* renamed from: b */
        public final C33730Jb2 f97234b;

        /* renamed from: c */
        public final /* synthetic */ C44863m33 f97235c;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHJ6;", "", C17296a.f69688o, "(LHJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: m33$b$a */
        /* loaded from: classes3.dex */
        public static final class C25893a extends Lambda implements Function1<HJ6, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C44863m33 f97236g;

            @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "charSequence", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "", C17296a.f69688o, "(Ljava/lang/CharSequence;III)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: m33$b$a$a */
            /* loaded from: classes3.dex */
            public static final class C25894a extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C44863m33 f97237g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C25894a(C44863m33 c44863m33) {
                    super(4);
                    this.f97237g = c44863m33;
                }

                /* renamed from: a */
                public final void m26413a(CharSequence charSequence, int i, int i2, int i3) {
                    this.f97237g.m26420w().invoke(charSequence != null ? charSequence.toString() : null);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    m26413a(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25893a(C44863m33 c44863m33) {
                super(1);
                this.f97236g = c44863m33;
            }

            /* renamed from: a */
            public final void m26414a(HJ6 textChangedListener) {
                Intrinsics.checkNotNullParameter(textChangedListener, "$this$textChangedListener");
                textChangedListener.m104030b(new C25894a(this.f97236g));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HJ6 hj6) {
                m26414a(hj6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25892b(C44863m33 c44863m33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97235c = c44863m33;
            C33730Jb2 m100132a = C33730Jb2.m100132a(view);
            Intrinsics.checkNotNullExpressionValue(m100132a, "bind(view)");
            this.f97234b = m100132a;
            EditTextBox root = m100132a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94647x(root, new C25893a(c44863m33));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            EditTextBox root = this.f97234b.getRoot();
            Object m105816c = this.f97235c.m94545o().m109397e(i).m105816c();
            if (m105816c != null) {
                z = m105816c instanceof String;
            } else {
                z = true;
            }
            if (!z) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lm33$c;", "", "", "MAX_NEST_QUANTITY", "I", "<init>", "()V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: m33$c */
    /* loaded from: classes3.dex */
    public static final class C25895c {
        public /* synthetic */ C25895c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25895c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lm33$d;", "Lw1;", "", "position", "", "bind", "LKb2;", "b", "LKb2;", "binding", "", "c", "Z", "isBinding", "Landroid/view/View;", "view", "<init>", "(Lm33;Landroid/view/View;)V", "nest-flagging_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n1#4:158\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder\n*L\n83#1:153\n83#1:154,4\n*E\n"})
    /* renamed from: m33$d */
    /* loaded from: classes3.dex */
    public final class C25896d extends C29735w1 {

        /* renamed from: b */
        public final C33964Kb2 f97238b;

        /* renamed from: c */
        public boolean f97239c;

        /* renamed from: d */
        public final /* synthetic */ C44863m33 f97240d;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,152:1\n18#2:153\n9#3,4:154\n1#4:158\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$ReasonViewHolder$1\n*L\n65#1:153\n65#1:154,4\n*E\n"})
        /* renamed from: m33$d$a */
        /* loaded from: classes3.dex */
        public static final class C25897a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C44863m33 f97242h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25897a(C44863m33 c44863m33) {
                super(2);
                this.f97242h = c44863m33;
            }

            /* renamed from: a */
            public final void m26410a(CompoundButton compoundButton, boolean z) {
                WireFlagNestReason wireFlagNestReason;
                C25896d.this.f97238b.getRoot().setEnabled(!z);
                if (!C25896d.this.f97239c && z) {
                    Object m105816c = this.f97242h.m94545o().m109397e(C25896d.this.getBindingAdapterPosition()).m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair != null && (wireFlagNestReason = (WireFlagNestReason) pair.getFirst()) != null) {
                        C44863m33 c44863m33 = this.f97242h;
                        if (!wireFlagNestReason.getRequiresComment()) {
                            c44863m33.m26420w().invoke(null);
                        }
                        if (!Intrinsics.areEqual(wireFlagNestReason.getCode(), WireFlagNestReason.INCORRECT_NEST_SIZE_CODE)) {
                            c44863m33.m26421v().invoke(null);
                        }
                        this.f97242h.m26419x().invoke(wireFlagNestReason);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m26410a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25896d(C44863m33 c44863m33, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f97240d = c44863m33;
            C33964Kb2 m98713a = C33964Kb2.m98713a(view);
            Intrinsics.checkNotNullExpressionValue(m98713a, "bind(view)");
            this.f97238b = m98713a;
            CheckBox root = m98713a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94663h(root, new C25897a(c44863m33));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            this.f97239c = true;
            Object m105816c = this.f97240d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f97238b.getRoot().setText(((WireFlagNestReason) pair.component1()).getTitle());
                this.f97238b.getRoot().setChecked(booleanValue);
            }
            this.f97239c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m33$e */
    /* loaded from: classes3.dex */
    public static final class C25898e extends Lambda implements Function1<Integer, Unit> {

        /* renamed from: g */
        public static final C25898e f97243g = new C25898e();

        public C25898e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m33$f */
    /* loaded from: classes3.dex */
    public static final class C25899f extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        public static final C25899f f97244g = new C25899f();

        public C25899f() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlagNestReason;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFlagNestReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m33$g */
    /* loaded from: classes3.dex */
    public static final class C25900g extends Lambda implements Function1<WireFlagNestReason, Unit> {

        /* renamed from: g */
        public static final C25900g f97245g = new C25900g();

        public C25900g() {
            super(1);
        }

        /* renamed from: a */
        public final void m26409a(WireFlagNestReason it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireFlagNestReason wireFlagNestReason) {
            m26409a(wireFlagNestReason);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public final void m26423A(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f97226d = function1;
    }

    /* renamed from: B */
    public final void m26422B(Function1<? super WireFlagNestReason, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f97225c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C46642p33());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C45456n33();
    }

    /* renamed from: v */
    public final Function1<Integer, Unit> m26421v() {
        return this.f97227e;
    }

    /* renamed from: w */
    public final Function1<String, Unit> m26420w() {
        return this.f97226d;
    }

    /* renamed from: x */
    public final Function1<WireFlagNestReason, Unit> m26419x() {
        return this.f97225c;
    }

    /* renamed from: y */
    public final void m26418y(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f97227e = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C47630qj4.item_flag_reason ? new C25896d(this, m41761u) : i == C47630qj4.item_flag_comment ? new C25892b(this, m41761u) : i == C45268mk4.item_nest_size ? new C25889a(this, m41761u) : new C29735w1(m41761u);
    }
}
