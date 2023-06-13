package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IN_NO_PARKING_AREA;
import co.bird.android.model.IN_NO_RIDE_AREA;
import co.bird.android.model.IN_NO_RIDE_NO_PARK_AREA;
import co.bird.android.model.IN_RESTRICTED_PARKING_AREA;
import co.bird.android.model.IN_SLOW_AREA;
import co.bird.android.model.IN_SLOW_NO_PARK_AREA;
import co.bird.android.model.OUTSIDE_SERVICE_AREA;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0005\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28432d2 = {"LFH3;", "", "isGuest", "shouldEndRide", "presentArParkingOption", "LQM4;", "e", "(LFH3;ZLjava/lang/Boolean;Z)LQM4;", C17296a.f69688o, "b", "c", "", "fine", "", "currency", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "core-base_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Py */
/* loaded from: classes2.dex */
public final class C6598Py {
    /* renamed from: a */
    public static final boolean m89229a(QM4 qm4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Intrinsics.checkNotNullParameter(qm4, "<this>");
        if (qm4 instanceof TZ1) {
            z = true;
        } else {
            z = qm4 instanceof RZ1;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = qm4 instanceof VZ1;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = qm4 instanceof ZZ1;
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = qm4 instanceof C44340lA3;
        }
        if (z4) {
            z5 = true;
        } else {
            z5 = qm4 instanceof PZ1;
        }
        if (z5) {
            z6 = true;
        } else {
            z6 = qm4 instanceof QZ1;
        }
        if (z6) {
            z7 = true;
        } else {
            z7 = qm4 instanceof WZ1;
        }
        if (z7) {
            return true;
        }
        return qm4 instanceof XZ1;
    }

    /* renamed from: b */
    public static final boolean m89228b(QM4 qm4) {
        Intrinsics.checkNotNullParameter(qm4, "<this>");
        return true;
    }

    /* renamed from: c */
    public static final boolean m89227c(QM4 qm4) {
        Intrinsics.checkNotNullParameter(qm4, "<this>");
        if (!(qm4 instanceof YZ1) && !(qm4 instanceof UZ1) && !(qm4 instanceof C44340lA3) && !(qm4 instanceof ZZ1) && !(qm4 instanceof VZ1) && !(qm4 instanceof RZ1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final String m89226d(Integer num, String str) {
        if (num == null || str == null) {
            return null;
        }
        return C51916xx1.currency$default(C51916xx1.f118396a, num.intValue(), C45097mS5.m25591o(str), null, 4, null);
    }

    /* renamed from: e */
    public static final QM4 m89225e(FH3 fh3, boolean z, Boolean bool, boolean z2) {
        C49570tz6 c49570tz6;
        String str;
        C32109Cd1 c32109Cd1;
        boolean z3;
        C32109Cd1 c32109Cd12;
        boolean z4;
        boolean z5;
        C32109Cd1 c32109Cd13;
        boolean z6;
        C33971Kc0 c33971Kc0;
        boolean z7;
        C32109Cd1 c32109Cd14;
        boolean z8;
        C32109Cd1 c32109Cd15;
        boolean z9;
        Intrinsics.checkNotNullParameter(fh3, "<this>");
        if (fh3 instanceof C49570tz6) {
            c49570tz6 = (C49570tz6) fh3;
        } else {
            c49570tz6 = null;
        }
        if (c49570tz6 != null) {
            str = m89226d(c49570tz6.m11120g(), c49570tz6.m11119h());
        } else {
            str = null;
        }
        boolean z10 = fh3 instanceof C32109Cd1;
        if (z10) {
            c32109Cd1 = (C32109Cd1) fh3;
        } else {
            c32109Cd1 = null;
        }
        boolean z11 = true;
        if (c32109Cd1 != null && c32109Cd1.m111965j()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z10) {
            c32109Cd12 = (C32109Cd1) fh3;
        } else {
            c32109Cd12 = null;
        }
        if (c32109Cd12 != null && c32109Cd12.m111964k()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z10 && !((C32109Cd1) fh3).m111963l()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z10) {
            c32109Cd13 = (C32109Cd1) fh3;
        } else {
            c32109Cd13 = null;
        }
        if (c32109Cd13 != null && c32109Cd13.m111963l()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (fh3 instanceof C33971Kc0) {
            c33971Kc0 = (C33971Kc0) fh3;
        } else {
            c33971Kc0 = null;
        }
        if (c33971Kc0 != null && c33971Kc0.m98692g()) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z10) {
            c32109Cd14 = (C32109Cd1) fh3;
        } else {
            c32109Cd14 = null;
        }
        if (c32109Cd14 != null && c32109Cd14.m111966i()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z10) {
            c32109Cd15 = (C32109Cd1) fh3;
        } else {
            c32109Cd15 = null;
        }
        if (c32109Cd15 != null && c32109Cd15.m111968g()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !Intrinsics.areEqual(bool, Boolean.FALSE)) {
            z11 = false;
        }
        if (z8) {
            return new TZ1(z);
        }
        if (z11 || z7) {
            return null;
        }
        if (z3 && !z7 && !z6) {
            return new RZ1(z, z2);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), IN_SLOW_AREA.INSTANCE)) {
            return new YZ1(z);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), IN_NO_RIDE_NO_PARK_AREA.INSTANCE)) {
            return new VZ1(z, str, z2);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), IN_SLOW_NO_PARK_AREA.INSTANCE)) {
            return new ZZ1(z, str);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), OUTSIDE_SERVICE_AREA.INSTANCE)) {
            return new C44340lA3(z, str, z2);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), IN_NO_RIDE_AREA.INSTANCE)) {
            return new UZ1(z);
        }
        if (Intrinsics.areEqual(fh3.mo11122e(), IN_NO_PARKING_AREA.INSTANCE)) {
            if (z5 && z4) {
                return new QZ1(z, z2);
            }
            if (z5) {
                return new PZ1(z, z2);
            }
            return new WZ1(z, bool);
        } else if (!(fh3.mo11122e() instanceof IN_RESTRICTED_PARKING_AREA)) {
            return null;
        } else {
            return new XZ1(z, str);
        }
    }

    public static /* synthetic */ QM4 toAlertDialog$default(FH3 fh3, boolean z, Boolean bool, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return m89225e(fh3, z, bool, z2);
    }
}
