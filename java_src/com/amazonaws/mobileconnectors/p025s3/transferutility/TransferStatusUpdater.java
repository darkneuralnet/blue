package com.amazonaws.mobileconnectors.p025s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater */
/* loaded from: classes2.dex */
public class TransferStatusUpdater {
    private static TransferDBUtil dbUtil;
    private static TransferStatusUpdater transferStatusUpdater;
    private final Handler mainHandler;
    private final Map<Integer, TransferRecord> transfers;
    private static final Log LOGGER = LogFactory.getLog(TransferStatusUpdater.class);
    private static final HashSet<TransferState> STATES_NOT_TO_NOTIFY = new HashSet<>(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));
    static final Map<Integer, List<TransferListener>> LISTENERS = new ConcurrentHashMap<Integer, List<TransferListener>>() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater$TransferProgressListener */
    /* loaded from: classes2.dex */
    public class TransferProgressListener implements ProgressListener {
        private long bytesTransferredSoFar;
        private final TransferRecord transfer;

        public TransferProgressListener(TransferRecord transferRecord) {
            this.transfer = transferRecord;
        }

        @Override // com.amazonaws.event.ProgressListener
        public synchronized void progressChanged(ProgressEvent progressEvent) {
            if (32 == progressEvent.getEventCode()) {
                TransferStatusUpdater.LOGGER.info("Reset Event triggerred. Resetting the bytesCurrent to 0.");
                this.bytesTransferredSoFar = 0L;
            } else {
                long bytesTransferred = this.bytesTransferredSoFar + progressEvent.getBytesTransferred();
                this.bytesTransferredSoFar = bytesTransferred;
                TransferRecord transferRecord = this.transfer;
                if (bytesTransferred > transferRecord.bytesCurrent) {
                    transferRecord.bytesCurrent = bytesTransferred;
                    TransferStatusUpdater.this.updateProgress(transferRecord.f68572id, bytesTransferred, transferRecord.bytesTotal, true);
                }
            }
        }
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        dbUtil = transferDBUtil;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.transfers = new ConcurrentHashMap();
    }

    public static synchronized TransferStatusUpdater getInstance(Context context) {
        TransferStatusUpdater transferStatusUpdater2;
        synchronized (TransferStatusUpdater.class) {
            if (transferStatusUpdater == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                dbUtil = transferDBUtil;
                transferStatusUpdater = new TransferStatusUpdater(transferDBUtil);
            }
            transferStatusUpdater2 = transferStatusUpdater;
        }
        return transferStatusUpdater2;
    }

    public static void registerListener(int i, TransferListener transferListener) {
        if (transferListener != null) {
            Map<Integer, List<TransferListener>> map = LISTENERS;
            synchronized (map) {
                List<TransferListener> list = map.get(Integer.valueOf(i));
                if (list == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(transferListener);
                    map.put(Integer.valueOf(i), copyOnWriteArrayList);
                } else if (!list.contains(transferListener)) {
                    list.add(transferListener);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Listener can't be null");
    }

    public static void unregisterListener(int i, TransferListener transferListener) {
        if (transferListener != null) {
            Map<Integer, List<TransferListener>> map = LISTENERS;
            synchronized (map) {
                List<TransferListener> list = map.get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    list.remove(transferListener);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Listener can't be null");
    }

    public synchronized void addTransfer(TransferRecord transferRecord) {
        this.transfers.put(Integer.valueOf(transferRecord.f68572id), transferRecord);
    }

    public synchronized void clear() {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.clear();
        }
        this.transfers.clear();
    }

    public synchronized TransferRecord getTransfer(int i) {
        return this.transfers.get(Integer.valueOf(i));
    }

    public synchronized Map<Integer, TransferRecord> getTransfers() {
        return Collections.unmodifiableMap(this.transfers);
    }

    public synchronized ProgressListener newProgressListener(int i) {
        TransferRecord transfer;
        transfer = getTransfer(i);
        if (transfer != null) {
            Log log = LOGGER;
            log.info("Creating a new progress listener for transfer: " + i);
        } else {
            Log log2 = LOGGER;
            log2.info("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        return new TransferProgressListener(transfer);
    }

    public synchronized void removeTransfer(int i) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            map.remove(Integer.valueOf(i));
        }
        this.transfers.remove(Integer.valueOf(i));
    }

    public synchronized void removeTransferRecordFromDB(int i) {
        S3ClientReference.remove(Integer.valueOf(i));
        dbUtil.deleteTransferRecords(i);
    }

    public void throwError(final int i, final Exception exc) {
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                for (final TransferListener transferListener : list) {
                    this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public void run() {
                            transferListener.onError(i, exc);
                        }
                    });
                }
            }
        }
    }

    public synchronized void updateProgress(final int i, final long j, final long j2, boolean z) {
        TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.bytesCurrent = j;
            transferRecord.bytesTotal = j2;
        }
        dbUtil.updateBytesTransferred(i, j);
        if (!z) {
            return;
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                for (Iterator<TransferListener> it = list.iterator(); it.hasNext(); it = it) {
                    final TransferListener next = it.next();
                    this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                        @Override // java.lang.Runnable
                        public void run() {
                            next.onProgressChanged(i, j, j2);
                        }
                    });
                }
            }
        }
    }

    public synchronized void updateState(final int i, final TransferState transferState) {
        boolean contains = STATES_NOT_TO_NOTIFY.contains(transferState);
        TransferRecord transferRecord = this.transfers.get(Integer.valueOf(i));
        if (transferRecord == null) {
            if (dbUtil.updateState(i, transferState) == 0) {
                Log log = LOGGER;
                log.warn("Failed to update the status of transfer " + i);
            }
        } else {
            contains |= transferState.equals(transferRecord.state);
            transferRecord.state = transferState;
            if (dbUtil.updateTransferRecord(transferRecord) == 0) {
                Log log2 = LOGGER;
                log2.warn("Failed to update the status of transfer " + i);
            }
        }
        if (contains) {
            return;
        }
        if (TransferState.COMPLETED.equals(transferState)) {
            removeTransferRecordFromDB(i);
        }
        Map<Integer, List<TransferListener>> map = LISTENERS;
        synchronized (map) {
            List<TransferListener> list = map.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                for (final TransferListener transferListener : list) {
                    this.mainHandler.post(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                        @Override // java.lang.Runnable
                        public void run() {
                            transferListener.onStateChanged(i, transferState);
                        }
                    });
                }
                if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
                    list.clear();
                }
            }
        }
    }
}
