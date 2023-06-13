package p000;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, m28432d2 = {"Lz5;", "Lv5;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", C17296a.f69688o, "", "resultCode", "intent", "b", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: z5 */
/* loaded from: classes.dex */
public final class C30903z5 extends AbstractC29414v5<Intent, ActivityResult> {

    /* renamed from: a */
    public static final C30904a f120750a = new C30904a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lz5$a;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "<init>", "()V", "activity_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: z5$a */
    /* loaded from: classes.dex */
    public static final class C30904a {
        public /* synthetic */ C30904a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30904a() {
        }
    }

    @Override // p000.AbstractC29414v5
    /* renamed from: a */
    public Intent createIntent(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p000.AbstractC29414v5
    /* renamed from: b */
    public ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
