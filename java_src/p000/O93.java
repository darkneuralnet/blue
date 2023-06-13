package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC34588Ms5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LO93;", "LMs5;", "", "index", "", "f", "name", "c", "", "i", DateTokenConverter.CONVERTER_KEY, "", "", "g", "toString", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "", C17296a.f69688o, "LTs5;", "b", "LTs5;", "getKind", "()LTs5;", "kind", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "e", "()I", "elementsCount", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O93 */
/* loaded from: classes8.dex */
public final class O93 implements InterfaceC34588Ms5 {

    /* renamed from: a */
    public static final O93 f26066a = new O93();

    /* renamed from: b */
    public static final AbstractC36226Ts5 f26067b = RS5.C7174d.f32059a;

    /* renamed from: c */
    public static final String f26068c = "kotlin.Nothing";

    private O93() {
    }

    /* renamed from: a */
    public final Void m92709a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m92709a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        m92709a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        m92709a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        m92709a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return InterfaceC34588Ms5.C5406a.m94640a(this);
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return f26067b;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return f26068c;
    }

    public int hashCode() {
        return mo10456h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        m92709a();
        throw new KotlinNothingValueException();
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return InterfaceC34588Ms5.C5406a.m94639b(this);
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
