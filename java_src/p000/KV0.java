package p000;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"LKV0;", "LcW0;", "Landroid/net/Uri;", "resultingLink", "outerLink", "innerLink", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "()Landroid/net/Uri;", "b", "c", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KV0 */
/* loaded from: classes2.dex */
public final class KV0 extends AbstractC39181cW0 {

    /* renamed from: a */
    public final Uri f19686a;

    /* renamed from: b */
    public final Uri f19687b;

    /* renamed from: c */
    public final Uri f19688c;

    public KV0(Uri uri, Uri uri2, Uri uri3) {
        super(null);
        this.f19686a = uri;
        this.f19687b = uri2;
        this.f19688c = uri3;
    }

    public static /* synthetic */ KV0 copy$default(KV0 kv0, Uri uri, Uri uri2, Uri uri3, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = kv0.f19686a;
        }
        if ((i & 2) != 0) {
            uri2 = kv0.f19687b;
        }
        if ((i & 4) != 0) {
            uri3 = kv0.f19688c;
        }
        return kv0.m98832a(uri, uri2, uri3);
    }

    /* renamed from: a */
    public final KV0 m98832a(Uri uri, Uri uri2, Uri uri3) {
        return new KV0(uri, uri2, uri3);
    }

    /* renamed from: b */
    public final Uri m98831b() {
        return this.f19688c;
    }

    /* renamed from: c */
    public final Uri m98830c() {
        return this.f19687b;
    }

    /* renamed from: d */
    public final Uri m98829d() {
        return this.f19686a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KV0) {
            KV0 kv0 = (KV0) obj;
            return Intrinsics.areEqual(this.f19686a, kv0.f19686a) && Intrinsics.areEqual(this.f19687b, kv0.f19687b) && Intrinsics.areEqual(this.f19688c, kv0.f19688c);
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f19686a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.f19687b;
        int hashCode2 = (hashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.f19688c;
        return hashCode2 + (uri3 != null ? uri3.hashCode() : 0);
    }

    public String toString() {
        Uri uri = this.f19686a;
        Uri uri2 = this.f19687b;
        Uri uri3 = this.f19688c;
        return "DeepLink(resultingLink=" + uri + ", outerLink=" + uri2 + ", innerLink=" + uri3 + ")";
    }
}
