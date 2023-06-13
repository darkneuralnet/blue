package co.bird.android.core.base.viewmodel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\nR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\u0082\u0001\u0005\u001c\u001d\u001e\u001f ¨\u0006!"}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;", "LNy;", "Landroid/os/Parcelable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/drawable/Drawable;", "g", "j", "", "i", "(Landroid/content/Context;)Ljava/lang/Integer;", "l", "h", "k", "", DateTokenConverter.CONVERTER_KEY, "Z", "c", "()Z", "icon1Padding", "e", "icon2Padding", "f", "b", "icon1Background", "icon2Background", "<init>", "()V", "Lco/bird/android/core/base/viewmodel/BillOfLadingReceived;", "Lco/bird/android/core/base/viewmodel/CoreInventorySuccess;", "Lco/bird/android/core/base/viewmodel/MarkDamaged;", "Lco/bird/android/core/base/viewmodel/ScrapRemovalComplete;", "Lco/bird/android/core/base/viewmodel/UnmarkDamaged;", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class BottomSheetAlertDialog extends AbstractC5751Ny implements Parcelable {

    /* renamed from: d */
    public final boolean f63049d;

    /* renamed from: e */
    public final boolean f63050e;

    /* renamed from: f */
    public final boolean f63051f;

    /* renamed from: g */
    public final boolean f63052g;

    public /* synthetic */ BottomSheetAlertDialog(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public boolean mo59022b() {
        return this.f63051f;
    }

    /* renamed from: c */
    public boolean mo59021c() {
        return this.f63049d;
    }

    /* renamed from: d */
    public boolean m59020d() {
        return this.f63052g;
    }

    /* renamed from: e */
    public boolean mo59011e() {
        return this.f63050e;
    }

    /* renamed from: g */
    public abstract Drawable mo59005g(Context context);

    /* renamed from: h */
    public Integer m59019h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* renamed from: i */
    public Integer m59018i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* renamed from: j */
    public abstract Drawable mo59004j(Context context);

    /* renamed from: k */
    public Integer mo59010k(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    /* renamed from: l */
    public Integer mo59009l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    private BottomSheetAlertDialog() {
        super(null);
        this.f63049d = true;
        this.f63050e = true;
        this.f63051f = true;
        this.f63052g = true;
    }
}
