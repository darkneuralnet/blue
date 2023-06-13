package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001b"}, m28432d2 = {"LS32;", "", "", "title", "instruction", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "", "indicatorColor", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "c", "Lco/bird/android/model/constant/BirdModel;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/constant/BirdModel;", "I", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdModel;I)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S32 */
/* loaded from: classes3.dex */
public final class S32 {

    /* renamed from: a */
    public final String f33091a;

    /* renamed from: b */
    public final String f33092b;

    /* renamed from: c */
    public final BirdModel f33093c;

    /* renamed from: d */
    public final int f33094d;

    public S32(String title, String instruction, BirdModel model, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f33091a = title;
        this.f33092b = instruction;
        this.f33093c = model;
        this.f33094d = i;
    }

    public static /* synthetic */ S32 copy$default(S32 s32, String str, String str2, BirdModel birdModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = s32.f33091a;
        }
        if ((i2 & 2) != 0) {
            str2 = s32.f33092b;
        }
        if ((i2 & 4) != 0) {
            birdModel = s32.f33093c;
        }
        if ((i2 & 8) != 0) {
            i = s32.f33094d;
        }
        return s32.m86057a(str, str2, birdModel, i);
    }

    /* renamed from: a */
    public final S32 m86057a(String title, String instruction, BirdModel model, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(model, "model");
        return new S32(title, instruction, model, i);
    }

    /* renamed from: b */
    public final int m86056b() {
        return this.f33094d;
    }

    /* renamed from: c */
    public final String m86055c() {
        return this.f33092b;
    }

    /* renamed from: d */
    public final BirdModel m86054d() {
        return this.f33093c;
    }

    /* renamed from: e */
    public final String m86053e() {
        return this.f33091a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S32) {
            S32 s32 = (S32) obj;
            return Intrinsics.areEqual(this.f33091a, s32.f33091a) && Intrinsics.areEqual(this.f33092b, s32.f33092b) && this.f33093c == s32.f33093c && this.f33094d == s32.f33094d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f33091a.hashCode() * 31) + this.f33092b.hashCode()) * 31) + this.f33093c.hashCode()) * 31) + Integer.hashCode(this.f33094d);
    }

    public String toString() {
        String str = this.f33091a;
        String str2 = this.f33092b;
        BirdModel birdModel = this.f33093c;
        int i = this.f33094d;
        return "InspectionCompleteViewModel(title=" + str + ", instruction=" + str2 + ", model=" + birdModel + ", indicatorColor=" + i + ")";
    }
}
