package p000;

import android.annotation.SuppressLint;
import com.amazonaws.services.p026s3.Headers;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.C20127et;
/* renamed from: Bp */
/* loaded from: classes.dex */
public abstract class AbstractC0749Bp {

    /* renamed from: a */
    public static final List<Integer> f2920a = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: Bp$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0750a {
        /* renamed from: a */
        public abstract AbstractC0749Bp mo42459a();

        /* renamed from: b */
        public final AbstractC0749Bp m113456b() {
            AbstractC0749Bp mo42459a = mo42459a();
            String str = "";
            if (mo42459a.mo42462c() == -1) {
                str = " audioSource";
            }
            if (mo42459a.mo42460e() <= 0) {
                str = str + " sampleRate";
            }
            if (mo42459a.mo42461d() <= 0) {
                str = str + " channelCount";
            }
            if (mo42459a.mo42463b() == -1) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return mo42459a;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:" + str);
        }

        /* renamed from: c */
        public abstract AbstractC0750a mo42458c(int i);

        /* renamed from: d */
        public abstract AbstractC0750a mo42457d(int i);

        /* renamed from: e */
        public abstract AbstractC0750a mo42456e(int i);

        /* renamed from: f */
        public abstract AbstractC0750a mo42455f(int i);
    }

    @SuppressLint({Headers.RANGE})
    /* renamed from: a */
    public static AbstractC0750a m113457a() {
        return new C20127et.C20129b().mo42457d(-1).mo42455f(-1).mo42456e(-1).mo42458c(-1);
    }

    /* renamed from: b */
    public abstract int mo42463b();

    /* renamed from: c */
    public abstract int mo42462c();

    /* renamed from: d */
    public abstract int mo42461d();

    /* renamed from: e */
    public abstract int mo42460e();
}
