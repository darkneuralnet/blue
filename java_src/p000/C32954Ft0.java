package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0018H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00188\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\u001d\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LFt0;", "", "", "b", "p", "c", "o", "", "v", "e", "", "j", "", "g", "", "f", "", DateTokenConverter.CONVERTER_KEY, "", "k", "", "h", "", "i", "", "l", "value", "m", "LDj2;", C17296a.f69688o, "LDj2;", "writer", "<set-?>", "Z", "()Z", "n", "(Z)V", "writingFirst", "<init>", "(LDj2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ft0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32954Ft0 {
    @JvmField

    /* renamed from: a */
    public final InterfaceC32398Dj2 f10407a;

    /* renamed from: b */
    public boolean f10408b;

    public C32954Ft0(InterfaceC32398Dj2 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f10407a = writer;
        this.f10408b = true;
    }

    /* renamed from: a */
    public final boolean m106329a() {
        return this.f10408b;
    }

    /* renamed from: b */
    public void mo86248b() {
        this.f10408b = true;
    }

    /* renamed from: c */
    public void mo86247c() {
        this.f10408b = false;
    }

    /* renamed from: d */
    public void mo91211d(byte b) {
        this.f10407a.mo23262a(b);
    }

    /* renamed from: e */
    public final void m106328e(char c) {
        this.f10407a.mo23261b(c);
    }

    /* renamed from: f */
    public void m106327f(double d) {
        this.f10407a.mo23259d(String.valueOf(d));
    }

    /* renamed from: g */
    public void m106326g(float f) {
        this.f10407a.mo23259d(String.valueOf(f));
    }

    /* renamed from: h */
    public void mo91210h(int i) {
        this.f10407a.mo23262a(i);
    }

    /* renamed from: i */
    public void mo91209i(long j) {
        this.f10407a.mo23262a(j);
    }

    /* renamed from: j */
    public final void m106325j(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f10407a.mo23259d(v);
    }

    /* renamed from: k */
    public void mo91208k(short s) {
        this.f10407a.mo23262a(s);
    }

    /* renamed from: l */
    public void m106324l(boolean z) {
        this.f10407a.mo23259d(String.valueOf(z));
    }

    /* renamed from: m */
    public void mo103244m(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f10407a.mo23260c(value);
    }

    /* renamed from: n */
    public final void m106323n(boolean z) {
        this.f10408b = z;
    }

    /* renamed from: o */
    public void mo86246o() {
    }

    /* renamed from: p */
    public void mo86245p() {
    }
}
