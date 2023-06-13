package p000;

import android.app.Application;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lun0;", "", "Landroid/app/Application;", "application", "Lkn0;", C17296a.f69688o, "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "commandCenterComponent", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterFeatureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterFeatureModule.kt\nco/bird/android/feature/commandcenter/CommandCenterFeatureModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* renamed from: un0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50037un0 {

    /* renamed from: a */
    public static final C50037un0 f112910a = new C50037un0();

    /* renamed from: b */
    public static WeakReference<InterfaceC44108kn0> f112911b;

    private C50037un0() {
    }

    /* renamed from: a */
    public final InterfaceC44108kn0 m9778a(Application application) {
        InterfaceC44108kn0 interfaceC44108kn0;
        Intrinsics.checkNotNullParameter(application, "application");
        WeakReference<InterfaceC44108kn0> weakReference = f112911b;
        if (weakReference != null) {
            interfaceC44108kn0 = weakReference.get();
        } else {
            interfaceC44108kn0 = null;
        }
        if (interfaceC44108kn0 == null) {
            InterfaceC44108kn0 mo28447a = UH0.m81756a().mo28447a(C46172oG2.f101711a.m21419a(application));
            f112911b = new WeakReference<>(mo28447a);
            return mo28447a;
        }
        return interfaceC44108kn0;
    }
}
