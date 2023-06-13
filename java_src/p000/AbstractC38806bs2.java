package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import p000.InterfaceC34588Ms5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0003#$%¨\u0006&"}, m28432d2 = {"Lbs2;", "LMs5;", "", "index", "", "f", "name", "c", "", "i", "", "", "g", DateTokenConverter.CONVERTER_KEY, "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "toString", C17296a.f69688o, "LMs5;", "getElementDescriptor", "()LMs5;", "elementDescriptor", "b", "I", "e", "()I", "elementsCount", "LTs5;", "getKind", "()LTs5;", "kind", "<init>", "(LMs5;)V", "Lqo;", "LRr2;", "LB24;", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/* renamed from: bs2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC38806bs2 implements InterfaceC34588Ms5 {

    /* renamed from: a */
    public final InterfaceC34588Ms5 f59656a;

    /* renamed from: b */
    public final int f59657b;

    public /* synthetic */ AbstractC38806bs2(InterfaceC34588Ms5 interfaceC34588Ms5, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34588Ms5);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: b */
    public boolean mo10462b() {
        return InterfaceC34588Ms5.C5406a.m94638c(this);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: c */
    public int mo10461c(String name) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(name, "name");
        intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: d */
    public InterfaceC34588Ms5 mo10460d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f59656a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo10456h() + " expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: e */
    public int mo10459e() {
        return this.f59657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC38806bs2)) {
            return false;
        }
        AbstractC38806bs2 abstractC38806bs2 = (AbstractC38806bs2) obj;
        if (Intrinsics.areEqual(this.f59656a, abstractC38806bs2.f59656a) && Intrinsics.areEqual(mo10456h(), abstractC38806bs2.mo10456h())) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: f */
    public String mo10458f(int i) {
        return String.valueOf(i);
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: g */
    public List<Annotation> mo10457g(int i) {
        boolean z;
        List<Annotation> emptyList;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo10456h() + " expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC34588Ms5
    public List<Annotation> getAnnotations() {
        return InterfaceC34588Ms5.C5406a.m94640a(this);
    }

    @Override // p000.InterfaceC34588Ms5
    public AbstractC36226Ts5 getKind() {
        return RS5.C7172b.f32057a;
    }

    public int hashCode() {
        return (this.f59656a.hashCode() * 31) + mo10456h().hashCode();
    }

    @Override // p000.InterfaceC34588Ms5
    /* renamed from: i */
    public boolean mo10455i(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo10456h() + " expects only non-negative indices").toString());
    }

    @Override // p000.InterfaceC34588Ms5
    public boolean isInline() {
        return InterfaceC34588Ms5.C5406a.m94639b(this);
    }

    public String toString() {
        return mo10456h() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.f59656a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public AbstractC38806bs2(InterfaceC34588Ms5 interfaceC34588Ms5) {
        this.f59656a = interfaceC34588Ms5;
        this.f59657b = 1;
    }
}
