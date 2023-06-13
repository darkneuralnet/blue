package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC40818fE3;
import p000.ZD3;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"Lq22;", "", "K", "V", "LhB0;", "LZC0;", "coroutineScope", "LSC0;", "notifyDispatcher", "backgroundDispatcher", "LZD3$d;", "config", "initialLastKey", "<init>", "(LZC0;LSC0;LSC0;LZD3$d;Ljava/lang/Object;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: q22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47224q22<K, V> extends C41974hB0<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47224q22(ZC0 coroutineScope, SC0 notifyDispatcher, SC0 backgroundDispatcher, ZD3.C10145d config, K k) {
        super(new C41165fp2(notifyDispatcher, new C46631p22()), coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, AbstractC40818fE3.AbstractC20330b.C20333c.f79725f.m41661a(), k);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
