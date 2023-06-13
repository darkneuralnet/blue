package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, m28432d2 = {"LeZ;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Lk61;", C17296a.f69688o, "F", "b", "()F", "width", "La30;", "La30;", "()La30;", "brush", "<init>", "(FLa30;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eZ */
/* loaded from: classes.dex */
public final class C20064eZ {

    /* renamed from: a */
    public final float f78536a;

    /* renamed from: b */
    public final AbstractC37727a30 f78537b;

    public /* synthetic */ C20064eZ(float f, AbstractC37727a30 abstractC37727a30, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, abstractC37727a30);
    }

    /* renamed from: a */
    public final AbstractC37727a30 m42792a() {
        return this.f78537b;
    }

    /* renamed from: b */
    public final float m42791b() {
        return this.f78536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20064eZ)) {
            return false;
        }
        C20064eZ c20064eZ = (C20064eZ) obj;
        if (C43705k61.m29301i(this.f78536a, c20064eZ.f78536a) && Intrinsics.areEqual(this.f78537b, c20064eZ.f78537b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C43705k61.m29300j(this.f78536a) * 31) + this.f78537b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) C43705k61.m29299k(this.f78536a)) + ", brush=" + this.f78537b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C20064eZ(float f, AbstractC37727a30 abstractC37727a30) {
        this.f78536a = f;
        this.f78537b = abstractC37727a30;
    }
}
