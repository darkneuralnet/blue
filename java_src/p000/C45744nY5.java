package p000;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.tabs.TabItem;
import com.stripe.android.financialconnections.domain.Entry;
import dev.b3nedikt.reword.views.RewordTabItem;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\n\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LnY5;", "LQq6;", "Lcom/google/android/material/tabs/TabItem;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "c", "", "", "b", "Ljava/util/Set;", "supportedAttributes", "Ljava/lang/String;", "()Ljava/lang/String;", "viewName", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nY5  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C45744nY5 implements InterfaceC35507Qq6<TabItem> {

    /* renamed from: a */
    public static final C45744nY5 f100114a = new C45744nY5();

    /* renamed from: b */
    public static final Set<String> f100115b;

    /* renamed from: c */
    public static final String f100116c;

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{Entry.TYPE_TEXT, "android:text"});
        f100115b = of;
        f100116c = String.valueOf(Reflection.getOrCreateKotlinClass(TabItem.class).getQualifiedName());
    }

    private C45744nY5() {
    }

    @Override // p000.InterfaceC35507Qq6
    /* renamed from: b */
    public String mo19124b() {
        return f100116c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        r2 = kotlin.collections.MapsKt___MapsKt.toList(r1);
     */
    @Override // p000.InterfaceC35507Qq6
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabItem mo19125a(Context context, AttributeSet attributeSet) {
        Map<String, Integer> map;
        List list;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        Integer num = null;
        if (attributeSet != null) {
            map = C29312up.m9705c(attributeSet, f100115b);
        } else {
            map = null;
        }
        if (map != null && list != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            Pair pair = (Pair) firstOrNull;
            if (pair != null) {
                num = (Integer) pair.getSecond();
            }
        }
        RewordTabItem rewordTabItem = new RewordTabItem(context, attributeSet, num);
        rewordTabItem.setTag(C35415Qg4.view_tag, map);
        return rewordTabItem;
    }
}
