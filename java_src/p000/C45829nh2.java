package p000;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
/* renamed from: nh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C45829nh2 {

    /* renamed from: a */
    public final String f100348a;

    /* renamed from: b */
    public final String f100349b;

    /* renamed from: c */
    public final Date f100350c;

    /* renamed from: d */
    public final Date f100351d;

    /* renamed from: e */
    public final Date f100352e;

    /* renamed from: f */
    public final String f100353f;

    /* renamed from: g */
    public final List<String> f100354g;

    /* renamed from: h */
    public final Map<String, Object> f100355h;

    public C45829nh2(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, Object> map) {
        this.f100348a = str;
        this.f100349b = str2;
        this.f100350c = date;
        this.f100351d = date2;
        this.f100352e = date3;
        this.f100353f = str3;
        this.f100354g = list;
        this.f100355h = Collections.unmodifiableMap(map);
    }
}
