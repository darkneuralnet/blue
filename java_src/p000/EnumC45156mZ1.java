package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"LmZ1;", "", "LaP1;", "", "v", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: mZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC45156mZ1 implements InterfaceC37933aP1<String> {
    IMAGE_DOWNLOAD,
    TEMPLATE_REQUEST,
    ZIP_ASSET_DOWNLOAD,
    DISPLAY_VIEW_GENERATION,
    INTERNAL_TIMEOUT_EXCEEDED,
    UNKNOWN_MESSAGE_TYPE;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: mZ1$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C26115a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f98341a;

        static {
            int[] iArr = new int[EnumC45156mZ1.values().length];
            iArr[EnumC45156mZ1.IMAGE_DOWNLOAD.ordinal()] = 1;
            iArr[EnumC45156mZ1.TEMPLATE_REQUEST.ordinal()] = 2;
            iArr[EnumC45156mZ1.ZIP_ASSET_DOWNLOAD.ordinal()] = 3;
            iArr[EnumC45156mZ1.DISPLAY_VIEW_GENERATION.ordinal()] = 4;
            iArr[EnumC45156mZ1.INTERNAL_TIMEOUT_EXCEEDED.ordinal()] = 5;
            iArr[EnumC45156mZ1.UNKNOWN_MESSAGE_TYPE.ordinal()] = 6;
            f98341a = iArr;
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: v */
    public String forJsonPut() {
        switch (C26115a.f98341a[ordinal()]) {
            case 1:
                return "if";
            case 2:
                return "tf";
            case 3:
                return "zf";
            case 4:
                return "vf";
            case 5:
                return "te";
            case 6:
                return "umt";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
