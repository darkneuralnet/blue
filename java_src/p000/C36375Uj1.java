package p000;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: Uj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36375Uj1 {
    private C36375Uj1() {
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m80977a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    /* renamed from: b */
    public static Executor m80976b() {
        return m80977a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: c */
    public static ScheduledExecutorService m80975c() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: d */
    public static ExecutorService m80974d() {
        return C38609bY3.m64380a().mo64379a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), C36.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: e */
    public static ExecutorService m80973e() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: f */
    public static ExecutorService m80972f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: g */
    public static ScheduledExecutorService m80971g() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }
}
