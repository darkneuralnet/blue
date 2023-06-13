package p000;

import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u0010"}, m28432d2 = {"LKE1;", "LyW4;", "Lco/bird/android/model/persistence/RidePassView;", C17296a.f69688o, "Lco/bird/android/model/persistence/RidePassView;", "getPass", "()Lco/bird/android/model/persistence/RidePassView;", "pass", "", "LH6;", "b", "Ljava/util/List;", "()Ljava/util/List;", "ridePassAdapterSections", "<init>", "(Lco/bird/android/model/persistence/RidePassView;Ljava/util/List;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KE1 */
/* loaded from: classes3.dex */
public final class KE1 extends AbstractC52246yW4 {

    /* renamed from: a */
    public final RidePassView f19302a;

    /* renamed from: b */
    public final List<C3023H6> f19303b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KE1(RidePassView pass, List<C3023H6> ridePassAdapterSections) {
        super(null);
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(ridePassAdapterSections, "ridePassAdapterSections");
        this.f19302a = pass;
        this.f19303b = ridePassAdapterSections;
    }

    /* renamed from: a */
    public final List<C3023H6> m99061a() {
        return this.f19303b;
    }
}
