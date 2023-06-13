package p000;

import com.google.android.gms.internal.recaptcha.zztq;
import p000.C38753bm9;
import p000.Em9;
/* renamed from: bm9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38753bm9<MessageType extends Em9<MessageType, BuilderType>, BuilderType extends C38753bm9<MessageType, BuilderType>> extends Ge9<MessageType, BuilderType> {

    /* renamed from: b */
    public final MessageType f58127b;

    /* renamed from: c */
    public MessageType f58128c;

    /* renamed from: d */
    public boolean f58129d = false;

    public C38753bm9(MessageType messagetype) {
        this.f58127b = messagetype;
        this.f58128c = (MessageType) messagetype.mo1998n(4, null, null);
    }

    /* renamed from: m */
    public static final void m64024m(MessageType messagetype, MessageType messagetype2) {
        C45926nq9.m22329a().m22328b(messagetype.getClass()).zze(messagetype, messagetype2);
    }

    @Override // p000.Pp9
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Np9 mo64027h() {
        return this.f58127b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.Ge9
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Ge9 mo64025l(Ne9 ne9) {
        m64022o((Em9) ne9);
        return this;
    }

    @Override // p000.Ge9
    /* renamed from: n */
    public final BuilderType mo64026k() {
        BuilderType buildertype = (BuilderType) this.f58127b.mo1998n(5, null, null);
        buildertype.m64022o(mo64028b());
        return buildertype;
    }

    /* renamed from: o */
    public final BuilderType m64022o(MessageType messagetype) {
        if (this.f58129d) {
            m64019w();
            this.f58129d = false;
        }
        m64024m(this.f58128c, messagetype);
        return this;
    }

    /* renamed from: q */
    public final MessageType m64021q() {
        MessageType mo64028b = mo64028b();
        if (mo64028b.mo89719d()) {
            return mo64028b;
        }
        throw new zztq(mo64028b);
    }

    @Override // p000.Kp9
    /* renamed from: r */
    public MessageType mo64028b() {
        if (this.f58129d) {
            return this.f58128c;
        }
        MessageType messagetype = this.f58128c;
        C45926nq9.m22329a().m22328b(messagetype.getClass()).mo62273a(messagetype);
        this.f58129d = true;
        return this.f58128c;
    }

    /* renamed from: w */
    public void m64019w() {
        MessageType messagetype = (MessageType) this.f58128c.mo1998n(4, null, null);
        m64024m(messagetype, this.f58128c);
        this.f58128c = messagetype;
    }
}
