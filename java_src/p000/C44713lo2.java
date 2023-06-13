package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002\u0012,\u0010\u0017\u001a(\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013¢\u0006\u0004\b\u0018\u0010\u0019R7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR7\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR=\u0010\u0017\u001a(\u0012\u0004\u0012\u00020\u0011\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\b\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Llo2;", "LPn2;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "key", "b", "getType", "type", "Lkotlin/Function2;", "LLn2;", "", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function4;", "()Lkotlin/jvm/functions/Function4;", "item", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44713lo2 implements InterfaceC35242Pn2 {

    /* renamed from: a */
    public final Function1<Integer, Object> f96753a;

    /* renamed from: b */
    public final Function1<Integer, Object> f96754b;

    /* renamed from: c */
    public final Function4<InterfaceC34306Ln2, Integer, InterfaceC32720Et0, Integer, Unit> f96755c;

    /* JADX WARN: Multi-variable type inference failed */
    public C44713lo2(Function1<? super Integer, ? extends Object> function1, Function1<? super Integer, ? extends Object> type, Function4<? super InterfaceC34306Ln2, ? super Integer, ? super InterfaceC32720Et0, ? super Integer, Unit> item) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f96753a = function1;
        this.f96754b = type;
        this.f96755c = item;
    }

    /* renamed from: a */
    public final Function4<InterfaceC34306Ln2, Integer, InterfaceC32720Et0, Integer, Unit> m26789a() {
        return this.f96755c;
    }

    @Override // p000.InterfaceC35242Pn2
    public Function1<Integer, Object> getKey() {
        return this.f96753a;
    }

    @Override // p000.InterfaceC35242Pn2
    public Function1<Integer, Object> getType() {
        return this.f96754b;
    }
}
