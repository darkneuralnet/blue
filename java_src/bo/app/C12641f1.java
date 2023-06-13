package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m28432d2 = {"Lbo/app/f1;", "Lbo/app/a2;", "", "cardId", "Lbo/app/u1;", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "b", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.f1 */
/* loaded from: classes.dex */
public final class C12641f1 implements InterfaceC12518a2 {

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f1$a */
    /* loaded from: classes.dex */
    public static final class C12642a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58461b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12642a(String str) {
            super(0);
            this.f58461b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Cannot create card control event for Feed card. Returning null. Card id: ", this.f58461b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.f1$b */
    /* loaded from: classes.dex */
    public static final class C12643b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58462b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12643b(String str) {
            super(0);
            this.f58462b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Cannot create card dismissed event for Feed card. Returning null. Card id: ", this.f58462b);
        }
    }

    @Override // bo.app.InterfaceC12518a2
    /* renamed from: a */
    public InterfaceC13160u1 mo62857a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return C12749j.f58647h.m63550e(cardId);
    }

    @Override // bo.app.InterfaceC12518a2
    /* renamed from: b */
    public InterfaceC13160u1 mo62856b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12642a(cardId), 6, null);
        return null;
    }

    @Override // bo.app.InterfaceC12518a2
    /* renamed from: c */
    public InterfaceC13160u1 mo62855c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return C12749j.f58647h.m63548f(cardId);
    }

    @Override // bo.app.InterfaceC12518a2
    /* renamed from: d */
    public InterfaceC13160u1 mo62854d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C12643b(cardId), 6, null);
        return null;
    }
}
