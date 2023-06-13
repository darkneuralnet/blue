package p000;

import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, m28432d2 = {"Lgl;", "Lco/bird/android/model/constant/MapMode;", "mode", "", C17296a.f69688o, "co.bird.android.repository.area"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: eo */
/* loaded from: classes4.dex */
public final class C20102eo {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eo$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C20103a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final String m42542a(C22454gl c22454gl, MapMode mapMode) {
        if (C20103a.$EnumSwitchMapping$0[mapMode.ordinal()] == 1) {
            return c22454gl.m37575s0().getUserRoleCode();
        }
        return mapMode.name();
    }
}
