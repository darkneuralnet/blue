package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.lifecycle.C11747p;
import androidx.savedstate.C11966a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u001a\u001dB\u001f\b\u0016\u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010'¢\u0006\u0004\b)\u0010*B\t\b\u0016¢\u0006\u0004\b)\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0010J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001bR(\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006,"}, m28432d2 = {"Landroidx/lifecycle/p;", "", "Landroidx/savedstate/a$c;", "k", "", "key", "", "e", "T", "LuX2;", "g", "initialValue", "LtP5;", "i", "(Ljava/lang/String;Ljava/lang/Object;)LtP5;", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "j", "hasInitialValue", "h", "(Ljava/lang/String;ZLjava/lang/Object;)LuX2;", "", C17296a.f69688o, "Ljava/util/Map;", "regular", "b", "savedStateProviders", "Landroidx/lifecycle/p$b;", "c", "liveDatas", "LGX2;", DateTokenConverter.CONVERTER_KEY, "flows", "Landroidx/savedstate/a$c;", "savedStateProvider", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public final class C11747p {

    /* renamed from: f */
    public static final C11748a f54957f = new C11748a(null);

    /* renamed from: g */
    public static final Class<? extends Object>[] f54958g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    public final Map<String, Object> f54959a;

    /* renamed from: b */
    public final Map<String, C11966a.InterfaceC11969c> f54960b;

    /* renamed from: c */
    public final Map<String, C11749b<?>> f54961c;

    /* renamed from: d */
    public final Map<String, GX2<Object>> f54962d;

    /* renamed from: e */
    public final C11966a.InterfaceC11969c f54963e;

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Landroidx/lifecycle/p$a;", "", "Landroid/os/Bundle;", "restoredState", "defaultState", "Landroidx/lifecycle/p;", C17296a.f69688o, "value", "", "b", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    public static final class C11748a {
        public /* synthetic */ C11748a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C11747p m66939a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new C11747p();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new C11747p(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new C11747p(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }

        /* renamed from: b */
        public final boolean m66938b(Object obj) {
            Class[] clsArr;
            if (obj == null) {
                return true;
            }
            for (Class cls : C11747p.f54958g) {
                Intrinsics.checkNotNull(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        private C11748a() {
        }
    }

    public C11747p(Map<String, ? extends Object> initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f54959a = linkedHashMap;
        this.f54960b = new LinkedHashMap();
        this.f54961c = new LinkedHashMap();
        this.f54962d = new LinkedHashMap();
        this.f54963e = new C11966a.InterfaceC11969c() { // from class: Ki5
            @Override // androidx.savedstate.C11966a.InterfaceC11969c
            /* renamed from: a */
            public final Bundle mo18217a() {
                Bundle m66941l;
                m66941l = C11747p.m66941l(C11747p.this);
                return m66941l;
            }
        };
        linkedHashMap.putAll(initialState);
    }

    /* renamed from: l */
    public static final Bundle m66941l(C11747p this$0) {
        Map map;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        map = MapsKt__MapsKt.toMap(this$0.f54960b);
        for (Map.Entry entry : map.entrySet()) {
            this$0.m66940m((String) entry.getKey(), ((C11966a.InterfaceC11969c) entry.getValue()).mo18217a());
        }
        Set<String> keySet = this$0.f54959a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(this$0.f54959a.get(str));
        }
        return C39564d70.m44603a(TuplesKt.m28425to(UserMetadata.KEYDATA_FILENAME, arrayList), TuplesKt.m28425to("values", arrayList2));
    }

    /* renamed from: e */
    public final boolean m66948e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f54959a.containsKey(key);
    }

    /* renamed from: f */
    public final <T> T m66947f(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (T) this.f54959a.get(key);
        } catch (ClassCastException unused) {
            m66943j(key);
            return null;
        }
    }

    /* renamed from: g */
    public final <T> C49882uX2<T> m66946g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        C49882uX2<T> m66945h = m66945h(key, false, null);
        Intrinsics.checkNotNull(m66945h, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return m66945h;
    }

    /* renamed from: h */
    public final <T> C49882uX2<T> m66945h(String str, boolean z, T t) {
        C11749b<?> c11749b;
        C11749b<?> c11749b2;
        C11749b<?> c11749b3 = this.f54961c.get(str);
        if (c11749b3 instanceof C49882uX2) {
            c11749b = c11749b3;
        } else {
            c11749b = null;
        }
        if (c11749b != null) {
            return c11749b;
        }
        if (this.f54959a.containsKey(str)) {
            c11749b2 = new C11749b<>(this, str, this.f54959a.get(str));
        } else if (z) {
            this.f54959a.put(str, t);
            c11749b2 = new C11749b<>(this, str, t);
        } else {
            c11749b2 = new C11749b<>(this, str);
        }
        this.f54961c.put(str, c11749b2);
        return c11749b2;
    }

    /* renamed from: i */
    public final <T> InterfaceC49220tP5<T> m66944i(String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, GX2<Object>> map = this.f54962d;
        GX2<Object> gx2 = map.get(key);
        if (gx2 == null) {
            if (!this.f54959a.containsKey(key)) {
                this.f54959a.put(key, t);
            }
            gx2 = C50405vP5.m8742a(this.f54959a.get(key));
            this.f54962d.put(key, gx2);
            map.put(key, gx2);
        }
        InterfaceC49220tP5<T> m79269b = C36708Vu1.m79269b(gx2);
        Intrinsics.checkNotNull(m79269b, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return m79269b;
    }

    /* renamed from: j */
    public final <T> T m66943j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.f54959a.remove(key);
        C11749b<?> remove = this.f54961c.remove(key);
        if (remove != null) {
            remove.m66937b();
        }
        this.f54962d.remove(key);
        return t;
    }

    /* renamed from: k */
    public final C11966a.InterfaceC11969c m66942k() {
        return this.f54963e;
    }

    /* renamed from: m */
    public final <T> void m66940m(String key, T t) {
        C11749b<?> c11749b;
        Intrinsics.checkNotNullParameter(key, "key");
        if (f54957f.m66938b(t)) {
            C11749b<?> c11749b2 = this.f54961c.get(key);
            if (c11749b2 instanceof C49882uX2) {
                c11749b = c11749b2;
            } else {
                c11749b = null;
            }
            if (c11749b != null) {
                c11749b.setValue(t);
            } else {
                this.f54959a.put(key, t);
            }
            GX2<Object> gx2 = this.f54962d.get(key);
            if (gx2 != null) {
                gx2.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        Intrinsics.checkNotNull(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0012"}, m28432d2 = {"Landroidx/lifecycle/p$b;", "T", "LuX2;", "value", "", "setValue", "(Ljava/lang/Object;)V", "b", "", C17296a.f69688o, "Ljava/lang/String;", "key", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/p;", "handle", "<init>", "(Landroidx/lifecycle/p;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/p;Ljava/lang/String;)V", "lifecycle-viewmodel-savedstate_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.p$b */
    /* loaded from: classes.dex */
    public static final class C11749b<T> extends C49882uX2<T> {

        /* renamed from: a */
        public String f54964a;

        /* renamed from: b */
        public C11747p f54965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11749b(C11747p c11747p, String key, T t) {
            super(t);
            Intrinsics.checkNotNullParameter(key, "key");
            this.f54964a = key;
            this.f54965b = c11747p;
        }

        /* renamed from: b */
        public final void m66937b() {
            this.f54965b = null;
        }

        @Override // p000.C49882uX2, androidx.lifecycle.LiveData
        public void setValue(T t) {
            C11747p c11747p = this.f54965b;
            if (c11747p != null) {
                c11747p.f54959a.put(this.f54964a, t);
                GX2 gx2 = (GX2) c11747p.f54962d.get(this.f54964a);
                if (gx2 != null) {
                    gx2.setValue(t);
                }
            }
            super.setValue(t);
        }

        public C11749b(C11747p c11747p, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f54964a = key;
            this.f54965b = c11747p;
        }
    }

    public C11747p() {
        this.f54959a = new LinkedHashMap();
        this.f54960b = new LinkedHashMap();
        this.f54961c = new LinkedHashMap();
        this.f54962d = new LinkedHashMap();
        this.f54963e = new C11966a.InterfaceC11969c() { // from class: Ki5
            @Override // androidx.savedstate.C11966a.InterfaceC11969c
            /* renamed from: a */
            public final Bundle mo18217a() {
                Bundle m66941l;
                m66941l = C11747p.m66941l(C11747p.this);
                return m66941l;
            }
        };
    }
}
