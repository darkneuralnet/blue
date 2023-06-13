package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lqt2;", "Lkw1;", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LIb6;", "i", "LIb6;", "b", "()LIb6;", "typeface", "<init>", "(LIb6;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47728qt2 extends AbstractC44199kw1 {

    /* renamed from: i */
    public final InterfaceC33500Ib6 f106035i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47728qt2(InterfaceC33500Ib6 typeface) {
        super(true, null);
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f106035i = typeface;
    }

    /* renamed from: b */
    public final InterfaceC33500Ib6 m16809b() {
        return this.f106035i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C47728qt2) && Intrinsics.areEqual(this.f106035i, ((C47728qt2) obj).f106035i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f106035i.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.f106035i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
