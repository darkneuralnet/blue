package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R*\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00078\u0010X\u0090D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\""}, m28432d2 = {"Lsf;", "Lvf;", "", DateTokenConverter.CONVERTER_KEY, "()V", "g", "()Lsf;", "", "index", "", C17296a.f69688o, "(I)F", "value", "e", "(IF)V", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "<set-?>", "F", "f", "()F", "setValue$animation_core_release", "(F)V", "b", "I", "()I", "size", "initVal", "<init>", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: sf */
/* loaded from: classes.dex */
public final class C28366sf extends AbstractC29607vf {

    /* renamed from: a */
    public float f109074a;

    /* renamed from: b */
    public final int f109075b;

    public C28366sf(float f) {
        super(null);
        this.f109074a = f;
        this.f109075b = 1;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: a */
    public float mo8296a(int i) {
        if (i == 0) {
            return this.f109074a;
        }
        return 0.0f;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: b */
    public int mo8295b() {
        return this.f109075b;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: d */
    public void mo8293d() {
        this.f109074a = 0.0f;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: e */
    public void mo8292e(int i, float f) {
        if (i == 0) {
            this.f109074a = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C28366sf) {
            return (((C28366sf) obj).f109074a > this.f109074a ? 1 : (((C28366sf) obj).f109074a == this.f109074a ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public final float m13901f() {
        return this.f109074a;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: g */
    public C28366sf mo8294c() {
        return new C28366sf(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f109074a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f109074a;
    }
}
