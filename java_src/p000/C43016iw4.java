package p000;

import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p040di.NamedConstantsKt;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import p000.C43609jw4;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Liw4;", "", "Ljw4$a;", "eventType", "", NamedConstantsKt.APPLICATION_ID, "", "LSi;", "appEvents", "Landroid/os/Bundle;", C17296a.f69688o, "Lorg/json/JSONArray;", "b", "", "c", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: iw4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43016iw4 {

    /* renamed from: a */
    public static final String f91743a;

    /* renamed from: b */
    public static final C43016iw4 f91744b = new C43016iw4();

    static {
        String simpleName = C43609jw4.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f91743a = simpleName;
    }

    private C43016iw4() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Bundle m31594a(C43609jw4.EnumC25045a eventType, String applicationId, List<C7508Si> appEvents) {
        if (TD0.m84203d(C43016iw4.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, applicationId);
            if (C43609jw4.EnumC25045a.CUSTOM_APP_EVENTS == eventType) {
                JSONArray m31593b = f91744b.m31593b(appEvents, applicationId);
                if (m31593b.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", m31593b.toString());
            }
            return bundle;
        } catch (Throwable th) {
            TD0.m84205b(th, C43016iw4.class);
            return null;
        }
    }

    /* renamed from: b */
    public final JSONArray m31593b(List<C7508Si> list, String str) {
        List<C7508Si> mutableList;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
            C33306Hg1.m103539d(mutableList);
            boolean m31592c = m31592c(str);
            for (C7508Si c7508Si : mutableList) {
                if (c7508Si.m85021f()) {
                    if ((!c7508Si.m85020g()) || (c7508Si.m85020g() && m31592c)) {
                        jSONArray.put(c7508Si.m85022e());
                    }
                } else {
                    String str2 = f91743a;
                    C52364yi6.m2853Y(str2, "Event with invalid checksum: " + c7508Si);
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final boolean m31592c(String str) {
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            C34512Mk1 m93517o = C34746Nk1.m93517o(str, false);
            if (m93517o == null) {
                return false;
            }
            return m93517o.m94966p();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }
}
