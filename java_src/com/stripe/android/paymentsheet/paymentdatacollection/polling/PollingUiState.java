package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "", "durationRemaining", "Lkotlin/time/Duration;", "pollingState", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDurationRemaining-UwyO8pc", "()J", "J", "getPollingState", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;", "component1", "component1-UwyO8pc", "component2", "copy", "copy-VtjQ1oo", "(JLcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingUiState;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PollingUiState {
    private final long durationRemaining;
    private final PollingState pollingState;

    public /* synthetic */ PollingUiState(long j, PollingState pollingState, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, pollingState);
    }

    /* renamed from: copy-VtjQ1oo$default  reason: not valid java name */
    public static /* synthetic */ PollingUiState m116619copyVtjQ1oo$default(PollingUiState pollingUiState, long j, PollingState pollingState, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pollingUiState.durationRemaining;
        }
        if ((i & 2) != 0) {
            pollingState = pollingUiState.pollingState;
        }
        return pollingUiState.m116621copyVtjQ1oo(j, pollingState);
    }

    /* renamed from: component1-UwyO8pc  reason: not valid java name */
    public final long m116620component1UwyO8pc() {
        return this.durationRemaining;
    }

    public final PollingState component2() {
        return this.pollingState;
    }

    /* renamed from: copy-VtjQ1oo  reason: not valid java name */
    public final PollingUiState m116621copyVtjQ1oo(long j, PollingState pollingState) {
        Intrinsics.checkNotNullParameter(pollingState, "pollingState");
        return new PollingUiState(j, pollingState, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollingUiState) {
            PollingUiState pollingUiState = (PollingUiState) obj;
            return Duration.m118145equalsimpl0(this.durationRemaining, pollingUiState.durationRemaining) && this.pollingState == pollingUiState.pollingState;
        }
        return false;
    }

    /* renamed from: getDurationRemaining-UwyO8pc  reason: not valid java name */
    public final long m116622getDurationRemainingUwyO8pc() {
        return this.durationRemaining;
    }

    public final PollingState getPollingState() {
        return this.pollingState;
    }

    public int hashCode() {
        return (Duration.m118168hashCodeimpl(this.durationRemaining) * 31) + this.pollingState.hashCode();
    }

    public String toString() {
        String m118189toStringimpl = Duration.m118189toStringimpl(this.durationRemaining);
        PollingState pollingState = this.pollingState;
        return "PollingUiState(durationRemaining=" + m118189toStringimpl + ", pollingState=" + pollingState + ")";
    }

    private PollingUiState(long j, PollingState pollingState) {
        this.durationRemaining = j;
        this.pollingState = pollingState;
    }

    public /* synthetic */ PollingUiState(long j, PollingState pollingState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? PollingState.Active : pollingState, null);
    }
}
