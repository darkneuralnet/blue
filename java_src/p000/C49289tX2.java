package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.R62;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u001a\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u0003H\u0002R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006!"}, m28432d2 = {"LtX2;", "T", "LR62;", "", "size", "value", "", "c", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "LR62$a;", "block", "b", "index", "get", "itemIndex", "f", DateTokenConverter.CONVERTER_KEY, "", "e", "LLX2;", C17296a.f69688o, "LLX2;", "intervals", "<set-?>", "I", "()I", "LR62$a;", "lastInterval", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
/* renamed from: tX2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49289tX2<T> implements R62<T> {

    /* renamed from: a */
    public final LX2<R62.C7065a<T>> f110624a = new LX2<>(new R62.C7065a[16], 0);

    /* renamed from: b */
    public int f110625b;

    /* renamed from: c */
    public R62.C7065a<? extends T> f110626c;

    @Override // p000.R62
    /* renamed from: a */
    public int mo12149a() {
        return this.f110625b;
    }

    @Override // p000.R62
    /* renamed from: b */
    public void mo12148b(int i, int i2, Function1<? super R62.C7065a<? extends T>, Unit> block) {
        boolean z;
        int m86010b;
        Intrinsics.checkNotNullParameter(block, "block");
        m12146d(i);
        m12146d(i2);
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m86010b = S62.m86010b(this.f110624a, i);
            int m87320b = this.f110624a.m96691s()[m86010b].m87320b();
            while (m87320b <= i2) {
                R62.C7065a<T> c7065a = this.f110624a.m96691s()[m86010b];
                block.invoke(c7065a);
                m87320b += c7065a.m87321a();
                m86010b++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: c */
    public final void m12147c(int i, T t) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return;
            }
            R62.C7065a<T> c7065a = new R62.C7065a<>(mo12149a(), i, t);
            this.f110625b = mo12149a() + i;
            this.f110624a.m96701b(c7065a);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
    }

    /* renamed from: d */
    public final void m12146d(int i) {
        boolean z = false;
        if (i >= 0 && i < mo12149a()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + mo12149a());
    }

    /* renamed from: e */
    public final boolean m12145e(R62.C7065a<? extends T> c7065a, int i) {
        return i < c7065a.m87320b() + c7065a.m87321a() && c7065a.m87320b() <= i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final R62.C7065a<T> m12144f(int i) {
        int m86010b;
        R62.C7065a c7065a = (R62.C7065a<? extends T>) this.f110626c;
        if (c7065a == null || !m12145e(c7065a, i)) {
            LX2<R62.C7065a<T>> lx2 = this.f110624a;
            m86010b = S62.m86010b(lx2, i);
            R62.C7065a c7065a2 = (R62.C7065a<T>) lx2.m96691s()[m86010b];
            this.f110626c = c7065a2;
            return c7065a2;
        }
        return c7065a;
    }

    @Override // p000.R62
    public R62.C7065a<T> get(int i) {
        m12146d(i);
        return m12144f(i);
    }
}
