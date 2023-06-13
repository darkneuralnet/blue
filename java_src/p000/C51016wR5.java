package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: wR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C51016wR5 extends AbstractC46562ov2<InputStream> {

    /* renamed from: e */
    public static final UriMatcher f115974e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f115974e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C51016wR5(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p000.IS0
    /* renamed from: a */
    public Class<InputStream> mo6834a() {
        return InputStream.class;
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: f */
    public void mo6833c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p000.AbstractC46562ov2
    /* renamed from: g */
    public InputStream mo6832d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream m6829h = m6829h(uri, contentResolver);
        if (m6829h != null) {
            return m6829h;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: h */
    public final InputStream m6829h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f115974e.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    return contentResolver.openInputStream(uri);
                }
            } else {
                return m6828i(contentResolver, uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m6828i(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: i */
    public final InputStream m6828i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
