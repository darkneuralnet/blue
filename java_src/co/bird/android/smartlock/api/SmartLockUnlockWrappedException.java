package co.bird.android.smartlock.api;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/smartlock/api/SmartLockUnlockWrappedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "b", "Ljava/lang/Throwable;", C17296a.f69688o, "()Ljava/lang/Throwable;", "wrappedException", "<init>", "(Ljava/lang/Throwable;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SmartLockUnlockWrappedException extends Exception {

    /* renamed from: b */
    public final Throwable f66995b;

    public SmartLockUnlockWrappedException(Throwable wrappedException) {
        Intrinsics.checkNotNullParameter(wrappedException, "wrappedException");
        this.f66995b = wrappedException;
    }

    /* renamed from: a */
    public final Throwable m54944a() {
        return this.f66995b;
    }
}
