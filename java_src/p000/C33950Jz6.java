package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LocalAsset;
import co.bird.android.model.constant.AssetManagerType;
import co.bird.android.model.constant.TaskPriority;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24558d;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p053io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import org.joda.time.DateTime;
import p000.C33950Jz6;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\b\u001a\u00020\u0007*\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LJz6;", "LAz6;", "", "name", "Lio/reactivex/c;", "b", "Lco/bird/android/model/LocalAsset;", "Lvz6;", "j", "LNz6;", TransferTable.COLUMN_STATE, "k", "url", "g", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsu2;", "Lsu2;", "localAssetManager", "LZ84;", "", "c", "Lkotlin/Lazy;", "()LZ84;", "availableArchives", "La94;", DateTokenConverter.CONVERTER_KEY, "La94;", "mutableWebArchives", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "e", "Lio/reactivex/subjects/d;", "refreshWebArchiveSubject", "<init>", "(Landroid/content/Context;Lsu2;)V", "web-archive_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebArchiveManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebArchiveManagerImpl.kt\nco/bird/android/manager/web/WebArchiveManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,136:1\n237#2:137\n288#3,2:138\n11345#4:140\n11680#4,3:141\n*S KotlinDebug\n*F\n+ 1 WebArchiveManagerImpl.kt\nco/bird/android/manager/web/WebArchiveManagerImpl\n*L\n78#1:137\n83#1:138,2\n102#1:140\n102#1:141,3\n*E\n"})
/* renamed from: Jz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33950Jz6 implements InterfaceC31844Az6 {

    /* renamed from: a */
    public final Context f18884a;

    /* renamed from: b */
    public final InterfaceC48923su2 f18885b;

    /* renamed from: c */
    public final Lazy f18886c;

    /* renamed from: d */
    public final C37791a94<List<C50755vz6>> f18887d;

    /* renamed from: e */
    public final C24558d<String> f18888e;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "name", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "e", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jz6$a */
    /* loaded from: classes4.dex */
    public static final class C4290a extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", "localAsset", "", "b", "(Lco/bird/android/model/LocalAsset;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Jz6$a$a */
        /* loaded from: classes4.dex */
        public static final class C4291a extends Lambda implements Function1<LocalAsset, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33950Jz6 f18890g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4291a(C33950Jz6 c33950Jz6) {
                super(1);
                this.f18890g = c33950Jz6;
            }

            /* renamed from: c */
            public static final int m99383c(C50755vz6 c50755vz6, C50755vz6 c50755vz62) {
                return c50755vz6.m7615e().compareTo(c50755vz62.m7615e());
            }

            /* renamed from: b */
            public final void m99384b(LocalAsset localAsset) {
                if (EnumC2939Gm.f12396c.m104775a(localAsset.getMediaType()).m104776c()) {
                    C37791a94 c37791a94 = this.f18890g.f18887d;
                    C33950Jz6 c33950Jz6 = this.f18890g;
                    Intrinsics.checkNotNullExpressionValue(localAsset, "localAsset");
                    C38384b94.m64920b(c37791a94, c33950Jz6.m99396j(localAsset), new Comparator() { // from class: Iz6
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m99383c;
                            m99383c = C33950Jz6.C4290a.C4291a.m99383c((C50755vz6) obj, (C50755vz6) obj2);
                            return m99383c;
                        }
                    });
                    return;
                }
                File file = localAsset.getFile();
                if (!file.isDirectory()) {
                    File unzip$default = C51796xl1.unzip$default(localAsset.getFile(), null, 1, null);
                    FilesKt__UtilsKt.deleteRecursively(file);
                    unzip$default.renameTo(file);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalAsset localAsset) {
                m99384b(localAsset);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Jz6$a$b */
        /* loaded from: classes4.dex */
        public static final class C4292b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33950Jz6 f18891g;

            /* renamed from: h */
            public final /* synthetic */ String f18892h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4292b(C33950Jz6 c33950Jz6, String str) {
                super(1);
                this.f18891g = c33950Jz6;
                this.f18892h = str;
            }

            /* renamed from: b */
            public static final int m99381b(C50755vz6 c50755vz6, C50755vz6 c50755vz62) {
                return c50755vz6.m7615e().compareTo(c50755vz62.m7615e());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40159e(th);
                C37791a94 c37791a94 = this.f18891g.f18887d;
                C33950Jz6 c33950Jz6 = this.f18891g;
                String name = this.f18892h;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                C38384b94.m64920b(c37791a94, c33950Jz6.m99395k(name, EnumC34886Nz6.FAILED), new Comparator() { // from class: Kz6
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m99381b;
                        m99381b = C33950Jz6.C4290a.C4292b.m99381b((C50755vz6) obj, (C50755vz6) obj2);
                        return m99381b;
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/LocalAsset;", "kotlin.jvm.PlatformType", "asset", "", "b", "(Lco/bird/android/model/LocalAsset;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Jz6$a$c */
        /* loaded from: classes4.dex */
        public static final class C4293c extends Lambda implements Function1<LocalAsset, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C33950Jz6 f18893g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4293c(C33950Jz6 c33950Jz6) {
                super(1);
                this.f18893g = c33950Jz6;
            }

            /* renamed from: c */
            public static final int m99378c(C50755vz6 c50755vz6, C50755vz6 c50755vz62) {
                return c50755vz6.m7615e().compareTo(c50755vz62.m7615e());
            }

            /* renamed from: b */
            public final void m99379b(LocalAsset asset) {
                C37791a94 c37791a94 = this.f18893g.f18887d;
                C33950Jz6 c33950Jz6 = this.f18893g;
                Intrinsics.checkNotNullExpressionValue(asset, "asset");
                C38384b94.m64920b(c37791a94, c33950Jz6.m99396j(asset), new Comparator() { // from class: Lz6
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m99378c;
                        m99378c = C33950Jz6.C4290a.C4293c.m99378c((C50755vz6) obj, (C50755vz6) obj2);
                        return m99378c;
                    }
                });
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LocalAsset localAsset) {
                m99379b(localAsset);
                return Unit.INSTANCE;
            }
        }

        public C4290a() {
            super(1);
        }

        /* renamed from: f */
        public static final int m99389f(C50755vz6 c50755vz6, C50755vz6 c50755vz62) {
            return c50755vz6.m7615e().compareTo(c50755vz62.m7615e());
        }

        /* renamed from: g */
        public static final void m99388g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final void m99387h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: i */
        public static final void m99386i(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23496h invoke(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            C38384b94.m64920b(C33950Jz6.this.f18887d, C33950Jz6.this.m99395k(name, EnumC34886Nz6.DOWNLOADING), new Comparator() { // from class: Ez6
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m99389f;
                    m99389f = C33950Jz6.C4290a.m99389f((C50755vz6) obj, (C50755vz6) obj2);
                    return m99389f;
                }
            });
            AbstractC23442F<LocalAsset> m33152N = C33950Jz6.this.f18885b.mo13534a(name, AssetManagerType.WEB_ARCHIVE, TaskPriority.BACKGROUND).m33152N(C24542a.m31932c());
            final C4291a c4291a = new C4291a(C33950Jz6.this);
            AbstractC23442F<LocalAsset> m33101w = m33152N.m33101w(new InterfaceC23484g() { // from class: Fz6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33950Jz6.C4290a.m99388g(Function1.this, obj);
                }
            });
            final C4292b c4292b = new C4292b(C33950Jz6.this, name);
            AbstractC23442F<LocalAsset> m33106t = m33101w.m33106t(new InterfaceC23484g() { // from class: Gz6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33950Jz6.C4290a.m99387h(Function1.this, obj);
                }
            });
            final C4293c c4293c = new C4293c(C33950Jz6.this);
            return m33106t.m33101w(new InterfaceC23484g() { // from class: Hz6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33950Jz6.C4290a.m99386i(Function1.this, obj);
                }
            }).m33159G().m33069Q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "", "Lvz6;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Jz6$b */
    /* loaded from: classes4.dex */
    public static final class C4294b extends Lambda implements Function0<Z84<List<? extends C50755vz6>>> {
        public C4294b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<List<? extends C50755vz6>> invoke2() {
            return Z84.f47888d.m73663b(C33950Jz6.this.f18887d);
        }
    }

    public C33950Jz6(Context context, InterfaceC48923su2 localAssetManager) {
        Lazy lazy;
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localAssetManager, "localAssetManager");
        this.f18884a = context;
        this.f18885b = localAssetManager;
        lazy = LazyKt__LazyJVMKt.lazy(new C4294b());
        this.f18886c = lazy;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f18887d = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
        C24558d<String> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<String>()");
        this.f18888e = m31902e;
        final C4290a c4290a = new C4290a();
        AbstractC23461c flatMapCompletable = m31902e.flatMapCompletable(new InterfaceC23492o() { // from class: Bz6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m99400f;
                m99400f = C33950Jz6.m99400f(Function1.this, obj);
                return m99400f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "refreshWebArchiveSubject…onErrorComplete()\n      }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: f */
    public static final InterfaceC23496h m99400f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m99398h(C33950Jz6 this$0, String name) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(name, "$name");
        C38384b94.m64920b(this$0.f18887d, toWebArchive$default(this$0, name, null, 1, null), new Comparator() { // from class: Dz6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m99397i;
                m99397i = C33950Jz6.m99397i((C50755vz6) obj, (C50755vz6) obj2);
                return m99397i;
            }
        });
        this$0.f18888e.onNext(name);
    }

    /* renamed from: i */
    public static final int m99397i(C50755vz6 c50755vz6, C50755vz6 c50755vz62) {
        return c50755vz6.m7615e().compareTo(c50755vz62.m7615e());
    }

    public static /* synthetic */ C50755vz6 toWebArchive$default(C33950Jz6 c33950Jz6, String str, EnumC34886Nz6 enumC34886Nz6, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC34886Nz6 = EnumC34886Nz6.UNINITIALIZED;
        }
        return c33950Jz6.m99395k(str, enumC34886Nz6);
    }

    @Override // p000.InterfaceC31844Az6
    /* renamed from: a */
    public Z84<List<C50755vz6>> mo99405a() {
        return (Z84) this.f18886c.getValue();
    }

    @Override // p000.InterfaceC31844Az6
    /* renamed from: b */
    public AbstractC23461c mo99404b(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AbstractC23461c m33079G = AbstractC23461c.m33079G(new InterfaceC23478a() { // from class: Cz6
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C33950Jz6.m99398h(C33950Jz6.this, name);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33079G, "fromAction {\n      mutab…ubject.onNext(name)\n    }");
        return m33079G;
    }

    /* renamed from: g */
    public final String m99399g(String str, String str2) {
        String joinToString$default;
        String str3 = str + "|" + str2;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(\"SHA-1\")\n   …digest(str.toByteArray())");
        ArrayList arrayList = new ArrayList(digest.length);
        for (byte b : digest) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            arrayList.add(format);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    /* renamed from: j */
    public final C50755vz6 m99396j(LocalAsset localAsset) {
        Intrinsics.checkNotNullParameter(localAsset, "<this>");
        String id = localAsset.getId();
        String downloadUrl = localAsset.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = "";
        }
        return new C50755vz6(m99399g(id, downloadUrl), localAsset.getId(), EnumC2939Gm.f12396c.m104775a(localAsset.getMediaType()).m104776c(), 100.0f, EnumC34886Nz6.READY, localAsset.getDownloadedAt(), null, localAsset.getDownloadUrl(), null, localAsset.getFile());
    }

    /* renamed from: k */
    public final C50755vz6 m99395k(String str, EnumC34886Nz6 state) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        return new C50755vz6("", str, false, 0.0f, state, now, null, null, null, null);
    }
}
