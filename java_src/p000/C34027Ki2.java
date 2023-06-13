package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017R\u001a\u0010\u000e\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m28432d2 = {"LKi2;", "LYi2;", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "b", "Z", "c", "()Z", "isString", "LMs5;", "LMs5;", "()LMs5;", "coerceToInlineType", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "content", "body", "<init>", "(Ljava/lang/Object;ZLMs5;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
/* renamed from: Ki2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34027Ki2 extends AbstractC37303Yi2 {

    /* renamed from: b */
    public final boolean f20077b;

    /* renamed from: c */
    public final InterfaceC34588Ms5 f20078c;

    /* renamed from: d */
    public final String f20079d;

    public /* synthetic */ C34027Ki2(Object obj, boolean z, InterfaceC34588Ms5 interfaceC34588Ms5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : interfaceC34588Ms5);
    }

    @Override // p000.AbstractC37303Yi2
    /* renamed from: a */
    public String mo74434a() {
        return this.f20079d;
    }

    /* renamed from: b */
    public final InterfaceC34588Ms5 m98485b() {
        return this.f20078c;
    }

    /* renamed from: c */
    public boolean m98484c() {
        return this.f20077b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34027Ki2.class != obj.getClass()) {
            return false;
        }
        C34027Ki2 c34027Ki2 = (C34027Ki2) obj;
        if (m98484c() == c34027Ki2.m98484c() && Intrinsics.areEqual(mo74434a(), c34027Ki2.mo74434a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Boolean.hashCode(m98484c()) * 31) + mo74434a().hashCode();
    }

    @Override // p000.AbstractC37303Yi2
    public String toString() {
        if (m98484c()) {
            StringBuilder sb = new StringBuilder();
            C37964aS5.m71350c(sb, mo74434a());
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        return mo74434a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34027Ki2(Object body, boolean z, InterfaceC34588Ms5 interfaceC34588Ms5) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f20077b = z;
        this.f20078c = interfaceC34588Ms5;
        this.f20079d = body.toString();
        if (interfaceC34588Ms5 != null && !interfaceC34588Ms5.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
