package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"LGm;", "", "", "c", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "f", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gm */
/* loaded from: classes3.dex */
public enum EnumC2939Gm {
    ARCHIVE("archive"),
    HOSTED("hosted_url"),
    UNKNOWN("unknown");
    

    /* renamed from: c */
    public static final C2940a f12396c = new C2940a(null);

    /* renamed from: b */
    public final String f12401b;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, m28432d2 = {"LGm$a;", "", "", "value", "LGm;", C17296a.f69688o, "<init>", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWebArchive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebArchive.kt\nco/bird/android/lib/webview/model/ArchiveType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n1282#2,2:47\n*S KotlinDebug\n*F\n+ 1 WebArchive.kt\nco/bird/android/lib/webview/model/ArchiveType$Companion\n*L\n38#1:47,2\n*E\n"})
    /* renamed from: Gm$a */
    /* loaded from: classes3.dex */
    public static final class C2940a {
        public /* synthetic */ C2940a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC2939Gm m104775a(String str) {
            EnumC2939Gm enumC2939Gm;
            EnumC2939Gm[] values = EnumC2939Gm.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC2939Gm = values[i];
                    if (Intrinsics.areEqual(enumC2939Gm.m104777b(), str)) {
                        break;
                    }
                    i++;
                } else {
                    enumC2939Gm = null;
                    break;
                }
            }
            if (enumC2939Gm == null) {
                return EnumC2939Gm.UNKNOWN;
            }
            return enumC2939Gm;
        }

        private C2940a() {
        }
    }

    EnumC2939Gm(String str) {
        this.f12401b = str;
    }

    /* renamed from: b */
    public final String m104777b() {
        return this.f12401b;
    }

    /* renamed from: c */
    public final boolean m104776c() {
        return this == HOSTED;
    }
}
