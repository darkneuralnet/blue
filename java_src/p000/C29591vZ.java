package p000;

import android.content.res.Resources;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52263yY3;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LvZ;", "LMt6;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomNavigationViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigationViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/BottomNavigationViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,48:1\n215#2,2:49\n*S KotlinDebug\n*F\n+ 1 BottomNavigationViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/BottomNavigationViewViewTransformer\n*L\n37#1:49,2\n*E\n"})
/* renamed from: vZ */
/* loaded from: classes7.dex */
public final class C29591vZ implements InterfaceC34598Mt6<BottomNavigationView> {

    /* renamed from: a */
    public static final C29591vZ f114277a = new C29591vZ();

    /* renamed from: b */
    public static final Class<BottomNavigationView> f114278b = BottomNavigationView.class;

    /* renamed from: c */
    public static final Set<String> f114279c;

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"menu", "app:menu", "id", "android:id", "title", "android:title", "titleCondensed", "android:titleCondensed", "menu", "item"});
        f114279c = of;
    }

    private C29591vZ() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f114279c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(BottomNavigationView bottomNavigationView, Map<String, Integer> attrs) {
        int i;
        Intrinsics.checkNotNullParameter(bottomNavigationView, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (String str : attrs.keySet()) {
            if (Intrinsics.areEqual(str, "app:menu") || Intrinsics.areEqual(str, "menu")) {
                C52263yY3 c52263yY3 = C52263yY3.f119708a;
                Resources resources = bottomNavigationView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                Integer num = attrs.get(str);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                for (Map.Entry<Integer, C52263yY3.C30616a> entry : c52263yY3.m3333a(resources, i).entrySet()) {
                    if (entry.getValue().m3330a() != 0) {
                        bottomNavigationView.m49312f().findItem(entry.getKey().intValue()).setTitle(bottomNavigationView.getResources().getString(entry.getValue().m3330a()));
                    }
                    if (entry.getValue().m3329b() != 0) {
                        bottomNavigationView.m49312f().findItem(entry.getKey().intValue()).setTitleCondensed(bottomNavigationView.getResources().getString(entry.getValue().m3329b()));
                    }
                }
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super BottomNavigationView> getViewType() {
        return f114278b;
    }
}
