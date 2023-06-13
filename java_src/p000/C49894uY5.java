package p000;

import android.database.Cursor;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import p000.C49301tY5;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\"\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¨\u0006\u0017"}, m28432d2 = {"LmV5;", "database", "", "tableName", "LtY5;", "f", "", "LtY5$c;", "c", "Landroid/database/Cursor;", "cursor", "", "LtY5$d;", "b", "", "LtY5$a;", C17296a.f69688o, "LtY5$e;", "e", "name", "", "unique", DateTokenConverter.CONVERTER_KEY, "room-runtime_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: uY5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49894uY5 {
    /* renamed from: a */
    public static final Map<String, C49301tY5.C28782a> m10073a(InterfaceC45124mV5 interfaceC45124mV5, String str) {
        Map createMapBuilder;
        Map<String, C49301tY5.C28782a> build;
        boolean z;
        Map<String, C49301tY5.C28782a> emptyMap;
        Cursor mo25489c3 = interfaceC45124mV5.mo25489c3("PRAGMA table_info(`" + str + "`)");
        try {
            if (mo25489c3.getColumnCount() <= 0) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                CloseableKt.closeFinally(mo25489c3, null);
                return emptyMap;
            }
            int columnIndex = mo25489c3.getColumnIndex("name");
            int columnIndex2 = mo25489c3.getColumnIndex("type");
            int columnIndex3 = mo25489c3.getColumnIndex("notnull");
            int columnIndex4 = mo25489c3.getColumnIndex("pk");
            int columnIndex5 = mo25489c3.getColumnIndex("dflt_value");
            createMapBuilder = MapsKt__MapsJVMKt.createMapBuilder();
            while (mo25489c3.moveToNext()) {
                String name = mo25489c3.getString(columnIndex);
                String type = mo25489c3.getString(columnIndex2);
                if (mo25489c3.getInt(columnIndex3) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = mo25489c3.getInt(columnIndex4);
                String string = mo25489c3.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                createMapBuilder.put(name, new C49301tY5.C28782a(name, type, z, i, string, 2));
            }
            build = MapsKt__MapsJVMKt.build(createMapBuilder);
            CloseableKt.closeFinally(mo25489c3, null);
            return build;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(mo25489c3, th);
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public static final List<C49301tY5.C28786d> m10072b(Cursor cursor) {
        List createListBuilder;
        List build;
        List<C49301tY5.C28786d> sorted;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            createListBuilder.add(new C49301tY5.C28786d(i, i2, string, string2));
        }
        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        sorted = CollectionsKt___CollectionsKt.sorted(build);
        return sorted;
    }

    /* renamed from: c */
    public static final Set<C49301tY5.C28785c> m10071c(InterfaceC45124mV5 interfaceC45124mV5, String str) {
        Set createSetBuilder;
        Set<C49301tY5.C28785c> build;
        boolean z;
        Cursor mo25489c3 = interfaceC45124mV5.mo25489c3("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo25489c3.getColumnIndex("id");
            int columnIndex2 = mo25489c3.getColumnIndex("seq");
            int columnIndex3 = mo25489c3.getColumnIndex("table");
            int columnIndex4 = mo25489c3.getColumnIndex("on_delete");
            int columnIndex5 = mo25489c3.getColumnIndex("on_update");
            List<C49301tY5.C28786d> m10072b = m10072b(mo25489c3);
            mo25489c3.moveToPosition(-1);
            createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
            while (mo25489c3.moveToNext()) {
                if (mo25489c3.getInt(columnIndex2) == 0) {
                    int i = mo25489c3.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C49301tY5.C28786d> arrayList3 = new ArrayList();
                    for (Object obj : m10072b) {
                        if (((C49301tY5.C28786d) obj).m12054c() == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C49301tY5.C28786d c28786d : arrayList3) {
                        arrayList.add(c28786d.m12055b());
                        arrayList2.add(c28786d.m12053d());
                    }
                    String string = mo25489c3.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = mo25489c3.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = mo25489c3.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    createSetBuilder.add(new C49301tY5.C28785c(string, string2, string3, arrayList, arrayList2));
                }
            }
            build = SetsKt__SetsJVMKt.build(createSetBuilder);
            CloseableKt.closeFinally(mo25489c3, null);
            return build;
        } finally {
        }
    }

    /* renamed from: d */
    public static final C49301tY5.C28787e m10070d(InterfaceC45124mV5 interfaceC45124mV5, String str, boolean z) {
        List list;
        List list2;
        String str2;
        Cursor mo25489c3 = interfaceC45124mV5.mo25489c3("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo25489c3.getColumnIndex("seqno");
            int columnIndex2 = mo25489c3.getColumnIndex("cid");
            int columnIndex3 = mo25489c3.getColumnIndex("name");
            int columnIndex4 = mo25489c3.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (mo25489c3.moveToNext()) {
                    if (mo25489c3.getInt(columnIndex2) >= 0) {
                        int i = mo25489c3.getInt(columnIndex);
                        String columnName = mo25489c3.getString(columnIndex3);
                        if (mo25489c3.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                list = CollectionsKt___CollectionsKt.toList(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                list2 = CollectionsKt___CollectionsKt.toList(values2);
                C49301tY5.C28787e c28787e = new C49301tY5.C28787e(str, z, list, list2);
                CloseableKt.closeFinally(mo25489c3, null);
                return c28787e;
            }
            CloseableKt.closeFinally(mo25489c3, null);
            return null;
        } finally {
        }
    }

    /* renamed from: e */
    public static final Set<C49301tY5.C28787e> m10069e(InterfaceC45124mV5 interfaceC45124mV5, String str) {
        Set createSetBuilder;
        Set<C49301tY5.C28787e> build;
        Cursor mo25489c3 = interfaceC45124mV5.mo25489c3("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo25489c3.getColumnIndex("name");
            int columnIndex2 = mo25489c3.getColumnIndex(AnalyticsRequestV2.HEADER_ORIGIN);
            int columnIndex3 = mo25489c3.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
                while (mo25489c3.moveToNext()) {
                    if (Intrinsics.areEqual("c", mo25489c3.getString(columnIndex2))) {
                        String name = mo25489c3.getString(columnIndex);
                        boolean z = true;
                        if (mo25489c3.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        C49301tY5.C28787e m10070d = m10070d(interfaceC45124mV5, name, z);
                        if (m10070d == null) {
                            CloseableKt.closeFinally(mo25489c3, null);
                            return null;
                        }
                        createSetBuilder.add(m10070d);
                    }
                }
                build = SetsKt__SetsJVMKt.build(createSetBuilder);
                CloseableKt.closeFinally(mo25489c3, null);
                return build;
            }
            CloseableKt.closeFinally(mo25489c3, null);
            return null;
        } finally {
        }
    }

    /* renamed from: f */
    public static final C49301tY5 m10068f(InterfaceC45124mV5 database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new C49301tY5(tableName, m10073a(database, tableName), m10071c(database, tableName), m10069e(database, tableName));
    }
}
