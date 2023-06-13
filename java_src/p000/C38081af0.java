package p000;

import androidx.camera.core.impl.InterfaceC11195e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: af0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38081af0 {

    /* renamed from: af0$a */
    /* loaded from: classes.dex */
    public static final class C10805a implements InterfaceC37499Ze0 {

        /* renamed from: a */
        public final List<InterfaceC11195e> f50905a;

        public C10805a(List<InterfaceC11195e> list) {
            if (list != null && !list.isEmpty()) {
                this.f50905a = Collections.unmodifiableList(new ArrayList(list));
                return;
            }
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }

        @Override // p000.InterfaceC37499Ze0
        /* renamed from: a */
        public List<InterfaceC11195e> mo70909a() {
            return this.f50905a;
        }
    }

    private C38081af0() {
    }

    /* renamed from: a */
    public static InterfaceC37499Ze0 m70911a(InterfaceC11195e... interfaceC11195eArr) {
        return new C10805a(Arrays.asList(interfaceC11195eArr));
    }

    /* renamed from: b */
    public static InterfaceC37499Ze0 m70910b() {
        return m70911a(new InterfaceC11195e.C11196a());
    }
}
