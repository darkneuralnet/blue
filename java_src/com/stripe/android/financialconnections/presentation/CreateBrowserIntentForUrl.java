package com.stripe.android.financialconnections.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.C50903wF0;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0019\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl;", "", "()V", "CHROME_PACKAGE", "", "FIREFOX_PACKAGE", "createCustomTabIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "invoke", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCreateBrowserIntentForUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateBrowserIntentForUrl.kt\ncom/stripe/android/financialconnections/presentation/CreateBrowserIntentForUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes7.dex */
public final class CreateBrowserIntentForUrl {
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final String FIREFOX_PACKAGE = "org.mozilla";
    public static final CreateBrowserIntentForUrl INSTANCE = new CreateBrowserIntentForUrl();

    private CreateBrowserIntentForUrl() {
    }

    private final Intent createCustomTabIntent(Uri uri) {
        C50903wF0 m7163a = new C50903wF0.C29819b().m7158f(2).m7163a();
        m7163a.f115676a.setData(uri);
        Intent intent = m7163a.f115676a;
        Intrinsics.checkNotNullExpressionValue(intent, "Builder()\n            .s…uri }\n            .intent");
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r7 == true) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent invoke(Context context, Uri uri) {
        String str;
        boolean z;
        boolean contains$default;
        boolean contains$default2;
        ActivityInfo activityInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            str = activityInfo.packageName;
        } else {
            str = null;
        }
        boolean z2 = true;
        if (str != null) {
            contains$default2 = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) FIREFOX_PACKAGE, false, 2, (Object) null);
            if (contains$default2) {
                z = true;
                if (z) {
                    if (str != null) {
                        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) CHROME_PACKAGE, false, 2, (Object) null);
                    }
                    z2 = false;
                    if (z2) {
                        return createCustomTabIntent(uri);
                    }
                    return createCustomTabIntent(uri);
                }
                return intent;
            }
        }
        z = false;
        if (z) {
        }
    }
}
