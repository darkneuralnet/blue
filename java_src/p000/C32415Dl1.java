package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C32415Dl1;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\"#B\u0011\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001c\u0010\u0013\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\n0\u0010R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0018\u00010\u001aR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\n0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"LDl1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "", "LH6;", "sections", "u", "Lkotlin/Function1;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "onFilterSelected", "v", "Landroid/view/View;", "c", "Landroid/view/View;", "overlay", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/RecyclerView;", "LDl1$b;", "e", "LDl1$b;", "selectedFilterViewHolder", "f", "Lkotlin/jvm/functions/Function1;", "<init>", "(Landroid/view/View;)V", C17296a.f69688o, "b", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dl1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32415Dl1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final View f6265c;

    /* renamed from: d */
    public RecyclerView f6266d;

    /* renamed from: e */
    public C1592b f6267e;

    /* renamed from: f */
    public Function1<? super OperatorNotificationCategory, Unit> f6268f;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDl1$a;", "Lw1;", "", "position", "", "bind", "LHb2;", "b", "LHb2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDl1;Landroid/view/View;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$FilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,133:1\n18#2:134\n9#3,4:135\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$FilterViewHolder\n*L\n129#1:134\n129#1:135,4\n*E\n"})
    /* renamed from: Dl1$a */
    /* loaded from: classes3.dex */
    public final class C1590a extends C29735w1 {

        /* renamed from: b */
        public final C33262Hb2 f6269b;

        /* renamed from: c */
        public final /* synthetic */ C32415Dl1 f6270c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$FilterViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n18#2:134\n9#3,4:135\n1#4:139\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$FilterViewHolder$1\n*L\n119#1:134\n119#1:135,4\n*E\n"})
        /* renamed from: Dl1$a$a */
        /* loaded from: classes3.dex */
        public static final class C1591a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32415Dl1 f6271g;

            /* renamed from: h */
            public final /* synthetic */ C1590a f6272h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1591a(C32415Dl1 c32415Dl1, C1590a c1590a) {
                super(1);
                this.f6271g = c32415Dl1;
                this.f6272h = c1590a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                boolean isBlank;
                Object m105816c = this.f6271g.m94545o().m109397e(this.f6272h.getBindingAdapterPosition()).m105816c();
                if (!(m105816c instanceof OperatorNotificationCategory)) {
                    m105816c = null;
                }
                OperatorNotificationCategory operatorNotificationCategory = (OperatorNotificationCategory) m105816c;
                if (operatorNotificationCategory != null) {
                    Function1 function1 = this.f6271g.f6268f;
                    isBlank = StringsKt__StringsJVMKt.isBlank(operatorNotificationCategory.getCategory());
                    function1.invoke(Boolean.valueOf(isBlank ^ true).booleanValue() ? operatorNotificationCategory : null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1590a(C32415Dl1 c32415Dl1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6270c = c32415Dl1;
            C33262Hb2 m103683a = C33262Hb2.m103683a(view);
            Intrinsics.checkNotNullExpressionValue(m103683a, "bind(view)");
            this.f6269b = m103683a;
            TextView root = m103683a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C1591a(c32415Dl1, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView textView = this.f6269b.f13611b;
            Object m105816c = this.f6270c.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof OperatorNotificationCategory)) {
                m105816c = null;
            }
            OperatorNotificationCategory operatorNotificationCategory = (OperatorNotificationCategory) m105816c;
            if (operatorNotificationCategory != null) {
                str = operatorNotificationCategory.getTitle();
            }
            textView.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LDl1$b;", "Lw1;", "", "position", "", "bind", "", "visible", "b", "LFf2;", "LFf2;", "binding", "Landroid/animation/ValueAnimator;", "c", "Landroid/animation/ValueAnimator;", "overlayAnimator", "Landroid/view/View;", "view", "<init>", "(LDl1;Landroid/view/View;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,133:1\n18#2:134\n9#3,4:135\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder\n*L\n81#1:134\n81#1:135,4\n*E\n"})
    /* renamed from: Dl1$b */
    /* loaded from: classes3.dex */
    public final class C1592b extends C29735w1 {

        /* renamed from: b */
        public final C32830Ff2 f6273b;

        /* renamed from: c */
        public ValueAnimator f6274c;

        /* renamed from: d */
        public final /* synthetic */ C32415Dl1 f6275d;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1549#2:134\n1620#2,2:135\n1549#2:137\n1620#2,3:138\n1622#2:141\n*S KotlinDebug\n*F\n+ 1 FilterAdapter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/FilterAdapter$SelectedFilterViewHolder$1\n*L\n67#1:134\n67#1:135,2\n68#1:137\n68#1:138,3\n67#1:141\n*E\n"})
        /* renamed from: Dl1$b$a */
        /* loaded from: classes3.dex */
        public static final class C1593a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32415Dl1 f6276g;

            /* renamed from: h */
            public final /* synthetic */ C1592b f6277h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1593a(C32415Dl1 c32415Dl1, C1592b c1592b) {
                super(1);
                this.f6276g = c32415Dl1;
                this.f6277h = c1592b;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object first;
                Object firstOrNull;
                int collectionSizeOrDefault;
                int collectionSizeOrDefault2;
                List mutableList;
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f6276g.m94545o().m109392j());
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) ((C3023H6) first).m104410c());
                C2637G6 c2637g6 = (C2637G6) firstOrNull;
                if (c2637g6 != null) {
                    boolean z = !c2637g6.m105815d();
                    List<C3023H6> m109392j = this.f6276g.m94545o().m109392j();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m109392j, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (C3023H6 c3023h6 : m109392j) {
                        List<C2637G6> m104410c = c3023h6.m104410c();
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(m104410c, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                        for (C2637G6 c2637g62 : m104410c) {
                            arrayList2.add(C2637G6.copy$default(c2637g62, null, 0, z, 3, null));
                        }
                        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
                        arrayList.add(C3023H6.copy$default(c3023h6, mutableList, null, null, 6, null));
                    }
                    this.f6276g.mo24871u(arrayList);
                    this.f6277h.m109981b(z);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1592b(C32415Dl1 c32415Dl1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6275d = c32415Dl1;
            C32830Ff2 m106764a = C32830Ff2.m106764a(view);
            Intrinsics.checkNotNullExpressionValue(m106764a, "bind(view)");
            this.f6273b = m106764a;
            ConstraintLayout root = m106764a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C1593a(c32415Dl1, this));
        }

        /* renamed from: e */
        public static final void m109980e(C32415Dl1 this$0, ValueAnimator animator) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animator, "animator");
            View view = this$0.f6265c;
            Object animatedValue = animator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        /* renamed from: b */
        public final void m109981b(boolean z) {
            ValueAnimator duration;
            ValueAnimator valueAnimator = this.f6274c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z) {
                this.f6273b.f9929c.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, NA0.m94299e(getContext(), C48193rg4.ic_filled_carrot_up), (Drawable) null);
                RecyclerView recyclerView = this.f6275d.f6266d;
                if (recyclerView != null) {
                    recyclerView.setBackground(NA0.m94299e(getContext(), C34713Ng4.category_background));
                }
                this.f6274c = ValueAnimator.ofFloat(this.f6275d.f6265c.getAlpha(), 1.0f);
            } else {
                this.f6273b.f9929c.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, NA0.m94299e(getContext(), C48193rg4.ic_filled_carrot_down), (Drawable) null);
                RecyclerView recyclerView2 = this.f6275d.f6266d;
                if (recyclerView2 != null) {
                    recyclerView2.setBackgroundColor(NA0.m94301c(getContext(), C32364Df4.baseBG));
                }
                this.f6274c = ValueAnimator.ofFloat(this.f6275d.f6265c.getAlpha(), 0.0f);
            }
            ValueAnimator valueAnimator2 = this.f6274c;
            if (valueAnimator2 != null && (duration = valueAnimator2.setDuration(100L)) != null) {
                final C32415Dl1 c32415Dl1 = this.f6275d;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: El1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        C32415Dl1.C1592b.m109980e(C32415Dl1.this, valueAnimator3);
                    }
                });
                duration.start();
            }
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            if (!Intrinsics.areEqual(this.f6275d.f6267e, this)) {
                this.f6275d.f6267e = this;
            }
            TextView textView = this.f6273b.f9929c;
            Object m105816c = this.f6275d.m94545o().m109397e(i).m105816c();
            String str = null;
            if (!(m105816c instanceof OperatorNotificationCategory)) {
                m105816c = null;
            }
            OperatorNotificationCategory operatorNotificationCategory = (OperatorNotificationCategory) m105816c;
            if (operatorNotificationCategory != null) {
                str = operatorNotificationCategory.getTitle();
            }
            textView.setText(str);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorNotificationCategory;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/OperatorNotificationCategory;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dl1$c */
    /* loaded from: classes3.dex */
    public static final class C1594c extends Lambda implements Function1<OperatorNotificationCategory, Unit> {

        /* renamed from: g */
        public static final C1594c f6278g = new C1594c();

        public C1594c() {
            super(1);
        }

        /* renamed from: a */
        public final void m109979a(OperatorNotificationCategory operatorNotificationCategory) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorNotificationCategory operatorNotificationCategory) {
            m109979a(operatorNotificationCategory);
            return Unit.INSTANCE;
        }
    }

    public C32415Dl1(View overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.f6265c = overlay;
        this.f6268f = C1594c.f6278g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f6266d = recyclerView;
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C32883Fl1());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: u */
    public void mo24871u(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        super.mo24871u(sections);
        C1592b c1592b = this.f6267e;
        if (c1592b != null) {
            c1592b.m109981b(false);
        }
    }

    /* renamed from: v */
    public final void m109983v(Function1<? super OperatorNotificationCategory, Unit> onFilterSelected) {
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        this.f6268f = onFilterSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C48815sj4.item_selected_filter ? new C1592b(this, m41761u) : i == C48815sj4.item_filter ? new C1590a(this, m41761u) : new C29735w1(m41761u);
    }
}
