package p000;

import android.media.MediaCodec;
import androidx.camera.core.C11236l;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: nW5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45726nW5 {

    /* renamed from: a */
    public final boolean f100090a;

    public C45726nW5() {
        boolean z;
        if (P21.m91043a(OV5.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f100090a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ int m23563c(C11213q.AbstractC11218e abstractC11218e, C11213q.AbstractC11218e abstractC11218e2) {
        return m23564b(abstractC11218e.mo69319d()) - m23564b(abstractC11218e2.mo69319d());
    }

    /* renamed from: b */
    public final int m23564b(DeferrableSurface deferrableSurface) {
        if (deferrableSurface.m69468e() == MediaCodec.class) {
            return 2;
        }
        if (deferrableSurface.m69468e() == C11236l.class) {
            return 0;
        }
        return 1;
    }

    /* renamed from: d */
    public void m23562d(List<C11213q.AbstractC11218e> list) {
        if (!this.f100090a) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: mW5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m23563c;
                m23563c = C45726nW5.this.m23563c((C11213q.AbstractC11218e) obj, (C11213q.AbstractC11218e) obj2);
                return m23563c;
            }
        });
    }
}
