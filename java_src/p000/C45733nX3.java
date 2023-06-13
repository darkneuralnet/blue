package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J0\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006#"}, m28432d2 = {"LnX3;", "", "LlX3;", "pointerEvent", "LDY3;", "positionCalculator", "", "isInBounds", "LP64;", C17296a.f69688o, "(LlX3;LDY3;Z)I", "", "b", "LJm2;", "LJm2;", "getRoot", "()LJm2;", "root", "LQM1;", "LQM1;", "hitPathTracker", "LkX3;", "c", "LkX3;", "pointerInputChangeEventProducer", "LRM1;", "LrX3;", DateTokenConverter.CONVERTER_KEY, "LRM1;", "hitResult", "e", "Z", "isProcessing", "<init>", "(LJm2;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1747#2,3:238\n1855#2,2:241\n1747#2,3:243\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n78#1:238,3\n81#1:241,2\n104#1:243,3\n*E\n"})
/* renamed from: nX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45733nX3 {

    /* renamed from: a */
    public final C33829Jm2 f100101a;

    /* renamed from: b */
    public final QM1 f100102b;

    /* renamed from: c */
    public final C43954kX3 f100103c;

    /* renamed from: d */
    public final RM1<InterfaceC48105rX3> f100104d;

    /* renamed from: e */
    public boolean f100105e;

    public C45733nX3(C33829Jm2 root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f100101a = root;
        this.f100102b = new QM1(root.mo8157h());
        this.f100103c = new C43954kX3();
        this.f100104d = new RM1<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x005e A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m23558a(C44547lX3 pointerEvent, DY3 positionCalculator, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        if (this.f100105e) {
            return C46326oX3.m20912a(false, false);
        }
        boolean z6 = true;
        try {
            this.f100105e = true;
            C49042t62 m28867b = this.f100103c.m28867b(pointerEvent, positionCalculator);
            Collection<C43361jX3> values = m28867b.m13077a().values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                for (C43361jX3 c43361jX3 : values) {
                    if (!c43361jX3.m30358g() && !c43361jX3.m30355j()) {
                        z2 = false;
                        continue;
                        if (z2) {
                            z3 = true;
                            break;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
            }
            z3 = false;
            if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            for (C43361jX3 c43361jX32 : m28867b.m13077a().values()) {
                if (z4 || ZW3.m72997b(c43361jX32)) {
                    C33829Jm2.m99730y0(this.f100101a, c43361jX32.m30359f(), this.f100104d, C52254yX3.m3355g(c43361jX32.m30353l(), C52254yX3.f119686a.m3349d()), false, 8, null);
                    if (!this.f100104d.isEmpty()) {
                        this.f100102b.m88647a(c43361jX32.m30360e(), this.f100104d);
                        this.f100104d.clear();
                    }
                }
            }
            this.f100102b.m88644d();
            boolean m88646b = this.f100102b.m88646b(m28867b, z);
            if (!m28867b.m13075c()) {
                Collection<C43361jX3> values2 = m28867b.m13077a().values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    for (C43361jX3 c43361jX33 : values2) {
                        if (ZW3.m72989j(c43361jX33) && c43361jX33.m30351n()) {
                            z5 = true;
                            continue;
                        } else {
                            z5 = false;
                            continue;
                        }
                        if (z5) {
                            break;
                        }
                    }
                }
            }
            z6 = false;
            return C46326oX3.m20912a(m88646b, z6);
        } finally {
            this.f100105e = false;
        }
    }

    /* renamed from: b */
    public final void m23557b() {
        if (!this.f100105e) {
            this.f100103c.m28868a();
            this.f100102b.m88645c();
        }
    }
}
