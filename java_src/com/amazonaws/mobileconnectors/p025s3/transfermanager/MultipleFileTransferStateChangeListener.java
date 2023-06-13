package com.amazonaws.mobileconnectors.p025s3.transfermanager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.Transfer;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.internal.MultipleFileTransfer;
import com.amazonaws.mobileconnectors.p025s3.transfermanager.internal.TransferStateChangeListener;
import java.util.concurrent.CountDownLatch;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.MultipleFileTransferStateChangeListener */
/* loaded from: classes2.dex */
final class MultipleFileTransferStateChangeListener implements TransferStateChangeListener {
    private final CountDownLatch latch;
    private final MultipleFileTransfer<?> multipleFileTransfer;

    public MultipleFileTransferStateChangeListener(CountDownLatch countDownLatch, MultipleFileTransfer<?> multipleFileTransfer) {
        this.latch = countDownLatch;
        this.multipleFileTransfer = multipleFileTransfer;
    }

    @Override // com.amazonaws.mobileconnectors.p025s3.transfermanager.internal.TransferStateChangeListener
    public void transferStateChanged(Transfer transfer, Transfer.TransferState transferState) {
        try {
            this.latch.await();
            synchronized (this.multipleFileTransfer) {
                if (this.multipleFileTransfer.getState() != transferState && !this.multipleFileTransfer.isDone()) {
                    Transfer.TransferState transferState2 = Transfer.TransferState.InProgress;
                    if (transferState == transferState2) {
                        this.multipleFileTransfer.setState(transferState);
                    } else if (this.multipleFileTransfer.getMonitor().isDone()) {
                        this.multipleFileTransfer.collateFinalState();
                    } else {
                        this.multipleFileTransfer.setState(transferState2);
                    }
                }
            }
        } catch (InterruptedException unused) {
            throw new AmazonClientException("Couldn't wait for all downloads to be queued");
        }
    }
}
