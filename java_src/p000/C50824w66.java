package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lw66;", "LFy5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LAN5;", C17296a.f69688o, "LDN1;", "header", "", "b", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "<init>", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionCurlCommandSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionCurlCommandSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionCurlCommandSharable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1855#2,2:41\n*S KotlinDebug\n*F\n+ 1 TransactionCurlCommandSharable.kt\ncom/chuckerteam/chucker/internal/support/TransactionCurlCommandSharable\n*L\n17#1:41,2\n*E\n"})
/* renamed from: w66  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50824w66 implements InterfaceC33004Fy5 {

    /* renamed from: a */
    public final HttpTransaction f115379a;

    public C50824w66(HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f115379a = transaction;
    }

    @Override // p000.InterfaceC33004Fy5
    /* renamed from: a */
    public AN5 mo5832a(Context context) {
        boolean z;
        String str;
        String replace$default;
        Intrinsics.checkNotNullParameter(context, "context");
        C42488i30 c42488i30 = new C42488i30();
        c42488i30.mo24530a2("curl -X " + this.f115379a.getMethod());
        List<DN1> parsedRequestHeaders = this.f115379a.getParsedRequestHeaders();
        boolean z2 = true;
        if (parsedRequestHeaders != null) {
            z = false;
            for (DN1 dn1 : parsedRequestHeaders) {
                if (m7405b(dn1)) {
                    z = true;
                }
                c42488i30.mo24530a2(" -H \"" + dn1.m110556a() + ": " + dn1.m110555b() + "\"");
            }
        } else {
            z = false;
        }
        String requestBody = this.f115379a.getRequestBody();
        if (requestBody != null && requestBody.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            replace$default = StringsKt__StringsJVMKt.replace$default(requestBody, "\n", "\\n", false, 4, (Object) null);
            c42488i30.mo24530a2(" --data $'" + replace$default + "'");
        }
        if (z) {
            str = " --compressed ";
        } else {
            str = " ";
        }
        c42488i30.mo24530a2(str + this.f115379a.getFormattedUrl(false));
        return c42488i30;
    }

    /* renamed from: b */
    public final boolean m7405b(DN1 dn1) {
        boolean equals;
        boolean contains;
        boolean contains2;
        equals = StringsKt__StringsJVMKt.equals("Accept-Encoding", dn1.m110556a(), true);
        if (equals) {
            contains2 = StringsKt__StringsKt.contains((CharSequence) "gzip", (CharSequence) dn1.m110555b(), true);
            if (contains2) {
                return true;
            }
        }
        contains = StringsKt__StringsKt.contains((CharSequence) "br", (CharSequence) dn1.m110555b(), true);
        if (contains) {
            return true;
        }
        return false;
    }
}
