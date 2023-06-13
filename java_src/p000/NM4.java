package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\u001a\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0007"}, m28432d2 = {"T", "Lio/reactivex/F;", "LHM4;", "Lio/reactivex/p;", "Ltg1;", "b", DateTokenConverter.CONVERTER_KEY, "co.bird.android.api"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResponse+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response+.kt\nco/bird/api/extension/Response_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n1282#2,2:63\n*S KotlinDebug\n*F\n+ 1 Response+.kt\nco/bird/api/extension/Response_Kt\n*L\n48#1:63,2\n*E\n"})
/* renamed from: NM4 */
/* loaded from: classes4.dex */
public final class NM4 {

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "LHM4;", "response", "Lio/reactivex/u;", "Ltg1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: NM4$a */
    /* loaded from: classes4.dex */
    public static final class C5561a extends Lambda implements Function1<HM4<T>, InterfaceC24574u<? extends C49375tg1>> {

        /* renamed from: g */
        public static final C5561a f24484g = new C5561a();

        public C5561a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends C49375tg1> invoke(HM4<T> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                return AbstractC24507p.m32024u();
            }
            int m103943b = response.m103943b();
            String m103938g = response.m103938g();
            Intrinsics.checkNotNullExpressionValue(m103938g, "response.message()");
            return AbstractC24507p.m32068G(new C49375tg1(m103943b, m103938g, null, null, 12, null));
        }
    }

    /* renamed from: b */
    public static final <T> AbstractC24507p<C49375tg1> m94019b(AbstractC23442F<HM4<T>> abstractC23442F) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        final C5561a c5561a = C5561a.f24484g;
        AbstractC24507p m33163C = abstractC23442F.m33163C(new InterfaceC23492o() { // from class: MM4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m94018c;
                m94018c = NM4.m94018c(Function1.this, obj);
                return m94018c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33163C, "flatMapMaybe { response …nse.message()))\n    }\n  }");
        return m33163C;
    }

    /* renamed from: c */
    public static final InterfaceC24574u m94018c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public static final <T> C49375tg1 m94017d(HM4<T> hm4) {
        String string;
        String str;
        EnumC44039kg1 enumC44039kg1;
        Intrinsics.checkNotNullParameter(hm4, "<this>");
        ResponseBody m103940e = hm4.m103940e();
        if (m103940e != null && (string = m103940e.string()) != null) {
            JSONObject jSONObject = new JSONObject(string);
            try {
                int i = jSONObject.getInt(PaymentMethodOptionsParams.Blik.PARAM_CODE);
                String message = jSONObject.getString("message");
                if (jSONObject.has("title")) {
                    str = jSONObject.getString("title");
                } else {
                    str = null;
                }
                if (jSONObject.has("reason")) {
                    String string2 = jSONObject.getString("reason");
                    EnumC44039kg1[] values = EnumC44039kg1.values();
                    int length = values.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        enumC44039kg1 = values[i2];
                        if (Intrinsics.areEqual(enumC44039kg1.name(), string2)) {
                            break;
                        }
                    }
                }
                enumC44039kg1 = null;
                Intrinsics.checkNotNullExpressionValue(message, "message");
                return new C49375tg1(i, message, str, enumC44039kg1);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
