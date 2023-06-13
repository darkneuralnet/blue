package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    public UUID f56171a;

    /* renamed from: b */
    public C12124b f56172b;

    /* renamed from: c */
    public Set<String> f56173c;

    /* renamed from: d */
    public C12119a f56174d;

    /* renamed from: e */
    public int f56175e;

    /* renamed from: f */
    public Executor f56176f;

    /* renamed from: g */
    public InterfaceC45160mZ5 f56177g;

    /* renamed from: h */
    public QG6 f56178h;

    /* renamed from: i */
    public T74 f56179i;

    /* renamed from: j */
    public InterfaceC48952sx1 f56180j;

    /* renamed from: k */
    public int f56181k;

    /* renamed from: androidx.work.WorkerParameters$a */
    /* loaded from: classes.dex */
    public static class C12119a {

        /* renamed from: a */
        public List<String> f56182a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f56183b = Collections.emptyList();

        /* renamed from: c */
        public Network f56184c;
    }

    public WorkerParameters(UUID uuid, C12124b c12124b, Collection<String> collection, C12119a c12119a, int i, int i2, Executor executor, InterfaceC45160mZ5 interfaceC45160mZ5, QG6 qg6, T74 t74, InterfaceC48952sx1 interfaceC48952sx1) {
        this.f56171a = uuid;
        this.f56172b = c12124b;
        this.f56173c = new HashSet(collection);
        this.f56174d = c12119a;
        this.f56175e = i;
        this.f56181k = i2;
        this.f56176f = executor;
        this.f56177g = interfaceC45160mZ5;
        this.f56178h = qg6;
        this.f56179i = t74;
        this.f56180j = interfaceC48952sx1;
    }

    /* renamed from: a */
    public Executor m65616a() {
        return this.f56176f;
    }

    /* renamed from: b */
    public InterfaceC48952sx1 m65615b() {
        return this.f56180j;
    }

    /* renamed from: c */
    public UUID m65614c() {
        return this.f56171a;
    }

    /* renamed from: d */
    public C12124b m65613d() {
        return this.f56172b;
    }

    /* renamed from: e */
    public int m65612e() {
        return this.f56175e;
    }

    /* renamed from: f */
    public InterfaceC45160mZ5 m65611f() {
        return this.f56177g;
    }

    /* renamed from: g */
    public QG6 m65610g() {
        return this.f56178h;
    }
}
