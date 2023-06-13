package p000;

import android.os.SystemClock;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import no.nordicsemi.android.support.v18.scanner.ScanResult;
import org.joda.time.DateTime;
import org.joda.time.Instant;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lno/nordicsemi/android/support/v18/scanner/ScanResult;", "Lorg/joda/time/DateTime;", C17296a.f69688o, "interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Wk5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36856Wk5 {
    /* renamed from: a */
    public static final DateTime m77889a(ScanResult scanResult) {
        long roundToLong;
        Intrinsics.checkNotNullParameter(scanResult, "<this>");
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        roundToLong = MathKt__MathJVMKt.roundToLong(scanResult.m22431d() / 1000000.0d);
        DateTime dateTime = Instant.ofEpochMilli(currentTimeMillis + roundToLong).toDateTime();
        Intrinsics.checkNotNullExpressionValue(dateTime, "ofEpochMilli(millis).toDateTime()");
        return dateTime;
    }
}
