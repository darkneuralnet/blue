package com.google.android.gms.internal.gtm;

import com.stripe.android.model.PaymentMethod;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes5.dex */
final class zzxy {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzxx zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    static {
        Unsafe unsafe;
        boolean z;
        zzxx zzxxVar;
        Unsafe unsafe2;
        boolean z2;
        Field zzB;
        zzxx zzxxVar2;
        Unsafe zzg2 = zzg();
        zzc = zzg2;
        zzd = zzsk.zza();
        Class<?> cls = Long.TYPE;
        boolean zzv = zzv(cls);
        zze = zzv;
        boolean zzv2 = zzv(Integer.TYPE);
        zzf = zzv2;
        zzxx zzxxVar3 = null;
        if (zzg2 != null) {
            if (zzv) {
                zzxxVar3 = new zzxw(zzg2);
            } else if (zzv2) {
                zzxxVar3 = new zzxv(zzg2);
            }
        }
        zzg = zzxxVar3;
        boolean z3 = true;
        if (zzxxVar3 != null && (unsafe = zzxxVar3.zza) != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
            } catch (Throwable th) {
                zzh(th);
            }
            if (zzB() != null) {
                z = true;
                zzh = z;
                zzxxVar = zzg;
                if (zzxxVar != null && (unsafe2 = zzxxVar.zza) != null) {
                    try {
                        Class<?> cls3 = unsafe2.getClass();
                        cls3.getMethod("objectFieldOffset", Field.class);
                        cls3.getMethod("arrayBaseOffset", Class.class);
                        cls3.getMethod("arrayIndexScale", Class.class);
                        Class<?> cls4 = Long.TYPE;
                        cls3.getMethod("getInt", Object.class, cls4);
                        cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                        cls3.getMethod("getLong", Object.class, cls4);
                        cls3.getMethod("putLong", Object.class, cls4, cls4);
                        cls3.getMethod("getObject", Object.class, cls4);
                        cls3.getMethod("putObject", Object.class, cls4, Object.class);
                        z2 = true;
                    } catch (Throwable th2) {
                        zzh(th2);
                    }
                    zzi = z2;
                    zza = zzz(byte[].class);
                    zzz(boolean[].class);
                    zzA(boolean[].class);
                    zzz(int[].class);
                    zzA(int[].class);
                    zzz(long[].class);
                    zzA(long[].class);
                    zzz(float[].class);
                    zzA(float[].class);
                    zzz(double[].class);
                    zzA(double[].class);
                    zzz(Object[].class);
                    zzA(Object[].class);
                    zzB = zzB();
                    if (zzB != null && (zzxxVar2 = zzg) != null) {
                        zzxxVar2.zzl(zzB);
                    }
                    if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                        z3 = false;
                    }
                    zzb = z3;
                }
                z2 = false;
                zzi = z2;
                zza = zzz(byte[].class);
                zzz(boolean[].class);
                zzA(boolean[].class);
                zzz(int[].class);
                zzA(int[].class);
                zzz(long[].class);
                zzA(long[].class);
                zzz(float[].class);
                zzA(float[].class);
                zzz(double[].class);
                zzA(double[].class);
                zzz(Object[].class);
                zzA(Object[].class);
                zzB = zzB();
                if (zzB != null) {
                    zzxxVar2.zzl(zzB);
                }
                if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
                }
                zzb = z3;
            }
        }
        z = false;
        zzh = z;
        zzxxVar = zzg;
        if (zzxxVar != null) {
            Class<?> cls32 = unsafe2.getClass();
            cls32.getMethod("objectFieldOffset", Field.class);
            cls32.getMethod("arrayBaseOffset", Class.class);
            cls32.getMethod("arrayIndexScale", Class.class);
            Class<?> cls42 = Long.TYPE;
            cls32.getMethod("getInt", Object.class, cls42);
            cls32.getMethod("putInt", Object.class, cls42, Integer.TYPE);
            cls32.getMethod("getLong", Object.class, cls42);
            cls32.getMethod("putLong", Object.class, cls42, cls42);
            cls32.getMethod("getObject", Object.class, cls42);
            cls32.getMethod("putObject", Object.class, cls42, Object.class);
            z2 = true;
            zzi = z2;
            zza = zzz(byte[].class);
            zzz(boolean[].class);
            zzA(boolean[].class);
            zzz(int[].class);
            zzA(int[].class);
            zzz(long[].class);
            zzA(long[].class);
            zzz(float[].class);
            zzA(float[].class);
            zzz(double[].class);
            zzA(double[].class);
            zzz(Object[].class);
            zzA(Object[].class);
            zzB = zzB();
            if (zzB != null) {
            }
            if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
            }
            zzb = z3;
        }
        z2 = false;
        zzi = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        zzB = zzB();
        if (zzB != null) {
        }
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
        zzb = z3;
    }

    private zzxy() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzsk.f70527a;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            if (zzC2 != null && zzC2.getType() == Long.TYPE) {
                return zzC2;
            }
            return null;
        }
        return zzC;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzxu());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzxy.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(valueOf.length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    public static boolean zzv(Class<?> cls) {
        int i = zzsk.f70527a;
        try {
            Class<?> cls2 = zzd;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzx() {
        return zzi;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzh(cls);
        }
        return -1;
    }
}
