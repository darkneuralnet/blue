package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.ComplaintType;
import co.bird.android.model.RideTrack;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireLocationKt;
import co.bird.api.request.ComplaintSchemaType;
import co.bird.api.request.UpdateComplaintPhotosBody;
import co.bird.api.response.Complaint;
import co.bird.api.response.ComplaintSchemaResponse;
import co.bird.api.response.RidesNearbyResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010'\u001a\u00020$\u0012\b\b\u0002\u0010*\u001a\u00020(¢\u0006\u0004\b+\u0010,J*\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016Jn\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J*\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00050\b0\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u0006-"}, m28432d2 = {"LLp0;", "LKp0;", "Lbr4;", "", "id", "", "photos", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/Complaint;", "e", "Lco/bird/api/request/ComplaintSchemaType;", "type", "birdId", "Lco/bird/api/response/ComplaintSchemaResponse;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireLocation;", "location", "Lco/bird/android/model/constant/MapMode;", "role", "Lco/bird/android/model/ComplaintType;", "complaintType", "photoUrls", "rideId", "", "", "reasonsAndMessages", "", "fromTaskList", "g", "Lco/bird/api/response/RidesNearbyResponse;", "c", "", "time", "Lco/bird/android/model/RideTrack;", "f", "LJp0;", "b", "LJp0;", "communityClient", "Lm46;", "Lm46;", "timeProvider", "<init>", "(LJp0;Lm46;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommunityManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommunityManagerImpl.kt\nco/bird/android/app/manager/CommunityManagerImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,57:1\n483#2,7:58\n*S KotlinDebug\n*F\n+ 1 CommunityManagerImpl.kt\nco/bird/android/app/manager/CommunityManagerImpl\n*L\n47#1:58,7\n*E\n"})
/* renamed from: Lp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34322Lp0 implements InterfaceC34088Kp0, InterfaceC38798br4 {

    /* renamed from: b */
    public final InterfaceC33854Jp0 f22089b;

    /* renamed from: c */
    public final InterfaceC44876m46 f22090c;

    public C34322Lp0(InterfaceC33854Jp0 communityClient, InterfaceC44876m46 timeProvider) {
        Intrinsics.checkNotNullParameter(communityClient, "communityClient");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f22089b = communityClient;
        this.f22090c = timeProvider;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    @Override // p000.InterfaceC34088Kp0
    /* renamed from: d */
    public AbstractC23442F<ComplaintSchemaResponse> mo96320d(ComplaintSchemaType type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        AbstractC23442F<ComplaintSchemaResponse> m96316h = m96316h(this.f22089b.m99659e(type.toString(), str));
        Intrinsics.checkNotNullExpressionValue(m96316h, "communityClient.getCompl…g(), birdId).schedulers()");
        return m96316h;
    }

    @Override // p000.InterfaceC34088Kp0
    /* renamed from: e */
    public AbstractC23442F<HM4<Complaint>> mo96319e(String id, List<String> photos) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(photos, "photos");
        AbstractC23442F<HM4<Complaint>> m96316h = m96316h(this.f22089b.m99661c(new UpdateComplaintPhotosBody(id, photos)));
        Intrinsics.checkNotNullExpressionValue(m96316h, "communityClient.updatePh…id, photos)).schedulers()");
        return m96316h;
    }

    @Override // p000.InterfaceC34088Kp0
    /* renamed from: f */
    public AbstractC23442F<HM4<List<RideTrack>>> mo96318f(String rideId, long j) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        AbstractC23442F<HM4<List<RideTrack>>> m96316h = m96316h(this.f22089b.m99663a(rideId, j));
        Intrinsics.checkNotNullExpressionValue(m96316h, "communityClient.getNearb…ideId, time).schedulers()");
        return m96316h;
    }

    @Override // p000.InterfaceC34088Kp0
    /* renamed from: g */
    public AbstractC23442F<HM4<Complaint>> mo96317g(String str, WireLocation location, MapMode role, ComplaintType complaintType, List<String> list, String str2, Map<String, ? extends Object> reasonsAndMessages, boolean z) {
        Map mapOf;
        Map plus;
        boolean z2;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(complaintType, "complaintType");
        Intrinsics.checkNotNullParameter(reasonsAndMessages, "reasonsAndMessages");
        String lowerCase = role.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        String lowerCase2 = complaintType.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("bird_id", str), TuplesKt.m28425to("location", WireLocationKt.getLatLngString(location)), TuplesKt.m28425to("date", String.valueOf(this.f22090c.mo26387a())), TuplesKt.m28425to("role", lowerCase), TuplesKt.m28425to("community_complaint_type", lowerCase2), TuplesKt.m28425to("photo_urls", list), TuplesKt.m28425to("ride_id", str2), TuplesKt.m28425to("from_task_list", Boolean.valueOf(z)));
        InterfaceC33854Jp0 interfaceC33854Jp0 = this.f22089b;
        plus = MapsKt__MapsKt.plus(mapOf, reasonsAndMessages);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : plus.entrySet()) {
            if (entry.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        AbstractC23442F<HM4<Complaint>> m96316h = m96316h(interfaceC33854Jp0.m99662b(linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(m96316h, "communityClient\n      .s…ll })\n      .schedulers()");
        return m96316h;
    }

    /* renamed from: h */
    public <T> AbstractC23442F<T> m96316h(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Override // p000.InterfaceC34088Kp0
    /* renamed from: c */
    public AbstractC23442F<HM4<RidesNearbyResponse>> mo96321c(WireLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        AbstractC23442F<HM4<RidesNearbyResponse>> m96316h = m96316h(this.f22089b.m99660d(location.getLatitude(), location.getLongitude()));
        Intrinsics.checkNotNullExpressionValue(m96316h, "communityClient.getRides…n.longitude).schedulers()");
        return m96316h;
    }

    public /* synthetic */ C34322Lp0(InterfaceC33854Jp0 interfaceC33854Jp0, InterfaceC44876m46 interfaceC44876m46, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC33854Jp0, (i & 2) != 0 ? InterfaceC44876m46.f97292a.m26388a() : interfaceC44876m46);
    }
}
