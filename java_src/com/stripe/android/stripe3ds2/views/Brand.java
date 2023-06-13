package com.stripe.android.stripe3ds2.views;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.C19336R;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\u0001\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB1\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand;", "", "directoryServerName", "", "drawableResId", "", "nameResId", "shouldStretch", "", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;Z)V", "getDirectoryServerName$3ds2sdk_release", "()Ljava/lang/String;", "getDrawableResId$3ds2sdk_release", "()I", "getNameResId$3ds2sdk_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShouldStretch$3ds2sdk_release", "()Z", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "UnionPay", "Unknown", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum Brand {
    Visa("visa", C19336R.C19337drawable.stripe_3ds2_ic_visa, Integer.valueOf(C19336R.string.stripe_3ds2_brand_visa), false, 8, null),
    Mastercard("mastercard", C19336R.C19337drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(C19336R.string.stripe_3ds2_brand_mastercard), false, 8, null),
    Amex("american_express", C19336R.C19337drawable.stripe_3ds2_ic_amex, Integer.valueOf(C19336R.string.stripe_3ds2_brand_amex), false, 8, null),
    Discover("discover", C19336R.C19337drawable.stripe_3ds2_ic_discover, Integer.valueOf(C19336R.string.stripe_3ds2_brand_discover), false, 8, null),
    CartesBancaires("cartes_bancaires", C19336R.C19337drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(C19336R.string.stripe_3ds2_brand_cartesbancaires), true),
    UnionPay("unionpay", C19336R.C19337drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(C19336R.string.stripe_3ds2_brand_unionpay), false, 8, null),
    Unknown("unknown", C19336R.C19337drawable.stripe_3ds2_ic_unknown, null, false, 8, null);
    
    public static final Companion Companion = new Companion(null);
    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;
    private final boolean shouldStretch;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand$Companion;", "", "()V", "lookup", "Lcom/stripe/android/stripe3ds2/views/Brand;", "directoryServerName", "", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "lookup$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Brand lookup$3ds2sdk_release(String directoryServerName, ErrorReporter errorReporter) {
            Brand brand;
            Brand m116783constructorimpl;
            CharSequence trim;
            boolean equals;
            Intrinsics.checkNotNullParameter(directoryServerName, "directoryServerName");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Brand[] values = Brand.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    brand = values[i];
                    String directoryServerName$3ds2sdk_release = brand.getDirectoryServerName$3ds2sdk_release();
                    trim = StringsKt__StringsKt.trim((CharSequence) directoryServerName);
                    equals = StringsKt__StringsJVMKt.equals(directoryServerName$3ds2sdk_release, trim.toString(), true);
                    if (equals) {
                        break;
                    }
                    i++;
                } else {
                    brand = null;
                    break;
                }
            }
            if (brand != null) {
                m116783constructorimpl = Result.m116783constructorimpl(brand);
            } else {
                Brand[] values2 = Brand.values();
                ArrayList arrayList = new ArrayList(values2.length);
                for (Brand brand2 : values2) {
                    arrayList.add(brand2.getDirectoryServerName$3ds2sdk_release());
                }
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(new SDKRuntimeException("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + CoreConstants.DOT, null, 2, null)));
            }
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                errorReporter.reportError(m116786exceptionOrNullimpl);
            }
            Brand brand3 = Brand.Unknown;
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = brand3;
            }
            return (Brand) m116783constructorimpl;
        }

        private Companion() {
        }
    }

    Brand(String str, int i, Integer num, boolean z) {
        this.directoryServerName = str;
        this.drawableResId = i;
        this.nameResId = num;
        this.shouldStretch = z;
    }

    public final String getDirectoryServerName$3ds2sdk_release() {
        return this.directoryServerName;
    }

    public final int getDrawableResId$3ds2sdk_release() {
        return this.drawableResId;
    }

    public final Integer getNameResId$3ds2sdk_release() {
        return this.nameResId;
    }

    public final boolean getShouldStretch$3ds2sdk_release() {
        return this.shouldStretch;
    }

    /* synthetic */ Brand(String str, int i, Integer num, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, num, (i2 & 8) != 0 ? false : z);
    }
}
