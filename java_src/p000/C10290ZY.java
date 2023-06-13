package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LZY;", "LTa6;", "", "LRa6;", "tweak", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "LRa6;", "b", "()LRa6;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "value", "<init>", "(LRa6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZY */
/* loaded from: classes2.dex */
public final class C10290ZY implements InterfaceC36065Ta6<Boolean> {

    /* renamed from: a */
    public final C35597Ra6<Boolean> f48735a;

    /* renamed from: b */
    public final String f48736b;

    /* renamed from: c */
    public final Boolean f48737c;

    public C10290ZY(C35597Ra6<Boolean> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        this.f48735a = tweak;
        this.f48736b = m72973b().m86601c();
        this.f48737c = m72973b().m86599e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10290ZY copy$default(C10290ZY c10290zy, C35597Ra6 c35597Ra6, int i, Object obj) {
        if ((i & 1) != 0) {
            c35597Ra6 = c10290zy.f48735a;
        }
        return c10290zy.m72974a(c35597Ra6);
    }

    /* renamed from: a */
    public final C10290ZY m72974a(C35597Ra6<Boolean> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        return new C10290ZY(tweak);
    }

    /* renamed from: b */
    public C35597Ra6<Boolean> m72973b() {
        return this.f48735a;
    }

    @Override // p000.InterfaceC36065Ta6
    /* renamed from: c */
    public Boolean getValue() {
        return this.f48737c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10290ZY) && Intrinsics.areEqual(this.f48735a, ((C10290ZY) obj).f48735a);
    }

    @Override // p000.InterfaceC36065Ta6
    public String getName() {
        return this.f48736b;
    }

    public int hashCode() {
        return this.f48735a.hashCode();
    }

    public String toString() {
        C35597Ra6<Boolean> c35597Ra6 = this.f48735a;
        return "BooleanTweakViewModel(tweak=" + c35597Ra6 + ")";
    }
}
