package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, m28432d2 = {"LS30;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ljava/io/File;", "c", DateTokenConverter.CONVERTER_KEY, "b", C17296a.f69688o, "<init>", "()V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReportUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportUtils.kt\nco/bird/android/lib/shaketoreport/utils/BugReportUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* renamed from: S30 */
/* loaded from: classes3.dex */
public final class S30 {

    /* renamed from: a */
    public static final S30 f33090a = new S30();

    private S30() {
    }

    /* renamed from: a */
    public final File m86062a(Context context) {
        File filesDir = context.getFilesDir();
        File file = new File(filesDir + "/bug_report");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: b */
    public final File m86061b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File absoluteFile = new File(m86062a(context), "android_network_logs.har.gz").getAbsoluteFile();
        Intrinsics.checkNotNullExpressionValue(absoluteFile, "File(fileDir(context), H…AME).run { absoluteFile }");
        return absoluteFile;
    }

    /* renamed from: c */
    public final List<File> m86060c(Context context) {
        List<File> listOfNotNull;
        Intrinsics.checkNotNullParameter(context, "context");
        File filesDir = context.getFilesDir();
        File filesDir2 = context.getFilesDir();
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new File[]{new File(filesDir + "/android_logcat.log").getAbsoluteFile(), new File(filesDir2 + "/android_logcat2.log").getAbsoluteFile()});
        return listOfNotNull;
    }

    /* renamed from: d */
    public final File m86059d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File absoluteFile = new File(m86062a(context), "screenshot.jpg").getAbsoluteFile();
        Intrinsics.checkNotNullExpressionValue(absoluteFile, "File(fileDir(context), S…AME).run { absoluteFile }");
        return absoluteFile;
    }
}
