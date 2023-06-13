package p000;

import android.os.RemoteException;
/* renamed from: vz8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC50757vz8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42134hS7 f115101b;

    /* renamed from: c */
    public final /* synthetic */ RC8 f115102c;

    public RunnableC50757vz8(RC8 rc8, InterfaceC42134hS7 interfaceC42134hS7) {
        this.f115102c = rc8;
        this.f115101b = interfaceC42134hS7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long l;
        C39144cR8 m89777M = this.f115102c.f100966a.m89777M();
        C38140ak9.m70801b();
        if (m89777M.f100966a.m89751w().m37502y(null, C37795a98.f50004w0)) {
            if (!m89777M.f100966a.m89784F().m101800n().m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
                m89777M.f100966a.mo22258a().m106887u().m42708a("Analytics storage consent denied; will not get session id");
            } else if (!m89777M.f100966a.m89784F().m101795s(m89777M.f100966a.mo22260A().currentTimeMillis()) && m89777M.f100966a.m89784F().f16077p.m564a() != 0) {
                l = Long.valueOf(m89777M.f100966a.m89784F().f16077p.m564a());
                if (l == null) {
                    this.f115102c.f100966a.m89776N().m92095J(this.f115101b, l.longValue());
                    return;
                }
                try {
                    this.f115101b.mo30653W0(null);
                    return;
                } catch (RemoteException e) {
                    this.f115102c.f100966a.mo22258a().m106893o().m42707b("getSessionId failed with exception", e);
                    return;
                }
            }
        } else {
            m89777M.f100966a.mo22258a().m106887u().m42708a("getSessionId has been disabled.");
        }
        l = null;
        if (l == null) {
        }
    }
}
