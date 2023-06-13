package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LQp5;", "", "", "toString", "Lkotlin/Function0;", "", C17296a.f69688o, "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "value", "b", "maxValue", "", "Z", "()Z", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Qp5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35497Qp5 {

    /* renamed from: a */
    public final Function0<Float> f30992a;

    /* renamed from: b */
    public final Function0<Float> f30993b;

    /* renamed from: c */
    public final boolean f30994c;

    public C35497Qp5(Function0<Float> value, Function0<Float> maxValue, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f30992a = value;
        this.f30993b = maxValue;
        this.f30994c = z;
    }

    /* renamed from: a */
    public final Function0<Float> m87898a() {
        return this.f30993b;
    }

    /* renamed from: b */
    public final boolean m87897b() {
        return this.f30994c;
    }

    /* renamed from: c */
    public final Function0<Float> m87896c() {
        return this.f30992a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f30992a.invoke().floatValue() + ", maxValue=" + this.f30993b.invoke().floatValue() + ", reverseScrolling=" + this.f30994c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
