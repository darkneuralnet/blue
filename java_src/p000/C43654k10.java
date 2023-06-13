package p000;

import co.bird.android.model.persistence.nestedstructures.Part;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"Lk10;", "", "Lco/bird/android/model/persistence/nestedstructures/Part;", "", C17296a.f69688o, "b", "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.brain-swap.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBrainSwapConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrainSwapConverters.kt\nco/bird/android/persistence/brainswap/impl/converters/BrainSwapConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
/* renamed from: k10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43654k10 {

    /* renamed from: a */
    public static final C43654k10 f93770a = new C43654k10();

    /* renamed from: b */
    public static final C51174wi2 f93771b = Converters.f66822a.m55283a();

    private C43654k10() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m29457a(Part part) {
        if (part != null) {
            return f93771b.m6453i(part);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final Part m29456b(String str) {
        if (str != null) {
            return (Part) f93771b.m6459c(str, Reflection.getOrCreateKotlinClass(Part.class));
        }
        return null;
    }
}
