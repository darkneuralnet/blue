package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LzE3;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LAE3;", C17296a.f69688o, "LAE3;", "b", "()LAE3;", "intrinsics", "I", "c", "()I", "startIndex", "endIndex", "<init>", "(LAE3;II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52676zE3 {

    /* renamed from: a */
    public final AE3 f120998a;

    /* renamed from: b */
    public final int f120999b;

    /* renamed from: c */
    public final int f121000c;

    public C52676zE3(AE3 intrinsics, int i, int i2) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.f120998a = intrinsics;
        this.f120999b = i;
        this.f121000c = i2;
    }

    /* renamed from: a */
    public final int m1611a() {
        return this.f121000c;
    }

    /* renamed from: b */
    public final AE3 m1610b() {
        return this.f120998a;
    }

    /* renamed from: c */
    public final int m1609c() {
        return this.f120999b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52676zE3) {
            C52676zE3 c52676zE3 = (C52676zE3) obj;
            return Intrinsics.areEqual(this.f120998a, c52676zE3.f120998a) && this.f120999b == c52676zE3.f120999b && this.f121000c == c52676zE3.f121000c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f120998a.hashCode() * 31) + Integer.hashCode(this.f120999b)) * 31) + Integer.hashCode(this.f121000c);
    }

    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f120998a + ", startIndex=" + this.f120999b + ", endIndex=" + this.f121000c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
