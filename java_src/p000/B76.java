package p000;

import android.content.Context;
import androidx.fragment.app.AbstractC11683k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"LB76;", "Landroidx/fragment/app/k;", "", "position", "Landroidx/fragment/app/Fragment;", C17296a.f69688o, "getCount", "", "getPageTitle", "", "", "h", "[Ljava/lang/String;", "titles", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/FragmentManager;", "fm", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B76 */
/* loaded from: classes5.dex */
public final class B76 extends AbstractC11683k {

    /* renamed from: h */
    public final String[] f1898h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B76(Context context, FragmentManager fm) {
        super(fm, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f1898h = new String[]{context.getString(C38145al4.chucker_overview), context.getString(C38145al4.chucker_request), context.getString(C38145al4.chucker_response)};
    }

    @Override // androidx.fragment.app.AbstractC11683k
    /* renamed from: a */
    public Fragment mo67152a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return F76.f8775i.m107704a(EnumC51553xL3.RESPONSE);
                }
                throw new IllegalArgumentException("no item");
            }
            return F76.f8775i.m107704a(EnumC51553xL3.REQUEST);
        }
        return new A76();
    }

    @Override // p000.AbstractC39022cE3
    public int getCount() {
        return this.f1898h.length;
    }

    @Override // p000.AbstractC39022cE3
    public CharSequence getPageTitle(int i) {
        return this.f1898h[i];
    }
}
