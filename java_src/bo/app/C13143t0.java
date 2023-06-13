package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "TargetEnum", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
/* renamed from: bo.app.t0 */
/* loaded from: classes.dex */
public final class C13143t0 extends Lambda implements Function0<String> {

    /* renamed from: b */
    final /* synthetic */ String f59329b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13143t0(String str) {
        super(0);
        this.f59329b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a */
    public final String invoke() {
        return Intrinsics.stringPlus("Failed to create valid enum from string: ", this.f59329b);
    }
}
