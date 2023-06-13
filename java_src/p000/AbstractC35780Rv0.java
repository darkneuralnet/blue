package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.persistence.TutorialUpdate;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r\"\u00020\tH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH'J\u0016\u0010\u0018\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005H'J#\u0010\u001a\u001a\u00020\u00122\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r\"\u00020\tH'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LRv0;", "", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Tutorial;", "b", "e", "", RequestHeadersFactory.MODEL, "c", DateTokenConverter.CONVERTER_KEY, "", "tutorialIds", "f", "([Ljava/lang/String;)Lio/reactivex/F;", "tutorials", "Lio/reactivex/c;", "h", "tutorialId", "g", "Lco/bird/android/model/persistence/TutorialUpdate;", "tutorialUpdates", "i", "retainedTutorialIds", C17296a.f69688o, "([Ljava/lang/String;)Lio/reactivex/c;", "<init>", "()V", "co.bird.android.lib.persistence.configurable-tutorial.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC35780Rv0 {
    /* renamed from: a */
    public abstract AbstractC23461c mo84648a(String... strArr);

    /* renamed from: b */
    public abstract AbstractC23442F<List<Tutorial>> mo84647b(ConfigurableTutorialContext configurableTutorialContext);

    /* renamed from: c */
    public abstract AbstractC23442F<List<Tutorial>> mo84646c(ConfigurableTutorialContext configurableTutorialContext, String str);

    /* renamed from: d */
    public abstract AbstractC23442F<List<Tutorial>> mo84645d(ConfigurableTutorialContext configurableTutorialContext, String str);

    /* renamed from: e */
    public abstract AbstractC23442F<List<Tutorial>> mo84644e(ConfigurableTutorialContext configurableTutorialContext);

    /* renamed from: f */
    public abstract AbstractC23442F<List<Tutorial>> mo84643f(String... strArr);

    /* renamed from: g */
    public abstract AbstractC23461c mo84642g(String str);

    /* renamed from: h */
    public abstract AbstractC23461c mo84641h(List<Tutorial> list);

    /* renamed from: i */
    public abstract AbstractC23461c mo84640i(List<TutorialUpdate> list);
}
