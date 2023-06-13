package p000;

import androidx.compose.material.ripple.RippleHostView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Ltb5;", "", "LFd;", "indicationInstance", "Landroidx/compose/material/ripple/RippleHostView;", "rippleHostView", "", DateTokenConverter.CONVERTER_KEY, "b", C17296a.f69688o, "c", "", "Ljava/util/Map;", "indicationToHostMap", "hostToIndicationMap", "<init>", "()V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* renamed from: tb5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49329tb5 {

    /* renamed from: a */
    public final Map<C2364Fd, RippleHostView> f110779a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<RippleHostView, C2364Fd> f110780b = new LinkedHashMap();

    /* renamed from: a */
    public final C2364Fd m12020a(RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        return this.f110780b.get(rippleHostView);
    }

    /* renamed from: b */
    public final RippleHostView m12019b(C2364Fd indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        return this.f110779a.get(indicationInstance);
    }

    /* renamed from: c */
    public final void m12018c(C2364Fd indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.f110779a.get(indicationInstance);
        if (rippleHostView != null) {
            this.f110780b.remove(rippleHostView);
        }
        this.f110779a.remove(indicationInstance);
    }

    /* renamed from: d */
    public final void m12017d(C2364Fd indicationInstance, RippleHostView rippleHostView) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        Intrinsics.checkNotNullParameter(rippleHostView, "rippleHostView");
        this.f110779a.put(indicationInstance, rippleHostView);
        this.f110780b.put(rippleHostView, indicationInstance);
    }
}
