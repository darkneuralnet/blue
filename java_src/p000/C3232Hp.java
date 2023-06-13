package p000;

import android.media.AudioRecord;
/* renamed from: Hp */
/* loaded from: classes.dex */
public class C3232Hp {
    /* renamed from: a */
    public static int m103416a(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, C4250Jp.m99664a(i2), i3);
    }

    /* renamed from: b */
    public static boolean m103415b(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && m103416a(i, i2, i3) > 0;
    }
}
