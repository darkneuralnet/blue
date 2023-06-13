package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LK66;", "LFy5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LAN5;", C17296a.f69688o, "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "b", "Z", "encodeUrls", "<init>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;Z)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K66 */
/* loaded from: classes5.dex */
public final class K66 implements InterfaceC33004Fy5 {

    /* renamed from: a */
    public final HttpTransaction f19095a;

    /* renamed from: b */
    public final boolean f19096b;

    public K66(HttpTransaction transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f19095a = transaction;
        this.f19096b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0283, code lost:
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x029a  */
    @Override // p000.InterfaceC33004Fy5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AN5 mo5832a(Context context) {
        int i;
        boolean isBlank;
        boolean z;
        String formattedRequestBody;
        boolean isBlank2;
        String responseBody;
        String formattedResponseBody;
        int i2;
        boolean isBlank3;
        int i3;
        boolean isBlank4;
        Intrinsics.checkNotNullParameter(context, "context");
        C42488i30 c42488i30 = new C42488i30();
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_url) + ": " + this.f19095a.getFormattedUrl(this.f19096b) + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_method) + ": " + this.f19095a.getMethod() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_protocol) + ": " + this.f19095a.getProtocol() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_status) + ": " + this.f19095a.getStatus() + "\n");
        int i4 = C38145al4.chucker_response;
        c42488i30.mo24530a2(context.getString(i4) + ": " + this.f19095a.getResponseSummaryText() + "\n");
        if (this.f19095a.isSsl()) {
            i = C38145al4.chucker_yes;
        } else {
            i = C38145al4.chucker_no;
        }
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_ssl) + ": " + context.getString(i) + "\n");
        c42488i30.mo24530a2("\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_request_time) + ": " + this.f19095a.getRequestDateString() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_response_time) + ": " + this.f19095a.getResponseDateString() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_duration) + ": " + this.f19095a.getDurationString() + "\n");
        c42488i30.mo24530a2("\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_request_size) + ": " + this.f19095a.getRequestSizeString() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_response_size) + ": " + this.f19095a.getResponseSizeString() + "\n");
        c42488i30.mo24530a2(context.getString(C38145al4.chucker_total_size) + ": " + this.f19095a.getTotalSizeString() + "\n");
        c42488i30.mo24530a2("\n");
        c42488i30.mo24530a2("---------- " + context.getString(C38145al4.chucker_request) + " ----------\n\n");
        C50730vx1 c50730vx1 = C50730vx1.f114933a;
        boolean z2 = false;
        String m7721b = c50730vx1.m7721b(this.f19095a.getParsedRequestHeaders(), false);
        isBlank = StringsKt__StringsJVMKt.isBlank(m7721b);
        if (!isBlank) {
            c42488i30.mo24530a2(m7721b);
            c42488i30.mo24530a2("\n");
        }
        String requestBody = this.f19095a.getRequestBody();
        if (requestBody != null) {
            isBlank4 = StringsKt__StringsJVMKt.isBlank(requestBody);
            if (!isBlank4) {
                z = false;
                if (!z) {
                    if (this.f19095a.isResponseBodyEncoded()) {
                        i3 = C38145al4.chucker_body_omitted;
                    } else {
                        i3 = C38145al4.chucker_body_empty;
                    }
                    formattedRequestBody = context.getString(i3);
                } else {
                    formattedRequestBody = this.f19095a.getFormattedRequestBody();
                }
                Intrinsics.checkNotNullExpressionValue(formattedRequestBody, "if (transaction.requestB…questBody()\n            }");
                c42488i30.mo24530a2(formattedRequestBody);
                c42488i30.mo24530a2("\n\n");
                c42488i30.mo24530a2("---------- " + context.getString(i4) + " ----------\n\n");
                String m7721b2 = c50730vx1.m7721b(this.f19095a.getParsedResponseHeaders(), false);
                isBlank2 = StringsKt__StringsJVMKt.isBlank(m7721b2);
                if (!isBlank2) {
                    c42488i30.mo24530a2(m7721b2);
                    c42488i30.mo24530a2("\n");
                }
                responseBody = this.f19095a.getResponseBody();
                if (responseBody != null) {
                    isBlank3 = StringsKt__StringsJVMKt.isBlank(responseBody);
                }
                z2 = true;
                if (!z2) {
                    if (this.f19095a.isResponseBodyEncoded()) {
                        i2 = C38145al4.chucker_body_omitted;
                    } else {
                        i2 = C38145al4.chucker_body_empty;
                    }
                    formattedResponseBody = context.getString(i2);
                } else {
                    formattedResponseBody = this.f19095a.getFormattedResponseBody();
                }
                Intrinsics.checkNotNullExpressionValue(formattedResponseBody, "if (transaction.response…ponseBody()\n            }");
                c42488i30.mo24530a2(formattedResponseBody);
                return c42488i30;
            }
        }
        z = true;
        if (!z) {
        }
        Intrinsics.checkNotNullExpressionValue(formattedRequestBody, "if (transaction.requestB…questBody()\n            }");
        c42488i30.mo24530a2(formattedRequestBody);
        c42488i30.mo24530a2("\n\n");
        c42488i30.mo24530a2("---------- " + context.getString(i4) + " ----------\n\n");
        String m7721b22 = c50730vx1.m7721b(this.f19095a.getParsedResponseHeaders(), false);
        isBlank2 = StringsKt__StringsJVMKt.isBlank(m7721b22);
        if (!isBlank2) {
        }
        responseBody = this.f19095a.getResponseBody();
        if (responseBody != null) {
        }
        z2 = true;
        if (!z2) {
        }
        Intrinsics.checkNotNullExpressionValue(formattedResponseBody, "if (transaction.response…ponseBody()\n            }");
        c42488i30.mo24530a2(formattedResponseBody);
        return c42488i30;
    }
}
