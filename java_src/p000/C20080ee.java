package p000;

import android.view.ViewConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lee;", "LJq6;", "Landroid/view/ViewConfiguration;", C17296a.f69688o, "Landroid/view/ViewConfiguration;", "viewConfiguration", "", DateTokenConverter.CONVERTER_KEY, "()J", "longPressTimeoutMillis", "c", "doubleTapTimeoutMillis", "doubleTapMinTimeMillis", "", "b", "()F", "touchSlop", "<init>", "(Landroid/view/ViewConfiguration;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ee */
/* loaded from: classes.dex */
public final class C20080ee implements InterfaceC33869Jq6 {

    /* renamed from: a */
    public final ViewConfiguration f78640a;

    public C20080ee(ViewConfiguration viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f78640a = viewConfiguration;
    }

    @Override // p000.InterfaceC33869Jq6
    /* renamed from: a */
    public long mo42676a() {
        return 40L;
    }

    @Override // p000.InterfaceC33869Jq6
    /* renamed from: b */
    public float mo42675b() {
        return this.f78640a.getScaledTouchSlop();
    }

    @Override // p000.InterfaceC33869Jq6
    /* renamed from: c */
    public long mo42674c() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.InterfaceC33869Jq6
    /* renamed from: d */
    public long mo42673d() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
