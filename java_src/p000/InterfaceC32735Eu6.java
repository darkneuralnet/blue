package p000;

import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28432d2 = {"LEu6;", "", "LDf;", Entry.TYPE_TEXT, "LA96;", "filter", C17296a.f69688o, "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Eu6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC32735Eu6 {

    /* renamed from: a */
    public static final C2019a f8291a = C2019a.f8292a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m28432d2 = {"LEu6$a;", "", "LEu6;", "b", "LEu6;", C17296a.f69688o, "()LEu6;", "getNone$annotations", "()V", "None", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Eu6$a */
    /* loaded from: classes.dex */
    public static final class C2019a {

        /* renamed from: a */
        public static final /* synthetic */ C2019a f8292a = new C2019a();

        /* renamed from: b */
        public static final InterfaceC32735Eu6 f8293b = C2020a.f8294b;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, m28432d2 = {"LDf;", Entry.TYPE_TEXT, "LA96;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Eu6$a$a */
        /* loaded from: classes.dex */
        public static final class C2020a implements InterfaceC32735Eu6 {

            /* renamed from: b */
            public static final C2020a f8294b = new C2020a();

            @Override // p000.InterfaceC32735Eu6
            public final A96 filter(C1577Df text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new A96(text, InterfaceC33290He3.f13687a.m103617a());
            }
        }

        private C2019a() {
        }

        /* renamed from: a */
        public final InterfaceC32735Eu6 m108216a() {
            return f8293b;
        }
    }

    A96 filter(C1577Df c1577Df);
}
