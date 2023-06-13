package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.Channel;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&J,\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&J*\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m28432d2 = {"LdO1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ld83;", "newsfeedAction", "", DateTokenConverter.CONVERTER_KEY, "LCf6;", "uriAction", "c", "LdO1$a;", "intentFlagPurpose", "", C17296a.f69688o, "", "url", "Landroid/os/Bundle;", "extras", "", "openInWebView", "Lcom/appboy/enums/Channel;", "channel", "b", "Landroid/net/Uri;", "uri", "e", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: dO1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC39721dO1 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"LdO1$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: dO1$a */
    /* loaded from: classes2.dex */
    public enum EnumC19746a {
        NOTIFICATION_ACTION_WITH_DEEPLINK,
        NOTIFICATION_PUSH_STORY_PAGE_CLICK,
        URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY,
        URI_ACTION_OPEN_WITH_ACTION_VIEW,
        URI_ACTION_BACK_STACK_GET_ROOT_INTENT,
        URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT,
        URI_UTILS_GET_MAIN_ACTIVITY_INTENT
    }

    /* renamed from: a */
    int mo44326a(EnumC19746a enumC19746a);

    /* renamed from: b */
    C32132Cf6 mo44325b(String str, Bundle bundle, boolean z, Channel channel);

    /* renamed from: c */
    void mo44324c(Context context, C32132Cf6 c32132Cf6);

    /* renamed from: d */
    void mo44323d(Context context, C39577d83 c39577d83);

    /* renamed from: e */
    C32132Cf6 mo44322e(Uri uri, Bundle bundle, boolean z, Channel channel);
}
