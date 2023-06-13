package p000;

import android.content.Context;
import android.support.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;
@Deprecated
/* renamed from: wU2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51040wU2 {

    /* renamed from: a */
    public static final AtomicReference<Boolean> f116034a = new AtomicReference<>(null);

    @NonNull
    @Deprecated
    /* renamed from: a */
    public static InterfaceC50447vU2 m6786a(@NonNull Context context) {
        return new WK6(context, Runtime.getRuntime(), new SJ6(context, context.getPackageManager()), f116034a);
    }
}
