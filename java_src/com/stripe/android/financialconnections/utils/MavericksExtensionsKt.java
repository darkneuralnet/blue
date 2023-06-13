package com.stripe.android.financialconnections.utils;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00020\u0002\"\n\b\u0002\u0010\u0005\u0018\u0001*\u00020\u0004*\u00028\u00002\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u000e\b\u0006\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000f\"\u0004\b\u0000\u0010\u000eH\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m28432d2 = {"Landroidx/activity/ComponentActivity;", "T", "LRN2;", "VM", "LAN2;", "S", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/Function0;", "", "keyFactory", "Lkotlin/Lazy;", "viewModelLazy", "(Landroidx/activity/ComponentActivity;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "V", "Lkotlin/properties/ReadOnlyProperty;", "argsOrNull", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MavericksExtensionsKt {
    public static final <V> ReadOnlyProperty<ComponentActivity, V> argsOrNull() {
        return new ReadOnlyProperty<ComponentActivity, V>() { // from class: com.stripe.android.financialconnections.utils.MavericksExtensionsKt$argsOrNull$1
            private boolean read;
            private V value;

            public final boolean getRead() {
                return this.read;
            }

            @Override // kotlin.properties.ReadOnlyProperty
            public /* bridge */ /* synthetic */ Object getValue(ComponentActivity componentActivity, KProperty kProperty) {
                return getValue2(componentActivity, (KProperty<?>) kProperty);
            }

            public final void setRead(boolean z) {
                this.read = z;
            }

            public final void setValue(V v) {
                this.value = v;
            }

            public final V getValue() {
                return this.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: getValue  reason: avoid collision after fix types in other method */
            public V getValue2(ComponentActivity thisRef, KProperty<?> property) {
                Intrinsics.checkNotNullParameter(thisRef, "thisRef");
                Intrinsics.checkNotNullParameter(property, "property");
                if (!this.read) {
                    Bundle extras = thisRef.getIntent().getExtras();
                    Object obj = extras != null ? extras.get("mavericks:arg") : null;
                    this.value = obj != null ? obj : 0;
                    this.read = true;
                }
                return this.value;
            }
        };
    }

    public static final /* synthetic */ <T extends ComponentActivity, VM extends RN2<S>, S extends AN2> Lazy<VM> viewModelLazy(T t, KClass<VM> viewModelClass, Function0<String> keyFactory) {
        Lazy<VM> lazy;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(keyFactory, "keyFactory");
        Intrinsics.needClassReification();
        lazy = LazyKt__LazyJVMKt.lazy(new MavericksExtensionsKt$viewModelLazy$2(viewModelClass, t, keyFactory));
        return lazy;
    }

    public static /* synthetic */ Lazy viewModelLazy$default(ComponentActivity componentActivity, KClass viewModelClass, Function0 keyFactory, int i, Object obj) {
        Lazy lazy;
        if ((i & 1) != 0) {
            Intrinsics.reifiedOperationMarker(4, "VM");
            viewModelClass = Reflection.getOrCreateKotlinClass(RN2.class);
        }
        if ((i & 2) != 0) {
            keyFactory = new MavericksExtensionsKt$viewModelLazy$1(viewModelClass);
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(keyFactory, "keyFactory");
        Intrinsics.needClassReification();
        lazy = LazyKt__LazyJVMKt.lazy(new MavericksExtensionsKt$viewModelLazy$2(viewModelClass, componentActivity, keyFactory));
        return lazy;
    }
}
