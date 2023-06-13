package p000;

import androidx.lifecycle.LiveData;
import com.facebook.share.internal.C17296a;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nJ\u0012\u0010\u0010\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R$\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Ln72;", "", "T", "", "", "tableNames", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", C17296a.f69688o, "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "liveData", "", "b", "c", "LEb5;", "LEb5;", "database", "", "Ljava/util/Set;", "getLiveDataSet$room_runtime_release", "()Ljava/util/Set;", "liveDataSet", "<init>", "(LEb5;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: n72  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45495n72 {

    /* renamed from: a */
    public final AbstractC32563Eb5 f99471a;

    /* renamed from: b */
    public final Set<LiveData<?>> f99472b;

    public C45495n72(AbstractC32563Eb5 database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f99471a = database;
        Set<LiveData<?>> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f99472b = newSetFromMap;
    }

    /* renamed from: a */
    public final <T> LiveData<T> m24315a(String[] tableNames, boolean z, Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new C33967Kb5(this.f99471a, this, z, computeFunction, tableNames);
    }

    /* renamed from: b */
    public final void m24314b(LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f99472b.add(liveData);
    }

    /* renamed from: c */
    public final void m24313c(LiveData<?> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f99472b.remove(liveData);
    }
}
