package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR(\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\f\u0010\u0015R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000f\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LRU5;", "", "", "valid", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "LfM2;", "LfM2;", "marker", "LPT;", "b", "LPT;", "validPinDescriptor", "c", "invalidPinDescriptor", "Lcom/google/android/gms/maps/model/LatLng;", "value", "getPosition", "()Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/google/android/gms/maps/model/LatLng;)V", "position", "isVisible", "()Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)V", "<init>", "(LfM2;)V", "suggest-a-nest_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuggestionPinMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionPinMarker.kt\nco/bird/android/feature/suggestanest/SuggestionPinMarker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* renamed from: RU5 */
/* loaded from: classes3.dex */
public final class RU5 {

    /* renamed from: a */
    public final C40889fM2 f32105a;

    /* renamed from: b */
    public C6378PT f32106b;

    /* renamed from: c */
    public C6378PT f32107c;

    public RU5(C40889fM2 c40889fM2) {
        this.f32105a = c40889fM2;
    }

    /* renamed from: a */
    public final void m86697a(boolean z, Context context) {
        C6378PT c6378pt;
        Intrinsics.checkNotNullParameter(context, "context");
        if (z) {
            c6378pt = this.f32106b;
            if (c6378pt == null) {
                c6378pt = C40788fB0.icon$default(context, C44042kg4.ic_suggestion_pin_valid, null, null, 6, null);
                this.f32106b = c6378pt;
            }
        } else {
            c6378pt = this.f32107c;
            if (c6378pt == null) {
                c6378pt = C40788fB0.icon$default(context, C44042kg4.ic_suggestion_pin_invalid, null, null, 6, null);
                this.f32107c = c6378pt;
            }
        }
        C40889fM2 c40889fM2 = this.f32105a;
        if (c40889fM2 != null) {
            c40889fM2.m41523k(c6378pt);
        }
    }

    /* renamed from: b */
    public final void m86696b(LatLng latLng) {
        C40889fM2 c40889fM2;
        if (latLng == null || (c40889fM2 = this.f32105a) == null) {
            return;
        }
        c40889fM2.m41521m(latLng);
    }

    /* renamed from: c */
    public final void m86695c(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            C40889fM2 c40889fM2 = this.f32105a;
            if (c40889fM2 == null) {
                return;
            }
            c40889fM2.m41516r(bool.booleanValue());
        }
    }
}
