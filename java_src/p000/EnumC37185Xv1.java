package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005j\u0002\b\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"LXv1;", "", "LWv1;", "", C17296a.f69688o, "()Z", "isFocused", "b", "hasFocus", "<init>", "(Ljava/lang/String;I)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC37185Xv1 implements InterfaceC36951Wv1 {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xv1$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C9552a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC37185Xv1.values().length];
            try {
                iArr[EnumC37185Xv1.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37185Xv1.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC37185Xv1.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC37185Xv1.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p000.InterfaceC36951Wv1
    /* renamed from: a */
    public boolean mo76101a() {
        int i = C9552a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @Override // p000.InterfaceC36951Wv1
    /* renamed from: b */
    public boolean mo76100b() {
        int i = C9552a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
