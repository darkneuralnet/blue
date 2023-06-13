package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.AN2;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BZ\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0014\u0012)\b\u0002\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u0019¢\u0006\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R8\u0010!\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001e0\u00198\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b\u000b\u0010 ¨\u0006$"}, m28432d2 = {"LyN2;", "LAN2;", "S", "", "", C17296a.f69688o, "Z", "c", "()Z", "performCorrectnessValidations", "LEN2;", "b", "LEN2;", DateTokenConverter.CONVERTER_KEY, "()LEN2;", "stateStore", "LZC0;", "LZC0;", "()LZC0;", "coroutineScope", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "e", "()Lkotlin/coroutines/CoroutineContext;", "subscriptionCoroutineContextOverride", "Lkotlin/Function1;", "LxN2;", "Lkotlin/ParameterName;", "name", "repository", "LsN2;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "onExecute", "<init>", "(ZLEN2;LZC0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: yN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52163yN2<S extends AN2> {

    /* renamed from: a */
    public final boolean f119469a;

    /* renamed from: b */
    public final EN2<S> f119470b;

    /* renamed from: c */
    public final ZC0 f119471c;

    /* renamed from: d */
    public final CoroutineContext f119472d;

    /* renamed from: e */
    public final Function1<AbstractC51570xN2<S>, EnumC48606sN2> f119473e;

    /* JADX WARN: Multi-variable type inference failed */
    public C52163yN2(boolean z, EN2<S> stateStore, ZC0 coroutineScope, CoroutineContext subscriptionCoroutineContextOverride, Function1<? super AbstractC51570xN2<S>, ? extends EnumC48606sN2> onExecute) {
        Intrinsics.checkNotNullParameter(stateStore, "stateStore");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(subscriptionCoroutineContextOverride, "subscriptionCoroutineContextOverride");
        Intrinsics.checkNotNullParameter(onExecute, "onExecute");
        this.f119469a = z;
        this.f119470b = stateStore;
        this.f119471c = coroutineScope;
        this.f119472d = subscriptionCoroutineContextOverride;
        this.f119473e = onExecute;
    }

    /* renamed from: a */
    public final ZC0 m3539a() {
        return this.f119471c;
    }

    /* renamed from: b */
    public final Function1<AbstractC51570xN2<S>, EnumC48606sN2> m3538b() {
        return this.f119473e;
    }

    /* renamed from: c */
    public final boolean m3537c() {
        return this.f119469a;
    }

    /* renamed from: d */
    public final EN2<S> m3536d() {
        return this.f119470b;
    }

    /* renamed from: e */
    public final CoroutineContext m3535e() {
        return this.f119472d;
    }
}
