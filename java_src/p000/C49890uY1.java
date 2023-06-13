package p000;

import android.content.res.Configuration;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0005B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\f\u001a\u00020\bR<\u0010\u0011\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\rj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LuY1;", "", "LuY1$b;", "key", "LuY1$a;", "b", "", "configChanges", "", "c", "imageVectorEntry", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49890uY1 {

    /* renamed from: a */
    public final HashMap<C29252b, WeakReference<C29251a>> f112600a = new HashMap<>();

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LuY1$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "LtY1;", C17296a.f69688o, "LtY1;", "b", "()LtY1;", "imageVector", "I", "()I", "configFlags", "<init>", "(LtY1;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uY1$a */
    /* loaded from: classes.dex */
    public static final class C29251a {

        /* renamed from: a */
        public final C49297tY1 f112601a;

        /* renamed from: b */
        public final int f112602b;

        public C29251a(C49297tY1 imageVector, int i) {
            Intrinsics.checkNotNullParameter(imageVector, "imageVector");
            this.f112601a = imageVector;
            this.f112602b = i;
        }

        /* renamed from: a */
        public final int m10088a() {
            return this.f112602b;
        }

        /* renamed from: b */
        public final C49297tY1 m10087b() {
            return this.f112601a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C29251a) {
                C29251a c29251a = (C29251a) obj;
                return Intrinsics.areEqual(this.f112601a, c29251a.f112601a) && this.f112602b == c29251a.f112602b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f112601a.hashCode() * 31) + Integer.hashCode(this.f112602b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f112601a + ", configFlags=" + this.f112602b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u00060\tR\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000f\u001a\u00060\tR\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LuY1$b;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", C17296a.f69688o, "Landroid/content/res/Resources$Theme;", "getTheme", "()Landroid/content/res/Resources$Theme;", "theme", "b", "I", "getId", "()I", "id", "<init>", "(Landroid/content/res/Resources$Theme;I)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: uY1$b */
    /* loaded from: classes.dex */
    public static final class C29252b {

        /* renamed from: a */
        public final Resources.Theme f112603a;

        /* renamed from: b */
        public final int f112604b;

        public C29252b(Resources.Theme theme, int i) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.f112603a = theme;
            this.f112604b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C29252b) {
                C29252b c29252b = (C29252b) obj;
                return Intrinsics.areEqual(this.f112603a, c29252b.f112603a) && this.f112604b == c29252b.f112604b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f112603a.hashCode() * 31) + Integer.hashCode(this.f112604b);
        }

        public String toString() {
            return "Key(theme=" + this.f112603a + ", id=" + this.f112604b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: a */
    public final void m10092a() {
        this.f112600a.clear();
    }

    /* renamed from: b */
    public final C29251a m10091b(C29252b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        WeakReference<C29251a> weakReference = this.f112600a.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public final void m10090c(int i) {
        Iterator<Map.Entry<C29252b, WeakReference<C29251a>>> it = this.f112600a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<C29252b, WeakReference<C29251a>> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "it.next()");
            C29251a c29251a = next.getValue().get();
            if (c29251a == null || Configuration.needNewResources(i, c29251a.m10088a())) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void m10089d(C29252b key, C29251a imageVectorEntry) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageVectorEntry, "imageVectorEntry");
        this.f112600a.put(key, new WeakReference<>(imageVectorEntry));
    }
}
