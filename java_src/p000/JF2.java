package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: JF2 */
/* loaded from: classes2.dex */
public final class JF2 {

    /* renamed from: a */
    public final Y94<Context> f17081a;

    /* renamed from: b */
    public final Y94<Handler> f17082b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f17083c;

    /* renamed from: d */
    public final Y94<InterfaceC1880Ea> f17084d;

    /* renamed from: e */
    public final Y94<InterfaceC40001dr4> f17085e;

    /* renamed from: f */
    public final Y94<InterfaceC32684Ep0> f17086f;

    /* renamed from: g */
    public final Y94<C22454gl> f17087g;

    /* renamed from: h */
    public final Y94<InterfaceC6097Oh> f17088h;

    /* renamed from: i */
    public final Y94<InterfaceC44876m46> f17089i;

    /* renamed from: j */
    public final Y94<InterfaceC44647lh6> f17090j;

    /* renamed from: k */
    public final Y94<InterfaceC7277Rp> f17091k;

    /* renamed from: l */
    public final Y94<GoogleSignInClient> f17092l;

    public JF2(Y94<Context> y94, Y94<Handler> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC40001dr4> y945, Y94<InterfaceC32684Ep0> y946, Y94<C22454gl> y947, Y94<InterfaceC6097Oh> y948, Y94<InterfaceC44876m46> y949, Y94<InterfaceC44647lh6> y9410, Y94<InterfaceC7277Rp> y9411, Y94<GoogleSignInClient> y9412) {
        this.f17081a = y94;
        this.f17082b = y942;
        this.f17083c = y943;
        this.f17084d = y944;
        this.f17085e = y945;
        this.f17086f = y946;
        this.f17087g = y947;
        this.f17088h = y948;
        this.f17089i = y949;
        this.f17090j = y9410;
        this.f17091k = y9411;
        this.f17092l = y9412;
    }

    /* renamed from: a */
    public static JF2 m100907a(Y94<Context> y94, Y94<Handler> y942, Y94<C36207Tq4> y943, Y94<InterfaceC1880Ea> y944, Y94<InterfaceC40001dr4> y945, Y94<InterfaceC32684Ep0> y946, Y94<C22454gl> y947, Y94<InterfaceC6097Oh> y948, Y94<InterfaceC44876m46> y949, Y94<InterfaceC44647lh6> y9410, Y94<InterfaceC7277Rp> y9411, Y94<GoogleSignInClient> y9412) {
        return new JF2(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412);
    }

    /* renamed from: c */
    public static CF2 m100905c(Context context, Handler handler, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC40001dr4 interfaceC40001dr4, InterfaceC32684Ep0 interfaceC32684Ep0, C22454gl c22454gl, InterfaceC6097Oh interfaceC6097Oh, InterfaceC44876m46 interfaceC44876m46, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC7277Rp interfaceC7277Rp, GoogleSignInClient googleSignInClient, LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, KF2 kf2, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return new CF2(context, handler, c36207Tq4, interfaceC1880Ea, interfaceC40001dr4, interfaceC32684Ep0, c22454gl, interfaceC6097Oh, interfaceC44876m46, interfaceC44647lh6, interfaceC7277Rp, googleSignInClient, lifecycleScopeProvider, kf2, interfaceC40099e13, dq3);
    }

    /* renamed from: b */
    public CF2 m100906b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, KF2 kf2, InterfaceC40099e13 interfaceC40099e13, DQ3 dq3) {
        return m100905c(this.f17081a.get(), this.f17082b.get(), this.f17083c.get(), this.f17084d.get(), this.f17085e.get(), this.f17086f.get(), this.f17087g.get(), this.f17088h.get(), this.f17089i.get(), this.f17090j.get(), this.f17091k.get(), this.f17092l.get(), lifecycleScopeProvider, kf2, interfaceC40099e13, dq3);
    }
}
