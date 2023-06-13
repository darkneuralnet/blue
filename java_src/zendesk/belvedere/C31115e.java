package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.BelvedereUi;
/* renamed from: zendesk.belvedere.e */
/* loaded from: classes8.dex */
public class C31115e implements XX1 {

    /* renamed from: a */
    public final YX1 f121844a;

    /* renamed from: b */
    public final List<MediaIntent> f121845b;

    /* renamed from: c */
    public final List<MediaResult> f121846c;

    /* renamed from: d */
    public final List<MediaResult> f121847d;

    /* renamed from: e */
    public final long f121848e;

    /* renamed from: f */
    public final boolean f121849f;

    public C31115e(Context context, BelvedereUi.UiConfig uiConfig) {
        this.f121844a = new YX1(context);
        this.f121845b = uiConfig.m863b();
        this.f121846c = uiConfig.m861d();
        this.f121847d = uiConfig.m864a();
        this.f121848e = uiConfig.m862c();
        this.f121849f = uiConfig.m859g();
    }

    @Override // p000.XX1
    /* renamed from: a */
    public boolean mo723a() {
        return mo712l() != null;
    }

    @Override // p000.XX1
    /* renamed from: b */
    public boolean mo722b() {
        return mo714j() != null;
    }

    @Override // p000.XX1
    /* renamed from: c */
    public List<MediaResult> mo721c(MediaResult mediaResult) {
        this.f121846c.remove(mediaResult);
        return this.f121846c;
    }

    @Override // p000.XX1
    /* renamed from: d */
    public boolean mo720d() {
        return this.f121849f;
    }

    @Override // p000.XX1
    /* renamed from: e */
    public boolean mo719e() {
        return mo712l() != null && this.f121844a.m74933a("com.google.android.apps.photos");
    }

    @Override // p000.XX1
    /* renamed from: f */
    public List<MediaResult> mo718f() {
        return m710n(this.f121844a.m74932b(500), m710n(this.f121847d, this.f121846c));
    }

    @Override // p000.XX1
    /* renamed from: g */
    public MediaIntent mo717g() {
        MediaIntent mo712l = mo712l();
        if (mo712l == null) {
            return null;
        }
        Intent m799a = mo712l.m799a();
        m799a.setPackage("com.google.android.apps.photos");
        m799a.setAction("android.intent.action.GET_CONTENT");
        return mo712l;
    }

    @Override // p000.XX1
    /* renamed from: h */
    public long mo716h() {
        return this.f121848e;
    }

    @Override // p000.XX1
    /* renamed from: i */
    public List<MediaResult> mo715i() {
        return this.f121846c;
    }

    @Override // p000.XX1
    /* renamed from: j */
    public MediaIntent mo714j() {
        return m711m(2);
    }

    @Override // p000.XX1
    /* renamed from: k */
    public List<MediaResult> mo713k(MediaResult mediaResult) {
        this.f121846c.add(mediaResult);
        return this.f121846c;
    }

    @Override // p000.XX1
    /* renamed from: l */
    public MediaIntent mo712l() {
        return m711m(1);
    }

    /* renamed from: m */
    public final MediaIntent m711m(int i) {
        for (MediaIntent mediaIntent : this.f121845b) {
            if (mediaIntent.m797c() == i) {
                return mediaIntent;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final List<MediaResult> m710n(List<MediaResult> list, List<MediaResult> list2) {
        HashSet hashSet = new HashSet(list.size());
        for (MediaResult mediaResult : list) {
            hashSet.add(mediaResult.m781h());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            MediaResult mediaResult2 = list2.get(size);
            if (!hashSet.contains(mediaResult2.m781h())) {
                arrayList.add(0, mediaResult2);
            }
        }
        return arrayList;
    }
}
