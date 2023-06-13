package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LHI4;", "Lkotlin/Function1;", "", "", "disallowIntercept", C17296a.f69688o, "LuX3;", "b", "LuX3;", "getPointerInteropFilter$ui_release", "()LuX3;", "(LuX3;)V", "pointerInteropFilter", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HI4 */
/* loaded from: classes.dex */
public final class HI4 implements Function1<Boolean, Unit> {

    /* renamed from: b */
    public C49883uX3 f13253b;

    /* renamed from: a */
    public void m104040a(boolean z) {
        C49883uX3 c49883uX3 = this.f13253b;
        if (c49883uX3 == null) {
            return;
        }
        c49883uX3.m10109g(z);
    }

    /* renamed from: b */
    public final void m104039b(C49883uX3 c49883uX3) {
        this.f13253b = c49883uX3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        m104040a(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
