package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001aT\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0003*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u0004\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t\u001aB\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t\u001a5\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28432d2 = {"T", "Lvf;", "V", "Lnf;", "value", "velocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", DateTokenConverter.CONVERTER_KEY, "(Lnf;Ljava/lang/Object;Lvf;JJZ)Lnf;", "", "Lsf;", "velocity", "c", "initialValue", "initialVelocity", C17296a.f69688o, "Lwb6;", "g", "(Lwb6;Ljava/lang/Object;)Lvf;", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: of */
/* loaded from: classes.dex */
public final class C27022of {
    /* renamed from: a */
    public static final C26565nf<Float, C28366sf> m20699a(float f, float f2, long j, long j2, boolean z) {
        return new C26565nf<>(C37082Xj6.m76516i(FloatCompanionObject.INSTANCE), Float.valueOf(f), C29932wf.m6545a(f2), j, j2, z);
    }

    /* renamed from: b */
    public static /* synthetic */ C26565nf m20698b(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return m20699a(f, f2, j3, j4, z);
    }

    /* renamed from: c */
    public static final C26565nf<Float, C28366sf> m20697c(C26565nf<Float, C28366sf> c26565nf, float f, float f2, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(c26565nf, "<this>");
        return new C26565nf<>(c26565nf.m23360f(), Float.valueOf(f), C29932wf.m6545a(f2), j, j2, z);
    }

    /* renamed from: d */
    public static final <T, V extends AbstractC29607vf> C26565nf<T, V> m20696d(C26565nf<T, V> c26565nf, T t, V v, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(c26565nf, "<this>");
        return new C26565nf<>(c26565nf.m23360f(), t, v, j, j2, z);
    }

    /* renamed from: e */
    public static /* synthetic */ C26565nf m20695e(C26565nf c26565nf, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) c26565nf.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C28366sf) c26565nf.m23358i()).m13901f();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = c26565nf.m23361e();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c26565nf.m23362c();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c26565nf.m23357j();
        }
        return m20697c(c26565nf, f, f3, j3, j4, z);
    }

    /* renamed from: f */
    public static /* synthetic */ C26565nf m20694f(C26565nf c26565nf, Object obj, AbstractC29607vf abstractC29607vf, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = c26565nf.getValue();
        }
        if ((i & 2) != 0) {
            abstractC29607vf = C29932wf.m6544b(c26565nf.m23358i());
        }
        AbstractC29607vf abstractC29607vf2 = abstractC29607vf;
        if ((i & 4) != 0) {
            j = c26565nf.m23361e();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = c26565nf.m23362c();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = c26565nf.m23357j();
        }
        return m20696d(c26565nf, obj, abstractC29607vf2, j3, j4, z);
    }

    /* renamed from: g */
    public static final <T, V extends AbstractC29607vf> V m20693g(InterfaceC51108wb6<T, V> interfaceC51108wb6, T t) {
        Intrinsics.checkNotNullParameter(interfaceC51108wb6, "<this>");
        return (V) C29932wf.m6542d(interfaceC51108wb6.mo4960a().invoke(t));
    }
}
