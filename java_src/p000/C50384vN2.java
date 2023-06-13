package p000;

import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0080\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0002\u001aA\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "Ljava/lang/Class;", "declaredViewModelClass", "declaredStateClass", "LPr6;", "viewModelContext", "LIP5;", "stateRestorer", "LBN2;", "initialStateFactory", "LaO2;", "c", "viewModelClass", TransferTable.COLUMN_STATE, "b", "(Ljava/lang/Class;LAN2;)LRN2;", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: vN2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50384vN2 {
    /* renamed from: b */
    public static final <VM extends RN2<S>, S extends AN2> VM m8766b(Class<VM> cls, S s) {
        if (cls.getConstructors().length != 1) {
            return null;
        }
        Constructor<?> constructor = cls.getConstructors()[0];
        if (constructor.getParameterTypes().length != 1 || !constructor.getParameterTypes()[0].isAssignableFrom(s.getClass())) {
            return null;
        }
        if (!constructor.isAccessible()) {
            try {
                constructor.setAccessible(true);
            } catch (SecurityException e) {
                throw new IllegalStateException("ViewModel class is not public and Mavericks could not make the primary constructor accessible.", e);
            }
        }
        Object newInstance = constructor.newInstance(s);
        if (!(newInstance instanceof RN2)) {
            return null;
        }
        return (VM) newInstance;
    }

    /* renamed from: c */
    public static final <VM extends RN2<S>, S extends AN2> C37925aO2<VM, S> m8765c(Class<? extends VM> cls, Class<? extends S> cls2, AbstractC35282Pr6 abstractC35282Pr6, IP5<VM, S> ip5, BN2<VM, S> bn2) {
        Object firstOrNull;
        String str;
        Class<?>[] parameterTypes;
        boolean z;
        Class<? extends S> m102415a;
        Class<? extends VM> m102413c;
        S mo44941a = bn2.mo44941a(cls, cls2, abstractC35282Pr6, ip5);
        if (ip5 != null && (m102413c = ip5.m102413c()) != null) {
            cls = m102413c;
        }
        if (ip5 != null && (m102415a = ip5.m102415a()) != null) {
            cls2 = m102415a;
        }
        Class m73223a = ZN2.m73223a(cls);
        RN2 rn2 = null;
        boolean z2 = false;
        if (m73223a != null) {
            try {
                rn2 = (RN2) m73223a.getMethod("create", AbstractC35282Pr6.class, AN2.class).invoke(ZN2.m73222b(m73223a), abstractC35282Pr6, mo44941a);
            } catch (NoSuchMethodException unused) {
                rn2 = (RN2) cls.getMethod("create", AbstractC35282Pr6.class, AN2.class).invoke(null, abstractC35282Pr6, mo44941a);
            }
        }
        if (rn2 == null) {
            rn2 = m8766b(cls, mo44941a);
        }
        if (rn2 == null) {
            Constructor<?>[] constructors = cls.getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "viewModelClass.constructors");
            firstOrNull = ArraysKt___ArraysKt.firstOrNull(constructors);
            Constructor constructor = (Constructor) firstOrNull;
            if (constructor != null && (parameterTypes = constructor.getParameterTypes()) != null) {
                if (parameterTypes.length > 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2) {
                str = cls.getSimpleName() + " takes dependencies other than initialState. It must have companion object implementing " + WN2.class.getSimpleName() + " with a create method returning a non-null ViewModel.";
            } else {
                str = cls.getClass().getSimpleName() + " must have primary constructor with a single non-optional parameter that takes initial state of " + cls2.getSimpleName() + CoreConstants.DOT;
            }
            throw new IllegalArgumentException(str.toString());
        }
        return new C37925aO2<>(rn2);
    }
}
