package p000;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
/* renamed from: yi2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC52360yi2 {
    /* renamed from: a */
    public boolean mo2888a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: b */
    public double mo2887b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public C41095fi2 m2886c() {
        if (m2881o()) {
            return (C41095fi2) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C36133Ti2 m2885e() {
        if (m2879u()) {
            return (C36133Ti2) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: f */
    public C37537Zi2 m2884f() {
        if (m2878v()) {
            return (C37537Zi2) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public long mo2883h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: j */
    public String mo2882j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: o */
    public boolean m2881o() {
        return this instanceof C41095fi2;
    }

    /* renamed from: s */
    public boolean m2880s() {
        return this instanceof C35431Qi2;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            KR5.m98884b(this, jsonWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: u */
    public boolean m2879u() {
        return this instanceof C36133Ti2;
    }

    /* renamed from: v */
    public boolean m2878v() {
        return this instanceof C37537Zi2;
    }
}
