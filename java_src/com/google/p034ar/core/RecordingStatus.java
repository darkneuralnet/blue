package com.google.p034ar.core;

import com.google.p034ar.core.exceptions.FatalException;
/* renamed from: com.google.ar.core.RecordingStatus */
/* loaded from: classes6.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    RecordingStatus(int i) {
        this.nativeCode = i;
    }

    public static RecordingStatus forNumber(int i) {
        RecordingStatus[] values;
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        throw new FatalException("Unexpected value for native RecordingStatus, value=" + i);
    }
}
