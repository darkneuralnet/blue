package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\r\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"Lek0;", "", "LYW3;", "event", "", DateTokenConverter.CONVERTER_KEY, "LjX3;", "prevClick", "newClick", "", "c", "b", "LJq6;", C17296a.f69688o, "LJq6;", "viewConfiguration", "", "I", "()I", "setClicks", "(I)V", "clicks", "LjX3;", "getPrevClick", "()LjX3;", "setPrevClick", "(LjX3;)V", "<init>", "(LJq6;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ek0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40520ek0 {

    /* renamed from: a */
    public final InterfaceC33869Jq6 f78756a;

    /* renamed from: b */
    public int f78757b;

    /* renamed from: c */
    public C43361jX3 f78758c;

    public C40520ek0(InterfaceC33869Jq6 viewConfiguration) {
        Intrinsics.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f78756a = viewConfiguration;
    }

    /* renamed from: a */
    public final int m42599a() {
        return this.f78757b;
    }

    /* renamed from: b */
    public final boolean m42598b(C43361jX3 prevClick, C43361jX3 newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (C32120Ce3.m111946m(C32120Ce3.m111940s(newClick.m30359f(), prevClick.m30359f())) < 100.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m42597c(C43361jX3 prevClick, C43361jX3 newClick) {
        Intrinsics.checkNotNullParameter(prevClick, "prevClick");
        Intrinsics.checkNotNullParameter(newClick, "newClick");
        if (newClick.m30352m() - prevClick.m30352m() < this.f78756a.mo42674c()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m42596d(YW3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C43361jX3 c43361jX3 = this.f78758c;
        C43361jX3 c43361jX32 = event.m74945c().get(0);
        if (c43361jX3 != null && m42597c(c43361jX3, c43361jX32) && m42598b(c43361jX3, c43361jX32)) {
            this.f78757b++;
        } else {
            this.f78757b = 1;
        }
        this.f78758c = c43361jX32;
    }
}
