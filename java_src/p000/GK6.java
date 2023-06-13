package p000;

import android.content.res.AssetManager;
import android.support.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: GK6 */
/* loaded from: classes6.dex */
public final class GK6 {

    /* renamed from: a */
    public final TJ6 f11639a;
    @Nullable

    /* renamed from: b */
    public XmlPullParser f11640b;

    public GK6(TJ6 tj6) {
        this.f11639a = tj6;
    }

    /* renamed from: a */
    public final void m105385a(AssetManager assetManager, File file) throws IOException {
        this.f11640b = assetManager.openXmlResourceParser(TJ6.m83817b(assetManager, file), "AndroidManifest.xml");
    }

    /* renamed from: b */
    public final long m105384b() throws IOException, XmlPullParserException {
        if (this.f11640b != null) {
            while (true) {
                int next = this.f11640b.next();
                if (next != 2) {
                    if (next == 1) {
                        break;
                    }
                } else if (this.f11640b.getName().equals("manifest")) {
                    String attributeValue = this.f11640b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                    String attributeValue2 = this.f11640b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                    if (attributeValue != null) {
                        try {
                            int parseInt = Integer.parseInt(attributeValue);
                            if (attributeValue2 == null) {
                                return parseInt;
                            }
                            try {
                                return (Integer.parseInt(attributeValue2) << 32) | (parseInt & 4294967295L);
                            } catch (NumberFormatException e) {
                                throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e.getMessage()));
                            }
                        } catch (NumberFormatException e2) {
                            throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e2.getMessage()));
                        }
                    }
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
            }
            throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
        }
        throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
    }
}
