package p000;

import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RideTitle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LxQ2;", "LwQ2;", "Lco/bird/android/model/RideTitle;", "title", "", "quantity", "", C17296a.f69688o, "(Lco/bird/android/model/RideTitle;Ljava/lang/Integer;)V", "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/appcompat/widget/Toolbar;", "b", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "actionBarLogo", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/appcompat/widget/Toolbar;Landroid/widget/ImageView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuUi.kt\nco/bird/android/app/feature/ride/ui/MenuUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* renamed from: xQ2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51597xQ2 implements InterfaceC51004wQ2 {

    /* renamed from: a */
    public final BaseActivity f117588a;

    /* renamed from: b */
    public final Toolbar f117589b;

    /* renamed from: c */
    public final ImageView f117590c;

    public C51597xQ2(BaseActivity activity, Toolbar toolbar, ImageView actionBarLogo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(actionBarLogo, "actionBarLogo");
        this.f117588a = activity;
        this.f117589b = toolbar;
        this.f117590c = actionBarLogo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r7 == null) goto L11;
     */
    @Override // p000.InterfaceC51004wQ2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5281a(RideTitle title, Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(title, "title");
        boolean z = true;
        if (num != null) {
            num.intValue();
            string = this.f117588a.getString(title.getText(), num);
        }
        string = this.f117588a.getString(title.getText());
        Intrinsics.checkNotNullExpressionValue(string, "quantity?.let { activity…ity.getString(title.text)");
        ImageView imageView = this.f117590c;
        if (string.length() != 0) {
            z = false;
        }
        C49520tu6.show$default(imageView, z, 0, 2, null);
        this.f117589b.setTitle(string);
    }
}
