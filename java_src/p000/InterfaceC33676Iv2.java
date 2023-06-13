package p000;

import co.bird.api.response.WireLocalizationOtaPullResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u000b"}, m28432d2 = {"LIv2;", "", "", "birdProjectId", "Lorg/joda/time/DateTime;", "appBuildTimestamp", "languageIso", "cacheBuster", "Lio/reactivex/F;", "Lco/bird/api/response/WireLocalizationOtaPullResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iv2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC33676Iv2 {
    @NA1("api/v1/localization/ota/pull")
    /* renamed from: a */
    AbstractC23442F<WireLocalizationOtaPullResponse> m101480a(@InterfaceC37017Xc4("bird_project_id") String str, @InterfaceC37017Xc4("modified_after") DateTime dateTime, @InterfaceC37017Xc4("language_iso") String str2, @InterfaceC37017Xc4("cache_buster") String str3);
}
