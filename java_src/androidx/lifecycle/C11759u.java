package androidx.lifecycle;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FE0;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0013\u001cB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, m28432d2 = {"Landroidx/lifecycle/u;", "", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", C17296a.f69688o, "(Ljava/lang/Class;)LOr6;", "", "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)LOr6;", "LWr6;", "LWr6;", "store", "Landroidx/lifecycle/u$b;", "Landroidx/lifecycle/u$b;", "factory", "LFE0;", "c", "LFE0;", "defaultCreationExtras", "<init>", "(LWr6;Landroidx/lifecycle/u$b;LFE0;)V", "LXr6;", "owner", "(LXr6;)V", "(LXr6;Landroidx/lifecycle/u$b;)V", DateTokenConverter.CONVERTER_KEY, "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewModelProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelProvider.kt\nandroidx/lifecycle/ViewModelProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,375:1\n1#2:376\n*E\n"})
/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public class C11759u {

    /* renamed from: a */
    public final C36920Wr6 f54986a;

    /* renamed from: b */
    public final InterfaceC11763b f54987b;

    /* renamed from: c */
    public final FE0 f54988c;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m28432d2 = {"Landroidx/lifecycle/u$b;", "", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "LFE0;", "extras", "(Ljava/lang/Class;LFE0;)LOr6;", C17296a.f69688o, "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.u$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11763b {

        /* renamed from: a */
        public static final C11764a f54994a = C11764a.f54995a;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Landroidx/lifecycle/u$b$a;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.u$b$a */
        /* loaded from: classes.dex */
        public static final class C11764a {

            /* renamed from: a */
            public static final /* synthetic */ C11764a f54995a = new C11764a();

            private C11764a() {
            }
        }

        default <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, m28432d2 = {"Landroidx/lifecycle/u$c;", "Landroidx/lifecycle/u$b;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)LOr6;", "<init>", "()V", "b", C17296a.f69688o, "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.u$c */
    /* loaded from: classes.dex */
    public static class C11765c implements InterfaceC11763b {

        /* renamed from: c */
        public static C11765c f54997c;

        /* renamed from: b */
        public static final C11766a f54996b = new C11766a(null);
        @JvmField

        /* renamed from: d */
        public static final FE0.InterfaceC2210b<String> f54998d = C11766a.C11767a.f54999a;

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"Landroidx/lifecycle/u$c$a;", "", "Landroidx/lifecycle/u$c;", C17296a.f69688o, "()Landroidx/lifecycle/u$c;", "getInstance$annotations", "()V", "instance", "LFE0$b;", "", "VIEW_MODEL_KEY", "LFE0$b;", "sInstance", "Landroidx/lifecycle/u$c;", "<init>", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.u$c$a */
        /* loaded from: classes.dex */
        public static final class C11766a {

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Landroidx/lifecycle/u$c$a$a;", "LFE0$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.u$c$a$a */
            /* loaded from: classes.dex */
            public static final class C11767a implements FE0.InterfaceC2210b<String> {

                /* renamed from: a */
                public static final C11767a f54999a = new C11767a();

                private C11767a() {
                }
            }

            public /* synthetic */ C11766a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C11765c m66913a() {
                if (C11765c.f54997c == null) {
                    C11765c.f54997c = new C11765c();
                }
                C11765c c11765c = C11765c.f54997c;
                Intrinsics.checkNotNull(c11765c);
                return c11765c;
            }

            private C11766a() {
            }
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Landroidx/lifecycle/u$d;", "", "LOr6;", "viewModel", "", C17296a.f69688o, "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.u$d */
    /* loaded from: classes.dex */
    public static class C11768d {
        /* renamed from: a */
        public void mo66912a(AbstractC35048Or6 viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public C11759u(C36920Wr6 store, InterfaceC11763b factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    /* renamed from: a */
    public <T extends AbstractC35048Or6> T m66922a(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m66921b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC35048Or6> T m66921b(String key, Class<T> modelClass) {
        T t;
        C11768d c11768d;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T t2 = (T) this.f54986a.m77778b(key);
        if (modelClass.isInstance(t2)) {
            InterfaceC11763b interfaceC11763b = this.f54987b;
            if (interfaceC11763b instanceof C11768d) {
                c11768d = (C11768d) interfaceC11763b;
            } else {
                c11768d = null;
            }
            if (c11768d != null) {
                Intrinsics.checkNotNull(t2);
                c11768d.mo66912a(t2);
            }
            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        C47511qX2 c47511qX2 = new C47511qX2(this.f54988c);
        c47511qX2.m17470c(C11765c.f54998d, key);
        try {
            t = (T) this.f54987b.create(modelClass, c47511qX2);
        } catch (AbstractMethodError unused) {
            t = (T) this.f54987b.create(modelClass);
        }
        this.f54986a.m77776d(key, t);
        return t;
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\b\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\t\b\u0016¢\u0006\u0004\b\u0013\u0010\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0016J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\nJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0019"}, m28432d2 = {"Landroidx/lifecycle/u$a;", "Landroidx/lifecycle/u$c;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "(Ljava/lang/Class;)LOr6;", "Landroid/app/Application;", Stripe3ds2AuthParams.FIELD_APP, "e", "(Ljava/lang/Class;Landroid/app/Application;)LOr6;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "f", C17296a.f69688o, "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    public static class C11760a extends C11765c {

        /* renamed from: g */
        public static C11760a f54990g;

        /* renamed from: e */
        public final Application f54992e;

        /* renamed from: f */
        public static final C11761a f54989f = new C11761a(null);
        @JvmField

        /* renamed from: h */
        public static final FE0.InterfaceC2210b<Application> f54991h = C11761a.C11762a.f54993a;

        @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Landroidx/lifecycle/u$a$a;", "", "LXr6;", "owner", "Landroidx/lifecycle/u$b;", C17296a.f69688o, "(LXr6;)Landroidx/lifecycle/u$b;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/u$a;", "b", "LFE0$b;", "APPLICATION_KEY", "LFE0$b;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/u$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.u$a$a */
        /* loaded from: classes.dex */
        public static final class C11761a {

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Landroidx/lifecycle/u$a$a$a;", "LFE0$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* renamed from: androidx.lifecycle.u$a$a$a */
            /* loaded from: classes.dex */
            public static final class C11762a implements FE0.InterfaceC2210b<Application> {

                /* renamed from: a */
                public static final C11762a f54993a = new C11762a();

                private C11762a() {
                }
            }

            public /* synthetic */ C11761a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final InterfaceC11763b m66917a(InterfaceC37154Xr6 owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (owner instanceof InterfaceC11718e) {
                    return ((InterfaceC11718e) owner).getDefaultViewModelProviderFactory();
                }
                return C11765c.f54996b.m66913a();
            }

            @JvmStatic
            /* renamed from: b */
            public final C11760a m66916b(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (C11760a.f54990g == null) {
                    C11760a.f54990g = new C11760a(application);
                }
                C11760a c11760a = C11760a.f54990g;
                Intrinsics.checkNotNull(c11760a);
                return c11760a;
            }

            private C11761a() {
            }
        }

        public C11760a(Application application, int i) {
            this.f54992e = application;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f54992e != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.mo17471a(f54991h);
            if (application != null) {
                return (T) m66918e(modelClass, application);
            }
            if (!C23294ie.class.isAssignableFrom(modelClass)) {
                return (T) super.create(modelClass);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        /* renamed from: e */
        public final <T extends AbstractC35048Or6> T m66918e(Class<T> cls, Application application) {
            if (C23294ie.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }

        public C11760a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C11760a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.C11759u.C11765c, androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f54992e;
            if (application != null) {
                return (T) m66918e(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    @JvmOverloads
    public C11759u(C36920Wr6 store, InterfaceC11763b factory, FE0 defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f54986a = store;
        this.f54987b = factory;
        this.f54988c = defaultCreationExtras;
    }

    public /* synthetic */ C11759u(C36920Wr6 c36920Wr6, InterfaceC11763b interfaceC11763b, FE0 fe0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36920Wr6, interfaceC11763b, (i & 4) != 0 ? FE0.C2209a.f9049b : fe0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11759u(InterfaceC37154Xr6 owner) {
        this(owner.getViewModelStore(), C11760a.f54989f.m66917a(owner), C36452Ur6.m80740a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11759u(InterfaceC37154Xr6 owner, InterfaceC11763b factory) {
        this(owner.getViewModelStore(), factory, C36452Ur6.m80740a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
