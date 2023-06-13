package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010$\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR*\u0010'\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001a\u0010*\u001a\u00020\u00078\u0010X\u0090D¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\u001d\u0010)¨\u0006-"}, m28432d2 = {"Luf;", "Lvf;", "", DateTokenConverter.CONVERTER_KEY, "()V", "j", "()Luf;", "", "index", "", C17296a.f69688o, "(I)F", "value", "e", "(IF)V", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "v1", "b", "g", "setV2$animation_core_release", "v2", "c", "h", "setV3$animation_core_release", "v3", "i", "setV4$animation_core_release", "v4", "I", "()I", "size", "<init>", "(FFFF)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uf */
/* loaded from: classes.dex */
public final class C29275uf extends AbstractC29607vf {

    /* renamed from: a */
    public float f112711a;

    /* renamed from: b */
    public float f112712b;

    /* renamed from: c */
    public float f112713c;

    /* renamed from: d */
    public float f112714d;

    /* renamed from: e */
    public final int f112715e;

    public C29275uf(float f, float f2, float f3, float f4) {
        super(null);
        this.f112711a = f;
        this.f112712b = f2;
        this.f112713c = f3;
        this.f112714d = f4;
        this.f112715e = 4;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: a */
    public float mo8296a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.f112714d;
                }
                return this.f112713c;
            }
            return this.f112712b;
        }
        return this.f112711a;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: b */
    public int mo8295b() {
        return this.f112715e;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: d */
    public void mo8293d() {
        this.f112711a = 0.0f;
        this.f112712b = 0.0f;
        this.f112713c = 0.0f;
        this.f112714d = 0.0f;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: e */
    public void mo8292e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f112714d = f;
                        return;
                    }
                    return;
                }
                this.f112713c = f;
                return;
            }
            this.f112712b = f;
            return;
        }
        this.f112711a = f;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(obj instanceof C29275uf)) {
            return false;
        }
        C29275uf c29275uf = (C29275uf) obj;
        if (c29275uf.f112711a == this.f112711a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (c29275uf.f112712b == this.f112712b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (c29275uf.f112713c == this.f112713c) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (c29275uf.f112714d == this.f112714d) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final float m9912f() {
        return this.f112711a;
    }

    /* renamed from: g */
    public final float m9911g() {
        return this.f112712b;
    }

    /* renamed from: h */
    public final float m9910h() {
        return this.f112713c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f112711a) * 31) + Float.hashCode(this.f112712b)) * 31) + Float.hashCode(this.f112713c)) * 31) + Float.hashCode(this.f112714d);
    }

    /* renamed from: i */
    public final float m9909i() {
        return this.f112714d;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: j */
    public C29275uf mo8294c() {
        return new C29275uf(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f112711a + ", v2 = " + this.f112712b + ", v3 = " + this.f112713c + ", v4 = " + this.f112714d;
    }
}
