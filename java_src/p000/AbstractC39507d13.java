package p000;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p000.HY2;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\b#B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000f\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J7\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00028\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0015H\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R$\u0010'\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010(¨\u0006+"}, m28432d2 = {"Ld13;", "LHY2;", "D", "", "Lj13;", TransferTable.COLUMN_STATE, "", "f", C17296a.f69688o, "()LHY2;", "", "LAY2;", "entries", "LTY2;", "navOptions", "Ld13$a;", "navigatorExtras", "e", "backStackEntry", "g", "destination", "Landroid/os/Bundle;", "args", DateTokenConverter.CONVERTER_KEY, "(LHY2;Landroid/os/Bundle;LTY2;Ld13$a;)LHY2;", "popUpTo", "", "savedState", "j", "k", "i", "h", "Lj13;", "_state", "<set-?>", "b", "Z", "c", "()Z", "isAttached", "()Lj13;", "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: d13  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39507d13<D extends HY2> {

    /* renamed from: a */
    public AbstractC43064j13 f75993a;

    /* renamed from: b */
    public boolean f75994b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Ld13$a;", "", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: d13$a */
    /* loaded from: classes.dex */
    public interface InterfaceC19660a {
    }

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Ld13$b;", "", "", "value", "()Ljava/lang/String;", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    /* renamed from: d13$b */
    /* loaded from: classes.dex */
    public @interface InterfaceC19661b {
        String value();
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHY2;", "D", "LAY2;", "backStackEntry", C17296a.f69688o, "(LAY2;)LAY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: d13$c */
    /* loaded from: classes.dex */
    public static final class C19662c extends Lambda implements Function1<AY2, AY2> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC39507d13<D> f75995g;

        /* renamed from: h */
        public final /* synthetic */ TY2 f75996h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC19660a f75997i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19662c(AbstractC39507d13<D> abstractC39507d13, TY2 ty2, InterfaceC19660a interfaceC19660a) {
            super(1);
            this.f75995g = abstractC39507d13;
            this.f75996h = ty2;
            this.f75997i = interfaceC19660a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AY2 invoke(AY2 backStackEntry) {
            HY2 mo21863d;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            HY2 m115582f = backStackEntry.m115582f();
            if (!(m115582f instanceof HY2)) {
                m115582f = null;
            }
            if (m115582f != null && (mo21863d = this.f75995g.mo21863d(m115582f, backStackEntry.m115584d(), this.f75996h, this.f75997i)) != null) {
                if (!Intrinsics.areEqual(mo21863d, m115582f)) {
                    return this.f75995g.m44723b().mo31251a(mo21863d, mo21863d.m103778e(backStackEntry.m115584d()));
                }
                return backStackEntry;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHY2;", "D", "LUY2;", "", "invoke", "(LUY2;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: d13$d */
    /* loaded from: classes.dex */
    public static final class C19663d extends Lambda implements Function1<UY2, Unit> {

        /* renamed from: g */
        public static final C19663d f75998g = new C19663d();

        public C19663d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(UY2 uy2) {
            invoke2(uy2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(UY2 navOptions) {
            Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
            navOptions.m81360e(true);
        }
    }

    /* renamed from: a */
    public abstract D mo173a();

    /* renamed from: b */
    public final AbstractC43064j13 m44723b() {
        AbstractC43064j13 abstractC43064j13 = this.f75993a;
        if (abstractC43064j13 != null) {
            return abstractC43064j13;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* renamed from: c */
    public final boolean m44722c() {
        return this.f75994b;
    }

    /* renamed from: d */
    public HY2 mo21863d(D destination, Bundle bundle, TY2 ty2, InterfaceC19660a interfaceC19660a) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    /* renamed from: e */
    public void mo172e(List<AY2> entries, TY2 ty2, InterfaceC19660a interfaceC19660a) {
        Sequence asSequence;
        Sequence map;
        Sequence<AY2> filterNotNull;
        Intrinsics.checkNotNullParameter(entries, "entries");
        asSequence = CollectionsKt___CollectionsKt.asSequence(entries);
        map = SequencesKt___SequencesKt.map(asSequence, new C19662c(this, ty2, interfaceC19660a));
        filterNotNull = SequencesKt___SequencesKt.filterNotNull(map);
        for (AY2 ay2 : filterNotNull) {
            m44723b().mo31243i(ay2);
        }
    }

    /* renamed from: f */
    public void m44721f(AbstractC43064j13 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f75993a = state;
        this.f75994b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public void m44720g(AY2 backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        HY2 m115582f = backStackEntry.m115582f();
        if (!(m115582f instanceof HY2)) {
            m115582f = null;
        }
        if (m115582f == null) {
            return;
        }
        mo21863d(m115582f, null, VY2.m79755a(C19663d.f75998g), null);
        m44723b().m31246f(backStackEntry);
    }

    /* renamed from: h */
    public void m44719h(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }

    /* renamed from: i */
    public Bundle m44718i() {
        return null;
    }

    /* renamed from: j */
    public void mo171j(AY2 popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List<AY2> value = m44723b().m31250b().getValue();
        if (value.contains(popUpTo)) {
            ListIterator<AY2> listIterator = value.listIterator(value.size());
            AY2 ay2 = null;
            while (mo21862k()) {
                ay2 = listIterator.previous();
                if (Intrinsics.areEqual(ay2, popUpTo)) {
                    break;
                }
            }
            if (ay2 != null) {
                m44723b().mo31245g(ay2, z);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
    }

    /* renamed from: k */
    public boolean mo21862k() {
        return true;
    }
}
