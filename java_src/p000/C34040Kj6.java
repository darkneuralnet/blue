package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, m28432d2 = {"LKj6;", "LpB6;", "Lg01;", "density", "Lpm2;", "layoutDirection", "", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "b", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "", "toString", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "LG32;", "<set-?>", "LEX2;", "e", "()LG32;", "f", "(LG32;)V", "value", "insets", "<init>", "(LG32;Ljava/lang/String;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n365#1:675\n365#1:676,2\n*E\n"})
/* renamed from: Kj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34040Kj6 implements InterfaceC46724pB6 {

    /* renamed from: a */
    public final String f20147a;

    /* renamed from: b */
    public final EX2 f20148b;

    public C34040Kj6(G32 insets, String name) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f20147a = name;
        m97025e = LM5.m97025e(insets, null, 2, null);
        this.f20148b = m97025e;
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: a */
    public int mo8257a(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return m98342e().m105886c();
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: b */
    public int mo8256b(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return m98342e().m105888a();
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: c */
    public int mo8255c(InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return m98342e().m105885d();
    }

    @Override // p000.InterfaceC46724pB6
    /* renamed from: d */
    public int mo8254d(InterfaceC41273g01 density, EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return m98342e().m105887b();
    }

    /* renamed from: e */
    public final G32 m98342e() {
        return (G32) this.f20148b.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34040Kj6)) {
            return false;
        }
        return Intrinsics.areEqual(m98342e(), ((C34040Kj6) obj).m98342e());
    }

    /* renamed from: f */
    public final void m98341f(G32 g32) {
        Intrinsics.checkNotNullParameter(g32, "<set-?>");
        this.f20148b.setValue(g32);
    }

    public int hashCode() {
        return this.f20147a.hashCode();
    }

    public String toString() {
        return this.f20147a + "(left=" + m98342e().m105887b() + ", top=" + m98342e().m105885d() + ", right=" + m98342e().m105886c() + ", bottom=" + m98342e().m105888a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
