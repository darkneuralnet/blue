package p000;

import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, m28432d2 = {"Lkf1;", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "Lef1;", "cache", "Lnf1;", C17296a.f69688o, "enumCache", "Lkotlin/Function1;", "Lif1;", "deserializerFactory", "<init>", "(Lef1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "jackson_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kf1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44029kf1 extends ObjectMapper {
    public C44029kf1(C40471ef1 c40471ef1, Function1<? super C40471ef1, ? extends C42843if1> function1) {
        super(null, null, new DefaultDeserializationContext.Impl((function1 == null || (r4 = function1.invoke(c40471ef1)) == null) ? new C42843if1(null, c40471ef1) : r4));
        C42843if1 c42843if1;
        setSerializerFactory(mo28688a(c40471ef1));
    }

    /* renamed from: a */
    public C45808nf1 mo28688a(C40471ef1 cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        return new C45808nf1(null, cache);
    }

    public C44029kf1(Function1<? super C40471ef1, ? extends C42843if1> function1) {
        this(new C40471ef1(), function1);
    }

    public /* synthetic */ C44029kf1(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }
}
