package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0014"}, m28432d2 = {"Lme6;", "LMT3;", "", C17296a.f69688o, "Lio/reactivex/Observable;", "", "b", "Lio/reactivex/Observable;", "getVisibility", "()Lio/reactivex/Observable;", "visibility", "", "c", DateTokenConverter.CONVERTER_KEY, "mainText", "secondaryText", "e", "secondaryTextVisibility", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: me6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45210me6 implements MT3 {

    /* renamed from: a */
    public static final C45210me6 f98508a = new C45210me6();

    /* renamed from: b */
    public static final Observable<Boolean> f98509b;

    /* renamed from: c */
    public static final Observable<String> f98510c;

    /* renamed from: d */
    public static final Observable<String> f98511d;

    /* renamed from: e */
    public static final Observable<Boolean> f98512e;

    /* renamed from: f */
    public static final int f98513f;

    static {
        Boolean bool = Boolean.FALSE;
        Observable<Boolean> just = Observable.just(bool);
        Intrinsics.checkNotNullExpressionValue(just, "just(false)");
        f98509b = just;
        Observable<String> just2 = Observable.just("");
        Intrinsics.checkNotNullExpressionValue(just2, "just(\"\")");
        f98510c = just2;
        Observable<String> just3 = Observable.just("");
        Intrinsics.checkNotNullExpressionValue(just3, "just(\"\")");
        f98511d = just3;
        Observable<Boolean> just4 = Observable.just(bool);
        Intrinsics.checkNotNullExpressionValue(just4, "just(false)");
        f98512e = just4;
        f98513f = 8;
    }

    private C45210me6() {
    }

    @Override // p000.MT3
    /* renamed from: a */
    public void mo25233a() {
    }

    @Override // p000.MT3
    /* renamed from: b */
    public Observable<Boolean> mo25232b() {
        return f98512e;
    }

    @Override // p000.MT3
    /* renamed from: c */
    public Observable<String> mo25231c() {
        return f98511d;
    }

    @Override // p000.MT3
    /* renamed from: d */
    public Observable<String> mo25230d() {
        return f98510c;
    }

    @Override // p000.MT3
    public Observable<Boolean> getVisibility() {
        return f98509b;
    }
}
