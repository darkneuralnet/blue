package com.google.android.libraries.vision.visionkit.pipeline;

import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzaqw;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
@Keep
@UsedByNative("pipeline_jni.cc")
/* loaded from: classes6.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final KS7 statusCode;
    private final String statusMessage;
    private final C49945ud8 visionkitStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PipelineException(int i, String str) {
        super(r3.toString());
        String m98857a = KS7.values()[i].m98857a();
        StringBuilder sb = new StringBuilder(String.valueOf(m98857a).length() + 2 + String.valueOf(str).length());
        sb.append(m98857a);
        sb.append(": ");
        sb.append(str);
        this.statusCode = KS7.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List<C42909il7> getComponentStatuses() {
        C49945ud8 c49945ud8 = this.visionkitStatus;
        return c49945ud8 != null ? c49945ud8.m9932H() : AbstractC50453vU8.m8605s();
    }

    public LP8<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            List m112230c = CR8.m112231b(ROOT_CAUSE_DELIMITER).m112230c(this.statusMessage);
            if (m112230c instanceof List) {
                if (!m112230c.isEmpty()) {
                    obj = m112230c.get(m112230c.size() - 1);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator it = m112230c.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            return LP8.m96957e((String) obj);
        }
        return LP8.m96958d();
    }

    public KS7 getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PipelineException(C49945ud8 c49945ud8) {
        super(r4.toString());
        String m98857a = KS7.values()[c49945ud8.m9936D()].m98857a();
        String m9933G = c49945ud8.m9933G();
        StringBuilder sb = new StringBuilder(String.valueOf(m98857a).length() + 2 + String.valueOf(m9933G).length());
        sb.append(m98857a);
        sb.append(": ");
        sb.append(m9933G);
        this.statusCode = KS7.values()[c49945ud8.m9936D()];
        this.statusMessage = c49945ud8.m9933G();
        this.visionkitStatus = c49945ud8;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public PipelineException(byte[] bArr) throws zzaqw {
        this(C49945ud8.m9934F(bArr, C53068zt7.m154a()));
    }
}
