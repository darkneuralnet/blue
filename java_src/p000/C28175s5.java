package p000;

import android.content.Intent;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Ls5;", "", "", C17296a.f69688o, "b", "Landroid/content/Intent;", "c", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "getRequestCode", "()I", "requestCode", "getResultCode", "resultCode", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", MessageExtension.FIELD_DATA, "<init>", "(IILandroid/content/Intent;)V", "core-basemap_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s5 */
/* loaded from: classes2.dex */
public final class C28175s5 {

    /* renamed from: a */
    public final int f108227a;

    /* renamed from: b */
    public final int f108228b;

    /* renamed from: c */
    public final Intent f108229c;

    public C28175s5(int i, int i2, Intent intent) {
        this.f108227a = i;
        this.f108228b = i2;
        this.f108229c = intent;
    }

    /* renamed from: a */
    public final int m14802a() {
        return this.f108227a;
    }

    /* renamed from: b */
    public final int m14801b() {
        return this.f108228b;
    }

    /* renamed from: c */
    public final Intent m14800c() {
        return this.f108229c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28175s5) {
            C28175s5 c28175s5 = (C28175s5) obj;
            return this.f108227a == c28175s5.f108227a && this.f108228b == c28175s5.f108228b && Intrinsics.areEqual(this.f108229c, c28175s5.f108229c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f108227a) * 31) + Integer.hashCode(this.f108228b)) * 31;
        Intent intent = this.f108229c;
        return hashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        int i = this.f108227a;
        int i2 = this.f108228b;
        Intent intent = this.f108229c;
        return "ActivityResult(requestCode=" + i + ", resultCode=" + i2 + ", data=" + intent + ")";
    }
}
