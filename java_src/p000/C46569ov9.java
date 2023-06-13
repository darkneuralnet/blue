package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* renamed from: ov9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46569ov9 {

    /* renamed from: a */
    public C47051pk8 f102780a;

    /* renamed from: b */
    public Long f102781b;

    /* renamed from: c */
    public long f102782c;

    /* renamed from: d */
    public final /* synthetic */ C32835Ff7 f102783d;

    public /* synthetic */ C46569ov9(C32835Ff7 c32835Ff7, Rt9 rt9) {
        this.f102783d = c32835Ff7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
        if (r14 == null) goto L64;
     */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01df: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x01df */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47051pk8 m20273a(String str, C47051pk8 c47051pk8) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3;
        Pair pair;
        Object obj;
        String m18858I = c47051pk8.m18858I();
        List m18857J = c47051pk8.m18857J();
        this.f102783d.f15489b.m36285g0();
        Long l = (Long) DV8.m110326l(c47051pk8, "_eid");
        if (l != null) {
            if (m18858I.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.f102783d.f15489b.m36285g0();
                String str2 = (String) DV8.m110326l(c47051pk8, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.f102783d.f100966a.mo22258a().m106891q().m42707b("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.f102780a == null || this.f102781b == null || l.longValue() != this.f102781b.longValue()) {
                    C49481tq7 m36300W = this.f102783d.f15489b.m36300W();
                    m36300W.mo19953e();
                    m36300W.m83601f();
                    try {
                        try {
                            cursor2 = m36300W.m11674P().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (!cursor2.moveToFirst()) {
                                    m36300W.f100966a.mo22258a().m106889s().m42708a("Main event not found");
                                    cursor2.close();
                                    pair = null;
                                } else {
                                    try {
                                        pair = Pair.create((C47051pk8) ((C39936dk8) DV8.m110342B(C47051pk8.m18861F(), cursor2.getBlob(0))).m81476q(), Long.valueOf(cursor2.getLong(1)));
                                        cursor2.close();
                                    } catch (IOException e) {
                                        m36300W.f100966a.mo22258a().m106893o().m42705d("Failed to merge main event. appId, eventId", C32809Fc8.m106885w(str), l, e);
                                        cursor2.close();
                                        pair = null;
                                        if (pair == null) {
                                        }
                                        this.f102783d.f100966a.mo22258a().m106891q().m42706c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return null;
                                    }
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                m36300W.f100966a.mo22258a().m106893o().m42707b("Error selecting main event", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                    if (pair == null && (obj = pair.first) != null) {
                        this.f102780a = (C47051pk8) obj;
                        this.f102782c = ((Long) pair.second).longValue();
                        this.f102783d.f15489b.m36285g0();
                        this.f102781b = (Long) DV8.m110326l(this.f102780a, "_eid");
                    } else {
                        this.f102783d.f100966a.mo22258a().m106891q().m42706c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                }
                long j = this.f102782c - 1;
                this.f102782c = j;
                if (j <= 0) {
                    C49481tq7 m36300W2 = this.f102783d.f15489b.m36300W();
                    m36300W2.mo19953e();
                    m36300W2.f100966a.mo22258a().m106889s().m42707b("Clearing complex main event info. appId", str);
                    try {
                        m36300W2.m11674P().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        m36300W2.f100966a.mo22258a().m106893o().m42707b("Error clearing complex main event", e4);
                    }
                } else {
                    this.f102783d.f15489b.m36300W().m11645s(str, l, this.f102782c, this.f102780a);
                }
                ArrayList arrayList = new ArrayList();
                for (C47061pl8 c47061pl8 : this.f102780a.m18857J()) {
                    this.f102783d.f15489b.m36285g0();
                    if (DV8.m110327k(c47051pk8, c47061pl8.m18780H()) == null) {
                        arrayList.add(c47061pl8);
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.addAll(m18857J);
                    m18857J = arrayList;
                } else {
                    this.f102783d.f100966a.mo22258a().m106891q().m42707b("No unique parameters in main event. eventName", str2);
                }
                m18858I = str2;
            } else {
                this.f102781b = l;
                this.f102780a = c47051pk8;
                this.f102783d.f15489b.m36285g0();
                Object obj2 = 0L;
                Object m110326l = DV8.m110326l(c47051pk8, "_epc");
                if (m110326l != null) {
                    obj2 = m110326l;
                }
                long longValue = ((Long) obj2).longValue();
                this.f102782c = longValue;
                if (longValue <= 0) {
                    this.f102783d.f100966a.mo22258a().m106891q().m42707b("Complex event with zero extra param count. eventName", m18858I);
                } else {
                    this.f102783d.f15489b.m36300W().m11645s(str, (Long) Preconditions.checkNotNull(l), this.f102782c, c47051pk8);
                }
            }
        }
        C39936dk8 c39936dk8 = (C39936dk8) c47051pk8.m19208j();
        c39936dk8.m43800I(m18858I);
        c39936dk8.m43802G();
        c39936dk8.m43805B(m18857J);
        return (C47051pk8) c39936dk8.m81476q();
    }
}
