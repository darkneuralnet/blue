package p000;

import android.content.Context;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, m28432d2 = {"LZJ4;", "LcU2;", "LmV5;", "db", "", C17296a.f69688o, "Landroid/content/Context;", "c", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ZJ4 */
/* loaded from: classes.dex */
public final class ZJ4 extends AbstractC39165cU2 {

    /* renamed from: c */
    public final Context f48220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZJ4(Context mContext, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f48220c = mContext;
    }

    @Override // p000.AbstractC39165cU2
    /* renamed from: a */
    public void mo202a(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.f60712b >= 10) {
            db.mo25491X1("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f48220c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
