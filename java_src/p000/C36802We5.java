package p000;

import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import p000.WS0;
import p000.ZD3;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a}\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00110\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m28432d2 = {"", "Key", "Value", "LWS0$c;", "dataSourceFactory", "LZD3$d;", "config", "initialLoadKey", "LZD3$a;", "boundaryCallback", "Lio/reactivex/E;", "fetchScheduler", "notifyScheduler", "LVe5;", C17296a.f69688o, "(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)LVe5;", "Lio/reactivex/Observable;", "LZD3;", "b", "(LWS0$c;LZD3$d;Ljava/lang/Object;LZD3$a;Lio/reactivex/E;Lio/reactivex/E;)Lio/reactivex/Observable;", "paging-rxjava2_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: We5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36802We5 {
    /* renamed from: a */
    public static final <Key, Value> C36568Ve5<Key, Value> m78053a(WS0.AbstractC9025c<Key, Value> abstractC9025c, ZD3.C10145d c10145d, Key key, ZD3.AbstractC10141a<Value> abstractC10141a, AbstractC23437E abstractC23437E, AbstractC23437E abstractC23437E2) {
        C36568Ve5<Key, Value> m79616b = new C36568Ve5(abstractC9025c, c10145d).m79614d(key).m79616b(abstractC10141a);
        if (abstractC23437E != null) {
            m79616b.m79615c(abstractC23437E);
        }
        if (abstractC23437E2 != null) {
            m79616b.m79613e(abstractC23437E2);
        }
        return m79616b;
    }

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "Pager(\n            PagingConfig(\n                config.pageSize,\n                config.prefetchDistance,\n                config.enablePlaceholders,\n                config.initialLoadSizeHint,\n                config.maxSize\n            ),\n            initialLoadKey,\n            this.asPagingSourceFactory(fetchScheduler?.asCoroutineDispatcher() ?: Dispatchers.IO)\n        ).observable", imports = {"androidx.paging.Pager", "androidx.paging.PagingConfig", "androidx.paging.rxjava2.getObservable", "kotlinx.coroutines.rx2.asCoroutineDispatcher", "kotlinx.coroutines.Dispatchers"}))
    /* renamed from: b */
    public static final <Key, Value> Observable<ZD3<Value>> m78052b(WS0.AbstractC9025c<Key, Value> abstractC9025c, ZD3.C10145d config, Key key, ZD3.AbstractC10141a<Value> abstractC10141a, AbstractC23437E abstractC23437E, AbstractC23437E abstractC23437E2) {
        Intrinsics.checkNotNullParameter(abstractC9025c, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        return m78053a(abstractC9025c, config, key, abstractC10141a, abstractC23437E, abstractC23437E2).m79617a();
    }
}
