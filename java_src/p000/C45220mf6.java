package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J-\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lmf6;", "", "", "b", "", "uploadedUrls", "", "uploadSuccessful", "", "statusText", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "I", "()I", "<init>", "(Ljava/util/List;ZI)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadedPhotosViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadedPhotosViewModel.kt\nco/bird/android/feature/transferorder/viewmodels/UploadedPhotosViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1789#2,3:16\n*S KotlinDebug\n*F\n+ 1 UploadedPhotosViewModel.kt\nco/bird/android/feature/transferorder/viewmodels/UploadedPhotosViewModel\n*L\n12#1:16,3\n*E\n"})
/* renamed from: mf6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45220mf6 {

    /* renamed from: a */
    public final List<String> f98531a;

    /* renamed from: b */
    public final boolean f98532b;

    /* renamed from: c */
    public final int f98533c;

    public C45220mf6(List<String> uploadedUrls, boolean z, int i) {
        Intrinsics.checkNotNullParameter(uploadedUrls, "uploadedUrls");
        this.f98531a = uploadedUrls;
        this.f98532b = z;
        this.f98533c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45220mf6 copy$default(C45220mf6 c45220mf6, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = c45220mf6.f98531a;
        }
        if ((i2 & 2) != 0) {
            z = c45220mf6.f98532b;
        }
        if ((i2 & 4) != 0) {
            i = c45220mf6.f98533c;
        }
        return c45220mf6.m25209a(list, z, i);
    }

    /* renamed from: a */
    public final C45220mf6 m25209a(List<String> uploadedUrls, boolean z, int i) {
        Intrinsics.checkNotNullParameter(uploadedUrls, "uploadedUrls");
        return new C45220mf6(uploadedUrls, z, i);
    }

    /* renamed from: b */
    public final String m25208b() {
        Iterator<T> it;
        String str = "";
        while (this.f98531a.iterator().hasNext()) {
            str = str + ((String) it.next());
        }
        return str;
    }

    /* renamed from: c */
    public final int m25207c() {
        return this.f98533c;
    }

    /* renamed from: d */
    public final boolean m25206d() {
        return this.f98532b;
    }

    /* renamed from: e */
    public final List<String> m25205e() {
        return this.f98531a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45220mf6) {
            C45220mf6 c45220mf6 = (C45220mf6) obj;
            return Intrinsics.areEqual(this.f98531a, c45220mf6.f98531a) && this.f98532b == c45220mf6.f98532b && this.f98533c == c45220mf6.f98533c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f98531a.hashCode() * 31;
        boolean z = this.f98532b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + Integer.hashCode(this.f98533c);
    }

    public String toString() {
        List<String> list = this.f98531a;
        boolean z = this.f98532b;
        int i = this.f98533c;
        return "UploadedPhotosViewModel(uploadedUrls=" + list + ", uploadSuccessful=" + z + ", statusText=" + i + ")";
    }
}
