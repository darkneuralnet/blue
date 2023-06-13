package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0006H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0002\b\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LB61;", "LA61;", "LW30;", "params", "", "X", "LiA0;", "y", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "Le80;", "b", "Le80;", "getCacheDrawScope", "()Le80;", "cacheDrawScope", "Lkotlin/Function1;", "LH61;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function1;", "getOnBuildDrawCache", "()Lkotlin/jvm/functions/Function1;", "onBuildDrawCache", "<init>", "(Le80;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B61 */
/* loaded from: classes.dex */
public final class B61 implements A61 {

    /* renamed from: b */
    public final C40166e80 f1832b;

    /* renamed from: c */
    public final Function1<C40166e80, H61> f1833c;

    /* JADX WARN: Multi-variable type inference failed */
    public B61(C40166e80 cacheDrawScope, Function1<? super C40166e80, H61> onBuildDrawCache) {
        Intrinsics.checkNotNullParameter(cacheDrawScope, "cacheDrawScope");
        Intrinsics.checkNotNullParameter(onBuildDrawCache, "onBuildDrawCache");
        this.f1832b = cacheDrawScope;
        this.f1833c = onBuildDrawCache;
    }

    @Override // p000.A61
    /* renamed from: X */
    public void mo114359X(W30 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C40166e80 c40166e80 = this.f1832b;
        c40166e80.m43234e(params);
        c40166e80.m43233f(null);
        this.f1833c.invoke(c40166e80);
        if (c40166e80.m43236c() != null) {
            return;
        }
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B61)) {
            return false;
        }
        B61 b61 = (B61) obj;
        if (Intrinsics.areEqual(this.f1832b, b61.f1832b) && Intrinsics.areEqual(this.f1833c, b61.f1833c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1832b.hashCode() * 31) + this.f1833c.hashCode();
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f1832b + ", onBuildDrawCache=" + this.f1833c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.D61
    /* renamed from: y */
    public void mo72302y(InterfaceC42558iA0 interfaceC42558iA0) {
        Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
        H61 m43236c = this.f1832b.m43236c();
        Intrinsics.checkNotNull(m43236c);
        m43236c.m104404a().invoke(interfaceC42558iA0);
    }
}
