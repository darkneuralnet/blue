package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Detail;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* renamed from: Jt7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33897Jt7 extends AbstractC32017Bs8 {

    /* renamed from: c */
    public long f18410c;

    /* renamed from: d */
    public String f18411d;

    /* renamed from: e */
    public AccountManager f18412e;

    /* renamed from: f */
    public Boolean f18413f;

    /* renamed from: g */
    public long f18414g;

    public C33897Jt7(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
    }

    @Override // p000.AbstractC32017Bs8
    /* renamed from: g */
    public final boolean mo43707g() {
        Calendar calendar = Calendar.getInstance();
        this.f18410c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f18411d = lowerCase + Detail.EMPTY_CHAR + lowerCase2;
        return false;
    }

    /* renamed from: l */
    public final long m99594l() {
        mo19953e();
        return this.f18414g;
    }

    /* renamed from: m */
    public final long m99593m() {
        m113419h();
        return this.f18410c;
    }

    /* renamed from: n */
    public final String m99592n() {
        m113419h();
        return this.f18411d;
    }

    /* renamed from: o */
    public final void m99591o() {
        mo19953e();
        this.f18413f = null;
        this.f18414g = 0L;
    }

    /* renamed from: p */
    public final boolean m99590p() {
        Account[] result;
        mo19953e();
        long currentTimeMillis = this.f100966a.mo22260A().currentTimeMillis();
        if (currentTimeMillis - this.f18414g > CoreConstants.MILLIS_IN_ONE_DAY) {
            this.f18413f = null;
        }
        Boolean bool = this.f18413f;
        if (bool == null) {
            if (NA0.m94303a(this.f100966a.mo22255z(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f100966a.mo22258a().m106886v().m42708a("Permission error checking for dasher/unicorn accounts");
                this.f18414g = currentTimeMillis;
                this.f18413f = Boolean.FALSE;
                return false;
            }
            if (this.f18412e == null) {
                this.f18412e = AccountManager.get(this.f100966a.mo22255z());
            }
            try {
                result = this.f18412e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f100966a.mo22258a().m106891q().m42707b("Exception checking account types", e);
            }
            if (result != null && result.length > 0) {
                this.f18413f = Boolean.TRUE;
                this.f18414g = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f18412e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f18413f = Boolean.TRUE;
                this.f18414g = currentTimeMillis;
                return true;
            }
            this.f18414g = currentTimeMillis;
            this.f18413f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
