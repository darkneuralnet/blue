package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LFS1;", "", "", C17296a.f69688o, "title", "", "Lco/bird/android/model/IdToolOption;", "options", "LGS1;", "type", "b", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "LGS1;", DateTokenConverter.CONVERTER_KEY, "()LGS1;", "<init>", "(Ljava/lang/String;Ljava/util/List;LGS1;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FS1 */
/* loaded from: classes3.dex */
public final class FS1 {

    /* renamed from: a */
    public final String f9382a;

    /* renamed from: b */
    public final List<IdToolOption> f9383b;

    /* renamed from: c */
    public final GS1 f9384c;

    /* JADX WARN: Multi-variable type inference failed */
    public FS1(String title, List<? extends IdToolOption> options, GS1 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f9382a = title;
        this.f9383b = options;
        this.f9384c = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FS1 copy$default(FS1 fs1, String str, List list, GS1 gs1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fs1.f9382a;
        }
        if ((i & 2) != 0) {
            list = fs1.f9383b;
        }
        if ((i & 4) != 0) {
            gs1 = fs1.f9384c;
        }
        return fs1.m107139b(str, list, gs1);
    }

    /* renamed from: a */
    public final String m107140a() {
        return this.f9382a;
    }

    /* renamed from: b */
    public final FS1 m107139b(String title, List<? extends IdToolOption> options, GS1 type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FS1(title, options, type);
    }

    /* renamed from: c */
    public final List<IdToolOption> m107138c() {
        return this.f9383b;
    }

    /* renamed from: d */
    public final GS1 m107137d() {
        return this.f9384c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FS1) {
            FS1 fs1 = (FS1) obj;
            return Intrinsics.areEqual(this.f9382a, fs1.f9382a) && Intrinsics.areEqual(this.f9383b, fs1.f9383b) && this.f9384c == fs1.f9384c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f9382a.hashCode() * 31) + this.f9383b.hashCode()) * 31) + this.f9384c.hashCode();
    }

    public String toString() {
        String str = this.f9382a;
        List<IdToolOption> list = this.f9383b;
        GS1 gs1 = this.f9384c;
        return "IdToolsOperation(title=" + str + ", options=" + list + ", type=" + gs1 + ")";
    }
}
