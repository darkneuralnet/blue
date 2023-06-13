package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC35048Or6;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R+\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LRr6;", "LOr6;", "T", "", "Ljava/lang/Class;", C17296a.f69688o, "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "LFE0;", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "initializer", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rr6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35750Rr6<T extends AbstractC35048Or6> {

    /* renamed from: a */
    public final Class<T> f32755a;

    /* renamed from: b */
    public final Function1<FE0, T> f32756b;

    /* JADX WARN: Multi-variable type inference failed */
    public C35750Rr6(Class<T> clazz, Function1<? super FE0, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f32755a = clazz;
        this.f32756b = initializer;
    }

    /* renamed from: a */
    public final Class<T> m86270a() {
        return this.f32755a;
    }

    /* renamed from: b */
    public final Function1<FE0, T> m86269b() {
        return this.f32756b;
    }
}
