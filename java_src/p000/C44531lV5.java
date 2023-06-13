package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, m28432d2 = {"LlV5;", "", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "", "b", C17296a.f69688o, "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: lV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44531lV5 {

    /* renamed from: a */
    public static final C44531lV5 f96267a = new C44531lV5();

    private C44531lV5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<Uri> m27203a(Cursor cursor) {
        List<Uri> notificationUris;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        notificationUris = cursor.getNotificationUris();
        Intrinsics.checkNotNull(notificationUris);
        return notificationUris;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m27202b(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(cr, "cr");
        Intrinsics.checkNotNullParameter(uris, "uris");
        cursor.setNotificationUris(cr, uris);
    }
}
