package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LDy5;", "", "LKC0;", "small", "medium", "large", C17296a.f69688o, LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LKC0;", "e", "()LKC0;", "b", DateTokenConverter.CONVERTER_KEY, "c", "<init>", "(LKC0;LKC0;LKC0;)V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n154#2:102\n154#2:103\n154#2:104\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n50#1:102\n54#1:103\n58#1:104\n*E\n"})
/* renamed from: Dy5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32536Dy5 {

    /* renamed from: a */
    public final KC0 f6662a;

    /* renamed from: b */
    public final KC0 f6663b;

    /* renamed from: c */
    public final KC0 f6664c;

    public C32536Dy5() {
        this(null, null, null, 7, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C32536Dy5 m109567b(C32536Dy5 c32536Dy5, KC0 kc0, KC0 kc02, KC0 kc03, int i, Object obj) {
        if ((i & 1) != 0) {
            kc0 = c32536Dy5.f6662a;
        }
        if ((i & 2) != 0) {
            kc02 = c32536Dy5.f6663b;
        }
        if ((i & 4) != 0) {
            kc03 = c32536Dy5.f6664c;
        }
        return c32536Dy5.m109568a(kc0, kc02, kc03);
    }

    /* renamed from: a */
    public final C32536Dy5 m109568a(KC0 small, KC0 medium, KC0 large) {
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        return new C32536Dy5(small, medium, large);
    }

    /* renamed from: c */
    public final KC0 m109566c() {
        return this.f6664c;
    }

    /* renamed from: d */
    public final KC0 m109565d() {
        return this.f6663b;
    }

    /* renamed from: e */
    public final KC0 m109564e() {
        return this.f6662a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32536Dy5)) {
            return false;
        }
        C32536Dy5 c32536Dy5 = (C32536Dy5) obj;
        if (Intrinsics.areEqual(this.f6662a, c32536Dy5.f6662a) && Intrinsics.areEqual(this.f6663b, c32536Dy5.f6663b) && Intrinsics.areEqual(this.f6664c, c32536Dy5.f6664c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f6662a.hashCode() * 31) + this.f6663b.hashCode()) * 31) + this.f6664c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f6662a + ", medium=" + this.f6663b + ", large=" + this.f6664c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C32536Dy5(KC0 small, KC0 medium, KC0 large) {
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        this.f6662a = small;
        this.f6663b = medium;
        this.f6664c = large;
    }

    public /* synthetic */ C32536Dy5(KC0 kc0, KC0 kc02, KC0 kc03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C39242cc5.m61172d(C43705k61.m29303g(4)) : kc0, (i & 2) != 0 ? C39242cc5.m61172d(C43705k61.m29303g(4)) : kc02, (i & 4) != 0 ? C39242cc5.m61172d(C43705k61.m29303g(0)) : kc03);
    }
}
