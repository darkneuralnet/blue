package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b \b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bD\u0010EJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010!\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b!\u0010\"JO\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\b2\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001fH\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u000eJ\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0096\u0002R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R$\u0010\u0019\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.R4\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\u001d\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010,\u001a\u0004\b3\u0010.R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010,R$\u0010\u0016\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010=\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010,\u001a\u0004\b:\u0010.\"\u0004\b;\u0010<R2\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\n0\u001ej\b\u0012\u0004\u0012\u00020\n`\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b9\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u00108¨\u0006F"}, m28432d2 = {"LnE5;", "Lau0;", "", "Lbu0;", "LmE5;", "y", "LqE5;", "z", "", "index", "Ldb;", C17296a.f69688o, "anchor", "b", "", "A", "groupIndex", "x", "reader", "", "c", "(LmE5;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "e", "(LqE5;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "f", "", "iterator", "<set-?>", "[I", "j", "()[I", "I", "o", "()I", DateTokenConverter.CONVERTER_KEY, "[Ljava/lang/Object;", "s", "()[Ljava/lang/Object;", "u", "readers", "g", "Z", "w", "()Z", "h", "v", "setVersion$runtime_release", "(I)V", "version", "i", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "isEmpty", "<init>", "()V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n146#1,8:3486\n162#1,4:3494\n167#1,3:3504\n4513#2,5:3444\n4513#2,5:3449\n4513#2,5:3454\n4513#2,5:3466\n4513#2,5:3471\n4513#2,5:3476\n4513#2,5:3481\n1#3:3459\n3323#4,6:3460\n33#5,6:3498\n33#5,6:3507\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3486,8\n338#1:3494,4\n338#1:3504,3\n190#1:3444,5\n191#1:3449,5\n207#1:3454,5\n221#1:3466,5\n241#1:3471,5\n242#1:3476,5\n251#1:3481,5\n209#1:3460,6\n340#1:3498,6\n477#1:3507,6\n*E\n"})
/* renamed from: nE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45564nE5 implements InterfaceC38231au0, Iterable<InterfaceC38824bu0>, KMappedMarker {

    /* renamed from: c */
    public int f99662c;

    /* renamed from: e */
    public int f99664e;

    /* renamed from: f */
    public int f99665f;

    /* renamed from: g */
    public boolean f99666g;

    /* renamed from: h */
    public int f99667h;

    /* renamed from: b */
    public int[] f99661b = new int[0];

    /* renamed from: d */
    public Object[] f99663d = new Object[0];

    /* renamed from: i */
    public ArrayList<C19797db> f99668i = new ArrayList<>();

    /* renamed from: A */
    public final boolean m24129A(C19797db anchor) {
        boolean z;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!anchor.m44094b()) {
            return false;
        }
        int m19748s = C46750pE5.m19748s(this.f99668i, anchor.m44095a(), this.f99662c);
        if (m19748s >= 0 && Intrinsics.areEqual(this.f99668i.get(m19748s), anchor)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final void m24128C(int[] groups, int i, Object[] slots, int i2, ArrayList<C19797db> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.f99661b = groups;
        this.f99662c = i;
        this.f99663d = slots;
        this.f99664e = i2;
        this.f99668i = anchors;
    }

    /* renamed from: a */
    public final C19797db m24127a(int i) {
        if (!this.f99666g) {
            boolean z = false;
            if (i >= 0 && i < this.f99662c) {
                z = true;
            }
            if (z) {
                ArrayList<C19797db> arrayList = this.f99668i;
                int m19748s = C46750pE5.m19748s(arrayList, i, this.f99662c);
                if (m19748s < 0) {
                    C19797db c19797db = new C19797db(i);
                    arrayList.add(-(m19748s + 1), c19797db);
                    return c19797db;
                }
                C19797db c19797db2 = arrayList.get(m19748s);
                Intrinsics.checkNotNullExpressionValue(c19797db2, "get(location)");
                return c19797db2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        C35528Qt0.m87792x("use active SlotWriter to create an anchor location instead ".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public final int m24126b(C19797db anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.f99666g) {
            if (anchor.m44094b()) {
                return anchor.m44095a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        C35528Qt0.m87792x("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public final void m24125c(C44971mE5 reader) {
        boolean z;
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.m25875w() == this && this.f99665f > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f99665f--;
        } else {
            C35528Qt0.m87792x("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: e */
    public final void m24124e(C47343qE5 writer, int[] groups, int i, Object[] slots, int i2, ArrayList<C19797db> anchors) {
        boolean z;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (writer.m17807X() == this && this.f99666g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f99666g = false;
            m24128C(groups, i, slots, i2, anchors);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    /* renamed from: f */
    public final boolean m24123f() {
        return this.f99662c > 0 && C46750pE5.m19764c(this.f99661b, 0);
    }

    /* renamed from: h */
    public final ArrayList<C19797db> m24122h() {
        return this.f99668i;
    }

    public boolean isEmpty() {
        return this.f99662c == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC38824bu0> iterator() {
        return new C42595iE1(this, 0, this.f99662c);
    }

    /* renamed from: j */
    public final int[] m24121j() {
        return this.f99661b;
    }

    /* renamed from: o */
    public final int m24120o() {
        return this.f99662c;
    }

    /* renamed from: s */
    public final Object[] m24119s() {
        return this.f99663d;
    }

    /* renamed from: u */
    public final int m24118u() {
        return this.f99664e;
    }

    /* renamed from: v */
    public final int m24117v() {
        return this.f99667h;
    }

    /* renamed from: w */
    public final boolean m24116w() {
        return this.f99666g;
    }

    /* renamed from: x */
    public final boolean m24115x(int i, C19797db anchor) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!this.f99666g) {
            if (i >= 0 && i < this.f99662c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (m24129A(anchor)) {
                    int m19760g = C46750pE5.m19760g(this.f99661b, i) + i;
                    int m44095a = anchor.m44095a();
                    if (i <= m44095a && m44095a < m19760g) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            C35528Qt0.m87792x("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        C35528Qt0.m87792x("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: y */
    public final C44971mE5 m24114y() {
        if (!this.f99666g) {
            this.f99665f++;
            return new C44971mE5(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    /* renamed from: z */
    public final C47343qE5 m24113z() {
        boolean z;
        if (!this.f99666g) {
            if (this.f99665f <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f99666g = true;
                this.f99667h++;
                return new C47343qE5(this);
            }
            C35528Qt0.m87792x("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        C35528Qt0.m87792x("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }
}
