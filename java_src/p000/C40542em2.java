package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC52943zh2;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R8\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m28432d2 = {"Lem2;", "LPv4;", "", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function2;", "LZC0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function2;", "task", "c", "LZC0;", Action.SCOPE_ATTRIBUTE, "Lzh2;", DateTokenConverter.CONVERTER_KEY, "Lzh2;", "job", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: em2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40542em2 implements InterfaceC35316Pv4 {

    /* renamed from: b */
    public final Function2<ZC0, Continuation<? super Unit>, Object> f78840b;

    /* renamed from: c */
    public final ZC0 f78841c;

    /* renamed from: d */
    public InterfaceC52943zh2 f78842d;

    /* JADX WARN: Multi-variable type inference failed */
    public C40542em2(CoroutineContext parentCoroutineContext, Function2<? super ZC0, ? super Continuation<? super Unit>, ? extends Object> task) {
        Intrinsics.checkNotNullParameter(parentCoroutineContext, "parentCoroutineContext");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f78840b = task;
        this.f78841c = C37824aD0.m71790a(parentCoroutineContext);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.f78842d;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.f78842d = null;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        InterfaceC52943zh2 interfaceC52943zh2 = this.f78842d;
        if (interfaceC52943zh2 != null) {
            InterfaceC52943zh2.C31478a.m550a(interfaceC52943zh2, null, 1, null);
        }
        this.f78842d = null;
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
        InterfaceC52943zh2 m73800d;
        InterfaceC52943zh2 interfaceC52943zh2 = this.f78842d;
        if (interfaceC52943zh2 != null) {
            C34486Mh2.m95042e(interfaceC52943zh2, "Old job was still running!", null, 2, null);
        }
        m73800d = Z30.m73800d(this.f78841c, null, null, this.f78840b, 3, null);
        this.f78842d = m73800d;
    }
}
