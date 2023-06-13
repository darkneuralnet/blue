package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000e\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0018"}, m28432d2 = {"Ll66;", "", "Ldz0;", "", C17296a.f69688o, "Ldz0;", "()Ldz0;", "batteryChargingTracker", "LVF;", "b", "LVF;", "()LVF;", "batteryNotLowTracker", "LP73;", "c", "networkStateTracker", DateTokenConverter.CONVERTER_KEY, "storageNotLowTracker", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LmZ5;", "taskExecutor", "<init>", "(Landroid/content/Context;LmZ5;Ldz0;LVF;Ldz0;Ldz0;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: l66  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44303l66 {

    /* renamed from: a */
    public final AbstractC40077dz0<Boolean> f95498a;

    /* renamed from: b */
    public final C8586VF f95499b;

    /* renamed from: c */
    public final AbstractC40077dz0<P73> f95500c;

    /* renamed from: d */
    public final AbstractC40077dz0<Boolean> f95501d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C44303l66(Context context, InterfaceC45160mZ5 taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
    }

    /* renamed from: a */
    public final AbstractC40077dz0<Boolean> m27858a() {
        return this.f95498a;
    }

    /* renamed from: b */
    public final C8586VF m27857b() {
        return this.f95499b;
    }

    /* renamed from: c */
    public final AbstractC40077dz0<P73> m27856c() {
        return this.f95500c;
    }

    /* renamed from: d */
    public final AbstractC40077dz0<Boolean> m27855d() {
        return this.f95501d;
    }

    @JvmOverloads
    public C44303l66(Context context, InterfaceC45160mZ5 taskExecutor, AbstractC40077dz0<Boolean> batteryChargingTracker, C8586VF batteryNotLowTracker, AbstractC40077dz0<P73> networkStateTracker, AbstractC40077dz0<Boolean> storageNotLowTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f95498a = batteryChargingTracker;
        this.f95499b = batteryNotLowTracker;
        this.f95500c = networkStateTracker;
        this.f95501d = storageNotLowTracker;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C44303l66(Context context, InterfaceC45160mZ5 interfaceC45160mZ5, AbstractC40077dz0 abstractC40077dz0, C8586VF c8586vf, AbstractC40077dz0 abstractC40077dz02, AbstractC40077dz0 abstractC40077dz03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC45160mZ5, r3, r4, r5, r6);
        C7365SF c7365sf;
        C8586VF c8586vf2;
        AbstractC40077dz0<P73> abstractC40077dz04;
        C40937fR5 c40937fR5;
        if ((i & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            c7365sf = new C7365SF(applicationContext, interfaceC45160mZ5);
        } else {
            c7365sf = abstractC40077dz0;
        }
        if ((i & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
            c8586vf2 = new C8586VF(applicationContext2, interfaceC45160mZ5);
        } else {
            c8586vf2 = c8586vf;
        }
        if ((i & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext3, "context.applicationContext");
            abstractC40077dz04 = R73.m87282a(applicationContext3, interfaceC45160mZ5);
        } else {
            abstractC40077dz04 = abstractC40077dz02;
        }
        if ((i & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext4, "context.applicationContext");
            c40937fR5 = new C40937fR5(applicationContext4, interfaceC45160mZ5);
        } else {
            c40937fR5 = abstractC40077dz03;
        }
    }
}
