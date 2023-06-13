package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\"\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010\u0018\u00010\u000f*\u00020\u000eH\u0002\u001a \u0010\u0012\u001a\u00020\u000e*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00100\u000fH\u0002\"\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, m28432d2 = {"Landroid/view/View;", "view", "LPi5;", "owner", "Lp51;", C17296a.f69688o, "", "id", "savedStateRegistryOwner", "b", "", "value", "", "e", "Landroid/os/Bundle;", "", "", "g", "f", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "AcceptableClasses", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
/* renamed from: q51  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47253q51 {

    /* renamed from: a */
    public static final Class<? extends Object>[] f104641a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q51$a */
    /* loaded from: classes.dex */
    public static final class C27485a extends Lambda implements Function0<Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f104642g;

        /* renamed from: h */
        public final /* synthetic */ C11966a f104643h;

        /* renamed from: i */
        public final /* synthetic */ String f104644i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27485a(boolean z, C11966a c11966a, String str) {
            super(0);
            this.f104642g = z;
            this.f104643h = c11966a;
            this.f104644i = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f104642g) {
                this.f104643h.m66067k(this.f104644i);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"Landroid/os/Bundle;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: q51$b */
    /* loaded from: classes.dex */
    public static final class C27486b implements C11966a.InterfaceC11969c {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC33328Hi5 f104645a;

        public C27486b(InterfaceC33328Hi5 interfaceC33328Hi5) {
            this.f104645a = interfaceC33328Hi5;
        }

        @Override // androidx.savedstate.C11966a.InterfaceC11969c
        /* renamed from: a */
        public final Bundle mo18217a() {
            return C47253q51.m18219f(this.f104645a.mo19979d());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: q51$c */
    /* loaded from: classes.dex */
    public static final class C27487c extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: g */
        public static final C27487c f104646g = new C27487c();

        public C27487c() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(C47253q51.m18220e(it));
        }
    }

    /* renamed from: a */
    public static final C46660p51 m18224a(View view, InterfaceC35200Pi5 owner) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(owner, "owner");
        ViewParent parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(C46424oh4.compose_view_saveable_id_tag);
        if (tag instanceof String) {
            str = (String) tag;
        } else {
            str = null;
        }
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return m18223b(str, owner);
    }

    /* renamed from: b */
    public static final C46660p51 m18223b(String id, InterfaceC35200Pi5 savedStateRegistryOwner) {
        Map<String, List<Object>> map;
        boolean z;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        String str = InterfaceC33328Hi5.class.getSimpleName() + CoreConstants.COLON_CHAR + id;
        C11966a savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        Bundle m66076b = savedStateRegistry.m66076b(str);
        if (m66076b != null) {
            map = m18218g(m66076b);
        } else {
            map = null;
        }
        InterfaceC33328Hi5 m99924a = C33796Ji5.m99924a(map, C27487c.f104646g);
        try {
            savedStateRegistry.m66069i(str, new C27486b(m99924a));
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        }
        return new C46660p51(m99924a, new C27485a(z, savedStateRegistry, str));
    }

    /* renamed from: e */
    public static final boolean m18220e(Object obj) {
        if (obj instanceof CM5) {
            CM5 cm5 = (CM5) obj;
            if (cm5.mo110564a() != GM5.m105198i() && cm5.mo110564a() != GM5.m105191p() && cm5.mo110564a() != GM5.m105194m()) {
                return false;
            }
            Object value = cm5.getValue();
            if (value == null) {
                return true;
            }
            return m18220e(value);
        } else if ((obj instanceof Function) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class<? extends Object> cls : f104641a) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public static final Bundle m18219f(Map<String, ? extends List<? extends Object>> map) {
        ArrayList<? extends Parcelable> arrayList;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<? extends Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }

    /* renamed from: g */
    public static final Map<String, List<Object>> m18218g(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "this.keySet()");
        for (String key : keySet) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(key);
            Intrinsics.checkNotNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            Intrinsics.checkNotNullExpressionValue(key, "key");
            linkedHashMap.put(key, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
