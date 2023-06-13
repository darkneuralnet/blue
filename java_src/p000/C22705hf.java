package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001ac\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\" \u0010\u0011\u001a\u00020\u000e*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"T", "Lvf;", "V", "Llf;", "animationSpec", "Lwb6;", "typeConverter", "initialValue", "targetValue", "initialVelocity", "LQY5;", C17296a.f69688o, "(Llf;Lwb6;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LQY5;", "Lef;", "", "b", "(Lef;)J", "durationMillis", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hf */
/* loaded from: classes.dex */
public final class C22705hf {
    /* renamed from: a */
    public static final <T, V extends AbstractC29607vf> QY5<T, V> m36113a(InterfaceC25753lf<T> animationSpec, InterfaceC51108wb6<T, V> typeConverter, T t, T t2, T t3) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        return new QY5<>(animationSpec, typeConverter, t, t2, typeConverter.mo4960a().invoke(t3));
    }

    /* renamed from: b */
    public static final long m36112b(InterfaceC20082ef<?, ?> interfaceC20082ef) {
        Intrinsics.checkNotNullParameter(interfaceC20082ef, "<this>");
        return interfaceC20082ef.mo33859c() / 1000000;
    }
}
