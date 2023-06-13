package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"LhV5;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", C17296a.f69688o, "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: hV5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42159hV5 {

    /* renamed from: a */
    public static final C42159hV5 f85298a = new C42159hV5();

    private C42159hV5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final File m36325a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
