package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R\u001e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lvo;", "", "T", "element", "", C17296a.f69688o, "(Ljava/lang/Object;)V", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "b", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "c", "tail", "", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: vo */
/* loaded from: classes8.dex */
public class C29642vo<T> {

    /* renamed from: a */
    public Object[] f114691a = new Object[16];

    /* renamed from: b */
    public int f114692b;

    /* renamed from: c */
    public int f114693c;

    /* renamed from: a */
    public final void m8024a(T t) {
        Object[] objArr = this.f114691a;
        int i = this.f114693c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f114693c = length;
        if (length == this.f114692b) {
            m8023b();
        }
    }

    /* renamed from: b */
    public final void m8023b() {
        Object[] objArr = this.f114691a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        ArraysKt.copyInto$default(objArr, objArr2, 0, this.f114692b, 0, 10, (Object) null);
        Object[] objArr3 = this.f114691a;
        int length2 = objArr3.length;
        int i = this.f114692b;
        ArraysKt.copyInto$default(objArr3, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f114691a = objArr2;
        this.f114692b = 0;
        this.f114693c = length;
    }

    /* renamed from: c */
    public final boolean m8022c() {
        return this.f114692b == this.f114693c;
    }

    /* renamed from: d */
    public final T m8021d() {
        int i = this.f114692b;
        if (i == this.f114693c) {
            return null;
        }
        Object[] objArr = this.f114691a;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.f114692b = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
