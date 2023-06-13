package kotlinx.coroutines.android;

import android.os.Looper;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "LqG2;", "", "allFactories", "LpG2;", "c", "", "b", "", C17296a.f69688o, "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class AndroidDispatcherFactory implements InterfaceC47358qG2 {
    @Override // p000.InterfaceC47358qG2
    /* renamed from: a */
    public int mo12289a() {
        return 1073741823;
    }

    @Override // p000.InterfaceC47358qG2
    /* renamed from: b */
    public String mo12288b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p000.InterfaceC47358qG2
    /* renamed from: c */
    public AbstractC46765pG2 mo12287c(List<? extends InterfaceC47358qG2> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new RE1(TE1.m84165a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
