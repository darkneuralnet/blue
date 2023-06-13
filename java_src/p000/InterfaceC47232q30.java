package p000;

import co.bird.api.request.BugReportNewRequestBody;
import co.bird.api.request.BugReportUpdateFileBody;
import co.bird.api.response.BugReportNewResponse;
import co.bird.api.response.BugReportUpdateFileResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import okhttp3.RequestBody;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0012"}, m28432d2 = {"Lq30;", "", "Lco/bird/api/request/BugReportNewRequestBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/BugReportNewResponse;", C17296a.f69688o, "Lco/bird/api/request/BugReportUpdateFileBody;", "Lco/bird/api/response/BugReportUpdateFileResponse;", "b", "", "fileId", "", "length", "Lokhttp3/RequestBody;", "requestBody", "c", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: q30  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC47232q30 {
    @AD3("bugreport/new")
    /* renamed from: a */
    AbstractC23442F<HM4<BugReportNewResponse>> m18255a(@InterfaceC6404PY BugReportNewRequestBody bugReportNewRequestBody);

    @AD3("bugreport/update_file")
    /* renamed from: b */
    AbstractC23442F<HM4<BugReportUpdateFileResponse>> m18254b(@InterfaceC6404PY BugReportUpdateFileBody bugReportUpdateFileBody);

    @CD3("bugreport/upload-file")
    /* renamed from: c */
    AbstractC23442F<BugReportUpdateFileResponse> m18253c(@InterfaceC37017Xc4("file_id") String str, @InterfaceC37017Xc4("length") int i, @InterfaceC6404PY RequestBody requestBody);
}
