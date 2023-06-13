package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C17128b;
import com.bumptech.glide.load.data.InterfaceC17126a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class Registry {

    /* renamed from: a */
    public final YU2 f69070a;

    /* renamed from: b */
    public final C34674Nc1 f69071b;

    /* renamed from: c */
    public final C39095cM4 f69072c;

    /* renamed from: d */
    public final C40891fM4 f69073d;

    /* renamed from: e */
    public final C17128b f69074e;

    /* renamed from: f */
    public final C39580d86 f69075f;

    /* renamed from: g */
    public final C49288tX1 f69076g;

    /* renamed from: h */
    public final C39785dV2 f69077h = new C39785dV2();

    /* renamed from: i */
    public final C43577jt2 f69078i = new C43577jt2();

    /* renamed from: j */
    public final InterfaceC41591gY3<List<Throwable>> f69079j;

    /* loaded from: classes5.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes5.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes5.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m, List<WU2<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* loaded from: classes5.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes5.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        InterfaceC41591gY3<List<Throwable>> m9834e = C49998uj1.m9834e();
        this.f69079j = m9834e;
        this.f69070a = new YU2(m9834e);
        this.f69071b = new C34674Nc1();
        this.f69072c = new C39095cM4();
        this.f69073d = new C40891fM4();
        this.f69074e = new C17128b();
        this.f69075f = new C39580d86();
        this.f69076g = new C49288tX1();
        m53158u(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public <Data> Registry m53178a(Class<Data> cls, InterfaceC45175mb1<Data> interfaceC45175mb1) {
        this.f69071b.m93706a(cls, interfaceC45175mb1);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry m53177b(Class<TResource> cls, InterfaceC40298eM4<TResource> interfaceC40298eM4) {
        this.f69073d.m41513a(cls, interfaceC40298eM4);
        return this;
    }

    /* renamed from: c */
    public <Model, Data> Registry m53176c(Class<Model> cls, Class<Data> cls2, XU2<Model, Data> xu2) {
        this.f69070a.m75005a(cls, cls2, xu2);
        return this;
    }

    /* renamed from: d */
    public <Data, TResource> Registry m53175d(Class<Data> cls, Class<TResource> cls2, InterfaceC38502bM4<Data, TResource> interfaceC38502bM4) {
        m53174e("legacy_append", cls, cls2, interfaceC38502bM4);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry m53174e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC38502bM4<Data, TResource> interfaceC38502bM4) {
        this.f69072c.m61531a(str, interfaceC38502bM4, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final <Data, TResource, Transcode> List<C48676sV0<Data, TResource, Transcode>> m53173f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f69072c.m61528d(cls, cls2)) {
            for (Class cls5 : this.f69075f.m44579b(cls4, cls3)) {
                arrayList.add(new C48676sV0(cls, cls4, cls5, this.f69072c.m61530b(cls, cls4), this.f69075f.m44580a(cls4, cls5), this.f69079j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> m53172g() {
        List<ImageHeaderParser> m12150b = this.f69076g.m12150b();
        if (!m12150b.isEmpty()) {
            return m12150b;
        }
        throw new NoImageHeaderParserException();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C42984it2<Data, TResource, Transcode> m53171h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C42984it2<Data, TResource, Transcode> m29786a = this.f69078i.m29786a(cls, cls2, cls3);
        if (this.f69078i.m29784c(m29786a)) {
            return null;
        }
        if (m29786a == null) {
            List<C48676sV0<Data, TResource, Transcode>> m53173f = m53173f(cls, cls2, cls3);
            if (m53173f.isEmpty()) {
                m29786a = null;
            } else {
                m29786a = new C42984it2<>(cls, cls2, cls3, m53173f, this.f69079j);
            }
            this.f69078i.m29783d(cls, cls2, cls3, m29786a);
        }
        return m29786a;
    }

    /* renamed from: i */
    public <Model> List<WU2<Model, ?>> m53170i(Model model) {
        return this.f69070a.m75002d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m53169j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m44213a = this.f69077h.m44213a(cls, cls2, cls3);
        if (m44213a == null) {
            m44213a = new ArrayList<>();
            for (Class<?> cls4 : this.f69070a.m75003c(cls)) {
                for (Class<?> cls5 : this.f69072c.m61528d(cls4, cls2)) {
                    if (!this.f69075f.m44579b(cls5, cls3).isEmpty() && !m44213a.contains(cls5)) {
                        m44213a.add(cls5);
                    }
                }
            }
            this.f69077h.m44212b(cls, cls2, cls3, Collections.unmodifiableList(m44213a));
        }
        return m44213a;
    }

    /* renamed from: k */
    public <X> InterfaceC40298eM4<X> m53168k(VL4<X> vl4) throws NoResultEncoderAvailableException {
        InterfaceC40298eM4<X> m41512b = this.f69073d.m41512b(vl4.mo5710d());
        if (m41512b != null) {
            return m41512b;
        }
        throw new NoResultEncoderAvailableException(vl4.mo5710d());
    }

    /* renamed from: l */
    public <X> InterfaceC17126a<X> m53167l(X x) {
        return this.f69074e.m53094a(x);
    }

    /* renamed from: m */
    public <X> InterfaceC45175mb1<X> m53166m(X x) throws NoSourceEncoderAvailableException {
        InterfaceC45175mb1<X> m93705b = this.f69071b.m93705b(x.getClass());
        if (m93705b != null) {
            return m93705b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean m53165n(VL4<?> vl4) {
        return this.f69073d.m41512b(vl4.mo5710d()) != null;
    }

    /* renamed from: o */
    public <TResource> Registry m53164o(Class<TResource> cls, InterfaceC40298eM4<TResource> interfaceC40298eM4) {
        this.f69073d.m41511c(cls, interfaceC40298eM4);
        return this;
    }

    /* renamed from: p */
    public <Data, TResource> Registry m53163p(Class<Data> cls, Class<TResource> cls2, InterfaceC38502bM4<Data, TResource> interfaceC38502bM4) {
        m53162q("legacy_prepend_all", cls, cls2, interfaceC38502bM4);
        return this;
    }

    /* renamed from: q */
    public <Data, TResource> Registry m53162q(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC38502bM4<Data, TResource> interfaceC38502bM4) {
        this.f69072c.m61527e(str, interfaceC38502bM4, cls, cls2);
        return this;
    }

    /* renamed from: r */
    public Registry m53161r(ImageHeaderParser imageHeaderParser) {
        this.f69076g.m12151a(imageHeaderParser);
        return this;
    }

    /* renamed from: s */
    public Registry m53160s(InterfaceC17126a.InterfaceC17127a<?> interfaceC17127a) {
        this.f69074e.m53093b(interfaceC17127a);
        return this;
    }

    /* renamed from: t */
    public <TResource, Transcode> Registry m53159t(Class<TResource> cls, Class<Transcode> cls2, InterfaceC49192tM4<TResource, Transcode> interfaceC49192tM4) {
        this.f69075f.m44578c(cls, cls2, interfaceC49192tM4);
        return this;
    }

    /* renamed from: u */
    public final Registry m53158u(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String str : list) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        this.f69072c.m61526f(arrayList);
        return this;
    }
}
