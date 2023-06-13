package p000;

import co.bird.android.model.BugReportAttachment;
import co.bird.api.response.BugReportNewResponse;
import co.bird.api.response.BugReportUpdateFileResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, m28432d2 = {"Lr30;", "", "", "reason", "summary", "", "fileNames", "ticketProject", "Lio/reactivex/F;", "Lco/bird/api/response/BugReportNewResponse;", C17296a.f69688o, "Lco/bird/android/model/BugReportAttachment;", "bugReportAttachment", "Ljava/io/File;", "file", "Lco/bird/api/response/BugReportUpdateFileResponse;", "b", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: r30  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC47825r30 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: r30$a */
    /* loaded from: classes2.dex */
    public static final class C27826a {
        public static /* synthetic */ AbstractC23442F submitReport$default(InterfaceC47825r30 interfaceC47825r30, String str, String str2, List list, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return interfaceC47825r30.mo7537a(str, str2, list, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitReport");
        }
    }

    /* renamed from: a */
    AbstractC23442F<BugReportNewResponse> mo7537a(String str, String str2, List<String> list, String str3);

    /* renamed from: b */
    AbstractC23442F<BugReportUpdateFileResponse> mo7536b(BugReportAttachment bugReportAttachment, File file);
}
