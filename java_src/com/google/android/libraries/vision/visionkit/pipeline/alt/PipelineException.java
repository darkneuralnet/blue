package com.google.android.libraries.vision.visionkit.pipeline.alt;

import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
@Keep
@UsedByNative("pipeline_jni.cc")
/* loaded from: classes6.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final EnumC50173v07 statusCode;
    private final String statusMessage;
    private final C41299g27 visionkitStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PipelineException(int i, String str) {
        super(r0 + ": " + str);
        String m9388a = EnumC50173v07.values()[i].m9388a();
        this.statusCode = EnumC50173v07.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List<C42726iS6> getComponentStatuses() {
        C41299g27 c41299g27 = this.visionkitStatus;
        return c41299g27 != null ? c41299g27.m40254I() : X57.m77409o();
    }

    public I57<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            List m92918c = O57.m92919b(ROOT_CAUSE_DELIMITER).m92918c(this.statusMessage);
            if (m92918c instanceof List) {
                if (!m92918c.isEmpty()) {
                    obj = m92918c.get(m92918c.size() - 1);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator it = m92918c.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            return I57.m102959e((String) obj);
        }
        return I57.m102960d();
    }

    public EnumC50173v07 getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PipelineException(C41299g27 c41299g27) {
        super(r0 + ": " + r1);
        String m9388a = EnumC50173v07.values()[c41299g27.m40258E()].m9388a();
        String m40255H = c41299g27.m40255H();
        this.statusCode = EnumC50173v07.values()[c41299g27.m40258E()];
        this.statusMessage = c41299g27.m40255H();
        this.visionkitStatus = c41299g27;
    }

    @Keep
    @UsedByNative("pipeline_jni.cc")
    public PipelineException(byte[] bArr) throws zbuw {
        this(C41299g27.m40256G(bArr, C34896Oa7.m92005a()));
    }
}
