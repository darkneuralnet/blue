package com.chuckerteam.chucker.internal.data.room;

import android.content.Context;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "LEb5;", "LKN1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "<init>", "()V", "p", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class ChuckerDatabase extends AbstractC32563Eb5 {

    /* renamed from: p */
    public static final C17148a f69221p = new C17148a(null);

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", C17296a.f69688o, "", "DB_NAME", "Ljava/lang/String;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.data.room.ChuckerDatabase$a */
    /* loaded from: classes5.dex */
    public static final class C17148a {
        public /* synthetic */ C17148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChuckerDatabase m53010a(Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return (ChuckerDatabase) C32329Db5.m110126a(applicationContext, ChuckerDatabase.class, "chucker.db").m108707e().m108708d();
        }

        private C17148a() {
        }
    }

    /* renamed from: C */
    public abstract KN1 mo53009C();
}
