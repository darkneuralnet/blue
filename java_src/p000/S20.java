package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* renamed from: S20 */
/* loaded from: classes2.dex */
public class S20 {
    /* renamed from: c */
    public static S20 m86080c() {
        return new S20();
    }

    /* renamed from: a */
    public Intent m86082a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s://", str)));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        return intent;
    }

    /* renamed from: b */
    public Intent m86081b(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        Context applicationContext = context.getApplicationContext();
        if (C36833Wi0.m77971b(applicationContext)) {
            C36833Wi0.m77972a(applicationContext, intent);
        }
        return intent;
    }
}
