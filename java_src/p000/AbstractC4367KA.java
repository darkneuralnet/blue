package p000;

import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004R\u001a\u0010\f\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LKA;", "", "", C17296a.f69688o, "Landroidx/fragment/app/Fragment;", "fragment", "", "c", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentManager;", "b", "()Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "I", "getContainerId", "()I", "containerId", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "navigator_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragmentNavigator.kt\nco/bird/android/navigator/BaseFragmentNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n766#2:66\n857#2,2:67\n*S KotlinDebug\n*F\n+ 1 BaseFragmentNavigator.kt\nco/bird/android/navigator/BaseFragmentNavigator\n*L\n25#1:66\n25#1:67,2\n*E\n"})
/* renamed from: KA */
/* loaded from: classes4.dex */
public abstract class AbstractC4367KA {

    /* renamed from: a */
    public final FragmentManager f19201a;

    /* renamed from: b */
    public final int f19202b;

    public AbstractC4367KA(FragmentManager fragmentManager, int i) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f19201a = fragmentManager;
        this.f19202b = i;
    }

    /* renamed from: a */
    public boolean mo28392a() {
        Object last;
        List<Fragment> m67283z0 = this.f19201a.m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "fragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : m67283z0) {
            if (true ^ (((Fragment) obj) instanceof C40380eV5)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
            this.f19201a.m67311q().mo67105s((Fragment) last).mo67123A((Fragment) arrayList.get(arrayList.size() - 2)).mo67114j();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final FragmentManager m99112b() {
        return this.f19201a;
    }

    /* renamed from: c */
    public final void m99111c(Fragment fragment) {
        Object lastOrNull;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List<Fragment> m67283z0 = this.f19201a.m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "fragmentManager.fragments");
        lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) m67283z0);
        Fragment fragment2 = (Fragment) lastOrNull;
        AbstractC11685m m67311q = this.f19201a.m67311q();
        Intrinsics.checkNotNullExpressionValue(m67311q, "fragmentManager.beginTransaction()");
        if (fragment2 != null) {
            m67311q.mo67107q(fragment2);
        }
        if (fragment.isHidden()) {
            m67311q.mo67123A(fragment);
        } else if (!fragment.isAdded()) {
            m67311q.m67122b(this.f19202b, fragment);
        }
        m67311q.mo67114j();
    }
}
