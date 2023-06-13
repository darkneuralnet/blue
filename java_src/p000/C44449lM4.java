package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p000.LI4;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010\u001cJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007JO\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\r\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ9\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u001d\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\u0004\u0018\u00010\u0004*\u00020\u001e8BX\u0083\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"LlM4;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "fileLocation", "Ljava/nio/ByteBuffer;", C17296a.f69688o, "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "e", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lkotlin/Function1;", "g", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "LrA1;", "b", "LrA1;", "c", "()LrA1;", "setFuelManager", "(LrA1;)V", "getFuelManager$annotations", "()V", "fuelManager", "Landroid/net/Uri;", "(Landroid/net/Uri;)Ljava/lang/String;", "getFirstPathSegment$annotations", "(Landroid/net/Uri;)V", "firstPathSegment", "<init>", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: lM4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44449lM4 {

    /* renamed from: a */
    public static final C44449lM4 f95920a = new C44449lM4();

    /* renamed from: b */
    public static C47896rA1 f95921b = new C47896rA1();

    /* renamed from: c */
    public static final int f95922c = 8;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Ljava/nio/ByteBuffer;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "io.github.sceneview.utils.ResourceLoader$fileBuffer$2", m28418f = "ResourceLoader.kt", m28417i = {}, m28416l = {223}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: lM4$a */
    /* loaded from: classes6.dex */
    public static final class C25677a extends SuspendLambda implements Function2<ZC0, Continuation<? super ByteBuffer>, Object> {

        /* renamed from: h */
        public int f95923h;

        /* renamed from: i */
        public final /* synthetic */ Uri f95924i;

        /* renamed from: j */
        public final /* synthetic */ String f95925j;

        /* renamed from: k */
        public final /* synthetic */ Context f95926k;

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "T", "LC01;", "U", "LZC0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
        @DebugMetadata(m28419c = "com.github.kittinunf.fuel.coroutines.CoroutinesKt$await$2", m28418f = "Coroutines.kt", m28417i = {0}, m28416l = {33}, m28415m = "invokeSuspend", m28414n = {"$this$withContext"}, m28413s = {"L$0"})
        /* renamed from: lM4$a$a */
        /* loaded from: classes6.dex */
        public static final class C25678a extends SuspendLambda implements Function2 {

            /* renamed from: h */
            public ZC0 f95927h;

            /* renamed from: i */
            public Object f95928i;

            /* renamed from: j */
            public int f95929j;

            /* renamed from: k */
            public final /* synthetic */ InterfaceC46785pI4 f95930k;

            /* renamed from: l */
            public final /* synthetic */ C01 f95931l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25678a(InterfaceC46785pI4 interfaceC46785pI4, C01 c01, Continuation continuation) {
                super(2, continuation);
                this.f95930k = interfaceC46785pI4;
                this.f95931l = c01;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                C25678a c25678a = new C25678a(this.f95930k, this.f95931l, completion);
                c25678a.f95927h = (ZC0) obj;
                return c25678a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C25678a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f95929j;
                if (i != 0) {
                    if (i == 1) {
                        ZC0 zc0 = (ZC0) this.f95928i;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ZC0 zc02 = this.f95927h;
                    InterfaceC46785pI4 interfaceC46785pI4 = this.f95930k;
                    C01 c01 = this.f95931l;
                    this.f95928i = zc02;
                    this.f95929j = 1;
                    obj = D01.m111165a(interfaceC46785pI4, c01, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25677a(Uri uri, String str, Context context, Continuation<? super C25677a> continuation) {
            super(2, continuation);
            this.f95924i = uri;
            this.f95925j = str;
            this.f95926k = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25677a(this.f95924i, this.f95925j, this.f95926k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super ByteBuffer> continuation) {
            return ((C25677a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            int hashCode;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95923h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                String scheme = this.f95924i.getScheme();
                if (scheme != null && ((hashCode = scheme.hashCode()) == 3213448 ? scheme.equals("http") : hashCode == 99617003 && scheme.equals("https"))) {
                    InterfaceC46785pI4 m97355a = LI4.C4802a.m97355a(C44449lM4.m27398c(), this.f95925j, null, 2, null);
                    SC0 m84377b = T41.m84377b();
                    C25678a c25678a = new C25678a(m97355a, new C46086o70(), null);
                    this.f95923h = 1;
                    obj = X30.m77504g(m84377b, c25678a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return C44449lM4.m27397d(this.f95926k, this.f95925j);
                }
            }
            return ByteBuffer.wrap((byte[]) obj);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    @DebugMetadata(m28419c = "io.github.sceneview.utils.ResourceLoader", m28418f = "ResourceLoader.kt", m28417i = {0, 1}, m28416l = {32, 33}, m28415m = "useFileBuffer", m28414n = {"block", "buffer"}, m28413s = {"L$0", "L$0"})
    /* renamed from: lM4$b */
    /* loaded from: classes6.dex */
    public static final class C25679b<R> extends ContinuationImpl {

        /* renamed from: h */
        public Object f95932h;

        /* renamed from: i */
        public /* synthetic */ Object f95933i;

        /* renamed from: k */
        public int f95935k;

        public C25679b(Continuation<? super C25679b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f95933i = obj;
            this.f95935k |= Integer.MIN_VALUE;
            return C44449lM4.this.m27396e(null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m28432d2 = {"R", "Ljava/nio/ByteBuffer;", "buffer", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
    @DebugMetadata(m28419c = "io.github.sceneview.utils.ResourceLoader$useFileBufferNotNull$2", m28418f = "ResourceLoader.kt", m28417i = {}, m28416l = {41}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: lM4$c */
    /* loaded from: classes6.dex */
    public static final class C25680c extends SuspendLambda implements Function2<ByteBuffer, Continuation<? super R>, Object> {

        /* renamed from: h */
        public int f95936h;

        /* renamed from: i */
        public /* synthetic */ Object f95937i;

        /* renamed from: j */
        public final /* synthetic */ Function2<ByteBuffer, Continuation<? super R>, Object> f95938j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25680c(Function2<? super ByteBuffer, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super C25680c> continuation) {
            super(2, continuation);
            this.f95938j = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25680c c25680c = new C25680c(this.f95938j, continuation);
            c25680c.f95937i = obj;
            return c25680c;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: e */
        public final Object invoke(ByteBuffer byteBuffer, Continuation<? super R> continuation) {
            return ((C25680c) create(byteBuffer, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f95936h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ByteBuffer byteBuffer = (ByteBuffer) this.f95937i;
            if (byteBuffer != null) {
                Function2<ByteBuffer, Continuation<? super R>, Object> function2 = this.f95938j;
                this.f95936h = 1;
                Object invoke = function2.invoke(byteBuffer, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return invoke;
            }
            return null;
        }
    }

    private C44449lM4() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Object m27400a(Context context, String str, Continuation<? super ByteBuffer> continuation) {
        return X30.m77504g(T41.m84377b(), new C25677a(Uri.parse(str), str, context, null), continuation);
    }

    /* renamed from: b */
    public static final String m27399b(Uri uri) {
        Object firstOrNull;
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) pathSegments);
        return (String) firstOrNull;
    }

    /* renamed from: c */
    public static final C47896rA1 m27398c() {
        return f95921b;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ByteBuffer m27397d(Context context, String fileLocation) {
        byte[] m25809c;
        Object lastOrNull;
        Integer num;
        List drop;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileLocation, "fileLocation");
        Uri uri = Uri.parse(fileLocation);
        String scheme = uri.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != -368816979) {
                if (hashCode != 3143036) {
                    if (hashCode == 951530617 && scheme.equals("content")) {
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        if (openInputStream != null) {
                            m25809c = C45042mM4.m25809c(openInputStream);
                        } else {
                            m25809c = null;
                        }
                    }
                } else if (scheme.equals("file")) {
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    if (Intrinsics.areEqual(m27399b(uri), "android_asset")) {
                        AssetManager assets = context.getAssets();
                        List<String> pathSegments = uri.getPathSegments();
                        Intrinsics.checkNotNullExpressionValue(pathSegments, "uri.pathSegments");
                        drop = CollectionsKt___CollectionsKt.drop(pathSegments, 1);
                        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(drop, "/", null, null, 0, null, null, 62, null);
                        InputStream open = assets.open(joinToString$default);
                        Intrinsics.checkNotNullExpressionValue(open, "context.assets.open(\n   …ng(\"/\")\n                )");
                        m25809c = C45042mM4.m25809c(open);
                    } else {
                        String path = uri.getPath();
                        Intrinsics.checkNotNull(path);
                        m25809c = C45042mM4.m25809c(new FileInputStream(new File(path)));
                    }
                }
            } else if (scheme.equals("android.resource")) {
                Resources resources = context.getResources();
                List<String> pathSegments2 = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments2, "uri.pathSegments");
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) pathSegments2);
                String str = (String) lastOrNull;
                if (str != null) {
                    num = Integer.valueOf(Integer.parseInt(str));
                } else {
                    num = null;
                }
                Intrinsics.checkNotNull(num);
                InputStream openRawResource = resources.openRawResource(num.intValue());
                Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRa….lastOrNull()?.toInt()!!)");
                m25809c = C45042mM4.m25809c(openRawResource);
            }
            if (m25809c != null) {
                return null;
            }
            return ByteBuffer.wrap(m25809c);
        }
        InputStream open2 = context.getAssets().open(fileLocation);
        Intrinsics.checkNotNullExpressionValue(open2, "context.assets.open(fileLocation)");
        m25809c = C45042mM4.m25809c(open2);
        if (m25809c != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object m27396e(Context context, String str, Function2<? super ByteBuffer, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C25679b c25679b;
        Object obj;
        Object coroutine_suspended;
        int i;
        ByteBuffer byteBuffer;
        if (continuation instanceof C25679b) {
            c25679b = (C25679b) continuation;
            int i2 = c25679b.f95935k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c25679b.f95935k = i2 - Integer.MIN_VALUE;
                obj = c25679b.f95933i;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c25679b.f95935k;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            byteBuffer = (ByteBuffer) c25679b.f95932h;
                            ResultKt.throwOnFailure(obj);
                            if (byteBuffer != null) {
                                byteBuffer.clear();
                            }
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function2 = (Function2) c25679b.f95932h;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    c25679b.f95932h = function2;
                    c25679b.f95935k = 1;
                    obj = m27400a(context, str, c25679b);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                byteBuffer = (ByteBuffer) obj;
                c25679b.f95932h = byteBuffer;
                c25679b.f95935k = 2;
                obj = function2.invoke(byteBuffer, c25679b);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (byteBuffer != null) {
                }
                return obj;
            }
        }
        c25679b = new C25679b(continuation);
        obj = c25679b.f95933i;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c25679b.f95935k;
        if (i == 0) {
        }
        byteBuffer = (ByteBuffer) obj;
        c25679b.f95932h = byteBuffer;
        c25679b.f95935k = 2;
        obj = function2.invoke(byteBuffer, c25679b);
        if (obj == coroutine_suspended) {
        }
        if (byteBuffer != null) {
        }
        return obj;
    }

    /* renamed from: f */
    public final <R> Object m27395f(Context context, String str, Function2<? super ByteBuffer, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return m27396e(context, str, new C25680c(function2, null), continuation);
    }

    /* renamed from: g */
    public final <R> R m27394g(Context context, String fileLocation, Function1<? super ByteBuffer, ? extends R> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileLocation, "fileLocation");
        Intrinsics.checkNotNullParameter(block, "block");
        ByteBuffer m27397d = m27397d(context, fileLocation);
        R invoke = block.invoke(m27397d);
        if (m27397d != null) {
            m27397d.clear();
        }
        return invoke;
    }
}
