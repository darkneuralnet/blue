package p000;

import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import com.facebook.share.internal.C17296a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\tH\u0002¨\u0006\r"}, m28432d2 = {"", "Lco/bird/android/model/constant/AssetManagerType;", "manager", "Lorg/joda/time/DateTime;", "manifestDate", "downloadUrl", "mediaType", "filePath", "downloadedAt", "LNo;", C17296a.f69688o, "Lco/bird/android/model/LocalAsset;", "c", "local-asset_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocalAssetManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalAssetManagerImpl.kt\nco/bird/android/manager/localasset/LocalAssetManagerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n1#2:329\n*E\n"})
/* renamed from: Lu2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34369Lu2 {
    /* renamed from: a */
    public static final C5698No m96209a(String str, AssetManagerType assetManagerType, DateTime dateTime, String str2, String str3, String str4, DateTime dateTime2) {
        return new C5698No(str, assetManagerType, null, str3, str4, null, dateTime2, dateTime, str2, 36, null);
    }

    /* renamed from: c */
    public static final LocalAsset m96207c(C5698No c5698No) {
        String m93390g = c5698No.m93390g();
        AssetManagerType m93389h = c5698No.m93389h();
        if (c5698No.m93392e() == null) {
            return null;
        }
        File file = new File(c5698No.m93392e());
        String m93387j = c5698No.m93387j();
        Long m93391f = c5698No.m93391f();
        String m93395b = c5698No.m93395b();
        DateTime m93393d = c5698No.m93393d();
        if (m93393d == null) {
            return null;
        }
        return new LocalAsset(m93390g, m93389h, file, m93391f, m93387j, m93395b, c5698No.m93388i(), m93393d, c5698No.m93394c());
    }
}
