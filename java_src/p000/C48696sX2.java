package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m28432d2 = {"LsX2;", "LrX2;", "Ld62;", "interaction", "", "c", "(Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", C17296a.f69688o, "LBX2;", "LBX2;", DateTokenConverter.CONVERTER_KEY, "()LBX2;", "interactions", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48696sX2 implements InterfaceC48104rX2 {

    /* renamed from: a */
    public final BX2<InterfaceC39556d62> f108925a = C36748Vy5.m79031b(0, 16, EnumC43674k30.DROP_OLDEST, 1, null);

    @Override // p000.InterfaceC48104rX2
    /* renamed from: a */
    public boolean mo14090a(InterfaceC39556d62 interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return mo14089b().mo10357b(interaction);
    }

    @Override // p000.InterfaceC48104rX2
    /* renamed from: c */
    public Object mo14088c(InterfaceC39556d62 interfaceC39556d62, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object emit = mo14089b().emit(interfaceC39556d62, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return emit == coroutine_suspended ? emit : Unit.INSTANCE;
    }

    @Override // p000.InterfaceC40148e62
    /* renamed from: d */
    public BX2<InterfaceC39556d62> mo14089b() {
        return this.f108925a;
    }
}
