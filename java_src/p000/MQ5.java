package p000;

import co.bird.android.model.Sticker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¨\u0006\n"}, m28432d2 = {"LMQ5;", "", "", "stickerId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/Sticker;", "b", "stickerCode", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: MQ5 */
/* loaded from: classes4.dex */
public interface MQ5 {
    @NA1("sticker/by-code")
    /* renamed from: a */
    AbstractC23442F<HM4<Sticker>> m95306a(@InterfaceC37017Xc4("code") String str);

    @NA1("sticker/by-id")
    /* renamed from: b */
    AbstractC23442F<HM4<Sticker>> m95305b(@InterfaceC37017Xc4("id") String str);
}