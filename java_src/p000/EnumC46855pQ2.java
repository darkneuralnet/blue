package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005j\u0002\b\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m28432d2 = {"LpQ2;", "", "", "b", "I", "()I", "id", "c", "order", DateTokenConverter.CONVERTER_KEY, "titleResource", "<init>", "(Ljava/lang/String;II)V", "e", "f", "g", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pQ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC46855pQ2 {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: b */
    public final int f103656b;

    /* renamed from: c */
    public final int f103657c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pQ2$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C27289a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC46855pQ2.values().length];
            try {
                iArr[EnumC46855pQ2.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC46855pQ2.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC46855pQ2.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC46855pQ2.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    EnumC46855pQ2(int i) {
        this.f103656b = i;
        this.f103657c = i;
    }

    /* renamed from: b */
    public final int m19324b() {
        return this.f103656b;
    }

    /* renamed from: c */
    public final int m19323c() {
        return this.f103657c;
    }

    /* renamed from: d */
    public final int m19322d() {
        int i = C27289a.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 17039373;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 17039363;
            }
            return 17039371;
        }
        return 17039361;
    }
}
