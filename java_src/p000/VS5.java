package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LVS5;", "", "Landroid/widget/LinearLayout;", "parent", "", "item", "", C17296a.f69688o, "b", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "", "I", "getSubItemLayout", "()I", "subItemLayout", "Ljava/lang/String;", "getDelimiter", "()Ljava/lang/String;", "setDelimiter", "(Ljava/lang/String;)V", "delimiter", "", "c", "Lkotlin/Lazy;", "()Ljava/util/Map;", "items", "", "e", "()Ljava/util/List;", "unusedViews", "<init>", "(ILjava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSubItemManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubItemManager.kt\nco/bird/android/subitemlayout/SubItemManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n1#2:55\n37#3,2:56\n*S KotlinDebug\n*F\n+ 1 SubItemManager.kt\nco/bird/android/subitemlayout/SubItemManager\n*L\n36#1:56,2\n*E\n"})
/* renamed from: VS5 */
/* loaded from: classes4.dex */
public final class VS5 {

    /* renamed from: a */
    public final int f39109a;

    /* renamed from: b */
    public String f39110b;

    /* renamed from: c */
    public final Lazy f39111c;

    /* renamed from: d */
    public final Lazy f39112d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "", "Landroid/widget/TextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VS5$a */
    /* loaded from: classes4.dex */
    public static final class C8653a extends Lambda implements Function0<Map<String, TextView>> {

        /* renamed from: g */
        public static final C8653a f39113g = new C8653a();

        public C8653a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, TextView> invoke() {
            return new LinkedHashMap();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/widget/TextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VS5$b */
    /* loaded from: classes4.dex */
    public static final class C8654b extends Lambda implements Function0<List<TextView>> {

        /* renamed from: g */
        public static final C8654b f39114g = new C8654b();

        public C8654b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<TextView> invoke() {
            return new ArrayList();
        }
    }

    public VS5(int i, String str) {
        Lazy lazy;
        Lazy lazy2;
        this.f39109a = i;
        this.f39110b = str;
        lazy = LazyKt__LazyJVMKt.lazy(C8653a.f39113g);
        this.f39111c = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(C8654b.f39114g);
        this.f39112d = lazy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r1 == null) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m79874a(LinearLayout parent, String item) {
        String str;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(item, "item");
        if (m79872c().containsKey(item)) {
            return;
        }
        TextView m79871d = m79871d(parent);
        String str2 = this.f39110b;
        if (str2 != null) {
            str = str2 + " " + item;
        }
        str = item;
        m79871d.setText(str);
        m79872c().put(item, m79871d);
        parent.addView(m79871d);
    }

    /* renamed from: b */
    public final void m79873b(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (parent.getChildCount() > 0) {
            parent.removeAllViews();
            m79872c().clear();
            CollectionsKt__MutableCollectionsKt.addAll(m79870e(), (TextView[]) m79872c().values().toArray(new TextView[0]));
        }
    }

    /* renamed from: c */
    public final Map<String, TextView> m79872c() {
        return (Map) this.f39111c.getValue();
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: d */
    public final TextView m79871d(LinearLayout linearLayout) {
        Object firstOrNull;
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m79870e());
        TextView textView = (TextView) firstOrNull;
        if (textView != null) {
            m79870e().remove(textView);
        }
        if (textView == null) {
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "parent.context");
            View m41761u = C40788fB0.m41761u(context, this.f39109a, linearLayout, false);
            Intrinsics.checkNotNull(m41761u, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) m41761u;
        }
        return textView;
    }

    /* renamed from: e */
    public final List<TextView> m79870e() {
        return (List) this.f39112d.getValue();
    }

    public /* synthetic */ VS5(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
