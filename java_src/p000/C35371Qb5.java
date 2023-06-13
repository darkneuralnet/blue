package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LQb5;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "", C17296a.f69688o, "F", "getVerticalScrollPixels", "()F", "verticalScrollPixels", "b", "getHorizontalScrollPixels", "horizontalScrollPixels", "", "c", "J", "getUptimeMillis", "()J", "uptimeMillis", "<init>", "(FFJ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRotaryScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: Qb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35371Qb5 {

    /* renamed from: a */
    public final float f30565a;

    /* renamed from: b */
    public final float f30566b;

    /* renamed from: c */
    public final long f30567c;

    public C35371Qb5(float f, float f2, long j) {
        this.f30565a = f;
        this.f30566b = f2;
        this.f30567c = j;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C35371Qb5)) {
            return false;
        }
        C35371Qb5 c35371Qb5 = (C35371Qb5) obj;
        if (c35371Qb5.f30565a == this.f30565a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (c35371Qb5.f30566b == this.f30566b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || c35371Qb5.f30567c != this.f30567c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f30565a) * 31) + Float.hashCode(this.f30566b)) * 31) + Long.hashCode(this.f30567c);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f30565a + ",horizontalScrollPixels=" + this.f30566b + ",uptimeMillis=" + this.f30567c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
