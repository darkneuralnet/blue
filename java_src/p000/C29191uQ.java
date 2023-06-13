package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LuQ;", "", "", "heroMessage", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lco/bird/android/model/persistence/BirdPlusView;", "()Lco/bird/android/model/persistence/BirdPlusView;", "<init>", "(Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusView;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uQ */
/* loaded from: classes3.dex */
public final class C29191uQ {

    /* renamed from: a */
    public final String f112332a;

    /* renamed from: b */
    public final BirdPlusView f112333b;

    public C29191uQ(String heroMessage, BirdPlusView birdPlusView) {
        Intrinsics.checkNotNullParameter(heroMessage, "heroMessage");
        Intrinsics.checkNotNullParameter(birdPlusView, "birdPlusView");
        this.f112332a = heroMessage;
        this.f112333b = birdPlusView;
    }

    public static /* synthetic */ C29191uQ copy$default(C29191uQ c29191uQ, String str, BirdPlusView birdPlusView, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c29191uQ.f112332a;
        }
        if ((i & 2) != 0) {
            birdPlusView = c29191uQ.f112333b;
        }
        return c29191uQ.m10343a(str, birdPlusView);
    }

    /* renamed from: a */
    public final C29191uQ m10343a(String heroMessage, BirdPlusView birdPlusView) {
        Intrinsics.checkNotNullParameter(heroMessage, "heroMessage");
        Intrinsics.checkNotNullParameter(birdPlusView, "birdPlusView");
        return new C29191uQ(heroMessage, birdPlusView);
    }

    /* renamed from: b */
    public final BirdPlusView m10342b() {
        return this.f112333b;
    }

    /* renamed from: c */
    public final String m10341c() {
        return this.f112332a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C29191uQ) {
            C29191uQ c29191uQ = (C29191uQ) obj;
            return Intrinsics.areEqual(this.f112332a, c29191uQ.f112332a) && Intrinsics.areEqual(this.f112333b, c29191uQ.f112333b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f112332a.hashCode() * 31) + this.f112333b.hashCode();
    }

    public String toString() {
        String str = this.f112332a;
        BirdPlusView birdPlusView = this.f112333b;
        return "BirdPlusHeaderModel(heroMessage=" + str + ", birdPlusView=" + birdPlusView + ")";
    }
}
