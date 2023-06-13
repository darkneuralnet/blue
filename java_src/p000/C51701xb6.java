package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC29607vf;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\f\u0010\rR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, m28432d2 = {"Lxb6;", "T", "Lvf;", "V", "Lwb6;", "Lkotlin/Function1;", C17296a.f69688o, "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "convertToVector", "b", "convertFromVector", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51701xb6<T, V extends AbstractC29607vf> implements InterfaceC51108wb6<T, V> {

    /* renamed from: a */
    public final Function1<T, V> f117845a;

    /* renamed from: b */
    public final Function1<V, T> f117846b;

    /* JADX WARN: Multi-variable type inference failed */
    public C51701xb6(Function1<? super T, ? extends V> convertToVector, Function1<? super V, ? extends T> convertFromVector) {
        Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
        Intrinsics.checkNotNullParameter(convertFromVector, "convertFromVector");
        this.f117845a = convertToVector;
        this.f117846b = convertFromVector;
    }

    @Override // p000.InterfaceC51108wb6
    /* renamed from: a */
    public Function1<T, V> mo4960a() {
        return this.f117845a;
    }

    @Override // p000.InterfaceC51108wb6
    /* renamed from: b */
    public Function1<V, T> mo4959b() {
        return this.f117846b;
    }
}
