package p000;

import android.net.Uri;
import com.facebook.share.internal.C17296a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, m28432d2 = {"Landroid/net/Uri;", "Ljava/io/File;", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapPresenter.kt\nco/bird/android/feature/scrap/ScrapPresenterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* renamed from: Fp5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32923Fp5 {
    /* renamed from: a */
    public static final File m106438a(Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new UnsupportedOperationException("Cannot create File because Uri has no path");
    }
}
