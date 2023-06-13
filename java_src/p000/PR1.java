package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.schedulers.C24542a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.PR1;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R4\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R4\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001e\u0010%\u001a\f\u0012\b\u0012\u00060\"R\u00020\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006*"}, m28432d2 = {"LPR1;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lkotlin/Function1;", "", "Lco/bird/android/model/IdToolOption;", "c", "Lkotlin/jvm/functions/Function1;", "v", "()Lkotlin/jvm/functions/Function1;", "y", "(Lkotlin/jvm/functions/Function1;)V", "onAssociateClicks", DateTokenConverter.CONVERTER_KEY, "x", "B", "onDissociateClicks", "Lco/bird/android/model/persistence/BrainSwapRecord;", "e", "w", "A", "onBrainSwapRecordClicks", "", "LPR1$a;", "f", "Ljava/util/Set;", "visibleBrainSwapVH", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PR1 */
/* loaded from: classes3.dex */
public final class PR1 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super List<? extends IdToolOption>, Unit> f28465c = C6359c.f28477g;

    /* renamed from: d */
    public Function1<? super List<? extends IdToolOption>, Unit> f28466d = C6363f.f28482g;

    /* renamed from: e */
    public Function1<? super BrainSwapRecord, Unit> f28467e = C6362e.f28481g;

    /* renamed from: f */
    public final Set<C6355a> f28468f = new LinkedHashSet();

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LPR1$a;", "Lw1;", "", "position", "", "bind", "onAttachedToWindow", "onDetachedFromWindow", "Lco/bird/android/model/persistence/BrainSwapRecord;", "record", C17296a.f69688o, "Lrc2;", "b", "Lrc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LPR1;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n18#2:164\n18#2:170\n9#3,4:165\n9#3,4:171\n1#4:169\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder\n*L\n114#1:164\n153#1:170\n114#1:165,4\n153#1:171,4\n*E\n"})
    /* renamed from: PR1$a */
    /* loaded from: classes3.dex */
    public final class C6355a extends C29735w1 {

        /* renamed from: b */
        public final C48151rc2 f28469b;

        /* renamed from: c */
        public final /* synthetic */ PR1 f28470c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,163:1\n1#2:164\n18#3:165\n9#4,4:166\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$BrainSwapRecordViewHolder$1\n*L\n108#1:165\n108#1:166,4\n*E\n"})
        /* renamed from: PR1$a$a */
        /* loaded from: classes3.dex */
        public static final class C6356a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ PR1 f28472h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6356a(PR1 pr1) {
                super(1);
                this.f28472h = pr1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C6355a.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f28472h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof BrainSwapRecord)) {
                    m105816c = null;
                }
                BrainSwapRecord brainSwapRecord = (BrainSwapRecord) m105816c;
                if (brainSwapRecord != null) {
                    this.f28472h.m90297w().invoke(brainSwapRecord);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6355a(PR1 pr1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28470c = pr1;
            C48151rc2 m15701a = C48151rc2.m15701a(view);
            Intrinsics.checkNotNullExpressionValue(m15701a, "bind(view)");
            this.f28469b = m15701a;
            ConstraintLayout root = m15701a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C6356a(pr1));
        }

        /* renamed from: b */
        public static /* synthetic */ void m90293b(C6355a c6355a, BrainSwapRecord brainSwapRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                brainSwapRecord = null;
            }
            c6355a.m90294a(brainSwapRecord);
        }

        /* renamed from: a */
        public final void m90294a(BrainSwapRecord brainSwapRecord) {
            String elapsedTime$default;
            C2637G6 m109397e;
            if (brainSwapRecord == null) {
                Integer safePosition = getSafePosition();
                if (safePosition != null && (m109397e = this.f28470c.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    if (!(m105816c instanceof BrainSwapRecord)) {
                        m105816c = null;
                    }
                    brainSwapRecord = (BrainSwapRecord) m105816c;
                } else {
                    brainSwapRecord = null;
                }
                if (brainSwapRecord == null) {
                    return;
                }
            }
            TextView textView = this.f28469b.f107315d;
            if (Intrinsics.areEqual(brainSwapRecord.getStatus(), Boolean.TRUE)) {
                elapsedTime$default = getContext().getString(C45871nl4.completed);
            } else {
                elapsedTime$default = C46880pT0.getElapsedTime$default(brainSwapRecord.getCreatedAt(), getContext(), false, 2, null);
            }
            textView.setText(elapsedTime$default);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Drawable m94299e;
            int m94301c;
            Object m105816c = this.f28470c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof BrainSwapRecord)) {
                m105816c = null;
            }
            BrainSwapRecord brainSwapRecord = (BrainSwapRecord) m105816c;
            if (brainSwapRecord != null) {
                this.f28469b.f107314c.setText(brainSwapRecord.getBirdCode());
                m90294a(brainSwapRecord);
                Boolean status = brainSwapRecord.getStatus();
                if (Intrinsics.areEqual(status, Boolean.TRUE)) {
                    m94299e = NA0.m94299e(getContext(), C48193rg4.ic_filled_check_circle);
                    m94301c = NA0.m94301c(getContext(), C32364Df4.birdGreen);
                } else if (Intrinsics.areEqual(status, Boolean.FALSE)) {
                    m94299e = NA0.m94299e(getContext(), C48193rg4.ic_filled_x_circle);
                    m94301c = NA0.m94301c(getContext(), C32364Df4.birdRed);
                } else {
                    m94299e = NA0.m94299e(getContext(), C48193rg4.ic_filled_dash_circle);
                    m94301c = NA0.m94301c(getContext(), C32364Df4.secondaryBG);
                }
                this.f28469b.f107316e.setImageDrawable(m94299e);
                this.f28469b.f107316e.setImageTintList(ColorStateList.valueOf(m94301c));
            }
        }

        @Override // p000.C29735w1
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f28470c.f28468f.add(this);
        }

        @Override // p000.C29735w1
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f28470c.f28468f.remove(this);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LPR1$b;", "Lw1;", "", "position", "", "bind", "Lqc2;", "b", "Lqc2;", "binding", "Landroid/view/View;", "view", "<init>", "(LPR1;Landroid/view/View;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n18#2:164\n9#3,4:165\n1#4:169\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder\n*L\n96#1:164\n96#1:165,4\n*E\n"})
    /* renamed from: PR1$b */
    /* loaded from: classes3.dex */
    public final class C6357b extends C29735w1 {

        /* renamed from: b */
        public final C47558qc2 f28473b;

        /* renamed from: c */
        public final /* synthetic */ PR1 f28474c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,163:1\n1#2:164\n18#3:165\n9#4,4:166\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder$1\n*L\n84#1:165\n84#1:166,4\n*E\n"})
        /* renamed from: PR1$b$a */
        /* loaded from: classes3.dex */
        public static final class C6358a extends Lambda implements Function1<View, Unit> {

            /* renamed from: h */
            public final /* synthetic */ PR1 f28476h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6358a(PR1 pr1) {
                super(1);
                this.f28476h = pr1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                C2637G6 m109397e;
                Integer safePosition = C6357b.this.getSafePosition();
                if (safePosition == null || (m109397e = this.f28476h.m94545o().m109397e(safePosition.intValue())) == null) {
                    return;
                }
                Object m105816c = m109397e.m105816c();
                if (!(m105816c instanceof FS1)) {
                    m105816c = null;
                }
                FS1 fs1 = (FS1) m105816c;
                if (fs1 != null) {
                    PR1 pr1 = this.f28476h;
                    if (fs1.m107137d() == GS1.ASSOCIATE) {
                        pr1.m90298v().invoke(fs1.m107138c());
                    } else {
                        pr1.m90296x().invoke(fs1.m107138c());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6357b(PR1 pr1, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f28474c = pr1;
            C47558qc2 m17325a = C47558qc2.m17325a(view);
            Intrinsics.checkNotNullExpressionValue(m17325a, "bind(view)");
            this.f28473b = m17325a;
            TextView root = m17325a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C6358a(pr1));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f28474c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof FS1)) {
                m105816c = null;
            }
            FS1 fs1 = (FS1) m105816c;
            if (fs1 != null) {
                this.f28473b.getRoot().setText(fs1.m107140a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/IdToolOption;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PR1$c */
    /* loaded from: classes3.dex */
    public static final class C6359c extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        /* renamed from: g */
        public static final C6359c f28477g = new C6359c();

        public C6359c() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"PR1$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$onAttachedToRecyclerView$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,163:1\n41#2:164\n180#3:165\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$onAttachedToRecyclerView$1\n*L\n59#1:164\n59#1:165\n*E\n"})
    /* renamed from: PR1$d */
    /* loaded from: classes3.dex */
    public static final class View$OnAttachStateChangeListenerC6360d implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ RecyclerView f28478b;

        /* renamed from: c */
        public final /* synthetic */ PR1 f28479c;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Ljava/lang/Long;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$onAttachedToRecyclerView$1$onViewAttachedToWindow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1855#2,2:164\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$onAttachedToRecyclerView$1$onViewAttachedToWindow$1\n*L\n61#1:164,2\n*E\n"})
        /* renamed from: PR1$d$a */
        /* loaded from: classes3.dex */
        public static final class C6361a extends Lambda implements Function1<Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ PR1 f28480g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6361a(PR1 pr1) {
                super(1);
                this.f28480g = pr1;
            }

            /* renamed from: a */
            public final void m90290a(Long l) {
                for (C6355a c6355a : this.f28480g.f28468f) {
                    C6355a.m90293b(c6355a, null, 1, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                m90290a(l);
                return Unit.INSTANCE;
            }
        }

        public View$OnAttachStateChangeListenerC6360d(RecyclerView recyclerView, PR1 pr1) {
            this.f28478b = recyclerView;
            this.f28479c = pr1;
        }

        /* renamed from: b */
        public static final void m90291b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            Observable<Long> observeOn = Observable.interval(1L, TimeUnit.SECONDS).subscribeOn(C24542a.m31934a()).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn, "interval(1, TimeUnit.SEC…dSchedulers.mainThread())");
            ScopeProvider m45202a = ViewScopeProvider.m45202a(this.f28478b);
            Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
            Object m33094as = observeOn.m33094as(AutoDispose.m45239a(m45202a));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C6361a c6361a = new C6361a(this.f28479c);
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: QR1
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    PR1.View$OnAttachStateChangeListenerC6360d.m90291b(Function1.this, obj);
                }
            });
            this.f28478b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/BrainSwapRecord;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BrainSwapRecord;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: PR1$e */
    /* loaded from: classes3.dex */
    public static final class C6362e extends Lambda implements Function1<BrainSwapRecord, Unit> {

        /* renamed from: g */
        public static final C6362e f28481g = new C6362e();

        public C6362e() {
            super(1);
        }

        /* renamed from: a */
        public final void m90289a(BrainSwapRecord it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BrainSwapRecord brainSwapRecord) {
            m90289a(brainSwapRecord);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/IdToolOption;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: PR1$f */
    /* loaded from: classes3.dex */
    public static final class C6363f extends Lambda implements Function1<List<? extends IdToolOption>, Unit> {

        /* renamed from: g */
        public static final C6363f f28482g = new C6363f();

        public C6363f() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends IdToolOption> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends IdToolOption> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public final void m90300A(Function1<? super BrainSwapRecord, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f28467e = function1;
    }

    /* renamed from: B */
    public final void m90299B(Function1<? super List<? extends IdToolOption>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f28466d = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new SR1());
        }
        recyclerView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC6360d(recyclerView, this));
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C44482lQ1();
    }

    /* renamed from: v */
    public final Function1<List<? extends IdToolOption>, Unit> m90298v() {
        return this.f28465c;
    }

    /* renamed from: w */
    public final Function1<BrainSwapRecord, Unit> m90297w() {
        return this.f28467e;
    }

    /* renamed from: x */
    public final Function1<List<? extends IdToolOption>, Unit> m90296x() {
        return this.f28466d;
    }

    /* renamed from: y */
    public final void m90295y(Function1<? super List<? extends IdToolOption>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f28465c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C34740Nj4.item_id_tools_landing_option ? new C6357b(this, m41761u) : i == C34740Nj4.item_id_tools_pending_swap ? new C6355a(this, m41761u) : new C29735w1(m41761u);
    }
}
