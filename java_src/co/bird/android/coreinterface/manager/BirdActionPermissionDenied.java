package co.bird.android.coreinterface.manager;

import co.bird.android.model.PrivateBirdAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/BirdActionPermissionDenied;", "Ljava/lang/Exception;", "Lco/bird/android/model/PrivateBirdAction;", "b", "Lco/bird/android/model/PrivateBirdAction;", "action", "", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "cause", "<init>", "(Lco/bird/android/model/PrivateBirdAction;Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BirdActionPermissionDenied extends Exception {

    /* renamed from: b */
    public final PrivateBirdAction f63132b;

    /* renamed from: c */
    public final Throwable f63133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirdActionPermissionDenied(PrivateBirdAction action, Throwable th) {
        super("The user does not have correct permissions to perform " + action + " on the bird.", th);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f63132b = action;
        this.f63133c = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63133c;
    }
}
