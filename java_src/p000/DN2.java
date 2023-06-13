package p000;

import android.os.Build;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aC\u0010\b\u001a\u0004\u0018\u00018\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\r\u001a\u00028\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00042\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"LRN2;", "VM", "LAN2;", "S", "Ljava/lang/Class;", "viewModelClass", "LPr6;", "viewModelContext", C17296a.f69688o, "(Ljava/lang/Class;LPr6;)LAN2;", "stateClass", "", "args", "b", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)LAN2;", "mvrx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: DN2 */
/* loaded from: classes2.dex */
public final class DN2 {
    /* renamed from: a */
    public static final <VM extends RN2<S>, S extends AN2> S m110554a(Class<? extends VM> viewModelClass, AbstractC35282Pr6 viewModelContext) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(viewModelContext, "viewModelContext");
        Class m73223a = ZN2.m73223a(viewModelClass);
        if (m73223a == null) {
            return null;
        }
        try {
            return (S) m73223a.getMethod("initialState", AbstractC35282Pr6.class).invoke(ZN2.m73222b(m73223a), viewModelContext);
        } catch (NoSuchMethodException unused) {
            return (S) viewModelClass.getMethod("initialState", AbstractC35282Pr6.class).invoke(null, viewModelContext);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[LOOP:0: B:5:0x001e->B:14:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0044 A[EDGE_INSN: B:61:0x0044->B:16:0x0044 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <VM extends RN2<S>, S extends AN2> S m110553b(Class<? extends VM> viewModelClass, Class<? extends S> stateClass, Object obj) {
        Constructor<?> constructor;
        Object obj2;
        S s;
        Object lastOrNull;
        Constructor<?> constructor2;
        S s2;
        int parameterCount;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(stateClass, "stateClass");
        String str = null;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Constructor<?>[] constructors = stateClass.getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "stateClass.constructors");
            int length = constructors.length;
            for (int i = 0; i < length; i++) {
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 1) {
                    Class<?> cls2 = constructor.getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls2, "constructor.parameterTypes[0]");
                    if (C47730qt4.m16808a(cls, cls2)) {
                        z2 = true;
                        if (!z2) {
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        constructor = null;
        if (constructor != null) {
            obj2 = constructor.newInstance(obj);
        } else {
            obj2 = null;
        }
        if (obj2 instanceof AN2) {
            s = (S) obj2;
        } else {
            s = null;
        }
        if (s == null) {
            try {
                if (Modifier.isPublic(stateClass.getModifiers())) {
                    s2 = stateClass.newInstance();
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        Constructor<?>[] constructors2 = stateClass.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors2, "stateClass.constructors");
                        int length2 = constructors2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                constructor2 = constructors2[i2];
                                parameterCount = constructor2.getParameterCount();
                                if (parameterCount == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    break;
                                }
                                i2++;
                            } else {
                                constructor2 = null;
                                break;
                            }
                        }
                    } else {
                        Constructor<?>[] constructors3 = stateClass.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors3, "stateClass.constructors");
                        lastOrNull = ArraysKt___ArraysKt.lastOrNull(constructors3);
                        constructor2 = (Constructor) lastOrNull;
                    }
                    if (constructor2 != null) {
                        constructor2.setAccessible(true);
                        Object newInstance = constructor2.newInstance(new Object[0]);
                        if (newInstance instanceof AN2) {
                            s2 = (S) newInstance;
                        } else {
                            s2 = null;
                        }
                    } else {
                        s = null;
                        if (s == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Attempt to create the Mavericks state class ");
                            sb.append(stateClass.getSimpleName());
                            sb.append(" has failed. One of the following must be true:\n 1) The state class has default values for every constructor property.\n 2) The state class has a secondary constructor for ");
                            if (obj != null) {
                                str = obj.getClass().getSimpleName();
                            }
                            if (str == null) {
                                str = "a fragment argument";
                            }
                            sb.append(str);
                            sb.append(".\n 3) ");
                            sb.append(viewModelClass.getSimpleName());
                            sb.append(" must have a companion object implementing MavericksViewModelFactory with an initialState function that does not return null. ");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
                s = s2;
                if (s == null) {
                }
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to create initial state!", th);
            }
        }
        return s;
    }
}
