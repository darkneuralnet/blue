package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b/\u00100J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0011\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\u0018\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00038\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\r8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010)¨\u00061"}, m28432d2 = {"LNs5;", "LMs5;", "Lj80;", "", "index", "", "", "g", DateTokenConverter.CONVERTER_KEY, "", "name", "c", "f", "", "i", "", LegacyRepairType.OTHER_KEY, "equals", "toString", "hashCode", C17296a.f69688o, "LMs5;", "j", "()LMs5;", "original", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "getAnnotations", "()Ljava/util/List;", "annotations", "e", "()I", "elementsCount", "isInline", "()Z", "LTs5;", "getKind", "()LTs5;", "kind", "isNullable", "<init>", "(LMs5;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ns5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34822Ns5 implements InterfaceC34588Ms5, InterfaceC43131j80 {

    /* renamed from: a */
    public final InterfaceC34588Ms5 f25322a;

    /* renamed from: b */
    public final String f25323b;

    /* renamed from: c */
    public final Set<String> f25324c;

    public C34822Ns5(InterfaceC34588Ms5 original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f25322a = original;
        this.f25323b = original.mo10456h() + '?';
        this.f25324c = C47503qW3.m17475a(original);
    }

    @Override // p000.InterfaceC43131j80
    /* renamed from: a */
    public Set<String> mo31065a() {
        return this.f25324c;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: b */
    public boolean mo10462b() {
        return true;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: c */
    public int mo10461c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f25322a.mo10461c(name);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        return this.f25322a.mo10460d(i);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return this.f25322a.mo10459e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C34822Ns5) && Intrinsics.areEqual(this.f25322a, ((C34822Ns5) obj).f25322a)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        return this.f25322a.mo10458f(i);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        return this.f25322a.mo10457g(i);
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return this.f25322a.getAnnotations();
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return this.f25322a.getKind();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f25323b;
    }

    public int hashCode() {
        return this.f25322a.hashCode() * 31;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        return this.f25322a.mo10455i(i);
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return this.f25322a.isInline();
    }

    /* renamed from: j */
    public final InterfaceC34588Ms5 m93250j() {
        return this.f25322a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25322a);
        sb.append('?');
        return sb.toString();
    }
}
