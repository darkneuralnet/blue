package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\"\u001a\u00020\u000e\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b#\u0010$J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R$\u0010 \u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001d¨\u0006%"}, m28432d2 = {"Ldz0;", "T", "", "Lbz0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "c", "f", "h", "i", "LmZ5;", C17296a.f69688o, "LmZ5;", "taskExecutor", "Landroid/content/Context;", "b", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "getState", "()Ljava/lang/Object;", "g", "(Ljava/lang/Object;)V", TransferTable.COLUMN_STATE, "initialState", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LmZ5;)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: dz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40077dz0<T> {

    /* renamed from: a */
    public final InterfaceC45160mZ5 f77510a;

    /* renamed from: b */
    public final Context f77511b;

    /* renamed from: c */
    public final Object f77512c;

    /* renamed from: d */
    public final LinkedHashSet<InterfaceC38874bz0<T>> f77513d;

    /* renamed from: e */
    public T f77514e;

    public AbstractC40077dz0(Context context, InterfaceC45160mZ5 taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f77510a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f77511b = applicationContext;
        this.f77512c = new Object();
        this.f77513d = new LinkedHashSet<>();
    }

    /* renamed from: b */
    public static final void m43453b(List listenersList, AbstractC40077dz0 this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((InterfaceC38874bz0) it.next()).mo62059a(this$0.f77514e);
        }
    }

    /* renamed from: c */
    public final void m43452c(InterfaceC38874bz0<T> listener) {
        String str;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f77512c) {
            if (this.f77513d.add(listener)) {
                if (this.f77513d.size() == 1) {
                    this.f77514e = mo41369e();
                    AbstractC32056Bx2 m113272e = AbstractC32056Bx2.m113272e();
                    str = C40670ez0.f79227a;
                    m113272e.mo113269a(str, getClass().getSimpleName() + ": initial state = " + this.f77514e);
                    mo43448h();
                }
                listener.mo62059a(this.f77514e);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public final Context m43451d() {
        return this.f77511b;
    }

    /* renamed from: e */
    public abstract T mo41369e();

    /* renamed from: f */
    public final void m43450f(InterfaceC38874bz0<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f77512c) {
            if (this.f77513d.remove(listener) && this.f77513d.isEmpty()) {
                mo43447i();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: g */
    public final void m43449g(T t) {
        final List list;
        synchronized (this.f77512c) {
            T t2 = this.f77514e;
            if (t2 != null && Intrinsics.areEqual(t2, t)) {
                return;
            }
            this.f77514e = t;
            list = CollectionsKt___CollectionsKt.toList(this.f77513d);
            this.f77510a.mo25426b().execute(new Runnable() { // from class: cz0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC40077dz0.m43453b(list, this);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: h */
    public abstract void mo43448h();

    /* renamed from: i */
    public abstract void mo43447i();
}
