package p000;

import java.util.Set;
import p000.C33116Gl0;
import p000.InterfaceC32648El0;
/* renamed from: Hl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC33350Hl0<T extends InterfaceC32648El0> {
    void onAdd();

    void onClustersChanged(Set<? extends InterfaceC32414Dl0<T>> set);

    void onRemove();

    void setOnClusterClickListener(C33116Gl0.InterfaceC2934b<T> interfaceC2934b);

    void setOnClusterInfoWindowClickListener(C33116Gl0.InterfaceC2935c<T> interfaceC2935c);

    void setOnClusterItemClickListener(C33116Gl0.InterfaceC2936d<T> interfaceC2936d);

    void setOnClusterItemInfoWindowClickListener(C33116Gl0.InterfaceC2937e<T> interfaceC2937e);
}
