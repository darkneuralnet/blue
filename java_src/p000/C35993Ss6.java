package p000;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0014\u001a\u00028\u0000\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m28432d2 = {"LSs6;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "invalidator", "c", "Ljava/lang/Object;", "propertyValue", "defaultValue", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Ss6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35993Ss6<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: b */
    public final Function0<Unit> f34393b;

    /* renamed from: c */
    public T f34394c;

    public C35993Ss6(T t, Function0<Unit> invalidator) {
        Intrinsics.checkNotNullParameter(invalidator, "invalidator");
        this.f34393b = invalidator;
        this.f34394c = t;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f34394c;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (!Intrinsics.areEqual(this.f34394c, t)) {
            this.f34394c = t;
            this.f34393b.invoke();
        }
    }
}
