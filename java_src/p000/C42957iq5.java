package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.SerializationConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Liq5;", "Lkf1;", "Lef1;", "cache", "Lnf1;", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42957iq5 extends C44029kf1 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lef1;", "cache", "Lif1;", C17296a.f69688o, "(Lef1;)Lif1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iq5$a */
    /* loaded from: classes4.dex */
    public static final class C24603a extends Lambda implements Function1<C40471ef1, C42843if1> {

        /* renamed from: g */
        public static final C24603a f91377g = new C24603a();

        public C24603a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C42843if1 invoke(C40471ef1 cache) {
            Intrinsics.checkNotNullParameter(cache, "cache");
            return new C42364hq5(null, cache);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/SerializationConfig;", "b", "()Lcom/fasterxml/jackson/databind/SerializationConfig;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iq5$b */
    /* loaded from: classes4.dex */
    public static final class C24604b extends Lambda implements Function0<SerializationConfig> {
        public C24604b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final SerializationConfig invoke() {
            SerializationConfig serializationConfig = C42957iq5.this.getSerializationConfig();
            Intrinsics.checkNotNullExpressionValue(serializationConfig, "serializationConfig");
            return serializationConfig;
        }
    }

    public C42957iq5() {
        super(C24603a.f91377g);
    }

    @Override // p000.C44029kf1
    /* renamed from: a */
    public C45808nf1 mo28688a(C40471ef1 cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        return new C44736lq5(new C24604b(), null, cache);
    }
}
