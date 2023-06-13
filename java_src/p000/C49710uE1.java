package p000;

import java.util.ArrayList;
import java.util.List;
import p000.DV5;
/* renamed from: uE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49710uE1 {
    private C49710uE1() {
    }

    /* renamed from: a */
    public static List<CV5> m10535a(int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m10531e());
        if (i == 0 || i == 1 || i == 3) {
            arrayList.addAll(m10529g());
        }
        if (i == 1 || i == 3) {
            arrayList.addAll(m10532d());
        }
        if (z) {
            arrayList.addAll(m10528h());
        }
        if (z2 && i == 0) {
            arrayList.addAll(m10534b());
        }
        if (i == 3) {
            arrayList.addAll(m10530f());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<CV5> m10534b() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.PREVIEW;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.YUV;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv53);
        return arrayList;
    }

    /* renamed from: c */
    public static List<CV5> m10533c() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.YUV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.s1440p;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.PRIV;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        DV5.EnumC1500b enumC1500b3 = DV5.EnumC1500b.JPEG;
        cv53.m112186a(DV5.m110349a(enumC1500b3, enumC1499a));
        arrayList.add(cv53);
        CV5 cv54 = new CV5();
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.s720p;
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv54.m112186a(DV5.m110349a(enumC1500b3, enumC1499a));
        arrayList.add(cv54);
        CV5 cv55 = new CV5();
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv55.m112186a(DV5.m110349a(enumC1500b3, enumC1499a));
        arrayList.add(cv55);
        CV5 cv56 = new CV5();
        cv56.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv56.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv56);
        CV5 cv57 = new CV5();
        cv57.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv57.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv57);
        CV5 cv58 = new CV5();
        cv58.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv58.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv58);
        CV5 cv59 = new CV5();
        cv59.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv59.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv59);
        return arrayList;
    }

    /* renamed from: d */
    public static List<CV5> m10532d() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.PREVIEW;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.YUV;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv53);
        CV5 cv54 = new CV5();
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv54.m112186a(DV5.m110349a(DV5.EnumC1500b.JPEG, enumC1499a2));
        arrayList.add(cv54);
        CV5 cv55 = new CV5();
        DV5.EnumC1499a enumC1499a3 = DV5.EnumC1499a.VGA;
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a3));
        cv55.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv55);
        CV5 cv56 = new CV5();
        cv56.m112186a(DV5.m110349a(enumC1500b2, enumC1499a3));
        cv56.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv56.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv56);
        return arrayList;
    }

    /* renamed from: e */
    public static List<CV5> m10531e() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.JPEG;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        DV5.EnumC1500b enumC1500b3 = DV5.EnumC1500b.YUV;
        cv53.m112186a(DV5.m110349a(enumC1500b3, enumC1499a));
        arrayList.add(cv53);
        CV5 cv54 = new CV5();
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.PREVIEW;
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv54.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv54);
        CV5 cv55 = new CV5();
        cv55.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv55);
        CV5 cv56 = new CV5();
        cv56.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv56.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        arrayList.add(cv56);
        CV5 cv57 = new CV5();
        cv57.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv57.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        arrayList.add(cv57);
        CV5 cv58 = new CV5();
        cv58.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv58.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv58.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        arrayList.add(cv58);
        return arrayList;
    }

    /* renamed from: f */
    public static List<CV5> m10530f() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.PREVIEW;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.VGA;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.YUV;
        DV5.EnumC1499a enumC1499a3 = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b2, enumC1499a3));
        DV5.EnumC1500b enumC1500b3 = DV5.EnumC1500b.RAW;
        cv5.m112186a(DV5.m110349a(enumC1500b3, enumC1499a3));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        cv52.m112186a(DV5.m110349a(DV5.EnumC1500b.JPEG, enumC1499a3));
        cv52.m112186a(DV5.m110349a(enumC1500b3, enumC1499a3));
        arrayList.add(cv52);
        return arrayList;
    }

    /* renamed from: g */
    public static List<CV5> m10529g() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.PREVIEW;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.RECORD;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.YUV;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv53.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        arrayList.add(cv53);
        CV5 cv54 = new CV5();
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a2));
        DV5.EnumC1500b enumC1500b3 = DV5.EnumC1500b.JPEG;
        cv54.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        arrayList.add(cv54);
        CV5 cv55 = new CV5();
        cv55.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv55.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        arrayList.add(cv55);
        CV5 cv56 = new CV5();
        cv56.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv56.m112186a(DV5.m110349a(enumC1500b2, enumC1499a));
        cv56.m112186a(DV5.m110349a(enumC1500b3, DV5.EnumC1499a.MAXIMUM));
        arrayList.add(cv56);
        return arrayList;
    }

    /* renamed from: h */
    public static List<CV5> m10528h() {
        ArrayList arrayList = new ArrayList();
        CV5 cv5 = new CV5();
        DV5.EnumC1500b enumC1500b = DV5.EnumC1500b.RAW;
        DV5.EnumC1499a enumC1499a = DV5.EnumC1499a.MAXIMUM;
        cv5.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv5);
        CV5 cv52 = new CV5();
        DV5.EnumC1500b enumC1500b2 = DV5.EnumC1500b.PRIV;
        DV5.EnumC1499a enumC1499a2 = DV5.EnumC1499a.PREVIEW;
        cv52.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv52.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv52);
        CV5 cv53 = new CV5();
        DV5.EnumC1500b enumC1500b3 = DV5.EnumC1500b.YUV;
        cv53.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv53.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv53);
        CV5 cv54 = new CV5();
        cv54.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv54.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv54.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv54);
        CV5 cv55 = new CV5();
        cv55.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        cv55.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv55.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv55);
        CV5 cv56 = new CV5();
        cv56.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv56.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv56.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv56);
        CV5 cv57 = new CV5();
        cv57.m112186a(DV5.m110349a(enumC1500b2, enumC1499a2));
        DV5.EnumC1500b enumC1500b4 = DV5.EnumC1500b.JPEG;
        cv57.m112186a(DV5.m110349a(enumC1500b4, enumC1499a));
        cv57.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv57);
        CV5 cv58 = new CV5();
        cv58.m112186a(DV5.m110349a(enumC1500b3, enumC1499a2));
        cv58.m112186a(DV5.m110349a(enumC1500b4, enumC1499a));
        cv58.m112186a(DV5.m110349a(enumC1500b, enumC1499a));
        arrayList.add(cv58);
        return arrayList;
    }
}
