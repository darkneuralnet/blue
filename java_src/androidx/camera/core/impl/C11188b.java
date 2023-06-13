package androidx.camera.core.impl;

import androidx.camera.core.impl.C11213q;
import java.util.List;
/* renamed from: androidx.camera.core.impl.b */
/* loaded from: classes.dex */
public final class C11188b extends C11213q.AbstractC11218e {

    /* renamed from: a */
    public final DeferrableSurface f52569a;

    /* renamed from: b */
    public final List<DeferrableSurface> f52570b;

    /* renamed from: c */
    public final String f52571c;

    /* renamed from: d */
    public final int f52572d;

    /* renamed from: androidx.camera.core.impl.b$b */
    /* loaded from: classes.dex */
    public static final class C11190b extends C11213q.AbstractC11218e.AbstractC11219a {

        /* renamed from: a */
        public DeferrableSurface f52573a;

        /* renamed from: b */
        public List<DeferrableSurface> f52574b;

        /* renamed from: c */
        public String f52575c;

        /* renamed from: d */
        public Integer f52576d;

        @Override // androidx.camera.core.impl.C11213q.AbstractC11218e.AbstractC11219a
        /* renamed from: a */
        public C11213q.AbstractC11218e mo69317a() {
            String str = "";
            if (this.f52573a == null) {
                str = " surface";
            }
            if (this.f52574b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f52576d == null) {
                str = str + " surfaceGroupId";
            }
            if (str.isEmpty()) {
                return new C11188b(this.f52573a, this.f52574b, this.f52575c, this.f52576d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.C11213q.AbstractC11218e.AbstractC11219a
        /* renamed from: b */
        public C11213q.AbstractC11218e.AbstractC11219a mo69316b(String str) {
            this.f52575c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.C11213q.AbstractC11218e.AbstractC11219a
        /* renamed from: c */
        public C11213q.AbstractC11218e.AbstractC11219a mo69315c(List<DeferrableSurface> list) {
            if (list != null) {
                this.f52574b = list;
                return this;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }

        @Override // androidx.camera.core.impl.C11213q.AbstractC11218e.AbstractC11219a
        /* renamed from: d */
        public C11213q.AbstractC11218e.AbstractC11219a mo69314d(int i) {
            this.f52576d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C11213q.AbstractC11218e.AbstractC11219a m69456e(DeferrableSurface deferrableSurface) {
            if (deferrableSurface != null) {
                this.f52573a = deferrableSurface;
                return this;
            }
            throw new NullPointerException("Null surface");
        }
    }

    @Override // androidx.camera.core.impl.C11213q.AbstractC11218e
    /* renamed from: b */
    public String mo69321b() {
        return this.f52571c;
    }

    @Override // androidx.camera.core.impl.C11213q.AbstractC11218e
    /* renamed from: c */
    public List<DeferrableSurface> mo69320c() {
        return this.f52570b;
    }

    @Override // androidx.camera.core.impl.C11213q.AbstractC11218e
    /* renamed from: d */
    public DeferrableSurface mo69319d() {
        return this.f52569a;
    }

    @Override // androidx.camera.core.impl.C11213q.AbstractC11218e
    /* renamed from: e */
    public int mo69318e() {
        return this.f52572d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11213q.AbstractC11218e)) {
            return false;
        }
        C11213q.AbstractC11218e abstractC11218e = (C11213q.AbstractC11218e) obj;
        if (this.f52569a.equals(abstractC11218e.mo69319d()) && this.f52570b.equals(abstractC11218e.mo69320c()) && ((str = this.f52571c) != null ? str.equals(abstractC11218e.mo69321b()) : abstractC11218e.mo69321b() == null) && this.f52572d == abstractC11218e.mo69318e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f52569a.hashCode() ^ 1000003) * 1000003) ^ this.f52570b.hashCode()) * 1000003;
        String str = this.f52571c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f52572d;
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f52569a + ", sharedSurfaces=" + this.f52570b + ", physicalCameraId=" + this.f52571c + ", surfaceGroupId=" + this.f52572d + "}";
    }

    public C11188b(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i) {
        this.f52569a = deferrableSurface;
        this.f52570b = list;
        this.f52571c = str;
        this.f52572d = i;
    }
}
