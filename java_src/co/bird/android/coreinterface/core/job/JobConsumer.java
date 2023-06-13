package co.bird.android.coreinterface.core.job;

import android.content.Intent;
import androidx.core.app.JobIntentService;
import co.bird.android.coreinterface.core.job.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"Lco/bird/android/coreinterface/core/job/JobConsumer;", "Lco/bird/android/coreinterface/core/job/Payload;", "T", "Landroidx/core/app/JobIntentService;", "Landroid/content/Intent;", "intent", "", "g", "payload", "handle", "(Lco/bird/android/coreinterface/core/job/Payload;)V", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJobConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobConsumer.kt\nco/bird/android/coreinterface/core/job/JobConsumer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes2.dex */
public abstract class JobConsumer<T extends Payload> extends JobIntentService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.app.JobIntentService
    /* renamed from: g */
    public void mo52985g(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Payload payload = (Payload) intent.getParcelableExtra("extra");
        if (payload != null) {
            handle(payload);
        }
    }

    public abstract void handle(T t);
}
