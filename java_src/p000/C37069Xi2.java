package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.RS5;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0002R\u001e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LXi2;", "", "LMs5;", "sd", "", "c", "", "index", "g", "key", "f", DateTokenConverter.CONVERTER_KEY, "b", "", C17296a.f69688o, "toString", "e", "", "[Ljava/lang/Object;", "currentObjectPath", "", "[I", "indicies", "I", "currentDepth", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xi2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37069Xi2 {

    /* renamed from: a */
    public Object[] f43710a = new Object[8];

    /* renamed from: b */
    public int[] f43711b;

    /* renamed from: c */
    public int f43712c;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LXi2$a;", "", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Xi2$a */
    /* loaded from: classes8.dex */
    public static final class C9461a {

        /* renamed from: a */
        public static final C9461a f43713a = new C9461a();

        private C9461a() {
        }
    }

    public C37069Xi2() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f43711b = iArr;
        this.f43712c = -1;
    }

    /* renamed from: a */
    public final String m76546a() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.f43712c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f43710a[i2];
            if (obj instanceof InterfaceC34588Ms5) {
                InterfaceC34588Ms5 interfaceC34588Ms5 = (InterfaceC34588Ms5) obj;
                if (Intrinsics.areEqual(interfaceC34588Ms5.getKind(), RS5.C7172b.f32057a)) {
                    if (this.f43711b[i2] != -1) {
                        sb.append("[");
                        sb.append(this.f43711b[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.f43711b[i2];
                    if (i3 >= 0) {
                        sb.append(InstructionFileId.DOT);
                        sb.append(interfaceC34588Ms5.mo10458f(i3));
                    }
                }
            } else if (obj != C9461a.f43713a) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: b */
    public final void m76545b() {
        int i = this.f43712c;
        int[] iArr = this.f43711b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.f43712c = i - 1;
        }
        int i2 = this.f43712c;
        if (i2 != -1) {
            this.f43712c = i2 - 1;
        }
    }

    /* renamed from: c */
    public final void m76544c(InterfaceC34588Ms5 sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i = this.f43712c + 1;
        this.f43712c = i;
        if (i == this.f43710a.length) {
            m76542e();
        }
        this.f43710a[i] = sd;
    }

    /* renamed from: d */
    public final void m76543d() {
        int[] iArr = this.f43711b;
        int i = this.f43712c;
        if (iArr[i] == -2) {
            this.f43710a[i] = C9461a.f43713a;
        }
    }

    /* renamed from: e */
    public final void m76542e() {
        int i = this.f43712c * 2;
        Object[] copyOf = Arrays.copyOf(this.f43710a, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        this.f43710a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f43711b, i);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        this.f43711b = copyOf2;
    }

    /* renamed from: f */
    public final void m76541f(Object obj) {
        int[] iArr = this.f43711b;
        int i = this.f43712c;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.f43712c = i2;
            if (i2 == this.f43710a.length) {
                m76542e();
            }
        }
        Object[] objArr = this.f43710a;
        int i3 = this.f43712c;
        objArr[i3] = obj;
        this.f43711b[i3] = -2;
    }

    /* renamed from: g */
    public final void m76540g(int i) {
        this.f43711b[this.f43712c] = i;
    }

    public String toString() {
        return m76546a();
    }
}
