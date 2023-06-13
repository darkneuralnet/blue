package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.EntityInstance;
import com.google.android.filament.LightManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\u001a\u000e\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002\u001a\u000e\u0010\u0006\u001a\u00020\u0005*\u00060\u0001j\u0002`\u0002\"\u001d\u0010\n\u001a\u00060\u0001j\u0002`\u0007*\u00060\u0001j\u0002`\u00028G¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0019\u0010\u000e\u001a\u00020\u000b*\u00060\u0001j\u0002`\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"4\u0010\u0016\u001a\u00060\u000fj\u0002`\u0010*\u00060\u0001j\u0002`\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"4\u0010\u001a\u001a\u00060\u000fj\u0002`\u0017*\u00060\u0001j\u0002`\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015\",\u0010 \u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\"4\u0010'\u001a\u00060!j\u0002`\"*\u00060\u0001j\u0002`\u00022\n\u0010\u0011\u001a\u00060!j\u0002`\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\",\u0010-\u001a\u00020(*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\",\u00100\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f\",\u00103\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001f\",\u00106\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001f\",\u00109\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001f\",\u0010<\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001f\",\u0010?\u001a\u00020\u001b*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u001d\"\u0004\b>\u0010\u001f*\n\u0010@\"\u00020\u00012\u00020\u0001*\n\u0010A\"\u00020\u00012\u00020\u0001¨\u0006B"}, m28432d2 = {"Lcom/google/android/filament/LightManager$Builder;", "", "Lio/github/sceneview/light/Light;", C17296a.f69688o, "b", "", "c", "Lio/github/sceneview/light/LightInstance;", "h", "(I)I", "instance", "Lcom/google/android/filament/LightManager$Type;", "o", "(I)Lcom/google/android/filament/LightManager$Type;", "type", "Lhu1;", "Lio/github/sceneview/math/Position;", "value", "k", "(I)Lhu1;", "t", "(ILhu1;)V", "position", "Lio/github/sceneview/math/Direction;", "e", "r", "direction", "", "i", "(I)F", "s", "(IF)V", "intensity", "Liu1;", "Lio/github/sceneview/utils/Color;", DateTokenConverter.CONVERTER_KEY, "(I)Liu1;", "q", "(ILiu1;)V", "color", "", "p", "(I)Z", "setShadowCaster", "(IZ)V", "isShadowCaster", "f", "setFalloff", "falloff", "m", "setSunHaloFalloff", "sunHaloFalloff", "n", "setSunHaloSize", "sunHaloSize", "l", "setSunAngularRadius", "sunAngularRadius", "g", "setInnerConeAngle", "innerConeAngle", "j", "setOuterConeAngle", "outerConeAngle", "Light", "LightInstance", "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Nq2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34801Nq2 {
    /* renamed from: a */
    public static final int m93307a(LightManager.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        int create = C39939dl1.m43783d().create();
        builder.build(C39939dl1.m43784c(), create);
        return create;
    }

    /* renamed from: b */
    public static final int m93306b(int i) {
        LightManager.Builder spotLightCone = new LightManager.Builder(m93293o(i)).castShadows(m93292p(i)).position(m93297k(i).m35576g(), m93297k(i).m35575h(), m93297k(i).m35574i()).direction(m93303e(i).m35576g(), m93303e(i).m35575h(), m93303e(i).m35574i()).intensity(m93299i(i)).color(m93304d(i).m31660e(), m93304d(i).m31659f(), m93304d(i).m31658g()).falloff(m93302f(i)).sunHaloFalloff(m93295m(i)).sunHaloSize(m93294n(i)).sunAngularRadius(m93296l(i)).spotLightCone(m93301g(i), m93298j(i));
        Intrinsics.checkNotNullExpressionValue(spotLightCone, "Builder(type)\n    .castS…oneAngle, outerConeAngle)");
        return m93307a(spotLightCone);
    }

    /* renamed from: c */
    public static final void m93305c(int i) {
        try {
            Result.Companion companion = Result.Companion;
            C39939dl1.m43784c().destroyEntity(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        try {
            C39939dl1.m43784c().getEntityManager().destroy(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th2));
        }
        try {
            C39939dl1.m43781f().destroy(i);
            Result.m116783constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th3));
        }
    }

    /* renamed from: d */
    public static final C42993iu1 m93304d(int i) {
        float[] fArr = new float[3];
        C39939dl1.m43781f().getColor(m93300h(i), fArr);
        return C50027um0.m9788f(fArr);
    }

    /* renamed from: e */
    public static final C42400hu1 m93303e(int i) {
        float[] fArr = new float[3];
        C39939dl1.m43781f().getDirection(m93300h(i), fArr);
        return C41491gN2.m39553l(fArr);
    }

    /* renamed from: f */
    public static final float m93302f(int i) {
        return C39939dl1.m43781f().getFalloff(m93300h(i));
    }

    /* renamed from: g */
    public static final float m93301g(int i) {
        return C39939dl1.m43781f().getInnerConeAngle(m93300h(i));
    }

    @EntityInstance
    /* renamed from: h */
    public static final int m93300h(int i) {
        return C39939dl1.m43781f().getInstance(i);
    }

    /* renamed from: i */
    public static final float m93299i(int i) {
        return C39939dl1.m43781f().getIntensity(m93300h(i));
    }

    /* renamed from: j */
    public static final float m93298j(int i) {
        return C39939dl1.m43781f().getOuterConeAngle(m93300h(i));
    }

    /* renamed from: k */
    public static final C42400hu1 m93297k(int i) {
        float[] fArr = new float[3];
        C39939dl1.m43781f().getPosition(m93300h(i), fArr);
        return C41491gN2.m39549p(fArr);
    }

    /* renamed from: l */
    public static final float m93296l(int i) {
        return C39939dl1.m43781f().getSunAngularRadius(m93300h(i));
    }

    /* renamed from: m */
    public static final float m93295m(int i) {
        return C39939dl1.m43781f().getSunHaloFalloff(m93300h(i));
    }

    /* renamed from: n */
    public static final float m93294n(int i) {
        return C39939dl1.m43781f().getSunHaloSize(m93300h(i));
    }

    /* renamed from: o */
    public static final LightManager.Type m93293o(int i) {
        LightManager.Type type = C39939dl1.m43781f().getType(m93300h(i));
        Intrinsics.checkNotNullExpressionValue(type, "lightManager.getType(instance)");
        return type;
    }

    /* renamed from: p */
    public static final boolean m93292p(int i) {
        return C39939dl1.m43781f().isShadowCaster(m93300h(i));
    }

    /* renamed from: q */
    public static final void m93291q(int i, C42993iu1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C39939dl1.m43781f().setColor(m93300h(i), value.m31660e(), value.m31659f(), value.m31658g());
    }

    /* renamed from: r */
    public static final void m93290r(int i, C42400hu1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C39939dl1.m43781f().setDirection(m93300h(i), value.m35576g(), value.m35575h(), value.m35574i());
    }

    /* renamed from: s */
    public static final void m93289s(int i, float f) {
        C39939dl1.m43781f().setIntensity(m93300h(i), f);
    }

    /* renamed from: t */
    public static final void m93288t(int i, C42400hu1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C39939dl1.m43781f().setPosition(m93300h(i), value.m35576g(), value.m35575h(), value.m35574i());
    }
}
