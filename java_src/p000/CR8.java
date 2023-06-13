package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: CR8 */
/* loaded from: classes5.dex */
public final class CR8 {

    /* renamed from: a */
    public final UO8 f4084a;

    /* renamed from: b */
    public final C42719iR8 f4085b;

    public CR8(C42719iR8 c42719iR8, byte[] bArr) {
        JO8 jo8 = JO8.f17495b;
        this.f4085b = c42719iR8;
        this.f4084a = jo8;
    }

    /* renamed from: b */
    public static CR8 m112231b(String str) {
        return new CR8(new C42719iR8("#vk "), null);
    }

    /* renamed from: c */
    public final List m112230c(CharSequence charSequence) {
        charSequence.getClass();
        YQ8 yq8 = new YQ8(this.f4085b, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (yq8.hasNext()) {
            arrayList.add((String) yq8.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
