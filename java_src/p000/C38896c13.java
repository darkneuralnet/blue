package p000;

import android.content.res.Resources;
import android.view.MenuItem;
import com.facebook.share.internal.C17296a;
import com.google.android.material.navigation.NavigationView;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52263yY3;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lc13;", "LMt6;", "Lcom/google/android/material/navigation/NavigationView;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNavigationViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/NavigationViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,41:1\n215#2:42\n215#2,2:43\n216#2:45\n*S KotlinDebug\n*F\n+ 1 NavigationViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/NavigationViewViewTransformer\n*L\n20#1:42\n29#1:43,2\n20#1:45\n*E\n"})
/* renamed from: c13  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38896c13 implements InterfaceC34598Mt6<NavigationView> {

    /* renamed from: a */
    public static final C38896c13 f59892a = new C38896c13();

    /* renamed from: b */
    public static final Class<NavigationView> f59893b = NavigationView.class;

    /* renamed from: c */
    public static final Set<String> f59894c;

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"menu", "app:menu"});
        f59894c = of;
    }

    private C38896c13() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f59894c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(NavigationView navigationView, Map<String, Integer> attrs) {
        boolean areEqual;
        int i;
        MenuItem findItem;
        MenuItem findItem2;
        Intrinsics.checkNotNullParameter(navigationView, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.areEqual(key, "menu")) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(key, "app:menu");
            }
            if (areEqual) {
                C52263yY3 c52263yY3 = C52263yY3.f119708a;
                Resources resources = navigationView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                Integer num = attrs.get(entry.getKey());
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                for (Map.Entry<Integer, C52263yY3.C30616a> entry2 : c52263yY3.m3333a(resources, i).entrySet()) {
                    if (entry2.getValue().m3330a() != 0 && (findItem2 = navigationView.m49298h().findItem(entry2.getKey().intValue())) != null) {
                        findItem2.setTitle(navigationView.getResources().getString(entry2.getValue().m3330a()));
                    }
                    if (entry2.getValue().m3329b() != 0 && (findItem = navigationView.m49298h().findItem(entry2.getKey().intValue())) != null) {
                        findItem.setTitleCondensed(navigationView.getResources().getString(entry2.getValue().m3329b()));
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super NavigationView> getViewType() {
        return f59893b;
    }
}
