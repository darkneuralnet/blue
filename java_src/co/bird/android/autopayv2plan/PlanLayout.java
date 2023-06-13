package co.bird.android.autopayv2plan;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PlanItemModel;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\r\u0010\u0011B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\r\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\bH\u0017¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/autopayv2plan/PlanLayout;", "Lcom/google/android/material/tabs/TabLayout;", "", "planId", "", "d0", "Lco/bird/android/model/PlanItemModel;", RequestHeadersFactory.MODEL, "Lcom/google/android/material/tabs/TabLayout$g;", "c0", "L", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlanLayout extends TabLayout {

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, m28432d2 = {"co/bird/android/autopayv2plan/PlanLayout$a", "Lcom/google/android/material/tabs/TabLayout$c;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", "c", "b", C17296a.f69688o, "", TransferTable.COLUMN_STATE, DateTokenConverter.CONVERTER_KEY, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.autopayv2plan.PlanLayout$a */
    /* loaded from: classes2.dex */
    public static final class C14424a implements TabLayout.InterfaceC17905c<TabLayout.C17910g> {
        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: a */
        public void mo20905a(TabLayout.C17910g c17910g) {
            m59112d(c17910g, true);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: b */
        public void mo20904b(TabLayout.C17910g c17910g) {
            m59112d(c17910g, false);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
        /* renamed from: c */
        public void mo20903c(TabLayout.C17910g c17910g) {
            m59112d(c17910g, true);
        }

        /* renamed from: d */
        public final void m59112d(TabLayout.C17910g c17910g, boolean z) {
            View view;
            if (c17910g != null) {
                view = c17910g.m48718e();
            } else {
                view = null;
            }
            if (view instanceof PlanLayoutItem) {
                View m48718e = c17910g.m48718e();
                Intrinsics.checkNotNull(m48718e, "null cannot be cast to non-null type co.bird.android.autopayv2plan.PlanLayoutItem");
                ((PlanLayoutItem) m48718e).m59109c(z);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setSelectedTabIndicator((Drawable) null);
        setTabRippleColor(null);
        m48783g(new C14424a());
    }

    @Override // com.google.android.material.tabs.TabLayout
    @Deprecated(message = "use newPlanTab instead", replaceWith = @ReplaceWith(expression = "newPlanTab(autoPayPlanConfig, selectedText, currency)", imports = {}))
    /* renamed from: L */
    public TabLayout.C17910g mo48806L() {
        TabLayout.C17910g mo48806L = super.mo48806L();
        Intrinsics.checkNotNullExpressionValue(mo48806L, "super.newTab()");
        return mo48806L;
    }

    /* renamed from: c0 */
    public final TabLayout.C17910g m59114c0(PlanItemModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        PlanLayoutItem planLayoutItem = new PlanLayoutItem(context, null, 0, model, 6, null);
        TabLayout.C17910g mo48806L = mo48806L();
        mo48806L.m48708o(planLayoutItem);
        return mo48806L;
    }

    /* renamed from: d0 */
    public final void m59113d0(String planId) {
        View view;
        Intrinsics.checkNotNullParameter(planId, "planId");
        int m48813E = m48813E();
        for (int i = 0; i < m48813E; i++) {
            TabLayout.C17910g m48814D = m48814D(i);
            if (m48814D != null) {
                view = m48814D.m48718e();
            } else {
                view = null;
            }
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type co.bird.android.autopayv2plan.PlanLayoutItem");
            if (Intrinsics.areEqual(((PlanLayoutItem) view).m59111a(), planId)) {
                m48814D.m48711l();
                return;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setSelectedTabIndicator((Drawable) null);
        setTabRippleColor(null);
        m48783g(new C14424a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setSelectedTabIndicator((Drawable) null);
        setTabRippleColor(null);
        m48783g(new C14424a());
    }
}
