package p000;

import android.content.res.Resources;
import co.bird.android.app.feature.autopay.InterfaceC13676b;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: jr */
/* loaded from: classes2.dex */
public final class C25032jr {

    /* renamed from: a */
    public final Y94<InterfaceC32604Eg1> f93438a;

    /* renamed from: b */
    public final Y94<C22454gl> f93439b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f93440c;

    /* renamed from: d */
    public final Y94<InterfaceC47617qi1> f93441d;

    /* renamed from: e */
    public final Y94<C22454gl> f93442e;

    /* renamed from: f */
    public final Y94<C36207Tq4> f93443f;

    public C25032jr(Y94<InterfaceC32604Eg1> y94, Y94<C22454gl> y942, Y94<InterfaceC44647lh6> y943, Y94<InterfaceC47617qi1> y944, Y94<C22454gl> y945, Y94<C36207Tq4> y946) {
        this.f93438a = y94;
        this.f93439b = y942;
        this.f93440c = y943;
        this.f93441d = y944;
        this.f93442e = y945;
        this.f93443f = y946;
    }

    /* renamed from: a */
    public static C25032jr m29840a(Y94<InterfaceC32604Eg1> y94, Y94<C22454gl> y942, Y94<InterfaceC44647lh6> y943, Y94<InterfaceC47617qi1> y944, Y94<C22454gl> y945, Y94<C36207Tq4> y946) {
        return new C25032jr(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C22485gr m29838c(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC32604Eg1 interfaceC32604Eg1, C22454gl c22454gl, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC47617qi1 interfaceC47617qi1, C22454gl c22454gl2, C36207Tq4 c36207Tq4, Resources resources, InterfaceC13676b interfaceC13676b, InterfaceC40099e13 interfaceC40099e13, boolean z) {
        return new C22485gr(lifecycleScopeProvider, interfaceC32604Eg1, c22454gl, interfaceC44647lh6, interfaceC47617qi1, c22454gl2, c36207Tq4, resources, interfaceC13676b, interfaceC40099e13, z);
    }

    /* renamed from: b */
    public C22485gr m29839b(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, Resources resources, InterfaceC13676b interfaceC13676b, InterfaceC40099e13 interfaceC40099e13, boolean z) {
        return m29838c(lifecycleScopeProvider, this.f93438a.get(), this.f93439b.get(), this.f93440c.get(), this.f93441d.get(), this.f93442e.get(), this.f93443f.get(), resources, interfaceC13676b, interfaceC40099e13, z);
    }
}
