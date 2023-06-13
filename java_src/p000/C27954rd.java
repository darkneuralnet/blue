package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lrd;", "LoJ3;", "", "startDistance", "stopDistance", "LcJ3;", "destination", "", "startWithMoveTo", "c", "path", "forceClosed", "", "b", "Landroid/graphics/PathMeasure;", C17296a.f69688o, "Landroid/graphics/PathMeasure;", "internalPathMeasure", "()F", "length", "<init>", "(Landroid/graphics/PathMeasure;)V", "ui-graphics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* renamed from: rd */
/* loaded from: classes.dex */
public final class C27954rd implements InterfaceC46200oJ3 {

    /* renamed from: a */
    public final PathMeasure f107330a;

    public C27954rd(PathMeasure internalPathMeasure) {
        Intrinsics.checkNotNullParameter(internalPathMeasure, "internalPathMeasure");
        this.f107330a = internalPathMeasure;
    }

    @Override // p000.InterfaceC46200oJ3
    /* renamed from: a */
    public float mo15695a() {
        return this.f107330a.getLength();
    }

    @Override // p000.InterfaceC46200oJ3
    /* renamed from: b */
    public void mo15694b(InterfaceC39067cJ3 interfaceC39067cJ3, boolean z) {
        Path path;
        PathMeasure pathMeasure = this.f107330a;
        if (interfaceC39067cJ3 != null) {
            if (interfaceC39067cJ3 instanceof C27014od) {
                path = ((C27014od) interfaceC39067cJ3).m20773r();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            path = null;
        }
        pathMeasure.setPath(path, z);
    }

    @Override // p000.InterfaceC46200oJ3
    /* renamed from: c */
    public boolean mo15693c(float f, float f2, InterfaceC39067cJ3 destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        PathMeasure pathMeasure = this.f107330a;
        if (destination instanceof C27014od) {
            return pathMeasure.getSegment(f, f2, ((C27014od) destination).m20773r(), z);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
