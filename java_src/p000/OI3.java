package p000;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.Typography;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LOI3;", "LEu6;", "LDf;", Entry.TYPE_TEXT, "LA96;", "filter", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "b", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "getMask", "()C", "mask", "<init>", "(C)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: OI3 */
/* loaded from: classes.dex */
public final class OI3 implements InterfaceC32735Eu6 {

    /* renamed from: b */
    public final char f26363b;

    public OI3() {
        this((char) 0, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OI3) && this.f26363b == ((OI3) obj).f26363b) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC32735Eu6
    public A96 filter(C1577Df text) {
        String repeat;
        Intrinsics.checkNotNullParameter(text, "text");
        repeat = StringsKt__StringsJVMKt.repeat(String.valueOf(this.f26363b), text.m110052j().length());
        return new A96(new C1577Df(repeat, null, null, 6, null), InterfaceC33290He3.f13687a.m103617a());
    }

    public int hashCode() {
        return Character.hashCode(this.f26363b);
    }

    public OI3(char c) {
        this.f26363b = c;
    }

    public /* synthetic */ OI3(char c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Typography.bullet : c);
    }
}
