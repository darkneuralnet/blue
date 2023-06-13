package p000;

import androidx.recyclerview.widget.C11905h;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, m28432d2 = {"LYa6;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksAdapterDiff.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,28:1\n18#2:29\n18#2:34\n18#2:39\n9#3,4:30\n9#3,4:35\n9#3,4:40\n*S KotlinDebug\n*F\n+ 1 TweaksAdapterDiff.kt\nco/bird/android/app/feature/settings/tweaks/adapter/TweaksAdapterDiff\n*L\n13#1:29\n22#1:34\n23#1:39\n13#1:30,4\n22#1:35,4\n23#1:40,4\n*E\n"})
/* renamed from: Ya6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37235Ya6 implements InterfaceC2152F6 {

    /* renamed from: a */
    public static final C9816a f46037a = new C9816a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LYa6$a;", "", "", "SEARCH_ID", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ya6$a */
    /* loaded from: classes2.dex */
    public static final class C9816a {
        public /* synthetic */ C9816a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C9816a() {
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof InterfaceC36065Ta6)) {
            m105816c = null;
        }
        InterfaceC36065Ta6 interfaceC36065Ta6 = (InterfaceC36065Ta6) m105816c;
        if (interfaceC36065Ta6 != null) {
            return interfaceC36065Ta6.getName();
        }
        return "search";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Object obj;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj2 = null;
        if (!(m105816c instanceof InterfaceC36065Ta6)) {
            m105816c = null;
        }
        InterfaceC36065Ta6 interfaceC36065Ta6 = (InterfaceC36065Ta6) m105816c;
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof InterfaceC36065Ta6)) {
            m105816c2 = null;
        }
        InterfaceC36065Ta6 interfaceC36065Ta62 = (InterfaceC36065Ta6) m105816c2;
        if (interfaceC36065Ta6 != null) {
            obj = interfaceC36065Ta6.getValue();
        } else {
            obj = null;
        }
        if (interfaceC36065Ta62 != null) {
            obj2 = interfaceC36065Ta62.getValue();
        }
        return !Intrinsics.areEqual(obj, obj2);
    }
}
