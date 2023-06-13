package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LSc0;", "", "", "birdCode", "taskId", "", "directCancel", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "c", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Sc0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35843Sc0 {

    /* renamed from: a */
    public final String f33957a;

    /* renamed from: b */
    public final String f33958b;

    /* renamed from: c */
    public final boolean f33959c;

    public C35843Sc0(String birdCode, String taskId, boolean z) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f33957a = birdCode;
        this.f33958b = taskId;
        this.f33959c = z;
    }

    public static /* synthetic */ C35843Sc0 copy$default(C35843Sc0 c35843Sc0, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c35843Sc0.f33957a;
        }
        if ((i & 2) != 0) {
            str2 = c35843Sc0.f33958b;
        }
        if ((i & 4) != 0) {
            z = c35843Sc0.f33959c;
        }
        return c35843Sc0.m85203a(str, str2, z);
    }

    /* renamed from: a */
    public final C35843Sc0 m85203a(String birdCode, String taskId, boolean z) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return new C35843Sc0(birdCode, taskId, z);
    }

    /* renamed from: b */
    public final String m85202b() {
        return this.f33957a;
    }

    /* renamed from: c */
    public final boolean m85201c() {
        return this.f33959c;
    }

    /* renamed from: d */
    public final String m85200d() {
        return this.f33958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C35843Sc0) {
            C35843Sc0 c35843Sc0 = (C35843Sc0) obj;
            return Intrinsics.areEqual(this.f33957a, c35843Sc0.f33957a) && Intrinsics.areEqual(this.f33958b, c35843Sc0.f33958b) && this.f33959c == c35843Sc0.f33959c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f33957a.hashCode() * 31) + this.f33958b.hashCode()) * 31;
        boolean z = this.f33959c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f33957a;
        String str2 = this.f33958b;
        boolean z = this.f33959c;
        return "CancelTaskData(birdCode=" + str + ", taskId=" + str2 + ", directCancel=" + z + ")";
    }
}
