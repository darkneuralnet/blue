package p000;

import java.util.Map;
/* renamed from: Bk8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31945Bk8 implements D99 {

    /* renamed from: a */
    public final /* synthetic */ String f2815a;

    /* renamed from: b */
    public final /* synthetic */ C34987Ok8 f2816b;

    public C31945Bk8(C34987Ok8 c34987Ok8, String str) {
        this.f2816b = c34987Ok8;
        this.f2815a = str;
    }

    @Override // p000.D99
    public final String zza(String str) {
        Map map;
        map = this.f2816b.f27185d;
        Map map2 = (Map) map.get(this.f2815a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
