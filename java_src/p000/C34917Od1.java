package p000;

import android.os.Build;
import androidx.work.C12124b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0007"}, m28432d2 = {"LHG6;", "workSpec", C17296a.f69688o, "", "Lxm5;", "schedulers", "b", "work-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Od1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34917Od1 {
    /* renamed from: a */
    public static final HG6 m91786a(HG6 workSpec) {
        HG6 m104075d;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        C44821lz0 c44821lz0 = workSpec.f13200j;
        String str = workSpec.f13193c;
        if (Intrinsics.areEqual(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!c44821lz0.m26578f() && !c44821lz0.m26575i()) {
            return workSpec;
        }
        C12124b m65581a = new C12124b.C12125a().m65579c(workSpec.f13195e).m65577e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).m65581a();
        Intrinsics.checkNotNullExpressionValue(m65581a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "name");
        m104075d = workSpec.m104075d((r45 & 1) != 0 ? workSpec.f13191a : null, (r45 & 2) != 0 ? workSpec.f13192b : null, (r45 & 4) != 0 ? workSpec.f13193c : name, (r45 & 8) != 0 ? workSpec.f13194d : null, (r45 & 16) != 0 ? workSpec.f13195e : m65581a, (r45 & 32) != 0 ? workSpec.f13196f : null, (r45 & 64) != 0 ? workSpec.f13197g : 0L, (r45 & 128) != 0 ? workSpec.f13198h : 0L, (r45 & 256) != 0 ? workSpec.f13199i : 0L, (r45 & 512) != 0 ? workSpec.f13200j : null, (r45 & 1024) != 0 ? workSpec.f13201k : 0, (r45 & 2048) != 0 ? workSpec.f13202l : null, (r45 & 4096) != 0 ? workSpec.f13203m : 0L, (r45 & 8192) != 0 ? workSpec.f13204n : 0L, (r45 & 16384) != 0 ? workSpec.f13205o : 0L, (r45 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? workSpec.f13206p : 0L, (r45 & 65536) != 0 ? workSpec.f13207q : false, (131072 & r45) != 0 ? workSpec.f13208r : null, (r45 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? workSpec.f13209s : 0, (r45 & 524288) != 0 ? workSpec.f13210t : 0);
        return m104075d;
    }

    /* renamed from: b */
    public static final HG6 m91785b(List<? extends InterfaceC51810xm5> schedulers, HG6 workSpec) {
        boolean z;
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m91786a(workSpec);
        }
        return workSpec;
    }
}
