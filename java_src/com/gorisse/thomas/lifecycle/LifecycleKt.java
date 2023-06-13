package com.gorisse.thomas.lifecycle;

import androidx.lifecycle.AbstractC11719f;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001aô\u0001\u0010\r\u001a\u00020\u0006*\u00020\u00002%\b\u0002\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012%\b\u0002\u0010\u000b\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00012%\b\u0002\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001¨\u0006\u000e"}, m28432d2 = {"Landroidx/lifecycle/f;", "Lkotlin/Function1;", "LLifecycleOwner;", "Lkotlin/ParameterName;", "name", "owner", "", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", C17296a.f69688o, "android-view-lifecycle_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class LifecycleKt {
    /* renamed from: a */
    public static final void m45942a(AbstractC11719f abstractC11719f, final Function1<? super LifecycleOwner, Unit> function1, final Function1<? super LifecycleOwner, Unit> function12, final Function1<? super LifecycleOwner, Unit> function13, final Function1<? super LifecycleOwner, Unit> function14, final Function1<? super LifecycleOwner, Unit> function15, final Function1<? super LifecycleOwner, Unit> function16) {
        Intrinsics.checkNotNullParameter(abstractC11719f, "<this>");
        abstractC11719f.mo67008a(new VX0() { // from class: com.gorisse.thomas.lifecycle.LifecycleKt$observe$1
            @Override // p000.VX0
            public void onCreate(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function1;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }

            @Override // p000.VX0
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function16;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }

            @Override // p000.VX0
            public void onPause(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function14;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }

            @Override // p000.VX0
            public void onResume(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function13;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }

            @Override // p000.VX0
            public void onStart(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function12;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }

            @Override // p000.VX0
            public void onStop(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Function1<LifecycleOwner, Unit> function17 = function15;
                if (function17 != null) {
                    function17.invoke(owner);
                }
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m45941b(AbstractC11719f abstractC11719f, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        if ((i & 4) != 0) {
            function13 = null;
        }
        if ((i & 8) != 0) {
            function14 = null;
        }
        if ((i & 16) != 0) {
            function15 = null;
        }
        if ((i & 32) != 0) {
            function16 = null;
        }
        m45942a(abstractC11719f, function1, function12, function13, function14, function15, function16);
    }
}
