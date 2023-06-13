package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u0011"}, m28432d2 = {"Lqz0;", "", "", C17296a.f69688o, "Z", "b", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "getPositionChange$annotations", "()V", "positionChange", "c", "getDownChange$annotations", "downChange", "<init>", "(ZZ)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47786qz0 {

    /* renamed from: a */
    public boolean f106148a;

    /* renamed from: b */
    public boolean f106149b;

    public C47786qz0() {
        this(false, false, 3, null);
    }

    /* renamed from: a */
    public final boolean m16711a() {
        return this.f106149b;
    }

    /* renamed from: b */
    public final boolean m16710b() {
        return this.f106148a;
    }

    /* renamed from: c */
    public final void m16709c(boolean z) {
        this.f106149b = z;
    }

    /* renamed from: d */
    public final void m16708d(boolean z) {
        this.f106148a = z;
    }

    public C47786qz0(boolean z, boolean z2) {
        this.f106148a = z;
        this.f106149b = z2;
    }

    public /* synthetic */ C47786qz0(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
