package p000;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"LUS5;", "", "Landroid/widget/LinearLayout;", "c", "()Landroid/widget/LinearLayout;", "linearLayout", "LVS5;", "b", "()LVS5;", "setManager", "(LVS5;)V", "manager", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: US5 */
/* loaded from: classes4.dex */
public interface US5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: US5$a */
    /* loaded from: classes4.dex */
    public static final class C8301a {
        /* renamed from: a */
        public static void m81485a(US5 us5, String item) {
            Intrinsics.checkNotNullParameter(item, "item");
            VS5 mo54645b = us5.mo54645b();
            if (mo54645b != null) {
                mo54645b.m79874a(us5.mo54644c(), item);
            }
        }

        /* renamed from: b */
        public static void m81484b(US5 us5) {
            VS5 mo54645b = us5.mo54645b();
            if (mo54645b != null) {
                mo54645b.m79873b(us5.mo54644c());
            }
        }
    }

    /* renamed from: b */
    VS5 mo54645b();

    /* renamed from: c */
    LinearLayout mo54644c();
}
