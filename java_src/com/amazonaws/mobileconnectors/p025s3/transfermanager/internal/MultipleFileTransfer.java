package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.Transfer;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.TransferProgress;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.MultipleFileTransfer */
/* loaded from: classes2.dex */
public abstract class MultipleFileTransfer<T extends Transfer> extends AbstractTransfer {
    private AtomicBoolean subTransferStarted;
    protected final Collection<? extends T> subTransfers;

    /* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.MultipleFileTransfer$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C168901 {

        /* renamed from: $SwitchMap$com$amazonaws$mobileconnectors$s3$transfermanager$Transfer$TransferState */
        static final /* synthetic */ int[] f68566x1ed3aa65;

        static {
            int[] iArr = new int[Transfer.TransferState.values().length];
            f68566x1ed3aa65 = iArr;
            try {
                iArr[Transfer.TransferState.Waiting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68566x1ed3aa65[Transfer.TransferState.InProgress.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68566x1ed3aa65[Transfer.TransferState.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68566x1ed3aa65[Transfer.TransferState.Canceled.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68566x1ed3aa65[Transfer.TransferState.Failed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MultipleFileTransfer(String str, TransferProgress transferProgress, ProgressListenerChain progressListenerChain, Collection<? extends T> collection) {
        super(str, transferProgress, progressListenerChain);
        this.subTransferStarted = new AtomicBoolean(false);
        this.subTransfers = collection;
    }

    public void collateFinalState() {
        boolean z = false;
        for (T t : this.subTransfers) {
            Transfer.TransferState state = t.getState();
            Transfer.TransferState transferState = Transfer.TransferState.Failed;
            if (state == transferState) {
                setState(transferState);
                return;
            } else if (t.getState() == Transfer.TransferState.Canceled) {
                z = true;
            }
        }
        if (z) {
            setState(Transfer.TransferState.Canceled);
        } else {
            setState(Transfer.TransferState.Completed);
        }
    }

    @Override // com.amazonaws.mobileconnectors.p025s3.transfermanager.internal.AbstractTransfer
    public void setState(Transfer.TransferState transferState) {
        super.setState(transferState);
        int i = C168901.f68566x1ed3aa65[transferState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            fireProgressEvent(8);
                            return;
                        }
                        return;
                    }
                    fireProgressEvent(16);
                    return;
                }
                fireProgressEvent(4);
                return;
            } else if (this.subTransferStarted.compareAndSet(false, true)) {
                fireProgressEvent(2);
                return;
            } else {
                return;
            }
        }
        fireProgressEvent(1);
    }
}
