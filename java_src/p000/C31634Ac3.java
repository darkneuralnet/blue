package p000;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;
import p000.C38054ac3;
/* renamed from: Ac3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C31634Ac3 {

    /* renamed from: a */
    public static final Object f864a = new Object();

    /* renamed from: b */
    public static final Object f865b = new Object();

    private C31634Ac3() {
    }

    /* renamed from: a */
    public static Bundle m115440a(C38054ac3.C10762a c10762a) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat m71092d = c10762a.m71092d();
        if (m71092d != null) {
            i = m71092d.m67697j();
        } else {
            i = 0;
        }
        bundle2.putInt("icon", i);
        bundle2.putCharSequence("title", c10762a.m71088h());
        bundle2.putParcelable("actionIntent", c10762a.m71095a());
        if (c10762a.m71093c() != null) {
            bundle = new Bundle(c10762a.m71093c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c10762a.m71094b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m115438c(c10762a.m71091e()));
        bundle2.putBoolean("showsUserInterface", c10762a.m71089g());
        bundle2.putInt("semanticAction", c10762a.m71090f());
        return bundle2;
    }

    /* renamed from: b */
    public static Bundle m115439b(C37422Yv4 c37422Yv4) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c37422Yv4.m73984i());
        bundle.putCharSequence("label", c37422Yv4.m73985h());
        bundle.putCharSequenceArray("choices", c37422Yv4.m73988e());
        bundle.putBoolean("allowFreeFormInput", c37422Yv4.m73990c());
        bundle.putBundle("extras", c37422Yv4.m73986g());
        Set<String> m73989d = c37422Yv4.m73989d();
        if (m73989d != null && !m73989d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m73989d.size());
            for (String str : m73989d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: c */
    public static Bundle[] m115438c(C37422Yv4[] c37422Yv4Arr) {
        if (c37422Yv4Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c37422Yv4Arr.length];
        for (int i = 0; i < c37422Yv4Arr.length; i++) {
            bundleArr[i] = m115439b(c37422Yv4Arr[i]);
        }
        return bundleArr;
    }
}
