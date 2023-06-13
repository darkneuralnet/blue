package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Ldb;", "", "LnE5;", "slots", "", DateTokenConverter.CONVERTER_KEY, "LqE5;", "writer", "e", C17296a.f69688o, "I", "()I", "c", "(I)V", "location", "", "b", "()Z", "valid", "loc", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: db */
/* loaded from: classes.dex */
public final class C19797db {

    /* renamed from: a */
    public int f76818a;

    public C19797db(int i) {
        this.f76818a = i;
    }

    /* renamed from: a */
    public final int m44095a() {
        return this.f76818a;
    }

    /* renamed from: b */
    public final boolean m44094b() {
        return this.f76818a != Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public final void m44093c(int i) {
        this.f76818a = i;
    }

    /* renamed from: d */
    public final int m44092d(C45564nE5 slots) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        return slots.m24126b(this);
    }

    /* renamed from: e */
    public final int m44091e(C47343qE5 writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        return writer.m17851B(this);
    }
}
