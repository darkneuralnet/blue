package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J3\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¨\u0006\u001a"}, m28432d2 = {"LNj1;", "", "", "LqG2;", "c", "()Ljava/util/List;", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "b", "", "name", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "e", "Ljava/io/BufferedReader;", "r", "f", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Nj1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34737Nj1 {

    /* renamed from: a */
    public static final C34737Nj1 f25026a = new C34737Nj1();

    private C34737Nj1() {
    }

    /* renamed from: a */
    public final <S> S m93544a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final <S> List<S> m93543b(Class<S> cls, ClassLoader classLoader) {
        List<S> list;
        try {
            return m93541d(cls, classLoader);
        } catch (Throwable unused) {
            list = CollectionsKt___CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
            return list;
        }
    }

    /* renamed from: c */
    public final List<InterfaceC47358qG2> m93542c() {
        InterfaceC47358qG2 interfaceC47358qG2;
        if (!C34971Oj1.m91610a()) {
            return m93543b(InterfaceC47358qG2.class, InterfaceC47358qG2.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC47358qG2 interfaceC47358qG22 = null;
            try {
                interfaceC47358qG2 = (InterfaceC47358qG2) InterfaceC47358qG2.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, InterfaceC47358qG2.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                interfaceC47358qG2 = null;
            }
            if (interfaceC47358qG2 != null) {
                arrayList.add(interfaceC47358qG2);
            }
            try {
                interfaceC47358qG22 = (InterfaceC47358qG2) InterfaceC47358qG2.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC47358qG2.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC47358qG22 != null) {
                arrayList.add(interfaceC47358qG22);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m93543b(InterfaceC47358qG2.class, InterfaceC47358qG2.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m93541d(Class<S> cls, ClassLoader classLoader) {
        Set<String> set;
        int collectionSizeOrDefault;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, f25026a.m93540e(url));
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        if (!set.isEmpty()) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (String str : set) {
                arrayList2.add(f25026a.m93544a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* renamed from: e */
    public final List<String> m93540e(URL url) {
        boolean startsWith$default;
        String substringAfter$default;
        String substringBefore$default;
        String substringAfter$default2;
        String url2 = url.toString();
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(url2, "jar", false, 2, null);
        if (startsWith$default) {
            substringAfter$default = StringsKt__StringsKt.substringAfter$default(url2, "jar:file:", (String) null, 2, (Object) null);
            substringBefore$default = StringsKt__StringsKt.substringBefore$default(substringAfter$default, '!', (String) null, 2, (Object) null);
            substringAfter$default2 = StringsKt__StringsKt.substringAfter$default(url2, "!/", (String) null, 2, (Object) null);
            JarFile jarFile = new JarFile(substringBefore$default, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(substringAfter$default2)), Constants.DEFAULT_ENCODING));
                List<String> m93539f = f25026a.m93539f(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                jarFile.close();
                return m93539f;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
        try {
            List<String> m93539f2 = f25026a.m93539f(bufferedReader2);
            CloseableKt.closeFinally(bufferedReader2, null);
            return m93539f2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    /* renamed from: f */
    public final List<String> m93539f(BufferedReader bufferedReader) {
        List<String> list;
        String substringBefore$default;
        CharSequence trim;
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                substringBefore$default = StringsKt__StringsKt.substringBefore$default(readLine, "#", (String) null, 2, (Object) null);
                trim = StringsKt__StringsKt.trim((CharSequence) substringBefore$default);
                String obj = trim.toString();
                boolean z3 = false;
                int i = 0;
                while (true) {
                    if (i < obj.length()) {
                        char charAt = obj.charAt(i);
                        if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            z = false;
                            break;
                        }
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    if (obj.length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                list = CollectionsKt___CollectionsKt.toList(linkedHashSet);
                return list;
            }
        }
    }
}
