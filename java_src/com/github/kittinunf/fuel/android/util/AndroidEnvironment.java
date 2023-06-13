package com.github.kittinunf.fuel.android.util;

import android.os.Handler;
import android.os.Looper;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;", "Lvf1;", "Landroid/os/Handler;", C17296a.f69688o, "Landroid/os/Handler;", "b", "()Landroid/os/Handler;", "handler", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "setCallbackExecutor", "(Ljava/util/concurrent/Executor;)V", "callbackExecutor", "<init>", "()V", "fuel-android_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class AndroidEnvironment implements InterfaceC50550vf1 {

    /* renamed from: a */
    public final Handler f69979a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public Executor f69980b = new ExecutorC17428a();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "command", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "execute"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: com.github.kittinunf.fuel.android.util.AndroidEnvironment$a */
    /* loaded from: classes5.dex */
    public static final class ExecutorC17428a implements Executor {
        public ExecutorC17428a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            AndroidEnvironment.this.m52056b().post(runnable);
        }
    }

    @Override // p000.InterfaceC50550vf1
    /* renamed from: a */
    public Executor mo8275a() {
        return this.f69980b;
    }

    /* renamed from: b */
    public final Handler m52056b() {
        return this.f69979a;
    }
}
