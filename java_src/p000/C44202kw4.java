package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC25837lz;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lkw4;", "Llz;", "LKQ5;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: kw4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44202kw4 extends AbstractC25837lz {

    /* renamed from: b */
    public static final C44202kw4 f95239b = new C44202kw4();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: kw4$a */
    /* loaded from: classes2.dex */
    public static final class C25560a extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ KQ5 f95240g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25560a(KQ5 kq5) {
            super(1);
            this.f95240g = kq5;
        }

        /* renamed from: a */
        public final void m28150a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9345g(String.valueOf(this.f95240g.m98898h()), String.valueOf(this.f95240g.m98897i()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m28150a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    private C44202kw4() {
        super(null);
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: a */
    public boolean mo5819a(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (!KQ5.m98894l(data, 2, null, 2, null) || !data.m98892n(0) || !data.m98892n(1)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: b */
    public void mo5818b(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        AbstractC25837lz.C25838a c25838a = AbstractC25837lz.f97034a;
        P10 p10 = P10.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c25838a.m26585a(p10, new C25560a(data));
    }
}