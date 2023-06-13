package com.stripe.android.financialconnections.features.manualentry;

import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryStates;", "La24;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "Lkotlin/sequences/Sequence;", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "", "getCount", "()I", "count", "<init>", "()V", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ManualEntryStates implements InterfaceC37721a24<ManualEntryState> {
    public static final Companion Companion = new Companion(null);
    private final Sequence<ManualEntryState> values;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryStates$Companion;", "", "()V", "default", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: default  reason: not valid java name */
        public final ManualEntryState m116397default() {
            return new ManualEntryState(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }

        private Companion() {
        }
    }

    public ManualEntryStates() {
        Sequence<ManualEntryState> sequenceOf;
        sequenceOf = SequencesKt__SequencesKt.sequenceOf(Companion.m116397default());
        this.values = sequenceOf;
    }

    @Override // p000.InterfaceC37721a24
    public int getCount() {
        return super.getCount();
    }

    @Override // p000.InterfaceC37721a24
    public Sequence<ManualEntryState> getValues() {
        return this.values;
    }
}
