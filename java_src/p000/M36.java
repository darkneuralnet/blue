package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u001c\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LM36;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", DateTokenConverter.CONVERTER_KEY, "()V", C17296a.f69688o, "c", "(Ljava/lang/Throwable;)V", "", TransferTable.COLUMN_STATE, "", "b", "(I)Ljava/lang/Void;", "Lzh2;", "Lzh2;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lo51;", "Lo51;", "cancelHandle", "<init>", "(Lzh2;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: M36 */
/* loaded from: classes8.dex */
public final class M36 implements Function1<Throwable, Unit> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22542e = AtomicIntegerFieldUpdater.newUpdater(M36.class, "_state");

    /* renamed from: b */
    public final InterfaceC52943zh2 f22543b;

    /* renamed from: d */
    public InterfaceC46067o51 f22545d;
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: c */
    public final Thread f22544c = Thread.currentThread();

    public M36(InterfaceC52943zh2 interfaceC52943zh2) {
        this.f22543b = interfaceC52943zh2;
    }

    /* renamed from: a */
    public final void m95892a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m95891b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f22542e.compareAndSet(this, i, 1)) {
                InterfaceC46067o51 interfaceC46067o51 = this.f22545d;
                if (interfaceC46067o51 != null) {
                    interfaceC46067o51.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public final Void m95891b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: c */
    public void m95890c(Throwable th) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    m95891b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f22542e.compareAndSet(this, i, 2));
        this.f22544c.interrupt();
        this._state = 3;
    }

    /* renamed from: d */
    public final void m95889d() {
        int i;
        this.f22545d = this.f22543b.mo559D(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i != 2 && i != 3) {
                    m95891b(i);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f22542e.compareAndSet(this, i, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        m95890c(th);
        return Unit.INSTANCE;
    }
}
