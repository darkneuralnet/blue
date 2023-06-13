package co.bird.android.coreinterface.manager;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/coreinterface/manager/PairException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "cause", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PairException extends Exception {

    /* renamed from: b */
    public final Throwable f63138b;

    public PairException(Throwable th) {
        super(th);
        this.f63138b = th;
    }

    public static /* synthetic */ PairException copy$default(PairException pairException, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = pairException.f63138b;
        }
        return pairException.m58948a(th);
    }

    /* renamed from: a */
    public final PairException m58948a(Throwable th) {
        return new PairException(th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PairException) && Intrinsics.areEqual(this.f63138b, ((PairException) obj).f63138b);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f63138b;
    }

    public int hashCode() {
        Throwable th = this.f63138b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        Throwable th = this.f63138b;
        return "PairException(cause=" + th + ")";
    }
}
