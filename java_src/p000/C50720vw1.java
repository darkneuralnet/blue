package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C33918Jw1;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lvw1;", "", "", "Lew1;", "fontList", "LJw1;", "fontWeight", "LEw1;", "fontStyle", C17296a.f69688o, "(Ljava/util/List;LJw1;I)Ljava/util/List;", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n102#1,34:189\n102#1,34:234\n108#1,28:279\n108#1,28:318\n35#2,3:166\n38#2,2:173\n40#2:176\n35#2,3:177\n38#2,2:184\n40#2:187\n35#2,3:223\n38#2,2:230\n40#2:233\n35#2,3:268\n38#2,2:275\n40#2:278\n35#2,3:307\n38#2,2:314\n40#2:317\n35#2,3:346\n38#2,2:353\n40#2:356\n35#2,3:357\n38#2,2:364\n40#2:367\n35#2,3:368\n38#2,2:375\n40#2:378\n33#3,4:169\n38#3:175\n33#3,4:180\n38#3:186\n33#3,4:226\n38#3:232\n33#3,4:271\n38#3:277\n33#3,4:310\n38#3:316\n33#3,4:349\n38#3:355\n33#3,4:360\n38#3:366\n33#3,4:371\n38#3:377\n1#4:188\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:189,34\n71#1:234,34\n80#1:279,28\n87#1:318,28\n49#1:166,3\n49#1:173,2\n49#1:176\n57#1:177,3\n57#1:184,2\n57#1:187\n65#1:223,3\n65#1:230,2\n65#1:233\n71#1:268,3\n71#1:275,2\n71#1:278\n80#1:307,3\n80#1:314,2\n80#1:317\n87#1:346,3\n87#1:353,2\n87#1:356\n135#1:357,3\n135#1:364,2\n135#1:367\n135#1:368,3\n135#1:375,2\n135#1:378\n49#1:169,4\n49#1:175\n57#1:180,4\n57#1:186\n65#1:226,4\n65#1:232\n71#1:271,4\n71#1:277\n80#1:310,4\n80#1:316\n87#1:349,4\n87#1:355\n135#1:360,4\n135#1:366\n135#1:371,4\n135#1:377\n*E\n"})
/* renamed from: vw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50720vw1 {
    /* renamed from: a */
    public final List<InterfaceC40641ew1> m7735a(List<? extends InterfaceC40641ew1> fontList, C33918Jw1 fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            InterfaceC40641ew1 interfaceC40641ew1 = fontList.get(i3);
            InterfaceC40641ew1 interfaceC40641ew12 = interfaceC40641ew1;
            if ((Intrinsics.areEqual(interfaceC40641ew12.mo39574b(), fontWeight) && C32748Ew1.m108206f(interfaceC40641ew12.mo39573c(), i)) ? false : false) {
                arrayList.add(interfaceC40641ew1);
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            InterfaceC40641ew1 interfaceC40641ew13 = fontList.get(i4);
            if (C32748Ew1.m108206f(interfaceC40641ew13.mo39573c(), i)) {
                arrayList2.add(interfaceC40641ew13);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends InterfaceC40641ew1> list = fontList;
        C33918Jw1.C4281a c4281a = C33918Jw1.f18784c;
        C33918Jw1 c33918Jw1 = null;
        if (fontWeight.compareTo(c4281a.m99538f()) < 0) {
            int size3 = list.size();
            C33918Jw1 c33918Jw12 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                C33918Jw1 mo39574b = list.get(i5).mo39574b();
                if (mo39574b.compareTo(fontWeight) < 0) {
                    if (c33918Jw1 == null || mo39574b.compareTo(c33918Jw1) > 0) {
                        c33918Jw1 = mo39574b;
                    }
                } else if (mo39574b.compareTo(fontWeight) > 0) {
                    if (c33918Jw12 == null || mo39574b.compareTo(c33918Jw12) < 0) {
                        c33918Jw12 = mo39574b;
                    }
                } else {
                    c33918Jw12 = mo39574b;
                    c33918Jw1 = c33918Jw12;
                    break;
                }
                i5++;
            }
            if (c33918Jw1 != null) {
                c33918Jw12 = c33918Jw1;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                InterfaceC40641ew1 interfaceC40641ew14 = list.get(i2);
                if (Intrinsics.areEqual(interfaceC40641ew14.mo39574b(), c33918Jw12)) {
                    arrayList3.add(interfaceC40641ew14);
                }
                i2++;
            }
            return arrayList3;
        } else if (fontWeight.compareTo(c4281a.m99537g()) > 0) {
            int size5 = list.size();
            C33918Jw1 c33918Jw13 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                C33918Jw1 mo39574b2 = list.get(i6).mo39574b();
                if (mo39574b2.compareTo(fontWeight) < 0) {
                    if (c33918Jw1 == null || mo39574b2.compareTo(c33918Jw1) > 0) {
                        c33918Jw1 = mo39574b2;
                    }
                } else if (mo39574b2.compareTo(fontWeight) > 0) {
                    if (c33918Jw13 == null || mo39574b2.compareTo(c33918Jw13) < 0) {
                        c33918Jw13 = mo39574b2;
                    }
                } else {
                    c33918Jw13 = mo39574b2;
                    c33918Jw1 = c33918Jw13;
                    break;
                }
                i6++;
            }
            if (c33918Jw13 == null) {
                c33918Jw13 = c33918Jw1;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i2 < size6) {
                InterfaceC40641ew1 interfaceC40641ew15 = list.get(i2);
                if (Intrinsics.areEqual(interfaceC40641ew15.mo39574b(), c33918Jw13)) {
                    arrayList4.add(interfaceC40641ew15);
                }
                i2++;
            }
            return arrayList4;
        } else {
            C33918Jw1 m99537g = c4281a.m99537g();
            int size7 = list.size();
            C33918Jw1 c33918Jw14 = null;
            C33918Jw1 c33918Jw15 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                C33918Jw1 mo39574b3 = list.get(i7).mo39574b();
                if (m99537g == null || mo39574b3.compareTo(m99537g) <= 0) {
                    if (mo39574b3.compareTo(fontWeight) < 0) {
                        if (c33918Jw14 == null || mo39574b3.compareTo(c33918Jw14) > 0) {
                            c33918Jw14 = mo39574b3;
                        }
                    } else if (mo39574b3.compareTo(fontWeight) > 0) {
                        if (c33918Jw15 == null || mo39574b3.compareTo(c33918Jw15) < 0) {
                            c33918Jw15 = mo39574b3;
                        }
                    } else {
                        c33918Jw14 = mo39574b3;
                        c33918Jw15 = c33918Jw14;
                        break;
                    }
                }
                i7++;
            }
            if (c33918Jw15 != null) {
                c33918Jw14 = c33918Jw15;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            for (int i8 = 0; i8 < size8; i8++) {
                InterfaceC40641ew1 interfaceC40641ew16 = list.get(i8);
                if (Intrinsics.areEqual(interfaceC40641ew16.mo39574b(), c33918Jw14)) {
                    arrayList5.add(interfaceC40641ew16);
                }
            }
            if (arrayList5.isEmpty()) {
                C33918Jw1 m99537g2 = C33918Jw1.f18784c.m99537g();
                int size9 = list.size();
                C33918Jw1 c33918Jw16 = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= size9) {
                        break;
                    }
                    C33918Jw1 mo39574b4 = list.get(i9).mo39574b();
                    if (m99537g2 == null || mo39574b4.compareTo(m99537g2) >= 0) {
                        if (mo39574b4.compareTo(fontWeight) < 0) {
                            if (c33918Jw1 == null || mo39574b4.compareTo(c33918Jw1) > 0) {
                                c33918Jw1 = mo39574b4;
                            }
                        } else if (mo39574b4.compareTo(fontWeight) > 0) {
                            if (c33918Jw16 == null || mo39574b4.compareTo(c33918Jw16) < 0) {
                                c33918Jw16 = mo39574b4;
                            }
                        } else {
                            c33918Jw1 = mo39574b4;
                            c33918Jw16 = c33918Jw1;
                            break;
                        }
                    }
                    i9++;
                }
                if (c33918Jw16 != null) {
                    c33918Jw1 = c33918Jw16;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size10 = list.size();
                while (i2 < size10) {
                    InterfaceC40641ew1 interfaceC40641ew17 = list.get(i2);
                    if (Intrinsics.areEqual(interfaceC40641ew17.mo39574b(), c33918Jw1)) {
                        arrayList6.add(interfaceC40641ew17);
                    }
                    i2++;
                }
                return arrayList6;
            }
            return arrayList5;
        }
    }
}
