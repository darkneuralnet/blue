package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC39507d13;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u000b\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"LLe;", "Ld13;", "LLe$b;", "", "LAY2;", "entries", "LTY2;", "navOptions", "Ld13$a;", "navigatorExtras", "", "e", "l", "popUpTo", "", "savedState", "j", "entry", "n", "(LAY2;)V", "LEX2;", "c", "LEX2;", "m", "()LEX2;", "isPop", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "b", "navigation-animation_release"}, m28431k = 1, m28430mv = {1, 7, 1})
@AbstractC39507d13.InterfaceC19661b("animatedComposable")
/* renamed from: Le */
/* loaded from: classes5.dex */
public final class C5048Le extends AbstractC39507d13<C5050b> {

    /* renamed from: d */
    public static final C5049a f21844d = new C5049a(null);

    /* renamed from: c */
    public final EX2<Boolean> f21845c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LLe$a;", "", "", "NAME", "Ljava/lang/String;", "<init>", "()V", "navigation-animation_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Le$a */
    /* loaded from: classes5.dex */
    public static final class C5049a {
        public /* synthetic */ C5049a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5049a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u000e\u0010\u000fR1\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m28432d2 = {"LLe$b;", "LHY2;", "Lkotlin/Function2;", "LTe;", "LAY2;", "", "Lkotlin/ExtensionFunctionType;", "m", "Lkotlin/jvm/functions/Function4;", "F", "()Lkotlin/jvm/functions/Function4;", "content", "LLe;", "navigator", "<init>", "(LLe;Lkotlin/jvm/functions/Function4;)V", "navigation-animation_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Le$b */
    /* loaded from: classes5.dex */
    public static final class C5050b extends HY2 {

        /* renamed from: m */
        public final Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> f21846m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5050b(C5048Le navigator, Function4<? super InterfaceC7907Te, ? super AY2, ? super InterfaceC32720Et0, ? super Integer, Unit> content) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(content, "content");
            this.f21846m = content;
        }

        /* renamed from: F */
        public final Function4<InterfaceC7907Te, AY2, InterfaceC32720Et0, Integer, Unit> m96522F() {
            return this.f21846m;
        }
    }

    public C5048Le() {
        EX2<Boolean> m97025e;
        m97025e = LM5.m97025e(Boolean.FALSE, null, 2, null);
        this.f21845c = m97025e;
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: e */
    public void mo172e(List<AY2> entries, TY2 ty2, AbstractC39507d13.InterfaceC19660a interfaceC19660a) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (AY2 ay2 : entries) {
            m44723b().m31242j(ay2);
        }
        this.f21845c.setValue(Boolean.FALSE);
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: j */
    public void mo171j(AY2 popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        m44723b().mo31244h(popUpTo, z);
        this.f21845c.setValue(Boolean.TRUE);
    }

    @Override // p000.AbstractC39507d13
    /* renamed from: l */
    public C5050b mo173a() {
        return new C5050b(this, C45354mt0.f98978a.m24776a());
    }

    /* renamed from: m */
    public final EX2<Boolean> m96524m() {
        return this.f21845c;
    }

    /* renamed from: n */
    public final void m96523n(AY2 entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        m44723b().mo31247e(entry);
    }
}
