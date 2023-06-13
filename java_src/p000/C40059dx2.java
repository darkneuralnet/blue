package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"Ldx2;", "", "E", "", "b", "()V", "element", "", C17296a.f69688o, "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: dx2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C40059dx2<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f77459a = AtomicReferenceFieldUpdater.newUpdater(C40059dx2.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C40059dx2(boolean z) {
        this._cur = new C40652ex2(8, z);
    }

    /* renamed from: a */
    public final boolean m43476a(E e) {
        while (true) {
            C40652ex2 c40652ex2 = (C40652ex2) this._cur;
            int m42361a = c40652ex2.m42361a(e);
            if (m42361a == 0) {
                return true;
            }
            if (m42361a != 1) {
                if (m42361a == 2) {
                    return false;
                }
            } else {
                C22859i1.m35391a(f77459a, this, c40652ex2, c40652ex2.m42353i());
            }
        }
    }

    /* renamed from: b */
    public final void m43475b() {
        while (true) {
            C40652ex2 c40652ex2 = (C40652ex2) this._cur;
            if (c40652ex2.m42358d()) {
                return;
            }
            C22859i1.m35391a(f77459a, this, c40652ex2, c40652ex2.m42353i());
        }
    }

    /* renamed from: c */
    public final int m43474c() {
        return ((C40652ex2) this._cur).m42356f();
    }

    /* renamed from: d */
    public final E m43473d() {
        while (true) {
            C40652ex2 c40652ex2 = (C40652ex2) this._cur;
            E e = (E) c40652ex2.m42352j();
            if (e != C40652ex2.f79192h) {
                return e;
            }
            C22859i1.m35391a(f77459a, this, c40652ex2, c40652ex2.m42353i());
        }
    }
}
