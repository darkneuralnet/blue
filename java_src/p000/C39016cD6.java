package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"LcD6;", "LcU2;", "LmV5;", "db", "", C17296a.f69688o, "Landroid/content/Context;", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: cD6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39016cD6 extends AbstractC39165cU2 {

    /* renamed from: c */
    public final Context f60315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39016cD6(Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f60315c = context;
    }

    @Override // p000.AbstractC39165cU2
    /* renamed from: a */
    public void mo202a(InterfaceC45124mV5 db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.mo25497G1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        TZ3.m83390c(this.f60315c, db);
        TP1.m83674c(this.f60315c, db);
    }
}
