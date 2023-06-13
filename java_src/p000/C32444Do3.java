package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32444Do3;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0007\u0018\u0019\u0013\u001a\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000f0\u000f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m28432d2 = {"LDo3;", "LyS0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "LF6;", "r", "Lio/reactivex/Observable;", "", "v", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "locationRelay", "<init>", "()V", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Do3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32444Do3 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C45168ma4<String> f6348c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$a;", "Lw1;", "", "position", "", "bind", "LSd2;", "b", "LSd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$BillOfLadingViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n1#4:149\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$BillOfLadingViewHolder\n*L\n112#1:144\n112#1:145,4\n*E\n"})
    /* renamed from: Do3$a */
    /* loaded from: classes3.dex */
    public final class C1610a extends C29735w1 {

        /* renamed from: b */
        public final C35854Sd2 f6349b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1610a(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6350c = c32444Do3;
            C35854Sd2 m85180a = C35854Sd2.m85180a(view);
            Intrinsics.checkNotNullExpressionValue(m85180a, "bind(view)");
            this.f6349b = m85180a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6350c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorOrderView)) {
                m105816c = null;
            }
            OperatorOrderView operatorOrderView = (OperatorOrderView) m105816c;
            if (operatorOrderView != null) {
                this.f6349b.f33981b.setText(operatorOrderView.getBolStatusText());
                ThemedColors bolStatusColor = operatorOrderView.getBolStatusColor();
                if (bolStatusColor != null) {
                    int lightMode = bolStatusColor.getLightMode();
                    TextView textView = this.f6349b.f33981b;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.bolStatus");
                    textView.setTextColor(lightMode);
                }
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$b;", "Lw1;", "", "position", "", "bind", "LTd2;", "b", "LTd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$DateTimeViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$DateTimeViewHolder\n*L\n101#1:144\n101#1:145,4\n*E\n"})
    /* renamed from: Do3$b */
    /* loaded from: classes3.dex */
    public final class C1611b extends C29735w1 {

        /* renamed from: b */
        public final C36088Td2 f6351b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6352c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1611b(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6352c = c32444Do3;
            C36088Td2 m83252a = C36088Td2.m83252a(view);
            Intrinsics.checkNotNullExpressionValue(m83252a, "bind(view)");
            this.f6351b = m83252a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6352c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C31976Bo3)) {
                m105816c = null;
            }
            C31976Bo3 c31976Bo3 = (C31976Bo3) m105816c;
            if (c31976Bo3 != null) {
                this.f6351b.f35802b.setText(c31976Bo3.m113470b());
                this.f6351b.f35804d.setText(c31976Bo3.m113469c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$c;", "Lw1;", "", "position", "", "bind", "LVd2;", "b", "LVd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$DetailViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$DetailViewHolder\n*L\n123#1:144\n123#1:145,4\n*E\n"})
    /* renamed from: Do3$c */
    /* loaded from: classes3.dex */
    public final class C1612c extends C29735w1 {

        /* renamed from: b */
        public final C36556Vd2 f6353b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6354c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1612c(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6354c = c32444Do3;
            C36556Vd2 m79639a = C36556Vd2.m79639a(view);
            Intrinsics.checkNotNullExpressionValue(m79639a, "bind(view)");
            this.f6353b = m79639a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6354c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C32210Co3)) {
                m105816c = null;
            }
            C32210Co3 c32210Co3 = (C32210Co3) m105816c;
            if (c32210Co3 != null) {
                this.f6353b.f39357c.setText(c32210Co3.m111520c());
                this.f6353b.f39356b.setText(c32210Co3.m111521b());
                this.f6353b.getRoot().setBackgroundTintList(ColorStateList.valueOf(c32210Co3.m111522a()));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$d;", "Lw1;", "", "position", "", "bind", "LWd2;", "b", "LWd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$HeaderViewHolder\n*L\n62#1:144\n62#1:145,4\n*E\n"})
    /* renamed from: Do3$d */
    /* loaded from: classes3.dex */
    public final class C1613d extends C29735w1 {

        /* renamed from: b */
        public final C36790Wd2 f6355b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1613d(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6356c = c32444Do3;
            C36790Wd2 m78115a = C36790Wd2.m78115a(view);
            Intrinsics.checkNotNullExpressionValue(m78115a, "bind(view)");
            this.f6355b = m78115a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6356c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C45910np3)) {
                m105816c = null;
            }
            C45910np3 c45910np3 = (C45910np3) m105816c;
            if (c45910np3 != null) {
                this.f6355b.f41419b.setCompoundDrawablesRelativeWithIntrinsicBounds(c45910np3.m22335b(), (Drawable) null, (Drawable) null, (Drawable) null);
                this.f6355b.f41419b.setText(c45910np3.m22334c());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$e;", "Lw1;", "", "position", "", "bind", "LXd2;", "b", "LXd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$InstructionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$InstructionViewHolder\n*L\n135#1:144\n135#1:145,4\n*E\n"})
    /* renamed from: Do3$e */
    /* loaded from: classes3.dex */
    public final class C1614e extends C29735w1 {

        /* renamed from: b */
        public final C37024Xd2 f6357b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1614e(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6358c = c32444Do3;
            C37024Xd2 m76750a = C37024Xd2.m76750a(view);
            Intrinsics.checkNotNullExpressionValue(m76750a, "bind(view)");
            this.f6357b = m76750a;
        }

        /* renamed from: b */
        public static final void m109916b(C1614e this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f6357b.getRoot().setTextIsSelectable(true);
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            TextView root = this.f6357b.getRoot();
            Object m105816c = this.f6358c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof String)) {
                m105816c = null;
            }
            root.setText((CharSequence) m105816c);
            this.f6357b.getRoot().setTextIsSelectable(false);
            this.f6357b.getRoot().post(new Runnable() { // from class: Eo3
                @Override // java.lang.Runnable
                public final void run() {
                    C32444Do3.C1614e.m109916b(C32444Do3.C1614e.this);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$f;", "Lw1;", "", "position", "", "bind", "LYd2;", "b", "LYd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$LocationViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$LocationViewHolder\n*L\n81#1:144\n81#1:145,4\n*E\n"})
    /* renamed from: Do3$f */
    /* loaded from: classes3.dex */
    public final class C1615f extends C29735w1 {

        /* renamed from: b */
        public final C37258Yd2 f6359b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6360c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$LocationViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n1#4:149\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$LocationViewHolder$1\n*L\n74#1:144\n74#1:145,4\n*E\n"})
        /* renamed from: Do3$f$a */
        /* loaded from: classes3.dex */
        public static final class C1616a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C32444Do3 f6361g;

            /* renamed from: h */
            public final /* synthetic */ C1615f f6362h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1616a(C32444Do3 c32444Do3, C1615f c1615f) {
                super(1);
                this.f6361g = c32444Do3;
                this.f6362h = c1615f;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                String locationAddress;
                C1737E6 m94545o = this.f6361g.m94545o();
                Integer safePosition = this.f6362h.getSafePosition();
                if (safePosition != null) {
                    Object m105816c = m94545o.m109397e(safePosition.intValue()).m105816c();
                    if (!(m105816c instanceof OperatorOrderView)) {
                        m105816c = null;
                    }
                    OperatorOrderView operatorOrderView = (OperatorOrderView) m105816c;
                    if (operatorOrderView == null || (locationAddress = operatorOrderView.getLocationAddress()) == null) {
                        return;
                    }
                    this.f6361g.f6348c.accept(locationAddress);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1615f(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6360c = c32444Do3;
            C37258Yd2 m74782a = C37258Yd2.m74782a(view);
            Intrinsics.checkNotNullExpressionValue(m74782a, "bind(view)");
            this.f6359b = m74782a;
            TextView textView = m74782a.f46098c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.navigate");
            C34585Ms2.m94661j(textView, new C1616a(c32444Do3, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6360c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorOrderView)) {
                m105816c = null;
            }
            OperatorOrderView operatorOrderView = (OperatorOrderView) m105816c;
            if (operatorOrderView != null) {
                this.f6359b.f46097b.setText(operatorOrderView.getLocationName());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LDo3$g;", "Lw1;", "", "position", "", "bind", "LUd2;", "b", "LUd2;", "binding", "Landroid/view/View;", "view", "<init>", "(LDo3;Landroid/view/View;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$OriginPointViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,143:1\n18#2:144\n9#3,4:145\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapter.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapter$OriginPointViewHolder\n*L\n91#1:144\n91#1:145,4\n*E\n"})
    /* renamed from: Do3$g */
    /* loaded from: classes3.dex */
    public final class C1617g extends C29735w1 {

        /* renamed from: b */
        public final C36322Ud2 f6363b;

        /* renamed from: c */
        public final /* synthetic */ C32444Do3 f6364c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1617g(C32444Do3 c32444Do3, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f6364c = c32444Do3;
            C36322Ud2 m81223a = C36322Ud2.m81223a(view);
            Intrinsics.checkNotNullExpressionValue(m81223a, "bind(view)");
            this.f6363b = m81223a;
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            Object m105816c = this.f6364c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof OperatorOrderView)) {
                m105816c = null;
            }
            OperatorOrderView operatorOrderView = (OperatorOrderView) m105816c;
            if (operatorOrderView != null) {
                this.f6363b.f37696b.setText(operatorOrderView.getLocationName());
            }
        }
    }

    public C32444Do3() {
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f6348c = m25409g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C34316Lo3());
        }
    }

    @Override // p000.AbstractC5440My
    /* renamed from: r */
    public InterfaceC2152F6 mo2178r() {
        return new C32912Fo3();
    }

    /* renamed from: v */
    public final Observable<String> m109918v() {
        Observable<String> hide = this.f6348c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "locationRelay.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C35442Qj4.item_operator_order_header ? new C1613d(this, m41761u) : i == C35442Qj4.item_operator_order_location ? new C1615f(this, m41761u) : i == C35442Qj4.item_operator_order_delivery_point ? new C1617g(this, m41761u) : i == C35442Qj4.item_operator_order_date ? new C1611b(this, m41761u) : i == C35442Qj4.item_operator_order_bill_of_lading ? new C1610a(this, m41761u) : i == C35442Qj4.item_operator_order_detail ? new C1612c(this, m41761u) : i == C35442Qj4.item_operator_order_instructions ? new C1614e(this, m41761u) : new C29735w1(m41761u);
    }
}
