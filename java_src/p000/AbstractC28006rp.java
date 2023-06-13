package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lrp;", "T", "LGh3;", "", "decision", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "i", "failure", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", "f", "()Ljava/lang/Object;", "consensus", "", "h", "()Z", "isDecided", "", "g", "()J", "opSequence", C17296a.f69688o, "()Lrp;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: rp */
/* loaded from: classes8.dex */
public abstract class AbstractC28006rp<T> extends AbstractC33083Gh3 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f107675a = AtomicReferenceFieldUpdater.newUpdater(AbstractC28006rp.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C27694qp.f105859a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC33083Gh3
    /* renamed from: a */
    public AbstractC28006rp<?> mo15333a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC33083Gh3
    /* renamed from: c */
    public final Object mo15332c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C27694qp.f105859a) {
            obj2 = m15330e(mo15326i(obj));
        }
        mo15331d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo15331d(T t, Object obj);

    /* renamed from: e */
    public final Object m15330e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C27694qp.f105859a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (C22859i1.m35391a(f107675a, this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public final Object m15329f() {
        return this._consensus;
    }

    /* renamed from: g */
    public long mo15328g() {
        return 0L;
    }

    /* renamed from: h */
    public final boolean m15327h() {
        return this._consensus != C27694qp.f105859a;
    }

    /* renamed from: i */
    public abstract Object mo15326i(T t);
}
