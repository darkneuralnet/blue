package p000;

import android.view.Menu;
import android.view.MenuItem;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¨\u0006\u0004"}, m28432d2 = {"Landroid/view/Menu;", "", "Landroid/view/MenuItem;", C17296a.f69688o, "core-ktx_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: sQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48633sQ2 {

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"sQ2$a", "", "Landroid/view/MenuItem;", "", "hasNext", C17296a.f69688o, "", "remove", "", "b", "I", "index", "core-ktx_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: sQ2$a */
    /* loaded from: classes.dex */
    public static final class C28303a implements Iterator<MenuItem>, KMutableIterator {

        /* renamed from: b */
        public int f108751b;

        /* renamed from: c */
        public final /* synthetic */ Menu f108752c;

        public C28303a(Menu menu) {
            this.f108752c = menu;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public MenuItem next() {
            Menu menu = this.f108752c;
            int i = this.f108751b;
            this.f108751b = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f108751b < this.f108752c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            Unit unit;
            Menu menu = this.f108752c;
            int i = this.f108751b - 1;
            this.f108751b = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                Intrinsics.checkNotNullExpressionValue(item, "getItem(index)");
                menu.removeItem(item.getItemId());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static final Iterator<MenuItem> m14223a(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        return new C28303a(menu);
    }
}
