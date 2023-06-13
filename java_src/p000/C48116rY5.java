package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u00020\b*\u00060\u0002R\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0016R$\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LrY5;", "LMt6;", "Lcom/google/android/material/tabs/TabLayout$TabView;", "Lcom/google/android/material/tabs/TabLayout;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TabViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,26:1\n215#2,2:27\n*S KotlinDebug\n*F\n+ 1 TabViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TabViewViewTransformer\n*L\n20#1:27,2\n*E\n"})
/* renamed from: rY5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C48116rY5 implements InterfaceC34598Mt6<TabLayout.TabView> {

    /* renamed from: a */
    public static final C48116rY5 f107275a = new C48116rY5();

    /* renamed from: b */
    public static final Class<TabLayout.TabView> f107276b = TabLayout.TabView.class;

    /* renamed from: c */
    public static final Set<String> f107277c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rY5$a */
    /* loaded from: classes7.dex */
    public static final class C27947a extends Lambda implements Function1<CharSequence, Unit> {

        /* renamed from: g */
        public final /* synthetic */ TabLayout.TabView f107278g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27947a(TabLayout.TabView tabView) {
            super(1);
            this.f107278g = tabView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TabLayout.C17910g m48748n = this.f107278g.m48748n();
            if (m48748n == null) {
                return;
            }
            m48748n.m48705r(it);
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{Entry.TYPE_TEXT, "android:text"});
        f107277c = of;
    }

    private C48116rY5() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f107277c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(TabLayout.TabView tabView, Map<String, Integer> attrs) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(tabView, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.areEqual(key, "android:text")) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(key, Entry.TYPE_TEXT);
            }
            if (areEqual) {
                C37379Yq6.m74095a(tabView, entry.getValue().intValue(), new C27947a(tabView));
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super TabLayout.TabView> getViewType() {
        return f107276b;
    }
}
