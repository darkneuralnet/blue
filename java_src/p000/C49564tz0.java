package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.IOException;
import java.io.InputStream;
import p000.C42732iT3;
import p000.PI4;
/* renamed from: tz0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49564tz0 extends PI4 {

    /* renamed from: b */
    public static final UriMatcher f111436b;

    /* renamed from: a */
    public final Context f111437a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f111436b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C49564tz0(Context context) {
        this.f111437a = context;
    }

    @Override // p000.PI4
    /* renamed from: c */
    public boolean mo11130c(C47378qI4 c47378qI4) {
        Uri uri = c47378qI4.f105059d;
        if ("content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f111436b.match(c47378qI4.f105059d) != -1) {
            return true;
        }
        return false;
    }

    @Override // p000.PI4
    /* renamed from: f */
    public PI4.C6313a mo11129f(C47378qI4 c47378qI4, int i) throws IOException {
        InputStream m11128j = m11128j(c47378qI4);
        if (m11128j == null) {
            return null;
        }
        return new PI4.C6313a(C34928Oe3.m91751l(m11128j), C42732iT3.EnumC23266e.DISK);
    }

    /* renamed from: j */
    public final InputStream m11128j(C47378qI4 c47378qI4) throws IOException {
        ContentResolver contentResolver = this.f111437a.getContentResolver();
        Uri uri = c47378qI4.f105059d;
        int match = f111436b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
