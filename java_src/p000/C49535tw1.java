package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C26259mp;
import p000.C50128uw1;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¨\u0006\r"}, m28432d2 = {"", "Lew1;", "LAc6;", "typefaceRequest", "Lmp;", "asyncTypefaceCache", "LxV3;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Lkotlin/Pair;", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n416#2:428\n417#2,9:430\n416#2:439\n417#2,7:441\n424#2,2:449\n24#3:429\n24#3:440\n1#4:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n185#1:428\n185#1:430,9\n201#1:439\n201#1:441,7\n201#1:449,2\n185#1:429\n201#1:440\n*E\n"})
/* renamed from: tw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49535tw1 {
    /* renamed from: b */
    public static final Pair<List<InterfaceC40641ew1>, Object> m11196b(List<? extends InterfaceC40641ew1> list, C31637Ac6 c31637Ac6, C26259mp c26259mp, InterfaceC51643xV3 interfaceC51643xV3, Function1<? super C31637Ac6, ? extends Object> function1) {
        RX5 rx5;
        C49118tE2 c49118tE2;
        Object mo5114b;
        MA5 ma5;
        RX5 rx52;
        C49118tE2 c49118tE22;
        Object m116783constructorimpl;
        MA5 ma52;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            InterfaceC40641ew1 interfaceC40641ew1 = list.get(i);
            int mo39575a = interfaceC40641ew1.mo39575a();
            C50128uw1.C29344a c29344a = C50128uw1.f113218a;
            if (C50128uw1.m9479e(mo39575a, c29344a.m9475b())) {
                rx5 = c26259mp.f98843d;
                synchronized (rx5) {
                    C26259mp.C26261b c26261b = new C26259mp.C26261b(interfaceC40641ew1, interfaceC51643xV3.mo5115a());
                    c49118tE2 = c26259mp.f98841b;
                    C26259mp.C26260a c26260a = (C26259mp.C26260a) c49118tE2.m12574d(c26261b);
                    if (c26260a == null) {
                        ma5 = c26259mp.f98842c;
                        c26260a = (C26259mp.C26260a) ma5.m95622b(c26261b);
                    }
                    if (c26260a != null) {
                        mo5114b = c26260a.m24886g();
                    } else {
                        Unit unit = Unit.INSTANCE;
                        try {
                            mo5114b = interfaceC51643xV3.mo5114b(interfaceC40641ew1);
                            C26259mp.m24894f(c26259mp, interfaceC40641ew1, interfaceC51643xV3, mo5114b, false, 8, null);
                        } catch (Exception e) {
                            throw new IllegalStateException("Unable to load font " + interfaceC40641ew1, e);
                        }
                    }
                }
                if (mo5114b != null) {
                    return TuplesKt.m28425to(list2, C33216Gw1.m104572a(c31637Ac6.m115433e(), mo5114b, interfaceC40641ew1, c31637Ac6.m115432f(), c31637Ac6.m115434d()));
                }
                throw new IllegalStateException("Unable to load font " + interfaceC40641ew1);
            }
            if (C50128uw1.m9479e(mo39575a, c29344a.m9474c())) {
                rx52 = c26259mp.f98843d;
                synchronized (rx52) {
                    C26259mp.C26261b c26261b2 = new C26259mp.C26261b(interfaceC40641ew1, interfaceC51643xV3.mo5115a());
                    c49118tE22 = c26259mp.f98841b;
                    C26259mp.C26260a c26260a2 = (C26259mp.C26260a) c49118tE22.m12574d(c26261b2);
                    if (c26260a2 == null) {
                        ma52 = c26259mp.f98842c;
                        c26260a2 = (C26259mp.C26260a) ma52.m95622b(c26261b2);
                    }
                    if (c26260a2 != null) {
                        m116783constructorimpl = c26260a2.m24886g();
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(interfaceC51643xV3.mo5114b(interfaceC40641ew1));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                            m116783constructorimpl = null;
                        }
                        C26259mp.m24894f(c26259mp, interfaceC40641ew1, interfaceC51643xV3, m116783constructorimpl, false, 8, null);
                    }
                }
                if (m116783constructorimpl != null) {
                    return TuplesKt.m28425to(list2, C33216Gw1.m104572a(c31637Ac6.m115433e(), m116783constructorimpl, interfaceC40641ew1, c31637Ac6.m115432f(), c31637Ac6.m115434d()));
                }
            } else if (C50128uw1.m9479e(mo39575a, c29344a.m9476a())) {
                C26259mp.C26260a m24896d = c26259mp.m24896d(interfaceC40641ew1, interfaceC51643xV3);
                if (m24896d == null) {
                    if (list2 == null) {
                        list2 = CollectionsKt__CollectionsKt.mutableListOf(interfaceC40641ew1);
                    } else {
                        list2.add(interfaceC40641ew1);
                    }
                } else if (!C26259mp.C26260a.m24888e(m24896d.m24886g()) && m24896d.m24886g() != null) {
                    return TuplesKt.m28425to(list2, C33216Gw1.m104572a(c31637Ac6.m115433e(), m24896d.m24886g(), interfaceC40641ew1, c31637Ac6.m115432f(), c31637Ac6.m115434d()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + interfaceC40641ew1);
            }
        }
        return TuplesKt.m28425to(list2, function1.invoke(c31637Ac6));
    }
}
