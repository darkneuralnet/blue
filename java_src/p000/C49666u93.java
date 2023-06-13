package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u0011\u0014B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ \u0010\u0010\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0004\u0012\u00020\f0\nR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"Lu93;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "LF6;", "r", "Lkotlin/Function1;", "Lco/bird/android/model/NonRepairReason;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "v", "Lco/bird/android/buava/Optional;", "w", "c", "Lkotlin/jvm/functions/Function1;", "onReasonSelected", DateTokenConverter.CONVERTER_KEY, "onSubreasonSelected", "<init>", "()V", C17296a.f69688o, "b", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: u93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49666u93 extends AbstractC52206yS0 {

    /* renamed from: c */
    public Function1<? super NonRepairReason, Unit> f111815c = C29080e.f111828g;

    /* renamed from: d */
    public Function1<? super Optional<NonRepairReason>, Unit> f111816d = C29081f.f111829g;

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"Lu93$a;", "Lw1;", "", "position", "", "bind", "LKd2;", "b", "LKd2;", C17296a.f69688o, "()LKd2;", "binding", "", "c", "Z", "()Z", "setBinding", "(Z)V", "isBinding", "Landroid/view/View;", "view", "<init>", "(Lu93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$BaseReasonViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n18#2:110\n9#3,4:111\n1#4:115\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$BaseReasonViewHolder\n*L\n62#1:110\n62#1:111,4\n*E\n"})
    /* renamed from: u93$a */
    /* loaded from: classes3.dex */
    public abstract class AbstractC29074a extends C29735w1 {

        /* renamed from: b */
        public final C33982Kd2 f111817b;

        /* renamed from: c */
        public boolean f111818c;

        /* renamed from: d */
        public final /* synthetic */ C49666u93 f111819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC29074a(C49666u93 c49666u93, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111819d = c49666u93;
            C33982Kd2 m98639a = C33982Kd2.m98639a(view);
            Intrinsics.checkNotNullExpressionValue(m98639a, "bind(view)");
            this.f111817b = m98639a;
        }

        /* renamed from: a */
        public final C33982Kd2 m10775a() {
            return this.f111817b;
        }

        /* renamed from: b */
        public final boolean m10774b() {
            return this.f111818c;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            boolean z2;
            this.f111818c = true;
            Object m105816c = this.f111819d.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                NonRepairReason nonRepairReason = (NonRepairReason) pair.component1();
                boolean booleanValue = ((Boolean) pair.component2()).booleanValue();
                this.f111817b.f19949b.setText(nonRepairReason.getDisplay());
                this.f111817b.f19949b.setChecked(booleanValue);
                CheckBox checkBox = this.f111817b.f19949b;
                if (booleanValue) {
                    List<NonRepairReason> subreasons = nonRepairReason.getSubreasons();
                    if (subreasons != null && !subreasons.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        z = false;
                        checkBox.setEnabled(z);
                        this.f111817b.f19949b.setClickable(!booleanValue);
                    }
                }
                z = true;
                checkBox.setEnabled(z);
                this.f111817b.f19949b.setClickable(!booleanValue);
            }
            this.f111818c = false;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lu93$b;", "Lw1;", "", "position", "", "bind", "LJd2;", "b", "LJd2;", "binding", "Landroid/view/View;", "view", "<init>", "(Lu93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,109:1\n18#2:110\n9#3,4:111\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$HeaderViewHolder\n*L\n49#1:110\n49#1:111,4\n*E\n"})
    /* renamed from: u93$b */
    /* loaded from: classes3.dex */
    public final class C29075b extends C29735w1 {

        /* renamed from: b */
        public final C33748Jd2 f111820b;

        /* renamed from: c */
        public final /* synthetic */ C49666u93 f111821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29075b(C49666u93 c49666u93, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111821c = c49666u93;
            C33748Jd2 m100100a = C33748Jd2.m100100a(view);
            Intrinsics.checkNotNullExpressionValue(m100100a, "bind(view)");
            this.f111820b = m100100a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f111821c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof NonRepair)) {
                m105816c = null;
            }
            NonRepair nonRepair = (NonRepair) m105816c;
            if (nonRepair != null) {
                this.f111820b.f17916c.setText(nonRepair.getDisplay());
                this.f111820b.f17915b.setText(nonRepair.getDescription());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lu93$c;", "Lu93$a;", "Lu93;", "Landroid/view/View;", "view", "<init>", "(Lu93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: u93$c */
    /* loaded from: classes3.dex */
    public final class C29076c extends AbstractC29074a {

        /* renamed from: e */
        public final /* synthetic */ C49666u93 f111822e;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$ReasonViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,109:1\n1#2:110\n18#3:111\n9#4,4:112\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$ReasonViewHolder$1\n*L\n79#1:111\n79#1:112,4\n*E\n"})
        /* renamed from: u93$c$a */
        /* loaded from: classes3.dex */
        public static final class C29077a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C49666u93 f111824h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29077a(C49666u93 c49666u93) {
                super(2);
                this.f111824h = c49666u93;
            }

            /* renamed from: a */
            public final void m10773a(CompoundButton compoundButton, boolean z) {
                List<NonRepairReason> subreasons;
                Object firstOrNull;
                C2637G6 m109397e;
                if (!C29076c.this.m10774b() && z) {
                    Integer safePosition = C29076c.this.getSafePosition();
                    NonRepairReason nonRepairReason = null;
                    if (safePosition != null && (m109397e = this.f111824h.m94545o().m109397e(safePosition.intValue())) != null) {
                        Object m105816c = m109397e.m105816c();
                        if (!(m105816c instanceof Pair)) {
                            m105816c = null;
                        }
                        Pair pair = (Pair) m105816c;
                        if (pair != null) {
                            nonRepairReason = (NonRepairReason) pair.getFirst();
                        }
                    }
                    if (nonRepairReason != null) {
                        this.f111824h.f111815c.invoke(nonRepairReason);
                    }
                    if (nonRepairReason != null && (subreasons = nonRepairReason.getSubreasons()) != null) {
                        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) subreasons);
                        NonRepairReason nonRepairReason2 = (NonRepairReason) firstOrNull;
                        if (nonRepairReason2 != null) {
                            this.f111824h.f111816d.invoke(new Optional(nonRepairReason2));
                        }
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m10773a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29076c(C49666u93 c49666u93, View view) {
            super(c49666u93, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111822e = c49666u93;
            CheckBox checkBox = m10775a().f19949b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.reason");
            C34585Ms2.m94663h(checkBox, new C29077a(c49666u93));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lu93$d;", "Lu93$a;", "Lu93;", "Landroid/view/View;", "view", "<init>", "(Lu93;Landroid/view/View;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: u93$d */
    /* loaded from: classes3.dex */
    public final class C29078d extends AbstractC29074a {

        /* renamed from: e */
        public final /* synthetic */ C49666u93 f111825e;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Landroid/widget/CompoundButton;", "<anonymous parameter 0>", "", "isChecked", "", C17296a.f69688o, "(Landroid/widget/CompoundButton;Z)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nNonRepairSurveyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$SubreasonViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,109:1\n1#2:110\n18#3:111\n9#4,4:112\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyAdapter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/adapters/NonRepairSurveyAdapter$SubreasonViewHolder$1\n*L\n100#1:111\n100#1:112,4\n*E\n"})
        /* renamed from: u93$d$a */
        /* loaded from: classes3.dex */
        public static final class C29079a extends Lambda implements Function2<CompoundButton, Boolean, Unit> {

            /* renamed from: h */
            public final /* synthetic */ C49666u93 f111827h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29079a(C49666u93 c49666u93) {
                super(2);
                this.f111827h = c49666u93;
            }

            /* renamed from: a */
            public final void m10772a(CompoundButton compoundButton, boolean z) {
                Integer safePosition;
                C2637G6 m109397e;
                NonRepairReason nonRepairReason;
                if (!C29078d.this.m10774b() && z && (safePosition = C29078d.this.getSafePosition()) != null && (m109397e = this.f111827h.m94545o().m109397e(safePosition.intValue())) != null) {
                    Object m105816c = m109397e.m105816c();
                    if (!(m105816c instanceof Pair)) {
                        m105816c = null;
                    }
                    Pair pair = (Pair) m105816c;
                    if (pair != null && (nonRepairReason = (NonRepairReason) pair.getFirst()) != null) {
                        this.f111827h.f111816d.invoke(new Optional(nonRepairReason));
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool) {
                m10772a(compoundButton, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29078d(C49666u93 c49666u93, View view) {
            super(c49666u93, view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f111825e = c49666u93;
            CheckBox checkBox = m10775a().f19949b;
            Intrinsics.checkNotNullExpressionValue(checkBox, "binding.reason");
            C34585Ms2.m94663h(checkBox, new C29079a(c49666u93));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NonRepairReason;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepairReason;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u93$e */
    /* loaded from: classes3.dex */
    public static final class C29080e extends Lambda implements Function1<NonRepairReason, Unit> {

        /* renamed from: g */
        public static final C29080e f111828g = new C29080e();

        public C29080e() {
            super(1);
        }

        /* renamed from: a */
        public final void m10771a(NonRepairReason it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepairReason nonRepairReason) {
            m10771a(nonRepairReason);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepairReason;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: u93$f */
    /* loaded from: classes3.dex */
    public static final class C29081f extends Lambda implements Function1<Optional<NonRepairReason>, Unit> {

        /* renamed from: g */
        public static final C29081f f111829g = new C29081f();

        public C29081f() {
            super(1);
        }

        /* renamed from: a */
        public final void m10770a(Optional<NonRepairReason> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<NonRepairReason> optional) {
            m10770a(optional);
            return Unit.INSTANCE;
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C50258v93();
    }

    /* renamed from: v */
    public final void m10777v(Function1<? super NonRepairReason, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f111815c = listener;
    }

    /* renamed from: w */
    public final void m10776w(Function1<? super Optional<NonRepairReason>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f111816d = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C32634Ej4.item_non_repair_survey_header ? new C29075b(this, m41761u) : i == C32634Ej4.item_non_repair_survey_reason ? new C29076c(this, m41761u) : i == C32634Ej4.item_non_repair_survey_subreason ? new C29078d(this, m41761u) : new C29735w1(m41761u);
    }
}
