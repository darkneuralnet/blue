package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.appboy.enums.NotificationSubscriptionType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC25837lz;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LZv5;", "Llz;", "LKQ5;", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "", "c", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Zv5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37657Zv5 extends AbstractC25837lz {

    /* renamed from: b */
    public static final C37657Zv5 f49482b;

    /* renamed from: c */
    public static final String f49483c;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: Zv5$a */
    /* loaded from: classes2.dex */
    public static final class C10431a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ KQ5 f49484g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10431a(KQ5 kq5) {
            super(0);
            this.f49484g = kq5;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Intrinsics.stringPlus("Could not parse subscription type from data ", this.f49484g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lv20;", "it", "", C17296a.f69688o, "(Lv20;)V"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: Zv5$b */
    /* loaded from: classes2.dex */
    public static final class C10432b extends Lambda implements Function1<C50185v20, Unit> {

        /* renamed from: g */
        public final /* synthetic */ NotificationSubscriptionType f49485g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10432b(NotificationSubscriptionType notificationSubscriptionType) {
            super(1);
            this.f49485g = notificationSubscriptionType;
        }

        /* renamed from: a */
        public final void m72297a(C50185v20 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.m9326z(this.f49485g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50185v20 c50185v20) {
            m72297a(c50185v20);
            return Unit.INSTANCE;
        }
    }

    static {
        C37657Zv5 c37657Zv5 = new C37657Zv5();
        f49482b = c37657Zv5;
        f49483c = C43664k20.f93782a.m29445b(c37657Zv5);
    }

    private C37657Zv5() {
        super(null);
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: a */
    public boolean mo5819a(KQ5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (KQ5.m98894l(data, 1, null, 2, null) && data.m98892n(0)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC39110cO1
    /* renamed from: b */
    public void mo5818b(Context context, KQ5 data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        NotificationSubscriptionType fromValue = NotificationSubscriptionType.Companion.fromValue(String.valueOf(data.m98898h()));
        if (fromValue == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C10431a(data), 7, null);
            return;
        }
        AbstractC25837lz.C25838a c25838a = AbstractC25837lz.f97034a;
        P10 p10 = P10.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(p10, "getInstance(context)");
        c25838a.m26585a(p10, new C10432b(fromValue));
    }
}
