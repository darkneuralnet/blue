package p000;

import androidx.lifecycle.C11759u;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LG22;", "", "LOr6;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "LFE0;", "Lkotlin/ExtensionFunctionType;", "initializer", "", C17296a.f69688o, "Landroidx/lifecycle/u$b;", "b", "", "LRr6;", "Ljava/util/List;", "initializers", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* renamed from: G22 */
/* loaded from: classes.dex */
public final class G22 {

    /* renamed from: a */
    public final List<C35750Rr6<?>> f10805a = new ArrayList();

    /* renamed from: a */
    public final <T extends AbstractC35048Or6> void m105940a(KClass<T> clazz, Function1<? super FE0, ? extends T> initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f10805a.add(new C35750Rr6<>(JvmClassMappingKt.getJavaClass((KClass) clazz), initializer));
    }

    /* renamed from: b */
    public final C11759u.InterfaceC11763b m105939b() {
        C35750Rr6[] c35750Rr6Arr = (C35750Rr6[]) this.f10805a.toArray(new C35750Rr6[0]);
        return new F22((C35750Rr6[]) Arrays.copyOf(c35750Rr6Arr, c35750Rr6Arr.length));
    }
}
