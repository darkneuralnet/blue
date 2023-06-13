package com.amazonaws.services.p026s3.internal;

import com.amazonaws.services.p026s3.OnFileDelete;
import java.io.File;
/* renamed from: com.amazonaws.services.s3.internal.PartCreationEvent */
/* loaded from: classes3.dex */
public class PartCreationEvent {
    private final OnFileDelete fileDeleteObserver;
    private final boolean isLastPart;
    private final File part;
    private final int partNumber;

    public PartCreationEvent(File file, int i, boolean z, OnFileDelete onFileDelete) {
        if (file != null) {
            this.part = file;
            this.partNumber = i;
            this.isLastPart = z;
            this.fileDeleteObserver = onFileDelete;
            return;
        }
        throw new IllegalArgumentException("part must not be specified");
    }

    public OnFileDelete getFileDeleteObserver() {
        return this.fileDeleteObserver;
    }

    public File getPart() {
        return this.part;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public boolean isLastPart() {
        return this.isLastPart;
    }
}
