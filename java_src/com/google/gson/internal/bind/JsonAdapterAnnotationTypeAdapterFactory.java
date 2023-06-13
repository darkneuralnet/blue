package com.google.gson.internal.bind;
/* loaded from: classes6.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC32096Cb6 {

    /* renamed from: b */
    public final C47193pz0 f74523b;

    public JsonAdapterAnnotationTypeAdapterFactory(C47193pz0 c47193pz0) {
        this.f74523b = c47193pz0;
    }

    /* renamed from: a */
    public AbstractC31862Bb6<?> m46871a(C47193pz0 c47193pz0, C46153oE1 c46153oE1, C32798Fb6<?> c32798Fb6, InterfaceC39910di2 interfaceC39910di2) {
        InterfaceC44663lj2 interfaceC44663lj2;
        InterfaceC50581vi2 interfaceC50581vi2;
        AbstractC31862Bb6<?> treeTypeAdapter;
        Object mo18357a = c47193pz0.m18362b(C32798Fb6.get((Class) interfaceC39910di2.value())).mo18357a();
        boolean nullSafe = interfaceC39910di2.nullSafe();
        if (mo18357a instanceof AbstractC31862Bb6) {
            treeTypeAdapter = (AbstractC31862Bb6) mo18357a;
        } else if (mo18357a instanceof InterfaceC32096Cb6) {
            treeTypeAdapter = ((InterfaceC32096Cb6) mo18357a).mo46766d(c46153oE1, c32798Fb6);
        } else {
            boolean z = mo18357a instanceof InterfaceC44663lj2;
            if (!z && !(mo18357a instanceof InterfaceC50581vi2)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo18357a.getClass().getName() + " as a @JsonAdapter for " + c32798Fb6.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            if (z) {
                interfaceC44663lj2 = (InterfaceC44663lj2) mo18357a;
            } else {
                interfaceC44663lj2 = null;
            }
            if (mo18357a instanceof InterfaceC50581vi2) {
                interfaceC50581vi2 = (InterfaceC50581vi2) mo18357a;
            } else {
                interfaceC50581vi2 = null;
            }
            treeTypeAdapter = new TreeTypeAdapter<>(interfaceC44663lj2, interfaceC50581vi2, c46153oE1, c32798Fb6, null, nullSafe);
            nullSafe = false;
        }
        if (treeTypeAdapter != null && nullSafe) {
            return treeTypeAdapter.m113814a();
        }
        return treeTypeAdapter;
    }

    @Override // p000.InterfaceC32096Cb6
    /* renamed from: d */
    public <T> AbstractC31862Bb6<T> mo46766d(C46153oE1 c46153oE1, C32798Fb6<T> c32798Fb6) {
        InterfaceC39910di2 interfaceC39910di2 = (InterfaceC39910di2) c32798Fb6.getRawType().getAnnotation(InterfaceC39910di2.class);
        if (interfaceC39910di2 == null) {
            return null;
        }
        return (AbstractC31862Bb6<T>) m46871a(this.f74523b, c46153oE1, c32798Fb6, interfaceC39910di2);
    }
}
