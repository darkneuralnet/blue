package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"LoE5;", "Lbu0;", "", "", "iterator", "", C17296a.f69688o, "LnE5;", "b", "LnE5;", "getTable", "()LnE5;", "table", "", "c", "I", "getGroup", "()I", "group", DateTokenConverter.CONVERTER_KEY, "getVersion", "version", "<init>", "(LnE5;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,3443:1\n146#2,8:3444\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTableGroup\n*L\n3016#1:3444,8\n*E\n"})
/* renamed from: oE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46157oE5 implements InterfaceC38824bu0, Iterable<InterfaceC38824bu0>, KMappedMarker {

    /* renamed from: b */
    public final C45564nE5 f101669b;

    /* renamed from: c */
    public final int f101670c;

    /* renamed from: d */
    public final int f101671d;

    public C46157oE5(C45564nE5 table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f101669b = table;
        this.f101670c = i;
        this.f101671d = i2;
    }

    /* renamed from: a */
    public final void m21509a() {
        if (this.f101669b.m24117v() == this.f101671d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC38824bu0> iterator() {
        int m19786G;
        m21509a();
        C45564nE5 c45564nE5 = this.f101669b;
        int i = this.f101670c;
        m19786G = C46750pE5.m19786G(c45564nE5.m24121j(), this.f101670c);
        return new C42595iE1(c45564nE5, i + 1, i + m19786G);
    }
}
