package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LgA5;", "LEu4;", "", "message", "", "networkError", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "<init>", "(Ljava/lang/String;Z)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gA5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41377gA5 implements InterfaceC32733Eu4 {

    /* renamed from: a */
    public final String f81721a;

    /* renamed from: b */
    public final boolean f81722b;

    public C41377gA5() {
        this(null, false, 3, null);
    }

    public static /* synthetic */ C41377gA5 copy$default(C41377gA5 c41377gA5, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c41377gA5.f81721a;
        }
        if ((i & 2) != 0) {
            z = c41377gA5.f81722b;
        }
        return c41377gA5.m39955a(str, z);
    }

    /* renamed from: a */
    public final C41377gA5 m39955a(String str, boolean z) {
        return new C41377gA5(str, z);
    }

    /* renamed from: b */
    public final String m39954b() {
        return this.f81721a;
    }

    /* renamed from: c */
    public final boolean m39953c() {
        return this.f81722b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C41377gA5) {
            C41377gA5 c41377gA5 = (C41377gA5) obj;
            return Intrinsics.areEqual(this.f81721a, c41377gA5.f81721a) && this.f81722b == c41377gA5.f81722b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f81721a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f81722b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f81721a;
        boolean z = this.f81722b;
        return "ShowError(message=" + str + ", networkError=" + z + ")";
    }

    public C41377gA5(String str, boolean z) {
        this.f81721a = str;
        this.f81722b = z;
    }

    public /* synthetic */ C41377gA5(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
