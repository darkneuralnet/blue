package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"Lig;", "", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "page", "", "birdUnlockingText", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "c", "()Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "b", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "<init>", "(Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;Ljava/lang/CharSequence;)V", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ig */
/* loaded from: classes3.dex */
public final class C23323ig {

    /* renamed from: a */
    public final AnnouncementPage f87718a;

    /* renamed from: b */
    public final CharSequence f87719b;

    public C23323ig(AnnouncementPage page, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f87718a = page;
        this.f87719b = charSequence;
    }

    public static /* synthetic */ C23323ig copy$default(C23323ig c23323ig, AnnouncementPage announcementPage, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            announcementPage = c23323ig.f87718a;
        }
        if ((i & 2) != 0) {
            charSequence = c23323ig.f87719b;
        }
        return c23323ig.m33607a(announcementPage, charSequence);
    }

    /* renamed from: a */
    public final C23323ig m33607a(AnnouncementPage page, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(page, "page");
        return new C23323ig(page, charSequence);
    }

    /* renamed from: b */
    public final CharSequence m33606b() {
        return this.f87719b;
    }

    /* renamed from: c */
    public final AnnouncementPage m33605c() {
        return this.f87718a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23323ig) {
            C23323ig c23323ig = (C23323ig) obj;
            return Intrinsics.areEqual(this.f87718a, c23323ig.f87718a) && Intrinsics.areEqual(this.f87719b, c23323ig.f87719b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f87718a.hashCode() * 31;
        CharSequence charSequence = this.f87719b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public String toString() {
        AnnouncementPage announcementPage = this.f87718a;
        CharSequence charSequence = this.f87719b;
        return "AnnouncementPageViewModel(page=" + announcementPage + ", birdUnlockingText=" + ((Object) charSequence) + ")";
    }
}
