package p000;

import android.content.res.Resources;
import android.widget.Toolbar;
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
import p000.C52263yY3;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LC56;", "LMt6;", "Landroid/widget/Toolbar;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nToolbarViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarViewTransformer.kt\ndev/b3nedikt/reword/transformer/ToolbarViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,58:1\n215#2:59\n215#2,2:60\n216#2:62\n*S KotlinDebug\n*F\n+ 1 ToolbarViewTransformer.kt\ndev/b3nedikt/reword/transformer/ToolbarViewTransformer\n*L\n35#1:59\n46#1:60,2\n35#1:62\n*E\n"})
/* renamed from: C56 */
/* loaded from: classes7.dex */
public final class C56 implements InterfaceC34598Mt6<Toolbar> {

    /* renamed from: a */
    public static final C56 f3384a = new C56();

    /* renamed from: b */
    public static final Class<Toolbar> f3385b = Toolbar.class;

    /* renamed from: c */
    public static final Set<String> f3386c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C56$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C0855a extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C0855a(Object obj) {
            super(1, obj, Toolbar.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m112895a(CharSequence charSequence) {
            ((Toolbar) this.receiver).setTitle(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m112895a(charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: C56$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C0856b extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C0856b(Object obj) {
            super(1, obj, Toolbar.class, "setSubtitle", "setSubtitle(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m112894a(CharSequence charSequence) {
            ((Toolbar) this.receiver).setSubtitle(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m112894a(charSequence);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"menu", "app:menu", "id", "android:id", "android:title", "titleCondensed", "android:titleCondensed", "menu", "item", "title", "android:subtitle", "subtitle"});
        f3386c = of;
    }

    private C56() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f3386c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6468b(Toolbar toolbar, Map<String, Integer> attrs) {
        Integer num;
        int i;
        Intrinsics.checkNotNullParameter(toolbar, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -2060497896:
                    if (key.equals("subtitle")) {
                        C37379Yq6.m74095a(toolbar, entry.getValue().intValue(), new C0856b(toolbar));
                        break;
                    } else {
                        break;
                    }
                case -1735877235:
                    if (key.equals("android:title")) {
                        C37379Yq6.m74095a(toolbar, entry.getValue().intValue(), new C0855a(toolbar));
                        break;
                    } else {
                        break;
                    }
                case 3347807:
                    if (key.equals("menu")) {
                        C52263yY3 c52263yY3 = C52263yY3.f119708a;
                        Resources resources = toolbar.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "resources");
                        num = attrs.get(entry.getKey());
                        if (num == null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        for (Map.Entry<Integer, C52263yY3.C30616a> entry2 : c52263yY3.m3333a(resources, i).entrySet()) {
                            if (entry2.getValue().m3330a() != 0) {
                                toolbar.getMenu().findItem(entry2.getKey().intValue()).setTitle(toolbar.getResources().getString(entry2.getValue().m3330a()));
                            }
                            if (entry2.getValue().m3329b() != 0) {
                                toolbar.getMenu().findItem(entry2.getKey().intValue()).setTitleCondensed(toolbar.getResources().getString(entry2.getValue().m3329b()));
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                case 110371416:
                    if (key.equals("title")) {
                        C37379Yq6.m74095a(toolbar, entry.getValue().intValue(), new C0855a(toolbar));
                        break;
                    } else {
                        break;
                    }
                case 1133452056:
                    if (key.equals("app:menu")) {
                        C52263yY3 c52263yY32 = C52263yY3.f119708a;
                        Resources resources2 = toolbar.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "resources");
                        num = attrs.get(entry.getKey());
                        if (num == null) {
                        }
                        while (r1.hasNext()) {
                        }
                        break;
                    } else {
                        break;
                    }
                case 1992100035:
                    if (key.equals("android:subtitle")) {
                        C37379Yq6.m74095a(toolbar, entry.getValue().intValue(), new C0856b(toolbar));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super Toolbar> getViewType() {
        return f3385b;
    }
}
