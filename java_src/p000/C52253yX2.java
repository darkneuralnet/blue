package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LyX2;", "", "", "left", "top", "right", "bottom", "", "e", "g", "", "toString", C17296a.f69688o, "F", "b", "()F", "i", "(F)V", DateTokenConverter.CONVERTER_KEY, "k", "c", "j", "h", "", "f", "()Z", "isEmpty", "<init>", "(FFFF)V", "ui-geometry_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,101:1\n40#1,5:102\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:102,5\n*E\n"})
/* renamed from: yX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52253yX2 {

    /* renamed from: a */
    public float f119682a;

    /* renamed from: b */
    public float f119683b;

    /* renamed from: c */
    public float f119684c;

    /* renamed from: d */
    public float f119685d;

    public C52253yX2(float f, float f2, float f3, float f4) {
        this.f119682a = f;
        this.f119683b = f2;
        this.f119684c = f3;
        this.f119685d = f4;
    }

    /* renamed from: a */
    public final float m3372a() {
        return this.f119685d;
    }

    /* renamed from: b */
    public final float m3371b() {
        return this.f119682a;
    }

    /* renamed from: c */
    public final float m3370c() {
        return this.f119684c;
    }

    /* renamed from: d */
    public final float m3369d() {
        return this.f119683b;
    }

    /* renamed from: e */
    public final void m3368e(float f, float f2, float f3, float f4) {
        this.f119682a = Math.max(f, this.f119682a);
        this.f119683b = Math.max(f2, this.f119683b);
        this.f119684c = Math.min(f3, this.f119684c);
        this.f119685d = Math.min(f4, this.f119685d);
    }

    /* renamed from: f */
    public final boolean m3367f() {
        return this.f119682a >= this.f119684c || this.f119683b >= this.f119685d;
    }

    /* renamed from: g */
    public final void m3366g(float f, float f2, float f3, float f4) {
        this.f119682a = f;
        this.f119683b = f2;
        this.f119684c = f3;
        this.f119685d = f4;
    }

    /* renamed from: h */
    public final void m3365h(float f) {
        this.f119685d = f;
    }

    /* renamed from: i */
    public final void m3364i(float f) {
        this.f119682a = f;
    }

    /* renamed from: j */
    public final void m3363j(float f) {
        this.f119684c = f;
    }

    /* renamed from: k */
    public final void m3362k(float f) {
        this.f119683b = f;
    }

    public String toString() {
        return "MutableRect(" + C41984hC1.m36629a(this.f119682a, 1) + ", " + C41984hC1.m36629a(this.f119683b, 1) + ", " + C41984hC1.m36629a(this.f119684c, 1) + ", " + C41984hC1.m36629a(this.f119685d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
