package p000;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.widget.ViewPager2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.google.android.material.tabs.C17914b;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LaE4;", "LxE;", "LYD4;", "Lco/bird/android/model/wire/WireBird;", "bird", "", "sc", "Lcom/google/android/material/tabs/TabLayout;", "b", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Landroidx/viewpager2/widget/ViewPager2;", "c", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "LVD4;", DateTokenConverter.CONVERTER_KEY, "LVD4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37837aE4 extends AbstractC30071xE implements YD4 {

    /* renamed from: b */
    public final TabLayout f50141b;

    /* renamed from: c */
    public final ViewPager2 f50142c;

    /* renamed from: d */
    public final VD4 f50143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37837aE4(final BaseActivity activity, TabLayout tabLayout, ViewPager2 viewPager) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tabLayout, "tabLayout");
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f50141b = tabLayout;
        this.f50142c = viewPager;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        AbstractC11719f lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "activity.lifecycle");
        VD4 vd4 = new VD4(supportFragmentManager, lifecycle);
        this.f50143d = vd4;
        viewPager.setAdapter(vd4);
        new C17914b(tabLayout, viewPager, new C17914b.InterfaceC17916b() { // from class: ZD4
            @Override // com.google.android.material.tabs.C17914b.InterfaceC17916b
            /* renamed from: a */
            public final void mo4558a(TabLayout.C17910g c17910g, int i) {
                C37837aE4.m71744Ql(BaseActivity.this, c17910g, i);
            }
        }).m48699a();
    }

    /* renamed from: Ql */
    public static final void m71744Ql(BaseActivity activity, TabLayout.C17910g tab, int i) {
        String string;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i != 0) {
            if (i != 1) {
                string = null;
            } else {
                string = activity.getString(C45871nl4.repair_tab_vehicle_info);
            }
        } else {
            string = activity.getString(C45871nl4.repair_tab_in_progress);
        }
        tab.m48705r(string);
    }

    @Override // p000.YD4
    /* renamed from: sc */
    public void mo71743sc(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f50143d.m80208P(bird);
    }
}
