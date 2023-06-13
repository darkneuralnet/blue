package p000;

import android.content.Intent;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lcf6;", "LcW0;", "Landroid/content/Intent;", "appUpdateIntent", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/content/Intent;", "b", "()Landroid/content/Intent;", "<init>", "(Landroid/content/Intent;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cf6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39273cf6 extends AbstractC39181cW0 {

    /* renamed from: a */
    public final Intent f61023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39273cf6(Intent appUpdateIntent) {
        super(null);
        Intrinsics.checkNotNullParameter(appUpdateIntent, "appUpdateIntent");
        this.f61023a = appUpdateIntent;
    }

    public static /* synthetic */ C39273cf6 copy$default(C39273cf6 c39273cf6, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = c39273cf6.f61023a;
        }
        return c39273cf6.m61080a(intent);
    }

    /* renamed from: a */
    public final C39273cf6 m61080a(Intent appUpdateIntent) {
        Intrinsics.checkNotNullParameter(appUpdateIntent, "appUpdateIntent");
        return new C39273cf6(appUpdateIntent);
    }

    /* renamed from: b */
    public final Intent m61079b() {
        return this.f61023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39273cf6) && Intrinsics.areEqual(this.f61023a, ((C39273cf6) obj).f61023a);
    }

    public int hashCode() {
        return this.f61023a.hashCode();
    }

    public String toString() {
        Intent intent = this.f61023a;
        return "UpgradeRequired(appUpdateIntent=" + intent + ")";
    }
}
