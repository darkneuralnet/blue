package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LlW3;", "", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", "toString", "LdW3;", C17296a.f69688o, "LdW3;", "b", "()LdW3;", "spanStyle", "LZV3;", "LZV3;", "()LZV3;", "paragraphStyle", "<init>", "(LdW3;LZV3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44538lW3 {

    /* renamed from: a */
    public final C39795dW3 f96280a;

    /* renamed from: b */
    public final ZV3 f96281b;

    public C44538lW3(C39795dW3 c39795dW3, ZV3 zv3) {
        this.f96280a = c39795dW3;
        this.f96281b = zv3;
    }

    /* renamed from: a */
    public final ZV3 m27191a() {
        return this.f96281b;
    }

    /* renamed from: b */
    public final C39795dW3 m27190b() {
        return this.f96280a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44538lW3)) {
            return false;
        }
        C44538lW3 c44538lW3 = (C44538lW3) obj;
        if (Intrinsics.areEqual(this.f96281b, c44538lW3.f96281b) && Intrinsics.areEqual(this.f96280a, c44538lW3.f96280a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        C39795dW3 c39795dW3 = this.f96280a;
        int i2 = 0;
        if (c39795dW3 != null) {
            i = c39795dW3.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ZV3 zv3 = this.f96281b;
        if (zv3 != null) {
            i2 = zv3.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f96280a + ", paragraphSyle=" + this.f96281b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
