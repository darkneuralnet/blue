package co.bird.android.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/widget/RetakeablePhotoView;", "Landroidx/cardview/widget/CardView;", "Landroid/net/Uri;", "uri", "", "setImage", "Lot6;", "k", "Lot6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RetakeablePhotoView extends CardView {

    /* renamed from: k */
    public final C46546ot6 f67629k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetakeablePhotoView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C46546ot6 m20353c = C46546ot6.m20353c(C40788fB0.m41772j(context2), this, false);
        Intrinsics.checkNotNullExpressionValue(m20353c, "inflate(context.layoutInflater, this, false)");
        this.f67629k = m20353c;
        setRadius(C49347td3.m12001b(4));
        addView(m20353c.getRoot());
    }

    public final void setImage(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ComponentCallbacks2C17096a.m53138t(getContext()).m81656h(uri).m16096R0(this.f67629k.f102726b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetakeablePhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C46546ot6 m20353c = C46546ot6.m20353c(C40788fB0.m41772j(context2), this, false);
        Intrinsics.checkNotNullExpressionValue(m20353c, "inflate(context.layoutInflater, this, false)");
        this.f67629k = m20353c;
        setRadius(C49347td3.m12001b(4));
        addView(m20353c.getRoot());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetakeablePhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C46546ot6 m20353c = C46546ot6.m20353c(C40788fB0.m41772j(context2), this, false);
        Intrinsics.checkNotNullExpressionValue(m20353c, "inflate(context.layoutInflater, this, false)");
        this.f67629k = m20353c;
        setRadius(C49347td3.m12001b(4));
        addView(m20353c.getRoot());
    }
}
