package p000;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.C17914b;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m28432d2 = {"LjH2;", "", "LgH2;", C17296a.f69688o, "LgH2;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lk4;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lk4;)V", "co.bird.android.feature.maintenance"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43216jH2 {

    /* renamed from: a */
    public final C41437gH2 f92414a;

    public C43216jH2(final BaseActivity activity, C25093k4 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        AbstractC11719f lifecycle = activity.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "activity.lifecycle");
        C41437gH2 c41437gH2 = new C41437gH2(supportFragmentManager, lifecycle);
        this.f92414a = c41437gH2;
        binding.f93839c.setAdapter(c41437gH2);
        new C17914b(binding.f93838b, binding.f93839c, new C17914b.InterfaceC17916b() { // from class: iH2
            @Override // com.google.android.material.tabs.C17914b.InterfaceC17916b
            /* renamed from: a */
            public final void mo4558a(TabLayout.C17910g c17910g, int i) {
                C43216jH2.m30899b(BaseActivity.this, c17910g, i);
            }
        }).m48699a();
        TabLayout tabLayout = binding.f93838b;
        tabLayout.m48798T(tabLayout.m48814D(1));
    }

    /* renamed from: b */
    public static final void m30899b(BaseActivity activity, TabLayout.C17910g tab, int i) {
        String string;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i != 0) {
            if (i != 1) {
                string = null;
            } else {
                string = activity.getString(C45871nl4.operator_inventory_category_activity_title);
            }
        } else {
            string = activity.getString(C45871nl4.repair_logger_activity_title);
        }
        tab.m48705r(string);
    }
}
