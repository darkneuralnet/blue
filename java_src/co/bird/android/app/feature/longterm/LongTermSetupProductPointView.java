package co.bird.android.app.feature.longterm;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u000f\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/longterm/LongTermSetupProductPointView;", "Landroid/widget/LinearLayout;", "", Entry.TYPE_TEXT, "", "setText", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onDemandRental", C17296a.f69688o, "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "pointText", "<init>", "(Landroid/content/Context;Z)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LongTermSetupProductPointView extends LinearLayout {

    /* renamed from: b */
    public TextView f61541b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTermSetupProductPointView(Context context, boolean z) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m60588a(context, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m60587b(LongTermSetupProductPointView longTermSetupProductPointView, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        longTermSetupProductPointView.m60588a(context, z);
    }

    /* renamed from: a */
    public final void m60588a(Context context, boolean z) {
        int i;
        if (z) {
            i = C39311cj4.item_on_demand_product_point;
        } else {
            i = C39311cj4.item_longterm_product_point;
        }
        LayoutInflater.from(context).inflate(i, this);
        this.f61541b = (TextView) C49520tu6.m11243h(this, C36585Vg4.pointText);
    }

    public final void setText(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.f61541b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pointText");
            textView = null;
        }
        textView.setText(text);
    }

    public /* synthetic */ LongTermSetupProductPointView(Context context, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTermSetupProductPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m60587b(this, context, false, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTermSetupProductPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        m60587b(this, context, false, 2, null);
    }
}
