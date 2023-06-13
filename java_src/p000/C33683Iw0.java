package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireTutorial;
import co.bird.android.model.wire.WireTutorialResponse;
import co.bird.android.model.wire.WireTutorials;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.InterfaceC32555Ea6;
import p000.InterfaceC33215Gw0;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016J.\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000e\"\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"LIw0;", "LGw0;", "Lio/reactivex/c;", "g", "Lco/bird/android/model/constant/ConfigurableTutorialContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "birdModel", "", "filterSeen", "Lio/reactivex/F;", "", "Lco/bird/android/model/persistence/Tutorial;", "i0", "", "tutorialIds", "W0", "([Ljava/lang/String;)Lio/reactivex/F;", "id", "B", "clear", "LEa6;", C17296a.f69688o, "LEa6;", "tutorialClient", "LRv0;", "b", "LRv0;", "configurableTutorialDao", "Lorg/joda/time/DateTime;", "c", "Lorg/joda/time/DateTime;", "lastTutorialRefreshTime", "<init>", "(LEa6;LRv0;)V", DateTokenConverter.CONVERTER_KEY, "co.bird.android.repository.configurable-tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33683Iw0 implements InterfaceC33215Gw0 {

    /* renamed from: d */
    public static final C3817a f16472d = new C3817a(null);

    /* renamed from: a */
    public final InterfaceC32555Ea6 f16473a;

    /* renamed from: b */
    public final AbstractC35780Rv0 f16474b;

    /* renamed from: c */
    public DateTime f16475c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LIw0$a;", "", "", "FETCH_TUTORIAL_REFRESH_THRESHOLD_MINUTES", "I", "<init>", "()V", "co.bird.android.repository.configurable-tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Iw0$a */
    /* loaded from: classes4.dex */
    public static final class C3817a {
        public /* synthetic */ C3817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3817a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireTutorialResponse;", "wireTutorialResponse", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireTutorialResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConfigurableTutorialRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialRepositoryImpl.kt\nco/bird/android/repository/tutorial/ConfigurableTutorialRepositoryImpl$fetchTutorials$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,94:1\n1603#2,9:95\n1855#2:104\n1549#2:105\n1620#2,3:106\n1856#2:110\n1612#2:111\n1603#2,9:112\n1855#2:121\n1549#2:122\n1620#2,3:123\n1856#2:127\n1612#2:128\n1549#2:131\n1620#2,3:132\n1#3:109\n1#3:126\n37#4,2:129\n*S KotlinDebug\n*F\n+ 1 ConfigurableTutorialRepositoryImpl.kt\nco/bird/android/repository/tutorial/ConfigurableTutorialRepositoryImpl$fetchTutorials$1\n*L\n34#1:95,9\n34#1:104\n35#1:105\n35#1:106,3\n34#1:110\n34#1:111\n48#1:112,9\n48#1:121\n49#1:122\n49#1:123,3\n48#1:127\n48#1:128\n57#1:131\n57#1:132,3\n34#1:109\n48#1:126\n52#1:129,2\n*E\n"})
    /* renamed from: Iw0$b */
    /* loaded from: classes4.dex */
    public static final class C3818b extends Lambda implements Function1<WireTutorialResponse, InterfaceC23496h> {
        public C3818b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireTutorialResponse wireTutorialResponse) {
            List<Tutorial> flatten;
            List flatten2;
            int collectionSizeOrDefault;
            List listOf;
            ArrayList arrayList;
            List<WireTutorial> tutorials;
            int collectionSizeOrDefault2;
            ArrayList arrayList2;
            List<WireTutorial> tutorials2;
            int collectionSizeOrDefault3;
            boolean z;
            String header;
            boolean z2;
            String title;
            boolean z3;
            String message;
            boolean z4;
            String buttonText;
            Intrinsics.checkNotNullParameter(wireTutorialResponse, "wireTutorialResponse");
            Set<Map.Entry<ConfigurableTutorialContext, WireTutorials>> entrySet = wireTutorialResponse.getTutorials().entrySet();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ConfigurableTutorialContext configurableTutorialContext = (ConfigurableTutorialContext) entry.getKey();
                WireTutorials wireTutorials = (WireTutorials) entry.getValue();
                if (wireTutorials != null && (tutorials2 = wireTutorials.getTutorials()) != null) {
                    List<WireTutorial> list = tutorials2;
                    collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                    for (WireTutorial wireTutorial : list) {
                        String header2 = wireTutorials.getHeader();
                        if (header2 != null && header2.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            header = null;
                        } else {
                            header = wireTutorials.getHeader();
                        }
                        String title2 = wireTutorials.getTitle();
                        if (title2 != null && title2.length() != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            title = null;
                        } else {
                            title = wireTutorials.getTitle();
                        }
                        String message2 = wireTutorials.getMessage();
                        if (message2 != null && message2.length() != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            message = null;
                        } else {
                            message = wireTutorials.getMessage();
                        }
                        String buttonText2 = wireTutorials.getButtonText();
                        if (buttonText2 != null && buttonText2.length() != 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            buttonText = null;
                        } else {
                            buttonText = wireTutorials.getButtonText();
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add(C35078Ov0.m91192b(wireTutorial, configurableTutorialContext, header, title, message, buttonText));
                        arrayList4 = arrayList5;
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList3.add(arrayList2);
                }
            }
            flatten = CollectionsKt__IterablesKt.flatten(arrayList3);
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[3];
            AbstractC35780Rv0 abstractC35780Rv0 = C33683Iw0.this.f16474b;
            Set<Map.Entry<ConfigurableTutorialContext, WireTutorials>> entrySet2 = wireTutorialResponse.getTutorials().entrySet();
            ArrayList arrayList6 = new ArrayList();
            Iterator<T> it2 = entrySet2.iterator();
            while (it2.hasNext()) {
                WireTutorials wireTutorials2 = (WireTutorials) ((Map.Entry) it2.next()).getValue();
                if (wireTutorials2 != null && (tutorials = wireTutorials2.getTutorials()) != null) {
                    List<WireTutorial> list2 = tutorials;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                    arrayList = new ArrayList(collectionSizeOrDefault2);
                    for (WireTutorial wireTutorial2 : list2) {
                        arrayList.add(wireTutorial2.getId());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList6.add(arrayList);
                }
            }
            flatten2 = CollectionsKt__IterablesKt.flatten(arrayList6);
            String[] strArr = (String[]) flatten2.toArray(new String[0]);
            abstractC23461cArr[0] = abstractC35780Rv0.mo84648a((String[]) Arrays.copyOf(strArr, strArr.length));
            AbstractC35780Rv0 abstractC35780Rv02 = C33683Iw0.this.f16474b;
            List<Tutorial> list3 = flatten;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
            ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list3) {
                arrayList7.add(C35078Ov0.m91185i(tutorial));
            }
            abstractC23461cArr[1] = abstractC35780Rv02.mo84640i(arrayList7);
            abstractC23461cArr[2] = C33683Iw0.this.f16474b.mo84641h(flatten);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOf);
        }
    }

    public C33683Iw0(InterfaceC32555Ea6 tutorialClient, AbstractC35780Rv0 configurableTutorialDao) {
        Intrinsics.checkNotNullParameter(tutorialClient, "tutorialClient");
        Intrinsics.checkNotNullParameter(configurableTutorialDao, "configurableTutorialDao");
        this.f16473a = tutorialClient;
        this.f16474b = configurableTutorialDao;
        DateTime minusDays = DateTime.now().minusDays(1);
        Intrinsics.checkNotNullExpressionValue(minusDays, "now().minusDays(1)");
        this.f16475c = minusDays;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m101468M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC33215Gw0
    /* renamed from: B */
    public AbstractC23461c mo101472B(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return m101470K1(this.f16474b.mo84642g(id));
    }

    /* renamed from: K1 */
    public AbstractC23461c m101470K1(AbstractC23461c abstractC23461c) {
        return InterfaceC33215Gw0.C2988a.m104574a(this, abstractC23461c);
    }

    /* renamed from: L1 */
    public <T> AbstractC23442F<T> m101469L1(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC33215Gw0.C2988a.m104573b(this, abstractC23442F);
    }

    @Override // p000.InterfaceC33215Gw0
    /* renamed from: W0 */
    public AbstractC23442F<List<Tutorial>> mo101467W0(String... tutorialIds) {
        Intrinsics.checkNotNullParameter(tutorialIds, "tutorialIds");
        return m101469L1(this.f16474b.mo84643f((String[]) Arrays.copyOf(tutorialIds, tutorialIds.length)));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f16474b.mo84648a(new String[0]);
    }

    @Override // p000.InterfaceC33215Gw0
    /* renamed from: g */
    public AbstractC23461c mo101466g() {
        if (this.f16475c.plusMinutes(5).isAfterNow()) {
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
            return m33039p;
        }
        AbstractC23442F tutorials$default = InterfaceC32555Ea6.C1895a.getTutorials$default(this.f16473a, null, null, 3, null);
        final C3818b c3818b = new C3818b();
        AbstractC23461c m33164B = tutorials$default.m33164B(new InterfaceC23492o() { // from class: Hw0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m101468M1;
                m101468M1 = C33683Iw0.m101468M1(Function1.this, obj);
                return m101468M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchTutori….clearOnError()\n    }\n  }");
        return m101470K1(m33164B);
    }

    @Override // p000.InterfaceC33215Gw0
    /* renamed from: i0 */
    public AbstractC23442F<List<Tutorial>> mo101465i0(ConfigurableTutorialContext context, String str, boolean z) {
        AbstractC23442F<List<Tutorial>> mo84647b;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null && z) {
            mo84647b = this.f16474b.mo84645d(context, str);
        } else if (str != null) {
            mo84647b = this.f16474b.mo84646c(context, str);
        } else if (z) {
            mo84647b = this.f16474b.mo84644e(context);
        } else {
            mo84647b = this.f16474b.mo84647b(context);
        }
        return m101469L1(mo84647b);
    }
}
