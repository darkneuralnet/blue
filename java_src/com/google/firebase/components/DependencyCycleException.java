package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes6.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: b */
    public final List<C32711Es0<?>> f74239b;

    public DependencyCycleException(List<C32711Es0<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f74239b = list;
    }
}
