package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m28432d2 = {"LzE1;", "Lwf1;", "", C17296a.f69688o, "", "e", "Z", "getSharedCubemap", "()Z", "sharedCubemap", "Lcom/google/android/filament/Texture;", "<set-?>", "f", "Lcom/google/android/filament/Texture;", "getCubemap", "()Lcom/google/android/filament/Texture;", "setCubemap$sceneview_release", "(Lcom/google/android/filament/Texture;)V", "cubemap", "", "g", "Ljava/lang/Float;", "getIndirectLightIntensity", "()Ljava/lang/Float;", "indirectLightIntensity", "", "indirectLightIrradiance", "indirectLightSpecularFilter", "createSkybox", "<init>", "(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZ)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: zE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52674zE1 extends C51143wf1 {

    /* renamed from: e */
    public final boolean f120993e;

    /* renamed from: f */
    public Texture f120994f;

    /* renamed from: g */
    public Float f120995g;

    public C52674zE1() {
        this(null, null, null, false, false, false, 63, null);
    }

    @Override // p000.C51143wf1
    /* renamed from: a */
    public void mo1619a() {
        Unit unit;
        super.mo1619a();
        if (!this.f120993e) {
            try {
                Result.Companion companion = Result.Companion;
                Texture texture = this.f120994f;
                if (texture != null) {
                    C40122e36.m43307b(texture);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.m116783constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            this.f120994f = null;
        }
        this.f120995g = null;
    }

    public /* synthetic */ C52674zE1(Texture texture, float[] fArr, Float f, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : texture, (i & 2) != 0 ? null : fArr, (i & 4) == 0 ? f : null, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C52674zE1(Texture texture, float[] fArr, Float f, boolean z, boolean z2, boolean z3) {
        super(r5, r0, fArr);
        Texture texture2;
        IndirectLight.Builder builder = new IndirectLight.Builder();
        if (texture != null) {
            if (z) {
                texture2 = C39939dl1.m43782e().m78520e(texture);
                if (!z2) {
                    C40122e36.m43307b(texture);
                }
            } else {
                texture2 = texture;
            }
            builder.reflections(texture2);
        }
        if (fArr != null) {
            builder.irradiance(3, fArr);
        }
        if (f != null) {
            builder.intensity(f.floatValue());
        }
        IndirectLight m111040a = D12.m111040a(builder);
        Skybox skybox = null;
        if (texture != null) {
            Texture texture3 = z2 ? texture : null;
            if (texture3 != null) {
                Skybox.Builder builder2 = new Skybox.Builder();
                builder2.environment(texture3);
                skybox = WD5.m78694a(builder2);
            }
        }
        this.f120993e = z3;
        this.f120994f = texture;
        this.f120995g = f;
    }
}
