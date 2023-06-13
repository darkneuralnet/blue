package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: sx2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48953sx2 {

    /* renamed from: c */
    public static final C48953sx2 f109598c = new C28486a().m13365a();

    /* renamed from: a */
    public final String f109599a;

    /* renamed from: b */
    public final List<C46582ox2> f109600b;

    /* renamed from: sx2$a */
    /* loaded from: classes5.dex */
    public static final class C28486a {

        /* renamed from: a */
        public String f109601a = "";

        /* renamed from: b */
        public List<C46582ox2> f109602b = new ArrayList();

        /* renamed from: a */
        public C48953sx2 m13365a() {
            return new C48953sx2(this.f109601a, Collections.unmodifiableList(this.f109602b));
        }

        /* renamed from: b */
        public C28486a m13364b(List<C46582ox2> list) {
            this.f109602b = list;
            return this;
        }

        /* renamed from: c */
        public C28486a m13363c(String str) {
            this.f109601a = str;
            return this;
        }
    }

    public C48953sx2(String str, List<C46582ox2> list) {
        this.f109599a = str;
        this.f109600b = list;
    }

    /* renamed from: c */
    public static C28486a m13366c() {
        return new C28486a();
    }

    @K94(tag = 2)
    /* renamed from: a */
    public List<C46582ox2> m13368a() {
        return this.f109600b;
    }

    @K94(tag = 1)
    /* renamed from: b */
    public String m13367b() {
        return this.f109599a;
    }
}
