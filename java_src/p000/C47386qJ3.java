package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC46793pJ3;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0006"}, m28432d2 = {"", "", "args", "", "LpJ3;", C17296a.f69688o, "ui-graphics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n283#1:334\n284#1,9:338\n283#1:348\n284#1,9:352\n283#1:362\n284#1,9:366\n283#1:376\n284#1,9:380\n283#1:390\n284#1,9:394\n283#1:404\n284#1,9:408\n283#1:418\n284#1,9:422\n283#1:432\n284#1,9:436\n283#1:446\n284#1,9:450\n283#1:460\n284#1,9:464\n283#1:474\n284#1,9:478\n283#1:488\n284#1,9:492\n283#1:502\n284#1,9:506\n283#1:516\n284#1,9:520\n283#1:530\n284#1,9:534\n283#1:544\n284#1,9:548\n283#1:558\n284#1,9:562\n283#1:572\n284#1,9:576\n1549#2:335\n1620#2,2:336\n1622#2:347\n1549#2:349\n1620#2,2:350\n1622#2:361\n1549#2:363\n1620#2,2:364\n1622#2:375\n1549#2:377\n1620#2,2:378\n1622#2:389\n1549#2:391\n1620#2,2:392\n1622#2:403\n1549#2:405\n1620#2,2:406\n1622#2:417\n1549#2:419\n1620#2,2:420\n1622#2:431\n1549#2:433\n1620#2,2:434\n1622#2:445\n1549#2:447\n1620#2,2:448\n1622#2:459\n1549#2:461\n1620#2,2:462\n1622#2:473\n1549#2:475\n1620#2,2:476\n1622#2:487\n1549#2:489\n1620#2,2:490\n1622#2:501\n1549#2:503\n1620#2,2:504\n1622#2:515\n1549#2:517\n1620#2,2:518\n1622#2:529\n1549#2:531\n1620#2,2:532\n1622#2:543\n1549#2:545\n1620#2,2:546\n1622#2:557\n1549#2:559\n1620#2,2:560\n1622#2:571\n1549#2:573\n1620#2,2:574\n1622#2:585\n1549#2:586\n1620#2,3:587\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:334\n153#1:338,9\n157#1:348\n157#1:352,9\n161#1:362\n161#1:366,9\n165#1:376\n165#1:380,9\n169#1:390\n169#1:394,9\n173#1:404\n173#1:408,9\n177#1:418\n177#1:422,9\n181#1:432\n181#1:436,9\n185#1:446\n185#1:450,9\n196#1:460\n196#1:464,9\n207#1:474\n207#1:478,9\n216#1:488\n216#1:492,9\n225#1:502\n225#1:506,9\n234#1:516\n234#1:520,9\n243#1:530\n243#1:534,9\n247#1:544\n247#1:548,9\n251#1:558\n251#1:562,9\n263#1:572\n263#1:576,9\n153#1:335\n153#1:336,2\n153#1:347\n157#1:349\n157#1:350,2\n157#1:361\n161#1:363\n161#1:364,2\n161#1:375\n165#1:377\n165#1:378,2\n165#1:389\n169#1:391\n169#1:392,2\n169#1:403\n173#1:405\n173#1:406,2\n173#1:417\n177#1:419\n177#1:420,2\n177#1:431\n181#1:433\n181#1:434,2\n181#1:445\n185#1:447\n185#1:448,2\n185#1:459\n196#1:461\n196#1:462,2\n196#1:473\n207#1:475\n207#1:476,2\n207#1:487\n216#1:489\n216#1:490,2\n216#1:501\n225#1:503\n225#1:504,2\n225#1:515\n234#1:517\n234#1:518,2\n234#1:529\n243#1:531\n243#1:532,2\n243#1:543\n247#1:545\n247#1:546,2\n247#1:557\n251#1:559\n251#1:560,2\n251#1:571\n263#1:573\n263#1:574,2\n263#1:585\n283#1:586\n283#1:587,3\n*E\n"})
/* renamed from: qJ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47386qJ3 {
    /* renamed from: a */
    public static final List<AbstractC46793pJ3> m17630a(char c, float[] args) {
        boolean z;
        IntProgression step;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        float[] copyOfRange;
        boolean z2;
        boolean z3;
        IntProgression step2;
        int collectionSizeOrDefault2;
        float[] copyOfRange2;
        boolean z4;
        boolean z5;
        IntProgression step3;
        int collectionSizeOrDefault3;
        float[] copyOfRange3;
        IntProgression step4;
        int collectionSizeOrDefault4;
        float[] copyOfRange4;
        IntProgression step5;
        int collectionSizeOrDefault5;
        float[] copyOfRange5;
        IntProgression step6;
        int collectionSizeOrDefault6;
        float[] copyOfRange6;
        IntProgression step7;
        int collectionSizeOrDefault7;
        float[] copyOfRange7;
        IntProgression step8;
        int collectionSizeOrDefault8;
        float[] copyOfRange8;
        IntProgression step9;
        int collectionSizeOrDefault9;
        float[] copyOfRange9;
        IntProgression step10;
        int collectionSizeOrDefault10;
        float[] copyOfRange10;
        AbstractC46793pJ3 abstractC46793pJ3;
        IntProgression step11;
        int collectionSizeOrDefault11;
        float[] copyOfRange11;
        IntProgression step12;
        int collectionSizeOrDefault12;
        float[] copyOfRange12;
        IntProgression step13;
        int collectionSizeOrDefault13;
        float[] copyOfRange13;
        IntProgression step14;
        int collectionSizeOrDefault14;
        float[] copyOfRange14;
        IntProgression step15;
        int collectionSizeOrDefault15;
        float[] copyOfRange15;
        IntProgression step16;
        int collectionSizeOrDefault16;
        float[] copyOfRange16;
        IntProgression step17;
        int collectionSizeOrDefault17;
        float[] copyOfRange17;
        IntProgression step18;
        int collectionSizeOrDefault18;
        float[] copyOfRange18;
        List<AbstractC46793pJ3> listOf;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(AbstractC46793pJ3.C27253b.f103463c);
            return listOf;
        }
        if (c == 'm') {
            step18 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault18 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step18, 10);
            arrayList = new ArrayList(collectionSizeOrDefault18);
            Iterator<Integer> it = step18.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                copyOfRange18 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt, nextInt + 2);
                AbstractC46793pJ3 c27265n = new AbstractC46793pJ3.C27265n(copyOfRange18[0], copyOfRange18[1]);
                if ((c27265n instanceof AbstractC46793pJ3.C27257f) && nextInt > 0) {
                    c27265n = new AbstractC46793pJ3.C27256e(copyOfRange18[0], copyOfRange18[1]);
                } else if (nextInt > 0) {
                    c27265n = new AbstractC46793pJ3.C27264m(copyOfRange18[0], copyOfRange18[1]);
                }
                arrayList.add(c27265n);
            }
        } else if (c == 'M') {
            step17 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault17 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step17, 10);
            arrayList = new ArrayList(collectionSizeOrDefault17);
            Iterator<Integer> it2 = step17.iterator();
            while (it2.hasNext()) {
                int nextInt2 = ((IntIterator) it2).nextInt();
                copyOfRange17 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt2, nextInt2 + 2);
                AbstractC46793pJ3 c27257f = new AbstractC46793pJ3.C27257f(copyOfRange17[0], copyOfRange17[1]);
                if (nextInt2 > 0) {
                    c27257f = new AbstractC46793pJ3.C27256e(copyOfRange17[0], copyOfRange17[1]);
                } else if ((c27257f instanceof AbstractC46793pJ3.C27265n) && nextInt2 > 0) {
                    c27257f = new AbstractC46793pJ3.C27264m(copyOfRange17[0], copyOfRange17[1]);
                }
                arrayList.add(c27257f);
            }
        } else if (c == 'l') {
            step16 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault16 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step16, 10);
            arrayList = new ArrayList(collectionSizeOrDefault16);
            Iterator<Integer> it3 = step16.iterator();
            while (it3.hasNext()) {
                int nextInt3 = ((IntIterator) it3).nextInt();
                copyOfRange16 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt3, nextInt3 + 2);
                AbstractC46793pJ3 c27264m = new AbstractC46793pJ3.C27264m(copyOfRange16[0], copyOfRange16[1]);
                if ((c27264m instanceof AbstractC46793pJ3.C27257f) && nextInt3 > 0) {
                    c27264m = new AbstractC46793pJ3.C27256e(copyOfRange16[0], copyOfRange16[1]);
                } else if ((c27264m instanceof AbstractC46793pJ3.C27265n) && nextInt3 > 0) {
                    c27264m = new AbstractC46793pJ3.C27264m(copyOfRange16[0], copyOfRange16[1]);
                }
                arrayList.add(c27264m);
            }
        } else if (c == 'L') {
            step15 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            collectionSizeOrDefault15 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step15, 10);
            arrayList = new ArrayList(collectionSizeOrDefault15);
            Iterator<Integer> it4 = step15.iterator();
            while (it4.hasNext()) {
                int nextInt4 = ((IntIterator) it4).nextInt();
                copyOfRange15 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt4, nextInt4 + 2);
                AbstractC46793pJ3 c27256e = new AbstractC46793pJ3.C27256e(copyOfRange15[0], copyOfRange15[1]);
                if ((c27256e instanceof AbstractC46793pJ3.C27257f) && nextInt4 > 0) {
                    c27256e = new AbstractC46793pJ3.C27256e(copyOfRange15[0], copyOfRange15[1]);
                } else if ((c27256e instanceof AbstractC46793pJ3.C27265n) && nextInt4 > 0) {
                    c27256e = new AbstractC46793pJ3.C27264m(copyOfRange15[0], copyOfRange15[1]);
                }
                arrayList.add(c27256e);
            }
        } else if (c == 'h') {
            step14 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault14 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step14, 10);
            arrayList = new ArrayList(collectionSizeOrDefault14);
            Iterator<Integer> it5 = step14.iterator();
            while (it5.hasNext()) {
                int nextInt5 = ((IntIterator) it5).nextInt();
                copyOfRange14 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt5, nextInt5 + 1);
                AbstractC46793pJ3 c27263l = new AbstractC46793pJ3.C27263l(copyOfRange14[0]);
                if ((c27263l instanceof AbstractC46793pJ3.C27257f) && nextInt5 > 0) {
                    c27263l = new AbstractC46793pJ3.C27256e(copyOfRange14[0], copyOfRange14[1]);
                } else if ((c27263l instanceof AbstractC46793pJ3.C27265n) && nextInt5 > 0) {
                    c27263l = new AbstractC46793pJ3.C27264m(copyOfRange14[0], copyOfRange14[1]);
                }
                arrayList.add(c27263l);
            }
        } else if (c == 'H') {
            step13 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault13 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step13, 10);
            arrayList = new ArrayList(collectionSizeOrDefault13);
            Iterator<Integer> it6 = step13.iterator();
            while (it6.hasNext()) {
                int nextInt6 = ((IntIterator) it6).nextInt();
                copyOfRange13 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt6, nextInt6 + 1);
                AbstractC46793pJ3 c27255d = new AbstractC46793pJ3.C27255d(copyOfRange13[0]);
                if ((c27255d instanceof AbstractC46793pJ3.C27257f) && nextInt6 > 0) {
                    c27255d = new AbstractC46793pJ3.C27256e(copyOfRange13[0], copyOfRange13[1]);
                } else if ((c27255d instanceof AbstractC46793pJ3.C27265n) && nextInt6 > 0) {
                    c27255d = new AbstractC46793pJ3.C27264m(copyOfRange13[0], copyOfRange13[1]);
                }
                arrayList.add(c27255d);
            }
        } else if (c == 'v') {
            step12 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault12 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step12, 10);
            arrayList = new ArrayList(collectionSizeOrDefault12);
            Iterator<Integer> it7 = step12.iterator();
            while (it7.hasNext()) {
                int nextInt7 = ((IntIterator) it7).nextInt();
                copyOfRange12 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt7, nextInt7 + 1);
                AbstractC46793pJ3 c27269r = new AbstractC46793pJ3.C27269r(copyOfRange12[0]);
                if ((c27269r instanceof AbstractC46793pJ3.C27257f) && nextInt7 > 0) {
                    c27269r = new AbstractC46793pJ3.C27256e(copyOfRange12[0], copyOfRange12[1]);
                } else if ((c27269r instanceof AbstractC46793pJ3.C27265n) && nextInt7 > 0) {
                    c27269r = new AbstractC46793pJ3.C27264m(copyOfRange12[0], copyOfRange12[1]);
                }
                arrayList.add(c27269r);
            }
        } else if (c == 'V') {
            step11 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            collectionSizeOrDefault11 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step11, 10);
            arrayList = new ArrayList(collectionSizeOrDefault11);
            Iterator<Integer> it8 = step11.iterator();
            while (it8.hasNext()) {
                int nextInt8 = ((IntIterator) it8).nextInt();
                copyOfRange11 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt8, nextInt8 + 1);
                AbstractC46793pJ3 c27270s = new AbstractC46793pJ3.C27270s(copyOfRange11[0]);
                if ((c27270s instanceof AbstractC46793pJ3.C27257f) && nextInt8 > 0) {
                    c27270s = new AbstractC46793pJ3.C27256e(copyOfRange11[0], copyOfRange11[1]);
                } else if ((c27270s instanceof AbstractC46793pJ3.C27265n) && nextInt8 > 0) {
                    c27270s = new AbstractC46793pJ3.C27264m(copyOfRange11[0], copyOfRange11[1]);
                }
                arrayList.add(c27270s);
            }
        } else {
            char c2 = 5;
            if (c == 'c') {
                step10 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                collectionSizeOrDefault10 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step10, 10);
                arrayList = new ArrayList(collectionSizeOrDefault10);
                Iterator<Integer> it9 = step10.iterator();
                while (it9.hasNext()) {
                    int nextInt9 = ((IntIterator) it9).nextInt();
                    copyOfRange10 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt9, nextInt9 + 6);
                    AbstractC46793pJ3 c27262k = new AbstractC46793pJ3.C27262k(copyOfRange10[0], copyOfRange10[1], copyOfRange10[2], copyOfRange10[3], copyOfRange10[4], copyOfRange10[c2]);
                    if ((c27262k instanceof AbstractC46793pJ3.C27257f) && nextInt9 > 0) {
                        abstractC46793pJ3 = new AbstractC46793pJ3.C27256e(copyOfRange10[0], copyOfRange10[1]);
                    } else if ((c27262k instanceof AbstractC46793pJ3.C27265n) && nextInt9 > 0) {
                        abstractC46793pJ3 = new AbstractC46793pJ3.C27264m(copyOfRange10[0], copyOfRange10[1]);
                    } else {
                        abstractC46793pJ3 = c27262k;
                    }
                    arrayList.add(abstractC46793pJ3);
                    c2 = 5;
                }
            } else if (c == 'C') {
                step9 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                collectionSizeOrDefault9 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step9, 10);
                arrayList = new ArrayList(collectionSizeOrDefault9);
                Iterator<Integer> it10 = step9.iterator();
                while (it10.hasNext()) {
                    int nextInt10 = ((IntIterator) it10).nextInt();
                    copyOfRange9 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt10, nextInt10 + 6);
                    AbstractC46793pJ3 c27254c = new AbstractC46793pJ3.C27254c(copyOfRange9[0], copyOfRange9[1], copyOfRange9[2], copyOfRange9[3], copyOfRange9[4], copyOfRange9[5]);
                    if ((c27254c instanceof AbstractC46793pJ3.C27257f) && nextInt10 > 0) {
                        c27254c = new AbstractC46793pJ3.C27256e(copyOfRange9[0], copyOfRange9[1]);
                    } else if ((c27254c instanceof AbstractC46793pJ3.C27265n) && nextInt10 > 0) {
                        c27254c = new AbstractC46793pJ3.C27264m(copyOfRange9[0], copyOfRange9[1]);
                    }
                    arrayList.add(c27254c);
                }
            } else if (c == 's') {
                step8 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault8 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step8, 10);
                arrayList = new ArrayList(collectionSizeOrDefault8);
                Iterator<Integer> it11 = step8.iterator();
                while (it11.hasNext()) {
                    int nextInt11 = ((IntIterator) it11).nextInt();
                    copyOfRange8 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt11, nextInt11 + 4);
                    AbstractC46793pJ3 c27267p = new AbstractC46793pJ3.C27267p(copyOfRange8[0], copyOfRange8[1], copyOfRange8[2], copyOfRange8[3]);
                    if ((c27267p instanceof AbstractC46793pJ3.C27257f) && nextInt11 > 0) {
                        c27267p = new AbstractC46793pJ3.C27256e(copyOfRange8[0], copyOfRange8[1]);
                    } else if ((c27267p instanceof AbstractC46793pJ3.C27265n) && nextInt11 > 0) {
                        c27267p = new AbstractC46793pJ3.C27264m(copyOfRange8[0], copyOfRange8[1]);
                    }
                    arrayList.add(c27267p);
                }
            } else if (c == 'S') {
                step7 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault7 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step7, 10);
                arrayList = new ArrayList(collectionSizeOrDefault7);
                Iterator<Integer> it12 = step7.iterator();
                while (it12.hasNext()) {
                    int nextInt12 = ((IntIterator) it12).nextInt();
                    copyOfRange7 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt12, nextInt12 + 4);
                    AbstractC46793pJ3 c27259h = new AbstractC46793pJ3.C27259h(copyOfRange7[0], copyOfRange7[1], copyOfRange7[2], copyOfRange7[3]);
                    if ((c27259h instanceof AbstractC46793pJ3.C27257f) && nextInt12 > 0) {
                        c27259h = new AbstractC46793pJ3.C27256e(copyOfRange7[0], copyOfRange7[1]);
                    } else if ((c27259h instanceof AbstractC46793pJ3.C27265n) && nextInt12 > 0) {
                        c27259h = new AbstractC46793pJ3.C27264m(copyOfRange7[0], copyOfRange7[1]);
                    }
                    arrayList.add(c27259h);
                }
            } else if (c == 'q') {
                step6 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault6 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step6, 10);
                arrayList = new ArrayList(collectionSizeOrDefault6);
                Iterator<Integer> it13 = step6.iterator();
                while (it13.hasNext()) {
                    int nextInt13 = ((IntIterator) it13).nextInt();
                    copyOfRange6 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt13, nextInt13 + 4);
                    AbstractC46793pJ3 c27266o = new AbstractC46793pJ3.C27266o(copyOfRange6[0], copyOfRange6[1], copyOfRange6[2], copyOfRange6[3]);
                    if ((c27266o instanceof AbstractC46793pJ3.C27257f) && nextInt13 > 0) {
                        c27266o = new AbstractC46793pJ3.C27256e(copyOfRange6[0], copyOfRange6[1]);
                    } else if ((c27266o instanceof AbstractC46793pJ3.C27265n) && nextInt13 > 0) {
                        c27266o = new AbstractC46793pJ3.C27264m(copyOfRange6[0], copyOfRange6[1]);
                    }
                    arrayList.add(c27266o);
                }
            } else if (c == 'Q') {
                step5 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                collectionSizeOrDefault5 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step5, 10);
                arrayList = new ArrayList(collectionSizeOrDefault5);
                Iterator<Integer> it14 = step5.iterator();
                while (it14.hasNext()) {
                    int nextInt14 = ((IntIterator) it14).nextInt();
                    copyOfRange5 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt14, nextInt14 + 4);
                    AbstractC46793pJ3 c27258g = new AbstractC46793pJ3.C27258g(copyOfRange5[0], copyOfRange5[1], copyOfRange5[2], copyOfRange5[3]);
                    if ((c27258g instanceof AbstractC46793pJ3.C27257f) && nextInt14 > 0) {
                        c27258g = new AbstractC46793pJ3.C27256e(copyOfRange5[0], copyOfRange5[1]);
                    } else if ((c27258g instanceof AbstractC46793pJ3.C27265n) && nextInt14 > 0) {
                        c27258g = new AbstractC46793pJ3.C27264m(copyOfRange5[0], copyOfRange5[1]);
                    }
                    arrayList.add(c27258g);
                }
            } else if (c == 't') {
                step4 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step4, 10);
                arrayList = new ArrayList(collectionSizeOrDefault4);
                Iterator<Integer> it15 = step4.iterator();
                while (it15.hasNext()) {
                    int nextInt15 = ((IntIterator) it15).nextInt();
                    copyOfRange4 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt15, nextInt15 + 2);
                    AbstractC46793pJ3 c27268q = new AbstractC46793pJ3.C27268q(copyOfRange4[0], copyOfRange4[1]);
                    if ((c27268q instanceof AbstractC46793pJ3.C27257f) && nextInt15 > 0) {
                        c27268q = new AbstractC46793pJ3.C27256e(copyOfRange4[0], copyOfRange4[1]);
                    } else if ((c27268q instanceof AbstractC46793pJ3.C27265n) && nextInt15 > 0) {
                        c27268q = new AbstractC46793pJ3.C27264m(copyOfRange4[0], copyOfRange4[1]);
                    }
                    arrayList.add(c27268q);
                }
            } else if (c == 'T') {
                step3 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step3, 10);
                arrayList = new ArrayList(collectionSizeOrDefault3);
                Iterator<Integer> it16 = step3.iterator();
                while (it16.hasNext()) {
                    int nextInt16 = ((IntIterator) it16).nextInt();
                    copyOfRange3 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt16, nextInt16 + 2);
                    AbstractC46793pJ3 c27260i = new AbstractC46793pJ3.C27260i(copyOfRange3[0], copyOfRange3[1]);
                    if ((c27260i instanceof AbstractC46793pJ3.C27257f) && nextInt16 > 0) {
                        c27260i = new AbstractC46793pJ3.C27256e(copyOfRange3[0], copyOfRange3[1]);
                    } else if ((c27260i instanceof AbstractC46793pJ3.C27265n) && nextInt16 > 0) {
                        c27260i = new AbstractC46793pJ3.C27264m(copyOfRange3[0], copyOfRange3[1]);
                    }
                    arrayList.add(c27260i);
                }
            } else if (c == 'a') {
                step2 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(step2, 10);
                arrayList = new ArrayList(collectionSizeOrDefault2);
                Iterator<Integer> it17 = step2.iterator();
                while (it17.hasNext()) {
                    int nextInt17 = ((IntIterator) it17).nextInt();
                    copyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt17, nextInt17 + 7);
                    float f = copyOfRange2[0];
                    float f2 = copyOfRange2[1];
                    float f3 = copyOfRange2[2];
                    if (Float.compare(copyOfRange2[3], 0.0f) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (Float.compare(copyOfRange2[4], 0.0f) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC46793pJ3 c27261j = new AbstractC46793pJ3.C27261j(f, f2, f3, z4, z5, copyOfRange2[5], copyOfRange2[6]);
                    if ((c27261j instanceof AbstractC46793pJ3.C27257f) && nextInt17 > 0) {
                        c27261j = new AbstractC46793pJ3.C27256e(copyOfRange2[0], copyOfRange2[1]);
                    } else if ((c27261j instanceof AbstractC46793pJ3.C27265n) && nextInt17 > 0) {
                        c27261j = new AbstractC46793pJ3.C27264m(copyOfRange2[0], copyOfRange2[1]);
                    }
                    arrayList.add(c27261j);
                }
            } else if (c == 'A') {
                step = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(step, 10);
                arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator<Integer> it18 = step.iterator();
                while (it18.hasNext()) {
                    int nextInt18 = ((IntIterator) it18).nextInt();
                    copyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(args, nextInt18, nextInt18 + 7);
                    float f4 = copyOfRange[0];
                    float f5 = copyOfRange[1];
                    float f6 = copyOfRange[2];
                    if (Float.compare(copyOfRange[3], 0.0f) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (Float.compare(copyOfRange[4], 0.0f) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC46793pJ3 c27252a = new AbstractC46793pJ3.C27252a(f4, f5, f6, z2, z3, copyOfRange[5], copyOfRange[6]);
                    if ((c27252a instanceof AbstractC46793pJ3.C27257f) && nextInt18 > 0) {
                        c27252a = new AbstractC46793pJ3.C27256e(copyOfRange[0], copyOfRange[1]);
                    } else if ((c27252a instanceof AbstractC46793pJ3.C27265n) && nextInt18 > 0) {
                        c27252a = new AbstractC46793pJ3.C27264m(copyOfRange[0], copyOfRange[1]);
                    }
                    arrayList.add(c27252a);
                }
            } else {
                throw new IllegalArgumentException("Unknown command for: " + c);
            }
        }
        return arrayList;
    }
}
