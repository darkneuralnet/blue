package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.model.wire.WirePhysicalLock;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\u0012\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0010"}, m28432d2 = {"LgT3;", "", "Lco/bird/android/model/wire/WirePhysicalLock;", "lock", "", "e9", "Lio/reactivex/Observable;", "hg", "s3", "r0", "", "title", "E", "sl", "K8", "Y5", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gT3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC41546gT3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPhysicalLockUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockUi.kt\nco/bird/android/app/feature/physicallock/PhysicalLockUi$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n1855#2,2:33\n*S KotlinDebug\n*F\n+ 1 PhysicalLockUi.kt\nco/bird/android/app/feature/physicallock/PhysicalLockUi$DefaultImpls\n*L\n25#1:33,2\n*E\n"})
    /* renamed from: gT3$a */
    /* loaded from: classes2.dex */
    public static final class C20870a {
        /* renamed from: a */
        public static void m39365a(InterfaceC41546gT3 interfaceC41546gT3, ViewGroup stepsView, List<String> dynamicInstructions) {
            Intrinsics.checkNotNullParameter(stepsView, "stepsView");
            Intrinsics.checkNotNullParameter(dynamicInstructions, "dynamicInstructions");
            LayoutInflater from = LayoutInflater.from(stepsView.getContext());
            for (String str : dynamicInstructions) {
                View inflate = from.inflate(C39311cj4.view_stub_dynamic_lock_step, stepsView, false);
                Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) inflate;
                textView.setText(str);
                stepsView.addView(textView);
            }
        }
    }

    /* renamed from: E */
    void mo14181E(int i);

    /* renamed from: K8 */
    Observable<Unit> mo14180K8();

    /* renamed from: Y5 */
    void mo14179Y5();

    /* renamed from: e9 */
    void mo14178e9(WirePhysicalLock wirePhysicalLock);

    /* renamed from: hg */
    Observable<Unit> mo14177hg();

    /* renamed from: r0 */
    Observable<Unit> mo14176r0();

    /* renamed from: s3 */
    Observable<Unit> mo14175s3();

    /* renamed from: sl */
    void mo14174sl(WirePhysicalLock wirePhysicalLock);
}
