package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
@Deprecated
/* renamed from: jo1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC43526jo1<T> {

    /* renamed from: a */
    public final int f93376a;

    /* renamed from: b */
    public final String f93377b;

    /* renamed from: c */
    public final T f93378c;

    @Deprecated
    /* renamed from: jo1$a */
    /* loaded from: classes5.dex */
    public static class C25026a extends AbstractC43526jo1<Boolean> {
        public C25026a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }
    }

    public AbstractC43526jo1(int i, String str, T t) {
        this.f93376a = i;
        this.f93377b = str;
        this.f93378c = t;
        C50279vB5.m9032a().m28438a(this);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static C25026a m29901a(int i, String str, Boolean bool) {
        return new C25026a(i, str, bool);
    }
}
