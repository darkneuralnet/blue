package p000;

import p000.AbstractC34373Lu6;
/* renamed from: sZ6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48718sZ6 extends AbstractC34373Lu6.AbstractC5125a {

    /* renamed from: a */
    public String f108986a;

    /* renamed from: b */
    public String f108987b;

    /* renamed from: c */
    public String f108988c;

    @Override // p000.AbstractC34373Lu6.AbstractC5125a
    /* renamed from: a */
    public final AbstractC34373Lu6 mo14000a() {
        String str;
        String str2;
        String str3 = this.f108986a;
        if (str3 != null && (str = this.f108987b) != null && (str2 = this.f108988c) != null) {
            return new A17(str3, str, str2, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f108986a == null) {
            sb.append(" configLabel");
        }
        if (this.f108987b == null) {
            sb.append(" modelDir");
        }
        if (this.f108988c == null) {
            sb.append(" languageHint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // p000.AbstractC34373Lu6.AbstractC5125a
    /* renamed from: b */
    public final AbstractC34373Lu6.AbstractC5125a mo13999b(String str) {
        if (str != null) {
            this.f108988c = str;
            return this;
        }
        throw new NullPointerException("Null languageHint");
    }

    @Override // p000.AbstractC34373Lu6.AbstractC5125a
    /* renamed from: c */
    public final AbstractC34373Lu6.AbstractC5125a mo13998c(String str) {
        if (str != null) {
            this.f108987b = str;
            return this;
        }
        throw new NullPointerException("Null modelDir");
    }

    /* renamed from: d */
    public final AbstractC34373Lu6.AbstractC5125a m13997d(String str) {
        if (str != null) {
            this.f108986a = str;
            return this;
        }
        throw new NullPointerException("Null configLabel");
    }
}
