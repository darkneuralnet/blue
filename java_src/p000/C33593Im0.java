package p000;

import android.graphics.Color;
import ch.qos.logback.core.net.SyslogConstants;
import kotlin.KotlinVersion;
/* renamed from: Im0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33593Im0 {

    /* renamed from: a */
    public static final int[] f16171a = {Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb((int) SyslogConstants.LOG_LOCAL1, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};

    /* renamed from: b */
    public static final int[] f16172b = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)};

    /* renamed from: c */
    public static final int[] f16173c = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, (int) SyslogConstants.LOG_LOCAL7, 162), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)};

    /* renamed from: d */
    public static final int[] f16174d = {Color.rgb(193, 37, 82), Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};

    /* renamed from: e */
    public static final int[] f16175e = {Color.rgb(192, (int) KotlinVersion.MAX_COMPONENT_VALUE, 140), Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 247, 140), Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 208, 140), Color.rgb(140, 234, (int) KotlinVersion.MAX_COMPONENT_VALUE), Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 140, 157)};

    /* renamed from: f */
    public static final int[] f16176f = {m101728b("#2ecc71"), m101728b("#f1c40f"), m101728b("#e74c3c"), m101728b("#3498db")};

    /* renamed from: a */
    public static int m101729a(int i, int i2) {
        return (i & 16777215) | ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) << 24);
    }

    /* renamed from: b */
    public static int m101728b(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & KotlinVersion.MAX_COMPONENT_VALUE, (parseLong >> 8) & KotlinVersion.MAX_COMPONENT_VALUE, (parseLong >> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
