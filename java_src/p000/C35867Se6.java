package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LSe6;", "LfR;", "Lco/bird/android/model/persistence/BirdPlusView;", "view", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/BirdPlusView;", "b", "()Lco/bird/android/model/persistence/BirdPlusView;", "<init>", "(Lco/bird/android/model/persistence/BirdPlusView;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Se6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35867Se6 implements InterfaceC20400fR {

    /* renamed from: a */
    public final BirdPlusView f34023a;

    public C35867Se6(BirdPlusView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f34023a = view;
    }

    public static /* synthetic */ C35867Se6 copy$default(C35867Se6 c35867Se6, BirdPlusView birdPlusView, int i, Object obj) {
        if ((i & 1) != 0) {
            birdPlusView = c35867Se6.f34023a;
        }
        return c35867Se6.m85163a(birdPlusView);
    }

    /* renamed from: a */
    public final C35867Se6 m85163a(BirdPlusView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new C35867Se6(view);
    }

    /* renamed from: b */
    public final BirdPlusView m85162b() {
        return this.f34023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35867Se6) && Intrinsics.areEqual(this.f34023a, ((C35867Se6) obj).f34023a);
    }

    public int hashCode() {
        return this.f34023a.hashCode();
    }

    public String toString() {
        BirdPlusView birdPlusView = this.f34023a;
        return "UpdateUi(view=" + birdPlusView + ")";
    }
}
