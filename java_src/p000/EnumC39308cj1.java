package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&j\u0002\b\u0004j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcj1;", "", "Lqe1;", "ui", "b", "<init>", "(Ljava/lang/String;I)V", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cj1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC39308cj1 {
    FRONT { // from class: cj1.b
        @Override // p000.EnumC39308cj1
        /* renamed from: b */
        public EnumC39308cj1 mo61023b(C47577qe1 ui) {
            Intrinsics.checkNotNullParameter(ui, "ui");
            ui.m17305Pl().start();
            return EnumC39308cj1.BACK;
        }
    },
    BACK { // from class: cj1.a
        @Override // p000.EnumC39308cj1
        /* renamed from: b */
        public EnumC39308cj1 mo61023b(C47577qe1 ui) {
            Intrinsics.checkNotNullParameter(ui, "ui");
            ui.m17304Ql().start();
            return EnumC39308cj1.FRONT;
        }
    };

    /* synthetic */ EnumC39308cj1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract EnumC39308cj1 mo61023b(C47577qe1 c47577qe1);
}
