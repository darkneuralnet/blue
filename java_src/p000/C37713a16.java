package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a!\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u0003*\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"LH16;", "start", "stop", "", "fraction", "b", "Lpm0;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "TextDrawStyleKt")
/* renamed from: a16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37713a16 {
    /* renamed from: b */
    public static final H16 m71975b(H16 start, H16 stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        boolean z = start instanceof C38913c30;
        if (!z && !(stop instanceof C38913c30)) {
            return H16.f12733a.m104494b(C50619vm0.m8176e(start.mo61991a(), stop.mo61991a(), f));
        }
        if (z && (stop instanceof C38913c30)) {
            return H16.f12733a.m104495a((AbstractC37727a30) HN5.m103925c(((C38913c30) start).mo61990d(), ((C38913c30) stop).mo61990d(), f), YM2.m75146a(start.mo61988h(), stop.mo61988h(), f));
        }
        return (H16) HN5.m103925c(start, stop, f);
    }

    /* renamed from: c */
    public static final long m71974c(long j, float f) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return C47063pm0.m18743m(j, C47063pm0.m18740p(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j;
    }

    /* renamed from: d */
    public static final float m71973d(float f, Function0<Float> function0) {
        return Float.isNaN(f) ? function0.invoke().floatValue() : f;
    }
}
