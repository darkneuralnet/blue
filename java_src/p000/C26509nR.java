package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"LnR;", "", "", "title", "", "body", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlus", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/CharSequence;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/CharSequence;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lco/bird/android/model/persistence/BirdPlusView;", "()Lco/bird/android/model/persistence/BirdPlusView;", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusView;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nR */
/* loaded from: classes3.dex */
public final class C26509nR {

    /* renamed from: a */
    public final CharSequence f99933a;

    /* renamed from: b */
    public final String f99934b;

    /* renamed from: c */
    public final BirdPlusView f99935c;

    public C26509nR(CharSequence charSequence, String str, BirdPlusView birdPlus) {
        Intrinsics.checkNotNullParameter(birdPlus, "birdPlus");
        this.f99933a = charSequence;
        this.f99934b = str;
        this.f99935c = birdPlus;
    }

    public static /* synthetic */ C26509nR copy$default(C26509nR c26509nR, CharSequence charSequence, String str, BirdPlusView birdPlusView, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = c26509nR.f99933a;
        }
        if ((i & 2) != 0) {
            str = c26509nR.f99934b;
        }
        if ((i & 4) != 0) {
            birdPlusView = c26509nR.f99935c;
        }
        return c26509nR.m23784a(charSequence, str, birdPlusView);
    }

    /* renamed from: a */
    public final C26509nR m23784a(CharSequence charSequence, String str, BirdPlusView birdPlus) {
        Intrinsics.checkNotNullParameter(birdPlus, "birdPlus");
        return new C26509nR(charSequence, str, birdPlus);
    }

    /* renamed from: b */
    public final BirdPlusView m23783b() {
        return this.f99935c;
    }

    /* renamed from: c */
    public final String m23782c() {
        return this.f99934b;
    }

    /* renamed from: d */
    public final CharSequence m23781d() {
        return this.f99933a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26509nR) {
            C26509nR c26509nR = (C26509nR) obj;
            return Intrinsics.areEqual(this.f99933a, c26509nR.f99933a) && Intrinsics.areEqual(this.f99934b, c26509nR.f99934b) && Intrinsics.areEqual(this.f99935c, c26509nR.f99935c);
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.f99933a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.f99934b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f99935c.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.f99933a;
        String str = this.f99934b;
        BirdPlusView birdPlusView = this.f99935c;
        return "BirdPlusViewModel(title=" + ((Object) charSequence) + ", body=" + str + ", birdPlus=" + birdPlusView + ")";
    }
}
