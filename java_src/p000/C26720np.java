package p000;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import p000.K94;
/* renamed from: np */
/* loaded from: classes6.dex */
public final class C26720np {

    /* renamed from: a */
    public int f100876a;

    /* renamed from: b */
    public K94.EnumC4366a f100877b = K94.EnumC4366a.DEFAULT;

    /* renamed from: np$a */
    /* loaded from: classes6.dex */
    public static final class C26721a implements K94 {

        /* renamed from: a */
        public final int f100878a;

        /* renamed from: b */
        public final K94.EnumC4366a f100879b;

        public C26721a(int i, K94.EnumC4366a enumC4366a) {
            this.f100878a = i;
            this.f100879b = enumC4366a;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return K94.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof K94)) {
                return false;
            }
            K94 k94 = (K94) obj;
            if (this.f100878a == k94.tag() && this.f100879b.equals(k94.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f100878a) + (this.f100879b.hashCode() ^ 2041407134);
        }

        @Override // p000.K94
        public K94.EnumC4366a intEncoding() {
            return this.f100879b;
        }

        @Override // p000.K94
        public int tag() {
            return this.f100878a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.f100878a + "intEncoding=" + this.f100879b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* renamed from: b */
    public static C26720np m22341b() {
        return new C26720np();
    }

    /* renamed from: a */
    public K94 m22342a() {
        return new C26721a(this.f100876a, this.f100877b);
    }

    /* renamed from: c */
    public C26720np m22340c(int i) {
        this.f100876a = i;
        return this;
    }
}
