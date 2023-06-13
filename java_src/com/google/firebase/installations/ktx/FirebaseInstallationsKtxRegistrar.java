package com.google.firebase.installations.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"Lcom/google/firebase/installations/ktx/FirebaseInstallationsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "LEs0;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-installations-ktx"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class FirebaseInstallationsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        List<C32711Es0<?>> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(C50661vq2.m7933b("fire-installations-ktx", "17.1.3"));
        return listOf;
    }
}
