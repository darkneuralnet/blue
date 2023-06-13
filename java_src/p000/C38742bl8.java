package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C17482R;
/* renamed from: bl8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C38742bl8 {
    /* renamed from: a */
    public static String m64036a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C17482R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m64035b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
