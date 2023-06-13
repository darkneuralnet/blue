package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J(\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\r*\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, m28432d2 = {"Lju1;", "Llf;", "", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "e", "b", DateTokenConverter.CONVERTER_KEY, "c", "Lvf;", "V", "Lwb6;", "converter", "Lqk6;", C17296a.f69688o, "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ju1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC43586ju1 extends InterfaceC25753lf<Float> {
    /* renamed from: b */
    float mo9537b(long j, float f, float f2, float f3);

    /* renamed from: c */
    long mo9536c(float f, float f2, float f3);

    /* renamed from: d */
    default float mo11251d(float f, float f2, float f3) {
        return mo9537b(mo9536c(f, f2, f3), f, f2, f3);
    }

    /* renamed from: e */
    float mo9535e(long j, float f, float f2, float f3);

    @Override // p000.InterfaceC25753lf
    /* renamed from: a */
    default <V extends AbstractC29607vf> C47642qk6<V> mo12016a(InterfaceC51108wb6<Float, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new C47642qk6<>(this);
    }
}
