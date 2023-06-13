package p000;

import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0003¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\r8 X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\n\u0082\u0001\u0002\u0019\u001a¨\u0006\u001b"}, m28432d2 = {"LPr6;", "", "Landroidx/activity/ComponentActivity;", "A", C17296a.f69688o, "()Landroidx/activity/ComponentActivity;", "Landroid/app/Application;", "b", "()Landroid/app/Application;", "c", "()Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "activity", "Landroidx/savedstate/a;", "g", "()Landroidx/savedstate/a;", "savedStateRegistry", "LXr6;", "f", "()LXr6;", "owner", "e", "args", "<init>", "()V", "Lr6;", "LFy1;", "mvrx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Pr6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC35282Pr6 {
    public /* synthetic */ AbstractC35282Pr6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final <A extends ComponentActivity> A m89681a() {
        A a = (A) mo16490d();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type A of com.airbnb.mvrx.ViewModelContext.activity");
        return a;
    }

    /* renamed from: b */
    public final <A extends Application> A m89680b() {
        A a = (A) mo16490d().getApplication();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type A of com.airbnb.mvrx.ViewModelContext.app");
        return a;
    }

    /* renamed from: c */
    public final <A> A m89679c() {
        return (A) mo16489e();
    }

    /* renamed from: d */
    public abstract ComponentActivity mo16490d();

    /* renamed from: e */
    public abstract Object mo16489e();

    /* renamed from: f */
    public abstract InterfaceC37154Xr6 mo16488f();

    /* renamed from: g */
    public abstract C11966a mo16487g();

    private AbstractC35282Pr6() {
    }
}
