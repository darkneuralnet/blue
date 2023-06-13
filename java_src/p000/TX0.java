package p000;

import androidx.lifecycle.C11729j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LTX0;", "Landroidx/lifecycle/j;", "LFq2;", "observer", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "", "k", "Ljava/util/List;", "q", "()Ljava/util/List;", "observers", "LLifecycleOwner;", "owner", "<init>", "(LLifecycleOwner;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: TX0 */
/* loaded from: classes6.dex */
public class TX0 extends C11729j {

    /* renamed from: k */
    public final List<InterfaceC32929Fq2> f35623k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TX0(LifecycleOwner owner) {
        super(owner);
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f35623k = new ArrayList();
    }

    @Override // androidx.lifecycle.C11729j, androidx.lifecycle.AbstractC11719f
    /* renamed from: a */
    public void mo67008a(InterfaceC32929Fq2 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.mo67008a(observer);
        try {
            Result.Companion companion = Result.Companion;
            Result.m116783constructorimpl(Boolean.valueOf(this.f35623k.add(observer)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Override // androidx.lifecycle.C11729j, androidx.lifecycle.AbstractC11719f
    /* renamed from: d */
    public void mo67006d(InterfaceC32929Fq2 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.mo67006d(observer);
        try {
            Result.Companion companion = Result.Companion;
            Result.m116783constructorimpl(Boolean.valueOf(this.f35623k.remove(observer)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* renamed from: q */
    public final List<InterfaceC32929Fq2> m83453q() {
        return this.f35623k;
    }
}
