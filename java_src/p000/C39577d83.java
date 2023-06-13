package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.Channel;
import com.appboy.p027ui.activities.AppboyFeedActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Ld83;", "LVN1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "Landroid/os/Bundle;", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "extras", "Lcom/appboy/enums/Channel;", "b", "Lcom/appboy/enums/Channel;", "getChannel", "()Lcom/appboy/enums/Channel;", "channel", "<init>", "(Landroid/os/Bundle;Lcom/appboy/enums/Channel;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: d83  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39577d83 implements VN1 {

    /* renamed from: a */
    public final Bundle f76161a;

    /* renamed from: b */
    public final Channel f76162b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: d83$a */
    /* loaded from: classes2.dex */
    public static final class C19680a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19680a f76163g = new C19680a();

        public C19680a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "AppboyFeedActivity was not opened successfully.";
        }
    }

    public C39577d83(Bundle bundle, Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f76161a = bundle;
        this.f76162b = channel;
    }

    @Override // p000.VN1
    /* renamed from: a */
    public void mo44583a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent(context, AppboyFeedActivity.class);
            Bundle bundle = this.f76161a;
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C19680a.f76163g, 4, null);
        }
    }
}
