package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: Og7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34950Og7 {

    /* renamed from: a */
    public C35175Pf7 f27056a;

    /* renamed from: b */
    public C35175Pf7 f27057b;

    /* renamed from: c */
    public final List f27058c;

    public C34950Og7() {
        this.f27056a = new C35175Pf7("", 0L, null);
        this.f27057b = new C35175Pf7("", 0L, null);
        this.f27058c = new ArrayList();
    }

    /* renamed from: a */
    public final C35175Pf7 m91684a() {
        return this.f27056a;
    }

    /* renamed from: b */
    public final C35175Pf7 m91683b() {
        return this.f27057b;
    }

    /* renamed from: c */
    public final List m91682c() {
        return this.f27058c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C34950Og7 c34950Og7 = new C34950Og7(this.f27056a.clone());
        for (C35175Pf7 c35175Pf7 : this.f27058c) {
            c34950Og7.f27058c.add(c35175Pf7.clone());
        }
        return c34950Og7;
    }

    /* renamed from: d */
    public final void m91681d(C35175Pf7 c35175Pf7) {
        this.f27056a = c35175Pf7;
        this.f27057b = c35175Pf7.clone();
        this.f27058c.clear();
    }

    /* renamed from: e */
    public final void m91680e(String str, long j, Map map) {
        this.f27058c.add(new C35175Pf7(str, j, map));
    }

    /* renamed from: f */
    public final void m91679f(C35175Pf7 c35175Pf7) {
        this.f27057b = c35175Pf7;
    }

    public C34950Og7(C35175Pf7 c35175Pf7) {
        this.f27056a = c35175Pf7;
        this.f27057b = c35175Pf7.clone();
        this.f27058c = new ArrayList();
    }
}
