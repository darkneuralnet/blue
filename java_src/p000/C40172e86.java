package p000;

import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m28432d2 = {"Le86;", "LyW4;", "", C17296a.f69688o, "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "throwable", "Lco/bird/android/model/persistence/RidePassView;", "Lco/bird/android/model/persistence/RidePassView;", "()Lco/bird/android/model/persistence/RidePassView;", "pass", "<init>", "(Ljava/lang/Throwable;Lco/bird/android/model/persistence/RidePassView;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: e86  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40172e86 extends AbstractC52246yW4 {

    /* renamed from: a */
    public final Throwable f78010a;

    /* renamed from: b */
    public final RidePassView f78011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40172e86(Throwable throwable, RidePassView pass) {
        super(null);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f78010a = throwable;
        this.f78011b = pass;
    }

    /* renamed from: a */
    public final RidePassView m43188a() {
        return this.f78011b;
    }

    /* renamed from: b */
    public final Throwable m43187b() {
        return this.f78010a;
    }
}
