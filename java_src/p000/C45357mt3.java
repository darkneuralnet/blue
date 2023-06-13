package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0003J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lmt3;", "", "T", "", C17296a.f69688o, "b", "LRa6;", "c", "title", "description", "tweak", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "getDescription", "LRa6;", "e", "()LRa6;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;LRa6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mt3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45357mt3<T> {

    /* renamed from: a */
    public final CharSequence f98984a;

    /* renamed from: b */
    public final CharSequence f98985b;

    /* renamed from: c */
    public final C35597Ra6<T> f98986c;

    public C45357mt3(CharSequence charSequence, CharSequence charSequence2, C35597Ra6<T> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        this.f98984a = charSequence;
        this.f98985b = charSequence2;
        this.f98986c = tweak;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45357mt3 copy$default(C45357mt3 c45357mt3, CharSequence charSequence, CharSequence charSequence2, C35597Ra6 c35597Ra6, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = c45357mt3.f98984a;
        }
        if ((i & 2) != 0) {
            charSequence2 = c45357mt3.f98985b;
        }
        if ((i & 4) != 0) {
            c35597Ra6 = c45357mt3.f98986c;
        }
        return c45357mt3.m24772d(charSequence, charSequence2, c35597Ra6);
    }

    /* renamed from: a */
    public final CharSequence m24775a() {
        return this.f98984a;
    }

    /* renamed from: b */
    public final CharSequence m24774b() {
        return this.f98985b;
    }

    /* renamed from: c */
    public final C35597Ra6<T> m24773c() {
        return this.f98986c;
    }

    /* renamed from: d */
    public final C45357mt3<T> m24772d(CharSequence charSequence, CharSequence charSequence2, C35597Ra6<T> tweak) {
        Intrinsics.checkNotNullParameter(tweak, "tweak");
        return new C45357mt3<>(charSequence, charSequence2, tweak);
    }

    /* renamed from: e */
    public final C35597Ra6<T> m24771e() {
        return this.f98986c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45357mt3) {
            C45357mt3 c45357mt3 = (C45357mt3) obj;
            return Intrinsics.areEqual(this.f98984a, c45357mt3.f98984a) && Intrinsics.areEqual(this.f98985b, c45357mt3.f98985b) && Intrinsics.areEqual(this.f98986c, c45357mt3.f98986c);
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.f98984a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f98985b;
        return ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + this.f98986c.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.f98984a;
        CharSequence charSequence2 = this.f98985b;
        C35597Ra6<T> c35597Ra6 = this.f98986c;
        return "OperatorSettingViewModel(title=" + ((Object) charSequence) + ", description=" + ((Object) charSequence2) + ", tweak=" + c35597Ra6 + ")";
    }
}
