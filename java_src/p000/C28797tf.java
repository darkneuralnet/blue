package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0090\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0016R*\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010$\u001a\u00020\u00078\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006'"}, m28432d2 = {"Ltf;", "Lvf;", "", DateTokenConverter.CONVERTER_KEY, "()V", "h", "()Ltf;", "", "index", "", C17296a.f69688o, "(I)F", "value", "e", "(IF)V", "", "toString", "", LegacyRepairType.OTHER_KEY, "", "equals", "hashCode", "<set-?>", "F", "f", "()F", "setV1$animation_core_release", "(F)V", "v1", "b", "g", "setV2$animation_core_release", "v2", "c", "I", "()I", "size", "<init>", "(FF)V", "animation-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tf */
/* loaded from: classes.dex */
public final class C28797tf extends AbstractC29607vf {

    /* renamed from: a */
    public float f110840a;

    /* renamed from: b */
    public float f110841b;

    /* renamed from: c */
    public final int f110842c;

    public C28797tf(float f, float f2) {
        super(null);
        this.f110840a = f;
        this.f110841b = f2;
        this.f110842c = 2;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: a */
    public float mo8296a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.f110841b;
        }
        return this.f110840a;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: b */
    public int mo8295b() {
        return this.f110842c;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: d */
    public void mo8293d() {
        this.f110840a = 0.0f;
        this.f110841b = 0.0f;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: e */
    public void mo8292e(int i, float f) {
        if (i != 0) {
            if (i == 1) {
                this.f110841b = f;
                return;
            }
            return;
        }
        this.f110840a = f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C28797tf) {
            C28797tf c28797tf = (C28797tf) obj;
            if (c28797tf.f110840a == this.f110840a) {
                return (c28797tf.f110841b > this.f110841b ? 1 : (c28797tf.f110841b == this.f110841b ? 0 : -1)) == 0;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final float m11962f() {
        return this.f110840a;
    }

    /* renamed from: g */
    public final float m11961g() {
        return this.f110841b;
    }

    @Override // p000.AbstractC29607vf
    /* renamed from: h */
    public C28797tf mo8294c() {
        return new C28797tf(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f110840a) * 31) + Float.hashCode(this.f110841b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f110840a + ", v2 = " + this.f110841b;
    }
}
