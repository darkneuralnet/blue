package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010!\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010%¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0096\u0002J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010!\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b \u0010\u0014R\u0017\u0010$\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b\f\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'¨\u0006."}, m28432d2 = {"Lbk6;", "Lek6;", "", "", "iterator", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "name", "", "F", "h", "()F", "rotation", DateTokenConverter.CONVERTER_KEY, "e", "pivotX", "f", "pivotY", "j", "scaleX", "g", "o", "scaleY", "s", "translationX", "i", "u", "translationY", "", "LpJ3;", "Ljava/util/List;", "()Ljava/util/List;", "clipPathData", "k", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38730bk6 extends AbstractC40526ek6 implements Iterable<AbstractC40526ek6>, KMappedMarker {

    /* renamed from: b */
    public final String f58020b;

    /* renamed from: c */
    public final float f58021c;

    /* renamed from: d */
    public final float f58022d;

    /* renamed from: e */
    public final float f58023e;

    /* renamed from: f */
    public final float f58024f;

    /* renamed from: g */
    public final float f58025g;

    /* renamed from: h */
    public final float f58026h;

    /* renamed from: i */
    public final float f58027i;

    /* renamed from: j */
    public final List<AbstractC46793pJ3> f58028j;

    /* renamed from: k */
    public final List<AbstractC40526ek6> f58029k;

    @Metadata(m28433d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"bk6$a", "", "Lek6;", "", "hasNext", C17296a.f69688o, "b", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bk6$a */
    /* loaded from: classes.dex */
    public static final class C12490a implements Iterator<AbstractC40526ek6>, KMappedMarker {

        /* renamed from: b */
        public final Iterator<AbstractC40526ek6> f58030b;

        public C12490a(C38730bk6 c38730bk6) {
            this.f58030b = c38730bk6.f58029k.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public AbstractC40526ek6 next() {
            return this.f58030b.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f58030b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C38730bk6() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    /* renamed from: b */
    public final List<AbstractC46793pJ3> m64053b() {
        return this.f58028j;
    }

    /* renamed from: c */
    public final String m64052c() {
        return this.f58020b;
    }

    /* renamed from: e */
    public final float m64051e() {
        return this.f58022d;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C38730bk6)) {
            return false;
        }
        C38730bk6 c38730bk6 = (C38730bk6) obj;
        if (!Intrinsics.areEqual(this.f58020b, c38730bk6.f58020b)) {
            return false;
        }
        if (this.f58021c == c38730bk6.f58021c) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.f58022d == c38730bk6.f58022d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f58023e == c38730bk6.f58023e) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f58024f == c38730bk6.f58024f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f58025g == c38730bk6.f58025g) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        if (this.f58026h == c38730bk6.f58026h) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        if (this.f58027i == c38730bk6.f58027i) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7 && Intrinsics.areEqual(this.f58028j, c38730bk6.f58028j) && Intrinsics.areEqual(this.f58029k, c38730bk6.f58029k)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final float m64050f() {
        return this.f58023e;
    }

    /* renamed from: h */
    public final float m64049h() {
        return this.f58021c;
    }

    public int hashCode() {
        return (((((((((((((((((this.f58020b.hashCode() * 31) + Float.hashCode(this.f58021c)) * 31) + Float.hashCode(this.f58022d)) * 31) + Float.hashCode(this.f58023e)) * 31) + Float.hashCode(this.f58024f)) * 31) + Float.hashCode(this.f58025g)) * 31) + Float.hashCode(this.f58026h)) * 31) + Float.hashCode(this.f58027i)) * 31) + this.f58028j.hashCode()) * 31) + this.f58029k.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC40526ek6> iterator() {
        return new C12490a(this);
    }

    /* renamed from: j */
    public final float m64048j() {
        return this.f58024f;
    }

    /* renamed from: o */
    public final float m64047o() {
        return this.f58025g;
    }

    /* renamed from: s */
    public final float m64046s() {
        return this.f58026h;
    }

    /* renamed from: u */
    public final float m64045u() {
        return this.f58027i;
    }

    public /* synthetic */ C38730bk6(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & 128) == 0 ? f7 : 0.0f, (i & 256) != 0 ? C39934dk6.m43807e() : list, (i & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C38730bk6(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends AbstractC46793pJ3> clipPathData, List<? extends AbstractC40526ek6> children) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(children, "children");
        this.f58020b = name;
        this.f58021c = f;
        this.f58022d = f2;
        this.f58023e = f3;
        this.f58024f = f4;
        this.f58025g = f5;
        this.f58026h = f6;
        this.f58027i = f7;
        this.f58028j = clipPathData;
        this.f58029k = children;
    }
}
