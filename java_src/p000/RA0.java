package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0011\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010%R\u0014\u0010*\u001a\u00020'8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LRA0;", "LMs5;", "", "index", "", "", "g", DateTokenConverter.CONVERTER_KEY, "", "name", "c", "f", "", "i", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "toString", C17296a.f69688o, "LMs5;", "original", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "getAnnotations", "()Ljava/util/List;", "annotations", "e", "()I", "elementsCount", "isInline", "()Z", "isNullable", "LTs5;", "getKind", "()LTs5;", "kind", "<init>", "(LMs5;Lkotlin/reflect/KClass;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RA0 */
/* loaded from: classes8.dex */
public final class RA0 implements InterfaceC34588Ms5 {

    /* renamed from: a */
    public final InterfaceC34588Ms5 f31618a;
    @JvmField

    /* renamed from: b */
    public final KClass<?> f31619b;

    /* renamed from: c */
    public final String f31620c;

    public RA0(InterfaceC34588Ms5 original, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f31618a = original;
        this.f31619b = kClass;
        this.f31620c = original.mo10456h() + Typography.less + kClass.getSimpleName() + Typography.greater;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: b */
    public boolean mo10462b() {
        return this.f31618a.mo10462b();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: c */
    public int mo10461c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f31618a.mo10461c(name);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        return this.f31618a.mo10460d(i);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return this.f31618a.mo10459e();
    }

    public boolean equals(Object obj) {
        RA0 ra0;
        if (obj instanceof RA0) {
            ra0 = (RA0) obj;
        } else {
            ra0 = null;
        }
        if (ra0 == null || !Intrinsics.areEqual(this.f31618a, ra0.f31618a) || !Intrinsics.areEqual(ra0.f31619b, this.f31619b)) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        return this.f31618a.mo10458f(i);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        return this.f31618a.mo10457g(i);
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return this.f31618a.getAnnotations();
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return this.f31618a.getKind();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: h */
    public String mo10456h() {
        return this.f31620c;
    }

    public int hashCode() {
        return (this.f31619b.hashCode() * 31) + mo10456h().hashCode();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        return this.f31618a.mo10455i(i);
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return this.f31618a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f31619b + ", original: " + this.f31618a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
