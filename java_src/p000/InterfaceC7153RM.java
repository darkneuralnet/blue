package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdPartBody;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J$\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\f0\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b0\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¨\u0006\u0014"}, m28432d2 = {"LRM;", "", "", "id", "key", "Lco/bird/android/model/constant/PartKind;", "kind", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", C17296a.f69688o, "birdId", "", "b", "Lco/bird/android/model/BirdPartBody;", "body", "Lco/bird/android/model/wire/WirePart;", "c", DateTokenConverter.CONVERTER_KEY, "e", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RM */
/* loaded from: classes4.dex */
public interface InterfaceC7153RM {
    @NA1("bird-part/by-part")
    /* renamed from: a */
    AbstractC23442F<HM4<WireBirdPart>> m86829a(@InterfaceC37017Xc4("id") String str, @InterfaceC37017Xc4("key") String str2, @InterfaceC37017Xc4("kind") PartKind partKind);

    @NA1("bird-part/by-bird")
    /* renamed from: b */
    AbstractC23442F<HM4<List<WireBirdPart>>> m86828b(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("bird-part/attach-part")
    /* renamed from: c */
    AbstractC23442F<HM4<WirePart>> m86827c(@InterfaceC6404PY BirdPartBody birdPartBody);

    @AD3("bird-part/brain-swap")
    /* renamed from: d */
    AbstractC23442F<WirePart> m86826d(@InterfaceC6404PY BirdPartBody birdPartBody);

    @AD3("bird-part/detach-part")
    /* renamed from: e */
    AbstractC23442F<HM4<WirePart>> m86825e(@InterfaceC6404PY BirdPartBody birdPartBody);
}
