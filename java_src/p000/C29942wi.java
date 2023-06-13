package p000;

import androidx.appcompat.widget.SearchView;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lwi;", "LMt6;", "Landroidx/appcompat/widget/SearchView;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppCompatSearchViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppCompatSearchViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/AppCompatSearchViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,31:1\n215#2,2:32\n*S KotlinDebug\n*F\n+ 1 AppCompatSearchViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/AppCompatSearchViewViewTransformer\n*L\n24#1:32,2\n*E\n"})
/* renamed from: wi */
/* loaded from: classes7.dex */
public final class C29942wi implements InterfaceC34598Mt6<SearchView> {

    /* renamed from: a */
    public static final C29942wi f116375a = new C29942wi();

    /* renamed from: b */
    public static final Class<SearchView> f116376b = SearchView.class;

    /* renamed from: c */
    public static final Set<String> f116377c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wi$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C29943a extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C29943a(Object obj) {
            super(1, obj, SearchView.class, "setQueryHint", "setQueryHint(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m6466a(CharSequence charSequence) {
            ((SearchView) this.receiver).setQueryHint(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m6466a(charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wi$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C29944b extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C29944b(Object obj) {
            super(1, obj, SearchView.class, "setQueryHint", "setQueryHint(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m6465a(CharSequence charSequence) {
            ((SearchView) this.receiver).setQueryHint(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m6465a(charSequence);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"queryHint", "defaultQueryHint", "app:queryHint", "app:defaultQueryHint"});
        f116377c = of;
    }

    private C29942wi() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f116377c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(SearchView searchView, Map<String, Integer> attrs) {
        Intrinsics.checkNotNullParameter(searchView, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1807235217:
                    if (key.equals("queryHint")) {
                        C37379Yq6.m74095a(searchView, entry.getValue().intValue(), new C29943a(searchView));
                        break;
                    } else {
                        break;
                    }
                case -833131178:
                    if (key.equals("app:queryHint")) {
                        C37379Yq6.m74095a(searchView, entry.getValue().intValue(), new C29943a(searchView));
                        break;
                    } else {
                        break;
                    }
                case 3967534:
                    if (key.equals("defaultQueryHint")) {
                        C37379Yq6.m74095a(searchView, entry.getValue().intValue(), new C29944b(searchView));
                        break;
                    } else {
                        break;
                    }
                case 90751591:
                    if (key.equals("app:defaultQueryHint")) {
                        C37379Yq6.m74095a(searchView, entry.getValue().intValue(), new C29944b(searchView));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super SearchView> getViewType() {
        return f116376b;
    }
}
