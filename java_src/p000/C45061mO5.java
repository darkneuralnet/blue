package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0015j\b\u0012\u0004\u0012\u00028\u0000`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LmO5;", "T", "", "value", "", "h", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "e", "", "index", "f", "(I)Ljava/lang/Object;", "c", DateTokenConverter.CONVERTER_KEY, "", C17296a.f69688o, "", "i", "()[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "backing", "b", "()I", "size", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45061mO5<T> {

    /* renamed from: a */
    public final ArrayList<T> f97945a = new ArrayList<>();

    /* renamed from: a */
    public final void m25682a() {
        this.f97945a.clear();
    }

    /* renamed from: b */
    public final int m25681b() {
        return this.f97945a.size();
    }

    /* renamed from: c */
    public final boolean m25680c() {
        return this.f97945a.isEmpty();
    }

    /* renamed from: d */
    public final boolean m25679d() {
        return !m25680c();
    }

    /* renamed from: e */
    public final T m25678e() {
        return this.f97945a.get(m25681b() - 1);
    }

    /* renamed from: f */
    public final T m25677f(int i) {
        return this.f97945a.get(i);
    }

    /* renamed from: g */
    public final T m25676g() {
        return this.f97945a.remove(m25681b() - 1);
    }

    /* renamed from: h */
    public final boolean m25675h(T t) {
        return this.f97945a.add(t);
    }

    /* renamed from: i */
    public final T[] m25674i() {
        int size = this.f97945a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f97945a.get(i);
        }
        return tArr;
    }
}
