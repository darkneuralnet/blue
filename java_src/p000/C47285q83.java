package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.IssueType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lq83;", "Lp83;", "", "category", "Lco/bird/android/model/IssueType;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: q83  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47285q83 implements InterfaceC46692p83 {

    /* renamed from: a */
    public final Context f104776a;

    public C47285q83(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f104776a = context;
    }

    @Override // p000.InterfaceC46692p83
    /* renamed from: a */
    public IssueType mo18076a(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return new IssueType(category + "-no_issues", category, this.f104776a.getString(C45871nl4.work_order_issue_no_issues), null, null, null, null, null, null, 504, null);
    }
}
