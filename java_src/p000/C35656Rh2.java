package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.core.app.JobIntentService;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.coreinterface.core.job.JobConsumer;
import co.bird.android.coreinterface.core.job.Payload;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR,\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LRh2;", "LQh2;", "Lco/bird/android/coreinterface/core/job/Payload;", "payload", "Lkotlin/reflect/KClass;", "Lco/bird/android/coreinterface/core/job/JobConsumer;", "to", "", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "b", "Ljava/util/Map;", "ids", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rh2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35656Rh2 implements InterfaceC35422Qh2 {

    /* renamed from: a */
    public final Context f32443a;

    /* renamed from: b */
    public final Map<KClass<? extends JobConsumer<?>>, Integer> f32444b;

    public C35656Rh2(Context context, Map<KClass<? extends JobConsumer<?>>, Integer> ids) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ids, "ids");
        this.f32443a = context;
        this.f32444b = ids;
    }

    @Override // p000.InterfaceC35422Qh2
    /* renamed from: a */
    public void mo86442a(Payload payload, KClass<? extends JobConsumer<?>> to) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(to, "to");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            Integer num = this.f32444b.get(to);
            if (num != null) {
                int intValue = num.intValue();
                Intent intent = new Intent();
                intent.putExtra("extra", payload);
                JobIntentService.m67746d(this.f32443a, JvmClassMappingKt.getJavaClass((KClass) to), intValue, intent);
                return;
            }
            String simpleName = C34720Nh2.class.getSimpleName();
            throw new IllegalStateException("Did you forget to register your job consumer ID in " + simpleName);
        }
        throw new IllegalArgumentException("Submit job must run on main thread!".toString());
    }
}
