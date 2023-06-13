package androidx.constraintlayout.core.parser;
/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: b */
    public final String f53490b;

    /* renamed from: c */
    public final int f53491c;

    /* renamed from: d */
    public final String f53492d;

    /* renamed from: a */
    public String m68222a() {
        return this.f53490b + " (" + this.f53492d + " at line " + this.f53491c + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + m68222a();
    }
}
