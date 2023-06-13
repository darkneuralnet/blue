package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: uR5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC49831uR5 {

    /* renamed from: a */
    public static final AbstractC49831uR5 f112375a = m10277c(0, EnumC29195a.INACTIVE);

    /* renamed from: b */
    public static final Set<Integer> f112376b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* renamed from: c */
    public static final InterfaceC37493Zd3<AbstractC49831uR5> f112377c = C35573Qy0.m87495f(m10277c(0, EnumC29195a.ACTIVE));

    /* renamed from: uR5$a */
    /* loaded from: classes.dex */
    public enum EnumC29195a {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: c */
    public static AbstractC49831uR5 m10277c(int i, EnumC29195a enumC29195a) {
        return new C22789hu(i, enumC29195a);
    }

    /* renamed from: a */
    public abstract int mo10279a();

    /* renamed from: b */
    public abstract EnumC29195a mo10278b();
}
