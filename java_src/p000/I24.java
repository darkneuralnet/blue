package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC34588Ms5;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LI24;", "LMs5;", "", "index", "", "f", "name", "c", "", "i", DateTokenConverter.CONVERTER_KEY, "", "", "g", "toString", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", C17296a.f69688o, "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "LE24;", "b", "LE24;", "j", "()LE24;", "kind", "e", "()I", "elementsCount", "<init>", "(Ljava/lang/String;LE24;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I24 */
/* loaded from: classes8.dex */
public final class I24 implements InterfaceC34588Ms5 {

    /* renamed from: a */
    public final String f14368a;

    /* renamed from: b */
    public final E24 f14369b;

    public I24(String serialName, E24 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f14368a = serialName;
        this.f14369b = kind;
    }

    /* renamed from: a */
    public final Void m103041a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: b */
    public boolean mo10462b() {
        return InterfaceC34588Ms5.C5406a.m94638c(this);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: c */
    public int mo10461c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m103041a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        m103041a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I24)) {
            return false;
        }
        I24 i24 = (I24) obj;
        if (Intrinsics.areEqual(mo10456h(), i24.mo10456h()) && Intrinsics.areEqual(getKind(), i24.getKind())) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        m103041a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        m103041a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return InterfaceC34588Ms5.C5406a.m94640a(this);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f14368a;
    }

    public int hashCode() {
        return mo10456h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        m103041a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return InterfaceC34588Ms5.C5406a.m94639b(this);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: j */
    public E24 getKind() {
        return this.f14369b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + mo10456h() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
