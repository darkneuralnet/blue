package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LxW5;", "", "Key", "Value", "Lkotlin/Function0;", "LfE3;", C17296a.f69688o, "LSC0;", "b", "LSC0;", "dispatcher", "c", "Lkotlin/jvm/functions/Function0;", "delegate", "<init>", "(LSC0;Lkotlin/jvm/functions/Function0;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: xW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51654xW5<Key, Value> implements Function0<AbstractC40818fE3<Key, Value>> {

    /* renamed from: b */
    public final SC0 f117750b;

    /* renamed from: c */
    public final Function0<AbstractC40818fE3<Key, Value>> f117751c;

    /* JADX WARN: Multi-variable type inference failed */
    public C51654xW5(SC0 dispatcher, Function0<? extends AbstractC40818fE3<Key, Value>> delegate) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f117750b = dispatcher;
        this.f117751c = delegate;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a */
    public AbstractC40818fE3<Key, Value> invoke() {
        return this.f117751c.invoke();
    }
}
