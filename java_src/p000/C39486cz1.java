package p000;

import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lcz1;", "Lbz1;", "", C17296a.f69688o, "LV74;", "LV74;", "promoManager", "LH31;", "b", "LH31;", "ui", "Lco/bird/android/core/mvp/BaseActivity;", "c", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(LV74;LH31;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cz1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39486cz1 implements InterfaceC38875bz1 {

    /* renamed from: a */
    public final V74 f75916a;

    /* renamed from: b */
    public final H31 f75917b;

    /* renamed from: c */
    public final BaseActivity f75918c;

    public C39486cz1(V74 promoManager, H31 ui, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f75916a = promoManager;
        this.f75917b = ui;
        this.f75918c = activity;
    }

    @Override // p000.InterfaceC38875bz1
    /* renamed from: a */
    public void mo44775a() {
        H31.C3014a.showCustomDialog$default(this.f75917b, C39311cj4.dialog_free_ride, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.mainText), (CharSequence) this.f75918c.getString(C45871nl4.g1g1_dialog_header), (CharSequence) C41857gz1.m37259b(this.f75916a.mo27764y().getValue(), this.f75918c), C36585Vg4.confirmButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }
}
