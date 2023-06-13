package p000;

import android.database.Cursor;
import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LiV5;", "", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "", C17296a.f69688o, "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: iV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42752iV5 {

    /* renamed from: a */
    public static final C42752iV5 f87416a = new C42752iV5();

    private C42752iV5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m33853a(Cursor cursor, Bundle extras) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(extras, "extras");
        cursor.setExtras(extras);
    }
}
