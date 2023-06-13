package p000;

import android.util.SparseArray;
/* renamed from: vb4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC50513vb4 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    public static final SparseArray<EnumC50513vb4> f114377i;

    /* renamed from: b */
    public final int f114379b;

    static {
        EnumC50513vb4 enumC50513vb4 = DEFAULT;
        EnumC50513vb4 enumC50513vb42 = UNMETERED_ONLY;
        EnumC50513vb4 enumC50513vb43 = UNMETERED_OR_DAILY;
        EnumC50513vb4 enumC50513vb44 = FAST_IF_RADIO_AWAKE;
        EnumC50513vb4 enumC50513vb45 = NEVER;
        EnumC50513vb4 enumC50513vb46 = UNRECOGNIZED;
        SparseArray<EnumC50513vb4> sparseArray = new SparseArray<>();
        f114377i = sparseArray;
        sparseArray.put(0, enumC50513vb4);
        sparseArray.put(1, enumC50513vb42);
        sparseArray.put(2, enumC50513vb43);
        sparseArray.put(3, enumC50513vb44);
        sparseArray.put(4, enumC50513vb45);
        sparseArray.put(-1, enumC50513vb46);
    }

    EnumC50513vb4(int i) {
        this.f114379b = i;
    }
}
