package p000;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 \u00142\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R \u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LUA5;", "LpV5;", "LoV5;", "statement", "", "b", "", "Ljava/lang/String;", "query", "", "", "c", "[Ljava/lang/Object;", "bindArgs", C17296a.f69688o, "()Ljava/lang/String;", "sql", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: UA5 */
/* loaded from: classes.dex */
public final class UA5 implements InterfaceC46903pV5 {

    /* renamed from: d */
    public static final C8205a f36930d = new C8205a(null);

    /* renamed from: b */
    public final String f36931b;

    /* renamed from: c */
    public final Object[] f36932c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u000f"}, m28432d2 = {"LUA5$a;", "", "LoV5;", "statement", "", "bindArgs", "", "b", "(LoV5;[Ljava/lang/Object;)V", "", "index", "arg", C17296a.f69688o, "<init>", "()V", "sqlite_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: UA5$a */
    /* loaded from: classes.dex */
    public static final class C8205a {
        public /* synthetic */ C8205a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m81895a(InterfaceC46310oV5 interfaceC46310oV5, int i, Object obj) {
            long j;
            if (obj == null) {
                interfaceC46310oV5.mo20954m1(i);
            } else if (obj instanceof byte[]) {
                interfaceC46310oV5.mo20955X0(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC46310oV5.mo20957M1(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                interfaceC46310oV5.mo20957M1(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                interfaceC46310oV5.mo20956S0(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC46310oV5.mo20956S0(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC46310oV5.mo20956S0(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC46310oV5.mo20956S0(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC46310oV5.mo20958G0(i, (String) obj);
            } else if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                interfaceC46310oV5.mo20956S0(i, j);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            }
        }

        @JvmStatic
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public final void m81894b(InterfaceC46310oV5 statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m81895a(statement, i, obj);
            }
        }

        private C8205a() {
        }
    }

    public UA5(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f36931b = query;
        this.f36932c = objArr;
    }

    @Override // p000.InterfaceC46903pV5
    /* renamed from: a */
    public String mo19174a() {
        return this.f36931b;
    }

    @Override // p000.InterfaceC46903pV5
    /* renamed from: b */
    public void mo19173b(InterfaceC46310oV5 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        f36930d.m81894b(statement, this.f36932c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UA5(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }
}
