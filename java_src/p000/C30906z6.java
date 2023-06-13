package p000;

import android.app.Activity;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.KClassesJvm;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0007¨\u0006\u0004"}, m28432d2 = {"Lkotlin/reflect/KClass;", "Landroid/app/Activity;", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: z6 */
/* loaded from: classes3.dex */
public final class C30906z6 {
    @Deprecated(message = "This requires the Navigator caller to have knowledge of which Activity the Navigator is starting (which should be left as an implementation detail of the Navigator which could change) and that the Navigator is starting it for result. Manage your own request codes and pass them in to the Navigator functions. This self-documents that the Navigator will start the activity for result, and allows the caller to not have to worry about which Activity the Navigator is using under the hood. (lastly, fwiw, this function has a 1 in 65536 change of collision, which is non-zero).")
    /* renamed from: a */
    public static final int m1823a(KClass<? extends Activity> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return KClassesJvm.getJvmName(kClass).hashCode() & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }
}
