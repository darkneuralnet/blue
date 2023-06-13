package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"LqX2;", "LFE0;", "T", "LFE0$b;", "key", "t", "", "c", "(LFE0$b;Ljava/lang/Object;)V", C17296a.f69688o, "(LFE0$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(LFE0;)V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47511qX2 extends FE0 {
    public C47511qX2() {
        this(null, 1, null);
    }

    @Override // p000.FE0
    /* renamed from: a */
    public <T> T mo17471a(FE0.InterfaceC2210b<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m107425b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T> void m17470c(FE0.InterfaceC2210b<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        m107425b().put(key, t);
    }

    public C47511qX2(FE0 initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        m107425b().putAll(initialExtras.m107425b());
    }

    public /* synthetic */ C47511qX2(FE0 fe0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FE0.C2209a.f9049b : fe0);
    }
}
