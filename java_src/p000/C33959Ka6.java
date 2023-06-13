package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R.\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0012\u0010!¨\u0006%"}, m28432d2 = {"LKa6;", "LcE3;", "", "getCount", "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "Landroid/view/ViewGroup;", "viewGroup", "position", "", "destroyItem", "container", "instantiateItem", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/util/List;", "items", "", "value", "c", "Ljava/lang/String;", "getRules", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "rules", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ka6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33959Ka6 extends AbstractC39022cE3 {

    /* renamed from: a */
    public final Context f19883a;

    /* renamed from: b */
    public List<Integer> f19884b;

    /* renamed from: c */
    public String f19885c;

    public /* synthetic */ C33959Ka6(Context context, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    /* renamed from: a */
    public final void m98724a(String str) {
        this.f19885c = str;
        notifyDataSetChanged();
    }

    @Override // p000.AbstractC39022cE3
    public void destroyItem(ViewGroup viewGroup, int i, Object view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
        ((ViewPager) viewGroup).removeView((View) view);
    }

    @Override // p000.AbstractC39022cE3
    public int getCount() {
        return this.f19884b.size();
    }

    @Override // p000.AbstractC39022cE3
    public Object instantiateItem(ViewGroup container, int i) {
        View view;
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f19884b.get(i).intValue() == 0) {
            view = C40788fB0.m41761u(this.f19883a, C39311cj4.item_tutorial_last, container, false);
            TextView textView = (TextView) C49520tu6.m11243h(view, C36585Vg4.rules);
            String str = this.f19885c;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        } else {
            View m41761u = C40788fB0.m41761u(this.f19883a, C39311cj4.item_tutorial, container, false);
            Intrinsics.checkNotNull(m41761u, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) m41761u;
            imageView.setImageResource(this.f19884b.get(i).intValue());
            view = imageView;
        }
        container.addView(view);
        return view;
    }

    @Override // p000.AbstractC39022cE3
    public boolean isViewFromObject(View view, Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return view == object;
    }

    public C33959Ka6(Context context, List<Integer> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19883a = context;
        this.f19884b = items;
    }
}
