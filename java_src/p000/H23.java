package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.wire.WireNestPhoto;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LH23;", "LcE3;", "Landroid/view/View;", "view", "", "object", "", "isViewFromObject", "", "getCount", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "viewGroup", "", "destroyItem", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lco/bird/android/model/wire/WireNestPhoto;", "b", "Ljava/util/List;", "items", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H23 */
/* loaded from: classes3.dex */
public final class H23 extends AbstractC39022cE3 {

    /* renamed from: a */
    public final Context f12751a;

    /* renamed from: b */
    public final List<WireNestPhoto> f12752b;

    public /* synthetic */ H23(Context context, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @Override // p000.AbstractC39022cE3
    public void destroyItem(ViewGroup viewGroup, int i, Object view) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(view, "view");
        ((ViewPager) viewGroup).removeView((View) view);
    }

    @Override // p000.AbstractC39022cE3
    public int getCount() {
        return this.f12752b.size();
    }

    @Override // p000.AbstractC39022cE3
    public Object instantiateItem(ViewGroup container, int i) {
        Intrinsics.checkNotNullParameter(container, "container");
        C49346td2 m12003c = C49346td2.m12003c(C40788fB0.m41772j(this.f12751a), container, false);
        Intrinsics.checkNotNullExpressionValue(m12003c, "inflate(context.layoutInflater, container, false)");
        ComponentCallbacks2C17096a.m53138t(this.f12751a).m81653k(this.f12752b.get(i).getUrl()).mo16086d(new YI4().m97561f()).m16096R0(m12003c.f110797b);
        container.addView(m12003c.getRoot());
        LinearLayout root = m12003c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // p000.AbstractC39022cE3
    public boolean isViewFromObject(View view, Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return view == object;
    }

    public H23(Context context, List<WireNestPhoto> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12751a = context;
        this.f12752b = items;
    }
}
