package p000;

import co.bird.android.model.BugReportAttachment;
import co.bird.api.response.BugReportNewResponse;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.net.URLConnection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0001H\u0002\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/api/response/BugReportNewResponse;", "Ljava/io/File;", "file", "Lco/bird/android/model/BugReportAttachment;", C17296a.f69688o, "Lokhttp3/MediaType;", "b", "", "", "extendedChars", "c", "shaketoreport_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n288#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenterKt\n*L\n179#1:197,2\n*E\n"})
/* renamed from: Q30 */
/* loaded from: classes3.dex */
public final class Q30 {
    /* renamed from: a */
    public static final BugReportAttachment m89022a(BugReportNewResponse bugReportNewResponse, File file) {
        Object obj;
        Iterator<T> it = bugReportNewResponse.getAttachments().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((BugReportAttachment) obj).getFileName(), file.getName())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (BugReportAttachment) obj;
    }

    /* renamed from: b */
    public static final MediaType m89021b(File file) {
        MediaType mediaType;
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(file.getName());
        if (contentTypeFor == null || (mediaType = MediaType.Companion.get(contentTypeFor)) == null) {
            return MediaType.Companion.get("text/plain");
        }
        return mediaType;
    }

    /* renamed from: c */
    public static final String m89020c(String str, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (' ' <= charAt && charAt < 127) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || (!z && charAt >= 128)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public static /* synthetic */ String strip$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m89020c(str, z);
    }
}
