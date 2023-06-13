package p000;

import android.os.Bundle;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LLi5;", "Landroidx/savedstate/a$c;", "Landroid/os/Bundle;", C17296a.f69688o, "", DateTokenConverter.CONVERTER_KEY, "", "key", "b", "Landroidx/savedstate/a;", "Landroidx/savedstate/a;", "savedStateRegistry", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "LMi5;", "Lkotlin/Lazy;", "()LMi5;", "viewModel", "LXr6;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/a;LXr6;)V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,221:1\n215#2,2:222\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:222,2\n*E\n"})
/* renamed from: Li5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34264Li5 implements C11966a.InterfaceC11969c {

    /* renamed from: a */
    public final C11966a f21950a;

    /* renamed from: b */
    public boolean f21951b;

    /* renamed from: c */
    public Bundle f21952c;

    /* renamed from: d */
    public final Lazy f21953d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LMi5;", "b", "()LMi5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Li5$a */
    /* loaded from: classes.dex */
    public static final class C5068a extends Lambda implements Function0<C34498Mi5> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC37154Xr6 f21954g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5068a(InterfaceC37154Xr6 interfaceC37154Xr6) {
            super(0);
            this.f21954g = interfaceC37154Xr6;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C34498Mi5 invoke() {
            return C11750q.m66932e(this.f21954g);
        }
    }

    public C34264Li5(C11966a savedStateRegistry, InterfaceC37154Xr6 viewModelStoreOwner) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f21950a = savedStateRegistry;
        lazy = LazyKt__LazyJVMKt.lazy(new C5068a(viewModelStoreOwner));
        this.f21953d = lazy;
    }

    @Override // androidx.savedstate.C11966a.InterfaceC11969c
    /* renamed from: a */
    public Bundle mo18217a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f21952c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C11747p> entry : m96423c().m95007e().entrySet()) {
            String key = entry.getKey();
            Bundle mo18217a = entry.getValue().m66942k().mo18217a();
            if (!Intrinsics.areEqual(mo18217a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo18217a);
            }
        }
        this.f21951b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m96424b(String key) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(key, "key");
        m96422d();
        Bundle bundle2 = this.f21952c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(key);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f21952c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f21952c;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.f21952c = null;
        }
        return bundle;
    }

    /* renamed from: c */
    public final C34498Mi5 m96423c() {
        return (C34498Mi5) this.f21953d.getValue();
    }

    /* renamed from: d */
    public final void m96422d() {
        if (!this.f21951b) {
            this.f21952c = this.f21950a.m66076b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f21951b = true;
            m96423c();
        }
    }
}
