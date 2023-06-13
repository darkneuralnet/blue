package p000;

import android.content.Context;
import java.util.List;
/* renamed from: E22 */
/* loaded from: classes.dex */
public interface E22<T> {
    T create(Context context);

    List<Class<? extends E22<?>>> dependencies();
}
